package service;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.List;

public class CsvService {
    public <T> void writeToCsv(List<T> data, String filePath) {
        try (Writer writer = new FileWriter(filePath)) {
            StatefulBeanToCsv<T> beanToCsv = new StatefulBeanToCsvBuilder<T>(writer)
                    .withApplyQuotesToAll(false)
                    .build();

            beanToCsv.write(data);
            System.out.println("Dados escritos com sucesso em: " + filePath);
        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            System.err.println("Erro ao escrever arquivo CSV: " + e.getMessage());
        }
    }

    public <T> List<T> readFromCsv(String filePath, Class<T> clazz) {
        try (FileReader reader = new FileReader(filePath)) {
            List<T> beans = new CsvToBeanBuilder<T>(reader)
                    .withType(clazz)
                    .build()
                    .parse();

            System.out.println("Dados lidos com sucesso de: " + filePath);
            return beans;
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo CSV: " + e.getMessage());
            return Collections.emptyList();
        } catch (Exception e) {
            System.err.println("Erro ao processar os dados do CSV em: " + filePath + ". Causa: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
