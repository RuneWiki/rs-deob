package deob;

@ObfuscatedName("hf")
public class class209 extends class120 {

    @ObfuscatedName("hf.c")
    public class205 field2561;

    @ObfuscatedName("hf.o")
    public class194 field2556 = new class194();

    @ObfuscatedName("hf.i")
    public class103 field2557 = new class103();

    public class209(class205 arg0) {
        this.field2561 = arg0;
    }

    @ObfuscatedName("hf.m()Ldk;")
    public class120 method1678() {
        class206 var1 = (class206) this.field2556.method3296();
        if (var1 == null) {
            return null;
        } else if (var1.field2511 == null) {
            return this.method1679();
        } else {
            return var1.field2511;
        }
    }

    @ObfuscatedName("hf.s()Ldk;")
    public class120 method1679() {
        class206 var1;
        do {
            var1 = (class206) this.field2556.method3298();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2511 == null);
        return var1.field2511;
    }

    @ObfuscatedName("hf.x()I")
    public int method1694() {
        return 0;
    }

    @ObfuscatedName("hf.p([III)V")
    public void method1681(int[] arg0, int arg1, int arg2) {
        this.field2557.method1681(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2556.method3296(); var4 != null; var4 = (class206) this.field2556.method3298()) {
            if (!this.field2561.method3418(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2524) {
                        this.method3563(var4, arg0, var5, var6, var5 + var6);
                        var4.field2524 -= var6;
                        break;
                    }
                    this.method3563(var4, arg0, var5, var4.field2524, var5 + var6);
                    var5 += var4.field2524;
                    var6 -= var4.field2524;
                } while (!this.field2561.method3419(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hf.r(I)V")
    public void method1683(int arg0) {
        this.field2557.method1683(arg0);
        for (class206 var2 = (class206) this.field2556.method3296(); var2 != null; var2 = (class206) this.field2556.method3298()) {
            if (!this.field2561.method3418(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2524) {
                        this.method3557(var2, var3);
                        var2.field2524 -= var3;
                        break;
                    }
                    this.method3557(var2, var2.field2524);
                    var3 -= var2.field2524;
                } while (!this.field2561.method3419(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hf.c(Lgz;[IIIIS)V")
    public void method3563(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2561.field2491[arg0.field2527] & 0x4) != 0 && arg0.field2523 < 0) {
            int var6 = this.field2561.field2496[arg0.field2527] / Statics.field1276;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2529) / var6;
                if (var7 > arg3) {
                    arg0.field2529 += arg3 * var6;
                    break;
                }
                arg0.field2511.method1681(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2529 += var6 * var7 - 1048576;
                int var8 = Statics.field1276 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2511;
                if (this.field2561.field2485[arg0.field2527] == 0) {
                    arg0.field2511 = class118.method1893(arg0.field2518, var10.method1949(), var10.method1899(), var10.method1900());
                } else {
                    arg0.field2511 = class118.method1893(arg0.field2518, var10.method1949(), 0, var10.method1900());
                    this.field2561.method3402(arg0, arg0.field2510.field2549[arg0.field2514] < 0);
                    arg0.field2511.method1904(var8, var10.method1899());
                }
                if (arg0.field2510.field2549[arg0.field2514] < 0) {
                    arg0.field2511.method1895(-1);
                }
                var10.method1905(var8);
                var10.method1681(arg1, arg2, arg4 - arg2);
                if (var10.method1909()) {
                    this.field2557.method1673(var10);
                }
            }
        }
        arg0.field2511.method1681(arg1, arg2, arg3);
    }

    @ObfuscatedName("hf.o(Lgz;IB)V")
    public void method3557(class206 arg0, int arg1) {
        if ((this.field2561.field2491[arg0.field2527] & 0x4) != 0 && arg0.field2523 < 0) {
            int var3 = this.field2561.field2496[arg0.field2527] / Statics.field1276;
            int var4 = (var3 + 1048575 - arg0.field2529) / var3;
            arg0.field2529 = arg0.field2529 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2561.field2485[arg0.field2527] == 0) {
                    arg0.field2511 = class118.method1893(arg0.field2518, arg0.field2511.method1949(), arg0.field2511.method1899(), arg0.field2511.method1900());
                } else {
                    arg0.field2511 = class118.method1893(arg0.field2518, arg0.field2511.method1949(), 0, arg0.field2511.method1900());
                    this.field2561.method3402(arg0, arg0.field2510.field2549[arg0.field2514] < 0);
                }
                if (arg0.field2510.field2549[arg0.field2514] < 0) {
                    arg0.field2511.method1895(-1);
                }
                arg1 = arg0.field2529 / var3;
            }
        }
        arg0.field2511.method1683(arg1);
    }
}
