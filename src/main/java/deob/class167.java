package deob;

@ObfuscatedName("fs")
public class class167 extends class61 {

    @ObfuscatedName("fs.c")
    public class165 field2775;

    @ObfuscatedName("fs.j")
    public class180 field2776 = new class180();

    @ObfuscatedName("fs.y")
    public class50 field2777 = new class50();

    public class167(class165 arg0) {
        this.field2775 = arg0;
    }

    @ObfuscatedName("fs.l()Lbr;")
    public class61 method961() {
        class168 var1 = (class168) this.field2776.method3249();
        if (var1 == null) {
            return null;
        } else if (var1.field2798 == null) {
            return this.method962();
        } else {
            return var1.field2798;
        }
    }

    @ObfuscatedName("fs.b()Lbr;")
    public class61 method962() {
        class168 var1;
        do {
            var1 = (class168) this.field2776.method3248();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2798 == null);
        return var1.field2798;
    }

    @ObfuscatedName("fs.k()I")
    public int method963() {
        return 0;
    }

    @ObfuscatedName("fs.g([III)V")
    public void method986(int[] arg0, int arg1, int arg2) {
        this.field2777.method986(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field2776.method3249(); var4 != null; var4 = (class168) this.field2776.method3248()) {
            if (!this.field2775.method3090(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2799) {
                        this.method3151(var4, arg0, var5, var6, var5 + var6);
                        var4.field2799 -= var6;
                        break;
                    }
                    this.method3151(var4, arg0, var5, var4.field2799, var5 + var6);
                    var5 += var4.field2799;
                    var6 -= var4.field2799;
                } while (!this.field2775.method3137(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fs.i(I)V")
    public void method964(int arg0) {
        this.field2777.method964(arg0);
        for (class168 var2 = (class168) this.field2776.method3249(); var2 != null; var2 = (class168) this.field2776.method3248()) {
            if (!this.field2775.method3090(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2799) {
                        this.method3154(var2, var3);
                        var2.field2799 -= var3;
                        break;
                    }
                    this.method3154(var2, var2.field2799);
                    var3 -= var2.field2799;
                } while (!this.field2775.method3137(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fs.c(Lfj;[IIIII)V")
    public void method3151(class168 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2775.field2757[arg0.field2784] & 0x4) != 0 && arg0.field2794 < 0) {
            int var6 = this.field2775.field2754[arg0.field2784] / Statics.field1814;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2782) / var6;
                if (var7 > arg3) {
                    arg0.field2782 += arg3 * var6;
                    break;
                }
                arg0.field2798.method986(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2782 += var6 * var7 - 1048576;
                int var8 = Statics.field1814 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2798;
                if (this.field2775.field2752[arg0.field2784] == 0) {
                    arg0.field2798 = class59.method1228(arg0.field2790, var10.method1151(), var10.method1160(), var10.method1117());
                } else {
                    arg0.field2798 = class59.method1228(arg0.field2790, var10.method1151(), 0, var10.method1117());
                    this.field2775.method3067(arg0, arg0.field2781.field2700[arg0.field2785] < 0);
                    arg0.field2798.method1121(var8, var10.method1160());
                }
                if (arg0.field2781.field2700[arg0.field2785] < 0) {
                    arg0.field2798.method1152(-1);
                }
                var10.method1123(var8);
                var10.method986(arg1, arg2, arg4 - arg2);
                if (var10.method1165()) {
                    this.field2777.method956(var10);
                }
            }
        }
        arg0.field2798.method986(arg1, arg2, arg3);
    }

    @ObfuscatedName("fs.j(Lfj;II)V")
    public void method3154(class168 arg0, int arg1) {
        if ((this.field2775.field2757[arg0.field2784] & 0x4) != 0 && arg0.field2794 < 0) {
            int var3 = this.field2775.field2754[arg0.field2784] / Statics.field1814;
            int var4 = (var3 + 1048575 - arg0.field2782) / var3;
            arg0.field2782 = arg0.field2782 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2775.field2752[arg0.field2784] == 0) {
                    arg0.field2798 = class59.method1228(arg0.field2790, arg0.field2798.method1151(), arg0.field2798.method1160(), arg0.field2798.method1117());
                } else {
                    arg0.field2798 = class59.method1228(arg0.field2790, arg0.field2798.method1151(), 0, arg0.field2798.method1117());
                    this.field2775.method3067(arg0, arg0.field2781.field2700[arg0.field2785] < 0);
                }
                if (arg0.field2781.field2700[arg0.field2785] < 0) {
                    arg0.field2798.method1152(-1);
                }
                arg1 = arg0.field2782 / var3;
            }
        }
        arg0.field2798.method964(arg1);
    }
}
