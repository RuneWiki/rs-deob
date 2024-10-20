package deob;

@ObfuscatedName("gx")
public final class class191 {

    @ObfuscatedName("gx.p")
    public int field2479;

    @ObfuscatedName("gx.m")
    public class193[] field2476;

    @ObfuscatedName("gx.e")
    public class193 field2477;

    @ObfuscatedName("gx.t")
    public class193 field2478;

    @ObfuscatedName("gx.w")
    public int field2475 = 0;

    public class191(int arg0) {
        this.field2479 = arg0;
        this.field2476 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2476[var2] = new class193();
            var3.field2484 = var3;
            var3.field2482 = var3;
        }
    }

    @ObfuscatedName("gx.p(J)Lgw;")
    public class193 method3190(long arg0) {
        class193 var3 = this.field2476[(int) (arg0 & (long) (this.field2479 - 1))];
        for (this.field2477 = var3.field2484; this.field2477 != var3; this.field2477 = this.field2477.field2484) {
            if (this.field2477.field2483 == arg0) {
                class193 var4 = this.field2477;
                this.field2477 = this.field2477.field2484;
                return var4;
            }
        }
        this.field2477 = null;
        return null;
    }

    @ObfuscatedName("gx.m(Lgw;J)V")
    public void method3191(class193 arg0, long arg1) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        class193 var4 = this.field2476[(int) (arg1 & (long) (this.field2479 - 1))];
        arg0.field2482 = var4.field2482;
        arg0.field2484 = var4;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
        arg0.field2483 = arg1;
    }

    @ObfuscatedName("gx.e()V")
    public void method3192() {
        for (int var1 = 0; var1 < this.field2479; var1++) {
            class193 var2 = this.field2476[var1];
            while (true) {
                class193 var3 = var2.field2484;
                if (var2 == var3) {
                    break;
                }
                var3.method3234();
            }
        }
        this.field2477 = null;
        this.field2478 = null;
    }

    @ObfuscatedName("gx.t()Lgw;")
    public class193 method3200() {
        this.field2475 = 0;
        return this.method3194();
    }

    @ObfuscatedName("gx.w()Lgw;")
    public class193 method3194() {
        if (this.field2475 > 0 && this.field2476[this.field2475 - 1] != this.field2478) {
            class193 var1 = this.field2478;
            this.field2478 = var1.field2484;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2475 >= this.field2479) {
                return null;
            }
            var2 = this.field2476[this.field2475++].field2484;
        } while (this.field2476[this.field2475 - 1] == var2);
        this.field2478 = var2.field2484;
        return var2;
    }
}
