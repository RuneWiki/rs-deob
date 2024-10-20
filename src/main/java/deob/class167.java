package deob;

@ObfuscatedName("fz")
public class class167 extends class61 {

    @ObfuscatedName("fz.f")
    public class165 field2782;

    @ObfuscatedName("fz.k")
    public class180 field2781 = new class180();

    @ObfuscatedName("fz.y")
    public class50 field2780 = new class50();

    public class167(class165 arg0) {
        this.field2782 = arg0;
    }

    @ObfuscatedName("fz.a()Lbh;")
    public class61 method1000() {
        class168 var1 = (class168) this.field2781.method3285();
        if (var1 == null) {
            return null;
        } else if (var1.field2787 == null) {
            return this.method1001();
        } else {
            return var1.field2787;
        }
    }

    @ObfuscatedName("fz.n()Lbh;")
    public class61 method1001() {
        class168 var1;
        do {
            var1 = (class168) this.field2781.method3286();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2787 == null);
        return var1.field2787;
    }

    @ObfuscatedName("fz.x()I")
    public int method1009() {
        return 0;
    }

    @ObfuscatedName("fz.g([III)V")
    public void method994(int[] arg0, int arg1, int arg2) {
        this.field2780.method994(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field2781.method3285(); var4 != null; var4 = (class168) this.field2781.method3286()) {
            if (!this.field2782.method3113(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2794) {
                        this.method3196(var4, arg0, var5, var6, var5 + var6);
                        var4.field2794 -= var6;
                        break;
                    }
                    this.method3196(var4, arg0, var5, var4.field2794, var5 + var6);
                    var5 += var4.field2794;
                    var6 -= var4.field2794;
                } while (!this.field2782.method3114(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fz.p(I)V")
    public void method1004(int arg0) {
        this.field2780.method1004(arg0);
        for (class168 var2 = (class168) this.field2781.method3285(); var2 != null; var2 = (class168) this.field2781.method3286()) {
            if (!this.field2782.method3113(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2794) {
                        this.method3193(var2, var3);
                        var2.field2794 -= var3;
                        break;
                    }
                    this.method3193(var2, var2.field2794);
                    var3 -= var2.field2794;
                } while (!this.field2782.method3114(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fz.f(Lfs;[IIIIB)V")
    public void method3196(class168 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2782.field2752[arg0.field2804] & 0x4) != 0 && arg0.field2803 < 0) {
            int var6 = this.field2782.field2757[arg0.field2804] / Statics.field1105;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2784) / var6;
                if (var7 > arg3) {
                    arg0.field2784 += arg3 * var6;
                    break;
                }
                arg0.field2787.method994(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2784 += var6 * var7 - 1048576;
                int var8 = Statics.field1105 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2787;
                if (this.field2782.field2753[arg0.field2804] == 0) {
                    arg0.field2787 = class59.method1180(arg0.field2786, var10.method1166(), var10.method1133(), var10.method1137());
                } else {
                    arg0.field2787 = class59.method1180(arg0.field2786, var10.method1166(), 0, var10.method1137());
                    this.field2782.method3096(arg0, arg0.field2785.field2708[arg0.field2789] < 0);
                    arg0.field2787.method1141(var8, var10.method1133());
                }
                if (arg0.field2785.field2708[arg0.field2789] < 0) {
                    arg0.field2787.method1174(-1);
                }
                var10.method1224(var8);
                var10.method994(arg1, arg2, arg4 - arg2);
                if (var10.method1147()) {
                    this.field2780.method995(var10);
                }
            }
        }
        arg0.field2787.method994(arg1, arg2, arg3);
    }

    @ObfuscatedName("fz.k(Lfs;II)V")
    public void method3193(class168 arg0, int arg1) {
        if ((this.field2782.field2752[arg0.field2804] & 0x4) != 0 && arg0.field2803 < 0) {
            int var3 = this.field2782.field2757[arg0.field2804] / Statics.field1105;
            int var4 = (var3 + 1048575 - arg0.field2784) / var3;
            arg0.field2784 = arg0.field2784 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2782.field2753[arg0.field2804] == 0) {
                    arg0.field2787 = class59.method1180(arg0.field2786, arg0.field2787.method1166(), arg0.field2787.method1133(), arg0.field2787.method1137());
                } else {
                    arg0.field2787 = class59.method1180(arg0.field2786, arg0.field2787.method1166(), 0, arg0.field2787.method1137());
                    this.field2782.method3096(arg0, arg0.field2785.field2708[arg0.field2789] < 0);
                }
                if (arg0.field2785.field2708[arg0.field2789] < 0) {
                    arg0.field2787.method1174(-1);
                }
                arg1 = arg0.field2784 / var3;
            }
        }
        arg0.field2787.method1004(arg1);
    }
}
