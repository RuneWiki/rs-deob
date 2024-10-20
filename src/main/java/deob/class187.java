package deob;

@ObfuscatedName("gr")
public class class187 extends class67 {

    @ObfuscatedName("gr.f")
    public class185 field3003;

    @ObfuscatedName("gr.u")
    public class200 field3006 = new class200();

    @ObfuscatedName("gr.x")
    public class56 field3002 = new class56();

    public class187(class185 arg0) {
        this.field3003 = arg0;
    }

    @ObfuscatedName("gr.d()Lbt;")
    public class67 method1177() {
        class188 var1 = (class188) this.field3006.method3585();
        if (var1 == null) {
            return null;
        } else if (var1.field3026 == null) {
            return this.method1178();
        } else {
            return var1.field3026;
        }
    }

    @ObfuscatedName("gr.n()Lbt;")
    public class67 method1178() {
        class188 var1;
        do {
            var1 = (class188) this.field3006.method3590();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3026 == null);
        return var1.field3026;
    }

    @ObfuscatedName("gr.m()I")
    public int method1189() {
        return 0;
    }

    @ObfuscatedName("gr.g([III)V")
    public void method1185(int[] arg0, int arg1, int arg2) {
        this.field3002.method1185(arg0, arg1, arg2);
        for (class188 var4 = (class188) this.field3006.method3585(); var4 != null; var4 = (class188) this.field3006.method3590()) {
            if (!this.field3003.method3457(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3027) {
                        this.method3501(var4, arg0, var5, var6, var5 + var6);
                        var4.field3027 -= var6;
                        break;
                    }
                    this.method3501(var4, arg0, var5, var4.field3027, var5 + var6);
                    var5 += var4.field3027;
                    var6 -= var4.field3027;
                } while (!this.field3003.method3434(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gr.r(I)V")
    public void method1181(int arg0) {
        this.field3002.method1181(arg0);
        for (class188 var2 = (class188) this.field3006.method3585(); var2 != null; var2 = (class188) this.field3006.method3590()) {
            if (!this.field3003.method3457(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3027) {
                        this.method3503(var2, var3);
                        var2.field3027 -= var3;
                        break;
                    }
                    this.method3503(var2, var2.field3027);
                    var3 -= var2.field3027;
                } while (!this.field3003.method3434(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gr.f(Lgw;[IIIII)V")
    public void method3501(class188 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3003.field2975[arg0.field3019] & 0x4) != 0 && arg0.field3022 < 0) {
            int var6 = this.field3003.field2979[arg0.field3019] / Statics.field1197;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3025) / var6;
                if (var7 > arg3) {
                    arg0.field3025 += arg3 * var6;
                    break;
                }
                arg0.field3026.method1185(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3025 += var6 * var7 - 1048576;
                int var8 = Statics.field1197 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3026;
                if (this.field3003.field2961[arg0.field3019] == 0) {
                    arg0.field3026 = class65.method1311(arg0.field3010, var10.method1346(), var10.method1395(), var10.method1317());
                } else {
                    arg0.field3026 = class65.method1311(arg0.field3010, var10.method1346(), 0, var10.method1317());
                    this.field3003.method3423(arg0, arg0.field3009.field2932[arg0.field3013] < 0);
                    arg0.field3026.method1396(var8, var10.method1395());
                }
                if (arg0.field3009.field2932[arg0.field3013] < 0) {
                    arg0.field3026.method1328(-1);
                }
                var10.method1323(var8);
                var10.method1185(arg1, arg2, arg4 - arg2);
                if (var10.method1437()) {
                    this.field3002.method1202(var10);
                }
            }
        }
        arg0.field3026.method1185(arg1, arg2, arg3);
    }

    @ObfuscatedName("gr.u(Lgw;IB)V")
    public void method3503(class188 arg0, int arg1) {
        if ((this.field3003.field2975[arg0.field3019] & 0x4) != 0 && arg0.field3022 < 0) {
            int var3 = this.field3003.field2979[arg0.field3019] / Statics.field1197;
            int var4 = (var3 + 1048575 - arg0.field3025) / var3;
            arg0.field3025 = arg0.field3025 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3003.field2961[arg0.field3019] == 0) {
                    arg0.field3026 = class65.method1311(arg0.field3010, arg0.field3026.method1346(), arg0.field3026.method1395(), arg0.field3026.method1317());
                } else {
                    arg0.field3026 = class65.method1311(arg0.field3010, arg0.field3026.method1346(), 0, arg0.field3026.method1317());
                    this.field3003.method3423(arg0, arg0.field3009.field2932[arg0.field3013] < 0);
                }
                if (arg0.field3009.field2932[arg0.field3013] < 0) {
                    arg0.field3026.method1328(-1);
                }
                arg1 = arg0.field3025 / var3;
            }
        }
        arg0.field3026.method1181(arg1);
    }
}
