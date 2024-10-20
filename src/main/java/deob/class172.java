package deob;

import java.util.Iterator;

@ObfuscatedName("ft")
public class class172 implements Iterator {

    @ObfuscatedName("ft.k")
    public class176 field2845;

    @ObfuscatedName("ft.r")
    public class186 field2846;

    @ObfuscatedName("ft.y")
    public int field2847;

    @ObfuscatedName("ft.w")
    public class186 field2844 = null;

    public class172(class176 arg0) {
        this.field2845 = arg0;
        this.method3148();
    }

    @ObfuscatedName("ft.k()V")
    public void method3148() {
        this.field2846 = this.field2845.field2857[0].field2875;
        this.field2847 = 1;
        this.field2844 = null;
    }

    public Object next() {
        if (this.field2845.field2857[this.field2847 - 1] != this.field2846) {
            class186 var1 = this.field2846;
            this.field2846 = var1.field2875;
            this.field2844 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2847 >= this.field2845.field2858) {
                return null;
            }
            var2 = this.field2845.field2857[this.field2847++].field2875;
        } while (this.field2845.field2857[this.field2847 - 1] == var2);
        this.field2846 = var2.field2875;
        this.field2844 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2845.field2857[this.field2847 - 1] != this.field2846) {
            return true;
        }
        while (this.field2847 < this.field2845.field2858) {
            if (this.field2845.field2857[this.field2847++].field2875 != this.field2845.field2857[this.field2847 - 1]) {
                this.field2846 = this.field2845.field2857[this.field2847 - 1].field2875;
                return true;
            }
            this.field2846 = this.field2845.field2857[this.field2847 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2844 == null) {
            throw new IllegalStateException();
        }
        this.field2844.method3275();
        this.field2844 = null;
    }
}
