package br.edu.principal;


public class Principal {
    public static void main(String[] args){
    	double p_fab = 1200;
    	double perc_d = 10;
    	double perc_i = 50;
    	double vlr_d;
    	double vlr_i;
    	double p_final;
    	
    	vlr_d = p_fab * perc_d / 100; 
    	vlr_i = p_fab * perc_i / 100; 
    	p_final = p_fab + vlr_i + vlr_d;
    	
    	System.out.println("O lucro do distribuidor é: " + vlr_d);
    	System.out.println("Valor correspondente aos impostos: " + vlr_i);
    	System.out.println("Preço final do veículo: " + p_final);
}

}