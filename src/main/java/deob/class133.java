package deob;

import java.util.Iterator;

@ObfuscatedName("er")
public class class133 implements Iterator {

    @ObfuscatedName("er.b")
    public class122 field1875;

    @ObfuscatedName("er.e")
    public class128 field1876;

    @ObfuscatedName("er.c")
    public int field1877;

    @ObfuscatedName("er.l")
    public class128 field1878 = null;

    public class133(class122 arg0) {
        this.field1875 = arg0;
        this.method2364();
    }

    @ObfuscatedName("er.j()V")
    public void method2364() {
        this.field1876 = this.field1875.field1846[0].field1865;
        this.field1877 = 1;
        this.field1878 = null;
    }

    public Object next() {
        if (this.field1875.field1846[this.field1877 - 1] != this.field1876) {
            class128 var1 = this.field1876;
            this.field1876 = var1.field1865;
            this.field1878 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1877 >= this.field1875.field1845) {
                return null;
            }
            var2 = this.field1875.field1846[this.field1877++].field1865;
        } while (this.field1875.field1846[this.field1877 - 1] == var2);
        this.field1876 = var2.field1865;
        this.field1878 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1875.field1846[this.field1877 - 1] != this.field1876) {
            return true;
        }
        while (this.field1877 < this.field1875.field1845) {
            if (this.field1875.field1846[this.field1877++].field1865 != this.field1875.field1846[this.field1877 - 1]) {
                this.field1876 = this.field1875.field1846[this.field1877 - 1].field1865;
                return true;
            }
            this.field1876 = this.field1875.field1846[this.field1877 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1878 == null) {
            throw new IllegalStateException();
        }
        this.field1878.method2298();
        this.field1878 = null;
    }
}
