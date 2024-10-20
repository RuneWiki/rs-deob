package deob;

import java.util.Iterator;

@ObfuscatedName("fy")
public class class172 implements Iterator {

    @ObfuscatedName("fy.e")
    public class176 field2837;

    @ObfuscatedName("fy.v")
    public class186 field2835;

    @ObfuscatedName("fy.i")
    public int field2836;

    @ObfuscatedName("fy.g")
    public class186 field2834 = null;

    public class172(class176 arg0) {
        this.field2837 = arg0;
        this.method3138();
    }

    @ObfuscatedName("fy.e()V")
    public void method3138() {
        this.field2835 = this.field2837.field2846[0].field2865;
        this.field2836 = 1;
        this.field2834 = null;
    }

    public Object next() {
        if (this.field2837.field2846[this.field2836 - 1] != this.field2835) {
            class186 var1 = this.field2835;
            this.field2835 = var1.field2865;
            this.field2834 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2836 >= this.field2837.field2847) {
                return null;
            }
            var2 = this.field2837.field2846[this.field2836++].field2865;
        } while (this.field2837.field2846[this.field2836 - 1] == var2);
        this.field2835 = var2.field2865;
        this.field2834 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2837.field2846[this.field2836 - 1] != this.field2835) {
            return true;
        }
        while (this.field2836 < this.field2837.field2847) {
            if (this.field2837.field2846[this.field2836++].field2865 != this.field2837.field2846[this.field2836 - 1]) {
                this.field2835 = this.field2837.field2846[this.field2836 - 1].field2865;
                return true;
            }
            this.field2835 = this.field2837.field2846[this.field2836 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2834 == null) {
            throw new IllegalStateException();
        }
        this.field2834.method3273();
        this.field2834 = null;
    }
}
