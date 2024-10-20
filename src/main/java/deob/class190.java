package deob;

@ObfuscatedName("go")
public class class190 extends class70 {

    @ObfuscatedName("go.f")
    public class188 field3050;

    @ObfuscatedName("go.e")
    public class203 field3049 = new class203();

    @ObfuscatedName("go.n")
    public class59 field3052 = new class59();

    public class190(class188 arg0) {
        this.field3050 = arg0;
    }

    @ObfuscatedName("go.b()Lbx;")
    public class70 method1156() {
        class191 var1 = (class191) this.field3049.method3646();
        if (var1 == null) {
            return null;
        } else if (var1.field3068 == null) {
            return this.method1157();
        } else {
            return var1.field3068;
        }
    }

    @ObfuscatedName("go.m()Lbx;")
    public class70 method1157() {
        class191 var1;
        do {
            var1 = (class191) this.field3049.method3648();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3068 == null);
        return var1.field3068;
    }

    @ObfuscatedName("go.k()I")
    public int method1158() {
        return 0;
    }

    @ObfuscatedName("go.c([III)V")
    public void method1159(int[] arg0, int arg1, int arg2) {
        this.field3052.method1159(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3049.method3646(); var4 != null; var4 = (class191) this.field3049.method3648()) {
            if (!this.field3050.method3479(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3055) {
                        this.method3551(var4, arg0, var5, var6, var5 + var6);
                        var4.field3055 -= var6;
                        break;
                    }
                    this.method3551(var4, arg0, var5, var4.field3055, var5 + var6);
                    var5 += var4.field3055;
                    var6 -= var4.field3055;
                } while (!this.field3050.method3480(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("go.l(I)V")
    public void method1161(int arg0) {
        this.field3052.method1161(arg0);
        for (class191 var2 = (class191) this.field3049.method3646(); var2 != null; var2 = (class191) this.field3049.method3648()) {
            if (!this.field3050.method3479(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3055) {
                        this.method3550(var2, var3);
                        var2.field3055 -= var3;
                        break;
                    }
                    this.method3550(var2, var2.field3055);
                    var3 -= var2.field3055;
                } while (!this.field3050.method3480(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("go.f(Lgs;[IIIII)V")
    public void method3551(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3050.field3019[arg0.field3074] & 0x4) != 0 && arg0.field3076 < 0) {
            int var6 = this.field3050.field3024[arg0.field3074] / Statics.field1236;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3075) / var6;
                if (var7 > arg3) {
                    arg0.field3075 += arg3 * var6;
                    break;
                }
                arg0.field3068.method1159(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3075 += var6 * var7 - 1048576;
                int var8 = Statics.field1236 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3068;
                if (this.field3050.field3022[arg0.field3074] == 0) {
                    arg0.field3068 = class68.method1336(arg0.field3057, var10.method1351(), var10.method1342(), var10.method1343());
                } else {
                    arg0.field3068 = class68.method1336(arg0.field3057, var10.method1351(), 0, var10.method1343());
                    this.field3050.method3522(arg0, arg0.field3070.field2972[arg0.field3060] < 0);
                    arg0.field3068.method1362(var8, var10.method1342());
                }
                if (arg0.field3070.field2972[arg0.field3060] < 0) {
                    arg0.field3068.method1361(-1);
                }
                var10.method1397(var8);
                var10.method1159(arg1, arg2, arg4 - arg2);
                if (var10.method1353()) {
                    this.field3052.method1164(var10);
                }
            }
        }
        arg0.field3068.method1159(arg1, arg2, arg3);
    }

    @ObfuscatedName("go.e(Lgs;II)V")
    public void method3550(class191 arg0, int arg1) {
        if ((this.field3050.field3019[arg0.field3074] & 0x4) != 0 && arg0.field3076 < 0) {
            int var3 = this.field3050.field3024[arg0.field3074] / Statics.field1236;
            int var4 = (var3 + 1048575 - arg0.field3075) / var3;
            arg0.field3075 = arg0.field3075 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3050.field3022[arg0.field3074] == 0) {
                    arg0.field3068 = class68.method1336(arg0.field3057, arg0.field3068.method1351(), arg0.field3068.method1342(), arg0.field3068.method1343());
                } else {
                    arg0.field3068 = class68.method1336(arg0.field3057, arg0.field3068.method1351(), 0, arg0.field3068.method1343());
                    this.field3050.method3522(arg0, arg0.field3070.field2972[arg0.field3060] < 0);
                }
                if (arg0.field3070.field2972[arg0.field3060] < 0) {
                    arg0.field3068.method1361(-1);
                }
                arg1 = arg0.field3075 / var3;
            }
        }
        arg0.field3068.method1161(arg1);
    }
}
