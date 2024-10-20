package deob;

import java.util.Iterator;

@ObfuscatedName("jm")
public class class276 implements Iterator {

    @ObfuscatedName("jm.f")
    public class277 field3392;

    @ObfuscatedName("jm.o")
    public class346 field3390;

    @ObfuscatedName("jm.u")
    public class346 field3391 = null;

    public class276(class277 arg0) {
        this.field3392 = arg0;
        this.field3390 = this.field3392.field3393.field3936;
        this.field3391 = null;
    }

    public Object next() {
        class346 var1 = this.field3390;
        if (this.field3392.field3393 == var1) {
            var1 = null;
            this.field3390 = null;
        } else {
            this.field3390 = var1.field3936;
        }
        this.field3391 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3392.field3393 != this.field3390;
    }

    public void remove() {
        if (this.field3391 == null) {
            throw new IllegalStateException();
        }
        this.field3391.method5349();
        this.field3391 = null;
    }
}
