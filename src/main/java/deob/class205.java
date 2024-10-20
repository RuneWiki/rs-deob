package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class205 implements Iterator {

    @ObfuscatedName("gg.a")
    public class202 field3104;

    @ObfuscatedName("gg.r")
    public class208 field3102;

    @ObfuscatedName("gg.f")
    public class208 field3103 = null;

    public class205(class202 arg0) {
        this.field3104 = arg0;
        this.field3102 = this.field3104.field3098.field3111;
        this.field3103 = null;
    }

    public Object next() {
        class208 var1 = this.field3102;
        if (this.field3104.field3098 == var1) {
            var1 = null;
            this.field3102 = null;
        } else {
            this.field3102 = var1.field3111;
        }
        this.field3103 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3104.field3098 != this.field3102;
    }

    public void remove() {
        if (this.field3103 == null) {
            throw new IllegalStateException();
        }
        this.field3103.method3661();
        this.field3103 = null;
    }
}
