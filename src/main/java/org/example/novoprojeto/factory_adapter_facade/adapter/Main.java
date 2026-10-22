package org.example.novoprojeto.factory_adapter_facade.adapter;

public class Main {
    static void main() {
        // PayPalAPI pagamento = new PayPalAPI();

        Pagamento pagamento = new PayPalAdapter();

        pagamento.pagar();
    }
}
