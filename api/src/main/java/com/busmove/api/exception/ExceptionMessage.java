package com.busmove.api.exception;

public class ExceptionMessage {

    // É obrigatório
    public static final String EmailObrigatorio = "O e-mail é obrigatório.";
    public static final String NomeObrigatorio = "O nome é obrigatório.";
    public static final String TelefoneObrigatorio = "O telefone é obrigatório.";
    public static final String TelefoneInvalido = "O telefone deve ser um número válido com 10 a 15 dígitos, podendo iniciar com '+'.";
    public static final String EnderecoObrigatorio = "O endereço é obrigatório.";
    public static final String CategoriaObrigatoria = "A categoria é obrigatória.";
    public static final String DescricaoObrigatoria = "A descrição é obrigatória.";
    public static final String NumeroPedidoObrigatorio = "O número do pedido é obrigatório.";
    public static final String ItensPedidoObrigatorios = "Os itens são obrigatórios.";
    public static final String EmpresaObrigatorio = "O empresa é obrigatório.";
    public static final String PassageiroObrigatorio = "O passageiro é obrigatório.";
    public static final String DataPedidoObrigatoria = "A data do pedido é obrigatória.";
    public static final String QuantidadeObrigatoria = "A quantidade é obrigatória.";
    public static final String ProdutoObrigatorio = "O produto é obrigatório.";
    public static final String DisponibilidadeProdutoObrigatoria = "A disponibilidade do produto é obrigatória.";
    public static final String TaxaEntregaObrigatoria = "A taxa de entrega é obrigatória.";
    public static final String StatusObrigatorio = "O status é obrigatório.";

    // Inválido
    public static final String EmailInvalido = "O e-mail informado é inválido.";
    public static final String EmpresaInvalido = "O empresa informado é inválido.";
    public static final String TransicaoStatusPedidoInvalida = "Transição de status inválida para o pedido.";

    // Já cadastrado
    public static final String EmailJaCadastrado = "E-mail já cadastrado.";
    public static final String EmpresaJaCadastrado = "Empresa já cadastrado.";

    // Não encontrado
    public static final String PassageiroNaoEncontrado = "Passageiro não encontrado.";
    public static final String EmpresaNaoEncontrado = "Empresa não encontrado.";
    public static final String ProdutoNaoEncontrado = "Produto não encontrado.";
    public static final String PedidoNaoEncontrado = "Pedido não encontrado.";
    public static final String PedidosNaoEncontradosParaPassageiro = "Nenhum pedido encontrado para o passageiro informado.";
    public static final String NenhumProdutoEncontrado = "Nenhum produto encontrado.";
    public static final String ProdutosNaoEncontradosParaEmpresa = "Nenhum produto encontrado para o empresa informado.";
    public static final String ProdutosNaoEncontradosParaCategoria = "Nenhum produto encontrado para a categoria informado.";
    public static final String ProdutosNaoEncontradosParaPrecoMenor = "Nenhum produto encontrado com preço menor ou igual a: R$ {0}.";
    public static final String ProdutosNaoEncontradosParaFaixaPreco = "Nenhum produto encontrado na faixa de preço: R$ {0} a R$ {1}.";
    public static final String NenhumEmpresaEncontrado = "Nenhum empresa encontrado.";
    public static final String EmpresasNaoEncontradosParaCategoria = "Nenhum empresa encontrado para a categoria informado.";
    public static final String EmpresasNaoEncontradosParaFaixaPreco = "Nenhum empresa encontrado na faixa de preço: R$ {0} a R$ {1}.";
    public static final String EmpresaNaoEncontradosParaPrecoMenor = "Nenhum empresa encontrado com preço menor ou igual a: R$ {0}.";
    public static final String NenhumaVendaEncontrada = "Nenhum dado de vendas encontrado.";
    public static final String NenhumPedidoEncontrado = "Nenhum pedido encontrado.";

    // Inativo
    public static final String PassageiroInativo = "O passageiro está inativo.";
    public static final String EmpresaInativo = "O empresa está inativo.";

    // Disponivel
    public static final String EmpresaNaoDisponivel = "O empresa não está disponível.";

    // Outros
    public static final String PrecoDeveSerMaiorQueZero = "O preço deve ser maior que zero.";
    public static final String ProdutoNaoPertenceAoEmpresa = "O produto não pertence ao empresa selecionado.";
    public static final String ProdutoNaoDisponivel = "O produto não está disponível.";
    public static final String PedidoNaoPodeSerCancelado = "O pedido não pode ser cancelado,  status atual: ";
    public static final String QuantidadeMaiorQueZero = "A quantidade deve ser pelo menos 1.";
    public static final String QuantidadeMenorQueCem = "A quantidade não pode ser maior que 100.";
    public static final String PedidoJaCancelado = "O pedido já está cancelado.";
    public static final String EmpresaJaInativo = "Empresa já está inativo.";
}
