package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class199 implements Iterator {

    @ObfuscatedName("gc.j")
    public class188 field2480;

    @ObfuscatedName("gc.h")
    public class194 field2479;

    @ObfuscatedName("gc.f")
    public int field2481;

    @ObfuscatedName("gc.p")
    public class194 field2482 = null;

    public class199(class188 arg0) {
        this.field2480 = arg0;
        this.method3365();
    }

    @ObfuscatedName("gc.c()V")
    public void method3365() {
        this.field2479 = this.field2480.field2448[0].field2470;
        this.field2481 = 1;
        this.field2482 = null;
    }

    public Object next() {
        if (this.field2480.field2448[this.field2481 - 1] != this.field2479) {
            class194 var1 = this.field2479;
            this.field2479 = var1.field2470;
            this.field2482 = var1;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2481 >= this.field2480.field2450) {
                return null;
            }
            var2 = this.field2480.field2448[this.field2481++].field2470;
        } while (this.field2480.field2448[this.field2481 - 1] == var2);
        this.field2479 = var2.field2470;
        this.field2482 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2480.field2448[this.field2481 - 1] != this.field2479) {
            return true;
        }
        while (this.field2481 < this.field2480.field2450) {
            if (this.field2480.field2448[this.field2481++].field2470 != this.field2480.field2448[this.field2481 - 1]) {
                this.field2479 = this.field2480.field2448[this.field2481 - 1].field2470;
                return true;
            }
            this.field2479 = this.field2480.field2448[this.field2481 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2482 == null) {
            throw new IllegalStateException();
        }
        this.field2482.method3314();
        this.field2482 = null;
    }
}
