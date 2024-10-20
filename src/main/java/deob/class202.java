package deob;

@ObfuscatedName("gl")
public final class class202 {

    @ObfuscatedName("gl.n")
    public int field2591;

    @ObfuscatedName("gl.v")
    public class204[] field2590;

    @ObfuscatedName("gl.y")
    public class204 field2592;

    @ObfuscatedName("gl.r")
    public class204 field2593;

    @ObfuscatedName("gl.h")
    public int field2589 = 0;

    public class202(int arg0) {
        this.field2591 = arg0;
        this.field2590 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2590[var2] = new class204();
            var3.field2598 = var3;
            var3.field2596 = var3;
        }
    }

    @ObfuscatedName("gl.n(J)Lgw;")
    public class204 method3416(long arg0) {
        class204 var3 = this.field2590[(int) (arg0 & (long) (this.field2591 - 1))];
        for (this.field2592 = var3.field2598; this.field2592 != var3; this.field2592 = this.field2592.field2598) {
            if (this.field2592.field2597 == arg0) {
                class204 var4 = this.field2592;
                this.field2592 = this.field2592.field2598;
                return var4;
            }
        }
        this.field2592 = null;
        return null;
    }

    @ObfuscatedName("gl.v(Lgw;J)V")
    public void method3417(class204 arg0, long arg1) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        class204 var4 = this.field2590[(int) (arg1 & (long) (this.field2591 - 1))];
        arg0.field2596 = var4.field2596;
        arg0.field2598 = var4;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
        arg0.field2597 = arg1;
    }

    @ObfuscatedName("gl.y()V")
    public void method3418() {
        for (int var1 = 0; var1 < this.field2591; var1++) {
            class204 var2 = this.field2590[var1];
            while (true) {
                class204 var3 = var2.field2598;
                if (var2 == var3) {
                    break;
                }
                var3.method3474();
            }
        }
        this.field2592 = null;
        this.field2593 = null;
    }

    @ObfuscatedName("gl.r()Lgw;")
    public class204 method3419() {
        this.field2589 = 0;
        return this.method3415();
    }

    @ObfuscatedName("gl.h()Lgw;")
    public class204 method3415() {
        if (this.field2589 > 0 && this.field2590[this.field2589 - 1] != this.field2593) {
            class204 var1 = this.field2593;
            this.field2593 = var1.field2598;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2589 >= this.field2591) {
                return null;
            }
            var2 = this.field2590[this.field2589++].field2598;
        } while (this.field2590[this.field2589 - 1] == var2);
        this.field2593 = var2.field2598;
        return var2;
    }
}
