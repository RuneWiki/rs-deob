package deob;

@ObfuscatedName("gh")
public class class186 extends class67 {

    @ObfuscatedName("gh.i")
    public class184 field2984;

    @ObfuscatedName("gh.v")
    public class199 field2985 = new class199();

    @ObfuscatedName("gh.r")
    public class56 field2988 = new class56();

    public class186(class184 arg0) {
        this.field2984 = arg0;
    }

    @ObfuscatedName("gh.q()Lbj;")
    public class67 method1138() {
        class187 var1 = (class187) this.field2985.method3534();
        if (var1 == null) {
            return null;
        } else if (var1.field2993 == null) {
            return this.method1139();
        } else {
            return var1.field2993;
        }
    }

    @ObfuscatedName("gh.h()Lbj;")
    public class67 method1139() {
        class187 var1;
        do {
            var1 = (class187) this.field2985.method3536();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2993 == null);
        return var1.field2993;
    }

    @ObfuscatedName("gh.d()I")
    public int method1171() {
        return 0;
    }

    @ObfuscatedName("gh.c([III)V")
    public void method1166(int[] arg0, int arg1, int arg2) {
        this.field2988.method1166(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2985.method3534(); var4 != null; var4 = (class187) this.field2985.method3536()) {
            if (!this.field2984.method3382(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3008) {
                        this.method3446(var4, arg0, var5, var6, var5 + var6);
                        var4.field3008 -= var6;
                        break;
                    }
                    this.method3446(var4, arg0, var5, var4.field3008, var5 + var6);
                    var5 += var4.field3008;
                    var6 -= var4.field3008;
                } while (!this.field2984.method3383(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gh.m(I)V")
    public void method1154(int arg0) {
        this.field2988.method1154(arg0);
        for (class187 var2 = (class187) this.field2985.method3534(); var2 != null; var2 = (class187) this.field2985.method3536()) {
            if (!this.field2984.method3382(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3008) {
                        this.method3447(var2, var3);
                        var2.field3008 -= var3;
                        break;
                    }
                    this.method3447(var2, var2.field3008);
                    var3 -= var2.field3008;
                } while (!this.field2984.method3383(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gh.i(Lgc;[IIIIB)V")
    public void method3446(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2984.field2956[arg0.field2997] & 0x4) != 0 && arg0.field3003 < 0) {
            int var6 = this.field2984.field2942[arg0.field2997] / Statics.field1190;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3009) / var6;
                if (var7 > arg3) {
                    arg0.field3009 += arg3 * var6;
                    break;
                }
                arg0.field2993.method1166(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3009 += var6 * var7 - 1048576;
                int var8 = Statics.field1190 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field2993;
                if (this.field2984.field2959[arg0.field2997] == 0) {
                    arg0.field2993 = class65.method1301(arg0.field3007, var10.method1316(), var10.method1307(), var10.method1425());
                } else {
                    arg0.field2993 = class65.method1301(arg0.field3007, var10.method1316(), 0, var10.method1425());
                    this.field2984.method3365(arg0, arg0.field2990.field2909[arg0.field2994] < 0);
                    arg0.field2993.method1312(var8, var10.method1307());
                }
                if (arg0.field2990.field2909[arg0.field2994] < 0) {
                    arg0.field2993.method1303(-1);
                }
                var10.method1368(var8);
                var10.method1166(arg1, arg2, arg4 - arg2);
                if (var10.method1318()) {
                    this.field2988.method1158(var10);
                }
            }
        }
        arg0.field2993.method1166(arg1, arg2, arg3);
    }

    @ObfuscatedName("gh.v(Lgc;IB)V")
    public void method3447(class187 arg0, int arg1) {
        if ((this.field2984.field2956[arg0.field2997] & 0x4) != 0 && arg0.field3003 < 0) {
            int var3 = this.field2984.field2942[arg0.field2997] / Statics.field1190;
            int var4 = (var3 + 1048575 - arg0.field3009) / var3;
            arg0.field3009 = arg0.field3009 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2984.field2959[arg0.field2997] == 0) {
                    arg0.field2993 = class65.method1301(arg0.field3007, arg0.field2993.method1316(), arg0.field2993.method1307(), arg0.field2993.method1425());
                } else {
                    arg0.field2993 = class65.method1301(arg0.field3007, arg0.field2993.method1316(), 0, arg0.field2993.method1425());
                    this.field2984.method3365(arg0, arg0.field2990.field2909[arg0.field2994] < 0);
                }
                if (arg0.field2990.field2909[arg0.field2994] < 0) {
                    arg0.field2993.method1303(-1);
                }
                arg1 = arg0.field3009 / var3;
            }
        }
        arg0.field2993.method1154(arg1);
    }
}
