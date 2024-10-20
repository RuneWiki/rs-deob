package deob;

@ObfuscatedName("gn")
public final class class191 {

    @ObfuscatedName("gn.d")
    public int field2478;

    @ObfuscatedName("gn.k")
    public class193[] field2479;

    @ObfuscatedName("gn.e")
    public class193 field2480;

    @ObfuscatedName("gn.p")
    public class193 field2481;

    @ObfuscatedName("gn.q")
    public int field2482 = 0;

    public class191(int arg0) {
        this.field2478 = arg0;
        this.field2479 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2479[var2] = new class193();
            var3.field2485 = var3;
            var3.field2487 = var3;
        }
    }

    @ObfuscatedName("gn.d(J)Lgs;")
    public class193 method3352(long arg0) {
        class193 var3 = this.field2479[(int) (arg0 & (long) (this.field2478 - 1))];
        for (this.field2480 = var3.field2485; this.field2480 != var3; this.field2480 = this.field2480.field2485) {
            if (this.field2480.field2486 == arg0) {
                class193 var4 = this.field2480;
                this.field2480 = this.field2480.field2485;
                return var4;
            }
        }
        this.field2480 = null;
        return null;
    }

    @ObfuscatedName("gn.k(Lgs;J)V")
    public void method3358(class193 arg0, long arg1) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        class193 var4 = this.field2479[(int) (arg1 & (long) (this.field2478 - 1))];
        arg0.field2487 = var4.field2487;
        arg0.field2485 = var4;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
        arg0.field2486 = arg1;
    }

    @ObfuscatedName("gn.e()V")
    public void method3354() {
        for (int var1 = 0; var1 < this.field2478; var1++) {
            class193 var2 = this.field2479[var1];
            while (true) {
                class193 var3 = var2.field2485;
                if (var2 == var3) {
                    break;
                }
                var3.method3407();
            }
        }
        this.field2480 = null;
        this.field2481 = null;
    }

    @ObfuscatedName("gn.p()Lgs;")
    public class193 method3355() {
        this.field2482 = 0;
        return this.method3356();
    }

    @ObfuscatedName("gn.q()Lgs;")
    public class193 method3356() {
        if (this.field2482 > 0 && this.field2479[this.field2482 - 1] != this.field2481) {
            class193 var1 = this.field2481;
            this.field2481 = var1.field2485;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2482 >= this.field2478) {
                return null;
            }
            var2 = this.field2479[this.field2482++].field2485;
        } while (this.field2479[this.field2482 - 1] == var2);
        this.field2481 = var2.field2485;
        return var2;
    }
}
