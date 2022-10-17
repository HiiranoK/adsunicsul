
import java.util.ArrayList;

public class EstoqueVeiculos {
    private static ArrayList<Veiculo> estoque = new ArrayList<>();

//------------------------------------------------------------------------------------------------------ ESTOQUE INICIAL

    public static void veiculosInicial() {
        Veiculo v101 = new Veiculo("ECOSPORT", "FORD", "ABC1234", 2008, 20000, 56000);
        Veiculo v102 = new Veiculo("ARGO", "FIAT", "ABC5678", 2009, 142000, 87000);
        Veiculo v103 = new Veiculo("CRUZE", "CHEVROLET", "DEF1234", 2010, 56000, 97000);
        Veiculo v104 = new Veiculo("DUSTER", "RENAULT", "DEF5678", 2010, 110000, 124000);
        Veiculo v105 = new Veiculo("COROLLA", "TOYOTA", "GHI1234", 2011, 162000, 130000);
        Veiculo v106 = new Veiculo("FUSION", "FORD", "GHI5678", 2012, 42000, 75000);
        Veiculo v107 = new Veiculo("TORO", "FIAT", "JKL1234", 2013, 48000, 48000);
        Veiculo v108 = new Veiculo("ONIX", "CHEVROLET", "JKL5678", 2013, 137000, 45000);	
        Veiculo v109 = new Veiculo("SANDERO", "RENAULT", "MNO1234", 2014, 133000, 64000);	
        Veiculo v110 = new Veiculo("HILUX", "TOYOTA", "MNO5678", 2015, 39000, 62000);
        Veiculo v111 = new Veiculo("ECOSPORT", "FORD", "PQR1234", 2016, 67000, 55500);
        Veiculo v112 = new Veiculo("ARGO", "FIAT", "PQR5678", 2016, 121000, 82000);	
        Veiculo v113 = new Veiculo("CRUZE", "CHEVROLET", "STU1234", 2017, 88000, 77000);	
        Veiculo v114 = new Veiculo("DUSTER", "RENAULT", "STU5678", 2018, 34000, 90000);
        Veiculo v115 = new Veiculo("COROLLA", "TOYOTA", "VWX1234", 2019, 115000, 113000);
        Veiculo v116 = new Veiculo("FUSION", "FORD", "VWX5678", 2019, 97000, 121000);
        Veiculo v117 = new Veiculo("TORO", "FIAT", "ABC8765", 2020, 102000, 36000);	
        Veiculo v118 = new Veiculo("ONIX", "CHEVROLET", "CBA8765", 2021, 54000, 105000);	
        Veiculo v119 = new Veiculo("SANDERO", "RENAULT", "CBA4321", 2022, 81000, 100500);	
        Veiculo v120 = new Veiculo("HILUX", "TOYOTA", "FED8765", 2022, 105000, 189000);	
        
        estoque.add(v101);
        estoque.add(v102);
        estoque.add(v103);
        estoque.add(v104);
        estoque.add(v105);
        estoque.add(v106);
        estoque.add(v107);
        estoque.add(v108);
        estoque.add(v109);
        estoque.add(v110);
        estoque.add(v111);
        estoque.add(v112);
        estoque.add(v113);
        estoque.add(v114);
        estoque.add(v115);
        estoque.add(v116);
        estoque.add(v117);
        estoque.add(v118);
        estoque.add(v119);
        estoque.add(v120);
    } 



//------------------------------------------------------------------------------------------------------ GETTER
    public ArrayList<Veiculo> getEstoque() {
        return estoque;
    }

//------------------------------------------------------------------------------------------------------ ADICIONAR OBJETO VEICULO NA ARRAYLIST
    static public void adicionar(Veiculo v) {
        estoque.add(v);
    }

//------------------------------------------------------------------------------------------------------ LISTAR TODOS OS VEICULOS
    static public String listarVeiculos() {
        String saida = "=========ESTOQUE VEÍCULOS=========\n";
        int i = 101;
        for(Veiculo v : estoque) {
            saida += v.toString()+"\n";
            saida += "ID Veículo: "+(i)+"\n\n";
            saida += "==================================\n";
            i += 1;
        }
        return saida;
    }

//------------------------------------------------------------------------------------------------------ PESQUISAR PELO MODELO
//    static public int pesquisarModelo(String modelo) {
//        int qtd = 0;
//        
//        for(Veiculo v : estoque) {
//            if(v.getModelo().equalsIgnoreCase(modelo)) {
//                qtd++;
//            }
//        }   
//        return 0;
//    }
    
