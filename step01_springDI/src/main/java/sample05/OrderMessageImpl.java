package sample05;

public class OrderMessageImpl implements OrderMessage {
	private int orderId;
	private String message;
	private UserBean userBean;
	private ProductBean productBean;

	@Override
	public void getOrder_Message() {
		System.out.println(String.format("orderId : %d", orderId));
		System.out.println(String.format("name : %s", userBean.getName()));
		System.out.println(String.format("phone : %s", userBean.getPhone()));
		System.out.println(String.format("p_name : %s", productBean.getP_name()));
		System.out.println(String.format("p_price : %d", productBean.getP_price()));
		System.out.println(String.format("message : %s", message));
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	
}
