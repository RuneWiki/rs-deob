package deob;

import java.util.Iterator;

@ObfuscatedName("ph")
public class class402 implements Iterable {

    @ObfuscatedName("ph.aq")
    public class488 field4529 = new class488();

    @ObfuscatedName("ph.aw")
    public class488 field4530;

    public class402() {
        this.field4529.field4913 = this.field4529;
        this.field4529.field4914 = this.field4529;
    }

    @ObfuscatedName("ph.aq()V")
    public void method6835() {
        while (this.field4529.field4913 != this.field4529) {
            this.field4529.field4913.method7989();
        }
    }

    @ObfuscatedName("ph.aw(Lsm;)V")
    public void method6836(class488 arg0) {
        if (arg0.field4914 != null) {
            arg0.method7989();
        }
        arg0.field4914 = this.field4529.field4914;
        arg0.field4913 = this.field4529;
        arg0.field4914.field4913 = arg0;
        arg0.field4913.field4914 = arg0;
    }

    @ObfuscatedName("ph.al(Lsm;Lsm;)V")
    public static void method6837(class488 arg0, class488 arg1) {
        if (arg0.field4914 != null) {
            arg0.method7989();
        }
        arg0.field4914 = arg1;
        arg0.field4913 = arg1.field4913;
        arg0.field4914.field4913 = arg0;
        arg0.field4913.field4914 = arg0;
    }

    @ObfuscatedName("ph.ai()Lsm;")
    public class488 method6838() {
        class488 var1 = this.field4529.field4913;
        if (this.field4529 == var1) {
            return null;
        } else {
            var1.method7989();
            return var1;
        }
    }

    @ObfuscatedName("ph.ar()Lsm;")
    public class488 method6839() {
        return this.method6840((class488) null);
    }

    @ObfuscatedName("ph.as(Lsm;)Lsm;")
    public class488 method6840(class488 arg0) {
        class488 var2;
        if (arg0 == null) {
            var2 = this.field4529.field4913;
        } else {
            var2 = arg0;
        }
        if (this.field4529 == var2) {
            this.field4530 = null;
            return null;
        } else {
            this.field4530 = var2.field4913;
            return var2;
        }
    }

    @ObfuscatedName("ph.aa()Lsm;")
    public class488 method6841() {
        class488 var1 = this.field4530;
        if (this.field4529 == var1) {
            this.field4530 = null;
            return null;
        } else {
            this.field4530 = var1.field4913;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class401(this);
    }
}
