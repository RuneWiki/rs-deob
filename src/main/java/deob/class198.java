package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class198 implements Iterator {

    @ObfuscatedName("gr.a")
    public class187 field2476;

    @ObfuscatedName("gr.j")
    public class193 field2477;

    @ObfuscatedName("gr.n")
    public int field2478;

    @ObfuscatedName("gr.r")
    public class193 field2479 = null;

    public class198(class187 arg0) {
        this.field2476 = arg0;
        this.method3368();
    }

    @ObfuscatedName("gr.u()V")
    public void method3368() {
        this.field2477 = this.field2476.field2445[0].field2466;
        this.field2478 = 1;
        this.field2479 = null;
    }

    public Object next() {
        if (this.field2476.field2445[this.field2478 - 1] != this.field2477) {
            class193 var1 = this.field2477;
            this.field2477 = var1.field2466;
            this.field2479 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2478 >= this.field2476.field2447) {
                return null;
            }
            var2 = this.field2476.field2445[this.field2478++].field2466;
        } while (this.field2476.field2445[this.field2478 - 1] == var2);
        this.field2477 = var2.field2466;
        this.field2479 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2476.field2445[this.field2478 - 1] != this.field2477) {
            return true;
        }
        while (this.field2478 < this.field2476.field2447) {
            if (this.field2476.field2445[this.field2478++].field2466 != this.field2476.field2445[this.field2478 - 1]) {
                this.field2477 = this.field2476.field2445[this.field2478 - 1].field2466;
                return true;
            }
            this.field2477 = this.field2476.field2445[this.field2478 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2479 == null) {
            throw new IllegalStateException();
        }
        this.field2479.method3308();
        this.field2479 = null;
    }
}
