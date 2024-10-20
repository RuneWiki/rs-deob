package deob;

@ObfuscatedName("gh")
public class class186 extends class67 {

    @ObfuscatedName("gh.f")
    public class184 field2993;

    @ObfuscatedName("gh.s")
    public class199 field2991 = new class199();

    @ObfuscatedName("gh.q")
    public class56 field2990 = new class56();

    public class186(class184 arg0) {
        this.field2993 = arg0;
    }

    @ObfuscatedName("gh.t()Lbm;")
    public class67 method1155() {
        class187 var1 = (class187) this.field2991.method3566();
        if (var1 == null) {
            return null;
        } else if (var1.field3003 == null) {
            return this.method1125();
        } else {
            return var1.field3003;
        }
    }

    @ObfuscatedName("gh.j()Lbm;")
    public class67 method1125() {
        class187 var1;
        do {
            var1 = (class187) this.field2991.method3567();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3003 == null);
        return var1.field3003;
    }

    @ObfuscatedName("gh.n()I")
    public int method1132() {
        return 0;
    }

    @ObfuscatedName("gh.l([III)V")
    public void method1124(int[] arg0, int arg1, int arg2) {
        this.field2990.method1124(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2991.method3566(); var4 != null; var4 = (class187) this.field2991.method3567()) {
            if (!this.field2993.method3403(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3014) {
                        this.method3483(var4, arg0, var5, var6, var5 + var6);
                        var4.field3014 -= var6;
                        break;
                    }
                    this.method3483(var4, arg0, var5, var4.field3014, var5 + var6);
                    var5 += var4.field3014;
                    var6 -= var4.field3014;
                } while (!this.field2993.method3404(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gh.w(I)V")
    public void method1118(int arg0) {
        this.field2990.method1118(arg0);
        for (class187 var2 = (class187) this.field2991.method3566(); var2 != null; var2 = (class187) this.field2991.method3567()) {
            if (!this.field2993.method3403(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3014) {
                        this.method3487(var2, var3);
                        var2.field3014 -= var3;
                        break;
                    }
                    this.method3487(var2, var2.field3014);
                    var3 -= var2.field3014;
                } while (!this.field2993.method3404(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gh.f(Lgn;[IIIII)V")
    public void method3483(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2993.field2965[arg0.field3007] & 0x4) != 0 && arg0.field3009 < 0) {
            int var6 = this.field2993.field2969[arg0.field3007] / Statics.field3153;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3015) / var6;
                if (var7 > arg3) {
                    arg0.field3015 += arg3 * var6;
                    break;
                }
                arg0.field3003.method1124(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3015 += var6 * var7 - 1048576;
                int var8 = Statics.field3153 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3003;
                if (this.field2993.field2967[arg0.field3007] == 0) {
                    arg0.field3003 = class65.method1283(arg0.field2997, var10.method1298(), var10.method1289(), var10.method1290());
                } else {
                    arg0.field3003 = class65.method1283(arg0.field2997, var10.method1298(), 0, var10.method1290());
                    this.field2993.method3386(arg0, arg0.field3013.field2923[arg0.field2999] < 0);
                    arg0.field3003.method1294(var8, var10.method1289());
                }
                if (arg0.field3013.field2923[arg0.field2999] < 0) {
                    arg0.field3003.method1285(-1);
                }
                var10.method1391(var8);
                var10.method1124(arg1, arg2, arg4 - arg2);
                if (var10.method1300()) {
                    this.field2990.method1119(var10);
                }
            }
        }
        arg0.field3003.method1124(arg1, arg2, arg3);
    }

    @ObfuscatedName("gh.s(Lgn;II)V")
    public void method3487(class187 arg0, int arg1) {
        if ((this.field2993.field2965[arg0.field3007] & 0x4) != 0 && arg0.field3009 < 0) {
            int var3 = this.field2993.field2969[arg0.field3007] / Statics.field3153;
            int var4 = (var3 + 1048575 - arg0.field3015) / var3;
            arg0.field3015 = arg0.field3015 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2993.field2967[arg0.field3007] == 0) {
                    arg0.field3003 = class65.method1283(arg0.field2997, arg0.field3003.method1298(), arg0.field3003.method1289(), arg0.field3003.method1290());
                } else {
                    arg0.field3003 = class65.method1283(arg0.field2997, arg0.field3003.method1298(), 0, arg0.field3003.method1290());
                    this.field2993.method3386(arg0, arg0.field3013.field2923[arg0.field2999] < 0);
                }
                if (arg0.field3013.field2923[arg0.field2999] < 0) {
                    arg0.field3003.method1285(-1);
                }
                arg1 = arg0.field3015 / var3;
            }
        }
        arg0.field3003.method1118(arg1);
    }
}
