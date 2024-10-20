package deob;

import java.util.Iterator;

@ObfuscatedName("et")
public class class133 implements Iterator {

    @ObfuscatedName("et.f")
    public class122 field1918;

    @ObfuscatedName("et.i")
    public class128 field1916;

    @ObfuscatedName("et.u")
    public int field1917;

    @ObfuscatedName("et.h")
    public class128 field1915 = null;

    public class133(class122 arg0) {
        this.field1918 = arg0;
        this.method2351();
    }

    @ObfuscatedName("et.w()V")
    public void method2351() {
        this.field1916 = this.field1918.field1886[0].field1906;
        this.field1917 = 1;
        this.field1915 = null;
    }

    public Object next() {
        if (this.field1918.field1886[this.field1917 - 1] != this.field1916) {
            class128 var1 = this.field1916;
            this.field1916 = var1.field1906;
            this.field1915 = var1;
            return var1;
        }
        class128 var2;
        do {
            if (this.field1917 >= this.field1918.field1887) {
                return null;
            }
            var2 = this.field1918.field1886[this.field1917++].field1906;
        } while (this.field1918.field1886[this.field1917 - 1] == var2);
        this.field1916 = var2.field1906;
        this.field1915 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field1918.field1886[this.field1917 - 1] != this.field1916) {
            return true;
        }
        while (this.field1917 < this.field1918.field1887) {
            if (this.field1918.field1886[this.field1917++].field1906 != this.field1918.field1886[this.field1917 - 1]) {
                this.field1916 = this.field1918.field1886[this.field1917 - 1].field1906;
                return true;
            }
            this.field1916 = this.field1918.field1886[this.field1917 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field1915 == null) {
            throw new IllegalStateException();
        }
        this.field1915.method2289();
        this.field1915 = null;
    }
}
