package deob;

import java.util.Iterator;

@ObfuscatedName("eu")
public class class133 implements Iterator {

    @ObfuscatedName("eu.x")
    public class122 field1895;

    @ObfuscatedName("eu.n")
    public class128 field1897;

    @ObfuscatedName("eu.g")
    public int field1896;

    @ObfuscatedName("eu.v")
    public class128 field1898 = null;

    public class133(class122 arg0) {
        this.field1895 = arg0;
        this.method2375();
    }

    @ObfuscatedName("eu.s()V")
    public void method2375() {
        this.field1897 = this.field1895.field1865[0].field1885;
        this.field1896 = 1;
        this.field1898 = null;
    }

    public Object next() {
        if (this.field1895.field1865[this.field1896 - 1] != this.field1897) {
            class128 var1 = this.field1897;
            this.field1897 = var1.field1885;
            this.field1898 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1896 >= this.field1895.field1867) {
                return null;
            }
            var2 = this.field1895.field1865[this.field1896++].field1885;
        } while (this.field1895.field1865[this.field1896 - 1] == var2);
        this.field1897 = var2.field1885;
        this.field1898 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1895.field1865[this.field1896 - 1] != this.field1897) {
            return true;
        }
        while (this.field1896 < this.field1895.field1867) {
            if (this.field1895.field1865[this.field1896++].field1885 != this.field1895.field1865[this.field1896 - 1]) {
                this.field1897 = this.field1895.field1865[this.field1896 - 1].field1885;
                return true;
            }
            this.field1897 = this.field1895.field1865[this.field1896 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1898 == null) {
            throw new IllegalStateException();
        }
        this.field1898.method2327();
        this.field1898 = null;
    }
}
