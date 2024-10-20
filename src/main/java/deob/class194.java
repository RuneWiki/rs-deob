package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class194 implements Iterator {

    @ObfuscatedName("gc.d")
    public class198 field3077;

    @ObfuscatedName("gc.p")
    public class208 field3075;

    @ObfuscatedName("gc.v")
    public int field3076;

    @ObfuscatedName("gc.l")
    public class208 field3074 = null;

    public class194(class198 arg0) {
        this.field3077 = arg0;
        this.method3566();
    }

    @ObfuscatedName("gc.d()V")
    public void method3566() {
        this.field3075 = this.field3077.field3086[0].field3105;
        this.field3076 = 1;
        this.field3074 = null;
    }

    public Object next() {
        if (this.field3077.field3086[this.field3076 - 1] != this.field3075) {
            class208 var1 = this.field3075;
            this.field3075 = var1.field3105;
            this.field3074 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3076 >= this.field3077.field3088) {
                return null;
            }
            var2 = this.field3077.field3086[this.field3076++].field3105;
        } while (this.field3077.field3086[this.field3076 - 1] == var2);
        this.field3075 = var2.field3105;
        this.field3074 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3077.field3086[this.field3076 - 1] != this.field3075) {
            return true;
        }
        while (this.field3076 < this.field3077.field3088) {
            if (this.field3077.field3086[this.field3076++].field3105 != this.field3077.field3086[this.field3076 - 1]) {
                this.field3075 = this.field3077.field3086[this.field3076 - 1].field3105;
                return true;
            }
            this.field3075 = this.field3077.field3086[this.field3076 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3074 == null) {
            throw new IllegalStateException();
        }
        this.field3074.method3715();
        this.field3074 = null;
    }
}
