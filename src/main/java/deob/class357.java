package deob;

import java.util.Iterator;

@ObfuscatedName("mf")
public class class357 implements Iterator {

    @ObfuscatedName("mf.f")
    public class358 field4346;

    @ObfuscatedName("mf.w")
    public class440 field4347;

    @ObfuscatedName("mf.v")
    public class440 field4348 = null;

    public class357(class358 arg0) {
        this.method6273(arg0);
    }

    @ObfuscatedName("mf.f(Lmt;)V")
    public void method6273(class358 arg0) {
        this.field4346 = arg0;
        this.method6274();
    }

    @ObfuscatedName("mf.w()V")
    public void method6274() {
        this.field4347 = this.field4346 == null ? null : this.field4346.field4350.field4710;
        this.field4348 = null;
    }

    public Object next() {
        class440 var1 = this.field4347;
        if (this.field4346.field4350 == var1) {
            var1 = null;
            this.field4347 = null;
        } else {
            this.field4347 = var1.field4710;
        }
        this.field4348 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4346.field4350 != this.field4347 && this.field4347 != null;
    }

    public void remove() {
        if (this.field4348 == null) {
            throw new IllegalStateException();
        }
        this.field4348.method7431();
        this.field4348 = null;
    }
}
