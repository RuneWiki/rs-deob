package deob;

import java.util.Iterator;

@ObfuscatedName("hy")
public class class209 implements Iterator {

    @ObfuscatedName("hy.n")
    public class198 field2609;

    @ObfuscatedName("hy.v")
    public class204 field2607;

    @ObfuscatedName("hy.y")
    public int field2610;

    @ObfuscatedName("hy.r")
    public class204 field2608 = null;

    public class209(class198 arg0) {
        this.field2609 = arg0;
        this.method3532();
    }

    @ObfuscatedName("hy.b()V")
    public void method3532() {
        this.field2607 = this.field2609.field2576[0].field2598;
        this.field2610 = 1;
        this.field2608 = null;
    }

    public Object next() {
        if (this.field2609.field2576[this.field2610 - 1] != this.field2607) {
            class204 var1 = this.field2607;
            this.field2607 = var1.field2598;
            this.field2608 = var1;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2610 >= this.field2609.field2577) {
                return null;
            }
            var2 = this.field2609.field2576[this.field2610++].field2598;
        } while (this.field2609.field2576[this.field2610 - 1] == var2);
        this.field2607 = var2.field2598;
        this.field2608 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2609.field2576[this.field2610 - 1] != this.field2607) {
            return true;
        }
        while (this.field2610 < this.field2609.field2577) {
            if (this.field2609.field2576[this.field2610++].field2598 != this.field2609.field2576[this.field2610 - 1]) {
                this.field2607 = this.field2609.field2576[this.field2610 - 1].field2598;
                return true;
            }
            this.field2607 = this.field2609.field2576[this.field2610 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2608 == null) {
            throw new IllegalStateException();
        }
        this.field2608.method3474();
        this.field2608 = null;
    }
}
