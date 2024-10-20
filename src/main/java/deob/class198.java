package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class198 implements Iterator {

    @ObfuscatedName("gb.d")
    public class187 field2453;

    @ObfuscatedName("gb.q")
    public class193 field2451;

    @ObfuscatedName("gb.x")
    public int field2452;

    @ObfuscatedName("gb.y")
    public class193 field2450 = null;

    public class198(class187 arg0) {
        this.field2453 = arg0;
        this.method3365();
    }

    @ObfuscatedName("gb.f()V")
    public void method3365() {
        this.field2451 = this.field2453.field2419[0].field2440;
        this.field2452 = 1;
        this.field2450 = null;
    }

    public Object next() {
        if (this.field2453.field2419[this.field2452 - 1] != this.field2451) {
            class193 var1 = this.field2451;
            this.field2451 = var1.field2440;
            this.field2450 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2452 >= this.field2453.field2420) {
                return null;
            }
            var2 = this.field2453.field2419[this.field2452++].field2440;
        } while (this.field2453.field2419[this.field2452 - 1] == var2);
        this.field2451 = var2.field2440;
        this.field2450 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2453.field2419[this.field2452 - 1] != this.field2451) {
            return true;
        }
        while (this.field2452 < this.field2453.field2420) {
            if (this.field2453.field2419[this.field2452++].field2440 != this.field2453.field2419[this.field2452 - 1]) {
                this.field2451 = this.field2453.field2419[this.field2452 - 1].field2440;
                return true;
            }
            this.field2451 = this.field2453.field2419[this.field2452 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2450 == null) {
            throw new IllegalStateException();
        }
        this.field2450.method3312();
        this.field2450 = null;
    }
}
