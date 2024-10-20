package deob;

import java.util.Iterator;

@ObfuscatedName("ea")
public class class145 implements Iterator {

    @ObfuscatedName("ea.d")
    public class148 field2019;

    @ObfuscatedName("ea.c")
    public class149 field2018;

    @ObfuscatedName("ea.n")
    public class149 field2017 = null;

    public class145(class148 arg0) {
        this.field2019 = arg0;
        this.field2018 = this.field2019.field2031.field2032;
        this.field2017 = null;
    }

    public Object next() {
        class149 var1 = this.field2018;
        if (this.field2019.field2031 == var1) {
            var1 = null;
            this.field2018 = null;
        } else {
            this.field2018 = var1.field2032;
        }
        this.field2017 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2019.field2031 != this.field2018;
    }

    public void remove() {
        if (this.field2017 == null) {
            throw new IllegalStateException();
        }
        this.field2017.method2652();
        this.field2017 = null;
    }
}
