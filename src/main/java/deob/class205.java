package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class205 implements Iterator {

    @ObfuscatedName("gn.c")
    public class202 field3090;

    @ObfuscatedName("gn.h")
    public class208 field3089;

    @ObfuscatedName("gn.k")
    public class208 field3088 = null;

    public class205(class202 arg0) {
        this.field3090 = arg0;
        this.field3089 = this.field3090.field3084.field3097;
        this.field3088 = null;
    }

    public Object next() {
        class208 var1 = this.field3089;
        if (this.field3090.field3084 == var1) {
            var1 = null;
            this.field3089 = null;
        } else {
            this.field3089 = var1.field3097;
        }
        this.field3088 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3090.field3084 != this.field3089;
    }

    public void remove() {
        if (this.field3088 == null) {
            throw new IllegalStateException();
        }
        this.field3088.method3646();
        this.field3088 = null;
    }
}
