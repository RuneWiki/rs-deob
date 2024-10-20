package deob;

@ObfuscatedName("eg")
public class class144 extends class48 {

    @ObfuscatedName("eg.b")
    public class142 field2420;

    @ObfuscatedName("eg.e")
    public class177 field2415 = new class177();

    @ObfuscatedName("eg.g")
    public class46 field2416 = new class46();

    public class144(class142 arg0) {
        this.field2420 = arg0;
    }

    @ObfuscatedName("eg.m()Lai;")
    public class48 method942() {
        class146 var1 = (class146) this.field2415.method3314();
        if (var1 == null) {
            return null;
        } else if (var1.field2453 == null) {
            return this.method943();
        } else {
            return var1.field2453;
        }
    }

    @ObfuscatedName("eg.c()Lai;")
    public class48 method943() {
        class146 var1;
        do {
            var1 = (class146) this.field2415.method3325();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2453 == null);
        return var1.field2453;
    }

    @ObfuscatedName("eg.i()I")
    public int method957() {
        return 0;
    }

    @ObfuscatedName("eg.u([III)V")
    public void method984(int[] arg0, int arg1, int arg2) {
        this.field2416.method984(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2415.method3314(); var4 != null; var4 = (class146) this.field2415.method3325()) {
            if (!this.field2420.method2767(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2445) {
                        this.method2851(var4, arg0, var5, var6, var5 + var6);
                        var4.field2445 -= var6;
                        break;
                    }
                    this.method2851(var4, arg0, var5, var4.field2445, var5 + var6);
                    var5 += var4.field2445;
                    var6 -= var4.field2445;
                } while (!this.field2420.method2807(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eg.at(I)V")
    public void method945(int arg0) {
        this.field2416.method945(arg0);
        for (class146 var2 = (class146) this.field2415.method3314(); var2 != null; var2 = (class146) this.field2415.method3325()) {
            if (!this.field2420.method2767(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2445) {
                        this.method2854(var2, var3);
                        var2.field2445 -= var3;
                        break;
                    }
                    this.method2854(var2, var2.field2445);
                    var3 -= var2.field2445;
                } while (!this.field2420.method2807(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eg.b(Let;[IIIII)V")
    public void method2851(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2420.field2384[arg0.field2454] & 0x4) != 0 && arg0.field2438 < 0) {
            int var6 = this.field2420.field2389[arg0.field2454] / Statics.field1093;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2455) / var6;
                if (var7 > arg3) {
                    arg0.field2455 += arg3 * var6;
                    break;
                }
                arg0.field2453.method984(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2455 += var6 * var7 - 1048576;
                int var8 = Statics.field1093 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2453;
                if (this.field2420.field2387[arg0.field2454] == 0) {
                    arg0.field2453 = class45.method1059(arg0.field2437, var10.method971(), var10.method930(), var10.method1002());
                } else {
                    arg0.field2453 = class45.method1059(arg0.field2437, var10.method971(), 0, var10.method1002());
                    this.field2420.method2750(arg0, arg0.field2435.field2369[arg0.field2457] < 0);
                    arg0.field2453.method935(var8, var10.method930());
                }
                if (arg0.field2435.field2369[arg0.field2457] < 0) {
                    arg0.field2453.method1001(-1);
                }
                var10.method937(var8);
                var10.method984(arg1, arg2, arg4 - arg2);
                if (var10.method941()) {
                    this.field2416.method1084(var10);
                }
            }
        }
        arg0.field2453.method984(arg1, arg2, arg3);
    }

    @ObfuscatedName("eg.e(Let;IB)V")
    public void method2854(class146 arg0, int arg1) {
        if ((this.field2420.field2384[arg0.field2454] & 0x4) != 0 && arg0.field2438 < 0) {
            int var3 = this.field2420.field2389[arg0.field2454] / Statics.field1093;
            int var4 = (var3 + 1048575 - arg0.field2455) / var3;
            arg0.field2455 = arg0.field2455 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2420.field2387[arg0.field2454] == 0) {
                    arg0.field2453 = class45.method1059(arg0.field2437, arg0.field2453.method971(), arg0.field2453.method930(), arg0.field2453.method1002());
                } else {
                    arg0.field2453 = class45.method1059(arg0.field2437, arg0.field2453.method971(), 0, arg0.field2453.method1002());
                    this.field2420.method2750(arg0, arg0.field2435.field2369[arg0.field2457] < 0);
                }
                if (arg0.field2435.field2369[arg0.field2457] < 0) {
                    arg0.field2453.method1001(-1);
                }
                arg1 = arg0.field2455 / var3;
            }
        }
        arg0.field2453.method945(arg1);
    }
}
