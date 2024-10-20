package deob;

import java.util.Iterator;

@ObfuscatedName("mu")
public class class353 implements Iterator {

    @ObfuscatedName("mu.h")
    public class354 field4334;

    @ObfuscatedName("mu.e")
    public class433 field4333;

    @ObfuscatedName("mu.v")
    public class433 field4332 = null;

    public class353(class354 arg0) {
        this.method6111(arg0);
    }

    @ObfuscatedName("mu.h(Lmv;)V")
    public void method6111(class354 arg0) {
        this.field4334 = arg0;
        this.method6115();
    }

    @ObfuscatedName("mu.e()V")
    public void method6115() {
        this.field4333 = this.field4334 == null ? null : this.field4334.field4335.field4684;
        this.field4332 = null;
    }

    public Object next() {
        class433 var1 = this.field4333;
        if (this.field4334.field4335 == var1) {
            var1 = null;
            this.field4333 = null;
        } else {
            this.field4333 = var1.field4684;
        }
        this.field4332 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4334.field4335 != this.field4333 && this.field4333 != null;
    }

    public void remove() {
        if (this.field4332 == null) {
            throw new IllegalStateException();
        }
        this.field4332.method7230();
        this.field4332 = null;
    }
}
