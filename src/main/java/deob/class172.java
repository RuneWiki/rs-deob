package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public class class172 implements Iterator {

    @ObfuscatedName("fh.j")
    public class176 field2834;

    @ObfuscatedName("fh.z")
    public class184 field2833;

    @ObfuscatedName("fh.y")
    public int field2835;

    @ObfuscatedName("fh.h")
    public class184 field2836 = null;

    public class172(class176 arg0) {
        this.field2834 = arg0;
        this.method3187();
    }

    @ObfuscatedName("fh.j()V")
    public void method3187() {
        this.field2833 = this.field2834.field2845[0].field2860;
        this.field2835 = 1;
        this.field2836 = null;
    }

    public Object next() {
        if (this.field2834.field2845[this.field2835 - 1] != this.field2833) {
            class184 var1 = this.field2833;
            this.field2833 = var1.field2860;
            this.field2836 = var1;
            return var1;
        }
        class184 var2;
        do {
            if (this.field2835 >= this.field2834.field2846) {
                return null;
            }
            var2 = this.field2834.field2845[this.field2835++].field2860;
        } while (this.field2834.field2845[this.field2835 - 1] == var2);
        this.field2833 = var2.field2860;
        this.field2836 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2834.field2845[this.field2835 - 1] != this.field2833) {
            return true;
        }
        while (this.field2835 < this.field2834.field2846) {
            if (this.field2834.field2845[this.field2835++].field2860 != this.field2834.field2845[this.field2835 - 1]) {
                this.field2833 = this.field2834.field2845[this.field2835 - 1].field2860;
                return true;
            }
            this.field2833 = this.field2834.field2845[this.field2835 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2836 == null) {
            throw new IllegalStateException();
        }
        this.field2836.method3309();
        this.field2836 = null;
    }
}
