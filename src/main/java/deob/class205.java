package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class205 implements Iterator {

    @ObfuscatedName("ga.h")
    public class202 field3086;

    @ObfuscatedName("ga.q")
    public class208 field3087;

    @ObfuscatedName("ga.v")
    public class208 field3085 = null;

    public class205(class202 arg0) {
        this.field3086 = arg0;
        this.field3087 = this.field3086.field3081.field3094;
        this.field3085 = null;
    }

    public Object next() {
        class208 var1 = this.field3087;
        if (this.field3086.field3081 == var1) {
            var1 = null;
            this.field3087 = null;
        } else {
            this.field3087 = var1.field3094;
        }
        this.field3085 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3086.field3081 != this.field3087;
    }

    public void remove() {
        if (this.field3085 == null) {
            throw new IllegalStateException();
        }
        this.field3085.method3711();
        this.field3085 = null;
    }
}
