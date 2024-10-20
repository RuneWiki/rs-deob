package deob;

@ObfuscatedName("fn")
public class class177 {

    @ObfuscatedName("fn.e")
    public class186 field2857 = new class186();

    @ObfuscatedName("fn.o")
    public class186 field2856;

    public class177() {
        this.field2857.field2873 = this.field2857;
        this.field2857.field2872 = this.field2857;
    }

    @ObfuscatedName("fn.e()V")
    public void method3134() {
        while (true) {
            class186 var1 = this.field2857.field2873;
            if (this.field2857 == var1) {
                this.field2856 = null;
                return;
            }
            var1.method3204();
        }
    }

    @ObfuscatedName("fn.o(Lgm;)V")
    public void method3117(class186 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3204();
        }
        arg0.field2872 = this.field2857.field2872;
        arg0.field2873 = this.field2857;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    @ObfuscatedName("fn.y(Lgm;)V")
    public void method3129(class186 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3204();
        }
        arg0.field2872 = this.field2857;
        arg0.field2873 = this.field2857.field2873;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    @ObfuscatedName("fn.b(Lgm;Lgm;)V")
    public static void method3119(class186 arg0, class186 arg1) {
        if (arg0.field2872 != null) {
            arg0.method3204();
        }
        arg0.field2872 = arg1.field2872;
        arg0.field2873 = arg1;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    @ObfuscatedName("fn.w()Lgm;")
    public class186 method3120() {
        class186 var1 = this.field2857.field2873;
        if (this.field2857 == var1) {
            return null;
        } else {
            var1.method3204();
            return var1;
        }
    }

    @ObfuscatedName("fn.r()Lgm;")
    public class186 method3121() {
        class186 var1 = this.field2857.field2872;
        if (this.field2857 == var1) {
            return null;
        } else {
            var1.method3204();
            return var1;
        }
    }

    @ObfuscatedName("fn.l()Lgm;")
    public class186 method3122() {
        class186 var1 = this.field2857.field2873;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2873;
            return var1;
        }
    }

    @ObfuscatedName("fn.s()Lgm;")
    public class186 method3128() {
        class186 var1 = this.field2857.field2872;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2872;
            return var1;
        }
    }

    @ObfuscatedName("fn.f()Lgm;")
    public class186 method3124() {
        class186 var1 = this.field2856;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2873;
            return var1;
        }
    }

    @ObfuscatedName("fn.x()Lgm;")
    public class186 method3125() {
        class186 var1 = this.field2856;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2872;
            return var1;
        }
    }
}
