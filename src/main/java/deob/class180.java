package deob;

@ObfuscatedName("fx")
public class class180 {

    @ObfuscatedName("fx.f")
    public class189 field2867 = new class189();

    @ObfuscatedName("fx.k")
    public class189 field2866;

    public class180() {
        this.field2867.field2883 = this.field2867;
        this.field2867.field2884 = this.field2867;
    }

    @ObfuscatedName("fx.f()V")
    public void method3292() {
        while (true) {
            class189 var1 = this.field2867.field2883;
            if (this.field2867 == var1) {
                this.field2866 = null;
                return;
            }
            var1.method3367();
        }
    }

    @ObfuscatedName("fx.k(Lgx;)V")
    public void method3276(class189 arg0) {
        if (arg0.field2884 != null) {
            arg0.method3367();
        }
        arg0.field2884 = this.field2867.field2884;
        arg0.field2883 = this.field2867;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
    }

    @ObfuscatedName("fx.y(Lgx;)V")
    public void method3274(class189 arg0) {
        if (arg0.field2884 != null) {
            arg0.method3367();
        }
        arg0.field2884 = this.field2867;
        arg0.field2883 = this.field2867.field2883;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
    }

    @ObfuscatedName("fx.e(Lgx;Lgx;)V")
    public static void method3278(class189 arg0, class189 arg1) {
        if (arg0.field2884 != null) {
            arg0.method3367();
        }
        arg0.field2884 = arg1.field2884;
        arg0.field2883 = arg1;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
    }

    @ObfuscatedName("fx.r()Lgx;")
    public class189 method3275() {
        class189 var1 = this.field2867.field2883;
        if (this.field2867 == var1) {
            return null;
        } else {
            var1.method3367();
            return var1;
        }
    }

    @ObfuscatedName("fx.a()Lgx;")
    public class189 method3280() {
        class189 var1 = this.field2867.field2884;
        if (this.field2867 == var1) {
            return null;
        } else {
            var1.method3367();
            return var1;
        }
    }

    @ObfuscatedName("fx.n()Lgx;")
    public class189 method3285() {
        class189 var1 = this.field2867.field2883;
        if (this.field2867 == var1) {
            this.field2866 = null;
            return null;
        } else {
            this.field2866 = var1.field2883;
            return var1;
        }
    }

    @ObfuscatedName("fx.x()Lgx;")
    public class189 method3282() {
        class189 var1 = this.field2867.field2884;
        if (this.field2867 == var1) {
            this.field2866 = null;
            return null;
        } else {
            this.field2866 = var1.field2884;
            return var1;
        }
    }

    @ObfuscatedName("fx.g()Lgx;")
    public class189 method3286() {
        class189 var1 = this.field2866;
        if (this.field2867 == var1) {
            this.field2866 = null;
            return null;
        } else {
            this.field2866 = var1.field2883;
            return var1;
        }
    }

    @ObfuscatedName("fx.o()Lgx;")
    public class189 method3279() {
        class189 var1 = this.field2866;
        if (this.field2867 == var1) {
            this.field2866 = null;
            return null;
        } else {
            this.field2866 = var1.field2884;
            return var1;
        }
    }
}
