package deob;

@ObfuscatedName("ja")
public class class273 {

    @ObfuscatedName("ja.f")
    public class190 field3558 = new class190();

    @ObfuscatedName("ja.b")
    public class190 field3557;

    public class273() {
        this.field3558.field2141 = this.field3558;
        this.field3558.field2142 = this.field3558;
    }

    @ObfuscatedName("ja.f()V")
    public void method4633() {
        while (true) {
            class190 var1 = this.field3558.field2141;
            if (this.field3558 == var1) {
                this.field3557 = null;
                return;
            }
            var1.method3407();
        }
    }

    @ObfuscatedName("ja.b(Lgn;)V")
    public void method4639(class190 arg0) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        arg0.field2142 = this.field3558.field2142;
        arg0.field2141 = this.field3558;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
    }

    @ObfuscatedName("ja.l(Lgn;)V")
    public void method4652(class190 arg0) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        arg0.field2142 = this.field3558;
        arg0.field2141 = this.field3558.field2141;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
    }

    @ObfuscatedName("ja.m(Lgn;Lgn;)V")
    public static void method4635(class190 arg0, class190 arg1) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        arg0.field2142 = arg1.field2142;
        arg0.field2141 = arg1;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
    }

    @ObfuscatedName("ja.z()Lgn;")
    public class190 method4636() {
        class190 var1 = this.field3558.field2141;
        if (this.field3558 == var1) {
            return null;
        } else {
            var1.method3407();
            return var1;
        }
    }

    @ObfuscatedName("ja.q()Lgn;")
    public class190 method4637() {
        class190 var1 = this.field3558.field2142;
        if (this.field3558 == var1) {
            return null;
        } else {
            var1.method3407();
            return var1;
        }
    }

    @ObfuscatedName("ja.k()Lgn;")
    public class190 method4638() {
        class190 var1 = this.field3558.field2141;
        if (this.field3558 == var1) {
            this.field3557 = null;
            return null;
        } else {
            this.field3557 = var1.field2141;
            return var1;
        }
    }

    @ObfuscatedName("ja.c()Lgn;")
    public class190 method4653() {
        class190 var1 = this.field3558.field2142;
        if (this.field3558 == var1) {
            this.field3557 = null;
            return null;
        } else {
            this.field3557 = var1.field2142;
            return var1;
        }
    }

    @ObfuscatedName("ja.u()Lgn;")
    public class190 method4640() {
        class190 var1 = this.field3557;
        if (this.field3558 == var1) {
            this.field3557 = null;
            return null;
        } else {
            this.field3557 = var1.field2141;
            return var1;
        }
    }

    @ObfuscatedName("ja.t()Lgn;")
    public class190 method4641() {
        class190 var1 = this.field3557;
        if (this.field3558 == var1) {
            this.field3557 = null;
            return null;
        } else {
            this.field3557 = var1.field2142;
            return var1;
        }
    }
}
