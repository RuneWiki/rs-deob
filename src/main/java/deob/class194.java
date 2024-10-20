package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class194 implements Iterator {

    @ObfuscatedName("gg.j")
    public class198 field3074;

    @ObfuscatedName("gg.m")
    public class208 field3073;

    @ObfuscatedName("gg.f")
    public int field3072;

    @ObfuscatedName("gg.l")
    public class208 field3075 = null;

    public class194(class198 arg0) {
        this.field3074 = arg0;
        this.method3551();
    }

    @ObfuscatedName("gg.j()V")
    public void method3551() {
        this.field3073 = this.field3074.field3084[0].field3103;
        this.field3072 = 1;
        this.field3075 = null;
    }

    public Object next() {
        if (this.field3074.field3084[this.field3072 - 1] != this.field3073) {
            class208 var1 = this.field3073;
            this.field3073 = var1.field3103;
            this.field3075 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3072 >= this.field3074.field3085) {
                return null;
            }
            var2 = this.field3074.field3084[this.field3072++].field3103;
        } while (this.field3074.field3084[this.field3072 - 1] == var2);
        this.field3073 = var2.field3103;
        this.field3075 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3074.field3084[this.field3072 - 1] != this.field3073) {
            return true;
        }
        while (this.field3072 < this.field3074.field3085) {
            if (this.field3074.field3084[this.field3072++].field3103 != this.field3074.field3084[this.field3072 - 1]) {
                this.field3073 = this.field3074.field3084[this.field3072 - 1].field3103;
                return true;
            }
            this.field3073 = this.field3074.field3084[this.field3072 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3075 == null) {
            throw new IllegalStateException();
        }
        this.field3075.method3700();
        this.field3075 = null;
    }
}
