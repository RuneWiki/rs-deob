package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class194 implements Iterator {

    @ObfuscatedName("gj.o")
    public class198 field3066;

    @ObfuscatedName("gj.f")
    public class208 field3069;

    @ObfuscatedName("gj.i")
    public int field3068;

    @ObfuscatedName("gj.h")
    public class208 field3067 = null;

    public class194(class198 arg0) {
        this.field3066 = arg0;
        this.method3465();
    }

    @ObfuscatedName("gj.o()V")
    public void method3465() {
        this.field3069 = this.field3066.field3078[0].field3098;
        this.field3068 = 1;
        this.field3067 = null;
    }

    public Object next() {
        if (this.field3066.field3078[this.field3068 - 1] != this.field3069) {
            class208 var1 = this.field3069;
            this.field3069 = var1.field3098;
            this.field3067 = var1;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3068 >= this.field3066.field3079) {
                return null;
            }
            var2 = this.field3066.field3078[this.field3068++].field3098;
        } while (this.field3066.field3078[this.field3068 - 1] == var2);
        this.field3069 = var2.field3098;
        this.field3067 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3066.field3078[this.field3068 - 1] != this.field3069) {
            return true;
        }
        while (this.field3068 < this.field3066.field3079) {
            if (this.field3066.field3078[this.field3068++].field3098 != this.field3066.field3078[this.field3068 - 1]) {
                this.field3069 = this.field3066.field3078[this.field3068 - 1].field3098;
                return true;
            }
            this.field3069 = this.field3066.field3078[this.field3068 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3067 == null) {
            throw new IllegalStateException();
        }
        this.field3067.method3605();
        this.field3067 = null;
    }
}
