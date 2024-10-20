package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class206 implements Iterator {

    @ObfuscatedName("gp.j")
    public class200 field3098;

    @ObfuscatedName("gp.m")
    public class204 field3099;

    @ObfuscatedName("gp.f")
    public class204 field3100 = null;

    public class206(class200 arg0) {
        this.field3098 = arg0;
        this.field3099 = this.field3098.field3089.field3094;
        this.field3100 = null;
    }

    public Object next() {
        class204 var1 = this.field3099;
        if (this.field3098.field3089 == var1) {
            var1 = null;
            this.field3099 = null;
        } else {
            this.field3099 = var1.field3094;
        }
        this.field3100 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3098.field3089 != this.field3099;
    }

    public void remove() {
        if (this.field3100 == null) {
            throw new IllegalStateException();
        }
        this.field3100.method3680();
        this.field3100 = null;
    }
}
