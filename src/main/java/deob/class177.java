package deob;

@ObfuscatedName("fc")
public class class177 {

    @ObfuscatedName("fc.e")
    public class186 field2849 = new class186();

    @ObfuscatedName("fc.v")
    public class186 field2850;

    public class177() {
        this.field2849.field2865 = this.field2849;
        this.field2849.field2866 = this.field2849;
    }

    @ObfuscatedName("fc.e()V")
    public void method3185() {
        while (true) {
            class186 var1 = this.field2849.field2865;
            if (this.field2849 == var1) {
                this.field2850 = null;
                return;
            }
            var1.method3273();
        }
    }

    @ObfuscatedName("fc.v(Lgc;)V")
    public void method3183(class186 arg0) {
        if (arg0.field2866 != null) {
            arg0.method3273();
        }
        arg0.field2866 = this.field2849.field2866;
        arg0.field2865 = this.field2849;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    @ObfuscatedName("fc.i(Lgc;)V")
    public void method3216(class186 arg0) {
        if (arg0.field2866 != null) {
            arg0.method3273();
        }
        arg0.field2866 = this.field2849;
        arg0.field2865 = this.field2849.field2865;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    @ObfuscatedName("fc.g(Lgc;Lgc;)V")
    public static void method3186(class186 arg0, class186 arg1) {
        if (arg0.field2866 != null) {
            arg0.method3273();
        }
        arg0.field2866 = arg1.field2866;
        arg0.field2865 = arg1;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    @ObfuscatedName("fc.x()Lgc;")
    public class186 method3187() {
        class186 var1 = this.field2849.field2865;
        if (this.field2849 == var1) {
            return null;
        } else {
            var1.method3273();
            return var1;
        }
    }

    @ObfuscatedName("fc.b()Lgc;")
    public class186 method3188() {
        class186 var1 = this.field2849.field2866;
        if (this.field2849 == var1) {
            return null;
        } else {
            var1.method3273();
            return var1;
        }
    }

    @ObfuscatedName("fc.q()Lgc;")
    public class186 method3210() {
        class186 var1 = this.field2849.field2865;
        if (this.field2849 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2865;
            return var1;
        }
    }

    @ObfuscatedName("fc.l()Lgc;")
    public class186 method3190() {
        class186 var1 = this.field2849.field2866;
        if (this.field2849 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2866;
            return var1;
        }
    }

    @ObfuscatedName("fc.m()Lgc;")
    public class186 method3182() {
        class186 var1 = this.field2850;
        if (this.field2849 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2865;
            return var1;
        }
    }

    @ObfuscatedName("fc.u()Lgc;")
    public class186 method3193() {
        class186 var1 = this.field2850;
        if (this.field2849 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2866;
            return var1;
        }
    }
}
