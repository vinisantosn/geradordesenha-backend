# Aplicação Gerador de Senhas - Backend

**Gerador de Senhas**

Este é um projeto de uma aplicação web desenvolvida em Java utilizando o framework Spring Boot para gerar senhas seguras de forma aleatória. Abaixo estão algumas informações importantes sobre o projeto:

**1. Tecnologias Utilizadas:**
   - Java
   - Spring Boot
   - Spring Data JPA
   - Hibernate
   - Maven

**2. Funcionalidades:**
   - Geração de Senhas: Através de uma requisição HTTP GET para `/gerador`, é possível gerar uma senha segura. O tamanho da senha pode ser especificado como parâmetro na requisição (por padrão, o tamanho é 12 caracteres).
   - Armazenamento em Banco de Dados: Após gerar uma senha, ela é armazenada em um banco de dados MySQL. Isso permite recuperar as senhas geradas posteriormente, se necessário.

**3. Configuração do Banco de Dados:**
   - O projeto está configurado para utilizar um banco de dados MySQL. Certifique-se de configurar corretamente as credenciais do banco de dados no arquivo `application.properties`.

**4. Frontend:**
   - O frontend desta aplicação não está incluído neste repositório. Para integrar com a parte frontend, você pode seguir as seguintes etapas:
      - Desenvolva a parte frontend da aplicação, utilizando HTML, CSS e JavaScript ou um framework frontend como React, Angular ou Vue.js.
      - Faça requisições HTTP GET para o endpoint `/gerador` para gerar senhas e exibi-las na interface do usuário.
      - Implemente funcionalidades adicionais, como permitir que o usuário especifique o comprimento da senha ou exiba as senhas geradas anteriormente a partir do banco de dados.

**5. Deploy:**
   - Este projeto foi configurado e testado para ser implantado em um servidor WildFly. Certifique-se de configurar corretamente o ambiente e a implantação no servidor.

**6. Observações:**
   - O código fornecido inclui apenas a lógica de backend para gerar e armazenar senhas. A implementação do frontend esta disponível em:  [GERADOR DE SENHAS - FRONTEND](https://github.com/vinisantosn/geradordesenha-front)
.
  

