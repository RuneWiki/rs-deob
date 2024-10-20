package deob;

@ObfuscatedName("gc")
public class class190 {

    @ObfuscatedName("gc.n")
    public class199 field3003 = new class199();

    @ObfuscatedName("gc.o")
    public class199 field3002;

    public class190() {
        this.field3003.field3019 = this.field3003;
        this.field3003.field3020 = this.field3003;
    }

    @ObfuscatedName("gc.n()V")
    public void method3440() {
        while (true) {
            class199 var1 = this.field3003.field3019;
            if (this.field3003 == var1) {
                this.field3002 = null;
                return;
            }
            var1.method3540();
        }
    }

    @ObfuscatedName("gc.o(Lga;)V")
    public void method3441(class199 arg0) {
        if (arg0.field3020 != null) {
            arg0.method3540();
        }
        arg0.field3020 = this.field3003.field3020;
        arg0.field3019 = this.field3003;
        arg0.field3020.field3019 = arg0;
        arg0.field3019.field3020 = arg0;
    }

    @ObfuscatedName("gc.a(Lga;)V")
    public void method3442(class199 arg0) {
        if (arg0.field3020 != null) {
            arg0.method3540();
        }
        arg0.field3020 = this.field3003;
        arg0.field3019 = this.field3003.field3019;
        arg0.field3020.field3019 = arg0;
        arg0.field3019.field3020 = arg0;
    }

    @ObfuscatedName("gc.w(Lga;Lga;)V")
    public static void method3464(class199 arg0, class199 arg1) {
        if (arg0.field3020 != null) {
            arg0.method3540();
        }
        arg0.field3020 = arg1.field3020;
        arg0.field3019 = arg1;
        arg0.field3020.field3019 = arg0;
        arg0.field3019.field3020 = arg0;
    }

    @ObfuscatedName("gc.m()Lga;")
    public class199 method3445() {
        class199 var1 = this.field3003.field3019;
        if (this.field3003 == var1) {
            return null;
        } else {
            var1.method3540();
            return var1;
        }
    }

    @ObfuscatedName("gc.h()Lga;")
    public class199 method3443() {
        class199 var1 = this.field3003.field3020;
        if (this.field3003 == var1) {
            return null;
        } else {
            var1.method3540();
            return var1;
        }
    }

    @ObfuscatedName("gc.i()Lga;")
    public class199 method3451() {
        class199 var1 = this.field3003.field3019;
        if (this.field3003 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3019;
            return var1;
        }
    }

    @ObfuscatedName("gc.r()Lga;")
    public class199 method3447() {
        class199 var1 = this.field3003.field3020;
        if (this.field3003 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3020;
            return var1;
        }
    }

    @ObfuscatedName("gc.l()Lga;")
    public class199 method3448() {
        class199 var1 = this.field3002;
        if (this.field3003 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3019;
            return var1;
        }
    }

    @ObfuscatedName("gc.f()Lga;")
    public class199 method3449() {
        class199 var1 = this.field3002;
        if (this.field3003 == var1) {
            this.field3002 = null;
            return null;
        } else {
            this.field3002 = var1.field3020;
            return var1;
        }
    }
}
