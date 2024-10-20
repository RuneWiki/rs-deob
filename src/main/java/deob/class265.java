package deob;

import java.util.Iterator;

@ObfuscatedName("jk")
public class class265 implements Iterator {

    @ObfuscatedName("jk.a")
    public class261 field3535;

    @ObfuscatedName("jk.t")
    public class181 field3536;

    @ObfuscatedName("jk.n")
    public class181 field3534 = null;

    public class265(class261 arg0) {
        this.method4634(arg0);
    }

    @ObfuscatedName("jk.d(Ljm;)V")
    public void method4634(class261 arg0) {
        this.field3535 = arg0;
        this.method4623();
    }

    @ObfuscatedName("jk.m()V")
    public void method4623() {
        this.field3536 = this.field3535 == null ? null : this.field3535.field3526.field2090;
        this.field3534 = null;
    }

    public Object next() {
        class181 var1 = this.field3536;
        if (this.field3535.field3526 == var1) {
            var1 = null;
            this.field3536 = null;
        } else {
            this.field3536 = var1.field2090;
        }
        this.field3534 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3535.field3526 != this.field3536;
    }

    public void remove() {
        if (this.field3534 == null) {
            throw new IllegalStateException();
        }
        this.field3534.method3386();
        this.field3534 = null;
    }
}
