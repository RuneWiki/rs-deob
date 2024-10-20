package deob;

import java.util.Iterator;

@ObfuscatedName("ei")
public class class154 implements Iterator {

    @ObfuscatedName("ei.d")
    public class143 field2043;

    @ObfuscatedName("ei.c")
    public class149 field2044;

    @ObfuscatedName("ei.n")
    public int field2046;

    @ObfuscatedName("ei.q")
    public class149 field2045 = null;

    public class154(class143 arg0) {
        this.field2043 = arg0;
        this.method2705();
    }

    @ObfuscatedName("ei.w()V")
    public void method2705() {
        this.field2044 = this.field2043.field2012[0].field2032;
        this.field2046 = 1;
        this.field2045 = null;
    }

    public Object next() {
        if (this.field2043.field2012[this.field2046 - 1] != this.field2044) {
            class149 var1 = this.field2044;
            this.field2044 = var1.field2032;
            this.field2045 = var1;
            return var1;
        }
        class149 var2;
        do {
            if (this.field2046 >= this.field2043.field2011) {
                return null;
            }
            var2 = this.field2043.field2012[this.field2046++].field2032;
        } while (this.field2043.field2012[this.field2046 - 1] == var2);
        this.field2044 = var2.field2032;
        this.field2045 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2043.field2012[this.field2046 - 1] != this.field2044) {
            return true;
        }
        while (this.field2046 < this.field2043.field2011) {
            if (this.field2043.field2012[this.field2046++].field2032 != this.field2043.field2012[this.field2046 - 1]) {
                this.field2044 = this.field2043.field2012[this.field2046 - 1].field2032;
                return true;
            }
            this.field2044 = this.field2043.field2012[this.field2046 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2045 == null) {
            throw new IllegalStateException();
        }
        this.field2045.method2652();
        this.field2045 = null;
    }
}
