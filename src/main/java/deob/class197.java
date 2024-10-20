package deob;

@ObfuscatedName("gr")
public final class class197 {

    @ObfuscatedName("gr.m")
    public class202 field2552 = new class202();

    @ObfuscatedName("gr.p")
    public int field2551;

    @ObfuscatedName("gr.i")
    public int field2550;

    @ObfuscatedName("gr.j")
    public class198 field2553;

    @ObfuscatedName("gr.v")
    public class192 field2554 = new class192();

    public class197(int arg0) {
        this.field2551 = arg0;
        this.field2550 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2553 = new class198(var2);
    }

    @ObfuscatedName("gr.m(J)Lgu;")
    public class202 method3419(long arg0) {
        class202 var3 = (class202) this.field2553.method3444(arg0);
        if (var3 != null) {
            this.field2554.method3369(var3);
        }
        return var3;
    }

    @ObfuscatedName("gr.p(J)V")
    public void method3421(long arg0) {
        class202 var3 = (class202) this.field2553.method3444(arg0);
        if (var3 != null) {
            var3.method3476();
            var3.method3513();
            this.field2550++;
        }
    }

    @ObfuscatedName("gr.i(Lgu;J)V")
    public void method3418(class202 arg0, long arg1) {
        if (this.field2550 == 0) {
            class202 var4 = this.field2554.method3383();
            var4.method3476();
            var4.method3513();
            if (this.field2552 == var4) {
                class202 var5 = this.field2554.method3383();
                var5.method3476();
                var5.method3513();
            }
        } else {
            this.field2550--;
        }
        this.field2553.method3431(arg0, arg1);
        this.field2554.method3369(arg0);
    }

    @ObfuscatedName("gr.j()V")
    public void method3423() {
        this.field2554.method3373();
        this.field2553.method3432();
        this.field2552 = new class202();
        this.field2550 = this.field2551;
    }
}
