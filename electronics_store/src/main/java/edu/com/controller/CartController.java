package edu.com.controller;

import edu.com.model.CartItem;
import edu.com.service.CartService;
import edu.com.utils.CookieUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String viewCart(Model model) {
        List<CartItem> cartItems = cartService.getCartItems();
        model.addAttribute("cartItems", cartItems);
        return "cart";
    }

    @PostMapping("/addToCart/{productId}/{name}/{price}")
    public String addToCart(@PathVariable Long productId, @PathVariable String name, @PathVariable double price,
                            HttpSession session, HttpServletResponse response) {
        cartService.addToCart(productId, name, price);

        List<CartItem> cartItems = cartService.getCartItems();
        String cartContents = CookieUtils.convertCartItemsToString(cartItems);
        CookieUtils.setCartCookie(response, cartItems);
        return "redirect:/catalog";
    }

    @PostMapping("/removeFromCart/{productId}")
    public String removeFromCart(@PathVariable Long productId, HttpServletResponse response) {
        cartService.removeFromCart(productId);
        List<CartItem> cartItems = cartService.getCartItems();
        CookieUtils.setCartCookie(response, cartItems);
        return "redirect:/cart";
    }

    @PostMapping("/updateQuantity/{productId}")
    public String updateQuantity(@PathVariable Long productId, @RequestParam int change,
                                 HttpServletResponse response) {

        cartService.changeQuantity(productId, change);
        List<CartItem> cartItems = cartService.getCartItems();
        CookieUtils.setCartCookie(response, cartItems);
        return "redirect:/cart";
    }


}


