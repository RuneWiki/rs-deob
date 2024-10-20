package deob;

@ObfuscatedName("gr")
public class class186 extends class67 {

    @ObfuscatedName("gr.j")
    public class184 field2989;

    @ObfuscatedName("gr.m")
    public class199 field2987 = new class199();

    @ObfuscatedName("gr.f")
    public class56 field2988 = new class56();

    public class186(class184 arg0) {
        this.field2989 = arg0;
    }

    @ObfuscatedName("gr.a()Lbp;")
    public class67 method1147() {
        class187 var1 = (class187) this.field2987.method3606();
        if (var1 == null) {
            return null;
        } else if (var1.field3010 == null) {
            return this.method1148();
        } else {
            return var1.field3010;
        }
    }

    @ObfuscatedName("gr.h()Lbp;")
    public class67 method1148() {
        class187 var1;
        do {
            var1 = (class187) this.field2987.method3608();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3010 == null);
        return var1.field3010;
    }

    @ObfuscatedName("gr.i()I")
    public int method1149() {
        return 0;
    }

    @ObfuscatedName("gr.t([III)V")
    public void method1150(int[] arg0, int arg1, int arg2) {
        this.field2988.method1150(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2987.method3606(); var4 != null; var4 = (class187) this.field2987.method3608()) {
            if (!this.field2989.method3445(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3000) {
                        this.method3521(var4, arg0, var5, var6, var5 + var6);
                        var4.field3000 -= var6;
                        break;
                    }
                    this.method3521(var4, arg0, var5, var4.field3000, var5 + var6);
                    var5 += var4.field3000;
                    var6 -= var4.field3000;
                } while (!this.field2989.method3507(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gr.s(I)V")
    public void method1142(int arg0) {
        this.field2988.method1142(arg0);
        for (class187 var2 = (class187) this.field2987.method3606(); var2 != null; var2 = (class187) this.field2987.method3608()) {
            if (!this.field2989.method3445(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3000) {
                        this.method3520(var2, var3);
                        var2.field3000 -= var3;
                        break;
                    }
                    this.method3520(var2, var2.field3000);
                    var3 -= var2.field3000;
                } while (!this.field2989.method3507(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gr.j(Lgb;[IIIIB)V")
    public void method3521(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2989.field2960[arg0.field3007] & 0x4) != 0 && arg0.field3006 < 0) {
            int var6 = this.field2989.field2965[arg0.field3007] / Statics.field1184;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3012) / var6;
                if (var7 > arg3) {
                    arg0.field3012 += arg3 * var6;
                    break;
                }
                arg0.field3010.method1150(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3012 += var6 * var7 - 1048576;
                int var8 = Statics.field1184 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3010;
                if (this.field2989.field2947[arg0.field3007] == 0) {
                    arg0.field3010 = class65.method1352(arg0.field2999, var10.method1404(), var10.method1294(), var10.method1295());
                } else {
                    arg0.field3010 = class65.method1352(arg0.field2999, var10.method1404(), 0, var10.method1295());
                    this.field2989.method3485(arg0, arg0.field2993.field2915[arg0.field2997] < 0);
                    arg0.field3010.method1299(var8, var10.method1294());
                }
                if (arg0.field2993.field2915[arg0.field2997] < 0) {
                    arg0.field3010.method1290(-1);
                }
                var10.method1333(var8);
                var10.method1150(arg1, arg2, arg4 - arg2);
                if (var10.method1305()) {
                    this.field2988.method1166(var10);
                }
            }
        }
        arg0.field3010.method1150(arg1, arg2, arg3);
    }

    @ObfuscatedName("gr.m(Lgb;IB)V")
    public void method3520(class187 arg0, int arg1) {
        if ((this.field2989.field2960[arg0.field3007] & 0x4) != 0 && arg0.field3006 < 0) {
            int var3 = this.field2989.field2965[arg0.field3007] / Statics.field1184;
            int var4 = (var3 + 1048575 - arg0.field3012) / var3;
            arg0.field3012 = arg0.field3012 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2989.field2947[arg0.field3007] == 0) {
                    arg0.field3010 = class65.method1352(arg0.field2999, arg0.field3010.method1404(), arg0.field3010.method1294(), arg0.field3010.method1295());
                } else {
                    arg0.field3010 = class65.method1352(arg0.field2999, arg0.field3010.method1404(), 0, arg0.field3010.method1295());
                    this.field2989.method3485(arg0, arg0.field2993.field2915[arg0.field2997] < 0);
                }
                if (arg0.field2993.field2915[arg0.field2997] < 0) {
                    arg0.field3010.method1290(-1);
                }
                arg1 = arg0.field3012 / var3;
            }
        }
        arg0.field3010.method1142(arg1);
    }
}
