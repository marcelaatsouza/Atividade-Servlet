package calcula;

/**
 *
 * @author marce
 */
public class Calculo {

    private double salarioBruto, fgts, inss, ir, sl;

    public Calculo() {

    }

    public Calculo(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getFgts() {
        return fgts;
    }

    public void setFgts(double fgts) {
        this.fgts = fgts;
    }
    

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIr() {
        return ir;
    }

    public void setIr(double ir) {
        this.ir = ir;
    }

    public double getSl() {
        return sl;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }
    
    
    public double calculaFGTS() {
        fgts = salarioBruto * 0.08;
        return fgts;
    }
    
    public double calculaINSS() {
        if (salarioBruto == 1045.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto >= 1045.01 && salarioBruto <= 2089.60) {
            inss = salarioBruto * 0.09;
        } else if (salarioBruto >= 2089.61 && salarioBruto <= 3134.40) {
            inss = salarioBruto * 0.12;
        } else if (salarioBruto >= 3134.41 && salarioBruto <= 6101.06) {
            inss = salarioBruto * 0.14;
        } else if (salarioBruto > 6101.06) {
            inss = 6101.06 * 0.14;
        }
        
        return inss;
    }
    
    public double calculaIR() {
        if (salarioBruto <= 1903.98) {
            ir = 0.0;
        } else if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            ir = (salarioBruto - 1903.98) * 0.075 - 142.80;
        } else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            ir = (salarioBruto - 2826.65) * 0.15 + 354.80;
        } else if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            ir = (salarioBruto - 3751.05) * 0.225 + 636.13;
        } else if (salarioBruto > 4664.68) {
            ir = (salarioBruto - 4664.68) * 0.275 + 869.36;
        }
        
        return ir;
    }
    
    public double calculaSalarioLiquido() {
        sl = (salarioBruto - (inss + ir));
        return sl;
    }
}
