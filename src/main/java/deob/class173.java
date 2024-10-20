package deob;

import java.util.Iterator;

@ObfuscatedName("fl")
public class class173 implements Iterator {

    @ObfuscatedName("fl.p")
    public class177 field2848;

    @ObfuscatedName("fl.g")
    public class187 field2849;

    @ObfuscatedName("fl.x")
    public int field2851;

    @ObfuscatedName("fl.c")
    public class187 field2850 = null;

    public class173(class177 arg0) {
        this.field2848 = arg0;
        this.method3242();
    }

    @ObfuscatedName("fl.p()V")
    public void method3242() {
        this.field2849 = this.field2848.field2861[0].field2880;
        this.field2851 = 1;
        this.field2850 = null;
    }

    public Object next() {
        if (this.field2848.field2861[this.field2851 - 1] != this.field2849) {
            class187 var1 = this.field2849;
            this.field2849 = var1.field2880;
            this.field2850 = var1;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2851 >= this.field2848.field2860) {
                return null;
            }
            var2 = this.field2848.field2861[this.field2851++].field2880;
        } while (this.field2848.field2861[this.field2851 - 1] == var2);
        this.field2849 = var2.field2880;
        this.field2850 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2848.field2861[this.field2851 - 1] != this.field2849) {
            return true;
        }
        while (this.field2851 < this.field2848.field2860) {
            if (this.field2848.field2861[this.field2851++].field2880 != this.field2848.field2861[this.field2851 - 1]) {
                this.field2849 = this.field2848.field2861[this.field2851 - 1].field2880;
                return true;
            }
            this.field2849 = this.field2848.field2861[this.field2851 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2850 == null) {
            throw new IllegalStateException();
        }
        this.field2850.method3378();
        this.field2850 = null;
    }
}
