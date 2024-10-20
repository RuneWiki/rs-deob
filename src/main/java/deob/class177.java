package deob;

@ObfuscatedName("fy")
public class class177 {

    @ObfuscatedName("fy.b")
    public class179 field2821 = new class179();

    @ObfuscatedName("fy.c")
    public class179 field2822;

    public class177() {
        this.field2821.field2827 = this.field2821;
        this.field2821.field2825 = this.field2821;
    }

    @ObfuscatedName("fy.b()V")
    public void method3240() {
        while (true) {
            class179 var1 = this.field2821.field2827;
            if (this.field2821 == var1) {
                this.field2822 = null;
                return;
            }
            var1.method3282();
        }
    }

    @ObfuscatedName("fy.c(Lfo;)V")
    public void method3261(class179 arg0) {
        if (arg0.field2825 != null) {
            arg0.method3282();
        }
        arg0.field2825 = this.field2821.field2825;
        arg0.field2827 = this.field2821;
        arg0.field2825.field2827 = arg0;
        arg0.field2827.field2825 = arg0;
    }

    @ObfuscatedName("fy.j(Lfo;)V")
    public void method3242(class179 arg0) {
        if (arg0.field2825 != null) {
            arg0.method3282();
        }
        arg0.field2825 = this.field2821;
        arg0.field2827 = this.field2821.field2827;
        arg0.field2825.field2827 = arg0;
        arg0.field2827.field2825 = arg0;
    }

    @ObfuscatedName("fy.i(Lfo;Lfo;)V")
    public static void method3256(class179 arg0, class179 arg1) {
        if (arg0.field2825 != null) {
            arg0.method3282();
        }
        arg0.field2825 = arg1.field2825;
        arg0.field2827 = arg1;
        arg0.field2825.field2827 = arg0;
        arg0.field2827.field2825 = arg0;
    }

    @ObfuscatedName("fy.k()Lfo;")
    public class179 method3262() {
        class179 var1 = this.field2821.field2827;
        if (this.field2821 == var1) {
            return null;
        } else {
            var1.method3282();
            return var1;
        }
    }

    @ObfuscatedName("fy.q()Lfo;")
    public class179 method3245() {
        class179 var1 = this.field2821.field2825;
        if (this.field2821 == var1) {
            return null;
        } else {
            var1.method3282();
            return var1;
        }
    }

    @ObfuscatedName("fy.t()Lfo;")
    public class179 method3246() {
        class179 var1 = this.field2821.field2827;
        if (this.field2821 == var1) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var1.field2827;
            return var1;
        }
    }

    @ObfuscatedName("fy.v()Lfo;")
    public class179 method3268() {
        class179 var1 = this.field2821.field2825;
        if (this.field2821 == var1) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var1.field2825;
            return var1;
        }
    }

    @ObfuscatedName("fy.y()Lfo;")
    public class179 method3248() {
        class179 var1 = this.field2822;
        if (this.field2821 == var1) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var1.field2827;
            return var1;
        }
    }

    @ObfuscatedName("fy.w()Lfo;")
    public class179 method3249() {
        class179 var1 = this.field2822;
        if (this.field2821 == var1) {
            this.field2822 = null;
            return null;
        } else {
            this.field2822 = var1.field2825;
            return var1;
        }
    }
}
