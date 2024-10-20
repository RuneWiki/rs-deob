package deob;

@ObfuscatedName("gr")
public final class class202 {

    @ObfuscatedName("gr.p")
    public int field2556;

    @ObfuscatedName("gr.i")
    public class204[] field2555;

    @ObfuscatedName("gr.w")
    public class204 field2554;

    @ObfuscatedName("gr.s")
    public class204 field2557;

    @ObfuscatedName("gr.j")
    public int field2558 = 0;

    public class202(int arg0) {
        this.field2556 = arg0;
        this.field2555 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2555[var2] = new class204();
            var3.field2562 = var3;
            var3.field2561 = var3;
        }
    }

    @ObfuscatedName("gr.p(J)Lgw;")
    public class204 method3517(long arg0) {
        class204 var3 = this.field2555[(int) (arg0 & (long) (this.field2556 - 1))];
        for (this.field2554 = var3.field2562; this.field2554 != var3; this.field2554 = this.field2554.field2562) {
            if (this.field2554.field2563 == arg0) {
                class204 var4 = this.field2554;
                this.field2554 = this.field2554.field2562;
                return var4;
            }
        }
        this.field2554 = null;
        return null;
    }

    @ObfuscatedName("gr.i(Lgw;J)V")
    public void method3518(class204 arg0, long arg1) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        class204 var4 = this.field2555[(int) (arg1 & (long) (this.field2556 - 1))];
        arg0.field2561 = var4.field2561;
        arg0.field2562 = var4;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
        arg0.field2563 = arg1;
    }

    @ObfuscatedName("gr.w()V")
    public void method3519() {
        for (int var1 = 0; var1 < this.field2556; var1++) {
            class204 var2 = this.field2555[var1];
            while (true) {
                class204 var3 = var2.field2562;
                if (var2 == var3) {
                    break;
                }
                var3.method3561();
            }
        }
        this.field2554 = null;
        this.field2557 = null;
    }

    @ObfuscatedName("gr.s()Lgw;")
    public class204 method3520() {
        this.field2558 = 0;
        return this.method3516();
    }

    @ObfuscatedName("gr.j()Lgw;")
    public class204 method3516() {
        if (this.field2558 > 0 && this.field2555[this.field2558 - 1] != this.field2557) {
            class204 var1 = this.field2557;
            this.field2557 = var1.field2562;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2558 >= this.field2556) {
                return null;
            }
            var2 = this.field2555[this.field2558++].field2562;
        } while (this.field2555[this.field2558 - 1] == var2);
        this.field2557 = var2.field2562;
        return var2;
    }
}
