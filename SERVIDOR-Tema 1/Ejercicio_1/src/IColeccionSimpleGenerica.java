public interface IColeccionSimpleGenerica<T> {
    public boolean estaVacia();

    public T extraer();

    public T primero();

    public boolean aniadir(T elemento);
}
