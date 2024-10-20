package deob;

import java.util.Iterator;

@ObfuscatedName("ge")
public class class197 implements Iterator {

    @ObfuscatedName("ge.n")
    public class191 field3013;

    @ObfuscatedName("ge.o")
    public class195 field3014;

    @ObfuscatedName("ge.a")
    public class195 field3015 = null;

    public class197(class191 arg0) {
        this.field3013 = arg0;
        this.field3014 = this.field3013.field3004.field3008;
        this.field3015 = null;
    }

    public Object next() {
        class195 var1 = this.field3014;
        if (this.field3013.field3004 == var1) {
            var1 = null;
            this.field3014 = null;
        } else {
            this.field3014 = var1.field3008;
        }
        this.field3015 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3013.field3004 != this.field3014;
    }

    public void remove() {
        if (this.field3015 == null) {
            throw new IllegalStateException();
        }
        this.field3015.method3518();
        this.field3015 = null;
    }
}
