package deob;

@ObfuscatedName("gs")
public final class class191 {

    @ObfuscatedName("gs.w")
    public int field2459;

    @ObfuscatedName("gs.s")
    public class193[] field2457;

    @ObfuscatedName("gs.q")
    public class193 field2458;

    @ObfuscatedName("gs.o")
    public class193 field2460;

    @ObfuscatedName("gs.g")
    public int field2461 = 0;

    public class191(int arg0) {
        this.field2459 = arg0;
        this.field2457 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2457[var2] = new class193();
            var3.field2465 = var3;
            var3.field2466 = var3;
        }
    }

    @ObfuscatedName("gs.w(J)Lgd;")
    public class193 method3387(long arg0) {
        class193 var3 = this.field2457[(int) (arg0 & (long) (this.field2459 - 1))];
        for (this.field2458 = var3.field2465; this.field2458 != var3; this.field2458 = this.field2458.field2465) {
            if (this.field2458.field2464 == arg0) {
                class193 var4 = this.field2458;
                this.field2458 = this.field2458.field2465;
                return var4;
            }
        }
        this.field2458 = null;
        return null;
    }

    @ObfuscatedName("gs.s(Lgd;J)V")
    public void method3374(class193 arg0, long arg1) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        class193 var4 = this.field2457[(int) (arg1 & (long) (this.field2459 - 1))];
        arg0.field2466 = var4.field2466;
        arg0.field2465 = var4;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
        arg0.field2464 = arg1;
    }

    @ObfuscatedName("gs.q()V")
    public void method3376() {
        for (int var1 = 0; var1 < this.field2459; var1++) {
            class193 var2 = this.field2457[var1];
            while (true) {
                class193 var3 = var2.field2465;
                if (var2 == var3) {
                    break;
                }
                var3.method3425();
            }
        }
        this.field2458 = null;
        this.field2460 = null;
    }

    @ObfuscatedName("gs.o()Lgd;")
    public class193 method3377() {
        this.field2461 = 0;
        return this.method3378();
    }

    @ObfuscatedName("gs.g()Lgd;")
    public class193 method3378() {
        if (this.field2461 > 0 && this.field2457[this.field2461 - 1] != this.field2460) {
            class193 var1 = this.field2460;
            this.field2460 = var1.field2465;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2461 >= this.field2459) {
                return null;
            }
            var2 = this.field2457[this.field2461++].field2465;
        } while (this.field2457[this.field2461 - 1] == var2);
        this.field2460 = var2.field2465;
        return var2;
    }
}
