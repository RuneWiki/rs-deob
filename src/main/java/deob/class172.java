package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class172 implements Iterator {

    @ObfuscatedName("fz.t")
    public class176 field2835;

    @ObfuscatedName("fz.o")
    public class186 field2833;

    @ObfuscatedName("fz.i")
    public int field2834;

    @ObfuscatedName("fz.p")
    public class186 field2836 = null;

    public class172(class176 arg0) {
        this.field2835 = arg0;
        this.method3119();
    }

    @ObfuscatedName("fz.t()V")
    public void method3119() {
        this.field2833 = this.field2835.field2846[0].field2864;
        this.field2834 = 1;
        this.field2836 = null;
    }

    public Object next() {
        if (this.field2835.field2846[this.field2834 - 1] != this.field2833) {
            class186 var1 = this.field2833;
            this.field2833 = var1.field2864;
            this.field2836 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2834 >= this.field2835.field2845) {
                return null;
            }
            var2 = this.field2835.field2846[this.field2834++].field2864;
        } while (this.field2835.field2846[this.field2834 - 1] == var2);
        this.field2833 = var2.field2864;
        this.field2836 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2835.field2846[this.field2834 - 1] != this.field2833) {
            return true;
        }
        while (this.field2834 < this.field2835.field2845) {
            if (this.field2835.field2846[this.field2834++].field2864 != this.field2835.field2846[this.field2834 - 1]) {
                this.field2833 = this.field2835.field2846[this.field2834 - 1].field2864;
                return true;
            }
            this.field2833 = this.field2835.field2846[this.field2834 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2836 == null) {
            throw new IllegalStateException();
        }
        this.field2836.method3261();
        this.field2836 = null;
    }
}
