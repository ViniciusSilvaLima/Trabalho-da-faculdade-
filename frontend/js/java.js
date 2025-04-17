function escreverTerminal(mensagem, delay = 20) {
  return new Promise(resolve => {
    const saida = document.getElementById("saida");
    let i = 0;
    const audio = document.getElementById("audioDigitar");

    function escrever() {
      if (i < mensagem.length) {
        saida.textContent += mensagem.charAt(i);
        audio.currentTime = 0;
        audio.play();
        i++;
        setTimeout(escrever, delay);
      } else {
        saida.textContent += '\n';
        resolve();
      }
    }
    escrever();
  });
}

async function executarSimulacao() {
  const saida = document.getElementById("saida");
  saida.textContent = "";
  const codigo = document.getElementById("codigoSelecionado").value;

  if (codigo === "pilhaGenerica") {
    await escreverTerminal("Pilha Genérica com JOptionPane");
    await escreverTerminal("Digite o valor para empilhar: 10");
    await escreverTerminal("Valor 10 empilhado.");
    await escreverTerminal("Digite o valor para empilhar: 20");
    await escreverTerminal("Valor 20 empilhado.");
    await escreverTerminal("Removido: 20");
    await escreverTerminal("Topo da pilha: 10");
    await escreverTerminal("Removido: 10");
    await escreverTerminal("Pilha vazia!", 80);
  } else if (codigo === "pilhaObjetos") {
    await escreverTerminal("Pilha de Objetos com Veículos");
    await escreverTerminal("P: [");
    await escreverTerminal("Placa: ABC 1234, Marca: Fiat, Modelo: Fiat Mobi Drive, Ano de Fabricação: 2016");
    await escreverTerminal("Placa: DEF 5678, Marca: Fiat, Modelo: Grande Punto, Ano de Fabricação: 2015");
    await escreverTerminal("Placa: GHI 9101, Marca: Volkswagen, Modelo: Gol Trend, Ano de Fabricação: 2017");
    await escreverTerminal("Placa: FDa 2301, Marca: Audi, Modelo: A4, Ano de Fabricação: 2018");
    await escreverTerminal("]");

    await escreverTerminal("Adicionamos mais um veículo:");
    await escreverTerminal("Placa: FFL 0007, Marca: Mercedes Benz, Modelo: GLA 200, Ano de Fabricação: 2017");

    await escreverTerminal("Retirando da pilha:");
    await escreverTerminal("Placa: FFL 0007, Marca: Mercedes Benz, Modelo: GLA 200, Ano de Fabricação: 2017");
    await escreverTerminal("Placa: FDa 2301, Marca: Audi, Modelo: A4, Ano de Fabricação: 2018");
    await escreverTerminal("Placa: GHI 9101, Marca: Volkswagen, Modelo: Gol Trend, Ano de Fabricação: 2017");
    await escreverTerminal("Placa: DEF 5678, Marca: Fiat, Modelo: Grande Punto, Ano de Fabricação: 2015");
    await escreverTerminal("Placa: ABC 1234, Marca: Fiat, Modelo: Fiat Mobi Drive, Ano de Fabricação: 2016");
    await escreverTerminal("Pilha de veículos totalmente vazia!");
  } else {
    const audioErro = document.getElementById("audioErro");
    audioErro.play();
    await escreverTerminal("Erro: Código selecionado inválido!");
  }
}
