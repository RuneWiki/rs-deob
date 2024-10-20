package deob;

@ObfuscatedName("gm")
public final class class201 {

    @ObfuscatedName("gm.p")
    public class206 field2552 = new class206();

    @ObfuscatedName("gm.i")
    public int field2553;

    @ObfuscatedName("gm.w")
    public int field2551;

    @ObfuscatedName("gm.s")
    public class202 field2550;

    @ObfuscatedName("gm.j")
    public class196 field2549 = new class196();

    public class201(int arg0) {
        this.field2553 = arg0;
        this.field2551 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2550 = new class202(var2);
    }

    @ObfuscatedName("gm.p(J)Lgf;")
    public class206 method3504(long arg0) {
        class206 var3 = (class206) this.field2550.method3517(arg0);
        if (var3 != null) {
            this.field2549.method3455(var3);
        }
        return var3;
    }

    @ObfuscatedName("gm.i(J)V")
    public void method3515(long arg0) {
        class206 var3 = (class206) this.field2550.method3517(arg0);
        if (var3 != null) {
            var3.method3561();
            var3.method3604();
            this.field2551++;
        }
    }

    @ObfuscatedName("gm.w(Lgf;J)V")
    public void method3506(class206 arg0, long arg1) {
        if (this.field2551 == 0) {
            class206 var4 = this.field2549.method3454();
            var4.method3561();
            var4.method3604();
            if (this.field2552 == var4) {
                class206 var5 = this.field2549.method3454();
                var5.method3561();
                var5.method3604();
            }
        } else {
            this.field2551--;
        }
        this.field2550.method3518(arg0, arg1);
        this.field2549.method3455(arg0);
    }

    @ObfuscatedName("gm.s()V")
    public void method3513() {
        this.field2549.method3461();
        this.field2550.method3519();
        this.field2552 = new class206();
        this.field2551 = this.field2553;
    }
}
