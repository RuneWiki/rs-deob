package deob;

@ObfuscatedName("gu")
public final class class194 {

    @ObfuscatedName("gu.s")
    public int field2483;

    @ObfuscatedName("gu.c")
    public class196[] field2480;

    @ObfuscatedName("gu.f")
    public class196 field2481;

    @ObfuscatedName("gu.m")
    public class196 field2479;

    @ObfuscatedName("gu.h")
    public int field2482 = 0;

    public class194(int arg0) {
        this.field2483 = arg0;
        this.field2480 = new class196[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class196 var3 = this.field2480[var2] = new class196();
            var3.field2486 = var3;
            var3.field2488 = var3;
        }
    }

    @ObfuscatedName("gu.s(J)Lgr;")
    public class196 method3339(long arg0) {
        class196 var3 = this.field2480[(int) (arg0 & (long) (this.field2483 - 1))];
        for (this.field2481 = var3.field2486; this.field2481 != var3; this.field2481 = this.field2481.field2486) {
            if (this.field2481.field2487 == arg0) {
                class196 var4 = this.field2481;
                this.field2481 = this.field2481.field2486;
                return var4;
            }
        }
        this.field2481 = null;
        return null;
    }

    @ObfuscatedName("gu.c(Lgr;J)V")
    public void method3330(class196 arg0, long arg1) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        class196 var4 = this.field2480[(int) (arg1 & (long) (this.field2483 - 1))];
        arg0.field2488 = var4.field2488;
        arg0.field2486 = var4;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
        arg0.field2487 = arg1;
    }

    @ObfuscatedName("gu.f()V")
    public void method3331() {
        for (int var1 = 0; var1 < this.field2483; var1++) {
            class196 var2 = this.field2480[var1];
            while (true) {
                class196 var3 = var2.field2486;
                if (var2 == var3) {
                    break;
                }
                var3.method3372();
            }
        }
        this.field2481 = null;
        this.field2479 = null;
    }

    @ObfuscatedName("gu.m()Lgr;")
    public class196 method3332() {
        this.field2482 = 0;
        return this.method3333();
    }

    @ObfuscatedName("gu.h()Lgr;")
    public class196 method3333() {
        if (this.field2482 > 0 && this.field2480[this.field2482 - 1] != this.field2479) {
            class196 var1 = this.field2479;
            this.field2479 = var1.field2486;
            return var1;
        }
        class196 var2;
        do {
            if (this.field2482 >= this.field2483) {
                return null;
            }
            var2 = this.field2480[this.field2482++].field2486;
        } while (this.field2480[this.field2482 - 1] == var2);
        this.field2479 = var2.field2486;
        return var2;
    }
}
