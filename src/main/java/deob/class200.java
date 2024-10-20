package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class200 implements Iterator {

    @ObfuscatedName("gy.j")
    public class194 field3039;

    @ObfuscatedName("gy.y")
    public class198 field3038;

    @ObfuscatedName("gy.z")
    public class198 field3040 = null;

    public class200(class194 arg0) {
        this.field3039 = arg0;
        this.field3038 = this.field3039.field3029.field3033;
        this.field3040 = null;
    }

    public Object next() {
        class198 var1 = this.field3038;
        if (this.field3039.field3029 == var1) {
            var1 = null;
            this.field3038 = null;
        } else {
            this.field3038 = var1.field3033;
        }
        this.field3040 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3039.field3029 != this.field3038;
    }

    public void remove() {
        if (this.field3040 == null) {
            throw new IllegalStateException();
        }
        this.field3040.method3552();
        this.field3040 = null;
    }
}
