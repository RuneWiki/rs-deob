package deob;

import java.util.Iterator;

@ObfuscatedName("hx")
public class class213 implements Iterator {

    @ObfuscatedName("hx.v")
    public class200 field2476;

    @ObfuscatedName("hx.s")
    public class207 field2477;

    @ObfuscatedName("hx.o")
    public int field2478;

    @ObfuscatedName("hx.k")
    public class207 field2479 = null;

    public class213(class200 arg0) {
        this.field2476 = arg0;
        this.method3841();
    }

    @ObfuscatedName("hx.c()V")
    public void method3841() {
        this.field2477 = this.field2476.field2439[0].field2463;
        this.field2478 = 1;
        this.field2479 = null;
    }

    public Object next() {
        if (this.field2476.field2439[this.field2478 - 1] != this.field2477) {
            class207 var1 = this.field2477;
            this.field2477 = var1.field2463;
            this.field2479 = var1;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2478 >= this.field2476.field2441) {
                return null;
            }
            var2 = this.field2476.field2439[this.field2478++].field2463;
        } while (this.field2476.field2439[this.field2478 - 1] == var2);
        this.field2477 = var2.field2463;
        this.field2479 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2476.field2439[this.field2478 - 1] != this.field2477) {
            return true;
        }
        while (this.field2478 < this.field2476.field2441) {
            if (this.field2476.field2439[this.field2478++].field2463 != this.field2476.field2439[this.field2478 - 1]) {
                this.field2477 = this.field2476.field2439[this.field2478 - 1].field2463;
                return true;
            }
            this.field2477 = this.field2476.field2439[this.field2478 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2479 == null) {
            throw new IllegalStateException();
        }
        this.field2479.method3787();
        this.field2479 = null;
    }
}
