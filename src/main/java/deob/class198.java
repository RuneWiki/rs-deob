package deob;

@ObfuscatedName("gn")
public final class class198 {

    @ObfuscatedName("gn.d")
    public int field2557;

    @ObfuscatedName("gn.x")
    public class200[] field2558;

    @ObfuscatedName("gn.k")
    public class200 field2559;

    @ObfuscatedName("gn.z")
    public class200 field2561;

    @ObfuscatedName("gn.v")
    public int field2560 = 0;

    public class198(int arg0) {
        this.field2557 = arg0;
        this.field2558 = new class200[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field2558[var2] = new class200();
            var3.field2565 = var3;
            var3.field2566 = var3;
        }
    }

    @ObfuscatedName("gn.d(J)Lgf;")
    public class200 method3438(long arg0) {
        class200 var3 = this.field2558[(int) (arg0 & (long) (this.field2557 - 1))];
        for (this.field2559 = var3.field2565; this.field2559 != var3; this.field2559 = this.field2559.field2565) {
            if (this.field2559.field2564 == arg0) {
                class200 var4 = this.field2559;
                this.field2559 = this.field2559.field2565;
                return var4;
            }
        }
        this.field2559 = null;
        return null;
    }

    @ObfuscatedName("gn.x(Lgf;J)V")
    public void method3431(class200 arg0, long arg1) {
        if (arg0.field2566 != null) {
            arg0.method3475();
        }
        class200 var4 = this.field2558[(int) (arg1 & (long) (this.field2557 - 1))];
        arg0.field2566 = var4.field2566;
        arg0.field2565 = var4;
        arg0.field2566.field2565 = arg0;
        arg0.field2565.field2566 = arg0;
        arg0.field2564 = arg1;
    }

    @ObfuscatedName("gn.k()V")
    public void method3441() {
        for (int var1 = 0; var1 < this.field2557; var1++) {
            class200 var2 = this.field2558[var1];
            while (true) {
                class200 var3 = var2.field2565;
                if (var2 == var3) {
                    break;
                }
                var3.method3475();
            }
        }
        this.field2559 = null;
        this.field2561 = null;
    }

    @ObfuscatedName("gn.z()Lgf;")
    public class200 method3437() {
        this.field2560 = 0;
        return this.method3433();
    }

    @ObfuscatedName("gn.v()Lgf;")
    public class200 method3433() {
        if (this.field2560 > 0 && this.field2558[this.field2560 - 1] != this.field2561) {
            class200 var1 = this.field2561;
            this.field2561 = var1.field2565;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2560 >= this.field2557) {
                return null;
            }
            var2 = this.field2558[this.field2560++].field2565;
        } while (this.field2558[this.field2560 - 1] == var2);
        this.field2561 = var2.field2565;
        return var2;
    }
}
