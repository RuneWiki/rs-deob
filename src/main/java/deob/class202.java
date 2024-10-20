package deob;

@ObfuscatedName("gs")
public final class class202 {

    @ObfuscatedName("gs.s")
    public int field2579;

    @ObfuscatedName("gs.g")
    public class204[] field2578;

    @ObfuscatedName("gs.m")
    public class204 field2581;

    @ObfuscatedName("gs.h")
    public class204 field2580;

    @ObfuscatedName("gs.i")
    public int field2577 = 0;

    public class202(int arg0) {
        this.field2579 = arg0;
        this.field2578 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2578[var2] = new class204();
            var3.field2584 = var3;
            var3.field2586 = var3;
        }
    }

    @ObfuscatedName("gs.s(J)Lgf;")
    public class204 method3704(long arg0) {
        class204 var3 = this.field2578[(int) (arg0 & (long) (this.field2579 - 1))];
        for (this.field2581 = var3.field2584; this.field2581 != var3; this.field2581 = this.field2581.field2584) {
            if (this.field2581.field2585 == arg0) {
                class204 var4 = this.field2581;
                this.field2581 = this.field2581.field2584;
                return var4;
            }
        }
        this.field2581 = null;
        return null;
    }

    @ObfuscatedName("gs.g(Lgf;J)V")
    public void method3691(class204 arg0, long arg1) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        class204 var4 = this.field2578[(int) (arg1 & (long) (this.field2579 - 1))];
        arg0.field2586 = var4.field2586;
        arg0.field2584 = var4;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
        arg0.field2585 = arg1;
    }

    @ObfuscatedName("gs.m()V")
    public void method3692() {
        for (int var1 = 0; var1 < this.field2579; var1++) {
            class204 var2 = this.field2578[var1];
            while (true) {
                class204 var3 = var2.field2584;
                if (var2 == var3) {
                    break;
                }
                var3.method3740();
            }
        }
        this.field2581 = null;
        this.field2580 = null;
    }

    @ObfuscatedName("gs.h()Lgf;")
    public class204 method3693() {
        this.field2577 = 0;
        return this.method3694();
    }

    @ObfuscatedName("gs.i()Lgf;")
    public class204 method3694() {
        if (this.field2577 > 0 && this.field2578[this.field2577 - 1] != this.field2580) {
            class204 var1 = this.field2580;
            this.field2580 = var1.field2584;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2577 >= this.field2579) {
                return null;
            }
            var2 = this.field2578[this.field2577++].field2584;
        } while (this.field2578[this.field2577 - 1] == var2);
        this.field2580 = var2.field2584;
        return var2;
    }
}
