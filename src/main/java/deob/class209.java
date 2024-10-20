package deob;

import java.util.Iterator;

@ObfuscatedName("hj")
public class class209 implements Iterator {

    @ObfuscatedName("hj.k")
    public class206 field3160;

    @ObfuscatedName("hj.q")
    public class212 field3158;

    @ObfuscatedName("hj.f")
    public class212 field3159 = null;

    public class209(class206 arg0) {
        this.field3160 = arg0;
        this.field3158 = this.field3160.field3153.field3167;
        this.field3159 = null;
    }

    public Object next() {
        class212 var1 = this.field3158;
        if (this.field3160.field3153 == var1) {
            var1 = null;
            this.field3158 = null;
        } else {
            this.field3158 = var1.field3167;
        }
        this.field3159 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3160.field3153 != this.field3158;
    }

    public void remove() {
        if (this.field3159 == null) {
            throw new IllegalStateException();
        }
        this.field3159.method3703();
        this.field3159 = null;
    }
}
