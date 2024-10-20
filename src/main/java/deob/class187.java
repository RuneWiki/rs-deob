package deob;

@ObfuscatedName("gh")
public class class187 extends class67 {

    @ObfuscatedName("gh.t")
    public class185 field3023;

    @ObfuscatedName("gh.i")
    public class200 field3024 = new class200();

    @ObfuscatedName("gh.g")
    public class56 field3026 = new class56();

    public class187(class185 arg0) {
        this.field3023 = arg0;
    }

    @ObfuscatedName("gh.r()Lby;")
    public class67 method1059() {
        class188 var1 = (class188) this.field3024.method3534();
        if (var1 == null) {
            return null;
        } else if (var1.field3046 == null) {
            return this.method1065();
        } else {
            return var1.field3046;
        }
    }

    @ObfuscatedName("gh.f()Lby;")
    public class67 method1065() {
        class188 var1;
        do {
            var1 = (class188) this.field3024.method3516();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3046 == null);
        return var1.field3046;
    }

    @ObfuscatedName("gh.s()I")
    public int method1066() {
        return 0;
    }

    @ObfuscatedName("gh.d([III)V")
    public void method1067(int[] arg0, int arg1, int arg2) {
        this.field3026.method1067(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3024.method3534(); var4 != null; var4 = (class188) this.field3024.method3516()) {
            if (!this.field3023.method3350(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3049) {
                        this.method3431(var4, arg0, var5, var6, var5 + var6);
                        var4.field3049 -= var6;
                        break;
                    }
                    this.method3431(var4, arg0, var5, var4.field3049, var5 + var6);
                    var5 += var4.field3049;
                    var6 -= var4.field3049;
                } while (!this.field3023.method3351(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gh.y(I)V")
    public void method1069(int arg0) {
        this.field3026.method1069(arg0);
        for (class188 var2 = (class188) this.field3024.method3534(); var2 != null; var2 = (class188) this.field3024.method3516()) {
            if (!this.field3023.method3350(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3049) {
                        this.method3432(var2, var3);
                        var2.field3049 -= var3;
                        break;
                    }
                    this.method3432(var2, var2.field3049);
                    var3 -= var2.field3049;
                } while (!this.field3023.method3351(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gh.t(Lgw;[IIIII)V")
    public void method3431(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3023.field2995[arg0.field3044] & 0x4) != 0 && arg0.field3042 < 0) {
            int var6 = this.field3023.field3000[arg0.field3044] / Statics.field1195;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3048) / var6;
                if (var7 > arg3) {
                    arg0.field3048 += arg3 * var6;
                    break;
                }
                arg0.field3046.method1067(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3048 += var6 * var7 - 1048576;
                int var8 = Statics.field1195 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3046;
                if (this.field3023.field3007[arg0.field3044] == 0) {
                    arg0.field3046 = class65.method1275(arg0.field3030, var10.method1336(), var10.method1218(), var10.method1219());
                } else {
                    arg0.field3046 = class65.method1275(arg0.field3030, var10.method1336(), 0, var10.method1219());
                    this.field3023.method3332(arg0, arg0.field3029.field2953[arg0.field3033] < 0);
                    arg0.field3046.method1223(var8, var10.method1218());
                }
                if (arg0.field3029.field2953[arg0.field3033] < 0) {
                    arg0.field3046.method1214(-1);
                }
                var10.method1225(var8);
                var10.method1067(arg1, arg2, arg4 - arg2);
                if (var10.method1228()) {
                    this.field3026.method1062(var10);
                }
            }
        }
        arg0.field3046.method1067(arg1, arg2, arg3);
    }

    @ObfuscatedName("gh.i(Lgw;II)V")
    public void method3432(class188 arg0, int arg1) {
        if ((this.field3023.field2995[arg0.field3044] & 0x4) != 0 && arg0.field3042 < 0) {
            int var3 = this.field3023.field3000[arg0.field3044] / Statics.field1195;
            int var4 = (var3 + 1048575 - arg0.field3048) / var3;
            arg0.field3048 = arg0.field3048 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3023.field3007[arg0.field3044] == 0) {
                    arg0.field3046 = class65.method1275(arg0.field3030, arg0.field3046.method1336(), arg0.field3046.method1218(), arg0.field3046.method1219());
                } else {
                    arg0.field3046 = class65.method1275(arg0.field3030, arg0.field3046.method1336(), 0, arg0.field3046.method1219());
                    this.field3023.method3332(arg0, arg0.field3029.field2953[arg0.field3033] < 0);
                }
                if (arg0.field3029.field2953[arg0.field3033] < 0) {
                    arg0.field3046.method1214(-1);
                }
                arg1 = arg0.field3048 / var3;
            }
        }
        arg0.field3046.method1069(arg1);
    }
}
