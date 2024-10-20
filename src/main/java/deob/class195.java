package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class195 implements Iterator {

    @ObfuscatedName("gs.t")
    public class199 field3097;

    @ObfuscatedName("gs.i")
    public class209 field3095;

    @ObfuscatedName("gs.g")
    public int field3096;

    @ObfuscatedName("gs.h")
    public class209 field3094 = null;

    public class195(class199 arg0) {
        this.field3097 = arg0;
        this.method3469();
    }

    @ObfuscatedName("gs.t()V")
    public void method3469() {
        this.field3095 = this.field3097.field3107[0].field3127;
        this.field3096 = 1;
        this.field3094 = null;
    }

    public Object next() {
        if (this.field3097.field3107[this.field3096 - 1] != this.field3095) {
            class209 var1 = this.field3095;
            this.field3095 = var1.field3127;
            this.field3094 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3096 >= this.field3097.field3106) {
                return null;
            }
            var2 = this.field3097.field3107[this.field3096++].field3127;
        } while (this.field3097.field3107[this.field3096 - 1] == var2);
        this.field3095 = var2.field3127;
        this.field3094 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3097.field3107[this.field3096 - 1] != this.field3095) {
            return true;
        }
        while (this.field3096 < this.field3097.field3106) {
            if (this.field3097.field3107[this.field3096++].field3127 != this.field3097.field3107[this.field3096 - 1]) {
                this.field3095 = this.field3097.field3107[this.field3096 - 1].field3127;
                return true;
            }
            this.field3095 = this.field3097.field3107[this.field3096 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3094 == null) {
            throw new IllegalStateException();
        }
        this.field3094.method3607();
        this.field3094 = null;
    }
}
