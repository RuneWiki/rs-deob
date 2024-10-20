package deob;

@ObfuscatedName("fv")
public class class165 extends class60 {

    @ObfuscatedName("fv.g")
    public class163 field2786;

    @ObfuscatedName("fv.i")
    public class178 field2782 = new class178();

    @ObfuscatedName("fv.k")
    public class49 field2783 = new class49();

    public class165(class163 arg0) {
        this.field2786 = arg0;
    }

    @ObfuscatedName("fv.m()Lbz;")
    public class60 method945() {
        class166 var1 = (class166) this.field2782.method3200();
        if (var1 == null) {
            return null;
        } else if (var1.field2805 == null) {
            return this.method946();
        } else {
            return var1.field2805;
        }
    }

    @ObfuscatedName("fv.u()Lbz;")
    public class60 method946() {
        class166 var1;
        do {
            var1 = (class166) this.field2782.method3209();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2805 == null);
        return var1.field2805;
    }

    @ObfuscatedName("fv.j()I")
    public int method947() {
        return 0;
    }

    @ObfuscatedName("fv.o([III)V")
    public void method954(int[] arg0, int arg1, int arg2) {
        this.field2783.method954(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2782.method3200(); var4 != null; var4 = (class166) this.field2782.method3209()) {
            if (!this.field2786.method3048(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2794) {
                        this.method3127(var4, arg0, var5, var6, var5 + var6);
                        var4.field2794 -= var6;
                        break;
                    }
                    this.method3127(var4, arg0, var5, var4.field2794, var5 + var6);
                    var5 += var4.field2794;
                    var6 -= var4.field2794;
                } while (!this.field2786.method3049(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fv.b(I)V")
    public void method949(int arg0) {
        this.field2783.method949(arg0);
        for (class166 var2 = (class166) this.field2782.method3200(); var2 != null; var2 = (class166) this.field2782.method3209()) {
            if (!this.field2786.method3048(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2794) {
                        this.method3126(var2, var3);
                        var2.field2794 -= var3;
                        break;
                    }
                    this.method3126(var2, var2.field2794);
                    var3 -= var2.field2794;
                } while (!this.field2786.method3049(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fv.g(Lfm;[IIIIS)V")
    public void method3127(class166 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2786.field2750[arg0.field2799] & 0x4) != 0 && arg0.field2807 < 0) {
            int var6 = this.field2786.field2755[arg0.field2799] / Statics.field72;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2802) / var6;
                if (var7 > arg3) {
                    arg0.field2802 += arg3 * var6;
                    break;
                }
                arg0.field2805.method954(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2802 += var6 * var7 - 1048576;
                int var8 = Statics.field72 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2805;
                if (this.field2786.field2745[arg0.field2799] == 0) {
                    arg0.field2805 = class58.method1079(arg0.field2789, var10.method1118(), var10.method1085(), var10.method1187());
                } else {
                    arg0.field2805 = class58.method1079(arg0.field2789, var10.method1118(), 0, var10.method1187());
                    this.field2786.method3030(arg0, arg0.field2788.field2704[arg0.field2792] < 0);
                    arg0.field2805.method1123(var8, var10.method1085());
                }
                if (arg0.field2788.field2704[arg0.field2792] < 0) {
                    arg0.field2805.method1153(-1);
                }
                var10.method1157(var8);
                var10.method954(arg1, arg2, arg4 - arg2);
                if (var10.method1095()) {
                    this.field2783.method940(var10);
                }
            }
        }
        arg0.field2805.method954(arg1, arg2, arg3);
    }

    @ObfuscatedName("fv.i(Lfm;II)V")
    public void method3126(class166 arg0, int arg1) {
        if ((this.field2786.field2750[arg0.field2799] & 0x4) != 0 && arg0.field2807 < 0) {
            int var3 = this.field2786.field2755[arg0.field2799] / Statics.field72;
            int var4 = (var3 + 1048575 - arg0.field2802) / var3;
            arg0.field2802 = arg0.field2802 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2786.field2745[arg0.field2799] == 0) {
                    arg0.field2805 = class58.method1079(arg0.field2789, arg0.field2805.method1118(), arg0.field2805.method1085(), arg0.field2805.method1187());
                } else {
                    arg0.field2805 = class58.method1079(arg0.field2789, arg0.field2805.method1118(), 0, arg0.field2805.method1187());
                    this.field2786.method3030(arg0, arg0.field2788.field2704[arg0.field2792] < 0);
                }
                if (arg0.field2788.field2704[arg0.field2792] < 0) {
                    arg0.field2805.method1153(-1);
                }
                arg1 = arg0.field2802 / var3;
            }
        }
        arg0.field2805.method949(arg1);
    }
}
