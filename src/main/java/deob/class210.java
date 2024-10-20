package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class210 implements Iterator {

    @ObfuscatedName("hg.x")
    public class204 field3169;

    @ObfuscatedName("hg.r")
    public class208 field3168;

    @ObfuscatedName("hg.j")
    public class208 field3170 = null;

    public class210(class204 arg0) {
        this.field3169 = arg0;
        this.field3168 = this.field3169.field3158.field3163;
        this.field3170 = null;
    }

    public Object next() {
        class208 var1 = this.field3168;
        if (this.field3169.field3158 == var1) {
            var1 = null;
            this.field3168 = null;
        } else {
            this.field3168 = var1.field3163;
        }
        this.field3170 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3169.field3158 != this.field3168;
    }

    public void remove() {
        if (this.field3170 == null) {
            throw new IllegalStateException();
        }
        this.field3170.method3675();
        this.field3170 = null;
    }
}
