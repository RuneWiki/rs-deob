package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class205 implements Iterator {

    @ObfuscatedName("gx.o")
    public class202 field3089;

    @ObfuscatedName("gx.f")
    public class208 field3090;

    @ObfuscatedName("gx.i")
    public class208 field3091 = null;

    public class205(class202 arg0) {
        this.field3089 = arg0;
        this.field3090 = this.field3089.field3085.field3098;
        this.field3091 = null;
    }

    public Object next() {
        class208 var1 = this.field3090;
        if (this.field3089.field3085 == var1) {
            var1 = null;
            this.field3090 = null;
        } else {
            this.field3090 = var1.field3098;
        }
        this.field3091 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3089.field3085 != this.field3090;
    }

    public void remove() {
        if (this.field3091 == null) {
            throw new IllegalStateException();
        }
        this.field3091.method3605();
        this.field3091 = null;
    }
}
