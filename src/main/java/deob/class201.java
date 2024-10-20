package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class201 implements Iterator {

    @ObfuscatedName("gf.w")
    public class190 field2502;

    @ObfuscatedName("gf.o")
    public class196 field2501;

    @ObfuscatedName("gf.x")
    public int field2499;

    @ObfuscatedName("gf.k")
    public class196 field2500 = null;

    public class201(class190 arg0) {
        this.field2502 = arg0;
        this.method3347();
    }

    @ObfuscatedName("gf.a()V")
    public void method3347() {
        this.field2501 = this.field2502.field2467[0].field2489;
        this.field2499 = 1;
        this.field2500 = null;
    }

    public Object next() {
        if (this.field2502.field2467[this.field2499 - 1] != this.field2501) {
            class196 var1 = this.field2501;
            this.field2501 = var1.field2489;
            this.field2500 = var1;
            return var1;
        }
        class196 var2;
        do {
            if (this.field2499 >= this.field2502.field2470) {
                return null;
            }
            var2 = this.field2502.field2467[this.field2499++].field2489;
        } while (this.field2502.field2467[this.field2499 - 1] == var2);
        this.field2501 = var2.field2489;
        this.field2500 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2502.field2467[this.field2499 - 1] != this.field2501) {
            return true;
        }
        while (this.field2499 < this.field2502.field2470) {
            if (this.field2502.field2467[this.field2499++].field2489 != this.field2502.field2467[this.field2499 - 1]) {
                this.field2501 = this.field2502.field2467[this.field2499 - 1].field2489;
                return true;
            }
            this.field2501 = this.field2502.field2467[this.field2499 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2500 == null) {
            throw new IllegalStateException();
        }
        this.field2500.method3294();
        this.field2500 = null;
    }
}
