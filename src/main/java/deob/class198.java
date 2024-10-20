package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class198 implements Iterator {

    @ObfuscatedName("gp.x")
    public class202 field3143;

    @ObfuscatedName("gp.r")
    public class212 field3142;

    @ObfuscatedName("gp.j")
    public int field3144;

    @ObfuscatedName("gp.z")
    public class212 field3141 = null;

    public class198(class202 arg0) {
        this.field3143 = arg0;
        this.method3549();
    }

    @ObfuscatedName("gp.x()V")
    public void method3549() {
        this.field3142 = this.field3143.field3153[0].field3175;
        this.field3144 = 1;
        this.field3141 = null;
    }

    public Object next() {
        if (this.field3143.field3153[this.field3144 - 1] != this.field3142) {
            class212 var1 = this.field3142;
            this.field3142 = var1.field3175;
            this.field3141 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3144 >= this.field3143.field3155) {
                return null;
            }
            var2 = this.field3143.field3153[this.field3144++].field3175;
        } while (this.field3143.field3153[this.field3144 - 1] == var2);
        this.field3142 = var2.field3175;
        this.field3141 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3143.field3153[this.field3144 - 1] != this.field3142) {
            return true;
        }
        while (this.field3144 < this.field3143.field3155) {
            if (this.field3143.field3153[this.field3144++].field3175 != this.field3143.field3153[this.field3144 - 1]) {
                this.field3142 = this.field3143.field3153[this.field3144 - 1].field3175;
                return true;
            }
            this.field3142 = this.field3143.field3153[this.field3144 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3141 == null) {
            throw new IllegalStateException();
        }
        this.field3141.method3695();
        this.field3141 = null;
    }
}
