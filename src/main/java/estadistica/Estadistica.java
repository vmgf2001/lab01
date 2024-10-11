package estadistica;

public class Estadistica {
    private int numElementos, sumaX, sumaX2;


    /// # Agrega el dato 'd' a la serie
    ///
    /// @param d valor que añadimos
    public void agrega(double d) {
        numElementos += 1;
        sumaX += d;
        sumaX2 += d*d;
    }

    /// # Agrega 'n' veces del dato 'd' a la serie
    ///
    /// @param d valor que añadimos
    /// @param n número de veces que añadimos el dato d
    public void agrega(double d, int n) {
        numElementos += n+1;
        sumaX += n*d;
        sumaX2 += n*d*d;
    }
// en python no podremos tener mismos metodos con varios parametros, de forma general, se podria arreglar

    /// # Devuelve la media de los valores
    ///
    /// @return media
    public double media() {
        return sumaX/numElementos;
    }

    /// # Devuelve la varianza
    ///
    /// @return varianza
    public double varianza() {
        return (sumaX2 / numElementos - media()*media());
    }

    /// # Devuelve la desviación típica
    ///
    /// @return desviación típica
    public double desviacionTipica() {
        return Math.sqrt(varianza());
    }
}
