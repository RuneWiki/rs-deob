package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("nx")
public class class366 implements Iterator {

    @ObfuscatedName("nx.h")
    public class367 field4365;

    @ObfuscatedName("nx.e")
    public int field4366 = 0;

    @ObfuscatedName("nx.v")
    public int field4367 = this.field4365.field4373;

    public class366(class367 arg0) {
        this.field4365 = arg0;
    }

    public boolean hasNext() {
        return this.field4366 < this.field4365.field4370;
    }

    public Object next() {
        if (this.field4365.field4373 != this.field4367) {
            throw new ConcurrentModificationException();
        } else if (this.field4366 < this.field4365.field4370) {
            Object var1 = this.field4365.field4374[this.field4366].field4363;
            this.field4366++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
