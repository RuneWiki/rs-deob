package deob;

@ObfuscatedName("ga")
public class class190 extends class70 {

    @ObfuscatedName("ga.e")
    public class188 field3045;

    @ObfuscatedName("ga.l")
    public class203 field3044 = new class203();

    @ObfuscatedName("ga.c")
    public class59 field3048 = new class59();

    public class190(class188 arg0) {
        this.field3045 = arg0;
    }

    @ObfuscatedName("ga.a()Lbj;")
    public class70 method1211() {
        class191 var1 = (class191) this.field3044.method3654();
        if (var1 == null) {
            return null;
        } else if (var1.field3062 == null) {
            return this.method1225();
        } else {
            return var1.field3062;
        }
    }

    @ObfuscatedName("ga.b()Lbj;")
    public class70 method1225() {
        class191 var1;
        do {
            var1 = (class191) this.field3044.method3673();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3062 == null);
        return var1.field3062;
    }

    @ObfuscatedName("ga.u()I")
    public int method1213() {
        return 0;
    }

    @ObfuscatedName("ga.o([III)V")
    public void method1214(int[] arg0, int arg1, int arg2) {
        this.field3048.method1214(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3044.method3654(); var4 != null; var4 = (class191) this.field3044.method3673()) {
            if (!this.field3045.method3499(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3069) {
                        this.method3571(var4, arg0, var5, var6, var5 + var6);
                        var4.field3069 -= var6;
                        break;
                    }
                    this.method3571(var4, arg0, var5, var4.field3069, var5 + var6);
                    var5 += var4.field3069;
                    var6 -= var4.field3069;
                } while (!this.field3045.method3551(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ga.i(I)V")
    public void method1217(int arg0) {
        this.field3048.method1217(arg0);
        for (class191 var2 = (class191) this.field3044.method3654(); var2 != null; var2 = (class191) this.field3044.method3673()) {
            if (!this.field3045.method3499(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3069) {
                        this.method3572(var2, var3);
                        var2.field3069 -= var3;
                        break;
                    }
                    this.method3572(var2, var2.field3069);
                    var3 -= var2.field3069;
                } while (!this.field3045.method3551(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ga.e(Lgi;[IIIII)V")
    public void method3571(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3045.field3017[arg0.field3068] & 0x4) != 0 && arg0.field3064 < 0) {
            int var6 = this.field3045.field3022[arg0.field3068] / Statics.field1261;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3070) / var6;
                if (var7 > arg3) {
                    arg0.field3070 += arg3 * var6;
                    break;
                }
                arg0.field3062.method1214(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3070 += var6 * var7 - 1048576;
                int var8 = Statics.field1261 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3062;
                if (this.field3045.field3019[arg0.field3068] == 0) {
                    arg0.field3062 = class68.method1376(arg0.field3051, var10.method1388(), var10.method1404(), var10.method1414());
                } else {
                    arg0.field3062 = class68.method1376(arg0.field3051, var10.method1388(), 0, var10.method1414());
                    this.field3045.method3478(arg0, arg0.field3063.field2971[arg0.field3055] < 0);
                    arg0.field3062.method1384(var8, var10.method1404());
                }
                if (arg0.field3063.field2971[arg0.field3055] < 0) {
                    arg0.field3062.method1377(-1);
                }
                var10.method1392(var8);
                var10.method1214(arg1, arg2, arg4 - arg2);
                if (var10.method1390()) {
                    this.field3048.method1209(var10);
                }
            }
        }
        arg0.field3062.method1214(arg1, arg2, arg3);
    }

    @ObfuscatedName("ga.l(Lgi;IB)V")
    public void method3572(class191 arg0, int arg1) {
        if ((this.field3045.field3017[arg0.field3068] & 0x4) != 0 && arg0.field3064 < 0) {
            int var3 = this.field3045.field3022[arg0.field3068] / Statics.field1261;
            int var4 = (var3 + 1048575 - arg0.field3070) / var3;
            arg0.field3070 = arg0.field3070 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3045.field3019[arg0.field3068] == 0) {
                    arg0.field3062 = class68.method1376(arg0.field3051, arg0.field3062.method1388(), arg0.field3062.method1404(), arg0.field3062.method1414());
                } else {
                    arg0.field3062 = class68.method1376(arg0.field3051, arg0.field3062.method1388(), 0, arg0.field3062.method1414());
                    this.field3045.method3478(arg0, arg0.field3063.field2971[arg0.field3055] < 0);
                }
                if (arg0.field3063.field2971[arg0.field3055] < 0) {
                    arg0.field3062.method1377(-1);
                }
                arg1 = arg0.field3070 / var3;
            }
        }
        arg0.field3062.method1217(arg1);
    }
}
