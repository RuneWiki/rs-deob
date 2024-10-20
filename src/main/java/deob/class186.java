package deob;

@ObfuscatedName("gi")
public class class186 extends class67 {

    @ObfuscatedName("gi.n")
    public class184 field2991;

    @ObfuscatedName("gi.d")
    public class199 field2985 = new class199();

    @ObfuscatedName("gi.s")
    public class56 field2987 = new class56();

    public class186(class184 arg0) {
        this.field2991 = arg0;
    }

    @ObfuscatedName("gi.k()Lbj;")
    public class67 method1104() {
        class187 var1 = (class187) this.field2985.method3574();
        if (var1 == null) {
            return null;
        } else if (var1.field3003 == null) {
            return this.method1121();
        } else {
            return var1.field3003;
        }
    }

    @ObfuscatedName("gi.i()Lbj;")
    public class67 method1121() {
        class187 var1;
        do {
            var1 = (class187) this.field2985.method3568();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3003 == null);
        return var1.field3003;
    }

    @ObfuscatedName("gi.m()I")
    public int method1106() {
        return 0;
    }

    @ObfuscatedName("gi.p([III)V")
    public void method1107(int[] arg0, int arg1, int arg2) {
        this.field2987.method1107(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2985.method3574(); var4 != null; var4 = (class187) this.field2985.method3568()) {
            if (!this.field2991.method3382(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3011) {
                        this.method3461(var4, arg0, var5, var6, var5 + var6);
                        var4.field3011 -= var6;
                        break;
                    }
                    this.method3461(var4, arg0, var5, var4.field3011, var5 + var6);
                    var5 += var4.field3011;
                    var6 -= var4.field3011;
                } while (!this.field2991.method3383(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gi.e(I)V")
    public void method1109(int arg0) {
        this.field2987.method1109(arg0);
        for (class187 var2 = (class187) this.field2985.method3574(); var2 != null; var2 = (class187) this.field2985.method3568()) {
            if (!this.field2991.method3382(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3011) {
                        this.method3462(var2, var3);
                        var2.field3011 -= var3;
                        break;
                    }
                    this.method3462(var2, var2.field3011);
                    var3 -= var2.field3011;
                } while (!this.field2991.method3383(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gi.n(Lgq;[IIIII)V")
    public void method3461(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2991.field2959[arg0.field3010] & 0x4) != 0 && arg0.field2996 < 0) {
            int var6 = this.field2991.field2948[arg0.field3010] / Statics.field1173;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3012) / var6;
                if (var7 > arg3) {
                    arg0.field3012 += arg3 * var6;
                    break;
                }
                arg0.field3003.method1107(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3012 += var6 * var7 - 1048576;
                int var8 = Statics.field1173 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3003;
                if (this.field2991.field2962[arg0.field3010] == 0) {
                    arg0.field3003 = class65.method1353(arg0.field2994, var10.method1257(), var10.method1248(), var10.method1281());
                } else {
                    arg0.field3003 = class65.method1353(arg0.field2994, var10.method1257(), 0, var10.method1281());
                    this.field2991.method3365(arg0, arg0.field2993.field2915[arg0.field2997] < 0);
                    arg0.field3003.method1253(var8, var10.method1248());
                }
                if (arg0.field2993.field2915[arg0.field2997] < 0) {
                    arg0.field3003.method1244(-1);
                }
                var10.method1255(var8);
                var10.method1107(arg1, arg2, arg4 - arg2);
                if (var10.method1259()) {
                    this.field2987.method1099(var10);
                }
            }
        }
        arg0.field3003.method1107(arg1, arg2, arg3);
    }

    @ObfuscatedName("gi.d(Lgq;IB)V")
    public void method3462(class187 arg0, int arg1) {
        if ((this.field2991.field2959[arg0.field3010] & 0x4) != 0 && arg0.field2996 < 0) {
            int var3 = this.field2991.field2948[arg0.field3010] / Statics.field1173;
            int var4 = (var3 + 1048575 - arg0.field3012) / var3;
            arg0.field3012 = arg0.field3012 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2991.field2962[arg0.field3010] == 0) {
                    arg0.field3003 = class65.method1353(arg0.field2994, arg0.field3003.method1257(), arg0.field3003.method1248(), arg0.field3003.method1281());
                } else {
                    arg0.field3003 = class65.method1353(arg0.field2994, arg0.field3003.method1257(), 0, arg0.field3003.method1281());
                    this.field2991.method3365(arg0, arg0.field2993.field2915[arg0.field2997] < 0);
                }
                if (arg0.field2993.field2915[arg0.field2997] < 0) {
                    arg0.field3003.method1244(-1);
                }
                arg1 = arg0.field3012 / var3;
            }
        }
        arg0.field3003.method1109(arg1);
    }
}
