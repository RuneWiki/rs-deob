package deob;

import java.util.Iterator;

@ObfuscatedName("jl")
public class class275 implements Iterator {

    @ObfuscatedName("jl.m")
    public class277 field3608;

    @ObfuscatedName("jl.f")
    public class181 field3609;

    @ObfuscatedName("jl.q")
    public class181 field3610 = null;

    public class275(class277 arg0) {
        this.field3608 = arg0;
        this.field3609 = this.field3608.field3614.field2132;
        this.field3610 = null;
    }

    public Object next() {
        class181 var1 = this.field3609;
        if (this.field3608.field3614 == var1) {
            var1 = null;
            this.field3609 = null;
        } else {
            this.field3609 = var1.field2132;
        }
        this.field3610 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3608.field3614 != this.field3609;
    }

    public void remove() {
        if (this.field3610 == null) {
            throw new IllegalStateException();
        }
        this.field3610.method3294();
        this.field3610 = null;
    }
}
