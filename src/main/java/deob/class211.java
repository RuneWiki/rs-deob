package deob;

import java.util.Iterator;

@ObfuscatedName("hf")
public class class211 implements Iterator {

    @ObfuscatedName("hf.z")
    public class198 field2438;

    @ObfuscatedName("hf.w")
    public class205 field2436;

    @ObfuscatedName("hf.s")
    public int field2437;

    @ObfuscatedName("hf.l")
    public class205 field2435 = null;

    public class211(class198 arg0) {
        this.field2438 = arg0;
        this.method3808();
    }

    @ObfuscatedName("hf.p()V")
    public void method3808() {
        this.field2436 = this.field2438.field2398[0].field2423;
        this.field2437 = 1;
        this.field2435 = null;
    }

    public Object next() {
        if (this.field2438.field2398[this.field2437 - 1] != this.field2436) {
            class205 var1 = this.field2436;
            this.field2436 = var1.field2423;
            this.field2435 = var1;
            return var1;
        }
        class205 var2;
        do {
            if (this.field2437 >= this.field2438.field2399) {
                return null;
            }
            var2 = this.field2438.field2398[this.field2437++].field2423;
        } while (this.field2438.field2398[this.field2437 - 1] == var2);
        this.field2436 = var2.field2423;
        this.field2435 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2438.field2398[this.field2437 - 1] != this.field2436) {
            return true;
        }
        while (this.field2437 < this.field2438.field2399) {
            if (this.field2438.field2398[this.field2437++].field2423 != this.field2438.field2398[this.field2437 - 1]) {
                this.field2436 = this.field2438.field2398[this.field2437 - 1].field2423;
                return true;
            }
            this.field2436 = this.field2438.field2398[this.field2437 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2435 == null) {
            throw new IllegalStateException();
        }
        this.field2435.method3756();
        this.field2435 = null;
    }
}
