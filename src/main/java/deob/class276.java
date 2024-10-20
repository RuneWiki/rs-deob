package deob;

import java.util.Iterator;

@ObfuscatedName("js")
public class class276 implements Iterator {

    @ObfuscatedName("js.h")
    public class272 field3577;

    @ObfuscatedName("js.v")
    public class190 field3576;

    @ObfuscatedName("js.x")
    public class190 field3578 = null;

    public class276(class272 arg0) {
        this.method4596(arg0);
    }

    @ObfuscatedName("js.z(Ljn;)V")
    public void method4596(class272 arg0) {
        this.field3577 = arg0;
        this.method4591();
    }

    @ObfuscatedName("js.u()V")
    public void method4591() {
        this.field3576 = this.field3577 == null ? null : this.field3577.field3567.field2137;
        this.field3578 = null;
    }

    public Object next() {
        class190 var1 = this.field3576;
        if (this.field3577.field3567 == var1) {
            var1 = null;
            this.field3576 = null;
        } else {
            this.field3576 = var1.field2137;
        }
        this.field3578 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3577.field3567 != this.field3576;
    }

    public void remove() {
        if (this.field3578 == null) {
            throw new IllegalStateException();
        }
        this.field3578.method3359();
        this.field3578 = null;
    }
}
