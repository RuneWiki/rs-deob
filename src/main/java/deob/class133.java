package deob;

import java.util.Iterator;

@ObfuscatedName("ek")
public class class133 implements Iterator {

    @ObfuscatedName("ek.u")
    public class122 field1881;

    @ObfuscatedName("ek.x")
    public class128 field1879;

    @ObfuscatedName("ek.i")
    public int field1880;

    @ObfuscatedName("ek.a")
    public class128 field1878 = null;

    public class133(class122 arg0) {
        this.field1881 = arg0;
        this.method2283();
    }

    @ObfuscatedName("ek.z()V")
    public void method2283() {
        this.field1879 = this.field1881.field1849[0].field1868;
        this.field1880 = 1;
        this.field1878 = null;
    }

    public Object next() {
        if (this.field1881.field1849[this.field1880 - 1] != this.field1879) {
            class128 var1 = this.field1879;
            this.field1879 = var1.field1868;
            this.field1878 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1880 >= this.field1881.field1848) {
                return null;
            }
            var2 = this.field1881.field1849[this.field1880++].field1868;
        } while (this.field1881.field1849[this.field1880 - 1] == var2);
        this.field1879 = var2.field1868;
        this.field1878 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1881.field1849[this.field1880 - 1] != this.field1879) {
            return true;
        }
        while (this.field1880 < this.field1881.field1848) {
            if (this.field1881.field1849[this.field1880++].field1868 != this.field1881.field1849[this.field1880 - 1]) {
                this.field1879 = this.field1881.field1849[this.field1880 - 1].field1868;
                return true;
            }
            this.field1879 = this.field1881.field1849[this.field1880 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1878 == null) {
            throw new IllegalStateException();
        }
        this.field1878.method2228();
        this.field1878 = null;
    }
}
