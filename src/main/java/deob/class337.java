package deob;

import java.util.Iterator;

@ObfuscatedName("lp")
public class class337 implements Iterator {

    @ObfuscatedName("lp.c")
    public class338 field4169;

    @ObfuscatedName("lp.p")
    public class412 field4170;

    @ObfuscatedName("lp.f")
    public class412 field4171 = null;

    public class337(class338 arg0) {
        this.method5684(arg0);
    }

    @ObfuscatedName("lp.c(Llz;)V")
    public void method5684(class338 arg0) {
        this.field4169 = arg0;
        this.method5678();
    }

    @ObfuscatedName("lp.p()V")
    public void method5678() {
        this.field4170 = this.field4169 == null ? null : this.field4169.field4173.field4505;
        this.field4171 = null;
    }

    public Object next() {
        class412 var1 = this.field4170;
        if (this.field4169.field4173 == var1) {
            var1 = null;
            this.field4170 = null;
        } else {
            this.field4170 = var1.field4505;
        }
        this.field4171 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4169.field4173 != this.field4170 && this.field4170 != null;
    }

    public void remove() {
        if (this.field4171 == null) {
            throw new IllegalStateException();
        }
        this.field4171.method6657();
        this.field4171 = null;
    }
}
