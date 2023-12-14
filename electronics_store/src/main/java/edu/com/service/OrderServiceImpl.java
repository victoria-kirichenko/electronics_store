//package edu.com.service;
//
//import edu.com.model.CartItem;
//import edu.com.model.Order;
//import edu.com.model.OrderItem;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderServiceImpl implements OrderService {
//
//    @Autowired
//    private OrderRepository orderRepository; // Предполагается, что у вас есть репозиторий для работы с базой данных
//
//    @Override
//    public void createOrder(String firstName, String lastName, String mobilePhone, String email, List<CartItem> cartItems) {
//        // Создание объекта заказа и сохранение его в базу данных
//        Order order = new Order(firstName, lastName, mobilePhone, email);
//        orderRepository.save(order);
//
//        // Добавление продуктов в заказ
//        for (CartItem cartItem : cartItems) {
//            OrderItem orderItem = new OrderItem(cartItem.getProduct(), cartItem.getQuantity(), order);
//            order.getOrderItems().add(orderItem);
//        }
//
//        // Расчет и сохранение общей суммы заказа
//        double totalAmount = calculateTotalAmount(cartItems);
//        order.setTotalAmount(totalAmount);
//        orderRepository.save(order);
//    }
//
//    private double calculateTotalAmount(List<CartItem> cartItems) {
//        // Реализуйте логику расчета общей суммы заказа
//        // В этом примере просто суммируем стоимость каждого продукта в корзине
//        return cartItems.stream()
//                .mapToDouble(cartItem -> cartItem.getTotalPrice())
//                .sum();
//    }
//}
