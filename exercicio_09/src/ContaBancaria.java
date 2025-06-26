public class ContaBancaria {
    String titular;
    private double _saldo;

    void depositar(double valor){
        if(valor > 0){
            this._saldo += valor;
        }
    }
    void sacar(double valor){
        if(valor > 0 && valor <= this._saldo){
            this._saldo -= valor;
        }
    }

    String exibirSaldo(){
        return "Titular: "+ this.titular + ", Saldo: R$" + String.format("%.2f", this._saldo);
    }
}
