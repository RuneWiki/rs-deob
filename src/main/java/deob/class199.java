package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class199 implements Iterator {

    @ObfuscatedName("gf.i")
    public class188 field2487;

    @ObfuscatedName("gf.j")
    public class194 field2485;

    @ObfuscatedName("gf.a")
    public int field2484;

    @ObfuscatedName("gf.r")
    public class194 field2486 = null;

    public class199(class188 arg0) {
        this.field2487 = arg0;
        this.method3469();
    }

    @ObfuscatedName("gf.q()V")
    public void method3469() {
        this.field2485 = this.field2487.field2452[0].field2474;
        this.field2484 = 1;
        this.field2486 = null;
    }

    public Object next() {
        if (this.field2487.field2452[this.field2484 - 1] != this.field2485) {
            class194 var1 = this.field2485;
            this.field2485 = var1.field2474;
            this.field2486 = var1;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2484 >= this.field2487.field2456) {
                return null;
            }
            var2 = this.field2487.field2452[this.field2484++].field2474;
        } while (this.field2487.field2452[this.field2484 - 1] == var2);
        this.field2485 = var2.field2474;
        this.field2486 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2487.field2452[this.field2484 - 1] != this.field2485) {
            return true;
        }
        while (this.field2484 < this.field2487.field2456) {
            if (this.field2487.field2452[this.field2484++].field2474 != this.field2487.field2452[this.field2484 - 1]) {
                this.field2485 = this.field2487.field2452[this.field2484 - 1].field2474;
                return true;
            }
            this.field2485 = this.field2487.field2452[this.field2484 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2486 == null) {
            throw new IllegalStateException();
        }
        this.field2486.method3397();
        this.field2486 = null;
    }
}
