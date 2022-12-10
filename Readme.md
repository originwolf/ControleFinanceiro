# Aplicativo de controle financeiro

## Conheça o desenvolvedor:

| Conheça | Pelo Link |
| ----------- | ----------- |
| Meu Github | [GitHub](https://github.com/originwolf) |
| Meu Currículo Lattes | [Lattes](http://lattes.cnpq.br/8655373056969189) |
| Meu LinkedIn | [Linkedin](https://www.linkedin.com/in/pedro-martins-dev) |
| Meu Portfólio | [Portfólio](https://pedromartins.dev) |

---

## Encontre meus contatos visitando meu portfólio.

---

Este é um aplicativo pensado para controle financeiro completo, com todas as funcionalidades na palma da mão. Para um melhor desempenho, o backend está sendo desenvolvido com Java Springboot.

Ok, eu não sou fã de aplicações fechadas e centralizadas. Isso não significa que o projeto vai utilizar blockchain, e sim que eu vou manter tudo com o código aberto.

Já tentei usar vários aplicativos e planilhas de controle financeiro, mas sinceramente não me dei bem com nenhum. Quem sabe um que eu mesmo desenvolvi seja a resposta?

Caso você planeje implementar este sistema você perceberá que eu não disponibilizarei nenhum arquivo sql do banco de dados. Não, isso não é por manter segredos ou para criar uma dependência de mim para novas implementações, o projeto na realidade foi concebido com o uso de liquibases, isso significa que quando você executar o projeto (tanto em ambientes locais quanto em servidores cloud) o banco de dados será atualizado automáticamente. é quase tipo mágica. Na verdade, a única necessidade que você vai ter é criar o banco de acordo com as especificações abaixo:

> 1. Para o correto inicio da aplicação crie um banco postgresql chamado **"finance"**
> 2. Você deve configurar a aplicação de acordo com os dados incluídos em **"src/main/resources/application.yml"**, no caso você deve indicar a porta em que seu banco postgresql é inicializado e também o usuário e senha corretos.
> 3. Caso deseje você pode criar um banco com um nome diferente, mas a configuração deve ser corrigida no mesmo arquivo listado acima. 

---
> **Em construção**
