algoritmo ProjetoIntegrado
    //iterador
    inteiro i=0;
    //NAVEGAÇÃO DOS MENUS
    logico menu=verdadeiro;
    inteiro opcaoMenu,consultaMenu,consultaCliente,consultaVeiculo,funcionarioMenu;
    //INFO DO CLIENTE
    literal nomeCliente, cpfCliente, enderecoCliente, emailCliente, telefoneCliente, clienteAtual=0;
    //INFO VEICULO
    literal modeloVeiculo, marcaVeiculo, placaVeiculo, quilometragemVeiculo;
    inteiro idVeiculo, anoVeiculo, veiculoAtual=0;  
    real  precoVeiculo;
    //INFO VENDEDOR
    literal nomeVendedor, cpfVendedor, enderecoVendedor, emailVendedor, telefoneVendedor, rgmVendedor, turmaVendedor;
    inteiro idVendedor, vendedorAtual=0;
    //VETORES CLIENTE
    literal vetorNomeCliente[100],vetorCpfCliente[100],vetorEnderecoCliente[100],vetorEmailCliente[100],vetorTelefoneCliente[100];
    //VETORES VEICULO
    literal vetorModeloVeiculo[100], vetorMarcaVeiculo[100], vetorPlacaVeiculo[100], vetorQuilometragemVeiculo[100];
    inteiro vetorIdVeiculo[100], vetorAnoVeiculo[100];  
    real  vetorPrecoVeiculo[100];
    //VETORES VENDEDOR
    literal vetorNomeVendedor[100], vetorCpfVendedor[100], vetorEnderecoVendedor[100],vetorEmailVendedor[100],vetorTelefoneVendedor[100],vetorRGM[100], vetorTurma[100];
    inteiro vetorIdVendedor[100];
    início
    enquanto(menu){
        escreva("Informe a opção desejada \n [1] - Consultar\n[2] - Cadastrar cliente \n[3] - Vender veiculo \n[4] - Comprar veiculo \n[5] - Funcionários \n[0] - Sair");
        leia(opcaoMenu);
        escolha(opcaoMenu){
            caso 1:
                escreva("O que deseja consultar?\n[1] - Cliente\n[2] - Veiculo\n[0] - Retornar");
                leia(consultaMenu);
                se(consultaMenu == 1){
                    enquanto(verdadeiro){
                        escreva("Consultar clientes: \n[1] - Exibir todos os clientes \n[2] - CPF \n[0] - Retornar");
                        leia(consultaCliente);
                        se(consultaCliente == 1){
                            retornaClientes(); 
                        }senao se(consultaCliente == 2){
                            escreva("Informe o cpf a ser consultado:");
                            leia(cpfCliente);
                            retornaClienteCPF(cpfCliente);
                        }senao se(consultaCliente == 0){
                            escreva("Retornando ao menu de consulta");
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
                            retornaEstoque();
                        }senao se(consultaCliente == 2){
                            escreva("Informe o modelo a ser consultado");
                            leia(modeloVeiculo);
                            retornaEstoqueModelo(modeloVeiculo);
                        }senao se(consultaCliente == 3){
                            escreva("Informe a marca a ser consultado");
                            leia(marcaVeiculo);
                            retornaEstoqueMarca(marcaVeiculo);
                        }senao se(consultaCliente == 4){
                            escreva("Informe o ano limite a ser consultado");
                            leia(anoVeiculo);
                            retornaEstoqueAno(anoVeiculo);
                        }senao se(consultaCliente == 5){
                            escreva("Informe o preço limite a ser consultado");
                            leia(precoVeiculo);
                            retornaEstoquePreco(precoVeiculo);
                        }senao se(consultaCliente == 6){
                            escreva("Informe a quilometragem limite a ser consultado");
                            leia(quilometragemVeiculo);
                            retornaEstoqueKm(quilometragemVeiculo);
                        }senao se(consultaCliente == 7){
                            escreva("Informe o id a ser consultado");
                            leia(idVeiculo);
                            retornaEstoqueId(idVeiculo);
                        }senao se(consultaCliente == 0){
                            escreva("Retornando ao menu de consulta");
                            pare;
                        }senao{
                            escreva("Opção inválida tente novamente");
                        }
                    }
                }
                senao se(consultaMenu == 0){
                    escreva("Retornando ao menu principal");
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
                    vetorNomeCliente[clienteAtual] = nomeCliente;
                    vetorCpfCliente[clienteAtual] = cpfCliente;
                    vetorEnderecoCliente[clienteAtual] = enderecoCliente;
                    vetorEmailCliente[clienteAtual] = emailCliente;
                    vetorTelefoneCliente[clienteAtual] = telefoneCliente;
                    clienteAtual++;
                    escreva("Cliente cadastrado com sucesso!");
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
                se(idVendedor == nulo ou cpfCliente == nulo ou idVeiculo == nulo){
                    escreva("Cadastro cancelado devido a campo(s) vazio(s)");
                }senao{
                    gerarComprovante(idVendedor,cpfCliente,idVeiculo);
                    escreva("Compra realizada com sucesso!")
                }
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
                    vetorIdVeiculo[veiculoAtual] = veiculoAtual;
                    vetorModeloVeiculo[veiculoAtual] = modeloVeiculo;
                    vetorMarcaVeiculo[veiculoAtual] = marcaVeiculo;
                    vetorPlacaVeiculo[veiculoAtual] = placaVeiculo;
                    vetorAnoVeiculo[veiculoAtual] = anoVeiculo;
                    vetorQuilometragemVeiculo[veiculoAtual] = quilometragemVeiculo;
                    vetorPrecoVeiculo[veiculoAtual] = precoVeiculo;
                    veiculoAtual++;
                    escreva("Veiculo cadastrado com sucesso! ")
                }
            pare
            caso 5:
                escreva("O que deseja fazer?\n[1] - Listar Funcionários\n[2] - Adicionar Funcionário \n [3] - Remover Funcionário\n[0] - Retornar");
                leia(funcionarioMenu);
                escolha(funcionarioMenu){
                    caso 1:
                        escreva("Consultando todo o nosso bando de dados sobre funcionários! \n(OBS: Nome dos integrantes do grupo)");
                        retornaFuncionarios();
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
                            vetorIdVendedor[vendedorAtual] = vendedorAtual+1;
                            vetorNomeVendedor[vendedorAtual] = nomeVendedor;
                            vetorCpfVendedor[vendedorAtual] = cpfVendedor;
                            vetorEnderecoVendedor[vendedorAtual] = enderecoVendedor;
                            vetorEmailVendedor[vendedorAtual] = emailVendedor;
                            vetorTelefoneVendedor[vendedorAtual] = telefoneVendedor;
                            vetorRGM[vendedorAtual] = rgmVendedor;
                            vetorTurma[vendedorAtual] = turmaVendedor;
                            vendedorAtual++;
                            escreva("Funcionário cadastrado com sucesso! ") 
                        }
                    pare;
                    caso 3:
                        escreva("Informe o ID do funcionário a ser desligado");
                        leia(idVendedor);
                        removeVendedor(idVendedor);
                    pare
                    caso 0:
                        escreva("retornando ao menu anterior...");
                    padrao:
                        escreva("Opção Inválida, retornando ao menu anterior!");
                }
            pare
            caso 0:
                escreva("Obrigado por usar o nosso software Ass: Equipe de desenvolvimento.");
                menu = falso;
            pare;
            padrao:
                escreva("Opção inválida!")
        }
    }// fim menu

    void retornaClientes(){
        para(i=0;i>vetorNomeCliente.tamanho;i++){
            escreva(vetorNomeCliente[i]);
            escreva(vetorCpfCliente[i]);
            escreva(vetorEmailCliente[i]);
            escreva(vetorEnderecoCliente[i]);
            escreva(vetorTelefoneCliente[i]);
            escreva("--------------------\n--------------------\n--------------------");
        }
    }
    void retornaClienteCPF(inteiro cpf){
        para(i=0;i>vetorCpfCliente.tamanho;i++){
            se(cpf == vetorCpfCliente[i]){
                escreva(vetorNomeCliente[i]);
                escreva(vetorCpfCliente[i]);
                escreva(vetorEmailCliente[i]);
                escreva(vetorEnderecoCliente[i]);
                escreva(vetorTelefoneCliente[i]);
            } 
        }
    }
    void retornaEstoque(){
        para(i=0;i>vetorIdVeiculo.tamanho;i++){
            escreva(vetorIdVeiculo[i]);
            escreva(vetorModeloVeiculo[i]);
            escreva(vetorMarcaVeiculo[i]);
            escreva(vetorPlacaVeiculo[i]);
            escreva(vetorAnoVeiculo[i]);
            escreva(vetorQuilometragemVeiculo[i]);
            escreva(vetorPrecoVeiculo[i]);
            escreva("--------------------\n--------------------\n--------------------");
        }
    }
    void retornaEstoqueModelo(literal modelo){
        para(i=0;i>vetorModeloVeiculo.tamanho;i++){
            se(modelo == vetorModeloVeiculo[i]){
                escreva(vetorIdVeiculo[i]);
                escreva(vetorModeloVeiculo[i]);
                escreva(vetorMarcaVeiculo[i]);
                escreva(vetorPlacaVeiculo[i]);
                escreva(vetorAnoVeiculo[i]);
                escreva(vetorQuilometragemVeiculo[i]);
                escreva(vetorPrecoVeiculo[i]);
                escreva("--------------------\n--------------------\n--------------------");
            }
        }
    }
    void retornaEstoqueMarca(literal marca){
        para(i=0;i>vetorMarcaVeiculo.tamanho;i++){
            se(marca == vetorMarcaVeiculo[i]){
                escreva(vetorIdVeiculo[i]);
                escreva(vetorModeloVeiculo[i]);
                escreva(vetorMarcaVeiculo[i]);
                escreva(vetorPlacaVeiculo[i]);
                escreva(vetorAnoVeiculo[i]);
                escreva(vetorQuilometragemVeiculo[i]);
                escreva(vetorPrecoVeiculo[i]);
                escreva("--------------------\n--------------------\n--------------------");
            }
        }
    }
    void retornaEstoqueAno(inteiro ano){
        para(i=0;i>vetorAnoVeiculo.tamanho;i++){
            se(vetorAnoVeiculo[i] <= ano){
                escreva(vetorIdVeiculo[i]);
                escreva(vetorModeloVeiculo[i]);
                escreva(vetorMarcaVeiculo[i]);
                escreva(vetorPlacaVeiculo[i]);
                escreva(vetorAnoVeiculo[i]);
                escreva(vetorQuilometragemVeiculo[i]);
                escreva(vetorPrecoVeiculo[i]);
                escreva("--------------------\n--------------------\n--------------------");
            }
        }
    }
    void retornaEstoqueKm(inteiro km){
        para(i=0;i>vetorQuilometragemVeiculo.tamanho;i++){
            se(vetorQuilometragemVeiculo[i] <= km){
                escreva(vetorIdVeiculo[i]);
                escreva(vetorModeloVeiculo[i]);
                escreva(vetorMarcaVeiculo[i]);
                escreva(vetorPlacaVeiculo[i]);
                escreva(vetorAnoVeiculo[i]);
                escreva(vetorQuilometragemVeiculo[i]);
                escreva(vetorPrecoVeiculo[i]);
                escreva("--------------------\n--------------------\n--------------------");
            }
        }
    }
    void retornaEstoquePreco(real preco){
        para(i=0;i>vetorPrecoVeiculo.tamanho;i++){
            se(vetorPrecoVeiculo[i] <= preco){
                escreva(vetorIdVeiculo[i]);
                escreva(vetorModeloVeiculo[i]);
                escreva(vetorMarcaVeiculo[i]);
                escreva(vetorPlacaVeiculo[i]);
                escreva(vetorAnoVeiculo[i]);
                escreva(vetorQuilometragemVeiculo[i]);
                escreva(vetorPrecoVeiculo[i]);
                escreva("--------------------\n--------------------\n--------------------");
            }
        }
    }
    void retornaEstoqueId(inteiro id){
        para(i=0;i>vetorIdVeiculo.tamanho;i++){
            se(id == vetorIdVeiculo[i]){
                escreva(vetorIdVeiculo[i]);
                escreva(vetorModeloVeiculo[i]);
                escreva(vetorMarcaVeiculo[i]);
                escreva(vetorPlacaVeiculo[i]);
                escreva(vetorAnoVeiculo[i]);
                escreva(vetorQuilometragemVeiculo[i]);
                escreva(vetorPrecoVeiculo[i]);
            }
        }
    }
    void removeVeiculo(inteiro id){
        para(i=0;i>vetorIdVeiculo.tamanho;i++){
            se(id == vetorIdVeiculo[i]){
                vetorModeloVeiculo[i].remover;
                vetorMarcaVeiculo[i].remover;
                vetorPlacaVeiculo[i].remover;
                vetorAnoVeiculo[i].remover;
                vetorQuilometragemVeiculo[i].remover;
                vetorPrecoVeiculo[i].remover;
                vetorIdVeiculo[i].remover;
            }
        }
    }
    void retornaFuncionarios(){
        para(i=0;i>vetorIdVendedor.tamanho;i++){
            escreva(vetorIdVendedor[i]);
            escreva(vetorNomeVendedor[i]);
            escreva(vetorCpfVendedor[i]);
            escreva(vetorEmailVendedor[i]);
            escreva(vetorEnderecoVendedor[i]);
            escreva(vetorTelefoneVendedor[i]);
            escreva(vetorRGM[i]);
            escreva(vetorTurma[i]);
            escreva("--------------------\n--------------------\n--------------------");
        }
    }
    void removeVendedor(inteiro id){
        para(i=0; i>vetorIdVendedor.tamanho;i++){
            se(id == vetorIdVendedor[i]){
                vetorNomeVendedor[i].remover;
                vetorCpfVendedor[i].remover;
                vetorEnderecoVendedor[i].remover;
                vetorEmailVendedor[i].remover;
                vetorTelefoneVendedor[i].remover;
                vetorRGM[i].remover;
                vetorTurma[i].remover;
                vetorIdVendedor[i].remover;
            }
        }
    }

    literal retornarVendedorID(inteiro id){
        para(i=0; i> vetorIdVendedor.tamanho;i++){
            se(id == vetorIdVendedor[i]){
                saida = escreva(vetorNomeCliente[i] + "ID:" + vetorIdVendedor[i] + "contato: "+ vetorTelefoneVendedor[i]);
            }
        }
    }
    literal gerarComprovante(inteiro idVendedor, literal cpf, inteiro idVeiculo){
        literal saida = "\n\n====COMPROVANTE DE COMPRA====\n\n";
        saida += "VENDEDOR: " + retornaVendedorID(idVendedor); 
        saida += "COMPRADOR: " + retornaClienteCPF(cpf);
        saida += "VEÍCULO COMPRADO: " +retornaEstoqueId(idVeiculo);
        saida += removeVeiculo(idVeiculo);
        retorne saida;
    }


    fim