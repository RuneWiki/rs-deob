package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class194 implements Iterator {

    @ObfuscatedName("gg.c")
    public class198 field3068;

    @ObfuscatedName("gg.h")
    public class208 field3066;

    @ObfuscatedName("gg.k")
    public int field3065;

    @ObfuscatedName("gg.t")
    public class208 field3067 = null;

    public class194(class198 arg0) {
        this.field3068 = arg0;
        this.method3499();
    }

    @ObfuscatedName("gg.c()V")
    public void method3499() {
        this.field3066 = this.field3068.field3078[0].field3097;
        this.field3065 = 1;
        this.field3067 = null;
    }

    public Object next() {
        if (this.field3068.field3078[this.field3065 - 1] != this.field3066) {
            class208 var1 = this.field3066;
            this.field3066 = var1.field3097;
            this.field3067 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3065 >= this.field3068.field3079) {
                return null;
            }
            var2 = this.field3068.field3078[this.field3065++].field3097;
        } while (this.field3068.field3078[this.field3065 - 1] == var2);
        this.field3066 = var2.field3097;
        this.field3067 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3068.field3078[this.field3065 - 1] != this.field3066) {
            return true;
        }
        while (this.field3065 < this.field3068.field3079) {
            if (this.field3068.field3078[this.field3065++].field3097 != this.field3068.field3078[this.field3065 - 1]) {
                this.field3066 = this.field3068.field3078[this.field3065 - 1].field3097;
                return true;
            }
            this.field3066 = this.field3068.field3078[this.field3065 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3067 == null) {
            throw new IllegalStateException();
        }
        this.field3067.method3646();
        this.field3067 = null;
    }
}
