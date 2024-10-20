package deob;

@ObfuscatedName("gb")
public class class187 extends class67 {

    @ObfuscatedName("gb.e")
    public class185 field3005;

    @ObfuscatedName("gb.f")
    public class200 field3004 = new class200();

    @ObfuscatedName("gb.s")
    public class56 field3003 = new class56();

    public class187(class185 arg0) {
        this.field3005 = arg0;
    }

    @ObfuscatedName("gb.h()Lbf;")
    public class67 method1104() {
        class188 var1 = (class188) this.field3004.method3544();
        if (var1 == null) {
            return null;
        } else if (var1.field3021 == null) {
            return this.method1109();
        } else {
            return var1.field3021;
        }
    }

    @ObfuscatedName("gb.g()Lbf;")
    public class67 method1109() {
        class188 var1;
        do {
            var1 = (class188) this.field3004.method3546();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3021 == null);
        return var1.field3021;
    }

    @ObfuscatedName("gb.a()I")
    public int method1110() {
        return 0;
    }

    @ObfuscatedName("gb.r([III)V")
    public void method1135(int[] arg0, int arg1, int arg2) {
        this.field3003.method1135(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3004.method3544(); var4 != null; var4 = (class188) this.field3004.method3546()) {
            if (!this.field3005.method3377(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3025) {
                        this.method3452(var4, arg0, var5, var6, var5 + var6);
                        var4.field3025 -= var6;
                        break;
                    }
                    this.method3452(var4, arg0, var5, var4.field3025, var5 + var6);
                    var5 += var4.field3025;
                    var6 -= var4.field3025;
                } while (!this.field3005.method3378(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gb.m(I)V")
    public void method1113(int arg0) {
        this.field3003.method1113(arg0);
        for (class188 var2 = (class188) this.field3004.method3544(); var2 != null; var2 = (class188) this.field3004.method3546()) {
            if (!this.field3005.method3377(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3025) {
                        this.method3451(var2, var3);
                        var2.field3025 -= var3;
                        break;
                    }
                    this.method3451(var2, var2.field3025);
                    var3 -= var2.field3025;
                } while (!this.field3005.method3378(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gb.e(Lgs;[IIIIB)V")
    public void method3452(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3005.field2976[arg0.field3017] & 0x4) != 0 && arg0.field3010 < 0) {
            int var6 = this.field3005.field2981[arg0.field3017] / Statics.field1154;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3006) / var6;
                if (var7 > arg3) {
                    arg0.field3006 += arg3 * var6;
                    break;
                }
                arg0.field3021.method1135(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3006 += var6 * var7 - 1048576;
                int var8 = Statics.field1154 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3021;
                if (this.field3005.field2979[arg0.field3017] == 0) {
                    arg0.field3021 = class65.method1252(arg0.field3008, var10.method1330(), var10.method1300(), var10.method1259());
                } else {
                    arg0.field3021 = class65.method1252(arg0.field3008, var10.method1330(), 0, var10.method1259());
                    this.field3005.method3358(arg0, arg0.field3012.field2934[arg0.field3011] < 0);
                    arg0.field3021.method1263(var8, var10.method1300());
                }
                if (arg0.field3012.field2934[arg0.field3011] < 0) {
                    arg0.field3021.method1374(-1);
                }
                var10.method1377(var8);
                var10.method1135(arg1, arg2, arg4 - arg2);
                if (var10.method1269()) {
                    this.field3003.method1103(var10);
                }
            }
        }
        arg0.field3021.method1135(arg1, arg2, arg3);
    }

    @ObfuscatedName("gb.w(Lgs;IB)V")
    public void method3451(class188 arg0, int arg1) {
        if ((this.field3005.field2976[arg0.field3017] & 0x4) != 0 && arg0.field3010 < 0) {
            int var3 = this.field3005.field2981[arg0.field3017] / Statics.field1154;
            int var4 = (var3 + 1048575 - arg0.field3006) / var3;
            arg0.field3006 = arg0.field3006 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3005.field2979[arg0.field3017] == 0) {
                    arg0.field3021 = class65.method1252(arg0.field3008, arg0.field3021.method1330(), arg0.field3021.method1300(), arg0.field3021.method1259());
                } else {
                    arg0.field3021 = class65.method1252(arg0.field3008, arg0.field3021.method1330(), 0, arg0.field3021.method1259());
                    this.field3005.method3358(arg0, arg0.field3012.field2934[arg0.field3011] < 0);
                }
                if (arg0.field3012.field2934[arg0.field3011] < 0) {
                    arg0.field3021.method1374(-1);
                }
                arg1 = arg0.field3006 / var3;
            }
        }
        arg0.field3021.method1113(arg1);
    }
}
