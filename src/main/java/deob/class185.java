package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class185 implements Iterator {

    @ObfuscatedName("gz.n")
    public class189 field2990;

    @ObfuscatedName("gz.o")
    public class199 field2987;

    @ObfuscatedName("gz.a")
    public int field2989;

    @ObfuscatedName("gz.w")
    public class199 field2988 = null;

    public class185(class189 arg0) {
        this.field2990 = arg0;
        this.method3389();
    }

    @ObfuscatedName("gz.n()V")
    public void method3389() {
        this.field2987 = this.field2990.field3000[0].field3019;
        this.field2989 = 1;
        this.field2988 = null;
    }

    public Object next() {
        if (this.field2990.field3000[this.field2989 - 1] != this.field2987) {
            class199 var1 = this.field2987;
            this.field2987 = var1.field3019;
            this.field2988 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2989 >= this.field2990.field3001) {
                return null;
            }
            var2 = this.field2990.field3000[this.field2989++].field3019;
        } while (this.field2990.field3000[this.field2989 - 1] == var2);
        this.field2987 = var2.field3019;
        this.field2988 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2990.field3000[this.field2989 - 1] != this.field2987) {
            return true;
        }
        while (this.field2989 < this.field2990.field3001) {
            if (this.field2990.field3000[this.field2989++].field3019 != this.field2990.field3000[this.field2989 - 1]) {
                this.field2987 = this.field2990.field3000[this.field2989 - 1].field3019;
                return true;
            }
            this.field2987 = this.field2990.field3000[this.field2989 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2988 == null) {
            throw new IllegalStateException();
        }
        this.field2988.method3540();
        this.field2988 = null;
    }
}
