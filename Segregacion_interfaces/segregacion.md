```java 
public interface IGestorMultimedia {
    void reproducir();
    void pausar();
    void detener();
    void adelantar();
    void retroceder();
    void mostrarSubtitulos(); 
    void ajustarVolumen(int volumen); 

    void cambiarFuente(String fuente); 
}
```

```java 

public interface IReproductor {
  void reproducir();
  void pausar();
  void detener();
}

public interface INavegable {
  void adelantar();
  void retroceder();
}

public interface IControVolumen {
  void ajustarVolumen(int volumen); 
}

public interface ISoporteSubtitulos {
  void mostrarSubtitulos(); 
}

public interface IControlTexto {
  void cambiarFuente(String fuente); 
}

```

```java 

public class ReproductoVideo implements IReproductor, INavegable, IControVolumen, ISoporteSubtitulos {

}

public class VisorTexto implements IControlTexto {

}

public class ReproductoAudio implements IReproductor, INavegable, IControVolumen {

}

```