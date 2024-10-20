package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class198 implements Iterator {

    @ObfuscatedName("gi.w")
    public class187 field2476;

    @ObfuscatedName("gi.s")
    public class193 field2478;

    @ObfuscatedName("gi.q")
    public int field2477;

    @ObfuscatedName("gi.o")
    public class193 field2475 = null;

    public class198(class187 arg0) {
        this.field2476 = arg0;
        this.method3469();
    }

    @ObfuscatedName("gi.u()V")
    public void method3469() {
        this.field2478 = this.field2476.field2443[0].field2465;
        this.field2477 = 1;
        this.field2475 = null;
    }

    public Object next() {
        if (this.field2476.field2443[this.field2477 - 1] != this.field2478) {
            class193 var1 = this.field2478;
            this.field2478 = var1.field2465;
            this.field2475 = var1;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2477 >= this.field2476.field2444) {
                return null;
            }
            var2 = this.field2476.field2443[this.field2477++].field2465;
        } while (this.field2476.field2443[this.field2477 - 1] == var2);
        this.field2478 = var2.field2465;
        this.field2475 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2476.field2443[this.field2477 - 1] != this.field2478) {
            return true;
        }
        while (this.field2477 < this.field2476.field2444) {
            if (this.field2476.field2443[this.field2477++].field2465 != this.field2476.field2443[this.field2477 - 1]) {
                this.field2478 = this.field2476.field2443[this.field2477 - 1].field2465;
                return true;
            }
            this.field2478 = this.field2476.field2443[this.field2477 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2475 == null) {
            throw new IllegalStateException();
        }
        this.field2475.method3425();
        this.field2475 = null;
    }
}
