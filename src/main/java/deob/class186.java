package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class186 implements Iterator {

    @ObfuscatedName("gq.f")
    public class183 field2875;

    @ObfuscatedName("gq.k")
    public class189 field2876;

    @ObfuscatedName("gq.y")
    public class189 field2874 = null;

    public class186(class183 arg0) {
        this.field2875 = arg0;
        this.field2876 = this.field2875.field2870.field2883;
        this.field2874 = null;
    }

    public Object next() {
        class189 var1 = this.field2876;
        if (this.field2875.field2870 == var1) {
            var1 = null;
            this.field2876 = null;
        } else {
            this.field2876 = var1.field2883;
        }
        this.field2874 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2875.field2870 != this.field2876;
    }

    public void remove() {
        if (this.field2874 == null) {
            throw new IllegalStateException();
        }
        this.field2874.method3367();
        this.field2874 = null;
    }
}
