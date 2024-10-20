package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public class class205 implements Iterator {

    @ObfuscatedName("gh.k")
    public class202 field3103;

    @ObfuscatedName("gh.h")
    public class208 field3101;

    @ObfuscatedName("gh.o")
    public class208 field3102 = null;

    public class205(class202 arg0) {
        this.field3103 = arg0;
        this.field3101 = this.field3103.field3097.field3110;
        this.field3102 = null;
    }

    public Object next() {
        class208 var1 = this.field3101;
        if (this.field3103.field3097 == var1) {
            var1 = null;
            this.field3101 = null;
        } else {
            this.field3101 = var1.field3110;
        }
        this.field3102 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3103.field3097 != this.field3101;
    }

    public void remove() {
        if (this.field3102 == null) {
            throw new IllegalStateException();
        }
        this.field3102.method3679();
        this.field3102 = null;
    }
}
