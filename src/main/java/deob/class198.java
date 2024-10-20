package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class198 implements Iterator {

    @ObfuscatedName("gs.i")
    public class187 field2478;

    @ObfuscatedName("gs.h")
    public class193 field2479;

    @ObfuscatedName("gs.u")
    public int field2477;

    @ObfuscatedName("gs.q")
    public class193 field2480 = null;

    public class198(class187 arg0) {
        this.field2478 = arg0;
        this.method3417();
    }

    @ObfuscatedName("gs.a()V")
    public void method3417() {
        this.field2479 = this.field2478.field2446[0].field2468;
        this.field2477 = 1;
        this.field2480 = null;
    }

    public Object next() {
        if (this.field2478.field2446[this.field2477 - 1] != this.field2479) {
            class193 var1 = this.field2479;
            this.field2479 = var1.field2468;
            this.field2480 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2477 >= this.field2478.field2448) {
                return null;
            }
            var2 = this.field2478.field2446[this.field2477++].field2468;
        } while (this.field2478.field2446[this.field2477 - 1] == var2);
        this.field2479 = var2.field2468;
        this.field2480 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2478.field2446[this.field2477 - 1] != this.field2479) {
            return true;
        }
        while (this.field2477 < this.field2478.field2448) {
            if (this.field2478.field2446[this.field2477++].field2468 != this.field2478.field2446[this.field2477 - 1]) {
                this.field2479 = this.field2478.field2446[this.field2477 - 1].field2468;
                return true;
            }
            this.field2479 = this.field2478.field2446[this.field2477 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2480 == null) {
            throw new IllegalStateException();
        }
        this.field2480.method3364();
        this.field2480 = null;
    }
}
