package deob;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@ObfuscatedName("qq")
public class class431 implements Iterator {

    @ObfuscatedName("qq.ab")
    public class432 field4714;

    @ObfuscatedName("qq.ay")
    public int field4716 = 0;

    @ObfuscatedName("qq.an")
    public int field4715 = this.field4714.field4720;

    public class431(class432 arg0) {
        this.field4714 = arg0;
    }

    public boolean hasNext() {
        return this.field4716 < this.field4714.field4719;
    }

    public Object next() {
        if (this.field4714.field4720 != this.field4715) {
            throw new ConcurrentModificationException();
        } else if (this.field4716 < this.field4714.field4719) {
            Object var1 = this.field4714.field4721[this.field4716].field4711;
            this.field4716++;
            return var1;
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
