package edu.vanderbilt.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * A generic array class implemented via a single contiguous buffer.
 */
public class Array<E>
       implements Iterable<E> {
    /**
     * The array buffer that stores all the array elements.  The
     * capacity is the length of this array buffer.
     */
    private Object[] mElementData;

    /**
     * Index to the last element in the array.
     */
    private int mEnd;

    /**
     * The size of the Array (the number of elements it contains).
     */
    private int mSize;

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Object[] sEMPTY_ELEMENTDATA = {};

    /*
     * The following methods and nested class use Java 7 features.
     */

    /**
     * Constructs an empty array with an initial capacity of ten.
     */
    public Array() {
        mElementData = sEMPTY_ELEMENTDATA;
    }

    /**
     * Constructs an empty array with the specified initial capacity.
     *
     * @param  initialCapacity  the initial capacity of the array
     * @throws IllegalArgumentException if the specified initial capacity
     *         is negative
     */
    public Array(int initialCapacity) {
        // TODO -- you fill in here.
    }

    /**
     * Constructs a array containing the elements of the specified
     * collection, in the order they are returned by the collection's
     * iterator.
     *
     * @param c the collection whose elements are to be placed into this array
     * @throws NullPointerException if the specified collection is null
     */
    public Array(Collection<? extends E> c) {
        // TODO -- you fill in here.
    }

    /**
     * Returns <tt>true</tt> if this collection contains no elements.
     *
     * @return <tt>true</tt> if this collection contains no elements
     */
    public boolean isEmpty() {
        // TODO -- you fill in here.
    }
    
    /**
     * Returns the number of elements in this collection.  If this collection
     * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this collection
     */
    public int size() {
        // TODO -- you fill in here.
    }
    
    /**
     * Returns the index of the first occurrence of the specified
     * element in this array, or -1 if this array does not contain the
     * element.
     *
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this array, or -1 if this array does not contain the element
     */
    public int indexOf(Object o) {
        // TODO -- you fill in here.
    }

    /**
     * Appends all of the elements in the specified collection to the
     * end of this array, in the order that they are returned by the
     * specified collection's Iterator.  The behavior of this
     * operation is undefined if the specified collection is modified
     * while the operation is in progress.  This implies that the
     * behavior of this call is undefined if the specified collection
     * is this array, and this array is nonempty.
     *
     * @param c collection containing elements to be added to this array
     * @return <tt>true</tt> if this array changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
    public boolean addAll(Collection<? extends E> c) {
        // TODO -- you fill in here.
    }

    /**
     * Appends all of the elements in the specified Array to the end
     * of this array, in the order that they are returned by the
     * specified collection's Iterator.  The behavior of this
     * operation is undefined if the specified collection is modified
     * while the operation is in progress.  This implies that the
     * behavior of this call is undefined if the specified collection
     * is this array, and this array is nonempty.
     *
     * @param a collection containing elements to be added to this array
     * @return <tt>true</tt> if this array changed as a result of the call
     * @throws NullPointerException if the specified collection is null
     */
    public boolean addAll(Array<E> a) {
        // TODO -- you fill in here.
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from
     * their indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException
     */
    public E remove(int index) {
        // TODO -- you fill in here.
    }

    /**
     * Checks if the given index is in range (i.e., index is
     * non-negative and it not equal to or larger than the size of the
     * Array) and throws the IndexOutOfBoundsException if it's not.
     */
    private void rangeCheck(int index) {
        // TODO -- you fill in here.
    }

    /**
     * Returns the element at the specified position in this array.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this array
     * @throws IndexOutOfBoundsException
     */
    public E get(int index) {
        // TODO -- you fill in here.
    }

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException
     */
    public E set(int index, E element) {
        // TODO -- you fill in here.
    }

    /**
     * Appends the specified element to the end of this array.
     **
     * @param element to be appended to this array
     * @return {@code true}
     */
    public boolean add(E element) {
        // TODO -- you fill in here.
    }
    
    /**
     * Ensure the array is large enough to hold @a minCapacity
     * elements.  The array will be expanded if necessary.
     */
    private void ensureCapacityInternal(int minCapacity) {
        // TODO -- you fill in here.
    }

    /**
     * Returns an array containing all of the elements in this Array
     * object in proper sequence (from first to last element).
     *
     * <p>The returned array will be "safe" in that no references to
     * it are maintained by this array.  (In other words, this method
     * must allocate a new array).  The caller is thus free to modify
     * the returned array.
     *
     * <p>This method acts as bridge between array-based and
     * collection-based APIs.
     *
     * @return an array containing all of the elements in this Array
     *         object in proper sequence
     */
    public Object[] toArray() {
        return Arrays.copyOf(mElementData, mSize);
    }

    /**
     * Returns an array containing all of the elements in this list in
     * proper sequence (from first to last element); the runtime type
     * of the returned array is that of the specified array.  If the
     * list fits in the specified array, it is returned therein.
     * Otherwise, a new array is allocated with the runtime type of
     * the specified array and the size of this list.
     *
     * @param a the array into which the elements of the list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of the list
     * @throws ArrayStoreException if the runtime type of the specified array
     *         is not a supertype of the runtime type of every element in
     *         this list
     * @throws NullPointerException if the specified array is null
     */
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length < mSize)
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(mElementData,
                                       mSize,
                                       a.getClass());

        //noinspection SuspiciousSystemArraycopy
        System.arraycopy(mElementData,
                         0,
                         a,
                         0,
                         mSize);

        if (a.length > mSize)
            a[mSize] = null;
        return a;
    }

    /**
     * Returns an iterator over the elements in this Array in proper
     * sequence.
     *
     * @return an iterator over the elements in this Array in proper
     * sequence
     */
    public Iterator<E> iterator() {
        // TODO - you fill in here.
    }

    /**
     * This class defines an iterator over the elements in an Array in
     * proper sequence.
     */
    private class ArrayIterator 
           implements Iterator<E> {
        /**
         * Current position in the Array (defaults to 0).
         */
        // TODO - you fill in here.

        /**
         * Index of last element returned; -1 if no such element.
         */
        // TODO - you fill in here.

        /** 
         * @return True if the iteration has more elements that
         * haven't been iterated through yet, else false.
         */
        @Override
        public boolean hasNext() {
            // TODO - you fill in here.
        }

        /**
         * @return The next element in the iteration.
         * @throws IndexOutOfBoundsException if there's no next element         * 
         */
        @Override
        public E next() {
            // TODO - you fill in here.
            //noinspection unchecked
        }

        /**
         * Removes from the underlying collection the last element
         * returned by this iterator. This method can be called only
         * once per call to next().
         *
         * @throws IllegalStateException if no last element was
         * returned by the iterator
         */
        @Override
        public void remove() {
            // TODO - you fill in here
        }
    }

    /*
     * The following methods and nested class use Java 8 features.
     */

    /**
     * Replaces each element of this list with the result of applying
     * the operator to that element.  Errors or runtime exceptions
     * thrown by the operator are relayed to the caller.
     *
     * @param operator the operator to apply to each element
     */
    public void replaceAll(UnaryOperator<E> operator) {
        // TODO - you fill in here
    }

    /**
     * Performs the given action for each element of the array until
     * all elements have been processed or the action throws an
     * exception.  Unless otherwise specified by the implementing
     * class, actions are performed in the order of iteration (if an
     * iteration order is specified).  Exceptions thrown by the action
     * are relayed to the caller.
     *
     * @param action The action to be performed for each element
     */
    public void forEach(Consumer<? super E> action) {
        // TODO - you fill in here
    }

    /**
     * @return A parallel stream.
     */
    public Stream<E> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    /**
     * @return A sequential stream.
     */
    public Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    /**
     * Creates a {@link Spliterator} over the elements in the array.
     *
     * @return a {@code Spliterator} over the elements in the array
     */
    public Spliterator<E> spliterator() {
        return new ArraySpliterator<>
            (this, 0, mSize);
    }

    /**
     * Defines an object for traversing and partitioning elements of a
     * Array.
     */
    private static final class ArraySpliterator<E>
        extends Spliterators.AbstractSpliterator<E> {
        /**
         * The array to traverse and/or partition.
         */
        private final Array<E> mArray;

        /**
         * Current index, modified on advance/split.
         */
        private int mIndex;

        /**
         * One past the end of the spliterator range.
         */
        private int mEnd;

        /**
         * Create new spliterator covering the given range.
         */
        ArraySpliterator(Array<E> array,
                         int origin,
                         int end) {
            super(array.size(),
                  Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED );

            mArray = array;
            mIndex = origin;
            mEnd = end;
        }

        /**
         * If a remaining element exists, performs the given action on
         * it, returning true; else returns false.
         */
        public boolean tryAdvance(Consumer<? super E> action) {
            // TODO - you fill in here
        }

        /**
         * Returns a Spliterator covering elements, that will, upon
         * return from this method, not be covered by this
         * Spliterator.
         */
        public ArraySpliterator<E> trySplit() {
            // TODO - you fill in here
        }
    }
}
