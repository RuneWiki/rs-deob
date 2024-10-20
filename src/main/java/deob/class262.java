package deob;

@ObfuscatedName("js")
public class class262 {

    @ObfuscatedName("js.f")
    public class188 field3503 = new class188();

    @ObfuscatedName("js.i")
    public class188 field3502;

    public class262() {
        this.field3503.field2323 = this.field3503;
        this.field3503.field2324 = this.field3503;
    }

    @ObfuscatedName("js.f()V")
    public void method4525() {
        while (true) {
            class188 var1 = this.field3503.field2323;
            if (this.field3503 == var1) {
                this.field3502 = null;
                return;
            }
            var1.method3292();
        }
    }

    @ObfuscatedName("js.i(Lgk;)V")
    public void method4554(class188 arg0) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        arg0.field2324 = this.field3503.field2324;
        arg0.field2323 = this.field3503;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
    }

    @ObfuscatedName("js.y(Lgk;)V")
    public void method4535(class188 arg0) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        arg0.field2324 = this.field3503;
        arg0.field2323 = this.field3503.field2323;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
    }

    @ObfuscatedName("js.w(Lgk;Lgk;)V")
    public static void method4528(class188 arg0, class188 arg1) {
        if (arg0.field2324 != null) {
            arg0.method3292();
        }
        arg0.field2324 = arg1.field2324;
        arg0.field2323 = arg1;
        arg0.field2324.field2323 = arg0;
        arg0.field2323.field2324 = arg0;
    }

    @ObfuscatedName("js.p()Lgk;")
    public class188 method4529() {
        class188 var1 = this.field3503.field2323;
        if (this.field3503 == var1) {
            return null;
        } else {
            var1.method3292();
            return var1;
        }
    }

    @ObfuscatedName("js.b()Lgk;")
    public class188 method4530() {
        class188 var1 = this.field3503.field2324;
        if (this.field3503 == var1) {
            return null;
        } else {
            var1.method3292();
            return var1;
        }
    }

    @ObfuscatedName("js.e()Lgk;")
    public class188 method4540() {
        class188 var1 = this.field3503.field2323;
        if (this.field3503 == var1) {
            this.field3502 = null;
            return null;
        } else {
            this.field3502 = var1.field2323;
            return var1;
        }
    }

    @ObfuscatedName("js.x()Lgk;")
    public class188 method4532() {
        class188 var1 = this.field3503.field2324;
        if (this.field3503 == var1) {
            this.field3502 = null;
            return null;
        } else {
            this.field3502 = var1.field2324;
            return var1;
        }
    }

    @ObfuscatedName("js.a()Lgk;")
    public class188 method4533() {
        class188 var1 = this.field3502;
        if (this.field3503 == var1) {
            this.field3502 = null;
            return null;
        } else {
            this.field3502 = var1.field2323;
            return var1;
        }
    }

    @ObfuscatedName("js.d()Lgk;")
    public class188 method4556() {
        class188 var1 = this.field3502;
        if (this.field3503 == var1) {
            this.field3502 = null;
            return null;
        } else {
            this.field3502 = var1.field2324;
            return var1;
        }
    }
}
