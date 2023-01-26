package pl.mloza;

import java.io.IOException;
import java.io.InputStream;

public interface Storage {

    void store(String name, InputStream data) throws IOException;

    InputStream read(String name);

}
