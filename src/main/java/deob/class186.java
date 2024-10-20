package deob;

@ObfuscatedName("gy")
public class class186 extends class67 {

    @ObfuscatedName("gy.g")
    public class184 field2988;

    @ObfuscatedName("gy.b")
    public class199 field2986 = new class199();

    @ObfuscatedName("gy.d")
    public class56 field2987 = new class56();

    public class186(class184 arg0) {
        this.field2988 = arg0;
    }

    @ObfuscatedName("gy.l()Lby;")
    public class67 method1174() {
        class187 var1 = (class187) this.field2986.method3603();
        if (var1 == null) {
            return null;
        } else if (var1.field3007 == null) {
            return this.method1149();
        } else {
            return var1.field3007;
        }
    }

    @ObfuscatedName("gy.m()Lby;")
    public class67 method1149() {
        class187 var1;
        do {
            var1 = (class187) this.field2986.method3596();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3007 == null);
        return var1.field3007;
    }

    @ObfuscatedName("gy.p()I")
    public int method1177() {
        return 0;
    }

    @ObfuscatedName("gy.u([III)V")
    public void method1151(int[] arg0, int arg1, int arg2) {
        this.field2987.method1151(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2986.method3603(); var4 != null; var4 = (class187) this.field2986.method3596()) {
            if (!this.field2988.method3470(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3006) {
                        this.method3515(var4, arg0, var5, var6, var5 + var6);
                        var4.field3006 -= var6;
                        break;
                    }
                    this.method3515(var4, arg0, var5, var4.field3006, var5 + var6);
                    var5 += var4.field3006;
                    var6 -= var4.field3006;
                } while (!this.field2988.method3438(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gy.v(I)V")
    public void method1173(int arg0) {
        this.field2987.method1173(arg0);
        for (class187 var2 = (class187) this.field2986.method3603(); var2 != null; var2 = (class187) this.field2986.method3596()) {
            if (!this.field2988.method3470(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3006) {
                        this.method3517(var2, var3);
                        var2.field3006 -= var3;
                        break;
                    }
                    this.method3517(var2, var2.field3006);
                    var3 -= var2.field3006;
                } while (!this.field2988.method3438(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gy.g(Lgk;[IIIII)V")
    public void method3515(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2988.field2964[arg0.field3005] & 0x4) != 0 && arg0.field3003 < 0) {
            int var6 = this.field2988.field2948[arg0.field3005] / Statics.field1189;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3009) / var6;
                if (var7 > arg3) {
                    arg0.field3009 += arg3 * var6;
                    break;
                }
                arg0.field3007.method1151(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3009 += var6 * var7 - 1048576;
                int var8 = Statics.field1189 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3007;
                if (this.field2988.field2960[arg0.field3005] == 0) {
                    arg0.field3007 = class65.method1308(arg0.field2991, var10.method1379(), var10.method1314(), var10.method1315());
                } else {
                    arg0.field3007 = class65.method1308(arg0.field2991, var10.method1379(), 0, var10.method1315());
                    this.field2988.method3417(arg0, arg0.field2990.field2914[arg0.field2994] < 0);
                    arg0.field3007.method1350(var8, var10.method1314());
                }
                if (arg0.field2990.field2914[arg0.field2994] < 0) {
                    arg0.field3007.method1310(-1);
                }
                var10.method1320(var8);
                var10.method1151(arg1, arg2, arg4 - arg2);
                if (var10.method1324()) {
                    this.field2987.method1143(var10);
                }
            }
        }
        arg0.field3007.method1151(arg1, arg2, arg3);
    }

    @ObfuscatedName("gy.b(Lgk;II)V")
    public void method3517(class187 arg0, int arg1) {
        if ((this.field2988.field2964[arg0.field3005] & 0x4) != 0 && arg0.field3003 < 0) {
            int var3 = this.field2988.field2948[arg0.field3005] / Statics.field1189;
            int var4 = (var3 + 1048575 - arg0.field3009) / var3;
            arg0.field3009 = arg0.field3009 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2988.field2960[arg0.field3005] == 0) {
                    arg0.field3007 = class65.method1308(arg0.field2991, arg0.field3007.method1379(), arg0.field3007.method1314(), arg0.field3007.method1315());
                } else {
                    arg0.field3007 = class65.method1308(arg0.field2991, arg0.field3007.method1379(), 0, arg0.field3007.method1315());
                    this.field2988.method3417(arg0, arg0.field2990.field2914[arg0.field2994] < 0);
                }
                if (arg0.field2990.field2914[arg0.field2994] < 0) {
                    arg0.field3007.method1310(-1);
                }
                arg1 = arg0.field3009 / var3;
            }
        }
        arg0.field3007.method1173(arg1);
    }
}
