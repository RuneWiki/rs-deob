package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class194 implements Iterator {

    @ObfuscatedName("gf.y")
    public class198 field3061;

    @ObfuscatedName("gf.d")
    public class208 field3062;

    @ObfuscatedName("gf.g")
    public int field3060;

    @ObfuscatedName("gf.w")
    public class208 field3063 = null;

    public class194(class198 arg0) {
        this.field3061 = arg0;
        this.method3438();
    }

    @ObfuscatedName("gf.y()V")
    public void method3438() {
        this.field3062 = this.field3061.field3073[0].field3092;
        this.field3060 = 1;
        this.field3063 = null;
    }

    public Object next() {
        if (this.field3061.field3073[this.field3060 - 1] != this.field3062) {
            class208 var1 = this.field3062;
            this.field3062 = var1.field3092;
            this.field3063 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3060 >= this.field3061.field3072) {
                return null;
            }
            var2 = this.field3061.field3073[this.field3060++].field3092;
        } while (this.field3061.field3073[this.field3060 - 1] == var2);
        this.field3062 = var2.field3092;
        this.field3063 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3061.field3073[this.field3060 - 1] != this.field3062) {
            return true;
        }
        while (this.field3060 < this.field3061.field3072) {
            if (this.field3061.field3073[this.field3060++].field3092 != this.field3061.field3073[this.field3060 - 1]) {
                this.field3062 = this.field3061.field3073[this.field3060 - 1].field3092;
                return true;
            }
            this.field3062 = this.field3061.field3073[this.field3060 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3063 == null) {
            throw new IllegalStateException();
        }
        this.field3063.method3588();
        this.field3063 = null;
    }
}
