package deob;

import java.util.Iterator;

@ObfuscatedName("ju")
public class class275 implements Iterator {

    @ObfuscatedName("ju.n")
    public class277 field3576;

    @ObfuscatedName("ju.v")
    public class185 field3577;

    @ObfuscatedName("ju.d")
    public class185 field3575 = null;

    public class275(class277 arg0) {
        this.field3576 = arg0;
        this.field3577 = this.field3576.field3582.field2133;
        this.field3575 = null;
    }

    public Object next() {
        class185 var1 = this.field3577;
        if (this.field3576.field3582 == var1) {
            var1 = null;
            this.field3577 = null;
        } else {
            this.field3577 = var1.field2133;
        }
        this.field3575 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3576.field3582 != this.field3577;
    }

    public void remove() {
        if (this.field3575 == null) {
            throw new IllegalStateException();
        }
        this.field3575.method3481();
        this.field3575 = null;
    }
}
