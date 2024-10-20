package deob;

import java.util.Iterator;

@ObfuscatedName("eb")
public class class133 implements Iterator {

    @ObfuscatedName("eb.i")
    public class122 field1890;

    @ObfuscatedName("eb.e")
    public class128 field1889;

    @ObfuscatedName("eb.f")
    public int field1888;

    @ObfuscatedName("eb.k")
    public class128 field1891 = null;

    public class133(class122 arg0) {
        this.field1890 = arg0;
        this.method2258();
    }

    @ObfuscatedName("eb.h()V")
    public void method2258() {
        this.field1889 = this.field1890.field1859[0].field1877;
        this.field1888 = 1;
        this.field1891 = null;
    }

    public Object next() {
        if (this.field1890.field1859[this.field1888 - 1] != this.field1889) {
            class128 var1 = this.field1889;
            this.field1889 = var1.field1877;
            this.field1891 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1888 >= this.field1890.field1858) {
                return null;
            }
            var2 = this.field1890.field1859[this.field1888++].field1877;
        } while (this.field1890.field1859[this.field1888 - 1] == var2);
        this.field1889 = var2.field1877;
        this.field1891 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1890.field1859[this.field1888 - 1] != this.field1889) {
            return true;
        }
        while (this.field1888 < this.field1890.field1858) {
            if (this.field1890.field1859[this.field1888++].field1877 != this.field1890.field1859[this.field1888 - 1]) {
                this.field1889 = this.field1890.field1859[this.field1888 - 1].field1877;
                return true;
            }
            this.field1889 = this.field1890.field1859[this.field1888 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1891 == null) {
            throw new IllegalStateException();
        }
        this.field1891.method2200();
        this.field1891 = null;
    }
}
