package deob;

@ObfuscatedName("gz")
public final class class191 {

    @ObfuscatedName("gz.n")
    public int field2479;

    @ObfuscatedName("gz.p")
    public class193[] field2476;

    @ObfuscatedName("gz.i")
    public class193 field2475;

    @ObfuscatedName("gz.j")
    public class193 field2477;

    @ObfuscatedName("gz.f")
    public int field2478 = 0;

    public class191(int arg0) {
        this.field2479 = arg0;
        this.field2476 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2476[var2] = new class193();
            var3.field2482 = var3;
            var3.field2484 = var3;
        }
    }

    @ObfuscatedName("gz.n(J)Lgr;")
    public class193 method3295(long arg0) {
        class193 var3 = this.field2476[(int) (arg0 & (long) (this.field2479 - 1))];
        for (this.field2475 = var3.field2482; this.field2475 != var3; this.field2475 = this.field2475.field2482) {
            if (this.field2475.field2483 == arg0) {
                class193 var4 = this.field2475;
                this.field2475 = this.field2475.field2482;
                return var4;
            }
        }
        this.field2475 = null;
        return null;
    }

    @ObfuscatedName("gz.p(Lgr;J)V")
    public void method3296(class193 arg0, long arg1) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        class193 var4 = this.field2476[(int) (arg1 & (long) (this.field2479 - 1))];
        arg0.field2484 = var4.field2484;
        arg0.field2482 = var4;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
        arg0.field2483 = arg1;
    }

    @ObfuscatedName("gz.i()V")
    public void method3313() {
        for (int var1 = 0; var1 < this.field2479; var1++) {
            class193 var2 = this.field2476[var1];
            while (true) {
                class193 var3 = var2.field2482;
                if (var2 == var3) {
                    break;
                }
                var3.method3347();
            }
        }
        this.field2475 = null;
        this.field2477 = null;
    }

    @ObfuscatedName("gz.j()Lgr;")
    public class193 method3298() {
        this.field2478 = 0;
        return this.method3306();
    }

    @ObfuscatedName("gz.f()Lgr;")
    public class193 method3306() {
        if (this.field2478 > 0 && this.field2476[this.field2478 - 1] != this.field2477) {
            class193 var1 = this.field2477;
            this.field2477 = var1.field2482;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2478 >= this.field2479) {
                return null;
            }
            var2 = this.field2476[this.field2478++].field2482;
        } while (this.field2476[this.field2478 - 1] == var2);
        this.field2477 = var2.field2482;
        return var2;
    }
}
