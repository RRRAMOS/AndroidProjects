package com.example.consultacep;

public class CEP {
    private String logradouro;
    private String bairro;
    private String localidade;
    private String UF;
    private String CEP;

    public String getLogradouro (){
        return logradouro;
    }
    public void setLogradouro (String Logradouro){
        this.logradouro=logradouro;
    }
    public String getBairro (){
        return bairro;
    }
    public void setBairro (String Bairro){
        this.bairro=bairro;
    }
    public String getLocalidade (){
        return localidade;
    }
    public void setLocalidade (String Localidade){
        this.localidade=localidade;
    }
    public String getUF (){
        return UF;
    }
    public void setUF (String UF){
        this.UF=UF;
    }
    public String getCEP (){return CEP;}
    public void setCEP (String CEP){
        this.CEP=CEP;
    }

     @Override
    public String toString() {
        return
        "Logradouro:" + getLogradouro()
        + "\nBairro:" + getBairro()
        + "\nCidade:" + getLocalidade()
        + "\nEstado:" + getUF()
        + "\nCEP:" + getCEP();

    }
}
