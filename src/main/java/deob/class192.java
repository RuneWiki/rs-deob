package deob;

@ObfuscatedName("gr")
public final class class192 {

    @ObfuscatedName("gr.j")
    public int field2463;

    @ObfuscatedName("gr.h")
    public class194[] field2461;

    @ObfuscatedName("gr.f")
    public class194 field2464;

    @ObfuscatedName("gr.p")
    public class194 field2462;

    @ObfuscatedName("gr.x")
    public int field2465 = 0;

    public class192(int arg0) {
        this.field2463 = arg0;
        this.field2461 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field2461[var2] = new class194();
            var3.field2470 = var3;
            var3.field2468 = var3;
        }
    }

    @ObfuscatedName("gr.j(J)Lga;")
    public class194 method3281(long arg0) {
        class194 var3 = this.field2461[(int) (arg0 & (long) (this.field2463 - 1))];
        for (this.field2464 = var3.field2470; this.field2464 != var3; this.field2464 = this.field2464.field2470) {
            if (this.field2464.field2469 == arg0) {
                class194 var4 = this.field2464;
                this.field2464 = this.field2464.field2470;
                return var4;
            }
        }
        this.field2464 = null;
        return null;
    }

    @ObfuscatedName("gr.h(Lga;J)V")
    public void method3274(class194 arg0, long arg1) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        class194 var4 = this.field2461[(int) (arg1 & (long) (this.field2463 - 1))];
        arg0.field2468 = var4.field2468;
        arg0.field2470 = var4;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
        arg0.field2469 = arg1;
    }

    @ObfuscatedName("gr.f()V")
    public void method3275() {
        for (int var1 = 0; var1 < this.field2463; var1++) {
            class194 var2 = this.field2461[var1];
            while (true) {
                class194 var3 = var2.field2470;
                if (var2 == var3) {
                    break;
                }
                var3.method3314();
            }
        }
        this.field2464 = null;
        this.field2462 = null;
    }

    @ObfuscatedName("gr.p()Lga;")
    public class194 method3276() {
        this.field2465 = 0;
        return this.method3277();
    }

    @ObfuscatedName("gr.x()Lga;")
    public class194 method3277() {
        if (this.field2465 > 0 && this.field2461[this.field2465 - 1] != this.field2462) {
            class194 var1 = this.field2462;
            this.field2462 = var1.field2470;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2465 >= this.field2463) {
                return null;
            }
            var2 = this.field2461[this.field2465++].field2470;
        } while (this.field2461[this.field2465 - 1] == var2);
        this.field2462 = var2.field2470;
        return var2;
    }
}
