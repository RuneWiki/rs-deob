package deob;

@ObfuscatedName("gu")
public class class186 extends class67 {

    @ObfuscatedName("gu.a")
    public class184 field2998;

    @ObfuscatedName("gu.r")
    public class199 field2996 = new class199();

    @ObfuscatedName("gu.f")
    public class56 field2997 = new class56();

    public class186(class184 arg0) {
        this.field2998 = arg0;
    }

    @ObfuscatedName("gu.e()Lbe;")
    public class67 method1131() {
        class187 var1 = (class187) this.field2996.method3575();
        if (var1 == null) {
            return null;
        } else if (var1.field3018 == null) {
            return this.method1165();
        } else {
            return var1.field3018;
        }
    }

    @ObfuscatedName("gu.g()Lbe;")
    public class67 method1165() {
        class187 var1;
        do {
            var1 = (class187) this.field2996.method3576();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3018 == null);
        return var1.field3018;
    }

    @ObfuscatedName("gu.m()I")
    public int method1132() {
        return 0;
    }

    @ObfuscatedName("gu.j([III)V")
    public void method1134(int[] arg0, int arg1, int arg2) {
        this.field2997.method1134(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2996.method3575(); var4 != null; var4 = (class187) this.field2996.method3576()) {
            if (!this.field2998.method3404(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3019) {
                        this.method3485(var4, arg0, var5, var6, var5 + var6);
                        var4.field3019 -= var6;
                        break;
                    }
                    this.method3485(var4, arg0, var5, var4.field3019, var5 + var6);
                    var5 += var4.field3019;
                    var6 -= var4.field3019;
                } while (!this.field2998.method3459(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gu.l(I)V")
    public void method1136(int arg0) {
        this.field2997.method1136(arg0);
        for (class187 var2 = (class187) this.field2996.method3575(); var2 != null; var2 = (class187) this.field2996.method3576()) {
            if (!this.field2998.method3404(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3019) {
                        this.method3486(var2, var3);
                        var2.field3019 -= var3;
                        break;
                    }
                    this.method3486(var2, var2.field3019);
                    var3 -= var2.field3019;
                } while (!this.field2998.method3459(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gu.a(Lgh;[IIIII)V")
    public void method3485(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2998.field2958[arg0.field3012] & 0x4) != 0 && arg0.field3014 < 0) {
            int var6 = this.field2998.field2970[arg0.field3012] / Statics.field1186;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3003) / var6;
                if (var7 > arg3) {
                    arg0.field3003 += arg3 * var6;
                    break;
                }
                arg0.field3018.method1134(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3003 += var6 * var7 - 1048576;
                int var8 = Statics.field1186 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3018;
                if (this.field2998.field2968[arg0.field3012] == 0) {
                    arg0.field3018 = class65.method1278(arg0.field3002, var10.method1293(), var10.method1284(), var10.method1375());
                } else {
                    arg0.field3018 = class65.method1278(arg0.field3002, var10.method1293(), 0, var10.method1375());
                    this.field2998.method3386(arg0, arg0.field3006.field2922[arg0.field3005] < 0);
                    arg0.field3018.method1415(var8, var10.method1284());
                }
                if (arg0.field3006.field2922[arg0.field3005] < 0) {
                    arg0.field3018.method1280(-1);
                }
                var10.method1321(var8);
                var10.method1134(arg1, arg2, arg4 - arg2);
                if (var10.method1376()) {
                    this.field2997.method1127(var10);
                }
            }
        }
        arg0.field3018.method1134(arg1, arg2, arg3);
    }

    @ObfuscatedName("gu.r(Lgh;II)V")
    public void method3486(class187 arg0, int arg1) {
        if ((this.field2998.field2958[arg0.field3012] & 0x4) != 0 && arg0.field3014 < 0) {
            int var3 = this.field2998.field2970[arg0.field3012] / Statics.field1186;
            int var4 = (var3 + 1048575 - arg0.field3003) / var3;
            arg0.field3003 = arg0.field3003 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2998.field2968[arg0.field3012] == 0) {
                    arg0.field3018 = class65.method1278(arg0.field3002, arg0.field3018.method1293(), arg0.field3018.method1284(), arg0.field3018.method1375());
                } else {
                    arg0.field3018 = class65.method1278(arg0.field3002, arg0.field3018.method1293(), 0, arg0.field3018.method1375());
                    this.field2998.method3386(arg0, arg0.field3006.field2922[arg0.field3005] < 0);
                }
                if (arg0.field3006.field2922[arg0.field3005] < 0) {
                    arg0.field3018.method1280(-1);
                }
                arg1 = arg0.field3003 / var3;
            }
        }
        arg0.field3018.method1136(arg1);
    }
}
