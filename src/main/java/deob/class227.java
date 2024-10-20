package deob;

import java.util.Iterator;

@ObfuscatedName("hr")
public class class227 implements Iterator {

    @ObfuscatedName("hr.c")
    public class228 field2663;

    @ObfuscatedName("hr.i")
    public class219 field2664;

    @ObfuscatedName("hr.o")
    public class219 field2665 = null;

    public class227(class228 arg0) {
        this.field2663 = arg0;
        this.field2664 = this.field2663.field2667.field2649;
        this.field2665 = null;
    }

    public Object next() {
        class219 var1 = this.field2664;
        if (this.field2663.field2667 == var1) {
            var1 = null;
            this.field2664 = null;
        } else {
            this.field2664 = var1.field2649;
        }
        this.field2665 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2663.field2667 != this.field2664;
    }

    public void remove() {
        if (this.field2665 == null) {
            throw new IllegalStateException();
        }
        this.field2665.method3747();
        this.field2665 = null;
    }
}
