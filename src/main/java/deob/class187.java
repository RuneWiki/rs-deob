package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class187 implements Iterator {

    @ObfuscatedName("gx.x")
    public class181 field2876;

    @ObfuscatedName("gx.v")
    public class185 field2875;

    @ObfuscatedName("gx.m")
    public class185 field2877 = null;

    public class187(class181 arg0) {
        this.field2876 = arg0;
        this.field2875 = this.field2876.field2866.field2870;
        this.field2877 = null;
    }

    public Object next() {
        class185 var1 = this.field2875;
        if (this.field2876.field2866 == var1) {
            var1 = null;
            this.field2875 = null;
        } else {
            this.field2875 = var1.field2870;
        }
        this.field2877 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2876.field2866 != this.field2875;
    }

    public void remove() {
        if (this.field2877 == null) {
            throw new IllegalStateException();
        }
        this.field2877.method3321();
        this.field2877 = null;
    }
}
