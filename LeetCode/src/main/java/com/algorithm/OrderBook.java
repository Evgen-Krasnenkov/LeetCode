package com.algorithm;

import java.math.BigDecimal;
import java.util.PriorityQueue;
import java.util.Queue;

public class OrderBook {

    private final Queue<Order> buyOrders;
    private final Queue<Order> sellOrders;

    public OrderBook() {
        this.buyOrders = new PriorityQueue<>((o1, o2) -> o2.getPrice().compareTo(o1.getPrice()));
        this.sellOrders = new PriorityQueue<>((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));
    }

    public void placeOrder(Order order) {
        if (order.getType() == OrderType.BUY) {
            matchOrder(order, sellOrders);
            if (order.getQuantity() > 0) {
                buyOrders.add(order);
            }
        } else {
            matchOrder(order, buyOrders);
            if (order.getQuantity() > 0) {
                sellOrders.add(order);
            }
        }
    }

    private void matchOrder(Order incomingOrder, Queue<Order> opposingOrders) {
        while (!opposingOrders.isEmpty()) {
            Order topOrder = opposingOrders.peek();
            boolean canMatch = incomingOrder.getType() == OrderType.BUY
                    ? incomingOrder.getPrice().compareTo(topOrder.getPrice()) >= 0
                    : incomingOrder.getPrice().compareTo(topOrder.getPrice()) <= 0;

            if (!canMatch) {
                break;
            }

            int tradedQuantity = Math.min(incomingOrder.getQuantity(), topOrder.getQuantity());
            BigDecimal tradedPrice = topOrder.getPrice();

            executeTrade(incomingOrder.getTrader(), topOrder.getTrader(), tradedQuantity, tradedPrice);

            incomingOrder.reduceQuantity(tradedQuantity);
            topOrder.reduceQuantity(tradedQuantity);

            if (topOrder.getQuantity() == 0) {
                opposingOrders.poll();
            }

            if (incomingOrder.getQuantity() == 0) {
                break;
            }
        }
    }

    private void executeTrade(Trader buyer, Trader seller, int quantity, BigDecimal price) {
        System.out.println(buyer.getName() + " traded with " + seller.getName() + " " +
                quantity + " stocks for " + price + " dollars.");
    }

    public enum OrderType {
        BUY, SELL
    }

    public class Trader {
        private final String id;
        private final String name;

        public Trader(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public class Order {
        private final Trader trader;
        private final OrderType type;
        private final BigDecimal price;
        private int quantity;

        public Order(Trader trader, OrderType type, int quantity, BigDecimal price) {
            this.trader = trader;
            this.type = type;
            this.quantity = quantity;
            this.price = price;
        }

        public Trader getTrader() {
            return trader;
        }

        public OrderType getType() {
            return type;
        }

        public int getQuantity() {
            return quantity;
        }

        public void reduceQuantity(int amount) {
            this.quantity -= amount;
        }

        public BigDecimal getPrice() {
            return price;
        }
    }
}