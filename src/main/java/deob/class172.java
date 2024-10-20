package deob;

import java.util.Iterator;

@ObfuscatedName("fj")
public class class172 implements Iterator {

    @ObfuscatedName("fj.e")
    public class176 field2842;

    @ObfuscatedName("fj.o")
    public class186 field2841;

    @ObfuscatedName("fj.y")
    public int field2843;

    @ObfuscatedName("fj.b")
    public class186 field2844 = null;

    public class172(class176 arg0) {
        this.field2842 = arg0;
        this.method3074();
    }

    @ObfuscatedName("fj.e()V")
    public void method3074() {
        this.field2841 = this.field2842.field2854[0].field2873;
        this.field2843 = 1;
        this.field2844 = null;
    }

    public Object next() {
        if (this.field2842.field2854[this.field2843 - 1] != this.field2841) {
            class186 var1 = this.field2841;
            this.field2841 = var1.field2873;
            this.field2844 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2843 >= this.field2842.field2853) {
                return null;
            }
            var2 = this.field2842.field2854[this.field2843++].field2873;
        } while (this.field2842.field2854[this.field2843 - 1] == var2);
        this.field2841 = var2.field2873;
        this.field2844 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2842.field2854[this.field2843 - 1] != this.field2841) {
            return true;
        }
        while (this.field2843 < this.field2842.field2853) {
            if (this.field2842.field2854[this.field2843++].field2873 != this.field2842.field2854[this.field2843 - 1]) {
                this.field2841 = this.field2842.field2854[this.field2843 - 1].field2873;
                return true;
            }
            this.field2841 = this.field2842.field2854[this.field2843 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2844 == null) {
            throw new IllegalStateException();
        }
        this.field2844.method3204();
        this.field2844 = null;
    }
}
