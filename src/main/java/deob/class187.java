package deob;

@ObfuscatedName("gn")
public class class187 extends class67 {

    @ObfuscatedName("gn.b")
    public class185 field3002;

    @ObfuscatedName("gn.g")
    public class200 field3003 = new class200();

    @ObfuscatedName("gn.j")
    public class56 field3004 = new class56();

    public class187(class185 arg0) {
        this.field3002 = arg0;
    }

    @ObfuscatedName("gn.y()Lbn;")
    public class67 method1117() {
        class188 var1 = (class188) this.field3003.method3575();
        if (var1 == null) {
            return null;
        } else if (var1.field3008 == null) {
            return this.method1118();
        } else {
            return var1.field3008;
        }
    }

    @ObfuscatedName("gn.r()Lbn;")
    public class67 method1118() {
        class188 var1;
        do {
            var1 = (class188) this.field3003.method3565();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3008 == null);
        return var1.field3008;
    }

    @ObfuscatedName("gn.c()I")
    public int method1115() {
        return 0;
    }

    @ObfuscatedName("gn.l([III)V")
    public void method1120(int[] arg0, int arg1, int arg2) {
        this.field3004.method1120(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3003.method3575(); var4 != null; var4 = (class188) this.field3003.method3565()) {
            if (!this.field3002.method3403(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3027) {
                        this.method3470(var4, arg0, var5, var6, var5 + var6);
                        var4.field3027 -= var6;
                        break;
                    }
                    this.method3470(var4, arg0, var5, var4.field3027, var5 + var6);
                    var5 += var4.field3027;
                    var6 -= var4.field3027;
                } while (!this.field3002.method3400(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gn.p(I)V")
    public void method1122(int arg0) {
        this.field3004.method1122(arg0);
        for (class188 var2 = (class188) this.field3003.method3575(); var2 != null; var2 = (class188) this.field3003.method3565()) {
            if (!this.field3002.method3403(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3027) {
                        this.method3471(var2, var3);
                        var2.field3027 -= var3;
                        break;
                    }
                    this.method3471(var2, var2.field3027);
                    var3 -= var2.field3027;
                } while (!this.field3002.method3400(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gn.b(Lge;[IIIIS)V")
    public void method3470(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3002.field2976[arg0.field3015] & 0x4) != 0 && arg0.field3022 < 0) {
            int var6 = this.field3002.field2969[arg0.field3015] / Statics.field1154;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3028) / var6;
                if (var7 > arg3) {
                    arg0.field3028 += arg3 * var6;
                    break;
                }
                arg0.field3008.method1120(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3028 += var6 * var7 - 1048576;
                int var8 = Statics.field1154 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3008;
                if (this.field3002.field2983[arg0.field3015] == 0) {
                    arg0.field3008 = class65.method1263(arg0.field3018, var10.method1357(), var10.method1269(), var10.method1270());
                } else {
                    arg0.field3008 = class65.method1263(arg0.field3018, var10.method1357(), 0, var10.method1270());
                    this.field3002.method3465(arg0, arg0.field3009.field2928[arg0.field3013] < 0);
                    arg0.field3008.method1274(var8, var10.method1269());
                }
                if (arg0.field3009.field2928[arg0.field3013] < 0) {
                    arg0.field3008.method1265(-1);
                }
                var10.method1303(var8);
                var10.method1120(arg1, arg2, arg4 - arg2);
                if (var10.method1277()) {
                    this.field3004.method1148(var10);
                }
            }
        }
        arg0.field3008.method1120(arg1, arg2, arg3);
    }

    @ObfuscatedName("gn.g(Lge;II)V")
    public void method3471(class188 arg0, int arg1) {
        if ((this.field3002.field2976[arg0.field3015] & 0x4) != 0 && arg0.field3022 < 0) {
            int var3 = this.field3002.field2969[arg0.field3015] / Statics.field1154;
            int var4 = (var3 + 1048575 - arg0.field3028) / var3;
            arg0.field3028 = arg0.field3028 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3002.field2983[arg0.field3015] == 0) {
                    arg0.field3008 = class65.method1263(arg0.field3018, arg0.field3008.method1357(), arg0.field3008.method1269(), arg0.field3008.method1270());
                } else {
                    arg0.field3008 = class65.method1263(arg0.field3018, arg0.field3008.method1357(), 0, arg0.field3008.method1270());
                    this.field3002.method3465(arg0, arg0.field3009.field2928[arg0.field3013] < 0);
                }
                if (arg0.field3009.field2928[arg0.field3013] < 0) {
                    arg0.field3008.method1265(-1);
                }
                arg1 = arg0.field3028 / var3;
            }
        }
        arg0.field3008.method1122(arg1);
    }
}
