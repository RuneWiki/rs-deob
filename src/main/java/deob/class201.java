package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class201 implements Iterator {

    @ObfuscatedName("gv.s")
    public class190 field2499;

    @ObfuscatedName("gv.c")
    public class196 field2500;

    @ObfuscatedName("gv.f")
    public int field2498;

    @ObfuscatedName("gv.m")
    public class196 field2497 = null;

    public class201(class190 arg0) {
        this.field2499 = arg0;
        this.method3436();
    }

    @ObfuscatedName("gv.d()V")
    public void method3436() {
        this.field2500 = this.field2499.field2465[0].field2486;
        this.field2498 = 1;
        this.field2497 = null;
    }

    public Object next() {
        if (this.field2499.field2465[this.field2498 - 1] != this.field2500) {
            class196 var1 = this.field2500;
            this.field2500 = var1.field2486;
            this.field2497 = var1;
            return var1;
        }
        class196 var2;
        do {
            if (this.field2498 >= this.field2499.field2466) {
                return null;
            }
            var2 = this.field2499.field2465[this.field2498++].field2486;
        } while (this.field2499.field2465[this.field2498 - 1] == var2);
        this.field2500 = var2.field2486;
        this.field2497 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2499.field2465[this.field2498 - 1] != this.field2500) {
            return true;
        }
        while (this.field2498 < this.field2499.field2466) {
            if (this.field2499.field2465[this.field2498++].field2486 != this.field2499.field2465[this.field2498 - 1]) {
                this.field2500 = this.field2499.field2465[this.field2498 - 1].field2486;
                return true;
            }
            this.field2500 = this.field2499.field2465[this.field2498 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2497 == null) {
            throw new IllegalStateException();
        }
        this.field2497.method3372();
        this.field2497 = null;
    }
}
