package deob;

import java.util.Iterator;

@ObfuscatedName("hj")
public class class211 implements Iterator {

    @ObfuscatedName("hj.w")
    public class198 field2461;

    @ObfuscatedName("hj.m")
    public class205 field2462;

    @ObfuscatedName("hj.q")
    public int field2464;

    @ObfuscatedName("hj.b")
    public class205 field2463 = null;

    public class211(class198 arg0) {
        this.field2461 = arg0;
        this.method3835();
    }

    @ObfuscatedName("hj.l()V")
    public void method3835() {
        this.field2462 = this.field2461.field2424[0].field2448;
        this.field2464 = 1;
        this.field2463 = null;
    }

    public Object next() {
        if (this.field2461.field2424[this.field2464 - 1] != this.field2462) {
            class205 var1 = this.field2462;
            this.field2462 = var1.field2448;
            this.field2463 = var1;
            return var1;
        }
        class205 var2;
        do {
            if (this.field2464 >= this.field2461.field2427) {
                return null;
            }
            var2 = this.field2461.field2424[this.field2464++].field2448;
        } while (this.field2461.field2424[this.field2464 - 1] == var2);
        this.field2462 = var2.field2448;
        this.field2463 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2461.field2424[this.field2464 - 1] != this.field2462) {
            return true;
        }
        while (this.field2464 < this.field2461.field2427) {
            if (this.field2461.field2424[this.field2464++].field2448 != this.field2461.field2424[this.field2464 - 1]) {
                this.field2462 = this.field2461.field2424[this.field2464 - 1].field2448;
                return true;
            }
            this.field2462 = this.field2461.field2424[this.field2464 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2463 == null) {
            throw new IllegalStateException();
        }
        this.field2463.method3782();
        this.field2463 = null;
    }
}
