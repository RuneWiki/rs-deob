package deob;

import java.util.Iterator;

@ObfuscatedName("fp")
public class class172 implements Iterator {

    @ObfuscatedName("fp.b")
    public class176 field2835;

    @ObfuscatedName("fp.u")
    public class184 field2834;

    @ObfuscatedName("fp.x")
    public int field2833;

    @ObfuscatedName("fp.j")
    public class184 field2836 = null;

    public class172(class176 arg0) {
        this.field2835 = arg0;
        this.method3135();
    }

    @ObfuscatedName("fp.b()V")
    public void method3135() {
        this.field2834 = this.field2835.field2845[0].field2860;
        this.field2833 = 1;
        this.field2836 = null;
    }

    public Object next() {
        if (this.field2835.field2845[this.field2833 - 1] != this.field2834) {
            class184 var1 = this.field2834;
            this.field2834 = var1.field2860;
            this.field2836 = var1;
            return var1;
        }
        class184 var2;
        do {
            if (this.field2833 >= this.field2835.field2846) {
                return null;
            }
            var2 = this.field2835.field2845[this.field2833++].field2860;
        } while (this.field2835.field2845[this.field2833 - 1] == var2);
        this.field2834 = var2.field2860;
        this.field2836 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2835.field2845[this.field2833 - 1] != this.field2834) {
            return true;
        }
        while (this.field2833 < this.field2835.field2846) {
            if (this.field2835.field2845[this.field2833++].field2860 != this.field2835.field2845[this.field2833 - 1]) {
                this.field2834 = this.field2835.field2845[this.field2833 - 1].field2860;
                return true;
            }
            this.field2834 = this.field2835.field2845[this.field2833 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2836 == null) {
            throw new IllegalStateException();
        }
        this.field2836.method3260();
        this.field2836 = null;
    }
}
