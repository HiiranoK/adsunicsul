algoritmo ProjetoIntegrado
    //NAVEGAÇÃO DOS MENUS
    logico menu=verdadeiro;
    inteiro opcaoMenu,consultaMenu,consultaCliente,consultaVeiculo,funcionarioMenu;
    //INFO DO CLIENTE
    literal nomeCliente, cpfCliente, enderecoCliente, emailCliente, telefoneCliente, clienteAtual=0;
    //INFO VEICULO
    inteiro idVeiculo, modeloVeiculo, marcaVeiculo, placaVeiculo, anoVeiculo, quilometragemVeiculo, precoVeiculo;
    //INFO VENDEDOR
    literal nomeVendedor, cpfVendedor, enderecoVendedor, emailVendedor, telefoneVendedor, rgmVendedor, turmaVendedor
    inteiro idVendedor=1;
    //VETORES

    início
    enquanto(menu){
        escreva("Informe a opção desejada \n [1] - Consultar\n[2] - Cadastrar cliente \n[3] - Vender veiculo \n[4] - Comprar veiculo \n[5] - Funcionários \n[0] - Sair");
        leia(opcaoMenu);
        escolha(opcaoMenu){
            caso 1:
                escreva("O que deseja consultar?\n[1] - Cliente\n[2] - Veiculo\n[0] - Retornar");
                leia(consultaMenu)
                se(consultaMenu == 1){
                    enquanto(verdadeiro){
                        escreva("Consultar clientes: \n[1] - Exibir todos os clientes \n[2] - CPF \n[0] - Retornar");
                        leia(consultaCliente);
                        se(consultaCliente == 1){
                            *** fazer retorno dos cliente ***
                        }senao se(consultaCliente == 2){
                            *** fazer a consulta por cpf ***
                        }senao se(consultaCliente == 0){
                            pare;
                        }senao{
                            escreva("Opção inválida tente novamente");
                        }
                    }
                }
                senao se(consultaMenu == 2){
                    enquanto(verdadeiro){
                        escreva("Escolha o tipo de consulta: \n[1] - Exibir todo o estoque \n[2] - Modelo \n[3] - Marca \n[4] - Ano \n[5] - Preço máximo (R$) \n[6] - Quilometragem máxima\n[7] - ID Veículo \n[0] - Retornar");
                        leia(consultaVeiculo)
                        se(consultaVeiculo == 1){
                            *** fazer retorno dos estoque ***
                        }senao se(consultaCliente == 2){
                            *** fazer a consulta por modelo ***
                        }senao se(consultaCliente == 3){
                            *** fazer a consulta por marca ***
                        }senao se(consultaCliente == 4){
                            *** fazer a consulta por ano ***
                        }senao se(consultaCliente == 5){
                            *** fazer a consulta por preco ***
                        }senao se(consultaCliente == 6){
                            *** fazer a consulta por km ***
                        }senao se(consultaCliente == 7){
                            *** fazer a consulta por id ***
                        }senao se(consultaCliente == 0){
                            pare;
                        }senao{
                            escreva("Opção inválida tente novamente");
                        }
                    }
                }
                senao se(consultaMenu == 0){
                    retorne;
                }
                senao{
                    escreva("Opção inválida");
                }
                pare;
            caso 2:
                escreva("Preencha todos os campos do formulário para cadastrar um novo cliente ao nosso bando de dados.");
                escreva("Nome completo:");
                leia(nomeCliente);
                escreva("CPF(apenas números):");
                leia(cpfCliente);
                escreva("Endereco Completo":);
                leia(enderecoCliente);
                escreva("E-mail:");
                leia(emailCliente);
                escreva("Telefone:");
                leia(telefoneCliente);
                se(nomeCliente == nulo ou cpfCliente == nulo ou enderecoCliente == nulo ou emailCliente == nulo ou telefoneCliente == nulo){
                    escreva("Cadastro cancelado devido a campo(s) vazio(s)");
                }senao{
                    ***fazer os vetores e incremento do cliente para guardar os dados*** 
                }
            pare;
            caso 3:
                escreva("Preencha as informações para confirmar a compra e gerar o comprovante.");
                escreva("Informe o ID do vendedor:");
                leia(idVendedor);
                escreva("Informe o CPF do cliente: ");
                leia(cpfCliente):
                escreva("Informe o id do veiculo vendido: ");
                leia(idVeiculo):
                *** validar se as informações estão nulas e se não gerar a venda + comprovante ***
            pare
            caso 4:
                escreva("Preencha o formulário para cadastrar um novo veículo ao nosso estoque.");
                escreva("Informe o modelo:");
                leia(modeloVeiculo);
                escreva("Informe a marca:");
                leia(marcaVeiculo);
                escreva("Informe a placa:");
                leia(placaVeiculo);
                escreva("Informe o ano");
                leia(anoVeiculo);
                escreva("Informe a quilometragem atual:");
                leia(quilometragemVeiculo);
                escreva("Informe o valor de venda:");
                leia(precoVeiculo);
                se(modeloVeiculo == nulo ou marcaVeiculo == nulo ou placaVeiculo == nulo ou anoVeiculo == nulo ou quilometragemVeiculo == nulo ou precoVeiculo == nulo){
                    escreva("Cadastro cancelado devido a campo(s) vazio(s)");
                }senao{
                    *** criar um incrementador e preencher os dados nos vetores ***
                    escreva("Veiculo cadastrado com sucesso! ") *** jogar isso dentro do método ***
                }
            pare
            caso 5:
                escreva("O que deseja fazer?\n[1] - Listar Funcionários\n[2] - Adicionar Funcionário \n [3] - Remover Funcionário\n[0] - Retornar");
                leia(funcionarioMenu);
                escolha(funcionarioMenu){
                    caso 1:
                        escreva("Consultando todo o nosso bando de dados sobre funcionários! \n(OBS: Nome dos integrantes do grupo)");
                        *** criar um laço for que passará pelo vetor dos funcionários ***
                        pare;
                    caso 2:
                        escreva("Preencha todos os campos do formulário para cadastrar o funcionário");
                        escreva("Nome Completo:");
                        leia(nomeVendedor);
                        escreva("CPF (apenas números): ");
                        leia(cpfVendedor);
                        escreva("Endereço Completo: ");
                        leia(enderecoVendedor);
                        escreva("E-mail:");
                        leia(emailVendedor);
                        escreva("Telefone: ")
                        leia(telefoneVendedor);
                        escreva("RGM: ");
                        leia(rgmVendedor);
                        escreva("Turma:");
                        leia(turmaVendedor);
                        se(nomeVendedor == nulo ou cpfVendedor == nulo ou enderecoVendedor == nulo ou emailVendedor == nulo ou telefoneVendedor == nulo ou rgmVendedor == nulo ou turmaVendedor == nulo){
                            escreva("Cadastro cancelado devido a campo(s) vazio(s)");
                        }senao{
                            *** criar um incrementador e preencher os dados nos vetores ***
                            escreva("Funcionário cadastrado com sucesso! ") *** jogar isso dentro do método ***
                        }
                    pare;
                    caso 3:
                        escreva("Informe o ID do funcionário a ser desligado");
                        leia(idVendedor);
                        *** fazer um for loop procurando o id, se encontrado remover o funcionário ***
                    pare
                    caso 0:
                        escreva("retornando ao menu anterior...");
                    padrao:
                        escreva("Opção Inválida!")
                }
            pare
            caso 0:
                escreva("Obrigado por usar o nosso software Ass: Equipe de desenvolvimento.");
                menu = falso;
            pare;
            padrao:
                escreva("Opção inválida!")
        }
    }

    fim