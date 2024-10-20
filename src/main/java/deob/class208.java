package deob;

@ObfuscatedName("gp")
public final class class208 {

    @ObfuscatedName("gp.n")
    public class214 field2486 = new class214();

    @ObfuscatedName("gp.h")
    public int field2487;

    @ObfuscatedName("gp.l")
    public int field2485;

    @ObfuscatedName("gp.g")
    public class210 field2484;

    @ObfuscatedName("gp.b")
    public class202 field2488 = new class202();

    public class208(int arg0) {
        this.field2487 = arg0;
        this.field2485 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2484 = new class210(var2);
    }

    @ObfuscatedName("gp.n(J)Lhp;")
    public class214 method3902(long arg0) {
        class214 var3 = (class214) this.field2484.method3934(arg0);
        if (var3 != null) {
            this.field2488.method3852(var3);
        }
        return var3;
    }

    @ObfuscatedName("gp.h(J)V")
    public void method3901(long arg0) {
        class214 var3 = (class214) this.field2484.method3934(arg0);
        if (var3 != null) {
            var3.method3973();
            var3.method4025();
            this.field2485++;
        }
    }

    @ObfuscatedName("gp.l(Lhp;J)V")
    public void method3908(class214 arg0, long arg1) {
        if (this.field2485 == 0) {
            class214 var4 = this.field2488.method3843();
            var4.method3973();
            var4.method4025();
            if (this.field2486 == var4) {
                class214 var5 = this.field2488.method3843();
                var5.method3973();
                var5.method4025();
            }
        } else {
            this.field2485--;
        }
        this.field2484.method3935(arg0, arg1);
        this.field2488.method3852(arg0);
    }

    @ObfuscatedName("gp.g()V")
    public void method3899() {
        this.field2488.method3845();
        this.field2484.method3936();
        this.field2486 = new class214();
        this.field2485 = this.field2487;
    }
}
