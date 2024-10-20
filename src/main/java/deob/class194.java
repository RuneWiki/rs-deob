package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class194 implements Iterator {

    @ObfuscatedName("gv.i")
    public class198 field3068;

    @ObfuscatedName("gv.v")
    public class208 field3070;

    @ObfuscatedName("gv.f")
    public int field3069;

    @ObfuscatedName("gv.h")
    public class208 field3067 = null;

    public class194(class198 arg0) {
        this.field3068 = arg0;
        this.method3477();
    }

    @ObfuscatedName("gv.i()V")
    public void method3477() {
        this.field3070 = this.field3068.field3080[0].field3098;
        this.field3069 = 1;
        this.field3067 = null;
    }

    public Object next() {
        if (this.field3068.field3080[this.field3069 - 1] != this.field3070) {
            class208 var1 = this.field3070;
            this.field3070 = var1.field3098;
            this.field3067 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3069 >= this.field3068.field3081) {
                return null;
            }
            var2 = this.field3068.field3080[this.field3069++].field3098;
        } while (this.field3068.field3080[this.field3069 - 1] == var2);
        this.field3070 = var2.field3098;
        this.field3067 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3068.field3080[this.field3069 - 1] != this.field3070) {
            return true;
        }
        while (this.field3069 < this.field3068.field3081) {
            if (this.field3068.field3080[this.field3069++].field3098 != this.field3068.field3080[this.field3069 - 1]) {
                this.field3070 = this.field3068.field3080[this.field3069 - 1].field3098;
                return true;
            }
            this.field3070 = this.field3068.field3080[this.field3069 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3067 == null) {
            throw new IllegalStateException();
        }
        this.field3067.method3624();
        this.field3067 = null;
    }
}
