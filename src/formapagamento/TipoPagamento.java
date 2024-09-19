package formapagamento;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double jurosParcela(double valor) {
            return valor;
        }

        @Override
        public double descontoPagamento(double valor) {
            return valor;
        }
    },
    CREDITO {
        @Override
        public double jurosParcela(double valor) {
            return valor * 1.05;
        }

        @Override
        public double descontoPagamento(double valor) {
            return valor;
        }
    },
    PIX {
        @Override
        public double jurosParcela(double valor) {
            return valor;
        }

        @Override
        public double descontoPagamento(double valor) {
            System.out.print("Valor Desconto A Vista: R$ ");
            return valor - (valor * 0.1);
        }
    };

    public abstract double jurosParcela(double valor);

    public abstract double descontoPagamento(double valor);
}
