package deob;

import java.util.Iterator;

@ObfuscatedName("fn")
public class class177 implements Iterator {

    @ObfuscatedName("fn.a")
    public class181 field2878;

    @ObfuscatedName("fn.v")
    public class191 field2877;

    @ObfuscatedName("fn.i")
    public int field2876;

    @ObfuscatedName("fn.b")
    public class191 field2879 = null;

    public class177(class181 arg0) {
        this.field2878 = arg0;
        this.method3193();
    }

    @ObfuscatedName("fn.a()V")
    public void method3193() {
        this.field2877 = this.field2878.field2889[0].field2909;
        this.field2876 = 1;
        this.field2879 = null;
    }

    public Object next() {
        if (this.field2878.field2889[this.field2876 - 1] != this.field2877) {
            class191 var1 = this.field2877;
            this.field2877 = var1.field2909;
            this.field2879 = var1;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2876 >= this.field2878.field2890) {
                return null;
            }
            var2 = this.field2878.field2889[this.field2876++].field2909;
        } while (this.field2878.field2889[this.field2876 - 1] == var2);
        this.field2877 = var2.field2909;
        this.field2879 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2878.field2889[this.field2876 - 1] != this.field2877) {
            return true;
        }
        while (this.field2876 < this.field2878.field2890) {
            if (this.field2878.field2889[this.field2876++].field2909 != this.field2878.field2889[this.field2876 - 1]) {
                this.field2877 = this.field2878.field2889[this.field2876 - 1].field2909;
                return true;
            }
            this.field2877 = this.field2878.field2889[this.field2876 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2879 == null) {
            throw new IllegalStateException();
        }
        this.field2879.method3343();
        this.field2879 = null;
    }
}
