package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class184 implements Iterator {

    @ObfuscatedName("ge.g")
    public class181 field2874;

    @ObfuscatedName("ge.s")
    public class187 field2875;

    @ObfuscatedName("ge.v")
    public class187 field2876 = null;

    public class184(class181 arg0) {
        this.field2874 = arg0;
        this.field2875 = this.field2874.field2870.field2883;
        this.field2876 = null;
    }

    public Object next() {
        class187 var1 = this.field2875;
        if (this.field2874.field2870 == var1) {
            var1 = null;
            this.field2875 = null;
        } else {
            this.field2875 = var1.field2883;
        }
        this.field2876 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2874.field2870 != this.field2875;
    }

    public void remove() {
        if (this.field2876 == null) {
            throw new IllegalStateException();
        }
        this.field2876.method3285();
        this.field2876 = null;
    }
}
