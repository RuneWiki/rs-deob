package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class205 implements Iterator {

    @ObfuscatedName("gh.n")
    public class202 field3089;

    @ObfuscatedName("gh.d")
    public class208 field3090;

    @ObfuscatedName("gh.s")
    public class208 field3088 = null;

    public class205(class202 arg0) {
        this.field3089 = arg0;
        this.field3090 = this.field3089.field3084.field3097;
        this.field3088 = null;
    }

    public Object next() {
        class208 var1 = this.field3090;
        if (this.field3089.field3084 == var1) {
            var1 = null;
            this.field3090 = null;
        } else {
            this.field3090 = var1.field3097;
        }
        this.field3088 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3089.field3084 != this.field3090;
    }

    public void remove() {
        if (this.field3088 == null) {
            throw new IllegalStateException();
        }
        this.field3088.method3651();
        this.field3088 = null;
    }
}
