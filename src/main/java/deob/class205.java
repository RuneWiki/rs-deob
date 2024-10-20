package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class205 implements Iterator {

    @ObfuscatedName("ge.m")
    public class202 field3085;

    @ObfuscatedName("ge.l")
    public class208 field3086;

    @ObfuscatedName("ge.y")
    public class208 field3087 = null;

    public class205(class202 arg0) {
        this.field3085 = arg0;
        this.field3086 = this.field3085.field3081.field3094;
        this.field3087 = null;
    }

    public Object next() {
        class208 var1 = this.field3086;
        if (this.field3085.field3081 == var1) {
            var1 = null;
            this.field3086 = null;
        } else {
            this.field3086 = var1.field3094;
        }
        this.field3087 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3085.field3081 != this.field3086;
    }

    public void remove() {
        if (this.field3087 == null) {
            throw new IllegalStateException();
        }
        this.field3087.method3702();
        this.field3087 = null;
    }
}
