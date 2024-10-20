package deob;

@ObfuscatedName("it")
public class class238 extends class59 {

    @ObfuscatedName("it.f")
    public class235 field2891;

    @ObfuscatedName("it.e")
    public class295 field2890 = new class295();

    @ObfuscatedName("it.v")
    public class49 field2889 = new class49();

    public class238(class235 arg0) {
        this.field2891 = arg0;
    }

    @ObfuscatedName("it.o()Lbc;")
    public class59 method594() {
        class240 var1 = (class240) this.field2890.method4721();
        if (var1 == null) {
            return null;
        } else if (var1.field2913 == null) {
            return this.method595();
        } else {
            return var1.field2913;
        }
    }

    @ObfuscatedName("it.m()Lbc;")
    public class59 method595() {
        class240 var1;
        do {
            var1 = (class240) this.field2890.method4723();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2913 == null);
        return var1.field2913;
    }

    @ObfuscatedName("it.r()I")
    public int method596() {
        return 0;
    }

    @ObfuscatedName("it.h([III)V")
    public void method616(int[] arg0, int arg1, int arg2) {
        this.field2889.method616(arg0, arg1, arg2);
        for (class240 var4 = (class240) this.field2890.method4721(); var4 != null; var4 = (class240) this.field2890.method4723()) {
            if (!this.field2891.method4093(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2914) {
                        this.method4232(var4, arg0, var5, var6, var5 + var6);
                        var4.field2914 -= var6;
                        break;
                    }
                    this.method4232(var4, arg0, var5, var4.field2914, var5 + var6);
                    var5 += var4.field2914;
                    var6 -= var4.field2914;
                } while (!this.field2891.method4094(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("it.z(I)V")
    public void method599(int arg0) {
        this.field2889.method599(arg0);
        for (class240 var2 = (class240) this.field2890.method4721(); var2 != null; var2 = (class240) this.field2890.method4723()) {
            if (!this.field2891.method4093(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2914) {
                        this.method4227(var2, var3);
                        var2.field2914 -= var3;
                        break;
                    }
                    this.method4227(var2, var2.field2914);
                    var3 -= var2.field2914;
                } while (!this.field2891.method4094(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("it.f(Lib;[IIIIB)V")
    public void method4232(class240 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2891.field2852[arg0.field2899] & 0x4) != 0 && arg0.field2904 < 0) {
            int var6 = this.field2891.field2857[arg0.field2899] / Statics.field3922;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2900) / var6;
                if (var7 > arg3) {
                    arg0.field2900 += arg3 * var6;
                    break;
                }
                arg0.field2913.method616(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2900 += var6 * var7 - 1048576;
                int var8 = Statics.field3922 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2913;
                if (this.field2891.field2855[arg0.field2899] == 0) {
                    arg0.field2913 = class58.method753(arg0.field2897, var10.method772(), var10.method763(), var10.method764());
                } else {
                    arg0.field2913 = class58.method753(arg0.field2897, var10.method772(), 0, var10.method764());
                    this.field2891.method4076(arg0, arg0.field2896.field2883[arg0.field2911] < 0);
                    arg0.field2913.method768(var8, var10.method763());
                }
                if (arg0.field2896.field2883[arg0.field2911] < 0) {
                    arg0.field2913.method875(-1);
                }
                var10.method770(var8);
                var10.method616(arg1, arg2, arg4 - arg2);
                if (var10.method774()) {
                    this.field2889.method619(var10);
                }
            }
        }
        arg0.field2913.method616(arg1, arg2, arg3);
    }

    @ObfuscatedName("it.e(Lib;II)V")
    public void method4227(class240 arg0, int arg1) {
        if ((this.field2891.field2852[arg0.field2899] & 0x4) != 0 && arg0.field2904 < 0) {
            int var3 = this.field2891.field2857[arg0.field2899] / Statics.field3922;
            int var4 = (var3 + 1048575 - arg0.field2900) / var3;
            arg0.field2900 = arg0.field2900 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2891.field2855[arg0.field2899] == 0) {
                    arg0.field2913 = class58.method753(arg0.field2897, arg0.field2913.method772(), arg0.field2913.method763(), arg0.field2913.method764());
                } else {
                    arg0.field2913 = class58.method753(arg0.field2897, arg0.field2913.method772(), 0, arg0.field2913.method764());
                    this.field2891.method4076(arg0, arg0.field2896.field2883[arg0.field2911] < 0);
                }
                if (arg0.field2896.field2883[arg0.field2911] < 0) {
                    arg0.field2913.method875(-1);
                }
                arg1 = arg0.field2900 / var3;
            }
        }
        arg0.field2913.method599(arg1);
    }
}
