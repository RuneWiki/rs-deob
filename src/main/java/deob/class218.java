package deob;

import java.util.Iterator;

@ObfuscatedName("hd")
public class class218 implements Iterable {

    @ObfuscatedName("hd.c")
    public class209 field2488 = new class209();

    @ObfuscatedName("hd.q")
    public class209 field2489;

    public class218() {
        this.field2488.field2471 = this.field2488;
        this.field2488.field2472 = this.field2488;
    }

    @ObfuscatedName("hd.c()V")
    public void method3801() {
        while (this.field2488.field2471 != this.field2488) {
            this.field2488.field2471.method3765();
        }
    }

    @ObfuscatedName("hd.q(Lhc;)V")
    public void method3802(class209 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3765();
        }
        arg0.field2472 = this.field2488.field2472;
        arg0.field2471 = this.field2488;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("hd.m()Lhc;")
    public class209 method3803() {
        class209 var1 = this.field2488.field2471;
        if (this.field2488 == var1) {
            return null;
        } else {
            var1.method3765();
            return var1;
        }
    }

    @ObfuscatedName("hd.j()Lhc;")
    public class209 method3825() {
        return this.method3804((class209) null);
    }

    @ObfuscatedName("hd.g(Lhc;)Lhc;")
    public class209 method3804(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field2488.field2471;
        } else {
            var2 = arg0;
        }
        if (this.field2488 == var2) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var2.field2471;
            return var2;
        }
    }

    @ObfuscatedName("hd.i()Lhc;")
    public class209 method3814() {
        class209 var1 = this.field2489;
        if (this.field2488 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2471;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class217(this);
    }
}
