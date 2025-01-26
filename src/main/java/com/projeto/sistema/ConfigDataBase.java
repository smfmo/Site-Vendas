package com.projeto.sistema;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import javax.sql.DataSource;
//import javax.xml.crypto.Data;
//import java.sql.DriverManager;
//
//@Configuration
//public class ConfigDataBase {
//
//    @Bean
//    public DataSource dataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver"); //declara as configurações de acesso
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/loja");
//        dataSource.setUsername("postgres"); //usuário
//        dataSource.setPassword("123456"); //senha
//        return dataSource;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter(){
//        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//        adapter.setDatabase(Database.POSTGRESQL); //driver do banco
//        adapter.setShowSql(true); //mostrar no console o sql.
//        adapter.setGenerateDdl(true);
//        adapter.setDatabasePlatform("org.Hibernate.dialect.postgreSQLDialect");
//        adapter.setPrepareConnection(true);
//        return adapter;
//    }
//}
