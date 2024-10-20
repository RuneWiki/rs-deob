package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class206 implements Iterator {

    @ObfuscatedName("gn.z")
    public class200 field3098;

    @ObfuscatedName("gn.q")
    public class204 field3097;

    @ObfuscatedName("gn.k")
    public class204 field3096 = null;

    public class206(class200 arg0) {
        this.field3098 = arg0;
        this.field3097 = this.field3098.field3087.field3092;
        this.field3096 = null;
    }

    public Object next() {
        class204 var1 = this.field3097;
        if (this.field3098.field3087 == var1) {
            var1 = null;
            this.field3097 = null;
        } else {
            this.field3097 = var1.field3092;
        }
        this.field3096 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3098.field3087 != this.field3097;
    }

    public void remove() {
        if (this.field3096 == null) {
            throw new IllegalStateException();
        }
        this.field3096.method3565();
        this.field3096 = null;
    }
}
