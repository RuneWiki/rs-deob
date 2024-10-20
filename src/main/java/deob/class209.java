package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class209 implements Iterator {

    @ObfuscatedName("hg.a")
    public class206 field3164;

    @ObfuscatedName("hg.d")
    public class212 field3163;

    @ObfuscatedName("hg.v")
    public class212 field3162 = null;

    public class209(class206 arg0) {
        this.field3164 = arg0;
        this.field3163 = this.field3164.field3158.field3170;
        this.field3162 = null;
    }

    public Object next() {
        class212 var1 = this.field3163;
        if (this.field3164.field3158 == var1) {
            var1 = null;
            this.field3163 = null;
        } else {
            this.field3163 = var1.field3170;
        }
        this.field3162 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3164.field3158 != this.field3163;
    }

    public void remove() {
        if (this.field3162 == null) {
            throw new IllegalStateException();
        }
        this.field3162.method3729();
        this.field3162 = null;
    }
}
