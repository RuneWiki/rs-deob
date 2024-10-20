package deob;

import java.util.Iterator;

@ObfuscatedName("ju")
public class class275 implements Iterator {

    @ObfuscatedName("ju.m")
    public class271 field3575;

    @ObfuscatedName("ju.o")
    public class190 field3574;

    @ObfuscatedName("ju.q")
    public class190 field3576 = null;

    public class275(class271 arg0) {
        this.method4692(arg0);
    }

    @ObfuscatedName("ju.g(Ljx;)V")
    public void method4692(class271 arg0) {
        this.field3575 = arg0;
        this.method4693();
    }

    @ObfuscatedName("ju.n()V")
    public void method4693() {
        this.field3574 = this.field3575 == null ? null : this.field3575.field3565.field2153;
        this.field3576 = null;
    }

    public Object next() {
        class190 var1 = this.field3574;
        if (this.field3575.field3565 == var1) {
            var1 = null;
            this.field3574 = null;
        } else {
            this.field3574 = var1.field2153;
        }
        this.field3576 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3575.field3565 != this.field3574;
    }

    public void remove() {
        if (this.field3576 == null) {
            throw new IllegalStateException();
        }
        this.field3576.method3388();
        this.field3576 = null;
    }
}
