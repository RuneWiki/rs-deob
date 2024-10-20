package deob;

@ObfuscatedName("gh")
public class class186 extends class67 {

    @ObfuscatedName("gh.i")
    public class184 field2996;

    @ObfuscatedName("gh.v")
    public class199 field2993 = new class199();

    @ObfuscatedName("gh.f")
    public class56 field2992 = new class56();

    public class186(class184 arg0) {
        this.field2996 = arg0;
    }

    @ObfuscatedName("gh.s()Lbe;")
    public class67 method1080() {
        class187 var1 = (class187) this.field2993.method3535();
        if (var1 == null) {
            return null;
        } else if (var1.field3016 == null) {
            return this.method1081();
        } else {
            return var1.field3016;
        }
    }

    @ObfuscatedName("gh.p()Lbe;")
    public class67 method1081() {
        class187 var1;
        do {
            var1 = (class187) this.field2993.method3537();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3016 == null);
        return var1.field3016;
    }

    @ObfuscatedName("gh.r()I")
    public int method1082() {
        return 0;
    }

    @ObfuscatedName("gh.k([III)V")
    public void method1079(int[] arg0, int arg1, int arg2) {
        this.field2992.method1079(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2993.method3535(); var4 != null; var4 = (class187) this.field2993.method3537()) {
            if (!this.field2996.method3361(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3017) {
                        this.method3446(var4, arg0, var5, var6, var5 + var6);
                        var4.field3017 -= var6;
                        break;
                    }
                    this.method3446(var4, arg0, var5, var4.field3017, var5 + var6);
                    var5 += var4.field3017;
                    var6 -= var4.field3017;
                } while (!this.field2996.method3366(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gh.n(I)V")
    public void method1074(int arg0) {
        this.field2992.method1074(arg0);
        for (class187 var2 = (class187) this.field2993.method3535(); var2 != null; var2 = (class187) this.field2993.method3537()) {
            if (!this.field2996.method3361(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3017) {
                        this.method3445(var2, var3);
                        var2.field3017 -= var3;
                        break;
                    }
                    this.method3445(var2, var2.field3017);
                    var3 -= var2.field3017;
                } while (!this.field2996.method3366(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gh.i(Lgx;[IIIIB)V")
    public void method3446(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2996.field2965[arg0.field3009] & 0x4) != 0 && arg0.field3012 < 0) {
            int var6 = this.field2996.field2954[arg0.field3009] / Statics.field1192;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3006) / var6;
                if (var7 > arg3) {
                    arg0.field3006 += arg3 * var6;
                    break;
                }
                arg0.field3016.method1079(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3006 += var6 * var7 - 1048576;
                int var8 = Statics.field1192 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3016;
                if (this.field2996.field2964[arg0.field3009] == 0) {
                    arg0.field3016 = class65.method1229(arg0.field3000, var10.method1244(), var10.method1223(), var10.method1297());
                } else {
                    arg0.field3016 = class65.method1229(arg0.field3000, var10.method1244(), 0, var10.method1297());
                    this.field2996.method3347(arg0, arg0.field2999.field2920[arg0.field2998] < 0);
                    arg0.field3016.method1240(var8, var10.method1223());
                }
                if (arg0.field2999.field2920[arg0.field2998] < 0) {
                    arg0.field3016.method1236(-1);
                }
                var10.method1242(var8);
                var10.method1079(arg1, arg2, arg4 - arg2);
                if (var10.method1280()) {
                    this.field2992.method1075(var10);
                }
            }
        }
        arg0.field3016.method1079(arg1, arg2, arg3);
    }

    @ObfuscatedName("gh.v(Lgx;II)V")
    public void method3445(class187 arg0, int arg1) {
        if ((this.field2996.field2965[arg0.field3009] & 0x4) != 0 && arg0.field3012 < 0) {
            int var3 = this.field2996.field2954[arg0.field3009] / Statics.field1192;
            int var4 = (var3 + 1048575 - arg0.field3006) / var3;
            arg0.field3006 = arg0.field3006 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2996.field2964[arg0.field3009] == 0) {
                    arg0.field3016 = class65.method1229(arg0.field3000, arg0.field3016.method1244(), arg0.field3016.method1223(), arg0.field3016.method1297());
                } else {
                    arg0.field3016 = class65.method1229(arg0.field3000, arg0.field3016.method1244(), 0, arg0.field3016.method1297());
                    this.field2996.method3347(arg0, arg0.field2999.field2920[arg0.field2998] < 0);
                }
                if (arg0.field2999.field2920[arg0.field2998] < 0) {
                    arg0.field3016.method1236(-1);
                }
                arg1 = arg0.field3006 / var3;
            }
        }
        arg0.field3016.method1074(arg1);
    }
}
