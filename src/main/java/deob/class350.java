package deob;

import java.util.Iterator;

@ObfuscatedName("mt")
public class class350 implements Iterator {

    @ObfuscatedName("mt.a")
    public class351 field4277;

    @ObfuscatedName("mt.f")
    public class430 field4278;

    @ObfuscatedName("mt.c")
    public class430 field4279 = null;

    public class350(class351 arg0) {
        this.method6061(arg0);
    }

    @ObfuscatedName("mt.a(Lml;)V")
    public void method6061(class351 arg0) {
        this.field4277 = arg0;
        this.method6058();
    }

    @ObfuscatedName("mt.f()V")
    public void method6058() {
        this.field4278 = this.field4277 == null ? null : this.field4277.field4280.field4636;
        this.field4279 = null;
    }

    public Object next() {
        class430 var1 = this.field4278;
        if (this.field4277.field4280 == var1) {
            var1 = null;
            this.field4278 = null;
        } else {
            this.field4278 = var1.field4636;
        }
        this.field4279 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4277.field4280 != this.field4278 && this.field4278 != null;
    }

    public void remove() {
        if (this.field4279 == null) {
            throw new IllegalStateException();
        }
        this.field4279.method7170();
        this.field4279 = null;
    }
}
