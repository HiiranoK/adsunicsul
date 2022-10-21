
import javax.swing.JOptionPane;

public class Menu_main {
    public static void main(String[] args) {

        // ---------------------------------------------------------------------------------------------------------------------------
        // VARIAVEIS MENU
        boolean menu = true;
        int consultaC;
        String consultaMenu, consultaV, opcaoMenu, funcionarioMenu;
        // VARIAVEIS VEICULO
        double preco;
        int ano, quilometragem, idVeiculo;
        String modelo, marca, placa;

        // VARIAVEIS CLIENTE E FUNCIONARIO
        String nome, endereco, e_mail, cpf, telefone, turma, rgm;
        int id; 
        // VARIAVEIS COMPRA
        int veiculoComprado,funcionarioVendedor;
        String clienteComprador;

        // INSTANCIANDO OBJETOS
        Veiculo objVeiculo;
        Cliente objCliente;

        // ---------------------------------------------------------------------------------------------------------------------------
        EstoqueVeiculos.veiculosInicial();
        EstoqueFuncionarios.funcionariosInicial();
        EstoqueCliente.clientesInicial();

        // ---------------------------------------------------------------------------------------------------------------------------
        JOptionPane.showMessageDialog(null,
                "Projeto Interdiciplinar: 2º Semestre de 2022 \nCurso: Análise e Desenvolvimento de Sistemas \nCampus: Anália Franco");
        while (menu) {
            opcaoMenu = JOptionPane.showInputDialog(null,
                    "Digite o número correspondente ao que deseja realizar: \n[1] - Consultar\n[2] - Cadastrar cliente \n[3] - Vender veiculo \n[4] - Comprar veiculo \n[5] - Funcionários \n[0] - Sair");
            // ---------------------------------------------------------------------------------------------------------------------------
            if (opcaoMenu == null) {
                JOptionPane.showMessageDialog(null,
                        "Obrigado por usar nosso software! \n\nAss.: Equipe de desenvolvimento.");
                menu = false;
            } else {
                opcaoMenu = opcaoMenu.strip();
                switch (opcaoMenu) {
                    case "1":
                        while (true) {
                            consultaMenu = JOptionPane
                                    .showInputDialog(null,
                                            "O que deseja consultar?\n[1] - Cliente\n[2] - Veiculo\n[0] - Retornar");
                            if (consultaMenu == null) {
                                break;
                            } else if (consultaMenu.strip().equals("1")) {
                                while (true) {
                                    consultaC = Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "Consultar clientes pelo: \n[1] - Exibir todos os clientes \n[2] - CPF \n[0] - Retornar"));
                                    if (consultaC == 1) {
                                        JOptionPane.showMessageDialog(null,
                                                "Consultando todo o nosso banco de dados sobre clientes!");
                                        System.out.println(EstoqueCliente.listarClientes());
                                    } else if (consultaC == 2) {

                                        cpf = JOptionPane
                                                .showInputDialog(null, "Insira o CPF do cliente (apenas números):")
                                                .strip();

                                        System.out.println(EstoqueCliente.pesquisarCPF(cpf));
                                    } else if (consultaC == 0) {
                                        break;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Opção Inválida!");
                                    }
                                }
                            } else if (consultaMenu.strip().equals("2")) {
                                while (true) {
                                    consultaV = JOptionPane.showInputDialog(null,
                                            "Consultar veículos pelo: \n[1] - Exibir todo o estoque \n[2] - Modelo \n[3] - Marca \n[4] - Ano \n[5] - Preço máximo (R$) \n[6] - Quilometragem máxima\n[7] - ID Veículo \n[0] - Retornar");

                                    if (consultaV == null) {
                                        break;
                                    } else {
                                        consultaV = consultaV.strip();
                                        switch (consultaV) {
                                            case "1":
                                                JOptionPane.showMessageDialog(null,
                                                        "Consultando todo o nosso estoque de veículos!");
                                                System.out.println(EstoqueVeiculos.listarVeiculos());
                                                break;
                                            case "2":
                                                modelo = JOptionPane.showInputDialog(null, "Insira o modelo desejado:");
                                                System.out.println(EstoqueVeiculos.pesquisarModelo(modelo));
                                                break;
                                            case "3":
                                                marca = JOptionPane.showInputDialog(null, "Insira a marca desejada:");
                                                System.out.println(EstoqueVeiculos.pesquisarMarca(marca));
                                                break;
                                            case "4":
                                                ano = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                        "Insira até qual ano deseja que o veículo seja:"));
                                                System.out.println(EstoqueVeiculos.pesquisarAno(ano));
                                                break;
                                            case "5":
                                                preco = Double.parseDouble(JOptionPane.showInputDialog(null,
                                                        "Insira o valor máximo que deseja pagar (R$):"));
                                                System.out.println(EstoqueVeiculos.pesquisarPreco(preco));
                                                break;
                                            case "6":
                                                quilometragem = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                        "Insira a quilometragem máxima que o veículo tenha:"));
                                                System.out
                                                        .println(EstoqueVeiculos.pesquisarQuilometragem(quilometragem));
                                                break;
                                            case "7":
                                                idVeiculo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                        "Insira o ID referente ao veículo:"));
                                                System.out.println(EstoqueVeiculos.pesquisarId(idVeiculo));
                                                break;
                                            case "0":
                                                JOptionPane.showMessageDialog(null, "saindo");
                                                break;
                                            default:
                                                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                                        }
                                    }
                                }
                            } else if (consultaMenu.strip().equals("0")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Opção Inválida!");
                            }
                        }
                        break;

                    case "2":
                        JOptionPane.showMessageDialog(null,
                                "Formulário para cadastrar um novo cliente ao nosso bando de dados.");
                        nome = JOptionPane.showInputDialog(null, "Nome Completo: ");
                        cpf = JOptionPane.showInputDialog(null, "CPF (apenas números): ");
                        endereco = JOptionPane.showInputDialog(null, "Endereço Completo: ");
                        e_mail = JOptionPane.showInputDialog(null, "E-mail: ");
                        telefone = JOptionPane.showInputDialog(null, "Telefone: ");

                        if (nome == null || cpf == null || endereco == null || e_mail == null || telefone == null) {
                            JOptionPane.showMessageDialog(null, "Cadastro cancelado devido a campo(s) vazio(s)");
                            break;
                        } else {
                            objCliente = new Cliente(nome, cpf, endereco, e_mail, telefone);
                            EstoqueCliente.adicionar(objCliente);
                            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                            break;
                        }
                        // ---------------------------------------------------------------------------------------------------------------------------
                    case "3":

                        JOptionPane.showMessageDialog(null, "Formulário de compra e comprovante.");
                        funcionarioVendedor = Integer.parseInt(JOptionPane.showInputDialog(null, "ID do funcionário que vendeu: "));
                        clienteComprador = JOptionPane.showInputDialog(null, "CPF do comprador (apenas números): ")
                                .strip();
                        veiculoComprado = Integer
                                .parseInt(JOptionPane.showInputDialog(null, "ID do veículo que será comprado: "));

                        System.out.println(
                                ComprovanteCompra.comprovante(funcionarioVendedor, clienteComprador, veiculoComprado));
                        JOptionPane.showMessageDialog(null, "Comprovante de Compra Gerado!");
                        break;

                    // ---------------------------------------------------------------------------------------------------------------------------
                    case "4": 
                        JOptionPane.showMessageDialog(null,
                                "Formulário para cadastrar um novo veículo comprado ao nosso estoque.");
                        modelo = JOptionPane.showInputDialog(null, "Modelo:");
                        marca = JOptionPane.showInputDialog(null, "Marca:");
                        placa = JOptionPane.showInputDialog(null, "Placa:");
                        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano:"));
                        quilometragem = Integer.parseInt(JOptionPane.showInputDialog(null, "Quilometragem:"));
                        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço:"));
                        if (modelo == null || marca == null || placa == null) {
                            JOptionPane.showMessageDialog(null, "Cadastro cancelado devido a campo(s) vazio(s)");
                            break;
                        } else {
                            objVeiculo = new Veiculo(modelo, marca, placa, ano, quilometragem, preco);
                            EstoqueVeiculos.adicionar(objVeiculo);
                            JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
                            break;
                        }
                        // ---------------------------------------------------------------------------------------------------------------------------
                    case "5":
                    funcionarioMenu = JOptionPane
                    .showInputDialog(null,
                            "O que deseja fazer?\n[1] - Listar Funcionários\n[2] - Adicionar Funcionário \n [3] - Remover Funcionário\n[0] - Retornar");
                            if (funcionarioMenu == null) {
                                break;
                            } else {
                            switch (funcionarioMenu) {
                            case "1":
                            JOptionPane.showMessageDialog(null,
                            "Consultando todo o nosso bando de dados sobre funcionários! \n(OBS: Nome dos integrantes do grupo)");
                            System.out.println(EstoqueFuncionarios.listarFuncionarios());
                                break;
                            case "2":
                            JOptionPane.showMessageDialog(null,
                            "Preencha todos os campos do formulário para cadastrar o funcionário");
                            nome = JOptionPane.showInputDialog(null, "Nome Completo: ");
                            cpf = JOptionPane.showInputDialog(null, "CPF (apenas números): ");
                            endereco = JOptionPane.showInputDialog(null, "Endereço Completo: ");
                            e_mail = JOptionPane.showInputDialog(null, "E-mail: ");
                            telefone = JOptionPane.showInputDialog(null, "Telefone: ");
                            rgm = JOptionPane.showInputDialog(null, "RGM: ");
                            turma = JOptionPane.showInputDialog(null, "Turma: ");
                            if (nome == null || cpf == null || endereco == null || e_mail == null || telefone == null || rgm == null || turma == null) {
                            JOptionPane.showMessageDialog(null, "Cadastro cancelado devido a campo(s) vazio(s)");
                            } else {
                            EstoqueFuncionarios.adicionar(new Funcionario(nome, cpf, endereco, e_mail, telefone,rgm,turma));
                            JOptionPane.showMessageDialog(null, "Funcinário cadastrado com sucesso!");
                            }
                            break;
                            case "3":
                            
                            id = Integer.parseInt(JOptionPane.showInputDialog(null,"informe o ID do funcionário a ser desligado"));
                            EstoqueFuncionarios.removerFuncionario(id);
                            JOptionPane.showMessageDialog(null,
                            "Informações sobre o funcionário removidas");
                                break;
                            default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida!");
                            
                        }
                        break;
                    }
                    // ---------------------------------------------------------------------------------------------------------------------------
                    case "0":

                        JOptionPane.showMessageDialog(null,
                                "Obrigado por usar nosso software! \n\nAss.: Equipe de desenvolvimento.");
                        menu = false;
                        break;
                    // ---------------------------------------------------------------------------------------------------------------------------
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida!");
                        break;
                }
            }
        }
    }
}
