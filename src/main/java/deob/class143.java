package deob;

@ObfuscatedName("er")
public class class143 extends class48 {

    @ObfuscatedName("er.p")
    public class141 field2404;

    @ObfuscatedName("er.i")
    public class177 field2405 = new class177();

    @ObfuscatedName("er.o")
    public class46 field2406 = new class46();

    public class143(class141 arg0) {
        this.field2404 = arg0;
    }

    @ObfuscatedName("er.y()Law;")
    public class48 method990() {
        class145 var1 = (class145) this.field2405.method3334();
        if (var1 == null) {
            return null;
        } else if (var1.field2441 == null) {
            return this.method989();
        } else {
            return var1.field2441;
        }
    }

    @ObfuscatedName("er.t()Law;")
    public class48 method989() {
        class145 var1;
        do {
            var1 = (class145) this.field2405.method3355();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2441 == null);
        return var1.field2441;
    }

    @ObfuscatedName("er.k()I")
    public int method1046() {
        return 0;
    }

    @ObfuscatedName("er.z([III)V")
    public void method1044(int[] arg0, int arg1, int arg2) {
        this.field2406.method1044(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2405.method3334(); var4 != null; var4 = (class145) this.field2405.method3355()) {
            if (!this.field2404.method2796(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2442) {
                        this.method2872(var4, arg0, var5, var6, var5 + var6);
                        var4.field2442 -= var6;
                        break;
                    }
                    this.method2872(var4, arg0, var5, var4.field2442, var5 + var6);
                    var5 += var4.field2442;
                    var6 -= var4.field2442;
                } while (!this.field2404.method2797(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("er.at(I)V")
    public void method988(int arg0) {
        this.field2406.method988(arg0);
        for (class145 var2 = (class145) this.field2405.method3334(); var2 != null; var2 = (class145) this.field2405.method3355()) {
            if (!this.field2404.method2796(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2442) {
                        this.method2871(var2, var3);
                        var2.field2442 -= var3;
                        break;
                    }
                    this.method2871(var2, var2.field2442);
                    var3 -= var2.field2442;
                } while (!this.field2404.method2797(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("er.p(Lev;[IIIII)V")
    public void method2872(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2404.field2381[arg0.field2449] & 0x4) != 0 && arg0.field2437 < 0) {
            int var6 = this.field2404.field2392[arg0.field2449] / Statics.field1112;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2444) / var6;
                if (var7 > arg3) {
                    arg0.field2444 += arg3 * var6;
                    break;
                }
                arg0.field2441.method1044(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2444 += var6 * var7 - 1048576;
                int var8 = Statics.field1112 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2441;
                if (this.field2404.field2384[arg0.field2449] == 0) {
                    arg0.field2441 = class45.method972(arg0.field2443, var10.method987(), var10.method1076(), var10.method979());
                } else {
                    arg0.field2441 = class45.method972(arg0.field2443, var10.method987(), 0, var10.method979());
                    this.field2404.method2858(arg0, arg0.field2424.field2353[arg0.field2428] < 0);
                    arg0.field2441.method983(var8, var10.method1076());
                }
                if (arg0.field2424.field2353[arg0.field2428] < 0) {
                    arg0.field2441.method974(-1);
                }
                var10.method985(var8);
                var10.method1044(arg1, arg2, arg4 - arg2);
                if (var10.method1042()) {
                    this.field2406.method1134(var10);
                }
            }
        }
        arg0.field2441.method1044(arg1, arg2, arg3);
    }

    @ObfuscatedName("er.i(Lev;IB)V")
    public void method2871(class145 arg0, int arg1) {
        if ((this.field2404.field2381[arg0.field2449] & 0x4) != 0 && arg0.field2437 < 0) {
            int var3 = this.field2404.field2392[arg0.field2449] / Statics.field1112;
            int var4 = (var3 + 1048575 - arg0.field2444) / var3;
            arg0.field2444 = arg0.field2444 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2404.field2384[arg0.field2449] == 0) {
                    arg0.field2441 = class45.method972(arg0.field2443, arg0.field2441.method987(), arg0.field2441.method1076(), arg0.field2441.method979());
                } else {
                    arg0.field2441 = class45.method972(arg0.field2443, arg0.field2441.method987(), 0, arg0.field2441.method979());
                    this.field2404.method2858(arg0, arg0.field2424.field2353[arg0.field2428] < 0);
                }
                if (arg0.field2424.field2353[arg0.field2428] < 0) {
                    arg0.field2441.method974(-1);
                }
                arg1 = arg0.field2444 / var3;
            }
        }
        arg0.field2441.method988(arg1);
    }
}
