package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class205 implements Iterator {

    @ObfuscatedName("gc.n")
    public class202 field3102;

    @ObfuscatedName("gc.q")
    public class208 field3103;

    @ObfuscatedName("gc.c")
    public class208 field3104 = null;

    public class205(class202 arg0) {
        this.field3102 = arg0;
        this.field3103 = this.field3102.field3098.field3110;
        this.field3104 = null;
    }

    public Object next() {
        class208 var1 = this.field3103;
        if (this.field3102.field3098 == var1) {
            var1 = null;
            this.field3103 = null;
        } else {
            this.field3103 = var1.field3110;
        }
        this.field3104 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3102.field3098 != this.field3103;
    }

    public void remove() {
        if (this.field3104 == null) {
            throw new IllegalStateException();
        }
        this.field3104.method3651();
        this.field3104 = null;
    }
}
