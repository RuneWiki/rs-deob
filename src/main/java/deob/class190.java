package deob;

@ObfuscatedName("gb")
public class class190 extends class70 {

    @ObfuscatedName("gb.l")
    public class188 field3059;

    @ObfuscatedName("gb.g")
    public class203 field3058 = new class203();

    @ObfuscatedName("gb.r")
    public class59 field3062 = new class59();

    public class190(class188 arg0) {
        this.field3059 = arg0;
    }

    @ObfuscatedName("gb.s()Lbh;")
    public class70 method1231() {
        class191 var1 = (class191) this.field3058.method3728();
        if (var1 == null) {
            return null;
        } else if (var1.field3075 == null) {
            return this.method1232();
        } else {
            return var1.field3075;
        }
    }

    @ObfuscatedName("gb.k()Lbh;")
    public class70 method1232() {
        class191 var1;
        do {
            var1 = (class191) this.field3058.method3718();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3075 == null);
        return var1.field3075;
    }

    @ObfuscatedName("gb.u()I")
    public int method1255() {
        return 0;
    }

    @ObfuscatedName("gb.n([III)V")
    public void method1234(int[] arg0, int arg1, int arg2) {
        this.field3062.method1234(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3058.method3728(); var4 != null; var4 = (class191) this.field3058.method3718()) {
            if (!this.field3059.method3567(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3074) {
                        this.method3641(var4, arg0, var5, var6, var5 + var6);
                        var4.field3074 -= var6;
                        break;
                    }
                    this.method3641(var4, arg0, var5, var4.field3074, var5 + var6);
                    var5 += var4.field3074;
                    var6 -= var4.field3074;
                } while (!this.field3059.method3568(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gb.m(I)V")
    public void method1236(int arg0) {
        this.field3062.method1236(arg0);
        for (class191 var2 = (class191) this.field3058.method3728(); var2 != null; var2 = (class191) this.field3058.method3718()) {
            if (!this.field3059.method3567(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3074) {
                        this.method3639(var2, var3);
                        var2.field3074 -= var3;
                        break;
                    }
                    this.method3639(var2, var2.field3074);
                    var3 -= var2.field3074;
                } while (!this.field3059.method3568(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gb.l(Lgr;[IIIIB)V")
    public void method3641(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3059.field3027[arg0.field3079] & 0x4) != 0 && arg0.field3084 < 0) {
            int var6 = this.field3059.field3015[arg0.field3079] / Statics.field1255;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3083) / var6;
                if (var7 > arg3) {
                    arg0.field3083 += arg3 * var6;
                    break;
                }
                arg0.field3075.method1234(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3083 += var6 * var7 - 1048576;
                int var8 = Statics.field1255 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3075;
                if (this.field3059.field3030[arg0.field3079] == 0) {
                    arg0.field3075 = class68.method1402(arg0.field3068, var10.method1520(), var10.method1408(), var10.method1409());
                } else {
                    arg0.field3075 = class68.method1402(arg0.field3068, var10.method1520(), 0, var10.method1409());
                    this.field3059.method3551(arg0, arg0.field3064.field2988[arg0.field3082] < 0);
                    arg0.field3075.method1412(var8, var10.method1408());
                }
                if (arg0.field3064.field2988[arg0.field3082] < 0) {
                    arg0.field3075.method1404(-1);
                }
                var10.method1405(var8);
                var10.method1234(arg1, arg2, arg4 - arg2);
                if (var10.method1418()) {
                    this.field3062.method1226(var10);
                }
            }
        }
        arg0.field3075.method1234(arg1, arg2, arg3);
    }

    @ObfuscatedName("gb.g(Lgr;II)V")
    public void method3639(class191 arg0, int arg1) {
        if ((this.field3059.field3027[arg0.field3079] & 0x4) != 0 && arg0.field3084 < 0) {
            int var3 = this.field3059.field3015[arg0.field3079] / Statics.field1255;
            int var4 = (var3 + 1048575 - arg0.field3083) / var3;
            arg0.field3083 = arg0.field3083 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3059.field3030[arg0.field3079] == 0) {
                    arg0.field3075 = class68.method1402(arg0.field3068, arg0.field3075.method1520(), arg0.field3075.method1408(), arg0.field3075.method1409());
                } else {
                    arg0.field3075 = class68.method1402(arg0.field3068, arg0.field3075.method1520(), 0, arg0.field3075.method1409());
                    this.field3059.method3551(arg0, arg0.field3064.field2988[arg0.field3082] < 0);
                }
                if (arg0.field3064.field2988[arg0.field3082] < 0) {
                    arg0.field3075.method1404(-1);
                }
                arg1 = arg0.field3083 / var3;
            }
        }
        arg0.field3075.method1236(arg1);
    }
}
