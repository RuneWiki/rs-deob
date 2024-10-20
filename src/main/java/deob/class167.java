package deob;

@ObfuscatedName("fu")
public class class167 extends class61 {

    @ObfuscatedName("fu.l")
    public class165 field2762;

    @ObfuscatedName("fu.y")
    public class180 field2759 = new class180();

    @ObfuscatedName("fu.g")
    public class50 field2758 = new class50();

    public class167(class165 arg0) {
        this.field2762 = arg0;
    }

    @ObfuscatedName("fu.c()Lbc;")
    public class61 method953() {
        class168 var1 = (class168) this.field2759.method3304();
        if (var1 == null) {
            return null;
        } else if (var1.field2776 == null) {
            return this.method954();
        } else {
            return var1.field2776;
        }
    }

    @ObfuscatedName("fu.x()Lbc;")
    public class61 method954() {
        class168 var1;
        do {
            var1 = (class168) this.field2759.method3297();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2776 == null);
        return var1.field2776;
    }

    @ObfuscatedName("fu.f()I")
    public int method955() {
        return 0;
    }

    @ObfuscatedName("fu.t([III)V")
    public void method978(int[] arg0, int arg1, int arg2) {
        this.field2758.method978(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field2759.method3304(); var4 != null; var4 = (class168) this.field2759.method3297()) {
            if (!this.field2762.method3118(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2784) {
                        this.method3196(var4, arg0, var5, var6, var5 + var6);
                        var4.field2784 -= var6;
                        break;
                    }
                    this.method3196(var4, arg0, var5, var4.field2784, var5 + var6);
                    var5 += var4.field2784;
                    var6 -= var4.field2784;
                } while (!this.field2762.method3117(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fu.p(I)V")
    public void method958(int arg0) {
        this.field2758.method958(arg0);
        for (class168 var2 = (class168) this.field2759.method3304(); var2 != null; var2 = (class168) this.field2759.method3297()) {
            if (!this.field2762.method3118(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2784) {
                        this.method3193(var2, var3);
                        var2.field2784 -= var3;
                        break;
                    }
                    this.method3193(var2, var2.field2784);
                    var3 -= var2.field2784;
                } while (!this.field2762.method3117(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fu.l(Lfz;[IIIII)V")
    public void method3196(class168 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2762.field2728[arg0.field2785] & 0x4) != 0 && arg0.field2779 < 0) {
            int var6 = this.field2762.field2733[arg0.field2785] / Statics.field1086;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2772) / var6;
                if (var7 > arg3) {
                    arg0.field2772 += arg3 * var6;
                    break;
                }
                arg0.field2776.method978(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2772 += var6 * var7 - 1048576;
                int var8 = Statics.field1086 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2776;
                if (this.field2762.field2731[arg0.field2785] == 0) {
                    arg0.field2776 = class59.method1101(arg0.field2767, var10.method1135(), var10.method1097(), var10.method1115());
                } else {
                    arg0.field2776 = class59.method1101(arg0.field2767, var10.method1135(), 0, var10.method1115());
                    this.field2762.method3098(arg0, arg0.field2766.field2679[arg0.field2765] < 0);
                    arg0.field2776.method1102(var8, var10.method1097());
                }
                if (arg0.field2766.field2679[arg0.field2765] < 0) {
                    arg0.field2776.method1094(-1);
                }
                var10.method1104(var8);
                var10.method978(arg1, arg2, arg4 - arg2);
                if (var10.method1168()) {
                    this.field2758.method957(var10);
                }
            }
        }
        arg0.field2776.method978(arg1, arg2, arg3);
    }

    @ObfuscatedName("fu.y(Lfz;II)V")
    public void method3193(class168 arg0, int arg1) {
        if ((this.field2762.field2728[arg0.field2785] & 0x4) != 0 && arg0.field2779 < 0) {
            int var3 = this.field2762.field2733[arg0.field2785] / Statics.field1086;
            int var4 = (var3 + 1048575 - arg0.field2772) / var3;
            arg0.field2772 = arg0.field2772 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2762.field2731[arg0.field2785] == 0) {
                    arg0.field2776 = class59.method1101(arg0.field2767, arg0.field2776.method1135(), arg0.field2776.method1097(), arg0.field2776.method1115());
                } else {
                    arg0.field2776 = class59.method1101(arg0.field2767, arg0.field2776.method1135(), 0, arg0.field2776.method1115());
                    this.field2762.method3098(arg0, arg0.field2766.field2679[arg0.field2765] < 0);
                }
                if (arg0.field2766.field2679[arg0.field2765] < 0) {
                    arg0.field2776.method1094(-1);
                }
                arg1 = arg0.field2772 / var3;
            }
        }
        arg0.field2776.method958(arg1);
    }
}
