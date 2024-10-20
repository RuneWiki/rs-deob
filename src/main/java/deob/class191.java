package deob;

@ObfuscatedName("gd")
public final class class191 {

    @ObfuscatedName("gd.a")
    public int field2458;

    @ObfuscatedName("gd.j")
    public class193[] field2459;

    @ObfuscatedName("gd.n")
    public class193 field2462;

    @ObfuscatedName("gd.r")
    public class193 field2461;

    @ObfuscatedName("gd.v")
    public int field2460 = 0;

    public class191(int arg0) {
        this.field2458 = arg0;
        this.field2459 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2459[var2] = new class193();
            var3.field2466 = var3;
            var3.field2465 = var3;
        }
    }

    @ObfuscatedName("gd.a(J)Lge;")
    public class193 method3264(long arg0) {
        class193 var3 = this.field2459[(int) (arg0 & (long) (this.field2458 - 1))];
        for (this.field2462 = var3.field2466; this.field2462 != var3; this.field2462 = this.field2462.field2466) {
            if (this.field2462.field2467 == arg0) {
                class193 var4 = this.field2462;
                this.field2462 = this.field2462.field2466;
                return var4;
            }
        }
        this.field2462 = null;
        return null;
    }

    @ObfuscatedName("gd.j(Lge;J)V")
    public void method3260(class193 arg0, long arg1) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        class193 var4 = this.field2459[(int) (arg1 & (long) (this.field2458 - 1))];
        arg0.field2465 = var4.field2465;
        arg0.field2466 = var4;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
        arg0.field2467 = arg1;
    }

    @ObfuscatedName("gd.n()V")
    public void method3261() {
        for (int var1 = 0; var1 < this.field2458; var1++) {
            class193 var2 = this.field2459[var1];
            while (true) {
                class193 var3 = var2.field2466;
                if (var2 == var3) {
                    break;
                }
                var3.method3308();
            }
        }
        this.field2462 = null;
        this.field2461 = null;
    }

    @ObfuscatedName("gd.r()Lge;")
    public class193 method3262() {
        this.field2460 = 0;
        return this.method3263();
    }

    @ObfuscatedName("gd.v()Lge;")
    public class193 method3263() {
        if (this.field2460 > 0 && this.field2459[this.field2460 - 1] != this.field2461) {
            class193 var1 = this.field2461;
            this.field2461 = var1.field2466;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2460 >= this.field2458) {
                return null;
            }
            var2 = this.field2459[this.field2460++].field2466;
        } while (this.field2459[this.field2460 - 1] == var2);
        this.field2461 = var2.field2466;
        return var2;
    }
}
