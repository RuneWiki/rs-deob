package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class205 implements Iterator {

    @ObfuscatedName("gi.l")
    public class202 field3097;

    @ObfuscatedName("gi.e")
    public class208 field3098;

    @ObfuscatedName("gi.q")
    public class208 field3099 = null;

    public class205(class202 arg0) {
        this.field3097 = arg0;
        this.field3098 = this.field3097.field3093.field3106;
        this.field3099 = null;
    }

    public Object next() {
        class208 var1 = this.field3098;
        if (this.field3097.field3093 == var1) {
            var1 = null;
            this.field3098 = null;
        } else {
            this.field3098 = var1.field3106;
        }
        this.field3099 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3097.field3093 != this.field3098;
    }

    public void remove() {
        if (this.field3099 == null) {
            throw new IllegalStateException();
        }
        this.field3099.method3620();
        this.field3099 = null;
    }
}
