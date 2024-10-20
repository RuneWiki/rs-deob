package deob;

import java.util.Iterator;

@ObfuscatedName("fn")
public class class172 implements Iterator {

    @ObfuscatedName("fn.t")
    public class176 field2834;

    @ObfuscatedName("fn.s")
    public class186 field2832;

    @ObfuscatedName("fn.f")
    public int field2833;

    @ObfuscatedName("fn.e")
    public class186 field2835 = null;

    public class172(class176 arg0) {
        this.field2834 = arg0;
        this.method3179();
    }

    @ObfuscatedName("fn.t()V")
    public void method3179() {
        this.field2832 = this.field2834.field2845[0].field2863;
        this.field2833 = 1;
        this.field2835 = null;
    }

    public Object next() {
        if (this.field2834.field2845[this.field2833 - 1] != this.field2832) {
            class186 var1 = this.field2832;
            this.field2832 = var1.field2863;
            this.field2835 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2833 >= this.field2834.field2846) {
                return null;
            }
            var2 = this.field2834.field2845[this.field2833++].field2863;
        } while (this.field2834.field2845[this.field2833 - 1] == var2);
        this.field2832 = var2.field2863;
        this.field2835 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2834.field2845[this.field2833 - 1] != this.field2832) {
            return true;
        }
        while (this.field2833 < this.field2834.field2846) {
            if (this.field2834.field2845[this.field2833++].field2863 != this.field2834.field2845[this.field2833 - 1]) {
                this.field2832 = this.field2834.field2845[this.field2833 - 1].field2863;
                return true;
            }
            this.field2832 = this.field2834.field2845[this.field2833 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2835 == null) {
            throw new IllegalStateException();
        }
        this.field2835.method3316();
        this.field2835 = null;
    }
}
