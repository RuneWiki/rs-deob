package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class185 implements Iterator {

    @ObfuscatedName("gs.p")
    public class189 field2984;

    @ObfuscatedName("gs.k")
    public class199 field2985;

    @ObfuscatedName("gs.e")
    public int field2983;

    @ObfuscatedName("gs.f")
    public class199 field2986 = null;

    public class185(class189 arg0) {
        this.field2984 = arg0;
        this.method3386();
    }

    @ObfuscatedName("gs.p()V")
    public void method3386() {
        this.field2985 = this.field2984.field2995[0].field3014;
        this.field2983 = 1;
        this.field2986 = null;
    }

    public Object next() {
        if (this.field2984.field2995[this.field2983 - 1] != this.field2985) {
            class199 var1 = this.field2985;
            this.field2985 = var1.field3014;
            this.field2986 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2983 >= this.field2984.field2996) {
                return null;
            }
            var2 = this.field2984.field2995[this.field2983++].field3014;
        } while (this.field2984.field2995[this.field2983 - 1] == var2);
        this.field2985 = var2.field3014;
        this.field2986 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2984.field2995[this.field2983 - 1] != this.field2985) {
            return true;
        }
        while (this.field2983 < this.field2984.field2996) {
            if (this.field2984.field2995[this.field2983++].field3014 != this.field2984.field2995[this.field2983 - 1]) {
                this.field2985 = this.field2984.field2995[this.field2983 - 1].field3014;
                return true;
            }
            this.field2985 = this.field2984.field2995[this.field2983 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2986 == null) {
            throw new IllegalStateException();
        }
        this.field2986.method3533();
        this.field2986 = null;
    }
}
