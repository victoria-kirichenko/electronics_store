package edu.com.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.com.model.CartItem;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CookieUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void setCartCookie(HttpServletResponse response, List<CartItem> cartItems) {
        try {
            String cartContents = CookieUtils.convertCartItemsToString(cartItems);
            cartContents = URLEncoder.encode(cartContents, StandardCharsets.UTF_8.toString());
            Cookie cookie = new Cookie("cart", cartContents);
            cookie.setMaxAge(3600); // установите срок действия cookie по вашему усмотрению
            response.addCookie(cookie);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace(); // обработайте исключение в соответствии с вашими потребностями
        }
    }

    public static String convertCartItemsToString(List<CartItem> cartItems) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writer().withDefaultPrettyPrinter().writeValueAsString(cartItems);
        } catch (JsonProcessingException e) {
            // Обработка ошибок
            e.printStackTrace();
            return "";
        }
    }

    public static List<CartItem> convertStringToCartItems(String cartContents) {
        try {
            return objectMapper.readValue(cartContents, new TypeReference<List<CartItem>>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

