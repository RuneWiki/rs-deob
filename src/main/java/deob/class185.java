package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class185 implements Iterator {

    @ObfuscatedName("gh.o")
    public class189 field2985;

    @ObfuscatedName("gh.l")
    public class199 field2982;

    @ObfuscatedName("gh.g")
    public int field2983;

    @ObfuscatedName("gh.u")
    public class199 field2984 = null;

    public class185(class189 arg0) {
        this.field2985 = arg0;
        this.method3414();
    }

    @ObfuscatedName("gh.o()V")
    public void method3414() {
        this.field2982 = this.field2985.field2995[0].field3013;
        this.field2983 = 1;
        this.field2984 = null;
    }

    public Object next() {
        if (this.field2985.field2995[this.field2983 - 1] != this.field2982) {
            class199 var1 = this.field2982;
            this.field2982 = var1.field3013;
            this.field2984 = var1;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2983 >= this.field2985.field2996) {
                return null;
            }
            var2 = this.field2985.field2995[this.field2983++].field3013;
        } while (this.field2985.field2995[this.field2983 - 1] == var2);
        this.field2982 = var2.field3013;
        this.field2984 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field2985.field2995[this.field2983 - 1] != this.field2982) {
            return true;
        }
        while (this.field2983 < this.field2985.field2996) {
            if (this.field2985.field2995[this.field2983++].field3013 != this.field2985.field2995[this.field2983 - 1]) {
                this.field2982 = this.field2985.field2995[this.field2983 - 1].field3013;
                return true;
            }
            this.field2982 = this.field2985.field2995[this.field2983 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field2984 == null) {
            throw new IllegalStateException();
        }
        this.field2984.method3564();
        this.field2984 = null;
    }
}
