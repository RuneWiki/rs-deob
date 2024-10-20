package deob;

@ObfuscatedName("jp")
public class class272 {

    @ObfuscatedName("jp.m")
    public class190 field3568 = new class190();

    @ObfuscatedName("jp.o")
    public class190 field3567;

    public class272() {
        this.field3568.field2153 = this.field3568;
        this.field3568.field2151 = this.field3568;
    }

    @ObfuscatedName("jp.m()V")
    public void method4671() {
        while (true) {
            class190 var1 = this.field3568.field2153;
            if (this.field3568 == var1) {
                this.field3567 = null;
                return;
            }
            var1.method3388();
        }
    }

    @ObfuscatedName("jp.o(Lgr;)V")
    public void method4644(class190 arg0) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        arg0.field2151 = this.field3568.field2151;
        arg0.field2153 = this.field3568;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
    }

    @ObfuscatedName("jp.q(Lgr;)V")
    public void method4647(class190 arg0) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        arg0.field2151 = this.field3568;
        arg0.field2153 = this.field3568.field2153;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
    }

    @ObfuscatedName("jp.j(Lgr;Lgr;)V")
    public static void method4648(class190 arg0, class190 arg1) {
        if (arg0.field2151 != null) {
            arg0.method3388();
        }
        arg0.field2151 = arg1.field2151;
        arg0.field2153 = arg1;
        arg0.field2151.field2153 = arg0;
        arg0.field2153.field2151 = arg0;
    }

    @ObfuscatedName("jp.p()Lgr;")
    public class190 method4653() {
        class190 var1 = this.field3568.field2153;
        if (this.field3568 == var1) {
            return null;
        } else {
            var1.method3388();
            return var1;
        }
    }

    @ObfuscatedName("jp.g()Lgr;")
    public class190 method4650() {
        class190 var1 = this.field3568.field2151;
        if (this.field3568 == var1) {
            return null;
        } else {
            var1.method3388();
            return var1;
        }
    }

    @ObfuscatedName("jp.n()Lgr;")
    public class190 method4651() {
        class190 var1 = this.field3568.field2153;
        if (this.field3568 == var1) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var1.field2153;
            return var1;
        }
    }

    @ObfuscatedName("jp.u()Lgr;")
    public class190 method4652() {
        class190 var1 = this.field3568.field2151;
        if (this.field3568 == var1) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var1.field2151;
            return var1;
        }
    }

    @ObfuscatedName("jp.a()Lgr;")
    public class190 method4656() {
        class190 var1 = this.field3567;
        if (this.field3568 == var1) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var1.field2153;
            return var1;
        }
    }

    @ObfuscatedName("jp.z()Lgr;")
    public class190 method4654() {
        class190 var1 = this.field3567;
        if (this.field3568 == var1) {
            this.field3567 = null;
            return null;
        } else {
            this.field3567 = var1.field2151;
            return var1;
        }
    }
}
