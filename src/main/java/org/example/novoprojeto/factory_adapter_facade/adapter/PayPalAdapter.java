package org.example.novoprojeto.factory_adapter_facade.adapter;

public class PayPalAdapter implements Pagamento{
    private PayPalAPI paypal = new PayPalAPI();

    @Override
    public void pagar() {
        paypal.sendPayment();
    }
}
