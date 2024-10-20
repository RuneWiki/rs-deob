package deob;

@ObfuscatedName("gj")
public final class class194 {

    @ObfuscatedName("gj.w")
    public int field2484;

    @ObfuscatedName("gj.o")
    public class196[] field2482;

    @ObfuscatedName("gj.x")
    public class196 field2481;

    @ObfuscatedName("gj.k")
    public class196 field2485;

    @ObfuscatedName("gj.f")
    public int field2483 = 0;

    public class194(int arg0) {
        this.field2484 = arg0;
        this.field2482 = new class196[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class196 var3 = this.field2482[var2] = new class196();
            var3.field2489 = var3;
            var3.field2488 = var3;
        }
    }

    @ObfuscatedName("gj.w(J)Lgd;")
    public class196 method3252(long arg0) {
        class196 var3 = this.field2482[(int) (arg0 & (long) (this.field2484 - 1))];
        for (this.field2481 = var3.field2489; this.field2481 != var3; this.field2481 = this.field2481.field2489) {
            if (this.field2481.field2490 == arg0) {
                class196 var4 = this.field2481;
                this.field2481 = this.field2481.field2489;
                return var4;
            }
        }
        this.field2481 = null;
        return null;
    }

    @ObfuscatedName("gj.o(Lgd;J)V")
    public void method3253(class196 arg0, long arg1) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        class196 var4 = this.field2482[(int) (arg1 & (long) (this.field2484 - 1))];
        arg0.field2488 = var4.field2488;
        arg0.field2489 = var4;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
        arg0.field2490 = arg1;
    }

    @ObfuscatedName("gj.x()V")
    public void method3254() {
        for (int var1 = 0; var1 < this.field2484; var1++) {
            class196 var2 = this.field2482[var1];
            while (true) {
                class196 var3 = var2.field2489;
                if (var2 == var3) {
                    break;
                }
                var3.method3294();
            }
        }
        this.field2481 = null;
        this.field2485 = null;
    }

    @ObfuscatedName("gj.k()Lgd;")
    public class196 method3251() {
        this.field2483 = 0;
        return this.method3256();
    }

    @ObfuscatedName("gj.f()Lgd;")
    public class196 method3256() {
        if (this.field2483 > 0 && this.field2482[this.field2483 - 1] != this.field2485) {
            class196 var1 = this.field2485;
            this.field2485 = var1.field2489;
            return var1;
        }
        class196 var2;
        do {
            if (this.field2483 >= this.field2484) {
                return null;
            }
            var2 = this.field2482[this.field2483++].field2489;
        } while (this.field2482[this.field2483 - 1] == var2);
        this.field2485 = var2.field2489;
        return var2;
    }
}
