package deob;

@ObfuscatedName("gm")
public class class190 {

    @ObfuscatedName("gm.n")
    public class199 field3001 = new class199();

    @ObfuscatedName("gm.g")
    public class199 field3002;

    public class190() {
        this.field3001.field3017 = this.field3001;
        this.field3001.field3019 = this.field3001;
    }

    @ObfuscatedName("gm.n()V")
    public void method3480() {
        while (true) {
            class199 var1 = this.field3001.field3017;
            if (this.field3001 == var1) {
                this.field3002 = null;
                return;
            }
            var1.method3554();
        }
    }

    @ObfuscatedName("gm.g(Lgg;)V")
    public void method3463(class199 arg0) {
        if (arg0.field3019 != null) {
            arg0.method3554();
        }
        arg0.field3019 = this.field3001.field3019;
        arg0.field3017 = this.field3001;
        arg0.field3019.field3017 = arg0;
        arg0.field3017.field3019 = arg0;
    }

    @ObfuscatedName("gm.a(Lgg;)V")
    public void method3464(class199 arg0) {
        if (arg0.field3019 != null) {
            arg0.method3554();
        }
        arg0.field3019 = this.field3001;
        arg0.field3017 = this.field3001.field3017;
        arg0.field3019.field3017 = arg0;
        arg0.field3017.field3019 = arg0;
    }

    @ObfuscatedName("gm.m(Lgg;Lgg;)V")
    public static void method3465(class199 arg0, class199 arg1) {
        if (arg0.field3019 != null) {
            arg0.method3554();
        }
        arg0.field3019 = arg1.field3019;
        arg0.field3017 = arg1;
        arg0.field3019.field3017 = arg0;
        arg0.field3017.field3019 = arg0;
    }

    @ObfuscatedName("gm.s()Lgg;")
    public class199 method3466() {
        class199 var1 = this.field3001.field3017;
        if (this.field3001 == var1) {
            return null;
        } else {
            var1.method3554();
            return var1;
        }
    }

    @ObfuscatedName("gm.j()Lgg;")
    public class199 method3474() {
        class199 var1 = this.field3001.field3019;
        if (this.field3001 == var1) {
            return null;
        } else {
            var1.method3554();
            return var1;
        }
    }

    @ObfuscatedName("gm.f()Lgg;")
    public class199 method3468() {
        class199 var1 = this.field3001.field3017;
        if (this.field3001 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3017;
            return var1;
        }
    }

    @ObfuscatedName("gm.b()Lgg;")
    public class199 method3469() {
        class199 var1 = this.field3001.field3019;
        if (this.field3001 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3019;
            return var1;
        }
    }

    @ObfuscatedName("gm.t()Lgg;")
    public class199 method3470() {
        class199 var1 = this.field3002;
        if (this.field3001 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3017;
            return var1;
        }
    }

    @ObfuscatedName("gm.i()Lgg;")
    public class199 method3471() {
        class199 var1 = this.field3002;
        if (this.field3001 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3019;
            return var1;
        }
    }
}
