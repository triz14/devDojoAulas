package introducao.aula_87_88_89.teste;

import introducao.aula_87_88_89.dominio.DatabaseLoader;
import introducao.aula_87_88_89.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
    }
}
