package deob;

@ObfuscatedName("fa")
public class class177 {

    @ObfuscatedName("fa.j")
    public class184 field2848 = new class184();

    @ObfuscatedName("fa.z")
    public class184 field2849;

    public class177() {
        this.field2848.field2860 = this.field2848;
        this.field2848.field2862 = this.field2848;
    }

    @ObfuscatedName("fa.j()V")
    public void method3264() {
        while (true) {
            class184 var1 = this.field2848.field2860;
            if (this.field2848 == var1) {
                this.field2849 = null;
                return;
            }
            var1.method3309();
        }
    }

    @ObfuscatedName("fa.z(Lgb;)V")
    public void method3253(class184 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3309();
        }
        arg0.field2862 = this.field2848.field2862;
        arg0.field2860 = this.field2848;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
    }

    @ObfuscatedName("fa.y(Lgb;)V")
    public void method3237(class184 arg0) {
        if (arg0.field2862 != null) {
            arg0.method3309();
        }
        arg0.field2862 = this.field2848;
        arg0.field2860 = this.field2848.field2860;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
    }

    @ObfuscatedName("fa.h(Lgb;Lgb;)V")
    public static void method3238(class184 arg0, class184 arg1) {
        if (arg0.field2862 != null) {
            arg0.method3309();
        }
        arg0.field2862 = arg1.field2862;
        arg0.field2860 = arg1;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
    }

    @ObfuscatedName("fa.r()Lgb;")
    public class184 method3239() {
        class184 var1 = this.field2848.field2860;
        if (this.field2848 == var1) {
            return null;
        } else {
            var1.method3309();
            return var1;
        }
    }

    @ObfuscatedName("fa.e()Lgb;")
    public class184 method3240() {
        class184 var1 = this.field2848.field2862;
        if (this.field2848 == var1) {
            return null;
        } else {
            var1.method3309();
            return var1;
        }
    }

    @ObfuscatedName("fa.k()Lgb;")
    public class184 method3236() {
        class184 var1 = this.field2848.field2860;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2860;
            return var1;
        }
    }

    @ObfuscatedName("fa.b()Lgb;")
    public class184 method3256() {
        class184 var1 = this.field2848.field2862;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2862;
            return var1;
        }
    }

    @ObfuscatedName("fa.n()Lgb;")
    public class184 method3243() {
        class184 var1 = this.field2849;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2860;
            return var1;
        }
    }

    @ObfuscatedName("fa.a()Lgb;")
    public class184 method3244() {
        class184 var1 = this.field2849;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2862;
            return var1;
        }
    }
}
