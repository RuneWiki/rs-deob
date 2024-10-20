package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class185 implements Iterator {

    @ObfuscatedName("gf.n")
    public class189 field2988;

    @ObfuscatedName("gf.g")
    public class199 field2987;

    @ObfuscatedName("gf.a")
    public int field2986;

    @ObfuscatedName("gf.m")
    public class199 field2989 = null;

    public class185(class189 arg0) {
        this.field2988 = arg0;
        this.method3412();
    }

    @ObfuscatedName("gf.n()V")
    public void method3412() {
        this.field2987 = this.field2988.field2999[0].field3017;
        this.field2986 = 1;
        this.field2989 = null;
    }

    public Object next() {
        if (this.field2988.field2999[this.field2986 - 1] != this.field2987) {
            class199 var1 = this.field2987;
            this.field2987 = var1.field3017;
            this.field2989 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2986 >= this.field2988.field2998) {
                return null;
            }
            var2 = this.field2988.field2999[this.field2986++].field3017;
        } while (this.field2988.field2999[this.field2986 - 1] == var2);
        this.field2987 = var2.field3017;
        this.field2989 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2988.field2999[this.field2986 - 1] != this.field2987) {
            return true;
        }
        while (this.field2986 < this.field2988.field2998) {
            if (this.field2988.field2999[this.field2986++].field3017 != this.field2988.field2999[this.field2986 - 1]) {
                this.field2987 = this.field2988.field2999[this.field2986 - 1].field3017;
                return true;
            }
            this.field2987 = this.field2988.field2999[this.field2986 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2989 == null) {
            throw new IllegalStateException();
        }
        this.field2989.method3554();
        this.field2989 = null;
    }
}
