package deob;

import java.util.Iterator;

@ObfuscatedName("jv")
public class class266 implements Iterator {

    @ObfuscatedName("jv.c")
    public class262 field3538;

    @ObfuscatedName("jv.t")
    public class181 field3539;

    @ObfuscatedName("jv.o")
    public class181 field3540 = null;

    public class266(class262 arg0) {
        this.method4597(arg0);
    }

    @ObfuscatedName("jv.j(Ljj;)V")
    public void method4597(class262 arg0) {
        this.field3538 = arg0;
        this.method4603();
    }

    @ObfuscatedName("jv.m()V")
    public void method4603() {
        this.field3539 = this.field3538 == null ? null : this.field3538.field3530.field2114;
        this.field3540 = null;
    }

    public Object next() {
        class181 var1 = this.field3539;
        if (this.field3538.field3530 == var1) {
            var1 = null;
            this.field3539 = null;
        } else {
            this.field3539 = var1.field2114;
        }
        this.field3540 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3538.field3530 != this.field3539;
    }

    public void remove() {
        if (this.field3540 == null) {
            throw new IllegalStateException();
        }
        this.field3540.method3351();
        this.field3540 = null;
    }
}
