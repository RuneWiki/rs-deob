package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class205 implements Iterator {

    @ObfuscatedName("gf.z")
    public class202 field3094;

    @ObfuscatedName("gf.q")
    public class208 field3095;

    @ObfuscatedName("gf.k")
    public class208 field3093 = null;

    public class205(class202 arg0) {
        this.field3094 = arg0;
        this.field3095 = this.field3094.field3089.field3101;
        this.field3093 = null;
    }

    public Object next() {
        class208 var1 = this.field3095;
        if (this.field3094.field3089 == var1) {
            var1 = null;
            this.field3095 = null;
        } else {
            this.field3095 = var1.field3101;
        }
        this.field3093 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3094.field3089 != this.field3095;
    }

    public void remove() {
        if (this.field3093 == null) {
            throw new IllegalStateException();
        }
        this.field3093.method3583();
        this.field3093 = null;
    }
}
