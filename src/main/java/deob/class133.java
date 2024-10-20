package deob;

import java.util.Iterator;

@ObfuscatedName("ed")
public class class133 implements Iterator {

    @ObfuscatedName("ed.k")
    public class122 field1886;

    @ObfuscatedName("ed.y")
    public class128 field1885;

    @ObfuscatedName("ed.o")
    public int field1887;

    @ObfuscatedName("ed.r")
    public class128 field1884 = null;

    public class133(class122 arg0) {
        this.field1886 = arg0;
        this.method2269();
    }

    @ObfuscatedName("ed.i()V")
    public void method2269() {
        this.field1885 = this.field1886.field1856[0].field1875;
        this.field1887 = 1;
        this.field1884 = null;
    }

    public Object next() {
        if (this.field1886.field1856[this.field1887 - 1] != this.field1885) {
            class128 var1 = this.field1885;
            this.field1885 = var1.field1875;
            this.field1884 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1887 >= this.field1886.field1855) {
                return null;
            }
            var2 = this.field1886.field1856[this.field1887++].field1875;
        } while (this.field1886.field1856[this.field1887 - 1] == var2);
        this.field1885 = var2.field1875;
        this.field1884 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1886.field1856[this.field1887 - 1] != this.field1885) {
            return true;
        }
        while (this.field1887 < this.field1886.field1855) {
            if (this.field1886.field1856[this.field1887++].field1875 != this.field1886.field1856[this.field1887 - 1]) {
                this.field1885 = this.field1886.field1856[this.field1887 - 1].field1875;
                return true;
            }
            this.field1885 = this.field1886.field1856[this.field1887 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1884 == null) {
            throw new IllegalStateException();
        }
        this.field1884.method2214();
        this.field1884 = null;
    }
}
