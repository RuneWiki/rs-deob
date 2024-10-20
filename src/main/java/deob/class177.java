package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class177 implements Iterator {

    @ObfuscatedName("fz.v")
    public class181 field2882;

    @ObfuscatedName("fz.t")
    public class191 field2881;

    @ObfuscatedName("fz.f")
    public int field2880;

    @ObfuscatedName("fz.j")
    public class191 field2883 = null;

    public class177(class181 arg0) {
        this.field2882 = arg0;
        this.method3245();
    }

    @ObfuscatedName("fz.v()V")
    public void method3245() {
        this.field2881 = this.field2882.field2893[0].field2912;
        this.field2880 = 1;
        this.field2883 = null;
    }

    public Object next() {
        if (this.field2882.field2893[this.field2880 - 1] != this.field2881) {
            class191 var1 = this.field2881;
            this.field2881 = var1.field2912;
            this.field2883 = var1;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2880 >= this.field2882.field2892) {
                return null;
            }
            var2 = this.field2882.field2893[this.field2880++].field2912;
        } while (this.field2882.field2893[this.field2880 - 1] == var2);
        this.field2881 = var2.field2912;
        this.field2883 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2882.field2893[this.field2880 - 1] != this.field2881) {
            return true;
        }
        while (this.field2880 < this.field2882.field2892) {
            if (this.field2882.field2893[this.field2880++].field2912 != this.field2882.field2893[this.field2880 - 1]) {
                this.field2881 = this.field2882.field2893[this.field2880 - 1].field2912;
                return true;
            }
            this.field2881 = this.field2882.field2893[this.field2880 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2883 == null) {
            throw new IllegalStateException();
        }
        this.field2883.method3392();
        this.field2883 = null;
    }
}
