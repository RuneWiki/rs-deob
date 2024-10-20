package deob;

@ObfuscatedName("fn")
public class class177 {

    @ObfuscatedName("fn.z")
    public class184 field2844 = new class184();

    @ObfuscatedName("fn.j")
    public class184 field2843;

    public class177() {
        this.field2844.field2856 = this.field2844;
        this.field2844.field2855 = this.field2844;
    }

    @ObfuscatedName("fn.z()V")
    public void method3226() {
        while (true) {
            class184 var1 = this.field2844.field2856;
            if (this.field2844 == var1) {
                this.field2843 = null;
                return;
            }
            var1.method3311();
        }
    }

    @ObfuscatedName("fn.j(Lgj;)V")
    public void method3227(class184 arg0) {
        if (arg0.field2855 != null) {
            arg0.method3311();
        }
        arg0.field2855 = this.field2844.field2855;
        arg0.field2856 = this.field2844;
        arg0.field2855.field2856 = arg0;
        arg0.field2856.field2855 = arg0;
    }

    @ObfuscatedName("fn.a(Lgj;)V")
    public void method3228(class184 arg0) {
        if (arg0.field2855 != null) {
            arg0.method3311();
        }
        arg0.field2855 = this.field2844;
        arg0.field2856 = this.field2844.field2856;
        arg0.field2855.field2856 = arg0;
        arg0.field2856.field2855 = arg0;
    }

    @ObfuscatedName("fn.y(Lgj;Lgj;)V")
    public static void method3225(class184 arg0, class184 arg1) {
        if (arg0.field2855 != null) {
            arg0.method3311();
        }
        arg0.field2855 = arg1.field2855;
        arg0.field2856 = arg1;
        arg0.field2855.field2856 = arg0;
        arg0.field2856.field2855 = arg0;
    }

    @ObfuscatedName("fn.i()Lgj;")
    public class184 method3258() {
        class184 var1 = this.field2844.field2856;
        if (this.field2844 == var1) {
            return null;
        } else {
            var1.method3311();
            return var1;
        }
    }

    @ObfuscatedName("fn.b()Lgj;")
    public class184 method3231() {
        class184 var1 = this.field2844.field2855;
        if (this.field2844 == var1) {
            return null;
        } else {
            var1.method3311();
            return var1;
        }
    }

    @ObfuscatedName("fn.s()Lgj;")
    public class184 method3232() {
        class184 var1 = this.field2844.field2856;
        if (this.field2844 == var1) {
            this.field2843 = null;
            return null;
        } else {
            this.field2843 = var1.field2856;
            return var1;
        }
    }

    @ObfuscatedName("fn.q()Lgj;")
    public class184 method3233() {
        class184 var1 = this.field2844.field2855;
        if (this.field2844 == var1) {
            this.field2843 = null;
            return null;
        } else {
            this.field2843 = var1.field2855;
            return var1;
        }
    }

    @ObfuscatedName("fn.p()Lgj;")
    public class184 method3251() {
        class184 var1 = this.field2843;
        if (this.field2844 == var1) {
            this.field2843 = null;
            return null;
        } else {
            this.field2843 = var1.field2856;
            return var1;
        }
    }

    @ObfuscatedName("fn.h()Lgj;")
    public class184 method3254() {
        class184 var1 = this.field2843;
        if (this.field2844 == var1) {
            this.field2843 = null;
            return null;
        } else {
            this.field2843 = var1.field2855;
            return var1;
        }
    }
}
