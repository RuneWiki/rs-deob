package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class195 implements Iterator {

    @ObfuscatedName("gy.f")
    public class199 field3086;

    @ObfuscatedName("gy.u")
    public class209 field3085;

    @ObfuscatedName("gy.x")
    public int field3087;

    @ObfuscatedName("gy.b")
    public class209 field3088 = null;

    public class195(class199 arg0) {
        this.field3086 = arg0;
        this.method3533();
    }

    @ObfuscatedName("gy.f()V")
    public void method3533() {
        this.field3085 = this.field3086.field3097[0].field3117;
        this.field3087 = 1;
        this.field3088 = null;
    }

    public Object next() {
        if (this.field3086.field3097[this.field3087 - 1] != this.field3085) {
            class209 var1 = this.field3085;
            this.field3085 = var1.field3117;
            this.field3088 = var1;
            return var1;
        }
        class209 var2;
        do {
            if (this.field3087 >= this.field3086.field3098) {
                return null;
            }
            var2 = this.field3086.field3097[this.field3087++].field3117;
        } while (this.field3086.field3097[this.field3087 - 1] == var2);
        this.field3085 = var2.field3117;
        this.field3088 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3086.field3097[this.field3087 - 1] != this.field3085) {
            return true;
        }
        while (this.field3087 < this.field3086.field3098) {
            if (this.field3086.field3097[this.field3087++].field3117 != this.field3086.field3097[this.field3087 - 1]) {
                this.field3085 = this.field3086.field3097[this.field3087 - 1].field3117;
                return true;
            }
            this.field3085 = this.field3086.field3097[this.field3087 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3088 == null) {
            throw new IllegalStateException();
        }
        this.field3088.method3679();
        this.field3088 = null;
    }
}
