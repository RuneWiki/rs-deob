package deob;

import java.util.Iterator;

@ObfuscatedName("fa")
public class class172 implements Iterator {

    @ObfuscatedName("fa.i")
    public class176 field2840;

    @ObfuscatedName("fa.c")
    public class186 field2839;

    @ObfuscatedName("fa.h")
    public int field2841;

    @ObfuscatedName("fa.v")
    public class186 field2838 = null;

    public class172(class176 arg0) {
        this.field2840 = arg0;
        this.method3198();
    }

    @ObfuscatedName("fa.i()V")
    public void method3198() {
        this.field2839 = this.field2840.field2851[0].field2870;
        this.field2841 = 1;
        this.field2838 = null;
    }

    public Object next() {
        if (this.field2840.field2851[this.field2841 - 1] != this.field2839) {
            class186 var1 = this.field2839;
            this.field2839 = var1.field2870;
            this.field2838 = var1;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2841 >= this.field2840.field2850) {
                return null;
            }
            var2 = this.field2840.field2851[this.field2841++].field2870;
        } while (this.field2840.field2851[this.field2841 - 1] == var2);
        this.field2839 = var2.field2870;
        this.field2838 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2840.field2851[this.field2841 - 1] != this.field2839) {
            return true;
        }
        while (this.field2841 < this.field2840.field2850) {
            if (this.field2840.field2851[this.field2841++].field2870 != this.field2840.field2851[this.field2841 - 1]) {
                this.field2839 = this.field2840.field2851[this.field2841 - 1].field2870;
                return true;
            }
            this.field2839 = this.field2840.field2851[this.field2841 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2838 == null) {
            throw new IllegalStateException();
        }
        this.field2838.method3334();
        this.field2838 = null;
    }
}
