package deob;

import java.util.Iterator;

@ObfuscatedName("lc")
public class class327 implements Iterator {

    @ObfuscatedName("lc.c")
    public class328 field4012;

    @ObfuscatedName("lc.l")
    public class392 field4013;

    @ObfuscatedName("lc.s")
    public class392 field4014 = null;

    public class327(class328 arg0) {
        this.method5298(arg0);
    }

    @ObfuscatedName("lc.c(Llt;)V")
    public void method5298(class328 arg0) {
        this.field4012 = arg0;
        this.method5302();
    }

    @ObfuscatedName("lc.l()V")
    public void method5302() {
        this.field4013 = this.field4012 == null ? null : this.field4012.field4016.field4300;
        this.field4014 = null;
    }

    public Object next() {
        class392 var1 = this.field4013;
        if (this.field4012.field4016 == var1) {
            var1 = null;
            this.field4013 = null;
        } else {
            this.field4013 = var1.field4300;
        }
        this.field4014 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4012.field4016 != this.field4013 && this.field4013 != null;
    }

    public void remove() {
        if (this.field4014 == null) {
            throw new IllegalStateException();
        }
        this.field4014.method6167();
        this.field4014 = null;
    }
}
