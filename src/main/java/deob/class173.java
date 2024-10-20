package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class173 implements Iterator {

    @ObfuscatedName("fz.g")
    public class177 field2853;

    @ObfuscatedName("fz.s")
    public class187 field2852;

    @ObfuscatedName("fz.v")
    public int field2851;

    @ObfuscatedName("fz.o")
    public class187 field2854 = null;

    public class173(class177 arg0) {
        this.field2853 = arg0;
        this.method3127();
    }

    @ObfuscatedName("fz.g()V")
    public void method3127() {
        this.field2852 = this.field2853.field2864[0].field2883;
        this.field2851 = 1;
        this.field2854 = null;
    }

    public Object next() {
        if (this.field2853.field2864[this.field2851 - 1] != this.field2852) {
            class187 var1 = this.field2852;
            this.field2852 = var1.field2883;
            this.field2854 = var1;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2851 >= this.field2853.field2865) {
                return null;
            }
            var2 = this.field2853.field2864[this.field2851++].field2883;
        } while (this.field2853.field2864[this.field2851 - 1] == var2);
        this.field2852 = var2.field2883;
        this.field2854 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2853.field2864[this.field2851 - 1] != this.field2852) {
            return true;
        }
        while (this.field2851 < this.field2853.field2865) {
            if (this.field2853.field2864[this.field2851++].field2883 != this.field2853.field2864[this.field2851 - 1]) {
                this.field2852 = this.field2853.field2864[this.field2851 - 1].field2883;
                return true;
            }
            this.field2852 = this.field2853.field2864[this.field2851 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2854 == null) {
            throw new IllegalStateException();
        }
        this.field2854.method3285();
        this.field2854 = null;
    }
}
