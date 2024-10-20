package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class205 implements Iterator {

    @ObfuscatedName("gg.o")
    public class202 field3105;

    @ObfuscatedName("gg.e")
    public class208 field3103;

    @ObfuscatedName("gg.u")
    public class208 field3104 = null;

    public class205(class202 arg0) {
        this.field3105 = arg0;
        this.field3103 = this.field3105.field3099.field3112;
        this.field3104 = null;
    }

    public Object next() {
        class208 var1 = this.field3103;
        if (this.field3105.field3099 == var1) {
            var1 = null;
            this.field3103 = null;
        } else {
            this.field3103 = var1.field3112;
        }
        this.field3104 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3105.field3099 != this.field3103;
    }

    public void remove() {
        if (this.field3104 == null) {
            throw new IllegalStateException();
        }
        this.field3104.method3670();
        this.field3104 = null;
    }
}
