package deob;

@ObfuscatedName("ge")
public final class class205 {

    @ObfuscatedName("ge.f")
    public int field2480;

    @ObfuscatedName("ge.h")
    public class207[] field2479;

    @ObfuscatedName("ge.e")
    public class207 field2478;

    @ObfuscatedName("ge.b")
    public class207 field2481;

    @ObfuscatedName("ge.l")
    public int field2482 = 0;

    public class205(int arg0) {
        this.field2480 = arg0;
        this.field2479 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2479[var2] = new class207();
            var3.field2487 = var3;
            var3.field2485 = var3;
        }
    }

    @ObfuscatedName("ge.f(J)Lgf;")
    public class207 method3759(long arg0) {
        class207 var3 = this.field2479[(int) (arg0 & (long) (this.field2480 - 1))];
        for (this.field2478 = var3.field2487; this.field2478 != var3; this.field2478 = this.field2478.field2487) {
            if (this.field2478.field2486 == arg0) {
                class207 var4 = this.field2478;
                this.field2478 = this.field2478.field2487;
                return var4;
            }
        }
        this.field2478 = null;
        return null;
    }

    @ObfuscatedName("ge.h(Lgf;J)V")
    public void method3761(class207 arg0, long arg1) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        class207 var4 = this.field2479[(int) (arg1 & (long) (this.field2480 - 1))];
        arg0.field2485 = var4.field2485;
        arg0.field2487 = var4;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
        arg0.field2486 = arg1;
    }

    @ObfuscatedName("ge.e()V")
    public void method3762() {
        for (int var1 = 0; var1 < this.field2480; var1++) {
            class207 var2 = this.field2479[var1];
            while (true) {
                class207 var3 = var2.field2487;
                if (var2 == var3) {
                    break;
                }
                var3.method3812();
            }
        }
        this.field2478 = null;
        this.field2481 = null;
    }

    @ObfuscatedName("ge.b()Lgf;")
    public class207 method3766() {
        this.field2482 = 0;
        return this.method3764();
    }

    @ObfuscatedName("ge.l()Lgf;")
    public class207 method3764() {
        if (this.field2482 > 0 && this.field2479[this.field2482 - 1] != this.field2481) {
            class207 var1 = this.field2481;
            this.field2481 = var1.field2487;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2482 >= this.field2480) {
                return null;
            }
            var2 = this.field2479[this.field2482++].field2487;
        } while (this.field2479[this.field2482 - 1] == var2);
        this.field2481 = var2.field2487;
        return var2;
    }
}
