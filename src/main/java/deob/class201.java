package deob;

@ObfuscatedName("gs")
public class class201 {

    @ObfuscatedName("gs.d")
    public class200 field2568 = new class200();

    @ObfuscatedName("gs.x")
    public class200 field2567;

    public class201() {
        this.field2568.field2565 = this.field2568;
        this.field2568.field2566 = this.field2568;
    }

    @ObfuscatedName("gs.d()V")
    public void method3506() {
        while (true) {
            class200 var1 = this.field2568.field2565;
            if (this.field2568 == var1) {
                this.field2567 = null;
                return;
            }
            var1.method3475();
        }
    }

    @ObfuscatedName("gs.x(Lgf;)V")
    public void method3502(class200 arg0) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        arg0.field2566 = this.field2568.field2566;
        arg0.field2565 = this.field2568;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
    }

    @ObfuscatedName("gs.k(Lgf;)V")
    public void method3497(class200 arg0) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        arg0.field2566 = this.field2568;
        arg0.field2565 = this.field2568.field2565;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
    }

    @ObfuscatedName("gs.z(Lgf;Lgf;)V")
    public static void method3483(class200 arg0, class200 arg1) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        arg0.field2566 = arg1.field2566;
        arg0.field2565 = arg1;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
    }

    @ObfuscatedName("gs.v()Lgf;")
    public class200 method3484() {
        class200 var1 = this.field2568.field2565;
        if (this.field2568 == var1) {
            return null;
        } else {
            var1.method3475();
            return var1;
        }
    }

    @ObfuscatedName("gs.m()Lgf;")
    public class200 method3485() {
        class200 var1 = this.field2568.field2566;
        if (this.field2568 == var1) {
            return null;
        } else {
            var1.method3475();
            return var1;
        }
    }

    @ObfuscatedName("gs.b()Lgf;")
    public class200 method3500() {
        class200 var1 = this.field2568.field2565;
        if (this.field2568 == var1) {
            this.field2567 = null;
            return null;
        } else {
            this.field2567 = var1.field2565;
            return var1;
        }
    }

    @ObfuscatedName("gs.t()Lgf;")
    public class200 method3487() {
        class200 var1 = this.field2568.field2566;
        if (this.field2568 == var1) {
            this.field2567 = null;
            return null;
        } else {
            this.field2567 = var1.field2566;
            return var1;
        }
    }

    @ObfuscatedName("gs.p()Lgf;")
    public class200 method3511() {
        class200 var1 = this.field2567;
        if (this.field2568 == var1) {
            this.field2567 = null;
            return null;
        } else {
            this.field2567 = var1.field2565;
            return var1;
        }
    }

    @ObfuscatedName("gs.r()Lgf;")
    public class200 method3489() {
        class200 var1 = this.field2567;
        if (this.field2568 == var1) {
            this.field2567 = null;
            return null;
        } else {
            this.field2567 = var1.field2566;
            return var1;
        }
    }
}
