package deob;

import java.util.Iterator;

@ObfuscatedName("ei")
public class class133 implements Iterator {

    @ObfuscatedName("ei.p")
    public class122 field1897;

    @ObfuscatedName("ei.g")
    public class128 field1896;

    @ObfuscatedName("ei.x")
    public int field1894;

    @ObfuscatedName("ei.q")
    public class128 field1895 = null;

    public class133(class122 arg0) {
        this.field1897 = arg0;
        this.method2280();
    }

    @ObfuscatedName("ei.c()V")
    public void method2280() {
        this.field1896 = this.field1897.field1865[0].field1883;
        this.field1894 = 1;
        this.field1895 = null;
    }

    public Object next() {
        if (this.field1897.field1865[this.field1894 - 1] != this.field1896) {
            class128 var1 = this.field1896;
            this.field1896 = var1.field1883;
            this.field1895 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1894 >= this.field1897.field1866) {
                return null;
            }
            var2 = this.field1897.field1865[this.field1894++].field1883;
        } while (this.field1897.field1865[this.field1894 - 1] == var2);
        this.field1896 = var2.field1883;
        this.field1895 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1897.field1865[this.field1894 - 1] != this.field1896) {
            return true;
        }
        while (this.field1894 < this.field1897.field1866) {
            if (this.field1897.field1865[this.field1894++].field1883 != this.field1897.field1865[this.field1894 - 1]) {
                this.field1896 = this.field1897.field1865[this.field1894 - 1].field1883;
                return true;
            }
            this.field1896 = this.field1897.field1865[this.field1894 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1895 == null) {
            throw new IllegalStateException();
        }
        this.field1895.method2225();
        this.field1895 = null;
    }
}
