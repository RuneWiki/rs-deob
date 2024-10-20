package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class206 implements Iterator {

    @ObfuscatedName("gg.n")
    public class200 field3092;

    @ObfuscatedName("gg.d")
    public class204 field3091;

    @ObfuscatedName("gg.s")
    public class204 field3093 = null;

    public class206(class200 arg0) {
        this.field3092 = arg0;
        this.field3091 = this.field3092.field3082.field3087;
        this.field3093 = null;
    }

    public Object next() {
        class204 var1 = this.field3091;
        if (this.field3092.field3082 == var1) {
            var1 = null;
            this.field3091 = null;
        } else {
            this.field3091 = var1.field3087;
        }
        this.field3093 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3092.field3082 != this.field3091;
    }

    public void remove() {
        if (this.field3093 == null) {
            throw new IllegalStateException();
        }
        this.field3093.method3627();
        this.field3093 = null;
    }
}
