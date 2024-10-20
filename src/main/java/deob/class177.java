package deob;

@ObfuscatedName("fj")
public class class177 extends class62 {

    @ObfuscatedName("fj.n")
    public class175 field2899;

    @ObfuscatedName("fj.d")
    public class190 field2898 = new class190();

    @ObfuscatedName("fj.z")
    public class51 field2900 = new class51();

    public class177(class175 arg0) {
        this.field2899 = arg0;
    }

    @ObfuscatedName("fj.g()Lbu;")
    public class62 method1020() {
        class178 var1 = (class178) this.field2898.method3497();
        if (var1 == null) {
            return null;
        } else if (var1.field2923 == null) {
            return this.method1046();
        } else {
            return var1.field2923;
        }
    }

    @ObfuscatedName("fj.f()Lbu;")
    public class62 method1046() {
        class178 var1;
        do {
            var1 = (class178) this.field2898.method3475();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2923 == null);
        return var1.field2923;
    }

    @ObfuscatedName("fj.m()I")
    public int method1009() {
        return 0;
    }

    @ObfuscatedName("fj.a([III)V")
    public void method1012(int[] arg0, int arg1, int arg2) {
        this.field2900.method1012(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2898.method3497(); var4 != null; var4 = (class178) this.field2898.method3475()) {
            if (!this.field2899.method3333(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2924) {
                        this.method3388(var4, arg0, var5, var6, var5 + var6);
                        var4.field2924 -= var6;
                        break;
                    }
                    this.method3388(var4, arg0, var5, var4.field2924, var5 + var6);
                    var5 += var4.field2924;
                    var6 -= var4.field2924;
                } while (!this.field2899.method3326(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fj.l(I)V")
    public void method1014(int arg0) {
        this.field2900.method1014(arg0);
        for (class178 var2 = (class178) this.field2898.method3497(); var2 != null; var2 = (class178) this.field2898.method3475()) {
            if (!this.field2899.method3333(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2924) {
                        this.method3389(var2, var3);
                        var2.field2924 -= var3;
                        break;
                    }
                    this.method3389(var2, var2.field2924);
                    var3 -= var2.field2924;
                } while (!this.field2899.method3326(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fj.n(Lfm;[IIIII)V")
    public void method3388(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2899.field2872[arg0.field2917] & 0x4) != 0 && arg0.field2921 < 0) {
            int var6 = this.field2899.field2877[arg0.field2917] / Statics.field3058;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2909) / var6;
                if (var7 > arg3) {
                    arg0.field2909 += arg3 * var6;
                    break;
                }
                arg0.field2923.method1012(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2909 += var6 * var7 - 1048576;
                int var8 = Statics.field3058 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2923;
                if (this.field2899.field2875[arg0.field2917] == 0) {
                    arg0.field2923 = class60.method1216(arg0.field2907, var10.method1175(), var10.method1166(), var10.method1167());
                } else {
                    arg0.field2923 = class60.method1216(arg0.field2907, var10.method1175(), 0, var10.method1167());
                    this.field2899.method3308(arg0, arg0.field2906.field2823[arg0.field2910] < 0);
                    arg0.field2923.method1171(var8, var10.method1166());
                }
                if (arg0.field2906.field2823[arg0.field2910] < 0) {
                    arg0.field2923.method1162(-1);
                }
                var10.method1173(var8);
                var10.method1012(arg1, arg2, arg4 - arg2);
                if (var10.method1214()) {
                    this.field2900.method1021(var10);
                }
            }
        }
        arg0.field2923.method1012(arg1, arg2, arg3);
    }

    @ObfuscatedName("fj.d(Lfm;II)V")
    public void method3389(class178 arg0, int arg1) {
        if ((this.field2899.field2872[arg0.field2917] & 0x4) != 0 && arg0.field2921 < 0) {
            int var3 = this.field2899.field2877[arg0.field2917] / Statics.field3058;
            int var4 = (var3 + 1048575 - arg0.field2909) / var3;
            arg0.field2909 = arg0.field2909 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2899.field2875[arg0.field2917] == 0) {
                    arg0.field2923 = class60.method1216(arg0.field2907, arg0.field2923.method1175(), arg0.field2923.method1166(), arg0.field2923.method1167());
                } else {
                    arg0.field2923 = class60.method1216(arg0.field2907, arg0.field2923.method1175(), 0, arg0.field2923.method1167());
                    this.field2899.method3308(arg0, arg0.field2906.field2823[arg0.field2910] < 0);
                }
                if (arg0.field2906.field2823[arg0.field2910] < 0) {
                    arg0.field2923.method1162(-1);
                }
                arg1 = arg0.field2909 / var3;
            }
        }
        arg0.field2923.method1014(arg1);
    }
}
