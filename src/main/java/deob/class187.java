package deob;

@ObfuscatedName("gq")
public class class187 extends class67 {

    @ObfuscatedName("gq.a")
    public class185 field3021;

    @ObfuscatedName("gq.d")
    public class200 field3020 = new class200();

    @ObfuscatedName("gq.c")
    public class56 field3022 = new class56();

    public class187(class185 arg0) {
        this.field3021 = arg0;
    }

    @ObfuscatedName("gq.k()Lbn;")
    public class67 method1216() {
        class188 var1 = (class188) this.field3020.method3665();
        if (var1 == null) {
            return null;
        } else if (var1.field3041 == null) {
            return this.method1243();
        } else {
            return var1.field3041;
        }
    }

    @ObfuscatedName("gq.r()Lbn;")
    public class67 method1243() {
        class188 var1;
        do {
            var1 = (class188) this.field3020.method3641();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3041 == null);
        return var1.field3041;
    }

    @ObfuscatedName("gq.p()I")
    public int method1211() {
        return 0;
    }

    @ObfuscatedName("gq.q([III)V")
    public void method1219(int[] arg0, int arg1, int arg2) {
        this.field3022.method1219(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3020.method3665(); var4 != null; var4 = (class188) this.field3020.method3641()) {
            if (!this.field3021.method3484(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3042) {
                        this.method3558(var4, arg0, var5, var6, var5 + var6);
                        var4.field3042 -= var6;
                        break;
                    }
                    this.method3558(var4, arg0, var5, var4.field3042, var5 + var6);
                    var5 += var4.field3042;
                    var6 -= var4.field3042;
                } while (!this.field3021.method3520(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gq.e(I)V")
    public void method1221(int arg0) {
        this.field3022.method1221(arg0);
        for (class188 var2 = (class188) this.field3020.method3665(); var2 != null; var2 = (class188) this.field3020.method3641()) {
            if (!this.field3021.method3484(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3042) {
                        this.method3555(var2, var3);
                        var2.field3042 -= var3;
                        break;
                    }
                    this.method3555(var2, var2.field3042);
                    var3 -= var2.field3042;
                } while (!this.field3021.method3520(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gq.a(Lgc;[IIIII)V")
    public void method3558(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3021.field2986[arg0.field3032] & 0x4) != 0 && arg0.field3037 < 0) {
            int var6 = this.field3021.field2994[arg0.field3032] / Statics.field974;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3043) / var6;
                if (var7 > arg3) {
                    arg0.field3043 += arg3 * var6;
                    break;
                }
                arg0.field3041.method1219(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3043 += var6 * var7 - 1048576;
                int var8 = Statics.field974 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3041;
                if (this.field3021.field2977[arg0.field3032] == 0) {
                    arg0.field3041 = class65.method1357(arg0.field3033, var10.method1479(), var10.method1363(), var10.method1364());
                } else {
                    arg0.field3041 = class65.method1357(arg0.field3033, var10.method1479(), 0, var10.method1364());
                    this.field3021.method3467(arg0, arg0.field3024.field2945[arg0.field3040] < 0);
                    arg0.field3041.method1433(var8, var10.method1363());
                }
                if (arg0.field3024.field2945[arg0.field3040] < 0) {
                    arg0.field3041.method1359(-1);
                }
                var10.method1369(var8);
                var10.method1219(arg1, arg2, arg4 - arg2);
                if (var10.method1397()) {
                    this.field3022.method1231(var10);
                }
            }
        }
        arg0.field3041.method1219(arg1, arg2, arg3);
    }

    @ObfuscatedName("gq.w(Lgc;IB)V")
    public void method3555(class188 arg0, int arg1) {
        if ((this.field3021.field2986[arg0.field3032] & 0x4) != 0 && arg0.field3037 < 0) {
            int var3 = this.field3021.field2994[arg0.field3032] / Statics.field974;
            int var4 = (var3 + 1048575 - arg0.field3043) / var3;
            arg0.field3043 = arg0.field3043 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3021.field2977[arg0.field3032] == 0) {
                    arg0.field3041 = class65.method1357(arg0.field3033, arg0.field3041.method1479(), arg0.field3041.method1363(), arg0.field3041.method1364());
                } else {
                    arg0.field3041 = class65.method1357(arg0.field3033, arg0.field3041.method1479(), 0, arg0.field3041.method1364());
                    this.field3021.method3467(arg0, arg0.field3024.field2945[arg0.field3040] < 0);
                }
                if (arg0.field3024.field2945[arg0.field3040] < 0) {
                    arg0.field3041.method1359(-1);
                }
                arg1 = arg0.field3043 / var3;
            }
        }
        arg0.field3041.method1221(arg1);
    }
}
