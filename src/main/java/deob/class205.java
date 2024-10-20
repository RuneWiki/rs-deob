package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class205 implements Iterator {

    @ObfuscatedName("gx.j")
    public class202 field3103;

    @ObfuscatedName("gx.l")
    public class208 field3104;

    @ObfuscatedName("gx.a")
    public class208 field3105 = null;

    public class205(class202 arg0) {
        this.field3103 = arg0;
        this.field3104 = this.field3103.field3099.field3112;
        this.field3105 = null;
    }

    public Object next() {
        class208 var1 = this.field3104;
        if (this.field3103.field3099 == var1) {
            var1 = null;
            this.field3104 = null;
        } else {
            this.field3104 = var1.field3112;
        }
        this.field3105 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3103.field3099 != this.field3104;
    }

    public void remove() {
        if (this.field3105 == null) {
            throw new IllegalStateException();
        }
        this.field3105.method3608();
        this.field3105 = null;
    }
}
