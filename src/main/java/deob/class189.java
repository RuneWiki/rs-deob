package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class189 implements Iterator {

    @ObfuscatedName("gv.i")
    public class192 field2466;

    @ObfuscatedName("gv.c")
    public class193 field2465;

    @ObfuscatedName("gv.e")
    public class193 field2467 = null;

    public class189(class192 arg0) {
        this.field2466 = arg0;
        this.field2465 = this.field2466.field2478.field2481;
        this.field2467 = null;
    }

    public Object next() {
        class193 var1 = this.field2465;
        if (this.field2466.field2478 == var1) {
            var1 = null;
            this.field2465 = null;
        } else {
            this.field2465 = var1.field2481;
        }
        this.field2467 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2466.field2478 != this.field2465;
    }

    public void remove() {
        if (this.field2467 == null) {
            throw new IllegalStateException();
        }
        this.field2467.method3278();
        this.field2467 = null;
    }
}
