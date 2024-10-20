package deob;

import java.util.Iterator;

@ObfuscatedName("ft")
public class class173 implements Iterator {

    @ObfuscatedName("ft.g")
    public class177 field2843;

    @ObfuscatedName("ft.s")
    public class187 field2842;

    @ObfuscatedName("ft.h")
    public int field2841;

    @ObfuscatedName("ft.m")
    public class187 field2844 = null;

    public class173(class177 arg0) {
        this.field2843 = arg0;
        this.method3139();
    }

    @ObfuscatedName("ft.g()V")
    public void method3139() {
        this.field2842 = this.field2843.field2853[0].field2874;
        this.field2841 = 1;
        this.field2844 = null;
    }

    public Object next() {
        if (this.field2843.field2853[this.field2841 - 1] != this.field2842) {
            class187 var1 = this.field2842;
            this.field2842 = var1.field2874;
            this.field2844 = var1;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2841 >= this.field2843.field2854) {
                return null;
            }
            var2 = this.field2843.field2853[this.field2841++].field2874;
        } while (this.field2843.field2853[this.field2841 - 1] == var2);
        this.field2842 = var2.field2874;
        this.field2844 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2843.field2853[this.field2841 - 1] != this.field2842) {
            return true;
        }
        while (this.field2841 < this.field2843.field2854) {
            if (this.field2843.field2853[this.field2841++].field2874 != this.field2843.field2853[this.field2841 - 1]) {
                this.field2842 = this.field2843.field2853[this.field2841 - 1].field2874;
                return true;
            }
            this.field2842 = this.field2843.field2853[this.field2841 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2844 == null) {
            throw new IllegalStateException();
        }
        this.field2844.method3280();
        this.field2844 = null;
    }
}
