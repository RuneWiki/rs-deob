package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class205 implements Iterator {

    @ObfuscatedName("gz.f")
    public class202 field3099;

    @ObfuscatedName("gz.s")
    public class208 field3098;

    @ObfuscatedName("gz.q")
    public class208 field3097 = null;

    public class205(class202 arg0) {
        this.field3099 = arg0;
        this.field3098 = this.field3099.field3093.field3106;
        this.field3097 = null;
    }

    public Object next() {
        class208 var1 = this.field3098;
        if (this.field3099.field3093 == var1) {
            var1 = null;
            this.field3098 = null;
        } else {
            this.field3098 = var1.field3106;
        }
        this.field3097 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3099.field3093 != this.field3098;
    }

    public void remove() {
        if (this.field3097 == null) {
            throw new IllegalStateException();
        }
        this.field3097.method3665();
        this.field3097 = null;
    }
}
