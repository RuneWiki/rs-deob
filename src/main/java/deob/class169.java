package deob;

@ObfuscatedName("fl")
public class class169 extends class61 {

    @ObfuscatedName("fl.b")
    public class167 field2796;

    @ObfuscatedName("fl.e")
    public class182 field2797 = new class182();

    @ObfuscatedName("fl.i")
    public class50 field2798 = new class50();

    public class169(class167 arg0) {
        this.field2796 = arg0;
    }

    @ObfuscatedName("fl.p()Lbe;")
    public class61 method943() {
        class170 var1 = (class170) this.field2797.method3293();
        if (var1 == null) {
            return null;
        } else if (var1.field2808 == null) {
            return this.method944();
        } else {
            return var1.field2808;
        }
    }

    @ObfuscatedName("fl.n()Lbe;")
    public class61 method944() {
        class170 var1;
        do {
            var1 = (class170) this.field2797.method3288();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2808 == null);
        return var1.field2808;
    }

    @ObfuscatedName("fl.o()I")
    public int method959() {
        return 0;
    }

    @ObfuscatedName("fl.g([III)V")
    public void method946(int[] arg0, int arg1, int arg2) {
        this.field2798.method946(arg0, arg1, arg2);
        for (class170 var4 = (class170) this.field2797.method3293(); var4 != null; var4 = (class170) this.field2797.method3288()) {
            if (!this.field2796.method3108(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2819) {
                        this.method3195(var4, arg0, var5, var6, var5 + var6);
                        var4.field2819 -= var6;
                        break;
                    }
                    this.method3195(var4, arg0, var5, var4.field2819, var5 + var6);
                    var5 += var4.field2819;
                    var6 -= var4.field2819;
                } while (!this.field2796.method3126(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fl.t(I)V")
    public void method948(int arg0) {
        this.field2798.method948(arg0);
        for (class170 var2 = (class170) this.field2797.method3293(); var2 != null; var2 = (class170) this.field2797.method3288()) {
            if (!this.field2796.method3108(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2819) {
                        this.method3196(var2, var3);
                        var2.field2819 -= var3;
                        break;
                    }
                    this.method3196(var2, var2.field2819);
                    var3 -= var2.field2819;
                } while (!this.field2796.method3126(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fl.b(Lfe;[IIIII)V")
    public void method3195(class170 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2796.field2767[arg0.field2815] & 0x4) != 0 && arg0.field2814 < 0) {
            int var6 = this.field2796.field2774[arg0.field2815] / Statics.field1092;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2820) / var6;
                if (var7 > arg3) {
                    arg0.field2820 += arg3 * var6;
                    break;
                }
                arg0.field2808.method946(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2820 += var6 * var7 - 1048576;
                int var8 = Statics.field1092 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2808;
                if (this.field2796.field2770[arg0.field2815] == 0) {
                    arg0.field2808 = class59.method1224(arg0.field2805, var10.method1184(), var10.method1088(), var10.method1154());
                } else {
                    arg0.field2808 = class59.method1224(arg0.field2805, var10.method1184(), 0, var10.method1154());
                    this.field2796.method3145(arg0, arg0.field2801.field2722[arg0.field2800] < 0);
                    arg0.field2808.method1093(var8, var10.method1088());
                }
                if (arg0.field2801.field2722[arg0.field2800] < 0) {
                    arg0.field2808.method1108(-1);
                }
                var10.method1125(var8);
                var10.method946(arg1, arg2, arg4 - arg2);
                if (var10.method1220()) {
                    this.field2798.method955(var10);
                }
            }
        }
        arg0.field2808.method946(arg1, arg2, arg3);
    }

    @ObfuscatedName("fl.e(Lfe;II)V")
    public void method3196(class170 arg0, int arg1) {
        if ((this.field2796.field2767[arg0.field2815] & 0x4) != 0 && arg0.field2814 < 0) {
            int var3 = this.field2796.field2774[arg0.field2815] / Statics.field1092;
            int var4 = (var3 + 1048575 - arg0.field2820) / var3;
            arg0.field2820 = arg0.field2820 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2796.field2770[arg0.field2815] == 0) {
                    arg0.field2808 = class59.method1224(arg0.field2805, arg0.field2808.method1184(), arg0.field2808.method1088(), arg0.field2808.method1154());
                } else {
                    arg0.field2808 = class59.method1224(arg0.field2805, arg0.field2808.method1184(), 0, arg0.field2808.method1154());
                    this.field2796.method3145(arg0, arg0.field2801.field2722[arg0.field2800] < 0);
                }
                if (arg0.field2801.field2722[arg0.field2800] < 0) {
                    arg0.field2808.method1108(-1);
                }
                arg1 = arg0.field2820 / var3;
            }
        }
        arg0.field2808.method948(arg1);
    }
}
