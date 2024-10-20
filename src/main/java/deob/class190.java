package deob;

@ObfuscatedName("gk")
public class class190 extends class70 {

    @ObfuscatedName("gk.x")
    public class188 field3059;

    @ObfuscatedName("gk.r")
    public class203 field3061 = new class203();

    @ObfuscatedName("gk.j")
    public class59 field3060 = new class59();

    public class190(class188 arg0) {
        this.field3059 = arg0;
    }

    @ObfuscatedName("gk.b()Lbd;")
    public class70 method1153() {
        class191 var1 = (class191) this.field3061.method3600();
        if (var1 == null) {
            return null;
        } else if (var1.field3068 == null) {
            return this.method1155();
        } else {
            return var1.field3068;
        }
    }

    @ObfuscatedName("gk.l()Lbd;")
    public class70 method1155() {
        class191 var1;
        do {
            var1 = (class191) this.field3061.method3602();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3068 == null);
        return var1.field3068;
    }

    @ObfuscatedName("gk.m()I")
    public int method1147() {
        return 0;
    }

    @ObfuscatedName("gk.p([III)V")
    public void method1179(int[] arg0, int arg1, int arg2) {
        this.field3060.method1179(arg0, arg1, arg2);
        for (class191 var4 = (class191) this.field3061.method3600(); var4 != null; var4 = (class191) this.field3061.method3602()) {
            if (!this.field3059.method3433(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3082) {
                        this.method3511(var4, arg0, var5, var6, var5 + var6);
                        var4.field3082 -= var6;
                        break;
                    }
                    this.method3511(var4, arg0, var5, var4.field3082, var5 + var6);
                    var5 += var4.field3082;
                    var6 -= var4.field3082;
                } while (!this.field3059.method3430(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("gk.d(I)V")
    public void method1158(int arg0) {
        this.field3060.method1158(arg0);
        for (class191 var2 = (class191) this.field3061.method3600(); var2 != null; var2 = (class191) this.field3061.method3602()) {
            if (!this.field3059.method3433(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3082) {
                        this.method3513(var2, var3);
                        var2.field3082 -= var3;
                        break;
                    }
                    this.method3513(var2, var2.field3082);
                    var3 -= var2.field3082;
                } while (!this.field3059.method3430(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("gk.x(Lgd;[IIIII)V")
    public void method3511(class191 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3059.field3022[arg0.field3071] & 0x4) != 0 && arg0.field3077 < 0) {
            int var6 = this.field3059.field3036[arg0.field3071] / Statics.field1229;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3083) / var6;
                if (var7 > arg3) {
                    arg0.field3083 += arg3 * var6;
                    break;
                }
                arg0.field3068.method1179(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3083 += var6 * var7 - 1048576;
                int var8 = Statics.field1229 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class68 var10 = arg0.field3068;
                if (this.field3059.field3024[arg0.field3071] == 0) {
                    arg0.field3068 = class68.method1312(arg0.field3070, var10.method1354(), var10.method1336(), var10.method1425());
                } else {
                    arg0.field3068 = class68.method1312(arg0.field3070, var10.method1354(), 0, var10.method1425());
                    this.field3059.method3410(arg0, arg0.field3064.field2990[arg0.field3081] < 0);
                    arg0.field3068.method1322(var8, var10.method1336());
                }
                if (arg0.field3064.field2990[arg0.field3081] < 0) {
                    arg0.field3068.method1314(-1);
                }
                var10.method1324(var8);
                var10.method1179(arg1, arg2, arg4 - arg2);
                if (var10.method1328()) {
                    this.field3060.method1148(var10);
                }
            }
        }
        arg0.field3068.method1179(arg1, arg2, arg3);
    }

    @ObfuscatedName("gk.r(Lgd;IB)V")
    public void method3513(class191 arg0, int arg1) {
        if ((this.field3059.field3022[arg0.field3071] & 0x4) != 0 && arg0.field3077 < 0) {
            int var3 = this.field3059.field3036[arg0.field3071] / Statics.field1229;
            int var4 = (var3 + 1048575 - arg0.field3083) / var3;
            arg0.field3083 = arg0.field3083 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3059.field3024[arg0.field3071] == 0) {
                    arg0.field3068 = class68.method1312(arg0.field3070, arg0.field3068.method1354(), arg0.field3068.method1336(), arg0.field3068.method1425());
                } else {
                    arg0.field3068 = class68.method1312(arg0.field3070, arg0.field3068.method1354(), 0, arg0.field3068.method1425());
                    this.field3059.method3410(arg0, arg0.field3064.field2990[arg0.field3081] < 0);
                }
                if (arg0.field3064.field2990[arg0.field3081] < 0) {
                    arg0.field3068.method1314(-1);
                }
                arg1 = arg0.field3083 / var3;
            }
        }
        arg0.field3068.method1158(arg1);
    }
}
