package deob;

import java.util.Iterator;

@ObfuscatedName("lk")
public class class322 implements Iterator {

    @ObfuscatedName("lk.c")
    public class323 field3966;

    @ObfuscatedName("lk.b")
    public class387 field3965;

    @ObfuscatedName("lk.p")
    public class387 field3964 = null;

    public class322(class323 arg0) {
        this.method5331(arg0);
    }

    @ObfuscatedName("lk.c(Llr;)V")
    public void method5331(class323 arg0) {
        this.field3966 = arg0;
        this.method5340();
    }

    @ObfuscatedName("lk.b()V")
    public void method5340() {
        this.field3965 = this.field3966 == null ? null : this.field3966.field3967.field4258;
        this.field3964 = null;
    }

    public Object next() {
        class387 var1 = this.field3965;
        if (this.field3966.field3967 == var1) {
            var1 = null;
            this.field3965 = null;
        } else {
            this.field3965 = var1.field4258;
        }
        this.field3964 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3966.field3967 != this.field3965 && this.field3965 != null;
    }

    public void remove() {
        if (this.field3964 == null) {
            throw new IllegalStateException();
        }
        this.field3964.method6163();
        this.field3964 = null;
    }
}
