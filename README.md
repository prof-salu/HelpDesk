**🎧 Help Desk Corporativo - Fluxos e Estados (Módulo 7)**

Bem-vindo(a) ao repositório oficial do Módulo 7 da disciplina de Padrões de Projetos de Software.

**📜 O Contexto (A Sua Missão)**

Você foi integrado(a) à equipe de engenharia de um sistema corporativo de Help Desk (Suporte ao Cliente). O sistema atual recebe chamados (tickets), gera relatórios de desempenho, permite que os atendentes escrevam respostas para os clientes e exibe listas de pendências.

No entanto, a arquitetura está colapsando:

Roteamento Rígido: A triagem de chamados é feita por um bloco de ifs interminável. Se contratarmos um "Especialista em Redes" para ajudar, a classe principal terá que ser alterada.

Código Duplicado: A geração de relatórios em PDF e CSV compartilha 80% do mesmo código, mudando apenas uma etapa de formatação.

Falta de "Ctrl+Z": O editor de respostas do atendente atualiza o texto diretamente. Se ele apagar tudo por engano, perde o trabalho inteiro.

Quebra de Encapsulamento: A caixa de entrada de tickets expõe publicamente que usa um Array fixo. Todo o sistema está programando laços for baseados nesse array.

A sua missão é aplicar os Padrões Comportamentais (GoF) finais para organizar os algoritmos, gerenciar estados e criar fluxos de responsabilidade dinâmicos.

**🛠️ Como iniciar o laboratório**

Clone este repositório na sua máquina.

Abra o projeto na sua IDE (IntelliJ, Eclipse, etc).

Execute o arquivo Main.java para ver as falhas de arquitetura em ação.

**🎯 Laboratórios de Refatoração**

Siga a sua Apostila de Laboratório para aplicar as correções abaixo:

**1. A Linha de Atendimento (Chain of Responsibility)**

Objetivo: Acabar com os ifs do roteamento.

Ação: Criar uma cadeia onde o Ticket passa do Robô para o Atendente, e do Atendente para o Gerente, até que alguém assuma a responsabilidade de resolvê-lo.

**2. A Fábrica de Relatórios (Template Method)**

Objetivo: Eliminar a duplicação de código entre PDF e CSV.

Ação: Criar uma classe base com o "esqueleto" do algoritmo de geração e forçar as filhas a implementarem apenas o passo específico de formatação visual.

**3. O Editor à Prova de Falhas (Memento)**

Objetivo: Criar um histórico de edições ("Desfazer").

Ação: Fazer o editor gerar "fotografias" (Mementos) do texto atual e guardá-las num Histórico para permitir viagens no tempo e restauração de dados.

**4. A Caixa de Entrada Oculta (Iterator)**

Objetivo: Ocultar a estrutura de dados (Array) da Caixa de Tickets.

Ação: Criar um Iterador que permita percorrer os tickets um por um (temProximo(), obterProximo()) sem que o Main saiba como eles estão armazenados.

**⚠️ Regra de Ouro do Repositório**

Existe uma branch chamada solucao com o código perfeito. Não mude para a branch de solução antes de tentar resolver sozinho(a)!
