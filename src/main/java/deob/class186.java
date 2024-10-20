package deob;

@ObfuscatedName("ge")
public class class186 extends class67 {

    @ObfuscatedName("ge.k")
    public class184 field2991;

    @ObfuscatedName("ge.h")
    public class199 field2990 = new class199();

    @ObfuscatedName("ge.o")
    public class56 field2995 = new class56();

    public class186(class184 arg0) {
        this.field2991 = arg0;
    }

    @ObfuscatedName("ge.d()Lbk;")
    public class67 method1089() {
        class187 var1 = (class187) this.field2990.method3581();
        if (var1 == null) {
            return null;
        } else if (var1.field3014 == null) {
            return this.method1090();
        } else {
            return var1.field3014;
        }
    }

    @ObfuscatedName("ge.l()Lbk;")
    public class67 method1090() {
        class187 var1;
        do {
            var1 = (class187) this.field2990.method3583();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3014 == null);
        return var1.field3014;
    }

    @ObfuscatedName("ge.b()I")
    public int method1108() {
        return 0;
    }

    @ObfuscatedName("ge.j([III)V")
    public void method1086(int[] arg0, int arg1, int arg2) {
        this.field2995.method1086(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2990.method3581(); var4 != null; var4 = (class187) this.field2990.method3583()) {
            if (!this.field2991.method3473(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3015) {
                        this.method3494(var4, arg0, var5, var6, var5 + var6);
                        var4.field3015 -= var6;
                        break;
                    }
                    this.method3494(var4, arg0, var5, var4.field3015, var5 + var6);
                    var5 += var4.field3015;
                    var6 -= var4.field3015;
                } while (!this.field2991.method3414(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ge.i(I)V")
    public void method1094(int arg0) {
        this.field2995.method1094(arg0);
        for (class187 var2 = (class187) this.field2990.method3581(); var2 != null; var2 = (class187) this.field2990.method3583()) {
            if (!this.field2991.method3473(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3015) {
                        this.method3492(var2, var3);
                        var2.field3015 -= var3;
                        break;
                    }
                    this.method3492(var2, var2.field3015);
                    var3 -= var2.field3015;
                } while (!this.field2991.method3414(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ge.k(Lgk;[IIIIB)V")
    public void method3494(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2991.field2957[arg0.field3002] & 0x4) != 0 && arg0.field3013 < 0) {
            int var6 = this.field2991.field2952[arg0.field3002] / Statics.field2148;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2996) / var6;
                if (var7 > arg3) {
                    arg0.field2996 += arg3 * var6;
                    break;
                }
                arg0.field3014.method1086(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2996 += var6 * var7 - 1048576;
                int var8 = Statics.field2148 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3014;
                if (this.field2991.field2966[arg0.field3002] == 0) {
                    arg0.field3014 = class65.method1353(arg0.field2998, var10.method1245(), var10.method1252(), var10.method1361());
                } else {
                    arg0.field3014 = class65.method1353(arg0.field2998, var10.method1245(), 0, var10.method1361());
                    this.field2991.method3395(arg0, arg0.field2997.field2917[arg0.field3001] < 0);
                    arg0.field3014.method1257(var8, var10.method1252());
                }
                if (arg0.field2997.field2917[arg0.field3001] < 0) {
                    arg0.field3014.method1249(-1);
                }
                var10.method1259(var8);
                var10.method1086(arg1, arg2, arg4 - arg2);
                if (var10.method1263()) {
                    this.field2995.method1084(var10);
                }
            }
        }
        arg0.field3014.method1086(arg1, arg2, arg3);
    }

    @ObfuscatedName("ge.h(Lgk;II)V")
    public void method3492(class187 arg0, int arg1) {
        if ((this.field2991.field2957[arg0.field3002] & 0x4) != 0 && arg0.field3013 < 0) {
            int var3 = this.field2991.field2952[arg0.field3002] / Statics.field2148;
            int var4 = (var3 + 1048575 - arg0.field2996) / var3;
            arg0.field2996 = arg0.field2996 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2991.field2966[arg0.field3002] == 0) {
                    arg0.field3014 = class65.method1353(arg0.field2998, arg0.field3014.method1245(), arg0.field3014.method1252(), arg0.field3014.method1361());
                } else {
                    arg0.field3014 = class65.method1353(arg0.field2998, arg0.field3014.method1245(), 0, arg0.field3014.method1361());
                    this.field2991.method3395(arg0, arg0.field2997.field2917[arg0.field3001] < 0);
                }
                if (arg0.field2997.field2917[arg0.field3001] < 0) {
                    arg0.field3014.method1249(-1);
                }
                arg1 = arg0.field2996 / var3;
            }
        }
        arg0.field3014.method1094(arg1);
    }
}
