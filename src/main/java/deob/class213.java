package deob;

import java.util.Iterator;

@ObfuscatedName("hl")
public class class213 implements Iterator {

    @ObfuscatedName("hl.c")
    public class200 field2478;

    @ObfuscatedName("hl.q")
    public class207 field2479;

    @ObfuscatedName("hl.m")
    public int field2480;

    @ObfuscatedName("hl.j")
    public class207 field2481 = null;

    public class213(class200 arg0) {
        this.field2478 = arg0;
        this.method3793();
    }

    @ObfuscatedName("hl.h()V")
    public void method3793() {
        this.field2479 = this.field2478.field2441[0].field2465;
        this.field2480 = 1;
        this.field2481 = null;
    }

    public Object next() {
        if (this.field2478.field2441[this.field2480 - 1] != this.field2479) {
            class207 var1 = this.field2479;
            this.field2479 = var1.field2465;
            this.field2481 = var1;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2480 >= this.field2478.field2442) {
                return null;
            }
            var2 = this.field2478.field2441[this.field2480++].field2465;
        } while (this.field2478.field2441[this.field2480 - 1] == var2);
        this.field2479 = var2.field2465;
        this.field2481 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2478.field2441[this.field2480 - 1] != this.field2479) {
            return true;
        }
        while (this.field2480 < this.field2478.field2442) {
            if (this.field2478.field2441[this.field2480++].field2465 != this.field2478.field2441[this.field2480 - 1]) {
                this.field2479 = this.field2478.field2441[this.field2480 - 1].field2465;
                return true;
            }
            this.field2479 = this.field2478.field2441[this.field2480 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2481 == null) {
            throw new IllegalStateException();
        }
        this.field2481.method3733();
        this.field2481 = null;
    }
}
