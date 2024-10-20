package deob;

import java.util.Iterator;

@ObfuscatedName("jn")
public class class266 implements Iterable {

    @ObfuscatedName("jn.c")
    public class176 field3519 = new class176();

    @ObfuscatedName("jn.x")
    public class176 field3520;

    public class266() {
        this.field3519.field2087 = this.field3519;
        this.field3519.field2086 = this.field3519;
    }

    @ObfuscatedName("jn.c()V")
    public void method4606() {
        while (this.field3519.field2087 != this.field3519) {
            this.field3519.field2087.method3320();
        }
    }

    @ObfuscatedName("jn.x(Lfv;)V")
    public void method4607(class176 arg0) {
        if (arg0.field2086 != null) {
            arg0.method3320();
        }
        arg0.field2086 = this.field3519.field2086;
        arg0.field2087 = this.field3519;
        arg0.field2086.field2087 = arg0;
        arg0.field2087.field2086 = arg0;
    }

    @ObfuscatedName("jn.t(Lfv;Lfv;)V")
    public static void method4612(class176 arg0, class176 arg1) {
        if (arg0.field2086 != null) {
            arg0.method3320();
        }
        arg0.field2086 = arg1;
        arg0.field2087 = arg1.field2087;
        arg0.field2086.field2087 = arg0;
        arg0.field2087.field2086 = arg0;
    }

    @ObfuscatedName("jn.g()Lfv;")
    public class176 method4608() {
        class176 var1 = this.field3519.field2087;
        if (this.field3519 == var1) {
            return null;
        } else {
            var1.method3320();
            return var1;
        }
    }

    @ObfuscatedName("jn.l()Lfv;")
    public class176 method4609() {
        return this.method4610((class176) null);
    }

    @ObfuscatedName("jn.u(Lfv;)Lfv;")
    public class176 method4610(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3519.field2087;
        } else {
            var2 = arg0;
        }
        if (this.field3519 == var2) {
            this.field3520 = null;
            return null;
        } else {
            this.field3520 = var2.field2087;
            return var2;
        }
    }

    @ObfuscatedName("jn.j()Lfv;")
    public class176 method4626() {
        class176 var1 = this.field3520;
        if (this.field3519 == var1) {
            this.field3520 = null;
            return null;
        } else {
            this.field3520 = var1.field2087;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
