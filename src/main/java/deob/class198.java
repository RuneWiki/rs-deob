package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class198 implements Iterator {

    @ObfuscatedName("gy.i")
    public class187 field2491;

    @ObfuscatedName("gy.c")
    public class193 field2492;

    @ObfuscatedName("gy.e")
    public int field2493;

    @ObfuscatedName("gy.v")
    public class193 field2494 = null;

    public class198(class187 arg0) {
        this.field2491 = arg0;
        this.method3335();
    }

    @ObfuscatedName("gy.h()V")
    public void method3335() {
        this.field2492 = this.field2491.field2463[0].field2481;
        this.field2493 = 1;
        this.field2494 = null;
    }

    public Object next() {
        if (this.field2491.field2463[this.field2493 - 1] != this.field2492) {
            class193 var1 = this.field2492;
            this.field2492 = var1.field2481;
            this.field2494 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2493 >= this.field2491.field2462) {
                return null;
            }
            var2 = this.field2491.field2463[this.field2493++].field2481;
        } while (this.field2491.field2463[this.field2493 - 1] == var2);
        this.field2492 = var2.field2481;
        this.field2494 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2491.field2463[this.field2493 - 1] != this.field2492) {
            return true;
        }
        while (this.field2493 < this.field2491.field2462) {
            if (this.field2491.field2463[this.field2493++].field2481 != this.field2491.field2463[this.field2493 - 1]) {
                this.field2492 = this.field2491.field2463[this.field2493 - 1].field2481;
                return true;
            }
            this.field2492 = this.field2491.field2463[this.field2493 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2494 == null) {
            throw new IllegalStateException();
        }
        this.field2494.method3278();
        this.field2494 = null;
    }
}