    static public String pesquisarModelo(String modelo) {
        String saida = "========VEÍCULOS MODELO "+modelo+"========\n";
        int i = 101;
        for(Veiculo v : estoque) {
            if(v.getModelo().equalsIgnoreCase(modelo)) {
                saida += v.toString()+"\n";
                saida += "ID Veículo: "+(i)+"\n\n";
                saida += "==================================\n";
            }
            i += 1;
        }
        return saida;
    }

//------------------------------------------------------------------------------------------------------ PESQUISAR PELO MARCA**
    static public String pesquisarMarca(String marca) {
        String saida = "========VEÍCULOS MARCA: "+marca+"========\n";
        int i = 101;
        for(Veiculo v : estoque) {
            if(v.getMarca().equalsIgnoreCase(marca)) {
                saida += v.toString()+"\n";
                saida += "ID Veículo: "+(i)+"\n\n";
                saida += "==================================\n";
            }
            i += 1;
        }
        return saida;
    }

//------------------------------------------------------------------------------------------------------ PESQUISAR PELO ANO**
    static public String pesquisarAno(int ano) {
        String saida = "========VEÍCULOS ANO INFERIOR/IGUAL A "+ano+"========\n";
        int i = 101;
        for(Veiculo v : estoque) {
            if(v.getAno()<=ano) {
                saida += v.toString()+"\n";
                saida += "ID Veículo: "+(i)+"\n\n";
                saida += "==================================\n";
            }
            i += 1;
        }
        return saida;
    }
    
//------------------------------------------------------------------------------------------------------ PESQUISAR PELA QUILOMETRAGEM**
    static public String pesquisarQuilometragem(int quilometragem) {  //ficar de olho no double ou int
        String saida = "========VEÍCULOS COM QUILOMETRAGEMIGUAL INFERIOR/IGUAL A "+quilometragem+"========\n";
        int i = 101;
        for(Veiculo v : estoque) {
            if(v.getQuilometragem()<=quilometragem) {
                saida += v.toString()+"\n";
                saida += "ID Veículo: "+(i)+"\n\n";
                saida += "==================================\n";
            }
            i += 1;
        }
        return saida;
    }

//------------------------------------------------------------------------------------------------------ PESQUISAR PELO PREÇO
//    static public int pesquisarPreco(double precoMaximo) {
//        int qtd = 0;
//        
//        for(Veiculo v : estoque) {
//            if(v.getPreco()<=precoMaximo) {
//                qtd++;
//            }
//        }
//        return qtd;
//    }

    static public String pesquisarPreco(double precoMaximo) {
        String saida = String.format("========VEÍCULOS COM VALOR INFERIOR/IGUAL A R$ %.2f",precoMaximo)+"========\n";
        int i = 101;
        for(Veiculo v : estoque) {
            if(v.getPreco()<=precoMaximo) {
                saida += v.toString()+"\n";
                saida += "ID Veículo: "+(i)+"\n\n";
                saida += "==================================\n";
            }
            i += 1;
        }
        return saida;
    }
    
//------------------------------------------------------------------------------------------------------ PESQUISAR PELO ID
    static public String pesquisarId(int idVeiculo) {
        String saida = "====VEÍCULO ID====\n";
        Veiculo v = estoque.get(idVeiculo-101);  
        saida += v.toString()+"\n";
        saida += "ID Veículo: "+(idVeiculo)+"\n\n";
        saida += "==================================\n";
        return saida;
    }
    
//------------------------------------------------------------------------------------------------------ PESQUISAR PELO ID
    //PODE ESTAR TUDO MUITO ERRADO AQUI!!!
    static public String venderId(int idVeiculo) {
        String saida = "";
        Veiculo v = estoque.get(idVeiculo-101);  
        saida += v.toString()+"\n";
        saida += "ID Veículo: "+(idVeiculo)+"\n";
        return saida;
    }
    
//------------------------------------------------------------------------------------------------------ REMOVER DA ArrayList
    //PODE ESTAR TUDO MUITO ERRADO AQUI!!!
    static public boolean removerVender(int idVeiculo) {
        Veiculo v = estoque.get(idVeiculo-101);  
        estoque.remove(v);
        return true;
    }
    
//    static public boolean vender(int idVeiculo) {
//        int i = 101;
//        for(Veiculo v : estoque) {
//            if(i==idVeiculo) {
//                estoque.remove(v);
//                return true;
//            }
//            i += 1;
//        }
//        return false;
//    }
       
//------------------------------------------------------------------------------------------------------ FIM!
}
