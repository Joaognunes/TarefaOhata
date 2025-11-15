
| ID | ITEM                               | STATUS  | ARTEFATO COM ERRO                           | CORREÇÕES A SEREM REALIZADAS                                                                                               |
|----|------------------------------------|---------|-----------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|
| 1  | Conexão com o BD                   | Falhou  | Metodo - conectarBD                           | Capturar exceções corretamente, não deixar catch vazio, não retornar null silenciosamente, corrigir driver (com.mysql.cj.jdbc.Driver), remover senha hardcoded. |
| 2  | Fechamento de recursos JDBC        | Falhou  | Connection, Statement, ResultSet não são fechados | Fechar todos os recursos após uso (usar try-with-resources)                                                                  |
| 3  | Tratamento de exceções             | Falhou  | Bloco catch genérico                           | Adicionar logs ou mensagens mais específicas (SQLException, ClassNotFoundException). Não deixar catch vazio.                 |
| 4  | Segurança da Query                 | Falhou  | Query montada com concatenação de strings      | Utilizar PreparedStatement com parâmetros “?” para evitar injeção de SQL                                                     |
| 5  | Nomenclatura de variáveis e constantes | Parcial | Variáveis: result, nome, conn, sql             | Adotar convenção Java (camelCase), nomes mais descritivos e criar constantes para valores fixos (URL, usuário, senha)        |
| 6  | Documentação                       | Falhou  | Classe User e métodos                          | Adicionar comentários explicativos e Javadoc descrevendo propósito, parâmetros e retorno de cada método                      |
| 7  | Legibilidade e organização         | Parcial | Estrutura geral do código confusa              | Melhorar identação, espaçamento, nomes de variáveis e remover códigos comentados desnecessários                              |
| 8  | Tratamento de NullPointerException | Falhou  | Uso de conn.createStatement()                  | Verificar se conn != null antes de usar, tratar exceções corretamente e evitar execução com conexões nulas |



<img width="683" height="60" alt="image" src="https://github.com/user-attachments/assets/c816ca46-d4e7-4c89-82c3-6a1aa91bd0d6" />
<img width="443" height="726" alt="image" src="https://github.com/user-attachments/assets/2f80ffb2-5402-4002-826b-0b2e59648d1e" />



<img width="677" height="75" alt="image" src="https://github.com/user-attachments/assets/44ca8e4d-eac8-4a92-a906-4a1ab3b1ad8e" />

1 → 2 → 3 → 4 → 5 → 6 → 7 (true) → 8 → 12

1 → 2 → 3 → 4 → 5 → 6 → 7 (false) → 9 → 12

1 → 2 → 3 → 4 → 10 → 11 (Finaliza)



<img width="453" height="68" alt="image" src="https://github.com/user-attachments/assets/c1d06e64-7505-4316-b008-44faabade396" />

M = E - N + 2P  
M = 13 - 12 + 2 × 1  
M = 1 + 2  
M = 3
