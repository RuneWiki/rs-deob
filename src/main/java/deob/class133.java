package deob;

import java.util.Iterator;

@ObfuscatedName("ej")
public class class133 implements Iterator {

    @ObfuscatedName("ej.q")
    public class122 field1895;

    @ObfuscatedName("ej.d")
    public class128 field1893;

    @ObfuscatedName("ej.h")
    public int field1892;

    @ObfuscatedName("ej.p")
    public class128 field1894 = null;

    public class133(class122 arg0) {
        this.field1895 = arg0;
        this.method2362();
    }

    @ObfuscatedName("ej.c()V")
    public void method2362() {
        this.field1893 = this.field1895.field1862[0].field1881;
        this.field1892 = 1;
        this.field1894 = null;
    }

    public Object next() {
        if (this.field1895.field1862[this.field1892 - 1] != this.field1893) {
            class128 var1 = this.field1893;
            this.field1893 = var1.field1881;
            this.field1894 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1892 >= this.field1895.field1863) {
                return null;
            }
            var2 = this.field1895.field1862[this.field1892++].field1881;
        } while (this.field1895.field1862[this.field1892 - 1] == var2);
        this.field1893 = var2.field1881;
        this.field1894 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1895.field1862[this.field1892 - 1] != this.field1893) {
            return true;
        }
        while (this.field1892 < this.field1895.field1863) {
            if (this.field1895.field1862[this.field1892++].field1881 != this.field1895.field1862[this.field1892 - 1]) {
                this.field1893 = this.field1895.field1862[this.field1892 - 1].field1881;
                return true;
            }
            this.field1893 = this.field1895.field1862[this.field1892 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1894 == null) {
            throw new IllegalStateException();
        }
        this.field1894.method2310();
        this.field1894 = null;
    }
}
