package org.example;

import org.example.Config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        Query query = session.createQuery("FROM Book WHERE publicationYear > 2010", Book.class);
//        List<Book> books = query.list();
//
//
//        Author specificAuthor = new Author();
//        specificAuthor.setName("author");
//
//
//        Query query = session.createQuery("UPDATE Book SET price = price + 10 WHERE author = : author");
//        query.setParameter("author", specificAuthor);
//        //int rowsUpdated = query.executeUpdate();

//        Query query = session.createQuery("SELECT AVG(price) FROM Book");
//        Double averagePrice = (Double) query.uniqueResult();

        transaction.commit();
        session.close();
    }
}
