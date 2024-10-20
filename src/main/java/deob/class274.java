package deob;

import java.util.Iterator;

@ObfuscatedName("jl")
public class class274 implements Iterator {

    @ObfuscatedName("jl.m")
    public class276 field3572;

    @ObfuscatedName("jl.o")
    public class185 field3571;

    @ObfuscatedName("jl.q")
    public class185 field3573 = null;

    public class274(class276 arg0) {
        this.field3572 = arg0;
        this.field3571 = this.field3572.field3578.field2143;
        this.field3573 = null;
    }

    public Object next() {
        class185 var1 = this.field3571;
        if (this.field3572.field3578 == var1) {
            var1 = null;
            this.field3571 = null;
        } else {
            this.field3571 = var1.field2143;
        }
        this.field3573 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3572.field3578 != this.field3571;
    }

    public void remove() {
        if (this.field3573 == null) {
            throw new IllegalStateException();
        }
        this.field3573.method3379();
        this.field3573 = null;
    }
}
