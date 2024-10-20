package deob;

import java.util.Iterator;

@ObfuscatedName("eh")
public class class133 implements Iterator {

    @ObfuscatedName("eh.s")
    public class122 field1900;

    @ObfuscatedName("eh.c")
    public class128 field1899;

    @ObfuscatedName("eh.f")
    public int field1898;

    @ObfuscatedName("eh.h")
    public class128 field1901 = null;

    public class133(class122 arg0) {
        this.field1900 = arg0;
        this.method2233();
    }

    @ObfuscatedName("eh.u()V")
    public void method2233() {
        this.field1899 = this.field1900.field1869[0].field1888;
        this.field1898 = 1;
        this.field1901 = null;
    }

    public Object next() {
        if (this.field1900.field1869[this.field1898 - 1] != this.field1899) {
            class128 var1 = this.field1899;
            this.field1899 = var1.field1888;
            this.field1901 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1898 >= this.field1900.field1870) {
                return null;
            }
            var2 = this.field1900.field1869[this.field1898++].field1888;
        } while (this.field1900.field1869[this.field1898 - 1] == var2);
        this.field1899 = var2.field1888;
        this.field1901 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1900.field1869[this.field1898 - 1] != this.field1899) {
            return true;
        }
        while (this.field1898 < this.field1900.field1870) {
            if (this.field1900.field1869[this.field1898++].field1888 != this.field1900.field1869[this.field1898 - 1]) {
                this.field1899 = this.field1900.field1869[this.field1898 - 1].field1888;
                return true;
            }
            this.field1899 = this.field1900.field1869[this.field1898 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1901 == null) {
            throw new IllegalStateException();
        }
        this.field1901.method2179();
        this.field1901 = null;
    }
}
