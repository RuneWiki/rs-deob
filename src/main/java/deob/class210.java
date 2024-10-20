package deob;

import java.util.Iterator;

@ObfuscatedName("hp")
public class class210 implements Iterator {

    @ObfuscatedName("hp.s")
    public class204 field3163;

    @ObfuscatedName("hp.z")
    public class208 field3162;

    @ObfuscatedName("hp.t")
    public class208 field3161 = null;

    public class210(class204 arg0) {
        this.field3163 = arg0;
        this.field3162 = this.field3163.field3151.field3156;
        this.field3161 = null;
    }

    public Object next() {
        class208 var1 = this.field3162;
        if (this.field3163.field3151 == var1) {
            var1 = null;
            this.field3162 = null;
        } else {
            this.field3162 = var1.field3156;
        }
        this.field3161 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3163.field3151 != this.field3162;
    }

    public void remove() {
        if (this.field3161 == null) {
            throw new IllegalStateException();
        }
        this.field3161.method3674();
        this.field3161 = null;
    }
}
