package deob;

import java.util.Iterator;

@ObfuscatedName("hp")
public class class210 implements Iterator {

    @ObfuscatedName("hp.e")
    public class204 field3159;

    @ObfuscatedName("hp.l")
    public class208 field3158;

    @ObfuscatedName("hp.c")
    public class208 field3157 = null;

    public class210(class204 arg0) {
        this.field3159 = arg0;
        this.field3158 = this.field3159.field3147.field3153;
        this.field3157 = null;
    }

    public Object next() {
        class208 var1 = this.field3158;
        if (this.field3159.field3147 == var1) {
            var1 = null;
            this.field3158 = null;
        } else {
            this.field3158 = var1.field3153;
        }
        this.field3157 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3159.field3147 != this.field3158;
    }

    public void remove() {
        if (this.field3157 == null) {
            throw new IllegalStateException();
        }
        this.field3157.method3733();
        this.field3157 = null;
    }
}
