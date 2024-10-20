package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class198 implements Iterator {

    @ObfuscatedName("gs.c")
    public class187 field2450;

    @ObfuscatedName("gs.o")
    public class193 field2449;

    @ObfuscatedName("gs.i")
    public int field2451;

    @ObfuscatedName("gs.u")
    public class193 field2448 = null;

    public class198(class187 arg0) {
        this.field2450 = arg0;
        this.method3341();
    }

    @ObfuscatedName("gs.k()V")
    public void method3341() {
        this.field2449 = this.field2450.field2417[0].field2438;
        this.field2451 = 1;
        this.field2448 = null;
    }

    public Object next() {
        if (this.field2450.field2417[this.field2451 - 1] != this.field2449) {
            class193 var1 = this.field2449;
            this.field2449 = var1.field2438;
            this.field2448 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2451 >= this.field2450.field2420) {
                return null;
            }
            var2 = this.field2450.field2417[this.field2451++].field2438;
        } while (this.field2450.field2417[this.field2451 - 1] == var2);
        this.field2449 = var2.field2438;
        this.field2448 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2450.field2417[this.field2451 - 1] != this.field2449) {
            return true;
        }
        while (this.field2451 < this.field2450.field2420) {
            if (this.field2450.field2417[this.field2451++].field2438 != this.field2450.field2417[this.field2451 - 1]) {
                this.field2449 = this.field2450.field2417[this.field2451 - 1].field2438;
                return true;
            }
            this.field2449 = this.field2450.field2417[this.field2451 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2448 == null) {
            throw new IllegalStateException();
        }
        this.field2448.method3287();
        this.field2448 = null;
    }
}
