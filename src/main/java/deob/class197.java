package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class197 implements Iterator {

    @ObfuscatedName("gm.n")
    public class191 field3003;

    @ObfuscatedName("gm.d")
    public class195 field3002;

    @ObfuscatedName("gm.z")
    public class195 field3004 = null;

    public class197(class191 arg0) {
        this.field3003 = arg0;
        this.field3002 = this.field3003.field2993.field2997;
        this.field3004 = null;
    }

    public Object next() {
        class195 var1 = this.field3002;
        if (this.field3003.field2993 == var1) {
            var1 = null;
            this.field3002 = null;
        } else {
            this.field3002 = var1.field2997;
        }
        this.field3004 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3003.field2993 != this.field3002;
    }

    public void remove() {
        if (this.field3004 == null) {
            throw new IllegalStateException();
        }
        this.field3004.method3541();
        this.field3004 = null;
    }
}
