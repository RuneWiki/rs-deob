package deob;

@ObfuscatedName("jw")
public class class263 {

    @ObfuscatedName("jw.f")
    public class186 field3505 = new class186();

    @ObfuscatedName("jw.i")
    public class186 field3504;

    public class263() {
        this.field3505.field2319 = this.field3505;
        this.field3505.field2320 = this.field3505;
    }

    @ObfuscatedName("jw.f(Lgj;)V")
    public void method4559(class186 arg0) {
        if (arg0.field2320 != null) {
            arg0.method3288();
        }
        arg0.field2320 = this.field3505.field2320;
        arg0.field2319 = this.field3505;
        arg0.field2320.field2319 = arg0;
        arg0.field2319.field2320 = arg0;
    }

    @ObfuscatedName("jw.i()Lgj;")
    public class186 method4560() {
        class186 var1 = this.field3505.field2319;
        if (this.field3505 == var1) {
            this.field3504 = null;
            return null;
        } else {
            this.field3504 = var1.field2319;
            return var1;
        }
    }

    @ObfuscatedName("jw.y()Lgj;")
    public class186 method4561() {
        class186 var1 = this.field3504;
        if (this.field3505 == var1) {
            this.field3504 = null;
            return null;
        } else {
            this.field3504 = var1.field2319;
            return var1;
        }
    }
}
