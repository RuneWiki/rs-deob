package deob;

@ObfuscatedName("gf")
public class class196 {

    @ObfuscatedName("gf.c")
    public class197 field2445 = new class197();

    @ObfuscatedName("gf.o")
    public class197 field2444;

    public class196() {
        this.field2445.field2447 = this.field2445;
        this.field2445.field2446 = this.field2445;
    }

    @ObfuscatedName("gf.c(Lgp;)V")
    public void method3329(class197 arg0) {
        if (arg0.field2446 != null) {
            arg0.method3337();
        }
        arg0.field2446 = this.field2445.field2446;
        arg0.field2447 = this.field2445;
        arg0.field2446.field2447 = arg0;
        arg0.field2447.field2446 = arg0;
    }

    @ObfuscatedName("gf.o()Lgp;")
    public class197 method3325() {
        class197 var1 = this.field2445.field2447;
        if (this.field2445 == var1) {
            this.field2444 = null;
            return null;
        } else {
            this.field2444 = var1.field2447;
            return var1;
        }
    }

    @ObfuscatedName("gf.i()Lgp;")
    public class197 method3326() {
        class197 var1 = this.field2444;
        if (this.field2445 == var1) {
            this.field2444 = null;
            return null;
        } else {
            this.field2444 = var1.field2447;
            return var1;
        }
    }
}
