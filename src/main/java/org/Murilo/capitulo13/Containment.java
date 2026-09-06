package org.Murilo.capitulo13;


// Exemplo de interface genérica.
// Uma interface genérica que lida com armazenamento.
// Esta interface requer que a classe usuária
// tenha um ou mais valores.

interface Containment<T> {
    boolean contains(T o);
}
