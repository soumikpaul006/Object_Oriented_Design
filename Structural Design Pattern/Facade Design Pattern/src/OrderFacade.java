public class OrderFacade
{
    ProductDAO productDAO;
    Payment payment;
    Invoice invoice;

    public OrderFacade()
    {
        productDAO=new ProductDAO();
        payment=new Payment();
        invoice=new Invoice();
    }

    public void createOrder()
    {
        productDAO.getProduct(120);
        payment.getPayment();
        invoice.getInvoice();
    }
}
