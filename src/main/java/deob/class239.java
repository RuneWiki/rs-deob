package deob;

@ObfuscatedName("it")
public class class239 extends class31 {

    @ObfuscatedName("it.s")
    public class236 field2880;

    @ObfuscatedName("it.t")
    public class296 field2877 = new class296();

    @ObfuscatedName("it.v")
    public class21 field2878 = new class21();

    public class239(class236 arg0) {
        this.field2880 = arg0;
    }

    @ObfuscatedName("it.n()Laq;")
    public class31 method373() {
        class241 var1 = (class241) this.field2877.method4721();
        if (var1 == null) {
            return null;
        } else if (var1.field2901 == null) {
            return this.method396();
        } else {
            return var1.field2901;
        }
    }

    @ObfuscatedName("it.w()Laq;")
    public class31 method396() {
        class241 var1;
        do {
            var1 = (class241) this.field2877.method4712();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2901 == null);
        return var1.field2901;
    }

    @ObfuscatedName("it.f()I")
    public int method375() {
        return 0;
    }

    @ObfuscatedName("it.o([III)V")
    public void method376(int[] arg0, int arg1, int arg2) {
        this.field2878.method376(arg0, arg1, arg2);
        for (class241 var4 = (class241) this.field2877.method4721(); var4 != null; var4 = (class241) this.field2877.method4712()) {
            if (!this.field2880.method4032(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2902) {
                        this.method4160(var4, arg0, var5, var6, var5 + var6);
                        var4.field2902 -= var6;
                        break;
                    }
                    this.method4160(var4, arg0, var5, var4.field2902, var5 + var6);
                    var5 += var4.field2902;
                    var6 -= var4.field2902;
                } while (!this.field2880.method4033(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("it.r(I)V")
    public void method378(int arg0) {
        this.field2878.method378(arg0);
        for (class241 var2 = (class241) this.field2877.method4721(); var2 != null; var2 = (class241) this.field2877.method4712()) {
            if (!this.field2880.method4032(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2902) {
                        this.method4159(var2, var3);
                        var2.field2902 -= var3;
                        break;
                    }
                    this.method4159(var2, var2.field2902);
                    var3 -= var2.field2902;
                } while (!this.field2880.method4033(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("it.s(Liu;[IIIII)V")
    public void method4160(class241 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2880.field2831[arg0.field2903] & 0x4) != 0 && arg0.field2897 < 0) {
            int var6 = this.field2880.field2842[arg0.field2903] / Statics.field3634;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2899) / var6;
                if (var7 > arg3) {
                    arg0.field2899 += arg3 * var6;
                    break;
                }
                arg0.field2901.method376(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2899 += var6 * var7 - 1048576;
                int var8 = Statics.field3634 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class30 var10 = arg0.field2901;
                if (this.field2880.field2840[arg0.field2903] == 0) {
                    arg0.field2901 = class30.method529(arg0.field2885, var10.method544(), var10.method535(), var10.method536());
                } else {
                    arg0.field2901 = class30.method529(arg0.field2885, var10.method544(), 0, var10.method536());
                    this.field2880.method4004(arg0, arg0.field2891.field2869[arg0.field2894] < 0);
                    arg0.field2901.method540(var8, var10.method535());
                }
                if (arg0.field2891.field2869[arg0.field2894] < 0) {
                    arg0.field2901.method603(-1);
                }
                var10.method542(var8);
                var10.method376(arg1, arg2, arg4 - arg2);
                if (var10.method546()) {
                    this.field2878.method368(var10);
                }
            }
        }
        arg0.field2901.method376(arg1, arg2, arg3);
    }

    @ObfuscatedName("it.t(Liu;IB)V")
    public void method4159(class241 arg0, int arg1) {
        if ((this.field2880.field2831[arg0.field2903] & 0x4) != 0 && arg0.field2897 < 0) {
            int var3 = this.field2880.field2842[arg0.field2903] / Statics.field3634;
            int var4 = (var3 + 1048575 - arg0.field2899) / var3;
            arg0.field2899 = arg0.field2899 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2880.field2840[arg0.field2903] == 0) {
                    arg0.field2901 = class30.method529(arg0.field2885, arg0.field2901.method544(), arg0.field2901.method535(), arg0.field2901.method536());
                } else {
                    arg0.field2901 = class30.method529(arg0.field2885, arg0.field2901.method544(), 0, arg0.field2901.method536());
                    this.field2880.method4004(arg0, arg0.field2891.field2869[arg0.field2894] < 0);
                }
                if (arg0.field2891.field2869[arg0.field2894] < 0) {
                    arg0.field2901.method603(-1);
                }
                arg1 = arg0.field2899 / var3;
            }
        }
        arg0.field2901.method378(arg1);
    }
}
