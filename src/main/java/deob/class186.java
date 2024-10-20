package deob;

@ObfuscatedName("gt")
public class class186 extends class67 {

    @ObfuscatedName("gt.o")
    public class184 field3002;

    @ObfuscatedName("gt.e")
    public class199 field3000 = new class199();

    @ObfuscatedName("gt.u")
    public class56 field3001 = new class56();

    public class186(class184 arg0) {
        this.field3002 = arg0;
    }

    @ObfuscatedName("gt.s()Lby;")
    public class67 method1126() {
        class187 var1 = (class187) this.field3000.method3581();
        if (var1 == null) {
            return null;
        } else if (var1.field3013 == null) {
            return this.method1096();
        } else {
            return var1.field3013;
        }
    }

    @ObfuscatedName("gt.y()Lby;")
    public class67 method1096() {
        class187 var1;
        do {
            var1 = (class187) this.field3000.method3583();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3013 == null);
        return var1.field3013;
    }

    @ObfuscatedName("gt.t()I")
    public int method1091() {
        return 0;
    }

    @ObfuscatedName("gt.w([III)V")
    public void method1105(int[] arg0, int arg1, int arg2) {
        this.field3001.method1105(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field3000.method3581(); var4 != null; var4 = (class187) this.field3000.method3583()) {
            if (!this.field3002.method3404(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3026) {
                        this.method3486(var4, arg0, var5, var6, var5 + var6);
                        var4.field3026 -= var6;
                        break;
                    }
                    this.method3486(var4, arg0, var5, var4.field3026, var5 + var6);
                    var5 += var4.field3026;
                    var6 -= var4.field3026;
                } while (!this.field3002.method3423(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gt.d(I)V")
    public void method1098(int arg0) {
        this.field3001.method1098(arg0);
        for (class187 var2 = (class187) this.field3000.method3581(); var2 != null; var2 = (class187) this.field3000.method3583()) {
            if (!this.field3002.method3404(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3026) {
                        this.method3487(var2, var3);
                        var2.field3026 -= var3;
                        break;
                    }
                    this.method3487(var2, var2.field3026);
                    var3 -= var2.field3026;
                } while (!this.field3002.method3423(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gt.o(Lgw;[IIIII)V")
    public void method3486(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3002.field2978[arg0.field3023] & 0x4) != 0 && arg0.field3021 < 0) {
            int var6 = this.field3002.field2981[arg0.field3023] / Statics.field2641;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3022) / var6;
                if (var7 > arg3) {
                    arg0.field3022 += arg3 * var6;
                    break;
                }
                arg0.field3013.method1105(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3022 += var6 * var7 - 1048576;
                int var8 = Statics.field2641 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3013;
                if (this.field3002.field2975[arg0.field3023] == 0) {
                    arg0.field3013 = class65.method1258(arg0.field3009, var10.method1355(), var10.method1246(), var10.method1247());
                } else {
                    arg0.field3013 = class65.method1258(arg0.field3009, var10.method1355(), 0, var10.method1247());
                    this.field3002.method3386(arg0, arg0.field3008.field2927[arg0.field3018] < 0);
                    arg0.field3013.method1251(var8, var10.method1246());
                }
                if (arg0.field3008.field2927[arg0.field3018] < 0) {
                    arg0.field3013.method1242(-1);
                }
                var10.method1253(var8);
                var10.method1105(arg1, arg2, arg4 - arg2);
                if (var10.method1257()) {
                    this.field3001.method1090(var10);
                }
            }
        }
        arg0.field3013.method1105(arg1, arg2, arg3);
    }

    @ObfuscatedName("gt.e(Lgw;II)V")
    public void method3487(class187 arg0, int arg1) {
        if ((this.field3002.field2978[arg0.field3023] & 0x4) != 0 && arg0.field3021 < 0) {
            int var3 = this.field3002.field2981[arg0.field3023] / Statics.field2641;
            int var4 = (var3 + 1048575 - arg0.field3022) / var3;
            arg0.field3022 = arg0.field3022 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3002.field2975[arg0.field3023] == 0) {
                    arg0.field3013 = class65.method1258(arg0.field3009, arg0.field3013.method1355(), arg0.field3013.method1246(), arg0.field3013.method1247());
                } else {
                    arg0.field3013 = class65.method1258(arg0.field3009, arg0.field3013.method1355(), 0, arg0.field3013.method1247());
                    this.field3002.method3386(arg0, arg0.field3008.field2927[arg0.field3018] < 0);
                }
                if (arg0.field3008.field2927[arg0.field3018] < 0) {
                    arg0.field3013.method1242(-1);
                }
                arg1 = arg0.field3022 / var3;
            }
        }
        arg0.field3013.method1098(arg1);
    }
}
