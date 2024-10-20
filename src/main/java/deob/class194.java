package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class194 implements Iterator {

    @ObfuscatedName("ga.i")
    public class198 field3068;

    @ObfuscatedName("ga.v")
    public class208 field3070;

    @ObfuscatedName("ga.r")
    public int field3069;

    @ObfuscatedName("ga.n")
    public class208 field3071 = null;

    public class194(class198 arg0) {
        this.field3068 = arg0;
        this.method3485();
    }

    @ObfuscatedName("ga.i()V")
    public void method3485() {
        this.field3070 = this.field3068.field3081[0].field3099;
        this.field3069 = 1;
        this.field3071 = null;
    }

    public Object next() {
        if (this.field3068.field3081[this.field3069 - 1] != this.field3070) {
            class208 var1 = this.field3070;
            this.field3070 = var1.field3099;
            this.field3071 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3069 >= this.field3068.field3080) {
                return null;
            }
            var2 = this.field3068.field3081[this.field3069++].field3099;
        } while (this.field3068.field3081[this.field3069 - 1] == var2);
        this.field3070 = var2.field3099;
        this.field3071 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3068.field3081[this.field3069 - 1] != this.field3070) {
            return true;
        }
        while (this.field3069 < this.field3068.field3080) {
            if (this.field3068.field3081[this.field3069++].field3099 != this.field3068.field3081[this.field3069 - 1]) {
                this.field3070 = this.field3068.field3081[this.field3069 - 1].field3099;
                return true;
            }
            this.field3070 = this.field3068.field3081[this.field3069 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3071 == null) {
            throw new IllegalStateException();
        }
        this.field3071.method3626();
        this.field3071 = null;
    }
}
