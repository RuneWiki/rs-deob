package deob;

@ObfuscatedName("go")
public final class class202 {

    @ObfuscatedName("go.n")
    public class214 field2472 = new class214();

    public class202() {
        this.field2472.field2506 = this.field2472;
        this.field2472.field2505 = this.field2472;
    }

    @ObfuscatedName("go.n(Lhp;)V")
    public void method3852(class214 arg0) {
        if (arg0.field2505 != null) {
            arg0.method4025();
        }
        arg0.field2505 = this.field2472.field2505;
        arg0.field2506 = this.field2472;
        arg0.field2505.field2506 = arg0;
        arg0.field2506.field2505 = arg0;
    }

    @ObfuscatedName("go.h(Lhp;)V")
    public void method3841(class214 arg0) {
        if (arg0.field2505 != null) {
            arg0.method4025();
        }
        arg0.field2505 = this.field2472;
        arg0.field2506 = this.field2472.field2506;
        arg0.field2505.field2506 = arg0;
        arg0.field2506.field2505 = arg0;
    }

    @ObfuscatedName("go.l(Lhp;Lhp;)V")
    public static void method3842(class214 arg0, class214 arg1) {
        if (arg0.field2505 != null) {
            arg0.method4025();
        }
        arg0.field2505 = arg1;
        arg0.field2506 = arg1.field2506;
        arg0.field2505.field2506 = arg0;
        arg0.field2506.field2505 = arg0;
    }

    @ObfuscatedName("go.g()Lhp;")
    public class214 method3843() {
        class214 var1 = this.field2472.field2506;
        if (this.field2472 == var1) {
            return null;
        } else {
            var1.method4025();
            return var1;
        }
    }

    @ObfuscatedName("go.b()Lhp;")
    public class214 method3857() {
        class214 var1 = this.field2472.field2506;
        return this.field2472 == var1 ? null : var1;
    }

    @ObfuscatedName("go.a()V")
    public void method3845() {
        while (true) {
            class214 var1 = this.field2472.field2506;
            if (this.field2472 == var1) {
                return;
            }
            var1.method4025();
        }
    }
}
