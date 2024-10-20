package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class194 implements Iterator {

    @ObfuscatedName("gd.z")
    public class198 field3071;

    @ObfuscatedName("gd.q")
    public class208 field3072;

    @ObfuscatedName("gd.k")
    public int field3073;

    @ObfuscatedName("gd.f")
    public class208 field3070 = null;

    public class194(class198 arg0) {
        this.field3071 = arg0;
        this.method3442();
    }

    @ObfuscatedName("gd.z()V")
    public void method3442() {
        this.field3072 = this.field3071.field3083[0].field3101;
        this.field3073 = 1;
        this.field3070 = null;
    }

    public Object next() {
        if (this.field3071.field3083[this.field3073 - 1] != this.field3072) {
            class208 var1 = this.field3072;
            this.field3072 = var1.field3101;
            this.field3070 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3073 >= this.field3071.field3084) {
                return null;
            }
            var2 = this.field3071.field3083[this.field3073++].field3101;
        } while (this.field3071.field3083[this.field3073 - 1] == var2);
        this.field3072 = var2.field3101;
        this.field3070 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3071.field3083[this.field3073 - 1] != this.field3072) {
            return true;
        }
        while (this.field3073 < this.field3071.field3084) {
            if (this.field3071.field3083[this.field3073++].field3101 != this.field3071.field3083[this.field3073 - 1]) {
                this.field3072 = this.field3071.field3083[this.field3073 - 1].field3101;
                return true;
            }
            this.field3072 = this.field3071.field3083[this.field3073 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3070 == null) {
            throw new IllegalStateException();
        }
        this.field3070.method3583();
        this.field3070 = null;
    }
}
