package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class206 implements Iterator {

    @ObfuscatedName("gc.y")
    public class200 field3087;

    @ObfuscatedName("gc.d")
    public class204 field3086;

    @ObfuscatedName("gc.g")
    public class204 field3088 = null;

    public class206(class200 arg0) {
        this.field3087 = arg0;
        this.field3086 = this.field3087.field3077.field3081;
        this.field3088 = null;
    }

    public Object next() {
        class204 var1 = this.field3086;
        if (this.field3087.field3077 == var1) {
            var1 = null;
            this.field3086 = null;
        } else {
            this.field3086 = var1.field3081;
        }
        this.field3088 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3087.field3077 != this.field3086;
    }

    public void remove() {
        if (this.field3088 == null) {
            throw new IllegalStateException();
        }
        this.field3088.method3561();
        this.field3088 = null;
    }
}
