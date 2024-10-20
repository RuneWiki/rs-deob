package deob;

import java.util.Iterator;

@ObfuscatedName("lw")
public class class336 implements Iterator {

    @ObfuscatedName("lw.s")
    public class337 field4127;

    @ObfuscatedName("lw.h")
    public class411 field4128;

    @ObfuscatedName("lw.w")
    public class411 field4129 = null;

    public class336(class337 arg0) {
        this.method5465(arg0);
    }

    @ObfuscatedName("lw.s(Llx;)V")
    public void method5465(class337 arg0) {
        this.field4127 = arg0;
        this.method5460();
    }

    @ObfuscatedName("lw.h()V")
    public void method5460() {
        this.field4128 = this.field4127 == null ? null : this.field4127.field4131.field4469;
        this.field4129 = null;
    }

    public Object next() {
        class411 var1 = this.field4128;
        if (this.field4127.field4131 == var1) {
            var1 = null;
            this.field4128 = null;
        } else {
            this.field4128 = var1.field4469;
        }
        this.field4129 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4127.field4131 != this.field4128 && this.field4128 != null;
    }

    public void remove() {
        if (this.field4129 == null) {
            throw new IllegalStateException();
        }
        this.field4129.method6409();
        this.field4129 = null;
    }
}
