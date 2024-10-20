package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class194 implements Iterator {

    @ObfuscatedName("gw.v")
    public class198 field3084;

    @ObfuscatedName("gw.f")
    public class208 field3083;

    @ObfuscatedName("gw.i")
    public int field3085;

    @ObfuscatedName("gw.d")
    public class208 field3086 = null;

    public class194(class198 arg0) {
        this.field3084 = arg0;
        this.method3511();
    }

    @ObfuscatedName("gw.v()V")
    public void method3511() {
        this.field3083 = this.field3084.field3095[0].field3116;
        this.field3085 = 1;
        this.field3086 = null;
    }

    public Object next() {
        if (this.field3084.field3095[this.field3085 - 1] != this.field3083) {
            class208 var1 = this.field3083;
            this.field3083 = var1.field3116;
            this.field3086 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3085 >= this.field3084.field3097) {
                return null;
            }
            var2 = this.field3084.field3095[this.field3085++].field3116;
        } while (this.field3084.field3095[this.field3085 - 1] == var2);
        this.field3083 = var2.field3116;
        this.field3086 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3084.field3095[this.field3085 - 1] != this.field3083) {
            return true;
        }
        while (this.field3085 < this.field3084.field3097) {
            if (this.field3084.field3095[this.field3085++].field3116 != this.field3084.field3095[this.field3085 - 1]) {
                this.field3083 = this.field3084.field3095[this.field3085 - 1].field3116;
                return true;
            }
            this.field3083 = this.field3084.field3095[this.field3085 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3086 == null) {
            throw new IllegalStateException();
        }
        this.field3086.method3645();
        this.field3086 = null;
    }
}
