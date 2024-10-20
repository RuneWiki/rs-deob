package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class185 implements Iterator {

    @ObfuscatedName("gd.t")
    public class189 field2983;

    @ObfuscatedName("gd.b")
    public class199 field2984;

    @ObfuscatedName("gd.p")
    public int field2985;

    @ObfuscatedName("gd.e")
    public class199 field2986 = null;

    public class185(class189 arg0) {
        this.field2983 = arg0;
        this.method3354();
    }

    @ObfuscatedName("gd.t()V")
    public void method3354() {
        this.field2984 = this.field2983.field2996[0].field3014;
        this.field2985 = 1;
        this.field2986 = null;
    }

    public Object next() {
        if (this.field2983.field2996[this.field2985 - 1] != this.field2984) {
            class199 var1 = this.field2984;
            this.field2984 = var1.field3014;
            this.field2986 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2985 >= this.field2983.field2997) {
                return null;
            }
            var2 = this.field2983.field2996[this.field2985++].field3014;
        } while (this.field2983.field2996[this.field2985 - 1] == var2);
        this.field2984 = var2.field3014;
        this.field2986 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2983.field2996[this.field2985 - 1] != this.field2984) {
            return true;
        }
        while (this.field2985 < this.field2983.field2997) {
            if (this.field2983.field2996[this.field2985++].field3014 != this.field2983.field2996[this.field2985 - 1]) {
                this.field2984 = this.field2983.field2996[this.field2985 - 1].field3014;
                return true;
            }
            this.field2984 = this.field2983.field2996[this.field2985 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2986 == null) {
            throw new IllegalStateException();
        }
        this.field2986.method3506();
        this.field2986 = null;
    }
}
