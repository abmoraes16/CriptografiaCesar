package challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if(texto.isEmpty())
            throw new IllegalArgumentException();

        return texto.chars()
            .map(c->Character.isAlphabetic(c) ? (c+3) : c)
            .collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append)
            .toString().toLowerCase();
    }

    @Override
    public String descriptografar(String texto) {
        if(texto.isEmpty())
            throw new IllegalArgumentException();

        return texto.chars()
                .map(c->Character.isAlphabetic(c) ? (c-3) : c)
                .collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append)
                .toString().toLowerCase();
    }


}
