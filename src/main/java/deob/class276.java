package deob;

import java.util.Iterator;

@ObfuscatedName("jt")
public class class276 implements Iterator {

    @ObfuscatedName("jt.m")
    public class272 field3612;

    @ObfuscatedName("jt.f")
    public class186 field3613;

    @ObfuscatedName("jt.q")
    public class186 field3611 = null;

    public class276(class272 arg0) {
        this.method4906(arg0);
    }

    @ObfuscatedName("jt.u(Lja;)V")
    public void method4906(class272 arg0) {
        this.field3612 = arg0;
        this.method4909();
    }

    @ObfuscatedName("jt.g()V")
    public void method4909() {
        this.field3613 = this.field3612 == null ? null : this.field3612.field3602.field2140;
        this.field3611 = null;
    }

    public Object next() {
        class186 var1 = this.field3613;
        if (this.field3612.field3602 == var1) {
            var1 = null;
            this.field3613 = null;
        } else {
            this.field3613 = var1.field2140;
        }
        this.field3611 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3612.field3602 != this.field3613;
    }

    public void remove() {
        if (this.field3611 == null) {
            throw new IllegalStateException();
        }
        this.field3611.method3306();
        this.field3611 = null;
    }
}
