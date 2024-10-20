package deob;

import java.util.Iterator;

@ObfuscatedName("lx")
public class class335 implements Iterator {

    @ObfuscatedName("lx.c")
    public class336 field4125;

    @ObfuscatedName("lx.v")
    public class410 field4126;

    @ObfuscatedName("lx.q")
    public class410 field4127 = null;

    public class335(class336 arg0) {
        this.method5563(arg0);
    }

    @ObfuscatedName("lx.c(Llk;)V")
    public void method5563(class336 arg0) {
        this.field4125 = arg0;
        this.method5565();
    }

    @ObfuscatedName("lx.v()V")
    public void method5565() {
        this.field4126 = this.field4125 == null ? null : this.field4125.field4128.field4463;
        this.field4127 = null;
    }

    public Object next() {
        class410 var1 = this.field4126;
        if (this.field4125.field4128 == var1) {
            var1 = null;
            this.field4126 = null;
        } else {
            this.field4126 = var1.field4463;
        }
        this.field4127 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4125.field4128 != this.field4126 && this.field4126 != null;
    }

    public void remove() {
        if (this.field4127 == null) {
            throw new IllegalStateException();
        }
        this.field4127.method6497();
        this.field4127 = null;
    }
}
