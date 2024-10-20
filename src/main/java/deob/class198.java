package deob;

@ObfuscatedName("gs")
public final class class198 {

    @ObfuscatedName("gs.b")
    public int field2550;

    @ObfuscatedName("gs.s")
    public class200[] field2551;

    @ObfuscatedName("gs.r")
    public class200 field2549;

    @ObfuscatedName("gs.g")
    public class200 field2548;

    @ObfuscatedName("gs.x")
    public int field2552 = 0;

    public class198(int arg0) {
        this.field2550 = arg0;
        this.field2551 = new class200[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field2551[var2] = new class200();
            var3.field2556 = var3;
            var3.field2555 = var3;
        }
    }

    @ObfuscatedName("gs.b(J)Lgt;")
    public class200 method3340(long arg0) {
        class200 var3 = this.field2551[(int) (arg0 & (long) (this.field2550 - 1))];
        for (this.field2549 = var3.field2556; this.field2549 != var3; this.field2549 = this.field2549.field2556) {
            if (this.field2549.field2557 == arg0) {
                class200 var4 = this.field2549;
                this.field2549 = this.field2549.field2556;
                return var4;
            }
        }
        this.field2549 = null;
        return null;
    }

    @ObfuscatedName("gs.s(Lgt;J)V")
    public void method3352(class200 arg0, long arg1) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        class200 var4 = this.field2551[(int) (arg1 & (long) (this.field2550 - 1))];
        arg0.field2555 = var4.field2555;
        arg0.field2556 = var4;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
        arg0.field2557 = arg1;
    }

    @ObfuscatedName("gs.r()V")
    public void method3342() {
        for (int var1 = 0; var1 < this.field2550; var1++) {
            class200 var2 = this.field2551[var1];
            while (true) {
                class200 var3 = var2.field2556;
                if (var2 == var3) {
                    break;
                }
                var3.method3392();
            }
        }
        this.field2549 = null;
        this.field2548 = null;
    }

    @ObfuscatedName("gs.g()Lgt;")
    public class200 method3343() {
        this.field2552 = 0;
        return this.method3344();
    }

    @ObfuscatedName("gs.x()Lgt;")
    public class200 method3344() {
        if (this.field2552 > 0 && this.field2551[this.field2552 - 1] != this.field2548) {
            class200 var1 = this.field2548;
            this.field2548 = var1.field2556;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2552 >= this.field2550) {
                return null;
            }
            var2 = this.field2551[this.field2552++].field2556;
        } while (this.field2551[this.field2552 - 1] == var2);
        this.field2548 = var2.field2556;
        return var2;
    }
}
