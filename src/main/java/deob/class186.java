package deob;

@ObfuscatedName("gl")
public class class186 extends class67 {

    @ObfuscatedName("gl.v")
    public class184 field3010;

    @ObfuscatedName("gl.f")
    public class199 field3013 = new class199();

    @ObfuscatedName("gl.i")
    public class56 field3012 = new class56();

    public class186(class184 arg0) {
        this.field3010 = arg0;
    }

    @ObfuscatedName("gl.c()Lbk;")
    public class67 method1139() {
        class187 var1 = (class187) this.field3013.method3563();
        if (var1 == null) {
            return null;
        } else if (var1.field3026 == null) {
            return this.method1118();
        } else {
            return var1.field3026;
        }
    }

    @ObfuscatedName("gl.p()Lbk;")
    public class67 method1118() {
        class187 var1;
        do {
            var1 = (class187) this.field3013.method3565();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3026 == null);
        return var1.field3026;
    }

    @ObfuscatedName("gl.j()I")
    public int method1119() {
        return 0;
    }

    @ObfuscatedName("gl.a([III)V")
    public void method1149(int[] arg0, int arg1, int arg2) {
        this.field3012.method1149(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field3013.method3563(); var4 != null; var4 = (class187) this.field3013.method3565()) {
            if (!this.field3010.method3396(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3033) {
                        this.method3472(var4, arg0, var5, var6, var5 + var6);
                        var4.field3033 -= var6;
                        break;
                    }
                    this.method3472(var4, arg0, var5, var4.field3033, var5 + var6);
                    var5 += var4.field3033;
                    var6 -= var4.field3033;
                } while (!this.field3010.method3414(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gl.h(I)V")
    public void method1122(int arg0) {
        this.field3012.method1122(arg0);
        for (class187 var2 = (class187) this.field3013.method3563(); var2 != null; var2 = (class187) this.field3013.method3565()) {
            if (!this.field3010.method3396(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3033) {
                        this.method3473(var2, var3);
                        var2.field3033 -= var3;
                        break;
                    }
                    this.method3473(var2, var2.field3033);
                    var3 -= var2.field3033;
                } while (!this.field3010.method3414(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gl.v(Lgb;[IIIII)V")
    public void method3472(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3010.field2981[arg0.field3021] & 0x4) != 0 && arg0.field3025 < 0) {
            int var6 = this.field3010.field2986[arg0.field3021] / Statics.field1170;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3034) / var6;
                if (var7 > arg3) {
                    arg0.field3034 += arg3 * var6;
                    break;
                }
                arg0.field3026.method1149(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3034 += var6 * var7 - 1048576;
                int var8 = Statics.field1170 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3026;
                if (this.field3010.field2984[arg0.field3021] == 0) {
                    arg0.field3026 = class65.method1289(arg0.field3016, var10.method1346(), var10.method1347(), var10.method1281());
                } else {
                    arg0.field3026 = class65.method1289(arg0.field3016, var10.method1346(), 0, var10.method1281());
                    this.field3010.method3377(arg0, arg0.field3015.field2932[arg0.field3014] < 0);
                    arg0.field3026.method1288(var8, var10.method1347());
                }
                if (arg0.field3015.field2932[arg0.field3014] < 0) {
                    arg0.field3026.method1368(-1);
                }
                var10.method1287(var8);
                var10.method1149(arg1, arg2, arg4 - arg2);
                if (var10.method1291()) {
                    this.field3012.method1112(var10);
                }
            }
        }
        arg0.field3026.method1149(arg1, arg2, arg3);
    }

    @ObfuscatedName("gl.f(Lgb;IB)V")
    public void method3473(class187 arg0, int arg1) {
        if ((this.field3010.field2981[arg0.field3021] & 0x4) != 0 && arg0.field3025 < 0) {
            int var3 = this.field3010.field2986[arg0.field3021] / Statics.field1170;
            int var4 = (var3 + 1048575 - arg0.field3034) / var3;
            arg0.field3034 = arg0.field3034 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3010.field2984[arg0.field3021] == 0) {
                    arg0.field3026 = class65.method1289(arg0.field3016, arg0.field3026.method1346(), arg0.field3026.method1347(), arg0.field3026.method1281());
                } else {
                    arg0.field3026 = class65.method1289(arg0.field3016, arg0.field3026.method1346(), 0, arg0.field3026.method1281());
                    this.field3010.method3377(arg0, arg0.field3015.field2932[arg0.field3014] < 0);
                }
                if (arg0.field3015.field2932[arg0.field3014] < 0) {
                    arg0.field3026.method1368(-1);
                }
                arg1 = arg0.field3034 / var3;
            }
        }
        arg0.field3026.method1122(arg1);
    }
}
