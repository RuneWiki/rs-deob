package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class198 implements Iterator {

    @ObfuscatedName("gk.k")
    public class202 field3137;

    @ObfuscatedName("gk.q")
    public class212 field3135;

    @ObfuscatedName("gk.f")
    public int field3136;

    @ObfuscatedName("gk.c")
    public class212 field3134 = null;

    public class198(class202 arg0) {
        this.field3137 = arg0;
        this.method3559();
    }

    @ObfuscatedName("gk.k()V")
    public void method3559() {
        this.field3135 = this.field3137.field3146[0].field3167;
        this.field3136 = 1;
        this.field3134 = null;
    }

    public Object next() {
        if (this.field3137.field3146[this.field3136 - 1] != this.field3135) {
            class212 var1 = this.field3135;
            this.field3135 = var1.field3167;
            this.field3134 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3136 >= this.field3137.field3147) {
                return null;
            }
            var2 = this.field3137.field3146[this.field3136++].field3167;
        } while (this.field3137.field3146[this.field3136 - 1] == var2);
        this.field3135 = var2.field3167;
        this.field3134 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3137.field3146[this.field3136 - 1] != this.field3135) {
            return true;
        }
        while (this.field3136 < this.field3137.field3147) {
            if (this.field3137.field3146[this.field3136++].field3167 != this.field3137.field3146[this.field3136 - 1]) {
                this.field3135 = this.field3137.field3146[this.field3136 - 1].field3167;
                return true;
            }
            this.field3135 = this.field3137.field3146[this.field3136 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3134 == null) {
            throw new IllegalStateException();
        }
        this.field3134.method3703();
        this.field3134 = null;
    }
}
