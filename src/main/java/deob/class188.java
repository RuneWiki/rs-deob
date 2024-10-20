package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class188 implements Iterator {

    @ObfuscatedName("gp.j")
    public class192 field3015;

    @ObfuscatedName("gp.y")
    public class202 field3012;

    @ObfuscatedName("gp.z")
    public int field3013;

    @ObfuscatedName("gp.l")
    public class202 field3014 = null;

    public class188(class192 arg0) {
        this.field3015 = arg0;
        this.method3446();
    }

    @ObfuscatedName("gp.j()V")
    public void method3446() {
        this.field3012 = this.field3015.field3024[0].field3044;
        this.field3013 = 1;
        this.field3014 = null;
    }

    public Object next() {
        if (this.field3015.field3024[this.field3013 - 1] != this.field3012) {
            class202 var1 = this.field3012;
            this.field3012 = var1.field3044;
            this.field3014 = var1;
            return var1;
        }
        class202 var2;
        do {
            if (this.field3013 >= this.field3015.field3026) {
                return null;
            }
            var2 = this.field3015.field3024[this.field3013++].field3044;
        } while (this.field3015.field3024[this.field3013 - 1] == var2);
        this.field3012 = var2.field3044;
        this.field3014 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3015.field3024[this.field3013 - 1] != this.field3012) {
            return true;
        }
        while (this.field3013 < this.field3015.field3026) {
            if (this.field3015.field3024[this.field3013++].field3044 != this.field3015.field3024[this.field3013 - 1]) {
                this.field3012 = this.field3015.field3024[this.field3013 - 1].field3044;
                return true;
            }
            this.field3012 = this.field3015.field3024[this.field3013 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3014 == null) {
            throw new IllegalStateException();
        }
        this.field3014.method3563();
        this.field3014 = null;
    }
}
