package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class185 implements Iterator {

    @ObfuscatedName("gf.y")
    public class189 field2995;

    @ObfuscatedName("gf.k")
    public class199 field2994;

    @ObfuscatedName("gf.g")
    public int field2993;

    @ObfuscatedName("gf.n")
    public class199 field2996 = null;

    public class185(class189 arg0) {
        this.field2995 = arg0;
        this.method3346();
    }

    @ObfuscatedName("gf.y()V")
    public void method3346() {
        this.field2994 = this.field2995.field3007[0].field3025;
        this.field2993 = 1;
        this.field2996 = null;
    }

    public Object next() {
        if (this.field2995.field3007[this.field2993 - 1] != this.field2994) {
            class199 var1 = this.field2994;
            this.field2994 = var1.field3025;
            this.field2996 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2993 >= this.field2995.field3006) {
                return null;
            }
            var2 = this.field2995.field3007[this.field2993++].field3025;
        } while (this.field2995.field3007[this.field2993 - 1] == var2);
        this.field2994 = var2.field3025;
        this.field2996 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2995.field3007[this.field2993 - 1] != this.field2994) {
            return true;
        }
        while (this.field2993 < this.field2995.field3006) {
            if (this.field2995.field3007[this.field2993++].field3025 != this.field2995.field3007[this.field2993 - 1]) {
                this.field2994 = this.field2995.field3007[this.field2993 - 1].field3025;
                return true;
            }
            this.field2994 = this.field2995.field3007[this.field2993 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2996 == null) {
            throw new IllegalStateException();
        }
        this.field2996.method3482();
        this.field2996 = null;
    }
}
