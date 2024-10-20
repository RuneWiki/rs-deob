package deob;

@ObfuscatedName("gb")
public class class190 extends class70 {

    @ObfuscatedName("gb.m")
    public class188 field3051;

    @ObfuscatedName("gb.e")
    public class203 field3052 = new class203();

    @ObfuscatedName("gb.o")
    public class59 field3053 = new class59();

    public class190(class188 arg0) {
        this.field3051 = arg0;
    }

    @ObfuscatedName("gb.l()Lbp;")
    public class70 method1175() {
        class191 var1 = (class191) this.field3052.method3621();
        if (var1 == null) {
            return null;
        } else if (var1.field3058 == null) {
            return this.method1176();
        } else {
            return var1.field3058;
        }
    }

    @ObfuscatedName("gb.j()Lbp;")
    public class70 method1176() {
        class191 var1;
        do {
            var1 = (class191) this.field3052.method3630();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3058 == null);
        return var1.field3058;
    }

    @ObfuscatedName("gb.r()I")
    public int method1177() {
        return 0;
    }

    @ObfuscatedName("gb.x([III)V")
    public void method1169(int[] arg0, int arg1, int arg2) {
        this.field3053.method1169(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3052.method3621(); var4 != null; var4 = (class191) this.field3052.method3630()) {
            if (!this.field3051.method3460(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3064) {
                        this.method3533(var4, arg0, var5, var6, var5 + var6);
                        var4.field3064 -= var6;
                        break;
                    }
                    this.method3533(var4, arg0, var5, var4.field3064, var5 + var6);
                    var5 += var4.field3064;
                    var6 -= var4.field3064;
                } while (!this.field3051.method3461(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gb.v(I)V")
    public void method1180(int arg0) {
        this.field3053.method1180(arg0);
        for (class191 var2 = (class191) this.field3052.method3621(); var2 != null; var2 = (class191) this.field3052.method3630()) {
            if (!this.field3051.method3460(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3064) {
                        this.method3534(var2, var3);
                        var2.field3064 -= var3;
                        break;
                    }
                    this.method3534(var2, var2.field3064);
                    var3 -= var2.field3064;
                } while (!this.field3051.method3461(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gb.m(Lgo;[IIIII)V")
    public void method3533(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3051.field3019[arg0.field3062] & 0x4) != 0 && arg0.field3071 < 0) {
            int var6 = this.field3051.field3035[arg0.field3062] / Statics.field1269;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3076) / var6;
                if (var7 > arg3) {
                    arg0.field3076 += arg3 * var6;
                    break;
                }
                arg0.field3058.method1169(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3076 += var6 * var7 - 1048576;
                int var8 = Statics.field1269 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3058;
                if (this.field3051.field3029[arg0.field3062] == 0) {
                    arg0.field3058 = class68.method1356(arg0.field3060, var10.method1371(), var10.method1362(), var10.method1382());
                } else {
                    arg0.field3058 = class68.method1356(arg0.field3060, var10.method1371(), 0, var10.method1382());
                    this.field3051.method3442(arg0, arg0.field3057.field2987[arg0.field3068] < 0);
                    arg0.field3058.method1367(var8, var10.method1362());
                }
                if (arg0.field3057.field2987[arg0.field3068] < 0) {
                    arg0.field3058.method1358(-1);
                }
                var10.method1369(var8);
                var10.method1169(arg1, arg2, arg4 - arg2);
                if (var10.method1373()) {
                    this.field3053.method1170(var10);
                }
            }
        }
        arg0.field3058.method1169(arg1, arg2, arg3);
    }

    @ObfuscatedName("gb.w(Lgo;II)V")
    public void method3534(class191 arg0, int arg1) {
        if ((this.field3051.field3019[arg0.field3062] & 0x4) != 0 && arg0.field3071 < 0) {
            int var3 = this.field3051.field3035[arg0.field3062] / Statics.field1269;
            int var4 = (var3 + 1048575 - arg0.field3076) / var3;
            arg0.field3076 = arg0.field3076 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3051.field3029[arg0.field3062] == 0) {
                    arg0.field3058 = class68.method1356(arg0.field3060, arg0.field3058.method1371(), arg0.field3058.method1362(), arg0.field3058.method1382());
                } else {
                    arg0.field3058 = class68.method1356(arg0.field3060, arg0.field3058.method1371(), 0, arg0.field3058.method1382());
                    this.field3051.method3442(arg0, arg0.field3057.field2987[arg0.field3068] < 0);
                }
                if (arg0.field3057.field2987[arg0.field3068] < 0) {
                    arg0.field3058.method1358(-1);
                }
                arg1 = arg0.field3076 / var3;
            }
        }
        arg0.field3058.method1180(arg1);
    }
}
