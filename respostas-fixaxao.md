Exercícios de Fixação
=====================

1. Dada a sua complexidade, sistemas de bancos de dados são componentes
relevantes na arquitetura de qualquer tipo de sistema. Verdadeiro ou falso?
Justifique a sua resposta.  
  **R:**  
  **Nos sistemas os quais se faz necessário o uso de bancos de dados 
  estes geralmente podem ser considerados componentes de grande relevância,
  desde que o uso de dados seja parte da funcionalidade central do sistema.**
  
2. Descreva três vantagens de arquiteturas MVC.  
  **R:**
    - **Separação muito clara entre as camadas de visualização e regras de negócios;**
    - **Manutenção do sistema se torna mais fácil;**
    - **Reaproveitamento de código, principalmente da camada de modelo, que pode ser reutilizada em outros projetos;**

3. Qual a diferença entre classes Controladoras em uma Arquitetura MVC tradicional
e classes Controladoras de um sistema Web implementado usando um framework
MVC como Ruby on Rails?  
  **R:**  
  **Os Controladores em Ruby On Rails geralmente tem a função de lidar com as "entradas" dos(as) usuários(as).**

4. Descreva resumidamente quatro vantagens de microsserviços.  
  **R:**. 
    - **Facilidade e rapidez na atualização e implantação dos serviços;**
    - **Aumentar a flexibilidade da infraestrutura;**
    - **Escalabilidade;**
    - **Estandardização de serviços;**

5. Por que microsserviços não são uma bala de prata? Isto é, descreva pelo menos
três desvantagens do uso de microsserviços.  
  **R:**  
    - **Complexidade. É fácil perceber que um sistema formado por partes autônomas e especializadas forma um todo bem complexo, distribuído;**
    - **Governança;**
    - **Integração com aplicações monolíticas legadas;**
  
6. Explique a relação entre a Lei de Conway e microsserviços.  
  **R:**  
  **A lei de Conway indica que as estruturas dos sistemas de software são "espelhos" das estruturas das organizações que os desenvolvem. 
  Assim, times monolíticos não conseguem desenvolver microsserviços e, também, sistemas monolíticos não podem ser mantidos por Squads.**

7. Explique o que significa desacoplamento no espaço e desacoplamento no tempo.
Por que arquiteturas baseadas em filas de mensagens e arquiteturas
Publish/Subscribe oferecem essas formas de desacoplamento?  
  **R:**  
  - **Desacoplamento no espaço: clientes não precisam conhecer os servidores e vice-versa. 
    Em outras palavras, o cliente é exclusivamente um produtor de informações. 
    Mas ele não precisa saber quem vai consumir essa informação. O raciocínio inverso vale para servidores.**

  - **Desacoplamento no tempo: clientes e servidores não precisam estar simultaneamente disponíveis para se 
    comunicarem. Se o servidor estiver fora do ar, os clientes podem continuar produzindo mensagens e colocando-as na fila. 
    Quando o servidor voltar a funcionar, ele irá processar essas mensagens.**
    
    ****

8. Quando uma empresa deve considerar o uso de uma arquitetura baseada em filas
de mensagens ou uma arquitetura publish/subscribe?
9. Explique o objetivo do conceito de tópicos em uma arquitetura publish/subscribe.
10. (POSCOMP, 2019, adaptado) Marque V ou F.
( ) O padrão MVC é uma adaptação do padrão arquitetural Camadas. A Camada
Visão lida com a apresentação e a manipulação da interface, a Camada Modelo
organiza os objetos específicos da aplicação, e a Camada Controle posiciona-se
entre estas duas com as regras do negócio.

( ) O padrão Broker é voltado a problemas de ambientes distribuídos. Sugere uma
arquitetura na qual um componente (broker) estabelece uma mediação que permite
um desacoplamento entre clientes e servidores.
( ) Mesmo que um dado padrão arquitetural ofereça uma solução para o problema
sendo resolvido, nem sempre ele é adequado. Fatores como contexto e o sistema de
forças que afeta a solução fazem também parte do processo de avaliação e da
escolha de padrões adequados.
