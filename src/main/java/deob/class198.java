package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class198 implements Iterator {

    @ObfuscatedName("gp.i")
    public class202 field3142;

    @ObfuscatedName("gp.h")
    public class212 field3143;

    @ObfuscatedName("gp.e")
    public int field3144;

    @ObfuscatedName("gp.g")
    public class212 field3145 = null;

    public class198(class202 arg0) {
        this.field3142 = arg0;
        this.method3544();
    }

    @ObfuscatedName("gp.i()V")
    public void method3544() {
        this.field3143 = this.field3142.field3154[0].field3174;
        this.field3144 = 1;
        this.field3145 = null;
    }

    public Object next() {
        if (this.field3142.field3154[this.field3144 - 1] != this.field3143) {
            class212 var1 = this.field3143;
            this.field3143 = var1.field3174;
            this.field3145 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3144 >= this.field3142.field3155) {
                return null;
            }
            var2 = this.field3142.field3154[this.field3144++].field3174;
        } while (this.field3142.field3154[this.field3144 - 1] == var2);
        this.field3143 = var2.field3174;
        this.field3145 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3142.field3154[this.field3144 - 1] != this.field3143) {
            return true;
        }
        while (this.field3144 < this.field3142.field3155) {
            if (this.field3142.field3154[this.field3144++].field3174 != this.field3142.field3154[this.field3144 - 1]) {
                this.field3143 = this.field3142.field3154[this.field3144 - 1].field3174;
                return true;
            }
            this.field3143 = this.field3142.field3154[this.field3144 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3145 == null) {
            throw new IllegalStateException();
        }
        this.field3145.method3706();
        this.field3145 = null;
    }
}
