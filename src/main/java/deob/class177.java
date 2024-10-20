package deob;

@ObfuscatedName("fa")
public class class177 {

    @ObfuscatedName("fa.b")
    public class184 field2849 = new class184();

    @ObfuscatedName("fa.u")
    public class184 field2848;

    public class177() {
        this.field2849.field2860 = this.field2849;
        this.field2849.field2862 = this.field2849;
    }

    @ObfuscatedName("fa.b()V")
    public void method3179() {
        while (true) {
            class184 var1 = this.field2849.field2860;
            if (this.field2849 == var1) {
                this.field2848 = null;
                return;
            }
            var1.method3260();
        }
    }

    @ObfuscatedName("fa.u(Lge;)V")
    public void method3180(class184 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        arg0.field2862 = this.field2849.field2862;
        arg0.field2860 = this.field2849;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
    }

    @ObfuscatedName("fa.x(Lge;)V")
    public void method3181(class184 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        arg0.field2862 = this.field2849;
        arg0.field2860 = this.field2849.field2860;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
    }

    @ObfuscatedName("fa.j(Lge;Lge;)V")
    public static void method3201(class184 arg0, class184 arg1) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        arg0.field2862 = arg1.field2862;
        arg0.field2860 = arg1;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
    }

    @ObfuscatedName("fa.o()Lge;")
    public class184 method3217() {
        class184 var1 = this.field2849.field2860;
        if (this.field2849 == var1) {
            return null;
        } else {
            var1.method3260();
            return var1;
        }
    }

    @ObfuscatedName("fa.n()Lge;")
    public class184 method3184() {
        class184 var1 = this.field2849.field2862;
        if (this.field2849 == var1) {
            return null;
        } else {
            var1.method3260();
            return var1;
        }
    }

    @ObfuscatedName("fa.y()Lge;")
    public class184 method3185() {
        class184 var1 = this.field2849.field2860;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2860;
            return var1;
        }
    }

    @ObfuscatedName("fa.f()Lge;")
    public class184 method3186() {
        class184 var1 = this.field2849.field2862;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2862;
            return var1;
        }
    }

    @ObfuscatedName("fa.p()Lge;")
    public class184 method3187() {
        class184 var1 = this.field2848;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2860;
            return var1;
        }
    }

    @ObfuscatedName("fa.l()Lge;")
    public class184 method3188() {
        class184 var1 = this.field2848;
        if (this.field2849 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2862;
            return var1;
        }
    }
}
