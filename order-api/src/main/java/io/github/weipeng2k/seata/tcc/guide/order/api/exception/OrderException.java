package io.github.weipeng2k.seata.tcc.guide.order.api.exception;

/**
 * @author weipeng2k 2021年08月25日 下午20:27:24
 */
public class OrderException extends Exception {
    private static final long serialVersionUID = 3920257701570010263L;

    public OrderException() {
        super();
    }

    public OrderException(String message) {
        super(message);
    }
}
