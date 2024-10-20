package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class195 implements Iterator {

    @ObfuscatedName("gt.e")
    public class199 field3084;

    @ObfuscatedName("gt.w")
    public class209 field3085;

    @ObfuscatedName("gt.f")
    public int field3087;

    @ObfuscatedName("gt.s")
    public class209 field3086 = null;

    public class195(class199 arg0) {
        this.field3084 = arg0;
        this.method3485();
    }

    @ObfuscatedName("gt.e()V")
    public void method3485() {
        this.field3085 = this.field3084.field3097[0].field3115;
        this.field3087 = 1;
        this.field3086 = null;
    }

    public Object next() {
        if (this.field3084.field3097[this.field3087 - 1] != this.field3085) {
            class209 var1 = this.field3085;
            this.field3085 = var1.field3115;
            this.field3086 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3087 >= this.field3084.field3096) {
                return null;
            }
            var2 = this.field3084.field3097[this.field3087++].field3115;
        } while (this.field3084.field3097[this.field3087 - 1] == var2);
        this.field3085 = var2.field3115;
        this.field3086 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3084.field3097[this.field3087 - 1] != this.field3085) {
            return true;
        }
        while (this.field3087 < this.field3084.field3096) {
            if (this.field3084.field3097[this.field3087++].field3115 != this.field3084.field3097[this.field3087 - 1]) {
                this.field3085 = this.field3084.field3097[this.field3087 - 1].field3115;
                return true;
            }
            this.field3085 = this.field3084.field3097[this.field3087 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3086 == null) {
            throw new IllegalStateException();
        }
        this.field3086.method3632();
        this.field3086 = null;
    }
}
