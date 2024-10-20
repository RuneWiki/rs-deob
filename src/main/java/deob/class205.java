package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class205 implements Iterator {

    @ObfuscatedName("gf.m")
    public class194 field2576;

    @ObfuscatedName("gf.p")
    public class200 field2574;

    @ObfuscatedName("gf.i")
    public int field2575;

    @ObfuscatedName("gf.j")
    public class200 field2573 = null;

    public class205(class194 arg0) {
        this.field2576 = arg0;
        this.method3530();
    }

    @ObfuscatedName("gf.e()V")
    public void method3530() {
        this.field2574 = this.field2576.field2545[0].field2562;
        this.field2575 = 1;
        this.field2573 = null;
    }

    public Object next() {
        if (this.field2576.field2545[this.field2575 - 1] != this.field2574) {
            class200 var1 = this.field2574;
            this.field2574 = var1.field2562;
            this.field2573 = var1;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2575 >= this.field2576.field2541) {
                return null;
            }
            var2 = this.field2576.field2545[this.field2575++].field2562;
        } while (this.field2576.field2545[this.field2575 - 1] == var2);
        this.field2574 = var2.field2562;
        this.field2573 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2576.field2545[this.field2575 - 1] != this.field2574) {
            return true;
        }
        while (this.field2575 < this.field2576.field2541) {
            if (this.field2576.field2545[this.field2575++].field2562 != this.field2576.field2545[this.field2575 - 1]) {
                this.field2574 = this.field2576.field2545[this.field2575 - 1].field2562;
                return true;
            }
            this.field2574 = this.field2576.field2545[this.field2575 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2573 == null) {
            throw new IllegalStateException();
        }
        this.field2573.method3476();
        this.field2573 = null;
    }
}
