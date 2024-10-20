package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class184 implements Iterator {

    @ObfuscatedName("gq.n")
    public class181 field2878;

    @ObfuscatedName("gq.x")
    public class187 field2879;

    @ObfuscatedName("gq.k")
    public class187 field2880 = null;

    public class184(class181 arg0) {
        this.field2878 = arg0;
        this.field2879 = this.field2878.field2874.field2887;
        this.field2880 = null;
    }

    public Object next() {
        class187 var1 = this.field2879;
        if (this.field2878.field2874 == var1) {
            var1 = null;
            this.field2879 = null;
        } else {
            this.field2879 = var1.field2887;
        }
        this.field2880 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2878.field2874 != this.field2879;
    }

    public void remove() {
        if (this.field2880 == null) {
            throw new IllegalStateException();
        }
        this.field2880.method3277();
        this.field2880 = null;
    }
}
