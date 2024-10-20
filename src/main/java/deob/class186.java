package deob;

@ObfuscatedName("gk")
public class class186 extends class67 {

    @ObfuscatedName("gk.n")
    public class184 field2998;

    @ObfuscatedName("gk.q")
    public class199 field2993 = new class199();

    @ObfuscatedName("gk.c")
    public class56 field2997 = new class56();

    public class186(class184 arg0) {
        this.field2998 = arg0;
    }

    @ObfuscatedName("gk.u()Lbu;")
    public class67 method1146() {
        class187 var1 = (class187) this.field2993.method3549();
        if (var1 == null) {
            return null;
        } else if (var1.field3017 == null) {
            return this.method1138();
        } else {
            return var1.field3017;
        }
    }

    @ObfuscatedName("gk.j()Lbu;")
    public class67 method1138() {
        class187 var1;
        do {
            var1 = (class187) this.field2993.method3550();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3017 == null);
        return var1.field3017;
    }

    @ObfuscatedName("gk.w()I")
    public int method1139() {
        return 0;
    }

    @ObfuscatedName("gk.y([III)V")
    public void method1140(int[] arg0, int arg1, int arg2) {
        this.field2997.method1140(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2993.method3549(); var4 != null; var4 = (class187) this.field2993.method3550()) {
            if (!this.field2998.method3440(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3018) {
                        this.method3458(var4, arg0, var5, var6, var5 + var6);
                        var4.field3018 -= var6;
                        break;
                    }
                    this.method3458(var4, arg0, var5, var4.field3018, var5 + var6);
                    var5 += var4.field3018;
                    var6 -= var4.field3018;
                } while (!this.field2998.method3413(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gk.h(I)V")
    public void method1142(int arg0) {
        this.field2997.method1142(arg0);
        for (class187 var2 = (class187) this.field2993.method3549(); var2 != null; var2 = (class187) this.field2993.method3550()) {
            if (!this.field2998.method3440(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3018) {
                        this.method3459(var2, var3);
                        var2.field3018 -= var3;
                        break;
                    }
                    this.method3459(var2, var2.field3018);
                    var3 -= var2.field3018;
                } while (!this.field2998.method3413(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gk.n(Lgn;[IIIIB)V")
    public void method3458(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2998.field2965[arg0.field3016] & 0x4) != 0 && arg0.field3013 < 0) {
            int var6 = this.field2998.field2977[arg0.field3016] / Statics.field2648;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3020) / var6;
                if (var7 > arg3) {
                    arg0.field3020 += arg3 * var6;
                    break;
                }
                arg0.field3017.method1140(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3020 += var6 * var7 - 1048576;
                int var8 = Statics.field2648 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3017;
                if (this.field2998.field2969[arg0.field3016] == 0) {
                    arg0.field3017 = class65.method1286(arg0.field3001, var10.method1293(), var10.method1411(), var10.method1313());
                } else {
                    arg0.field3017 = class65.method1286(arg0.field3001, var10.method1293(), 0, var10.method1313());
                    this.field2998.method3417(arg0, arg0.field3004.field2921[arg0.field3006] < 0);
                    arg0.field3017.method1296(var8, var10.method1411());
                }
                if (arg0.field3004.field2921[arg0.field3006] < 0) {
                    arg0.field3017.method1310(-1);
                }
                var10.method1298(var8);
                var10.method1140(arg1, arg2, arg4 - arg2);
                if (var10.method1302()) {
                    this.field2997.method1132(var10);
                }
            }
        }
        arg0.field3017.method1140(arg1, arg2, arg3);
    }

    @ObfuscatedName("gk.q(Lgn;II)V")
    public void method3459(class187 arg0, int arg1) {
        if ((this.field2998.field2965[arg0.field3016] & 0x4) != 0 && arg0.field3013 < 0) {
            int var3 = this.field2998.field2977[arg0.field3016] / Statics.field2648;
            int var4 = (var3 + 1048575 - arg0.field3020) / var3;
            arg0.field3020 = arg0.field3020 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2998.field2969[arg0.field3016] == 0) {
                    arg0.field3017 = class65.method1286(arg0.field3001, arg0.field3017.method1293(), arg0.field3017.method1411(), arg0.field3017.method1313());
                } else {
                    arg0.field3017 = class65.method1286(arg0.field3001, arg0.field3017.method1293(), 0, arg0.field3017.method1313());
                    this.field2998.method3417(arg0, arg0.field3004.field2921[arg0.field3006] < 0);
                }
                if (arg0.field3004.field2921[arg0.field3006] < 0) {
                    arg0.field3017.method1310(-1);
                }
                arg1 = arg0.field3020 / var3;
            }
        }
        arg0.field3017.method1142(arg1);
    }
}
