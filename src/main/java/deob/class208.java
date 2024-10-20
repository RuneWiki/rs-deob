package deob;

@ObfuscatedName("gm")
public class class208 {

    @ObfuscatedName("gm.c")
    public class207 field2469 = new class207();

    @ObfuscatedName("gm.q")
    public class207 field2468;

    public class208() {
        this.field2469.field2465 = this.field2469;
        this.field2469.field2467 = this.field2469;
    }

    @ObfuscatedName("gm.c()V")
    public void method3759() {
        while (true) {
            class207 var1 = this.field2469.field2465;
            if (this.field2469 == var1) {
                this.field2468 = null;
                return;
            }
            var1.method3733();
        }
    }

    @ObfuscatedName("gm.q(Lgk;)V")
    public void method3740(class207 arg0) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        arg0.field2467 = this.field2469.field2467;
        arg0.field2465 = this.field2469;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
    }

    @ObfuscatedName("gm.m(Lgk;)V")
    public void method3753(class207 arg0) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        arg0.field2467 = this.field2469;
        arg0.field2465 = this.field2469.field2465;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
    }

    @ObfuscatedName("gm.j(Lgk;Lgk;)V")
    public static void method3742(class207 arg0, class207 arg1) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        arg0.field2467 = arg1.field2467;
        arg0.field2465 = arg1;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
    }

    @ObfuscatedName("gm.g()Lgk;")
    public class207 method3743() {
        class207 var1 = this.field2469.field2465;
        if (this.field2469 == var1) {
            return null;
        } else {
            var1.method3733();
            return var1;
        }
    }

    @ObfuscatedName("gm.i()Lgk;")
    public class207 method3744() {
        class207 var1 = this.field2469.field2467;
        if (this.field2469 == var1) {
            return null;
        } else {
            var1.method3733();
            return var1;
        }
    }

    @ObfuscatedName("gm.h()Lgk;")
    public class207 method3746() {
        class207 var1 = this.field2469.field2465;
        if (this.field2469 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gm.l()Lgk;")
    public class207 method3738() {
        class207 var1 = this.field2469.field2467;
        if (this.field2469 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2467;
            return var1;
        }
    }

    @ObfuscatedName("gm.o()Lgk;")
    public class207 method3747() {
        class207 var1 = this.field2468;
        if (this.field2469 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gm.k()Lgk;")
    public class207 method3745() {
        class207 var1 = this.field2468;
        if (this.field2469 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2467;
            return var1;
        }
    }
}
