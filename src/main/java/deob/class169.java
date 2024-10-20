package deob;

@ObfuscatedName("fr")
public class class169 extends class61 {

    @ObfuscatedName("fr.a")
    public class167 field2797;

    @ObfuscatedName("fr.v")
    public class182 field2794 = new class182();

    @ObfuscatedName("fr.i")
    public class50 field2796 = new class50();

    public class169(class167 arg0) {
        this.field2797 = arg0;
    }

    @ObfuscatedName("fr.m()Lbz;")
    public class61 method978() {
        class170 var1 = (class170) this.field2794.method3251();
        if (var1 == null) {
            return null;
        } else if (var1.field2801 == null) {
            return this.method974();
        } else {
            return var1.field2801;
        }
    }

    @ObfuscatedName("fr.w()Lbz;")
    public class61 method974() {
        class170 var1;
        do {
            var1 = (class170) this.field2794.method3261();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2801 == null);
        return var1.field2801;
    }

    @ObfuscatedName("fr.e()I")
    public int method987() {
        return 0;
    }

    @ObfuscatedName("fr.n([III)V")
    public void method975(int[] arg0, int arg1, int arg2) {
        this.field2796.method975(arg0, arg1, arg2);
        for (class170 var4 = (class170) this.field2794.method3251(); var4 != null; var4 = (class170) this.field2794.method3261()) {
            if (!this.field2797.method3072(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2815) {
                        this.method3166(var4, arg0, var5, var6, var5 + var6);
                        var4.field2815 -= var6;
                        break;
                    }
                    this.method3166(var4, arg0, var5, var4.field2815, var5 + var6);
                    var5 += var4.field2815;
                    var6 -= var4.field2815;
                } while (!this.field2797.method3085(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fr.k(I)V")
    public void method977(int arg0) {
        this.field2796.method977(arg0);
        for (class170 var2 = (class170) this.field2794.method3251(); var2 != null; var2 = (class170) this.field2794.method3261()) {
            if (!this.field2797.method3072(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2815) {
                        this.method3167(var2, var3);
                        var2.field2815 -= var3;
                        break;
                    }
                    this.method3167(var2, var2.field2815);
                    var3 -= var2.field2815;
                } while (!this.field2797.method3085(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fr.a(Lfy;[IIIII)V")
    public void method3166(class170 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2797.field2767[arg0.field2817] & 0x4) != 0 && arg0.field2816 < 0) {
            int var6 = this.field2797.field2755[arg0.field2817] / Statics.field1084;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2819) / var6;
                if (var7 > arg3) {
                    arg0.field2819 += arg3 * var6;
                    break;
                }
                arg0.field2801.method975(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2819 += var6 * var7 - 1048576;
                int var8 = Statics.field1084 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2801;
                if (this.field2797.field2770[arg0.field2817] == 0) {
                    arg0.field2801 = class59.method1115(arg0.field2799, var10.method1118(), var10.method1187(), var10.method1125());
                } else {
                    arg0.field2801 = class59.method1115(arg0.field2799, var10.method1118(), 0, var10.method1125());
                    this.field2797.method3071(arg0, arg0.field2800.field2723[arg0.field2804] < 0);
                    arg0.field2801.method1121(var8, var10.method1187());
                }
                if (arg0.field2800.field2723[arg0.field2804] < 0) {
                    arg0.field2801.method1112(-1);
                }
                var10.method1123(var8);
                var10.method975(arg1, arg2, arg4 - arg2);
                if (var10.method1127()) {
                    this.field2796.method968(var10);
                }
            }
        }
        arg0.field2801.method975(arg1, arg2, arg3);
    }

    @ObfuscatedName("fr.v(Lfy;II)V")
    public void method3167(class170 arg0, int arg1) {
        if ((this.field2797.field2767[arg0.field2817] & 0x4) != 0 && arg0.field2816 < 0) {
            int var3 = this.field2797.field2755[arg0.field2817] / Statics.field1084;
            int var4 = (var3 + 1048575 - arg0.field2819) / var3;
            arg0.field2819 = arg0.field2819 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2797.field2770[arg0.field2817] == 0) {
                    arg0.field2801 = class59.method1115(arg0.field2799, arg0.field2801.method1118(), arg0.field2801.method1187(), arg0.field2801.method1125());
                } else {
                    arg0.field2801 = class59.method1115(arg0.field2799, arg0.field2801.method1118(), 0, arg0.field2801.method1125());
                    this.field2797.method3071(arg0, arg0.field2800.field2723[arg0.field2804] < 0);
                }
                if (arg0.field2800.field2723[arg0.field2804] < 0) {
                    arg0.field2801.method1112(-1);
                }
                arg1 = arg0.field2819 / var3;
            }
        }
        arg0.field2801.method977(arg1);
    }
}
