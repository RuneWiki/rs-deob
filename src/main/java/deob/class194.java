package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class194 implements Iterator {

    @ObfuscatedName("gi.k")
    public class198 field3078;

    @ObfuscatedName("gi.h")
    public class208 field3079;

    @ObfuscatedName("gi.o")
    public int field3080;

    @ObfuscatedName("gi.z")
    public class208 field3081 = null;

    public class194(class198 arg0) {
        this.field3078 = arg0;
        this.method3521();
    }

    @ObfuscatedName("gi.k()V")
    public void method3521() {
        this.field3079 = this.field3078.field3092[0].field3110;
        this.field3080 = 1;
        this.field3081 = null;
    }

    public Object next() {
        if (this.field3078.field3092[this.field3080 - 1] != this.field3079) {
            class208 var1 = this.field3079;
            this.field3079 = var1.field3110;
            this.field3081 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3080 >= this.field3078.field3091) {
                return null;
            }
            var2 = this.field3078.field3092[this.field3080++].field3110;
        } while (this.field3078.field3092[this.field3080 - 1] == var2);
        this.field3079 = var2.field3110;
        this.field3081 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3078.field3092[this.field3080 - 1] != this.field3079) {
            return true;
        }
        while (this.field3080 < this.field3078.field3091) {
            if (this.field3078.field3092[this.field3080++].field3110 != this.field3078.field3092[this.field3080 - 1]) {
                this.field3079 = this.field3078.field3092[this.field3080 - 1].field3110;
                return true;
            }
            this.field3079 = this.field3078.field3092[this.field3080 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3081 == null) {
            throw new IllegalStateException();
        }
        this.field3081.method3679();
        this.field3081 = null;
    }
}
