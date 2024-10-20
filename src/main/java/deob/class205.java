package deob;

@ObfuscatedName("go")
public final class class205 {

    @ObfuscatedName("go.c")
    public int field2462;

    @ObfuscatedName("go.q")
    public class207[] field2459;

    @ObfuscatedName("go.m")
    public class207 field2458;

    @ObfuscatedName("go.j")
    public class207 field2461;

    @ObfuscatedName("go.g")
    public int field2460 = 0;

    public class205(int arg0) {
        this.field2462 = arg0;
        this.field2459 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2459[var2] = new class207();
            var3.field2465 = var3;
            var3.field2467 = var3;
        }
    }

    @ObfuscatedName("go.c(J)Lgk;")
    public class207 method3687(long arg0) {
        class207 var3 = this.field2459[(int) (arg0 & (long) (this.field2462 - 1))];
        for (this.field2458 = var3.field2465; this.field2458 != var3; this.field2458 = this.field2458.field2465) {
            if (this.field2458.field2466 == arg0) {
                class207 var4 = this.field2458;
                this.field2458 = this.field2458.field2465;
                return var4;
            }
        }
        this.field2458 = null;
        return null;
    }

    @ObfuscatedName("go.q(Lgk;J)V")
    public void method3691(class207 arg0, long arg1) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        class207 var4 = this.field2459[(int) (arg1 & (long) (this.field2462 - 1))];
        arg0.field2467 = var4.field2467;
        arg0.field2465 = var4;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
        arg0.field2466 = arg1;
    }

    @ObfuscatedName("go.m()V")
    public void method3689() {
        for (int var1 = 0; var1 < this.field2462; var1++) {
            class207 var2 = this.field2459[var1];
            while (true) {
                class207 var3 = var2.field2465;
                if (var2 == var3) {
                    break;
                }
                var3.method3733();
            }
        }
        this.field2458 = null;
        this.field2461 = null;
    }

    @ObfuscatedName("go.j()Lgk;")
    public class207 method3690() {
        this.field2460 = 0;
        return this.method3692();
    }

    @ObfuscatedName("go.g()Lgk;")
    public class207 method3692() {
        if (this.field2460 > 0 && this.field2459[this.field2460 - 1] != this.field2461) {
            class207 var1 = this.field2461;
            this.field2461 = var1.field2465;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2460 >= this.field2462) {
                return null;
            }
            var2 = this.field2459[this.field2460++].field2465;
        } while (this.field2459[this.field2460 - 1] == var2);
        this.field2461 = var2.field2465;
        return var2;
    }
}
