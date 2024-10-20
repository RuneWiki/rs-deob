package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class198 implements Iterator {

    @ObfuscatedName("gv.n")
    public class187 field2496;

    @ObfuscatedName("gv.p")
    public class193 field2494;

    @ObfuscatedName("gv.i")
    public int field2493;

    @ObfuscatedName("gv.j")
    public class193 field2495 = null;

    public class198(class187 arg0) {
        this.field2496 = arg0;
        this.method3407();
    }

    @ObfuscatedName("gv.e()V")
    public void method3407() {
        this.field2494 = this.field2496.field2464[0].field2482;
        this.field2493 = 1;
        this.field2495 = null;
    }

    public Object next() {
        if (this.field2496.field2464[this.field2493 - 1] != this.field2494) {
            class193 var1 = this.field2494;
            this.field2494 = var1.field2482;
            this.field2495 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2493 >= this.field2496.field2461) {
                return null;
            }
            var2 = this.field2496.field2464[this.field2493++].field2482;
        } while (this.field2496.field2464[this.field2493 - 1] == var2);
        this.field2494 = var2.field2482;
        this.field2495 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2496.field2464[this.field2493 - 1] != this.field2494) {
            return true;
        }
        while (this.field2493 < this.field2496.field2461) {
            if (this.field2496.field2464[this.field2493++].field2482 != this.field2496.field2464[this.field2493 - 1]) {
                this.field2494 = this.field2496.field2464[this.field2493 - 1].field2482;
                return true;
            }
            this.field2494 = this.field2496.field2464[this.field2493 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2495 == null) {
            throw new IllegalStateException();
        }
        this.field2495.method3347();
        this.field2495 = null;
    }
}
