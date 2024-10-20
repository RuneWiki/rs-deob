package deob;

@ObfuscatedName("fs")
public class class165 extends class60 {

    @ObfuscatedName("fs.g")
    public class163 field2763;

    @ObfuscatedName("fs.s")
    public class178 field2762 = new class178();

    @ObfuscatedName("fs.h")
    public class49 field2764 = new class49();

    public class165(class163 arg0) {
        this.field2763 = arg0;
    }

    @ObfuscatedName("fs.j()Lbw;")
    public class60 method938() {
        class166 var1 = (class166) this.field2762.method3196();
        if (var1 == null) {
            return null;
        } else if (var1.field2769 == null) {
            return this.method939();
        } else {
            return var1.field2769;
        }
    }

    @ObfuscatedName("fs.b()Lbw;")
    public class60 method939() {
        class166 var1;
        do {
            var1 = (class166) this.field2762.method3206();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2769 == null);
        return var1.field2769;
    }

    @ObfuscatedName("fs.v()I")
    public int method940() {
        return 0;
    }

    @ObfuscatedName("fs.y([III)V")
    public void method936(int[] arg0, int arg1, int arg2) {
        this.field2764.method936(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2762.method3196(); var4 != null; var4 = (class166) this.field2762.method3206()) {
            if (!this.field2763.method3031(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2778) {
                        this.method3103(var4, arg0, var5, var6, var5 + var6);
                        var4.field2778 -= var6;
                        break;
                    }
                    this.method3103(var4, arg0, var5, var4.field2778, var5 + var6);
                    var5 += var4.field2778;
                    var6 -= var4.field2778;
                } while (!this.field2763.method3019(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fs.x(I)V")
    public void method950(int arg0) {
        this.field2764.method950(arg0);
        for (class166 var2 = (class166) this.field2762.method3196(); var2 != null; var2 = (class166) this.field2762.method3206()) {
            if (!this.field2763.method3031(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2778) {
                        this.method3104(var2, var3);
                        var2.field2778 -= var3;
                        break;
                    }
                    this.method3104(var2, var2.field2778);
                    var3 -= var2.field2778;
                } while (!this.field2763.method3019(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fs.g(Lfx;[IIIII)V")
    public void method3103(class166 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2763.field2733[arg0.field2782] & 0x4) != 0 && arg0.field2781 < 0) {
            int var6 = this.field2763.field2741[arg0.field2782] / Statics.field1071;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2787) / var6;
                if (var7 > arg3) {
                    arg0.field2787 += arg3 * var6;
                    break;
                }
                arg0.field2769.method936(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2787 += var6 * var7 - 1048576;
                int var8 = Statics.field1071 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2769;
                if (this.field2763.field2739[arg0.field2782] == 0) {
                    arg0.field2769 = class58.method1101(arg0.field2791, var10.method1116(), var10.method1107(), var10.method1108());
                } else {
                    arg0.field2769 = class58.method1101(arg0.field2791, var10.method1116(), 0, var10.method1108());
                    this.field2763.method3021(arg0, arg0.field2785.field2691[arg0.field2772] < 0);
                    arg0.field2769.method1112(var8, var10.method1107());
                }
                if (arg0.field2785.field2691[arg0.field2772] < 0) {
                    arg0.field2769.method1103(-1);
                }
                var10.method1096(var8);
                var10.method936(arg1, arg2, arg4 - arg2);
                if (var10.method1143()) {
                    this.field2764.method933(var10);
                }
            }
        }
        arg0.field2769.method936(arg1, arg2, arg3);
    }

    @ObfuscatedName("fs.s(Lfx;IB)V")
    public void method3104(class166 arg0, int arg1) {
        if ((this.field2763.field2733[arg0.field2782] & 0x4) != 0 && arg0.field2781 < 0) {
            int var3 = this.field2763.field2741[arg0.field2782] / Statics.field1071;
            int var4 = (var3 + 1048575 - arg0.field2787) / var3;
            arg0.field2787 = arg0.field2787 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2763.field2739[arg0.field2782] == 0) {
                    arg0.field2769 = class58.method1101(arg0.field2791, arg0.field2769.method1116(), arg0.field2769.method1107(), arg0.field2769.method1108());
                } else {
                    arg0.field2769 = class58.method1101(arg0.field2791, arg0.field2769.method1116(), 0, arg0.field2769.method1108());
                    this.field2763.method3021(arg0, arg0.field2785.field2691[arg0.field2772] < 0);
                }
                if (arg0.field2785.field2691[arg0.field2772] < 0) {
                    arg0.field2769.method1103(-1);
                }
                arg1 = arg0.field2787 / var3;
            }
        }
        arg0.field2769.method950(arg1);
    }
}
