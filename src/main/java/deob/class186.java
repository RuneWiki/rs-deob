package deob;

@ObfuscatedName("gf")
public class class186 extends class67 {

    @ObfuscatedName("gf.d")
    public class184 field2991;

    @ObfuscatedName("gf.p")
    public class199 field2989 = new class199();

    @ObfuscatedName("gf.v")
    public class56 field2990 = new class56();

    public class186(class184 arg0) {
        this.field2991 = arg0;
    }

    @ObfuscatedName("gf.w()Lbz;")
    public class67 method1120() {
        class187 var1 = (class187) this.field2989.method3613();
        if (var1 == null) {
            return null;
        } else if (var1.field3012 == null) {
            return this.method1121();
        } else {
            return var1.field3012;
        }
    }

    @ObfuscatedName("gf.u()Lbz;")
    public class67 method1121() {
        class187 var1;
        do {
            var1 = (class187) this.field2989.method3615();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3012 == null);
        return var1.field3012;
    }

    @ObfuscatedName("gf.a()I")
    public int method1122() {
        return 0;
    }

    @ObfuscatedName("gf.e([III)V")
    public void method1123(int[] arg0, int arg1, int arg2) {
        this.field2990.method1123(arg0, arg1, arg2);
        for (class187 var4 = (class187) this.field2989.method3613(); var4 != null; var4 = (class187) this.field2989.method3615()) {
            if (!this.field2991.method3466(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3013) {
                        this.method3537(var4, arg0, var5, var6, var5 + var6);
                        var4.field3013 -= var6;
                        break;
                    }
                    this.method3537(var4, arg0, var5, var4.field3013, var5 + var6);
                    var5 += var4.field3013;
                    var6 -= var4.field3013;
                } while (!this.field2991.method3464(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gf.o(I)V")
    public void method1125(int arg0) {
        this.field2990.method1125(arg0);
        for (class187 var2 = (class187) this.field2989.method3613(); var2 != null; var2 = (class187) this.field2989.method3615()) {
            if (!this.field2991.method3466(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3013) {
                        this.method3536(var2, var3);
                        var2.field3013 -= var3;
                        break;
                    }
                    this.method3536(var2, var2.field3013);
                    var3 -= var2.field3013;
                } while (!this.field2991.method3464(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gf.d(Lgk;[IIIIB)V")
    public void method3537(class187 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2991.field2964[arg0.field2997] & 0x4) != 0 && arg0.field2994 < 0) {
            int var6 = this.field2991.field2969[arg0.field2997] / Statics.field1177;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3006) / var6;
                if (var7 > arg3) {
                    arg0.field3006 += arg3 * var6;
                    break;
                }
                arg0.field3012.method1123(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3006 += var6 * var7 - 1048576;
                int var8 = Statics.field1177 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class65 var10 = arg0.field3012;
                if (this.field2991.field2960[arg0.field2997] == 0) {
                    arg0.field3012 = class65.method1255(arg0.field2996, var10.method1276(), var10.method1301(), var10.method1264());
                } else {
                    arg0.field3012 = class65.method1255(arg0.field2996, var10.method1276(), 0, var10.method1264());
                    this.field2991.method3452(arg0, arg0.field3005.field2919[arg0.field3009] < 0);
                    arg0.field3012.method1268(var8, var10.method1301());
                }
                if (arg0.field3005.field2919[arg0.field3009] < 0) {
                    arg0.field3012.method1259(-1);
                }
                var10.method1270(var8);
                var10.method1123(arg1, arg2, arg4 - arg2);
                if (var10.method1274()) {
                    this.field2990.method1115(var10);
                }
            }
        }
        arg0.field3012.method1123(arg1, arg2, arg3);
    }

    @ObfuscatedName("gf.p(Lgk;II)V")
    public void method3536(class187 arg0, int arg1) {
        if ((this.field2991.field2964[arg0.field2997] & 0x4) != 0 && arg0.field2994 < 0) {
            int var3 = this.field2991.field2969[arg0.field2997] / Statics.field1177;
            int var4 = (var3 + 1048575 - arg0.field3006) / var3;
            arg0.field3006 = arg0.field3006 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2991.field2960[arg0.field2997] == 0) {
                    arg0.field3012 = class65.method1255(arg0.field2996, arg0.field3012.method1276(), arg0.field3012.method1301(), arg0.field3012.method1264());
                } else {
                    arg0.field3012 = class65.method1255(arg0.field2996, arg0.field3012.method1276(), 0, arg0.field3012.method1264());
                    this.field2991.method3452(arg0, arg0.field3005.field2919[arg0.field3009] < 0);
                }
                if (arg0.field3005.field2919[arg0.field3009] < 0) {
                    arg0.field3012.method1259(-1);
                }
                arg1 = arg0.field3006 / var3;
            }
        }
        arg0.field3012.method1125(arg1);
    }
}
