package deob;

@ObfuscatedName("gw")
public final class class191 {

    @ObfuscatedName("gw.e")
    public int field2447;

    @ObfuscatedName("gw.o")
    public class193[] field2446;

    @ObfuscatedName("gw.m")
    public class193 field2445;

    @ObfuscatedName("gw.g")
    public class193 field2448;

    @ObfuscatedName("gw.d")
    public int field2449 = 0;

    public class191(int arg0) {
        this.field2447 = arg0;
        this.field2446 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2446[var2] = new class193();
            var3.field2453 = var3;
            var3.field2452 = var3;
        }
    }

    @ObfuscatedName("gw.e(J)Lgc;")
    public class193 method3268(long arg0) {
        class193 var3 = this.field2446[(int) (arg0 & (long) (this.field2447 - 1))];
        for (this.field2445 = var3.field2453; this.field2445 != var3; this.field2445 = this.field2445.field2453) {
            if (this.field2445.field2454 == arg0) {
                class193 var4 = this.field2445;
                this.field2445 = this.field2445.field2453;
                return var4;
            }
        }
        this.field2445 = null;
        return null;
    }

    @ObfuscatedName("gw.o(Lgc;J)V")
    public void method3259(class193 arg0, long arg1) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        class193 var4 = this.field2446[(int) (arg1 & (long) (this.field2447 - 1))];
        arg0.field2452 = var4.field2452;
        arg0.field2453 = var4;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
        arg0.field2454 = arg1;
    }

    @ObfuscatedName("gw.m()V")
    public void method3272() {
        for (int var1 = 0; var1 < this.field2447; var1++) {
            class193 var2 = this.field2446[var1];
            while (true) {
                class193 var3 = var2.field2453;
                if (var2 == var3) {
                    break;
                }
                var3.method3304();
            }
        }
        this.field2445 = null;
        this.field2448 = null;
    }

    @ObfuscatedName("gw.g()Lgc;")
    public class193 method3262() {
        this.field2449 = 0;
        return this.method3263();
    }

    @ObfuscatedName("gw.d()Lgc;")
    public class193 method3263() {
        if (this.field2449 > 0 && this.field2446[this.field2449 - 1] != this.field2448) {
            class193 var1 = this.field2448;
            this.field2448 = var1.field2453;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2449 >= this.field2447) {
                return null;
            }
            var2 = this.field2446[this.field2449++].field2453;
        } while (this.field2446[this.field2449 - 1] == var2);
        this.field2448 = var2.field2453;
        return var2;
    }
}
