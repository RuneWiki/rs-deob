package deob;

@ObfuscatedName("ke")
public class class296 {

    @ObfuscatedName("ke.s")
    public class354 field3718 = new class354();

    @ObfuscatedName("ke.t")
    public class354 field3719;

    public class296() {
        this.field3718.field3965 = this.field3718;
        this.field3718.field3967 = this.field3718;
    }

    @ObfuscatedName("ke.s()V")
    public void method4705() {
        while (true) {
            class354 var1 = this.field3718.field3965;
            if (this.field3718 == var1) {
                this.field3719 = null;
                return;
            }
            var1.method5447();
        }
    }

    @ObfuscatedName("ke.t(Lml;)V")
    public void method4706(class354 arg0) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        arg0.field3967 = this.field3718.field3967;
        arg0.field3965 = this.field3718;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
    }

    @ObfuscatedName("ke.v(Lml;)V")
    public void method4707(class354 arg0) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        arg0.field3967 = this.field3718;
        arg0.field3965 = this.field3718.field3965;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
    }

    @ObfuscatedName("ke.j(Lml;Lml;)V")
    public static void method4708(class354 arg0, class354 arg1) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        arg0.field3967 = arg1.field3967;
        arg0.field3965 = arg1;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
    }

    @ObfuscatedName("ke.l()Lml;")
    public class354 method4733() {
        class354 var1 = this.field3718.field3965;
        if (this.field3718 == var1) {
            return null;
        } else {
            var1.method5447();
            return var1;
        }
    }

    @ObfuscatedName("ke.n()Lml;")
    public class354 method4709() {
        class354 var1 = this.field3718.field3967;
        if (this.field3718 == var1) {
            return null;
        } else {
            var1.method5447();
            return var1;
        }
    }

    @ObfuscatedName("ke.w()Lml;")
    public class354 method4721() {
        class354 var1 = this.field3718.field3965;
        if (this.field3718 == var1) {
            this.field3719 = null;
            return null;
        } else {
            this.field3719 = var1.field3965;
            return var1;
        }
    }

    @ObfuscatedName("ke.f()Lml;")
    public class354 method4728() {
        class354 var1 = this.field3718.field3967;
        if (this.field3718 == var1) {
            this.field3719 = null;
            return null;
        } else {
            this.field3719 = var1.field3967;
            return var1;
        }
    }

    @ObfuscatedName("ke.o()Lml;")
    public class354 method4712() {
        class354 var1 = this.field3719;
        if (this.field3718 == var1) {
            this.field3719 = null;
            return null;
        } else {
            this.field3719 = var1.field3965;
            return var1;
        }
    }

    @ObfuscatedName("ke.x()Lml;")
    public class354 method4713() {
        class354 var1 = this.field3719;
        if (this.field3718 == var1) {
            this.field3719 = null;
            return null;
        } else {
            this.field3719 = var1.field3967;
            return var1;
        }
    }
}
