package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public class class206 implements Iterator {

    @ObfuscatedName("gw.c")
    public class200 field3092;

    @ObfuscatedName("gw.h")
    public class204 field3091;

    @ObfuscatedName("gw.k")
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
        this.field3093.method3626();
        this.field3093 = null;
    }
}
