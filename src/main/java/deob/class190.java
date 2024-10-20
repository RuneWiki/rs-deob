package deob;

@ObfuscatedName("gs")
public class class190 extends class70 {

    @ObfuscatedName("gs.i")
    public class188 field3061;

    @ObfuscatedName("gs.h")
    public class203 field3060 = new class203();

    @ObfuscatedName("gs.e")
    public class59 field3065 = new class59();

    public class190(class188 arg0) {
        this.field3061 = arg0;
    }

    @ObfuscatedName("gs.u()Lbf;")
    public class70 method1148() {
        class191 var1 = (class191) this.field3060.method3597();
        if (var1 == null) {
            return null;
        } else if (var1.field3085 == null) {
            return this.method1149();
        } else {
            return var1.field3085;
        }
    }

    @ObfuscatedName("gs.d()Lbf;")
    public class70 method1149() {
        class191 var1;
        do {
            var1 = (class191) this.field3060.method3599();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3085 == null);
        return var1.field3085;
    }

    @ObfuscatedName("gs.l()I")
    public int method1150() {
        return 0;
    }

    @ObfuscatedName("gs.m([III)V")
    public void method1151(int[] arg0, int arg1, int arg2) {
        this.field3065.method1151(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3060.method3597(); var4 != null; var4 = (class191) this.field3060.method3599()) {
            if (!this.field3061.method3436(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3068) {
                        this.method3511(var4, arg0, var5, var6, var5 + var6);
                        var4.field3068 -= var6;
                        break;
                    }
                    this.method3511(var4, arg0, var5, var4.field3068, var5 + var6);
                    var5 += var4.field3068;
                    var6 -= var4.field3068;
                } while (!this.field3061.method3501(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gs.y(I)V")
    public void method1169(int arg0) {
        this.field3065.method1169(arg0);
        for (class191 var2 = (class191) this.field3060.method3597(); var2 != null; var2 = (class191) this.field3060.method3599()) {
            if (!this.field3061.method3436(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3068) {
                        this.method3518(var2, var3);
                        var2.field3068 -= var3;
                        break;
                    }
                    this.method3518(var2, var2.field3068);
                    var3 -= var2.field3068;
                } while (!this.field3061.method3501(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gs.i(Lgx;[IIIII)V")
    public void method3511(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3061.field3036[arg0.field3078] & 0x4) != 0 && arg0.field3081 < 0) {
            int var6 = this.field3061.field3029[arg0.field3078] / Statics.field1240;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3087) / var6;
                if (var7 > arg3) {
                    arg0.field3087 += arg3 * var6;
                    break;
                }
                arg0.field3085.method1151(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3087 += var6 * var7 - 1048576;
                int var8 = Statics.field1240 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3085;
                if (this.field3061.field3034[arg0.field3078] == 0) {
                    arg0.field3085 = class68.method1313(arg0.field3086, var10.method1328(), var10.method1319(), var10.method1441());
                } else {
                    arg0.field3085 = class68.method1313(arg0.field3086, var10.method1328(), 0, var10.method1441());
                    this.field3061.method3482(arg0, arg0.field3067.field2988[arg0.field3076] < 0);
                    arg0.field3085.method1353(var8, var10.method1319());
                }
                if (arg0.field3067.field2988[arg0.field3076] < 0) {
                    arg0.field3085.method1339(-1);
                }
                var10.method1326(var8);
                var10.method1151(arg1, arg2, arg4 - arg2);
                if (var10.method1330()) {
                    this.field3065.method1143(var10);
                }
            }
        }
        arg0.field3085.method1151(arg1, arg2, arg3);
    }

    @ObfuscatedName("gs.h(Lgx;II)V")
    public void method3518(class191 arg0, int arg1) {
        if ((this.field3061.field3036[arg0.field3078] & 0x4) != 0 && arg0.field3081 < 0) {
            int var3 = this.field3061.field3029[arg0.field3078] / Statics.field1240;
            int var4 = (var3 + 1048575 - arg0.field3087) / var3;
            arg0.field3087 = arg0.field3087 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3061.field3034[arg0.field3078] == 0) {
                    arg0.field3085 = class68.method1313(arg0.field3086, arg0.field3085.method1328(), arg0.field3085.method1319(), arg0.field3085.method1441());
                } else {
                    arg0.field3085 = class68.method1313(arg0.field3086, arg0.field3085.method1328(), 0, arg0.field3085.method1441());
                    this.field3061.method3482(arg0, arg0.field3067.field2988[arg0.field3076] < 0);
                }
                if (arg0.field3067.field2988[arg0.field3076] < 0) {
                    arg0.field3085.method1339(-1);
                }
                arg1 = arg0.field3087 / var3;
            }
        }
        arg0.field3085.method1169(arg1);
    }
}
