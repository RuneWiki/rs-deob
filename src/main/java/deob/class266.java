package deob;

import java.util.Iterator;

@ObfuscatedName("jz")
public class class266 implements Iterable {

    @ObfuscatedName("jz.u")
    public class176 field3549 = new class176();

    @ObfuscatedName("jz.f")
    public class176 field3550;

    public class266() {
        this.field3549.field2119 = this.field3549;
        this.field3549.field2120 = this.field3549;
    }

    @ObfuscatedName("jz.u()V")
    public void method4632() {
        while (this.field3549.field2119 != this.field3549) {
            this.field3549.field2119.method3319();
        }
    }

    @ObfuscatedName("jz.f(Lfn;)V")
    public void method4631(class176 arg0) {
        if (arg0.field2120 != null) {
            arg0.method3319();
        }
        arg0.field2120 = this.field3549.field2120;
        arg0.field2119 = this.field3549;
        arg0.field2120.field2119 = arg0;
        arg0.field2119.field2120 = arg0;
    }

    @ObfuscatedName("jz.b(Lfn;Lfn;)V")
    public static void method4637(class176 arg0, class176 arg1) {
        if (arg0.field2120 != null) {
            arg0.method3319();
        }
        arg0.field2120 = arg1;
        arg0.field2119 = arg1.field2119;
        arg0.field2120.field2119 = arg0;
        arg0.field2119.field2120 = arg0;
    }

    @ObfuscatedName("jz.g()Lfn;")
    public class176 method4640() {
        class176 var1 = this.field3549.field2119;
        if (this.field3549 == var1) {
            return null;
        } else {
            var1.method3319();
            return var1;
        }
    }

    @ObfuscatedName("jz.z()Lfn;")
    public class176 method4634() {
        return this.method4635((class176) null);
    }

    @ObfuscatedName("jz.p(Lfn;)Lfn;")
    public class176 method4635(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3549.field2119;
        } else {
            var2 = arg0;
        }
        if (this.field3549 == var2) {
            this.field3550 = null;
            return null;
        } else {
            this.field3550 = var2.field2119;
            return var2;
        }
    }

    @ObfuscatedName("jz.h()Lfn;")
    public class176 method4649() {
        class176 var1 = this.field3550;
        if (this.field3549 == var1) {
            this.field3550 = null;
            return null;
        } else {
            this.field3550 = var1.field2119;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
