package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class194 implements Iterator {

    @ObfuscatedName("gp.n")
    public class198 field3068;

    @ObfuscatedName("gp.d")
    public class208 field3065;

    @ObfuscatedName("gp.s")
    public int field3067;

    @ObfuscatedName("gp.q")
    public class208 field3066 = null;

    public class194(class198 arg0) {
        this.field3068 = arg0;
        this.method3492();
    }

    @ObfuscatedName("gp.n()V")
    public void method3492() {
        this.field3065 = this.field3068.field3077[0].field3097;
        this.field3067 = 1;
        this.field3066 = null;
    }

    public Object next() {
        if (this.field3068.field3077[this.field3067 - 1] != this.field3065) {
            class208 var1 = this.field3065;
            this.field3065 = var1.field3097;
            this.field3066 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3067 >= this.field3068.field3078) {
                return null;
            }
            var2 = this.field3068.field3077[this.field3067++].field3097;
        } while (this.field3068.field3077[this.field3067 - 1] == var2);
        this.field3065 = var2.field3097;
        this.field3066 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3068.field3077[this.field3067 - 1] != this.field3065) {
            return true;
        }
        while (this.field3067 < this.field3068.field3078) {
            if (this.field3068.field3077[this.field3067++].field3097 != this.field3068.field3077[this.field3067 - 1]) {
                this.field3065 = this.field3068.field3077[this.field3067 - 1].field3097;
                return true;
            }
            this.field3065 = this.field3068.field3077[this.field3067 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3066 == null) {
            throw new IllegalStateException();
        }
        this.field3066.method3651();
        this.field3066 = null;
    }
}
