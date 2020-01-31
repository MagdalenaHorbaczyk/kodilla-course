/*
package com.kodilla.good.patterns.challenges.Food2Door;

public class Test {
    package com.kodilla.good.patterns.challenges.Food2Door;


    public class ExtraFoodShop implements Vendor {
        private String NAME = "ExtraFoodShop";
        private OrderService orderService;
*/
/*
    private InfService infService;
*//*



        public ExtraFoodShop(OrderService orderService*/
/*, InfService infService*//*
) {
            this.orderService = orderService;
*/
/*
        this.infService = infService;
*//*

        }

        @Override
        public OrderDto process(Order order) {
            boolean isOrdered = orderService.order(order.getProduct(), order.getQty());
            if (isOrdered){

                System.out.println("Order by " + NAME + " has been completed!" );
                return new OrderDto(true,  order.getVendor(), order.getProduct(), order.getQty());
            } else {
                System.out.println("Order by " + NAME + "has not been completed. Please contact " + NAME + " ." );
                return new OrderDto(false,  order.getVendor(), order.getProduct(), order.getQty());

            }
        }

        @Override
        public String getVendorName() {
            return NAME;
        }
    }

}
*/
