package deob;

@ObfuscatedName("gf")
public final class class205 {

    @ObfuscatedName("gf.y")
    public int field2463;

    @ObfuscatedName("gf.c")
    public class207[] field2466;

    @ObfuscatedName("gf.n")
    public class207 field2465;

    @ObfuscatedName("gf.u")
    public class207 field2464;

    @ObfuscatedName("gf.i")
    public int field2467 = 0;

    public class205(int arg0) {
        this.field2463 = arg0;
        this.field2466 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2466[var2] = new class207();
            var3.field2471 = var3;
            var3.field2472 = var3;
        }
    }

    @ObfuscatedName("gf.y(J)Lgp;")
    public class207 method3734(long arg0) {
        class207 var3 = this.field2466[(int) (arg0 & (long) (this.field2463 - 1))];
        for (this.field2465 = var3.field2471; this.field2465 != var3; this.field2465 = this.field2465.field2471) {
            if (this.field2465.field2470 == arg0) {
                class207 var4 = this.field2465;
                this.field2465 = this.field2465.field2471;
                return var4;
            }
        }
        this.field2465 = null;
        return null;
    }

    @ObfuscatedName("gf.c(Lgp;J)V")
    public void method3718(class207 arg0, long arg1) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        class207 var4 = this.field2466[(int) (arg1 & (long) (this.field2463 - 1))];
        arg0.field2472 = var4.field2472;
        arg0.field2471 = var4;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
        arg0.field2470 = arg1;
    }

    @ObfuscatedName("gf.n()V")
    public void method3719() {
        for (int var1 = 0; var1 < this.field2463; var1++) {
            class207 var2 = this.field2466[var1];
            while (true) {
                class207 var3 = var2.field2471;
                if (var2 == var3) {
                    break;
                }
                var3.method3766();
            }
        }
        this.field2465 = null;
        this.field2464 = null;
    }

    @ObfuscatedName("gf.u()Lgp;")
    public class207 method3720() {
        this.field2467 = 0;
        return this.method3717();
    }

    @ObfuscatedName("gf.i()Lgp;")
    public class207 method3717() {
        if (this.field2467 > 0 && this.field2466[this.field2467 - 1] != this.field2464) {
            class207 var1 = this.field2464;
            this.field2464 = var1.field2471;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2467 >= this.field2463) {
                return null;
            }
            var2 = this.field2466[this.field2467++].field2471;
        } while (this.field2466[this.field2467 - 1] == var2);
        this.field2464 = var2.field2471;
        return var2;
    }
}
