package deob;

import java.util.Iterator;

@ObfuscatedName("ho")
public class class209 implements Iterator {

    @ObfuscatedName("ho.f")
    public class206 field3160;

    @ObfuscatedName("ho.e")
    public class212 field3159;

    @ObfuscatedName("ho.n")
    public class212 field3158 = null;

    public class209(class206 arg0) {
        this.field3160 = arg0;
        this.field3159 = this.field3160.field3154.field3166;
        this.field3158 = null;
    }

    public Object next() {
        class212 var1 = this.field3159;
        if (this.field3160.field3154 == var1) {
            var1 = null;
            this.field3159 = null;
        } else {
            this.field3159 = var1.field3166;
        }
        this.field3158 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3160.field3154 != this.field3159;
    }

    public void remove() {
        if (this.field3158 == null) {
            throw new IllegalStateException();
        }
        this.field3158.method3744();
        this.field3158 = null;
    }
}
