package deob;

@ObfuscatedName("gg")
public class class187 extends class67 {

    @ObfuscatedName("gg.s")
    public class185 field3026;

    @ObfuscatedName("gg.j")
    public class200 field3025 = new class200();

    @ObfuscatedName("gg.p")
    public class56 field3023 = new class56();

    public class187(class185 arg0) {
        this.field3026 = arg0;
    }

    @ObfuscatedName("gg.u()Lbe;")
    public class67 method1100() {
        class188 var1 = (class188) this.field3025.method3553();
        if (var1 == null) {
            return null;
        } else if (var1.field3046 == null) {
            return this.method1113();
        } else {
            return var1.field3046;
        }
    }

    @ObfuscatedName("gg.o()Lbe;")
    public class67 method1113() {
        class188 var1;
        do {
            var1 = (class188) this.field3025.method3558();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3046 == null);
        return var1.field3046;
    }

    @ObfuscatedName("gg.b()I")
    public int method1102() {
        return 0;
    }

    @ObfuscatedName("gg.k([III)V")
    public void method1103(int[] arg0, int arg1, int arg2) {
        this.field3023.method1103(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3025.method3553(); var4 != null; var4 = (class188) this.field3025.method3558()) {
            if (!this.field3026.method3378(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3031) {
                        this.method3460(var4, arg0, var5, var6, var5 + var6);
                        var4.field3031 -= var6;
                        break;
                    }
                    this.method3460(var4, arg0, var5, var4.field3031, var5 + var6);
                    var5 += var4.field3031;
                    var6 -= var4.field3031;
                } while (!this.field3026.method3398(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gg.l(I)V")
    public void method1105(int arg0) {
        this.field3023.method1105(arg0);
        for (class188 var2 = (class188) this.field3025.method3553(); var2 != null; var2 = (class188) this.field3025.method3558()) {
            if (!this.field3026.method3378(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3031) {
                        this.method3459(var2, var3);
                        var2.field3031 -= var3;
                        break;
                    }
                    this.method3459(var2, var2.field3031);
                    var3 -= var2.field3031;
                } while (!this.field3026.method3398(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gg.s(Lgz;[IIIII)V")
    public void method3460(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3026.field2985[arg0.field3047] & 0x4) != 0 && arg0.field3028 < 0) {
            int var6 = this.field3026.field2999[arg0.field3047] / Statics.field1187;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3048) / var6;
                if (var7 > arg3) {
                    arg0.field3048 += arg3 * var6;
                    break;
                }
                arg0.field3046.method1103(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3048 += var6 * var7 - 1048576;
                int var8 = Statics.field1187 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3046;
                if (this.field3026.field2987[arg0.field3047] == 0) {
                    arg0.field3046 = class65.method1240(arg0.field3042, var10.method1254(), var10.method1303(), var10.method1296());
                } else {
                    arg0.field3046 = class65.method1240(arg0.field3042, var10.method1254(), 0, var10.method1296());
                    this.field3026.method3360(arg0, arg0.field3039.field2948[arg0.field3032] < 0);
                    arg0.field3046.method1374(var8, var10.method1303());
                }
                if (arg0.field3039.field2948[arg0.field3032] < 0) {
                    arg0.field3046.method1372(-1);
                }
                var10.method1383(var8);
                var10.method1103(arg1, arg2, arg4 - arg2);
                if (var10.method1280()) {
                    this.field3023.method1107(var10);
                }
            }
        }
        arg0.field3046.method1103(arg1, arg2, arg3);
    }

    @ObfuscatedName("gg.j(Lgz;II)V")
    public void method3459(class188 arg0, int arg1) {
        if ((this.field3026.field2985[arg0.field3047] & 0x4) != 0 && arg0.field3028 < 0) {
            int var3 = this.field3026.field2999[arg0.field3047] / Statics.field1187;
            int var4 = (var3 + 1048575 - arg0.field3048) / var3;
            arg0.field3048 = arg0.field3048 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3026.field2987[arg0.field3047] == 0) {
                    arg0.field3046 = class65.method1240(arg0.field3042, arg0.field3046.method1254(), arg0.field3046.method1303(), arg0.field3046.method1296());
                } else {
                    arg0.field3046 = class65.method1240(arg0.field3042, arg0.field3046.method1254(), 0, arg0.field3046.method1296());
                    this.field3026.method3360(arg0, arg0.field3039.field2948[arg0.field3032] < 0);
                }
                if (arg0.field3039.field2948[arg0.field3032] < 0) {
                    arg0.field3046.method1372(-1);
                }
                arg1 = arg0.field3048 / var3;
            }
        }
        arg0.field3046.method1105(arg1);
    }
}
