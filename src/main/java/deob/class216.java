package deob;

import java.util.Iterator;

@ObfuscatedName("hj")
public class class216 implements Iterable {

    @ObfuscatedName("hj.z")
    public class207 field2446 = new class207();

    @ObfuscatedName("hj.w")
    public class207 field2445;

    public class216() {
        this.field2446.field2427 = this.field2446;
        this.field2446.field2428 = this.field2446;
    }

    @ObfuscatedName("hj.z()V")
    public void method3844() {
        while (this.field2446.field2427 != this.field2446) {
            this.field2446.field2427.method3793();
        }
    }

    @ObfuscatedName("hj.w(Lgw;)V")
    public void method3831(class207 arg0) {
        if (arg0.field2428 != null) {
            arg0.method3793();
        }
        arg0.field2428 = this.field2446.field2428;
        arg0.field2427 = this.field2446;
        arg0.field2428.field2427 = arg0;
        arg0.field2427.field2428 = arg0;
    }

    @ObfuscatedName("hj.s()Lgw;")
    public class207 method3832() {
        class207 var1 = this.field2446.field2427;
        if (this.field2446 == var1) {
            return null;
        } else {
            var1.method3793();
            return var1;
        }
    }

    @ObfuscatedName("hj.l()Lgw;")
    public class207 method3853() {
        return this.method3836((class207) null);
    }

    @ObfuscatedName("hj.u(Lgw;)Lgw;")
    public class207 method3836(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2446.field2427;
        } else {
            var2 = arg0;
        }
        if (this.field2446 == var2) {
            this.field2445 = null;
            return null;
        } else {
            this.field2445 = var2.field2427;
            return var2;
        }
    }

    @ObfuscatedName("hj.q()Lgw;")
    public class207 method3835() {
        class207 var1 = this.field2445;
        if (this.field2446 == var1) {
            this.field2445 = null;
            return null;
        } else {
            this.field2445 = var1.field2427;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class215(this);
    }
}
