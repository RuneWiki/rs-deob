package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class186 implements Iterator {

    @ObfuscatedName("gq.e")
    public class183 field2886;

    @ObfuscatedName("gq.v")
    public class189 field2887;

    @ObfuscatedName("gq.k")
    public class189 field2888 = null;

    public class186(class183 arg0) {
        this.field2886 = arg0;
        this.field2887 = this.field2886.field2882.field2895;
        this.field2888 = null;
    }

    public Object next() {
        class189 var1 = this.field2887;
        if (this.field2886.field2882 == var1) {
            var1 = null;
            this.field2887 = null;
        } else {
            this.field2887 = var1.field2895;
        }
        this.field2888 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2886.field2882 != this.field2887;
    }

    public void remove() {
        if (this.field2888 == null) {
            throw new IllegalStateException();
        }
        this.field2888.method3324();
        this.field2888 = null;
    }
}
