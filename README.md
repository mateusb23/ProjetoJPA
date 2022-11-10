Este é um projeto simples em Java com JPA e o banco de dados MariaDB. 

1) A grande diferença nesse projeto foi a criação da classe ConnectionFactory, que está dentro do pacote (br.com.mateusb23.connection).
   Nessa classe foi criada uma fábrica de EntityManager com o objeto EntityManagerFactory emf instanciado a partir da classe Persistence.
   Porém, o grande diferencial positivo é quando tornamos essa fábrica privada e estática, fazendo com que apenas a classe atual consiga te 
   acesso direto ao objeto emf, que costumava ser instanciado em todos os momentos em que precisávamos fazer conexões com o banco e, que agora não 
   precisa mais, pois basta chamarmos o método getEntityManager() que irá retornar emf.createEntityManager().