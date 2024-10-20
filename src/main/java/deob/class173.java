package deob;

import java.util.Iterator;

@ObfuscatedName("fm")
public class class173 implements Iterator {

    @ObfuscatedName("fm.k")
    public class177 field2846;

    @ObfuscatedName("fm.y")
    public class187 field2847;

    @ObfuscatedName("fm.s")
    public int field2849;

    @ObfuscatedName("fm.g")
    public class187 field2848 = null;

    public class173(class177 arg0) {
        this.field2846 = arg0;
        this.method3216();
    }

    @ObfuscatedName("fm.k()V")
    public void method3216() {
        this.field2847 = this.field2846.field2858[0].field2878;
        this.field2849 = 1;
        this.field2848 = null;
    }

    public Object next() {
        if (this.field2846.field2858[this.field2849 - 1] != this.field2847) {
            class187 var1 = this.field2847;
            this.field2847 = var1.field2878;
            this.field2848 = var1;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2849 >= this.field2846.field2859) {
                return null;
            }
            var2 = this.field2846.field2858[this.field2849++].field2878;
        } while (this.field2846.field2858[this.field2849 - 1] == var2);
        this.field2847 = var2.field2878;
        this.field2848 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2846.field2858[this.field2849 - 1] != this.field2847) {
            return true;
        }
        while (this.field2849 < this.field2846.field2859) {
            if (this.field2846.field2858[this.field2849++].field2878 != this.field2846.field2858[this.field2849 - 1]) {
                this.field2847 = this.field2846.field2858[this.field2849 - 1].field2878;
                return true;
            }
            this.field2847 = this.field2846.field2858[this.field2849 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2848 == null) {
            throw new IllegalStateException();
        }
        this.field2848.method3365();
        this.field2848 = null;
    }
}
