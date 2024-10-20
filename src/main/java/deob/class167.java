package deob;

@ObfuscatedName("fv")
public class class167 extends class61 {

    @ObfuscatedName("fv.g")
    public class165 field2772;

    @ObfuscatedName("fv.j")
    public class180 field2775 = new class180();

    @ObfuscatedName("fv.z")
    public class50 field2773 = new class50();

    public class167(class165 arg0) {
        this.field2772 = arg0;
    }

    @ObfuscatedName("fv.c()Lbr;")
    public class61 method936() {
        class168 var1 = (class168) this.field2775.method3174();
        if (var1 == null) {
            return null;
        } else if (var1.field2794 == null) {
            return this.method919();
        } else {
            return var1.field2794;
        }
    }

    @ObfuscatedName("fv.w()Lbr;")
    public class61 method919() {
        class168 var1;
        do {
            var1 = (class168) this.field2775.method3176();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2794 == null);
        return var1.field2794;
    }

    @ObfuscatedName("fv.l()I")
    public int method914() {
        return 0;
    }

    @ObfuscatedName("fv.n([III)V")
    public void method912(int[] arg0, int arg1, int arg2) {
        this.field2773.method912(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field2775.method3174(); var4 != null; var4 = (class168) this.field2775.method3176()) {
            if (!this.field2772.method2993(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2795) {
                        this.method3081(var4, arg0, var5, var6, var5 + var6);
                        var4.field2795 -= var6;
                        break;
                    }
                    this.method3081(var4, arg0, var5, var4.field2795, var5 + var6);
                    var5 += var4.field2795;
                    var6 -= var4.field2795;
                } while (!this.field2772.method3008(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fv.h(I)V")
    public void method949(int arg0) {
        this.field2773.method949(arg0);
        for (class168 var2 = (class168) this.field2775.method3174(); var2 != null; var2 = (class168) this.field2775.method3176()) {
            if (!this.field2772.method2993(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2795) {
                        this.method3080(var2, var3);
                        var2.field2795 -= var3;
                        break;
                    }
                    this.method3080(var2, var2.field2795);
                    var3 -= var2.field2795;
                } while (!this.field2772.method3008(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fv.g(Lfq;[IIIIS)V")
    public void method3081(class168 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2772.field2742[arg0.field2785] & 0x4) != 0 && arg0.field2790 < 0) {
            int var6 = this.field2772.field2745[arg0.field2785] / Statics.field1093;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2796) / var6;
                if (var7 > arg3) {
                    arg0.field2796 += arg3 * var6;
                    break;
                }
                arg0.field2794.method912(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2796 += var6 * var7 - 1048576;
                int var8 = Statics.field1093 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2794;
                if (this.field2772.field2743[arg0.field2785] == 0) {
                    arg0.field2794 = class59.method1153(arg0.field2776, var10.method1081(), var10.method1072(), var10.method1073());
                } else {
                    arg0.field2794 = class59.method1153(arg0.field2776, var10.method1081(), 0, var10.method1073());
                    this.field2772.method2976(arg0, arg0.field2778.field2698[arg0.field2781] < 0);
                    arg0.field2794.method1151(var8, var10.method1072());
                }
                if (arg0.field2778.field2698[arg0.field2781] < 0) {
                    arg0.field2794.method1068(-1);
                }
                var10.method1079(var8);
                var10.method912(arg1, arg2, arg4 - arg2);
                if (var10.method1083()) {
                    this.field2773.method913(var10);
                }
            }
        }
        arg0.field2794.method912(arg1, arg2, arg3);
    }

    @ObfuscatedName("fv.j(Lfq;II)V")
    public void method3080(class168 arg0, int arg1) {
        if ((this.field2772.field2742[arg0.field2785] & 0x4) != 0 && arg0.field2790 < 0) {
            int var3 = this.field2772.field2745[arg0.field2785] / Statics.field1093;
            int var4 = (var3 + 1048575 - arg0.field2796) / var3;
            arg0.field2796 = arg0.field2796 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2772.field2743[arg0.field2785] == 0) {
                    arg0.field2794 = class59.method1153(arg0.field2776, arg0.field2794.method1081(), arg0.field2794.method1072(), arg0.field2794.method1073());
                } else {
                    arg0.field2794 = class59.method1153(arg0.field2776, arg0.field2794.method1081(), 0, arg0.field2794.method1073());
                    this.field2772.method2976(arg0, arg0.field2778.field2698[arg0.field2781] < 0);
                }
                if (arg0.field2778.field2698[arg0.field2781] < 0) {
                    arg0.field2794.method1068(-1);
                }
                arg1 = arg0.field2796 / var3;
            }
        }
        arg0.field2794.method949(arg1);
    }
}
