package deob;

import java.util.Iterator;

@ObfuscatedName("hd")
public class class209 implements Iterator {

    @ObfuscatedName("hd.p")
    public class198 field2572;

    @ObfuscatedName("hd.i")
    public class204 field2574;

    @ObfuscatedName("hd.w")
    public int field2573;

    @ObfuscatedName("hd.s")
    public class204 field2575 = null;

    public class209(class198 arg0) {
        this.field2572 = arg0;
        this.method3629();
    }

    @ObfuscatedName("hd.h()V")
    public void method3629() {
        this.field2574 = this.field2572.field2541[0].field2562;
        this.field2573 = 1;
        this.field2575 = null;
    }

    public Object next() {
        if (this.field2572.field2541[this.field2573 - 1] != this.field2574) {
            class204 var1 = this.field2574;
            this.field2574 = var1.field2562;
            this.field2575 = var1;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2573 >= this.field2572.field2544) {
                return null;
            }
            var2 = this.field2572.field2541[this.field2573++].field2562;
        } while (this.field2572.field2541[this.field2573 - 1] == var2);
        this.field2574 = var2.field2562;
        this.field2575 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2572.field2541[this.field2573 - 1] != this.field2574) {
            return true;
        }
        while (this.field2573 < this.field2572.field2544) {
            if (this.field2572.field2541[this.field2573++].field2562 != this.field2572.field2541[this.field2573 - 1]) {
                this.field2574 = this.field2572.field2541[this.field2573 - 1].field2562;
                return true;
            }
            this.field2574 = this.field2572.field2541[this.field2573 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2575 == null) {
            throw new IllegalStateException();
        }
        this.field2575.method3561();
        this.field2575 = null;
    }
}
