package deob;

import java.util.Iterator;

@ObfuscatedName("et")
public class class133 implements Iterator {

    @ObfuscatedName("et.n")
    public class122 field1890;

    @ObfuscatedName("et.d")
    public class128 field1889;

    @ObfuscatedName("et.m")
    public int field1891;

    @ObfuscatedName("et.h")
    public class128 field1892 = null;

    public class133(class122 arg0) {
        this.field1890 = arg0;
        this.method2329();
    }

    @ObfuscatedName("et.z()V")
    public void method2329() {
        this.field1889 = this.field1890.field1859[0].field1878;
        this.field1891 = 1;
        this.field1892 = null;
    }

    public Object next() {
        if (this.field1890.field1859[this.field1891 - 1] != this.field1889) {
            class128 var1 = this.field1889;
            this.field1889 = var1.field1878;
            this.field1892 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1891 >= this.field1890.field1860) {
                return null;
            }
            var2 = this.field1890.field1859[this.field1891++].field1878;
        } while (this.field1890.field1859[this.field1891 - 1] == var2);
        this.field1889 = var2.field1878;
        this.field1892 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1890.field1859[this.field1891 - 1] != this.field1889) {
            return true;
        }
        while (this.field1891 < this.field1890.field1860) {
            if (this.field1890.field1859[this.field1891++].field1878 != this.field1890.field1859[this.field1891 - 1]) {
                this.field1889 = this.field1890.field1859[this.field1891 - 1].field1878;
                return true;
            }
            this.field1889 = this.field1890.field1859[this.field1891 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1892 == null) {
            throw new IllegalStateException();
        }
        this.field1892.method2273();
        this.field1892 = null;
    }
}
