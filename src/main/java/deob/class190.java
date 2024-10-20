package deob;

@ObfuscatedName("gf")
public class class190 extends class70 {

    @ObfuscatedName("gf.s")
    public class188 field3053;

    @ObfuscatedName("gf.z")
    public class203 field3054 = new class203();

    @ObfuscatedName("gf.t")
    public class59 field3055 = new class59();

    public class190(class188 arg0) {
        this.field3053 = arg0;
    }

    @ObfuscatedName("gf.g()Lbi;")
    public class70 method1133() {
        class191 var1 = (class191) this.field3054.method3588();
        if (var1 == null) {
            return null;
        } else if (var1.field3074 == null) {
            return this.method1134();
        } else {
            return var1.field3074;
        }
    }

    @ObfuscatedName("gf.m()Lbi;")
    public class70 method1134() {
        class191 var1;
        do {
            var1 = (class191) this.field3054.method3590();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3074 == null);
        return var1.field3074;
    }

    @ObfuscatedName("gf.f()I")
    public int method1151() {
        return 0;
    }

    @ObfuscatedName("gf.k([III)V")
    public void method1135(int[] arg0, int arg1, int arg2) {
        this.field3055.method1135(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3054.method3588(); var4 != null; var4 = (class191) this.field3054.method3590()) {
            if (!this.field3053.method3420(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3075) {
                        this.method3502(var4, arg0, var5, var6, var5 + var6);
                        var4.field3075 -= var6;
                        break;
                    }
                    this.method3502(var4, arg0, var5, var4.field3075, var5 + var6);
                    var5 += var4.field3075;
                    var6 -= var4.field3075;
                } while (!this.field3053.method3462(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gf.r(I)V")
    public void method1137(int arg0) {
        this.field3055.method1137(arg0);
        for (class191 var2 = (class191) this.field3054.method3588(); var2 != null; var2 = (class191) this.field3054.method3590()) {
            if (!this.field3053.method3420(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3075) {
                        this.method3503(var2, var3);
                        var2.field3075 -= var3;
                        break;
                    }
                    this.method3503(var2, var2.field3075);
                    var3 -= var2.field3075;
                } while (!this.field3053.method3462(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gf.s(Lgd;[IIIII)V")
    public void method3502(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3053.field3023[arg0.field3068] & 0x4) != 0 && arg0.field3061 < 0) {
            int var6 = this.field3053.field3028[arg0.field3068] / Statics.field1220;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3076) / var6;
                if (var7 > arg3) {
                    arg0.field3076 += arg3 * var6;
                    break;
                }
                arg0.field3074.method1135(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3076 += var6 * var7 - 1048576;
                int var8 = Statics.field1220 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3074;
                if (this.field3053.field3026[arg0.field3068] == 0) {
                    arg0.field3074 = class68.method1294(arg0.field3058, var10.method1310(), var10.method1300(), var10.method1410());
                } else {
                    arg0.field3074 = class68.method1294(arg0.field3058, var10.method1310(), 0, var10.method1410());
                    this.field3053.method3403(arg0, arg0.field3070.field2973[arg0.field3073] < 0);
                    arg0.field3074.method1419(var8, var10.method1300());
                }
                if (arg0.field3070.field2973[arg0.field3073] < 0) {
                    arg0.field3074.method1296(-1);
                }
                var10.method1307(var8);
                var10.method1135(arg1, arg2, arg4 - arg2);
                if (var10.method1311()) {
                    this.field3055.method1128(var10);
                }
            }
        }
        arg0.field3074.method1135(arg1, arg2, arg3);
    }

    @ObfuscatedName("gf.z(Lgd;II)V")
    public void method3503(class191 arg0, int arg1) {
        if ((this.field3053.field3023[arg0.field3068] & 0x4) != 0 && arg0.field3061 < 0) {
            int var3 = this.field3053.field3028[arg0.field3068] / Statics.field1220;
            int var4 = (var3 + 1048575 - arg0.field3076) / var3;
            arg0.field3076 = arg0.field3076 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3053.field3026[arg0.field3068] == 0) {
                    arg0.field3074 = class68.method1294(arg0.field3058, arg0.field3074.method1310(), arg0.field3074.method1300(), arg0.field3074.method1410());
                } else {
                    arg0.field3074 = class68.method1294(arg0.field3058, arg0.field3074.method1310(), 0, arg0.field3074.method1410());
                    this.field3053.method3403(arg0, arg0.field3070.field2973[arg0.field3073] < 0);
                }
                if (arg0.field3070.field2973[arg0.field3073] < 0) {
                    arg0.field3074.method1296(-1);
                }
                arg1 = arg0.field3076 / var3;
            }
        }
        arg0.field3074.method1137(arg1);
    }
}
