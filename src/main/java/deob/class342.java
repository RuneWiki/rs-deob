package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("mq")
public class class342 implements Iterator {

    @ObfuscatedName("mq.v")
    public class343 field4103;

    @ObfuscatedName("mq.c")
    public int field4100 = 0;

    @ObfuscatedName("mq.i")
    public int field4101 = this.field4103.field4109;

    public class342(class343 arg0) {
        this.field4103 = arg0;
    }

    public boolean hasNext() {
        return this.field4100 < this.field4103.field4107;
    }

    public Object next() {
        if (this.field4103.field4109 != this.field4101) {
            throw new ConcurrentModificationException();
        } else if (this.field4100 < this.field4103.field4107) {
            Object var1 = this.field4103.field4105[this.field4100].field4097;
            this.field4100++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
