package deob;

@ObfuscatedName("gp")
public class class203 extends class116 {

    @ObfuscatedName("gp.z")
    public class199 field2466;

    @ObfuscatedName("gp.n")
    public class262 field2470 = new class262();

    @ObfuscatedName("gp.v")
    public class99 field2468 = new class99();

    public class203(class199 arg0) {
        this.field2466 = arg0;
    }

    @ObfuscatedName("gp.p()Ldc;")
    public class116 method2075() {
        class200 var1 = (class200) this.field2470.method4431();
        if (var1 == null) {
            return null;
        } else if (var1.field2438 == null) {
            return this.method2076();
        } else {
            return var1.field2438;
        }
    }

    @ObfuscatedName("gp.q()Ldc;")
    public class116 method2076() {
        class200 var1;
        do {
            var1 = (class200) this.field2470.method4454();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2438 == null);
        return var1.field2438;
    }

    @ObfuscatedName("gp.m()I")
    public int method2074() {
        return 0;
    }

    @ObfuscatedName("gp.y([III)V")
    public void method2078(int[] arg0, int arg1, int arg2) {
        this.field2468.method2078(arg0, arg1, arg2);
        for (class200 var4 = (class200) this.field2470.method4431(); var4 != null; var4 = (class200) this.field2470.method4454()) {
            if (!this.field2466.method3365(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2439) {
                        this.method3518(var4, arg0, var5, var6, var5 + var6);
                        var4.field2439 -= var6;
                        break;
                    }
                    this.method3518(var4, arg0, var5, var4.field2439, var5 + var6);
                    var5 += var4.field2439;
                    var6 -= var4.field2439;
                } while (!this.field2466.method3366(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gp.c(I)V")
    public void method2101(int arg0) {
        this.field2468.method2101(arg0);
        for (class200 var2 = (class200) this.field2470.method4431(); var2 != null; var2 = (class200) this.field2470.method4454()) {
            if (!this.field2466.method3365(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2439) {
                        this.method3517(var2, var3);
                        var2.field2439 -= var3;
                        break;
                    }
                    this.method3517(var2, var2.field2439);
                    var3 -= var2.field2439;
                } while (!this.field2466.method3366(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gp.z(Lgu;[IIIII)V")
    public void method3518(class200 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2466.field2405[arg0.field2421] & 0x4) != 0 && arg0.field2434 < 0) {
            int var6 = this.field2466.field2402[arg0.field2421] / Statics.field1930;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2420) / var6;
                if (var7 > arg3) {
                    arg0.field2420 += arg3 * var6;
                    break;
                }
                arg0.field2438.method2078(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2420 += var6 * var7 - 1048576;
                int var8 = Statics.field1930 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class114 var10 = arg0.field2438;
                if (this.field2466.field2409[arg0.field2421] == 0) {
                    arg0.field2438 = class114.method2318(arg0.field2422, var10.method2305(), var10.method2296(), var10.method2297());
                } else {
                    arg0.field2438 = class114.method2318(arg0.field2422, var10.method2305(), 0, var10.method2297());
                    this.field2466.method3346(arg0, arg0.field2431.field2458[arg0.field2425] < 0);
                    arg0.field2438.method2301(var8, var10.method2296());
                }
                if (arg0.field2431.field2458[arg0.field2425] < 0) {
                    arg0.field2438.method2292(-1);
                }
                var10.method2303(var8);
                var10.method2078(arg1, arg2, arg4 - arg2);
                if (var10.method2307()) {
                    this.field2468.method2070(var10);
                }
            }
        }
        arg0.field2438.method2078(arg1, arg2, arg3);
    }

    @ObfuscatedName("gp.n(Lgu;IB)V")
    public void method3517(class200 arg0, int arg1) {
        if ((this.field2466.field2405[arg0.field2421] & 0x4) != 0 && arg0.field2434 < 0) {
            int var3 = this.field2466.field2402[arg0.field2421] / Statics.field1930;
            int var4 = (var3 + 1048575 - arg0.field2420) / var3;
            arg0.field2420 = arg0.field2420 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2466.field2409[arg0.field2421] == 0) {
                    arg0.field2438 = class114.method2318(arg0.field2422, arg0.field2438.method2305(), arg0.field2438.method2296(), arg0.field2438.method2297());
                } else {
                    arg0.field2438 = class114.method2318(arg0.field2422, arg0.field2438.method2305(), 0, arg0.field2438.method2297());
                    this.field2466.method3346(arg0, arg0.field2431.field2458[arg0.field2425] < 0);
                }
                if (arg0.field2431.field2458[arg0.field2425] < 0) {
                    arg0.field2438.method2292(-1);
                }
                arg1 = arg0.field2420 / var3;
            }
        }
        arg0.field2438.method2101(arg1);
    }
}
