package deob;

@ObfuscatedName("gw")
public class class190 extends class70 {

    @ObfuscatedName("gw.k")
    public class188 field3057;

    @ObfuscatedName("gw.q")
    public class203 field3056 = new class203();

    @ObfuscatedName("gw.f")
    public class59 field3058 = new class59();

    public class190(class188 arg0) {
        this.field3057 = arg0;
    }

    @ObfuscatedName("gw.j()Lbf;")
    public class70 method1151() {
        class191 var1 = (class191) this.field3056.method3616();
        if (var1 == null) {
            return null;
        } else if (var1.field3077 == null) {
            return this.method1148();
        } else {
            return var1.field3077;
        }
    }

    @ObfuscatedName("gw.m()Lbf;")
    public class70 method1148() {
        class191 var1;
        do {
            var1 = (class191) this.field3056.method3603();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3077 == null);
        return var1.field3077;
    }

    @ObfuscatedName("gw.y()I")
    public int method1149() {
        return 0;
    }

    @ObfuscatedName("gw.u([III)V")
    public void method1150(int[] arg0, int arg1, int arg2) {
        this.field3058.method1150(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3056.method3616(); var4 != null; var4 = (class191) this.field3056.method3603()) {
            if (!this.field3057.method3454(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3078) {
                        this.method3522(var4, arg0, var5, var6, var5 + var6);
                        var4.field3078 -= var6;
                        break;
                    }
                    this.method3522(var4, arg0, var5, var4.field3078, var5 + var6);
                    var5 += var4.field3078;
                    var6 -= var4.field3078;
                } while (!this.field3057.method3455(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gw.l(I)V")
    public void method1152(int arg0) {
        this.field3058.method1152(arg0);
        for (class191 var2 = (class191) this.field3056.method3616(); var2 != null; var2 = (class191) this.field3056.method3603()) {
            if (!this.field3057.method3454(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3078) {
                        this.method3520(var2, var3);
                        var2.field3078 -= var3;
                        break;
                    }
                    this.method3520(var2, var2.field3078);
                    var3 -= var2.field3078;
                } while (!this.field3057.method3455(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gw.k(Lgr;[IIIIS)V")
    public void method3522(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3057.field3036[arg0.field3072] & 0x4) != 0 && arg0.field3062 < 0) {
            int var6 = this.field3057.field3033[arg0.field3072] / Statics.field1250;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3079) / var6;
                if (var7 > arg3) {
                    arg0.field3079 += arg3 * var6;
                    break;
                }
                arg0.field3077.method1150(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3079 += var6 * var7 - 1048576;
                int var8 = Statics.field1250 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3077;
                if (this.field3057.field3038[arg0.field3072] == 0) {
                    arg0.field3077 = class68.method1412(arg0.field3061, var10.method1325(), var10.method1351(), var10.method1311());
                } else {
                    arg0.field3077 = class68.method1412(arg0.field3061, var10.method1325(), 0, var10.method1311());
                    this.field3057.method3494(arg0, arg0.field3060.field2983[arg0.field3064] < 0);
                    arg0.field3077.method1321(var8, var10.method1351());
                }
                if (arg0.field3060.field2983[arg0.field3064] < 0) {
                    arg0.field3077.method1312(-1);
                }
                var10.method1323(var8);
                var10.method1150(arg1, arg2, arg4 - arg2);
                if (var10.method1347()) {
                    this.field3058.method1142(var10);
                }
            }
        }
        arg0.field3077.method1150(arg1, arg2, arg3);
    }

    @ObfuscatedName("gw.q(Lgr;II)V")
    public void method3520(class191 arg0, int arg1) {
        if ((this.field3057.field3036[arg0.field3072] & 0x4) != 0 && arg0.field3062 < 0) {
            int var3 = this.field3057.field3033[arg0.field3072] / Statics.field1250;
            int var4 = (var3 + 1048575 - arg0.field3079) / var3;
            arg0.field3079 = arg0.field3079 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3057.field3038[arg0.field3072] == 0) {
                    arg0.field3077 = class68.method1412(arg0.field3061, arg0.field3077.method1325(), arg0.field3077.method1351(), arg0.field3077.method1311());
                } else {
                    arg0.field3077 = class68.method1412(arg0.field3061, arg0.field3077.method1325(), 0, arg0.field3077.method1311());
                    this.field3057.method3494(arg0, arg0.field3060.field2983[arg0.field3064] < 0);
                }
                if (arg0.field3060.field2983[arg0.field3064] < 0) {
                    arg0.field3077.method1312(-1);
                }
                arg1 = arg0.field3079 / var3;
            }
        }
        arg0.field3077.method1152(arg1);
    }
}
