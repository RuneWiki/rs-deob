package deob;

import java.util.Iterator;

@ObfuscatedName("en")
public class class133 implements Iterator {

    @ObfuscatedName("en.x")
    public class122 field1895;

    @ObfuscatedName("en.j")
    public class128 field1896;

    @ObfuscatedName("en.c")
    public int field1897;

    @ObfuscatedName("en.d")
    public class128 field1894 = null;

    public class133(class122 arg0) {
        this.field1895 = arg0;
        this.method2345();
    }

    @ObfuscatedName("en.e()V")
    public void method2345() {
        this.field1896 = this.field1895.field1866[0].field1884;
        this.field1897 = 1;
        this.field1894 = null;
    }

    public Object next() {
        if (this.field1895.field1866[this.field1897 - 1] != this.field1896) {
            class128 var1 = this.field1896;
            this.field1896 = var1.field1884;
            this.field1894 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1897 >= this.field1895.field1865) {
                return null;
            }
            var2 = this.field1895.field1866[this.field1897++].field1884;
        } while (this.field1895.field1866[this.field1897 - 1] == var2);
        this.field1896 = var2.field1884;
        this.field1894 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1895.field1866[this.field1897 - 1] != this.field1896) {
            return true;
        }
        while (this.field1897 < this.field1895.field1865) {
            if (this.field1895.field1866[this.field1897++].field1884 != this.field1895.field1866[this.field1897 - 1]) {
                this.field1896 = this.field1895.field1866[this.field1897 - 1].field1884;
                return true;
            }
            this.field1896 = this.field1895.field1866[this.field1897 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1894 == null) {
            throw new IllegalStateException();
        }
        this.field1894.method2278();
        this.field1894 = null;
    }
}
