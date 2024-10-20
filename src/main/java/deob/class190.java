package deob;

@ObfuscatedName("gn")
public class class190 extends class70 {

    @ObfuscatedName("gn.a")
    public class188 field3067;

    @ObfuscatedName("gn.d")
    public class203 field3065 = new class203();

    @ObfuscatedName("gn.v")
    public class59 field3068 = new class59();

    public class190(class188 arg0) {
        this.field3067 = arg0;
    }

    @ObfuscatedName("gn.t()Lbu;")
    public class70 method1208() {
        class191 var1 = (class191) this.field3065.method3617();
        if (var1 == null) {
            return null;
        } else if (var1.field3076 == null) {
            return this.method1171();
        } else {
            return var1.field3076;
        }
    }

    @ObfuscatedName("gn.n()Lbu;")
    public class70 method1171() {
        class191 var1;
        do {
            var1 = (class191) this.field3065.method3632();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3076 == null);
        return var1.field3076;
    }

    @ObfuscatedName("gn.i()I")
    public int method1172() {
        return 0;
    }

    @ObfuscatedName("gn.g([III)V")
    public void method1173(int[] arg0, int arg1, int arg2) {
        this.field3068.method1173(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3065.method3617(); var4 != null; var4 = (class191) this.field3065.method3632()) {
            if (!this.field3067.method3459(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3088) {
                        this.method3528(var4, arg0, var5, var6, var5 + var6);
                        var4.field3088 -= var6;
                        break;
                    }
                    this.method3528(var4, arg0, var5, var4.field3088, var5 + var6);
                    var5 += var4.field3088;
                    var6 -= var4.field3088;
                } while (!this.field3067.method3460(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gn.k(I)V")
    public void method1175(int arg0) {
        this.field3068.method1175(arg0);
        for (class191 var2 = (class191) this.field3065.method3617(); var2 != null; var2 = (class191) this.field3065.method3632()) {
            if (!this.field3067.method3459(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3088) {
                        this.method3527(var2, var3);
                        var2.field3088 -= var3;
                        break;
                    }
                    this.method3527(var2, var2.field3088);
                    var3 -= var2.field3088;
                } while (!this.field3067.method3460(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gn.a(Lgc;[IIIIB)V")
    public void method3528(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3067.field3038[arg0.field3072] & 0x4) != 0 && arg0.field3089 < 0) {
            int var6 = this.field3067.field3043[arg0.field3072] / Statics.field1266;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3091) / var6;
                if (var7 > arg3) {
                    arg0.field3091 += arg3 * var6;
                    break;
                }
                arg0.field3076.method1173(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3091 += var6 * var7 - 1048576;
                int var8 = Statics.field1266 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3076;
                if (this.field3067.field3041[arg0.field3072] == 0) {
                    arg0.field3076 = class68.method1328(arg0.field3071, var10.method1343(), var10.method1435(), var10.method1335());
                } else {
                    arg0.field3076 = class68.method1328(arg0.field3071, var10.method1343(), 0, var10.method1335());
                    this.field3067.method3471(arg0, arg0.field3070.field2998[arg0.field3074] < 0);
                    arg0.field3076.method1339(var8, var10.method1435());
                }
                if (arg0.field3070.field2998[arg0.field3074] < 0) {
                    arg0.field3076.method1391(-1);
                }
                var10.method1414(var8);
                var10.method1173(arg1, arg2, arg4 - arg2);
                if (var10.method1345()) {
                    this.field3068.method1165(var10);
                }
            }
        }
        arg0.field3076.method1173(arg1, arg2, arg3);
    }

    @ObfuscatedName("gn.d(Lgc;IB)V")
    public void method3527(class191 arg0, int arg1) {
        if ((this.field3067.field3038[arg0.field3072] & 0x4) != 0 && arg0.field3089 < 0) {
            int var3 = this.field3067.field3043[arg0.field3072] / Statics.field1266;
            int var4 = (var3 + 1048575 - arg0.field3091) / var3;
            arg0.field3091 = arg0.field3091 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3067.field3041[arg0.field3072] == 0) {
                    arg0.field3076 = class68.method1328(arg0.field3071, arg0.field3076.method1343(), arg0.field3076.method1435(), arg0.field3076.method1335());
                } else {
                    arg0.field3076 = class68.method1328(arg0.field3071, arg0.field3076.method1343(), 0, arg0.field3076.method1335());
                    this.field3067.method3471(arg0, arg0.field3070.field2998[arg0.field3074] < 0);
                }
                if (arg0.field3070.field2998[arg0.field3074] < 0) {
                    arg0.field3076.method1391(-1);
                }
                arg1 = arg0.field3091 / var3;
            }
        }
        arg0.field3076.method1175(arg1);
    }
}
