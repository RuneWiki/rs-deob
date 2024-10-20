package deob;

import java.util.Iterator;

@ObfuscatedName("hq")
public class class210 implements Iterator {

    @ObfuscatedName("hq.m")
    public class204 field3163;

    @ObfuscatedName("hq.w")
    public class208 field3162;

    @ObfuscatedName("hq.e")
    public class208 field3164 = null;

    public class210(class204 arg0) {
        this.field3163 = arg0;
        this.field3162 = this.field3163.field3152.field3157;
        this.field3164 = null;
    }

    public Object next() {
        class208 var1 = this.field3162;
        if (this.field3163.field3152 == var1) {
            var1 = null;
            this.field3162 = null;
        } else {
            this.field3162 = var1.field3157;
        }
        this.field3164 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3163.field3152 != this.field3162;
    }

    public void remove() {
        if (this.field3164 == null) {
            throw new IllegalStateException();
        }
        this.field3164.method3699();
        this.field3164 = null;
    }
}
