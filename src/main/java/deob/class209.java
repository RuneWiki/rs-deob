package deob;

import java.util.Iterator;

@ObfuscatedName("he")
public class class209 implements Iterator {

    @ObfuscatedName("he.s")
    public class198 field2598;

    @ObfuscatedName("he.g")
    public class204 field2596;

    @ObfuscatedName("he.m")
    public int field2597;

    @ObfuscatedName("he.h")
    public class204 field2595 = null;

    public class209(class198 arg0) {
        this.field2598 = arg0;
        this.method3804();
    }

    @ObfuscatedName("he.d()V")
    public void method3804() {
        this.field2596 = this.field2598.field2564[0].field2584;
        this.field2597 = 1;
        this.field2595 = null;
    }

    public Object next() {
        if (this.field2598.field2564[this.field2597 - 1] != this.field2596) {
            class204 var1 = this.field2596;
            this.field2596 = var1.field2584;
            this.field2595 = var1;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2597 >= this.field2598.field2566) {
                return null;
            }
            var2 = this.field2598.field2564[this.field2597++].field2584;
        } while (this.field2598.field2564[this.field2597 - 1] == var2);
        this.field2596 = var2.field2584;
        this.field2595 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2598.field2564[this.field2597 - 1] != this.field2596) {
            return true;
        }
        while (this.field2597 < this.field2598.field2566) {
            if (this.field2598.field2564[this.field2597++].field2584 != this.field2598.field2564[this.field2597 - 1]) {
                this.field2596 = this.field2598.field2564[this.field2597 - 1].field2584;
                return true;
            }
            this.field2596 = this.field2598.field2564[this.field2597 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2595 == null) {
            throw new IllegalStateException();
        }
        this.field2595.method3740();
        this.field2595 = null;
    }
}
