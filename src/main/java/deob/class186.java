package deob;

@ObfuscatedName("gk")
public class class186 extends class67 {

    @ObfuscatedName("gk.o")
    public class184 field2994;

    @ObfuscatedName("gk.f")
    public class199 field2991 = new class199();

    @ObfuscatedName("gk.i")
    public class56 field2992 = new class56();

    public class186(class184 arg0) {
        this.field2994 = arg0;
    }

    @ObfuscatedName("gk.u()Lby;")
    public class67 method1073() {
        class187 var1 = (class187) this.field2991.method3520();
        if (var1 == null) {
            return null;
        } else if (var1.field3013 == null) {
            return this.method1098();
        } else {
            return var1.field3013;
        }
    }

    @ObfuscatedName("gk.m()Lby;")
    public class67 method1098() {
        class187 var1;
        do {
            var1 = (class187) this.field2991.method3522();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3013 == null);
        return var1.field3013;
    }

    @ObfuscatedName("gk.y()I")
    public int method1075() {
        return 0;
    }

    @ObfuscatedName("gk.p([III)V")
    public void method1095(int[] arg0, int arg1, int arg2) {
        this.field2992.method1095(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2991.method3520(); var4 != null; var4 = (class187) this.field2991.method3522()) {
            if (!this.field2994.method3352(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3014) {
                        this.method3427(var4, arg0, var5, var6, var5 + var6);
                        var4.field3014 -= var6;
                        break;
                    }
                    this.method3427(var4, arg0, var5, var4.field3014, var5 + var6);
                    var5 += var4.field3014;
                    var6 -= var4.field3014;
                } while (!this.field2994.method3347(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gk.g(I)V")
    public void method1089(int arg0) {
        this.field2992.method1089(arg0);
        for (class187 var2 = (class187) this.field2991.method3520(); var2 != null; var2 = (class187) this.field2991.method3522()) {
            if (!this.field2994.method3352(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3014) {
                        this.method3426(var2, var3);
                        var2.field3014 -= var3;
                        break;
                    }
                    this.method3426(var2, var2.field3014);
                    var3 -= var2.field3014;
                } while (!this.field2994.method3347(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gk.o(Lgo;[IIIII)V")
    public void method3427(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2994.field2963[arg0.field2999] & 0x4) != 0 && arg0.field3009 < 0) {
            int var6 = this.field2994.field2965[arg0.field2999] / Statics.field1172;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3008) / var6;
                if (var7 > arg3) {
                    arg0.field3008 += arg3 * var6;
                    break;
                }
                arg0.field3013.method1095(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3008 += var6 * var7 - 1048576;
                int var8 = Statics.field1172 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3013;
                if (this.field2994.field2966[arg0.field2999] == 0) {
                    arg0.field3013 = class65.method1336(arg0.field3001, var10.method1344(), var10.method1232(), var10.method1233());
                } else {
                    arg0.field3013 = class65.method1336(arg0.field3001, var10.method1344(), 0, var10.method1233());
                    this.field2994.method3374(arg0, arg0.field2996.field2923[arg0.field3000] < 0);
                    arg0.field3013.method1335(var8, var10.method1232());
                }
                if (arg0.field2996.field2923[arg0.field3000] < 0) {
                    arg0.field3013.method1228(-1);
                }
                var10.method1239(var8);
                var10.method1095(arg1, arg2, arg4 - arg2);
                if (var10.method1241()) {
                    this.field2992.method1068(var10);
                }
            }
        }
        arg0.field3013.method1095(arg1, arg2, arg3);
    }

    @ObfuscatedName("gk.f(Lgo;II)V")
    public void method3426(class187 arg0, int arg1) {
        if ((this.field2994.field2963[arg0.field2999] & 0x4) != 0 && arg0.field3009 < 0) {
            int var3 = this.field2994.field2965[arg0.field2999] / Statics.field1172;
            int var4 = (var3 + 1048575 - arg0.field3008) / var3;
            arg0.field3008 = arg0.field3008 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2994.field2966[arg0.field2999] == 0) {
                    arg0.field3013 = class65.method1336(arg0.field3001, arg0.field3013.method1344(), arg0.field3013.method1232(), arg0.field3013.method1233());
                } else {
                    arg0.field3013 = class65.method1336(arg0.field3001, arg0.field3013.method1344(), 0, arg0.field3013.method1233());
                    this.field2994.method3374(arg0, arg0.field2996.field2923[arg0.field3000] < 0);
                }
                if (arg0.field2996.field2923[arg0.field3000] < 0) {
                    arg0.field3013.method1228(-1);
                }
                arg1 = arg0.field3008 / var3;
            }
        }
        arg0.field3013.method1089(arg1);
    }
}
