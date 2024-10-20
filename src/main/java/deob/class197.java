package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class197 implements Iterator {

    @ObfuscatedName("gk.n")
    public class191 field3013;

    @ObfuscatedName("gk.g")
    public class195 field3012;

    @ObfuscatedName("gk.a")
    public class195 field3014 = null;

    public class197(class191 arg0) {
        this.field3013 = arg0;
        this.field3012 = this.field3013.field3003.field3008;
        this.field3014 = null;
    }

    public Object next() {
        class195 var1 = this.field3012;
        if (this.field3013.field3003 == var1) {
            var1 = null;
            this.field3012 = null;
        } else {
            this.field3012 = var1.field3008;
        }
        this.field3014 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3013.field3003 != this.field3012;
    }

    public void remove() {
        if (this.field3014 == null) {
            throw new IllegalStateException();
        }
        this.field3014.method3527();
        this.field3014 = null;
    }
}
