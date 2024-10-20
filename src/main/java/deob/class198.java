package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class198 implements Iterator {

    @ObfuscatedName("gj.i")
    public class187 field2487;

    @ObfuscatedName("gj.w")
    public class193 field2485;

    @ObfuscatedName("gj.a")
    public int field2486;

    @ObfuscatedName("gj.t")
    public class193 field2484 = null;

    public class198(class187 arg0) {
        this.field2487 = arg0;
        this.method3337();
    }

    @ObfuscatedName("gj.e()V")
    public void method3337() {
        this.field2485 = this.field2487.field2453[0].field2474;
        this.field2486 = 1;
        this.field2484 = null;
    }

    public Object next() {
        if (this.field2487.field2453[this.field2486 - 1] != this.field2485) {
            class193 var1 = this.field2485;
            this.field2485 = var1.field2474;
            this.field2484 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2486 >= this.field2487.field2456) {
                return null;
            }
            var2 = this.field2487.field2453[this.field2486++].field2474;
        } while (this.field2487.field2453[this.field2486 - 1] == var2);
        this.field2485 = var2.field2474;
        this.field2484 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2487.field2453[this.field2486 - 1] != this.field2485) {
            return true;
        }
        while (this.field2486 < this.field2487.field2456) {
            if (this.field2487.field2453[this.field2486++].field2474 != this.field2487.field2453[this.field2486 - 1]) {
                this.field2485 = this.field2487.field2453[this.field2486 - 1].field2474;
                return true;
            }
            this.field2485 = this.field2487.field2453[this.field2486 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2484 == null) {
            throw new IllegalStateException();
        }
        this.field2484.method3290();
        this.field2484 = null;
    }
}
