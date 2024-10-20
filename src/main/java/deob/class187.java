package deob;

@ObfuscatedName("gf")
public class class187 extends class67 {

    @ObfuscatedName("gf.x")
    public class185 field3014;

    @ObfuscatedName("gf.t")
    public class200 field3013 = new class200();

    @ObfuscatedName("gf.p")
    public class56 field3015 = new class56();

    public class187(class185 arg0) {
        this.field3014 = arg0;
    }

    @ObfuscatedName("gf.y()Lbj;")
    public class67 method1147() {
        class188 var1 = (class188) this.field3013.method3585();
        if (var1 == null) {
            return null;
        } else if (var1.field3034 == null) {
            return this.method1138();
        } else {
            return var1.field3034;
        }
    }

    @ObfuscatedName("gf.m()Lbj;")
    public class67 method1138() {
        class188 var1;
        do {
            var1 = (class188) this.field3013.method3590();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3034 == null);
        return var1.field3034;
    }

    @ObfuscatedName("gf.c()I")
    public int method1148() {
        return 0;
    }

    @ObfuscatedName("gf.v([III)V")
    public void method1140(int[] arg0, int arg1, int arg2) {
        this.field3015.method1140(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3013.method3585(); var4 != null; var4 = (class188) this.field3013.method3590()) {
            if (!this.field3014.method3428(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3035) {
                        this.method3497(var4, arg0, var5, var6, var5 + var6);
                        var4.field3035 -= var6;
                        break;
                    }
                    this.method3497(var4, arg0, var5, var4.field3035, var5 + var6);
                    var5 += var4.field3035;
                    var6 -= var4.field3035;
                } while (!this.field3014.method3481(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gf.z(I)V")
    public void method1139(int arg0) {
        this.field3015.method1139(arg0);
        for (class188 var2 = (class188) this.field3013.method3585(); var2 != null; var2 = (class188) this.field3013.method3590()) {
            if (!this.field3014.method3428(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3035) {
                        this.method3498(var2, var3);
                        var2.field3035 -= var3;
                        break;
                    }
                    this.method3498(var2, var2.field3035);
                    var3 -= var2.field3035;
                } while (!this.field3014.method3481(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gf.w(Lgm;[IIIII)V")
    public void method3497(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3014.field3001[arg0.field3027] & 0x4) != 0 && arg0.field3021 < 0) {
            int var6 = this.field3014.field2995[arg0.field3027] / Statics.field2059;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3032) / var6;
                if (var7 > arg3) {
                    arg0.field3032 += arg3 * var6;
                    break;
                }
                arg0.field3034.method1140(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3032 += var6 * var7 - 1048576;
                int var8 = Statics.field2059 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3034;
                if (this.field3014.field2987[arg0.field3027] == 0) {
                    arg0.field3034 = class65.method1281(arg0.field3018, var10.method1387(), var10.method1286(), var10.method1287());
                } else {
                    arg0.field3034 = class65.method1281(arg0.field3018, var10.method1387(), 0, var10.method1287());
                    this.field3014.method3412(arg0, arg0.field3017.field2941[arg0.field3038] < 0);
                    arg0.field3034.method1291(var8, var10.method1286());
                }
                if (arg0.field3017.field2941[arg0.field3038] < 0) {
                    arg0.field3034.method1284(-1);
                }
                var10.method1293(var8);
                var10.method1140(arg1, arg2, arg4 - arg2);
                if (var10.method1296()) {
                    this.field3015.method1169(var10);
                }
            }
        }
        arg0.field3034.method1140(arg1, arg2, arg3);
    }

    @ObfuscatedName("gf.x(Lgm;IB)V")
    public void method3498(class188 arg0, int arg1) {
        if ((this.field3014.field3001[arg0.field3027] & 0x4) != 0 && arg0.field3021 < 0) {
            int var3 = this.field3014.field2995[arg0.field3027] / Statics.field2059;
            int var4 = (var3 + 1048575 - arg0.field3032) / var3;
            arg0.field3032 = arg0.field3032 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3014.field2987[arg0.field3027] == 0) {
                    arg0.field3034 = class65.method1281(arg0.field3018, arg0.field3034.method1387(), arg0.field3034.method1286(), arg0.field3034.method1287());
                } else {
                    arg0.field3034 = class65.method1281(arg0.field3018, arg0.field3034.method1387(), 0, arg0.field3034.method1287());
                    this.field3014.method3412(arg0, arg0.field3017.field2941[arg0.field3038] < 0);
                }
                if (arg0.field3017.field2941[arg0.field3038] < 0) {
                    arg0.field3034.method1284(-1);
                }
                arg1 = arg0.field3032 / var3;
            }
        }
        arg0.field3034.method1139(arg1);
    }
}
