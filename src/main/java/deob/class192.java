package deob;

@ObfuscatedName("gk")
public final class class192 {

    @ObfuscatedName("gk.e")
    public int field2445;

    @ObfuscatedName("gk.n")
    public class194[] field2444;

    @ObfuscatedName("gk.g")
    public class194 field2446;

    @ObfuscatedName("gk.y")
    public class194 field2447;

    @ObfuscatedName("gk.w")
    public int field2448 = 0;

    public class192(int arg0) {
        this.field2445 = arg0;
        this.field2444 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field2444[var2] = new class194();
            var3.field2452 = var3;
            var3.field2453 = var3;
        }
    }

    @ObfuscatedName("gk.e(J)Lgx;")
    public class194 method3294(long arg0) {
        class194 var3 = this.field2444[(int) (arg0 & (long) (this.field2445 - 1))];
        for (this.field2446 = var3.field2452; this.field2446 != var3; this.field2446 = this.field2446.field2452) {
            if (this.field2446.field2451 == arg0) {
                class194 var4 = this.field2446;
                this.field2446 = this.field2446.field2452;
                return var4;
            }
        }
        this.field2446 = null;
        return null;
    }

    @ObfuscatedName("gk.n(Lgx;J)V")
    public void method3293(class194 arg0, long arg1) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        class194 var4 = this.field2444[(int) (arg1 & (long) (this.field2445 - 1))];
        arg0.field2453 = var4.field2453;
        arg0.field2452 = var4;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
        arg0.field2451 = arg1;
    }

    @ObfuscatedName("gk.g()V")
    public void method3296() {
        for (int var1 = 0; var1 < this.field2445; var1++) {
            class194 var2 = this.field2444[var1];
            while (true) {
                class194 var3 = var2.field2452;
                if (var2 == var3) {
                    break;
                }
                var3.method3333();
            }
        }
        this.field2446 = null;
        this.field2447 = null;
    }

    @ObfuscatedName("gk.y()Lgx;")
    public class194 method3295() {
        this.field2448 = 0;
        return this.method3302();
    }

    @ObfuscatedName("gk.w()Lgx;")
    public class194 method3302() {
        if (this.field2448 > 0 && this.field2444[this.field2448 - 1] != this.field2447) {
            class194 var1 = this.field2447;
            this.field2447 = var1.field2452;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2448 >= this.field2445) {
                return null;
            }
            var2 = this.field2444[this.field2448++].field2452;
        } while (this.field2444[this.field2448 - 1] == var2);
        this.field2447 = var2.field2452;
        return var2;
    }
}
