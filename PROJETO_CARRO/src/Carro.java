public class Carro {
    private String modelo;
    private String cor;
    private String combustivel;
    private int preço;

    public Carro(){
        this("generico", "branco", "alcool",0);
    }

    public Carro(String modelo, String cor, String combustivel,int preço) {
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
        this.preço = preço;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null)
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if(cor != null)
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        if(combustivel != null)
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", cor=" + cor + ", combustivel=" + combustivel + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((combustivel == null) ? 0 : combustivel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (combustivel == null) {
            if (other.combustivel != null)
                return false;
        } else if (!combustivel.equals(other.combustivel))
            return false;
        return true;
    }

    public static double Carropreco(String combustivel)
    {
        switch(combustivel)
        {
            case "gasolina":
            
        }
    }
    
    
    
}
