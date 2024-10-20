package deob;

@ObfuscatedName("gl")
public class class205 {

    @ObfuscatedName("gl.a")
    public class204 field2592 = new class204();

    @ObfuscatedName("gl.w")
    public class204 field2593;

    public class205() {
        this.field2592.field2590 = this.field2592;
        this.field2592.field2591 = this.field2592;
    }

    @ObfuscatedName("gl.a()V")
    public void method3464() {
        while (true) {
            class204 var1 = this.field2592.field2590;
            if (this.field2592 == var1) {
                this.field2593 = null;
                return;
            }
            var1.method3427();
        }
    }

    @ObfuscatedName("gl.w(Lgn;)V")
    public void method3446(class204 arg0) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        arg0.field2591 = this.field2592.field2591;
        arg0.field2590 = this.field2592;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
    }

    @ObfuscatedName("gl.e(Lgn;)V")
    public void method3460(class204 arg0) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        arg0.field2591 = this.field2592;
        arg0.field2590 = this.field2592.field2590;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
    }

    @ObfuscatedName("gl.k(Lgn;Lgn;)V")
    public static void method3439(class204 arg0, class204 arg1) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        arg0.field2591 = arg1.field2591;
        arg0.field2590 = arg1;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
    }

    @ObfuscatedName("gl.u()Lgn;")
    public class204 method3440() {
        class204 var1 = this.field2592.field2590;
        if (this.field2592 == var1) {
            return null;
        } else {
            var1.method3427();
            return var1;
        }
    }

    @ObfuscatedName("gl.z()Lgn;")
    public class204 method3441() {
        class204 var1 = this.field2592.field2591;
        if (this.field2592 == var1) {
            return null;
        } else {
            var1.method3427();
            return var1;
        }
    }

    @ObfuscatedName("gl.t()Lgn;")
    public class204 method3442() {
        class204 var1 = this.field2592.field2590;
        if (this.field2592 == var1) {
            this.field2593 = null;
            return null;
        } else {
            this.field2593 = var1.field2590;
            return var1;
        }
    }

    @ObfuscatedName("gl.f()Lgn;")
    public class204 method3443() {
        class204 var1 = this.field2592.field2591;
        if (this.field2592 == var1) {
            this.field2593 = null;
            return null;
        } else {
            this.field2593 = var1.field2591;
            return var1;
        }
    }

    @ObfuscatedName("gl.g()Lgn;")
    public class204 method3444() {
        class204 var1 = this.field2593;
        if (this.field2592 == var1) {
            this.field2593 = null;
            return null;
        } else {
            this.field2593 = var1.field2590;
            return var1;
        }
    }

    @ObfuscatedName("gl.x()Lgn;")
    public class204 method3445() {
        class204 var1 = this.field2593;
        if (this.field2592 == var1) {
            this.field2593 = null;
            return null;
        } else {
            this.field2593 = var1.field2591;
            return var1;
        }
    }
}
