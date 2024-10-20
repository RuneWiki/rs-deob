package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class205 implements Iterator {

    @ObfuscatedName("gr.i")
    public class202 field3091;

    @ObfuscatedName("gr.v")
    public class208 field3092;

    @ObfuscatedName("gr.r")
    public class208 field3093 = null;

    public class205(class202 arg0) {
        this.field3091 = arg0;
        this.field3092 = this.field3091.field3087.field3099;
        this.field3093 = null;
    }

    public Object next() {
        class208 var1 = this.field3092;
        if (this.field3091.field3087 == var1) {
            var1 = null;
            this.field3092 = null;
        } else {
            this.field3092 = var1.field3099;
        }
        this.field3093 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3091.field3087 != this.field3092;
    }

    public void remove() {
        if (this.field3093 == null) {
            throw new IllegalStateException();
        }
        this.field3093.method3626();
        this.field3093 = null;
    }
}
