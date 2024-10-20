package deob;

import java.util.Iterator;

@ObfuscatedName("ej")
public class class133 implements Iterator {

    @ObfuscatedName("ej.o")
    public class122 field1907;

    @ObfuscatedName("ej.m")
    public class128 field1906;

    @ObfuscatedName("ej.b")
    public int field1905;

    @ObfuscatedName("ej.g")
    public class128 field1908 = null;

    public class133(class122 arg0) {
        this.field1907 = arg0;
        this.method2250();
    }

    @ObfuscatedName("ej.l()V")
    public void method2250() {
        this.field1906 = this.field1907.field1876[0].field1895;
        this.field1905 = 1;
        this.field1908 = null;
    }

    public Object next() {
        if (this.field1907.field1876[this.field1905 - 1] != this.field1906) {
            class128 var1 = this.field1906;
            this.field1906 = var1.field1895;
            this.field1908 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1905 >= this.field1907.field1877) {
                return null;
            }
            var2 = this.field1907.field1876[this.field1905++].field1895;
        } while (this.field1907.field1876[this.field1905 - 1] == var2);
        this.field1906 = var2.field1895;
        this.field1908 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1907.field1876[this.field1905 - 1] != this.field1906) {
            return true;
        }
        while (this.field1905 < this.field1907.field1877) {
            if (this.field1907.field1876[this.field1905++].field1895 != this.field1907.field1876[this.field1905 - 1]) {
                this.field1906 = this.field1907.field1876[this.field1905 - 1].field1895;
                return true;
            }
            this.field1906 = this.field1907.field1876[this.field1905 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1908 == null) {
            throw new IllegalStateException();
        }
        this.field1908.method2189();
        this.field1908 = null;
    }
}
