package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class205 implements Iterator {

    @ObfuscatedName("gp.d")
    public class202 field3098;

    @ObfuscatedName("gp.p")
    public class208 field3097;

    @ObfuscatedName("gp.v")
    public class208 field3099 = null;

    public class205(class202 arg0) {
        this.field3098 = arg0;
        this.field3097 = this.field3098.field3093.field3105;
        this.field3099 = null;
    }

    public Object next() {
        class208 var1 = this.field3097;
        if (this.field3098.field3093 == var1) {
            var1 = null;
            this.field3097 = null;
        } else {
            this.field3097 = var1.field3105;
        }
        this.field3099 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3098.field3093 != this.field3097;
    }

    public void remove() {
        if (this.field3099 == null) {
            throw new IllegalStateException();
        }
        this.field3099.method3715();
        this.field3099 = null;
    }
}
