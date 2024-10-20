package deob;

@ObfuscatedName("je")
public class class273 {

    @ObfuscatedName("je.m")
    public class186 field3605 = new class186();

    @ObfuscatedName("je.f")
    public class186 field3604;

    public class273() {
        this.field3605.field2140 = this.field3605;
        this.field3605.field2141 = this.field3605;
    }

    @ObfuscatedName("je.m()V")
    public void method4850() {
        while (true) {
            class186 var1 = this.field3605.field2140;
            if (this.field3605 == var1) {
                this.field3604 = null;
                return;
            }
            var1.method3306();
        }
    }

    @ObfuscatedName("je.f(Lgw;)V")
    public void method4851(class186 arg0) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        arg0.field2141 = this.field3605.field2141;
        arg0.field2140 = this.field3605;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
    }

    @ObfuscatedName("je.q(Lgw;)V")
    public void method4889(class186 arg0) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        arg0.field2141 = this.field3605;
        arg0.field2140 = this.field3605.field2140;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
    }

    @ObfuscatedName("je.w(Lgw;Lgw;)V")
    public static void method4853(class186 arg0, class186 arg1) {
        if (arg0.field2141 != null) {
            arg0.method3306();
        }
        arg0.field2141 = arg1.field2141;
        arg0.field2140 = arg1;
        arg0.field2141.field2140 = arg0;
        arg0.field2140.field2141 = arg0;
    }

    @ObfuscatedName("je.o()Lgw;")
    public class186 method4891() {
        class186 var1 = this.field3605.field2140;
        if (this.field3605 == var1) {
            return null;
        } else {
            var1.method3306();
            return var1;
        }
    }

    @ObfuscatedName("je.u()Lgw;")
    public class186 method4855() {
        class186 var1 = this.field3605.field2141;
        if (this.field3605 == var1) {
            return null;
        } else {
            var1.method3306();
            return var1;
        }
    }

    @ObfuscatedName("je.g()Lgw;")
    public class186 method4856() {
        class186 var1 = this.field3605.field2140;
        if (this.field3605 == var1) {
            this.field3604 = null;
            return null;
        } else {
            this.field3604 = var1.field2140;
            return var1;
        }
    }

    @ObfuscatedName("je.l()Lgw;")
    public class186 method4857() {
        class186 var1 = this.field3605.field2141;
        if (this.field3605 == var1) {
            this.field3604 = null;
            return null;
        } else {
            this.field3604 = var1.field2141;
            return var1;
        }
    }

    @ObfuscatedName("je.e()Lgw;")
    public class186 method4858() {
        class186 var1 = this.field3604;
        if (this.field3605 == var1) {
            this.field3604 = null;
            return null;
        } else {
            this.field3604 = var1.field2140;
            return var1;
        }
    }

    @ObfuscatedName("je.x()Lgw;")
    public class186 method4859() {
        class186 var1 = this.field3604;
        if (this.field3605 == var1) {
            this.field3604 = null;
            return null;
        } else {
            this.field3604 = var1.field2141;
            return var1;
        }
    }
}
