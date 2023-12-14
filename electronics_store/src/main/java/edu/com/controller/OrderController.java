package edu.com.controller;

import edu.com.model.CartItem;
import edu.com.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private CartService cartService;
    @PostMapping("/makeOrder")
    public String makeOrder(Model model, HttpSession session) {
        List<CartItem> cartItems = cartService.getCartItems();
//        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");

        double totalAmount = cartItems.stream()
                .mapToDouble(CartItem::getTotalPrice)
                .sum();

        model.addAttribute("cartItems", cartItems);
        model.addAttribute("totalAmount", totalAmount);

        return "order";
    }

    @GetMapping("/order")
    public String orderPage(Model model, HttpSession session) {
        // Получение данных из формы
        String firstName = (String) session.getAttribute("firstName");
        String lastName = (String) session.getAttribute("lastName");
        String mobilePhone = (String) session.getAttribute("mobilePhone");
        String email = (String) session.getAttribute("email");

        // Получение данных о продуктах в заказе
        List<CartItem> cartItems = (List<CartItem>) session.getAttribute("cartItems");

        // Добавление заказа в базу данных
        orderService.createOrder(firstName, lastName, mobilePhone, email, cartItems);

        // Отправка информации на почту
        emailService.sendOrderConfirmationEmail(email, cartItems, totalAmount);

        // Очистка кук
        CookieUtils.clearCartCookie(response);

        return "redirect:/confirmation"; // Перенаправление на страницу подтверждения заказа
    }


}

