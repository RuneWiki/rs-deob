package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class189 implements Iterator {

    @ObfuscatedName("gj.c")
    public class192 field2422;

    @ObfuscatedName("gj.o")
    public class193 field2423;

    @ObfuscatedName("gj.i")
    public class193 field2424 = null;

    public class189(class192 arg0) {
        this.field2422 = arg0;
        this.field2423 = this.field2422.field2436.field2438;
        this.field2424 = null;
    }

    public Object next() {
        class193 var1 = this.field2423;
        if (this.field2422.field2436 == var1) {
            var1 = null;
            this.field2423 = null;
        } else {
            this.field2423 = var1.field2438;
        }
        this.field2424 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2422.field2436 != this.field2423;
    }

    public void remove() {
        if (this.field2424 == null) {
            throw new IllegalStateException();
        }
        this.field2424.method3287();
        this.field2424 = null;
    }
}
