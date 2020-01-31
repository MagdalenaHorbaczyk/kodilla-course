package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new Product("avocado"), new BigDecimal(11), 2, new BigDecimal(5.5));
        Item item2 = new Item(new Product("lemon"), new BigDecimal(4), 1, new BigDecimal(4));
        Item item3 = new Item(new Product("tomato"), new BigDecimal(6), 2, new BigDecimal(3));
        Item item4 = new Item(new Product("onion"), new BigDecimal(1), 1, new BigDecimal(1));

        Invoice invoice = new Invoice("2020/1/1");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice((invoice));
        item4.setInvoice((invoice));

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
