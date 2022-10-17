

public class ComprovanteCompra {
    
//------------------------------------------------------------------------------------------------------ EU SEI LÁ O QUE EU FIZ
    //CERTEZA QUE TUDO ESTÁ MUITO ERRADO AQUI!!!
    public static String comprovante(int funcionarioVendedor, String clienteComprador, int veiculoComprado) {
        
        String saida = "\n\n====COMPROVANTE DE COMPRA====\n\n";
        saida += "=====> VENDEDOR:\n"+EstoqueFuncionarios.pesquisarID(funcionarioVendedor)+"\n";
        saida += "=====> COMPRADOR:\n"+EstoqueCliente.venderCPF(clienteComprador)+"\n";
        saida += "=====> VEÍCULO COMPRADO:\n"+EstoqueVeiculos.venderId(veiculoComprado)+"\n";
        saida += "=======FIM DO COMPROVANTE=======\n\n";
        
        saida += EstoqueVeiculos.removerVender(veiculoComprado);
        return saida;
    }

//------------------------------------------------------------------------------------------------------ FIM!
}
