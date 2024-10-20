package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class198 implements Iterator {

    @ObfuscatedName("gw.d")
    public class187 field2496;

    @ObfuscatedName("gw.k")
    public class193 field2497;

    @ObfuscatedName("gw.e")
    public int field2498;

    @ObfuscatedName("gw.p")
    public class193 field2499 = null;

    public class198(class187 arg0) {
        this.field2496 = arg0;
        this.method3472();
    }

    @ObfuscatedName("gw.s()V")
    public void method3472() {
        this.field2497 = this.field2496.field2465[0].field2485;
        this.field2498 = 1;
        this.field2499 = null;
    }

    public Object next() {
        if (this.field2496.field2465[this.field2498 - 1] != this.field2497) {
            class193 var1 = this.field2497;
            this.field2497 = var1.field2485;
            this.field2499 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2498 >= this.field2496.field2464) {
                return null;
            }
            var2 = this.field2496.field2465[this.field2498++].field2485;
        } while (this.field2496.field2465[this.field2498 - 1] == var2);
        this.field2497 = var2.field2485;
        this.field2499 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2496.field2465[this.field2498 - 1] != this.field2497) {
            return true;
        }
        while (this.field2498 < this.field2496.field2464) {
            if (this.field2496.field2465[this.field2498++].field2485 != this.field2496.field2465[this.field2498 - 1]) {
                this.field2497 = this.field2496.field2465[this.field2498 - 1].field2485;
                return true;
            }
            this.field2497 = this.field2496.field2465[this.field2498 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2499 == null) {
            throw new IllegalStateException();
        }
        this.field2499.method3407();
        this.field2499 = null;
    }
}
