package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class194 implements Iterator {

    @ObfuscatedName("gw.g")
    public class198 field3067;

    @ObfuscatedName("gw.b")
    public class208 field3068;

    @ObfuscatedName("gw.w")
    public int field3069;

    @ObfuscatedName("gw.d")
    public class208 field3070 = null;

    public class194(class198 arg0) {
        this.field3067 = arg0;
        this.method3543();
    }

    @ObfuscatedName("gw.g()V")
    public void method3543() {
        this.field3068 = this.field3067.field3080[0].field3098;
        this.field3069 = 1;
        this.field3070 = null;
    }

    public Object next() {
        if (this.field3067.field3080[this.field3069 - 1] != this.field3068) {
            class208 var1 = this.field3068;
            this.field3068 = var1.field3098;
            this.field3070 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3069 >= this.field3067.field3081) {
                return null;
            }
            var2 = this.field3067.field3080[this.field3069++].field3098;
        } while (this.field3067.field3080[this.field3069 - 1] == var2);
        this.field3068 = var2.field3098;
        this.field3070 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3067.field3080[this.field3069 - 1] != this.field3068) {
            return true;
        }
        while (this.field3069 < this.field3067.field3081) {
            if (this.field3067.field3080[this.field3069++].field3098 != this.field3067.field3080[this.field3069 - 1]) {
                this.field3068 = this.field3067.field3080[this.field3069 - 1].field3098;
                return true;
            }
            this.field3068 = this.field3067.field3080[this.field3069 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3070 == null) {
            throw new IllegalStateException();
        }
        this.field3070.method3693();
        this.field3070 = null;
    }
}
