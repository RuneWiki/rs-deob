package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class198 implements Iterator {

    @ObfuscatedName("gk.p")
    public class187 field2496;

    @ObfuscatedName("gk.m")
    public class193 field2494;

    @ObfuscatedName("gk.e")
    public int field2495;

    @ObfuscatedName("gk.t")
    public class193 field2493 = null;

    public class198(class187 arg0) {
        this.field2496 = arg0;
        this.method3299();
    }

    @ObfuscatedName("gk.o()V")
    public void method3299() {
        this.field2494 = this.field2496.field2462[0].field2484;
        this.field2495 = 1;
        this.field2493 = null;
    }

    public Object next() {
        if (this.field2496.field2462[this.field2495 - 1] != this.field2494) {
            class193 var1 = this.field2494;
            this.field2494 = var1.field2484;
            this.field2493 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2495 >= this.field2496.field2461) {
                return null;
            }
            var2 = this.field2496.field2462[this.field2495++].field2484;
        } while (this.field2496.field2462[this.field2495 - 1] == var2);
        this.field2494 = var2.field2484;
        this.field2493 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2496.field2462[this.field2495 - 1] != this.field2494) {
            return true;
        }
        while (this.field2495 < this.field2496.field2461) {
            if (this.field2496.field2462[this.field2495++].field2484 != this.field2496.field2462[this.field2495 - 1]) {
                this.field2494 = this.field2496.field2462[this.field2495 - 1].field2484;
                return true;
            }
            this.field2494 = this.field2496.field2462[this.field2495 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2493 == null) {
            throw new IllegalStateException();
        }
        this.field2493.method3234();
        this.field2493 = null;
    }
}
