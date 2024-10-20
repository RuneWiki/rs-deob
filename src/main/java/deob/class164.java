package deob;

@ObfuscatedName("ff")
public class class164 extends class60 {

    @ObfuscatedName("ff.i")
    public class162 field2759;

    @ObfuscatedName("ff.c")
    public class177 field2757 = new class177();

    @ObfuscatedName("ff.h")
    public class49 field2758 = new class49();

    public class164(class162 arg0) {
        this.field2759 = arg0;
    }

    @ObfuscatedName("ff.s()Lbk;")
    public class60 method958() {
        class165 var1 = (class165) this.field2757.method3257();
        if (var1 == null) {
            return null;
        } else if (var1.field2769 == null) {
            return this.method959();
        } else {
            return var1.field2769;
        }
    }

    @ObfuscatedName("ff.g()Lbk;")
    public class60 method959() {
        class165 var1;
        do {
            var1 = (class165) this.field2757.method3249();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2769 == null);
        return var1.field2769;
    }

    @ObfuscatedName("ff.u()I")
    public int method990() {
        return 0;
    }

    @ObfuscatedName("ff.d([III)V")
    public void method961(int[] arg0, int arg1, int arg2) {
        this.field2758.method961(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2757.method3257(); var4 != null; var4 = (class165) this.field2757.method3249()) {
            if (!this.field2759.method3101(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2771) {
                        this.method3167(var4, arg0, var5, var6, var5 + var6);
                        var4.field2771 -= var6;
                        break;
                    }
                    this.method3167(var4, arg0, var5, var4.field2771, var5 + var6);
                    var5 += var4.field2771;
                    var6 -= var4.field2771;
                } while (!this.field2759.method3084(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ff.e(I)V")
    public void method972(int arg0) {
        this.field2758.method972(arg0);
        for (class165 var2 = (class165) this.field2757.method3257(); var2 != null; var2 = (class165) this.field2757.method3249()) {
            if (!this.field2759.method3101(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2771) {
                        this.method3166(var2, var3);
                        var2.field2771 -= var3;
                        break;
                    }
                    this.method3166(var2, var2.field2771);
                    var3 -= var2.field2771;
                } while (!this.field2759.method3084(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ff.i(Lfm;[IIIIB)V")
    public void method3167(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2759.field2731[arg0.field2770] & 0x4) != 0 && arg0.field2781 < 0) {
            int var6 = this.field2759.field2736[arg0.field2770] / Statics.field1095;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2782) / var6;
                if (var7 > arg3) {
                    arg0.field2782 += arg3 * var6;
                    break;
                }
                arg0.field2769.method961(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2782 += var6 * var7 - 1048576;
                int var8 = Statics.field1095 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2769;
                if (this.field2759.field2734[arg0.field2770] == 0) {
                    arg0.field2769 = class58.method1113(arg0.field2764, var10.method1230(), var10.method1119(), var10.method1120());
                } else {
                    arg0.field2769 = class58.method1113(arg0.field2764, var10.method1230(), 0, var10.method1120());
                    this.field2759.method3122(arg0, arg0.field2763.field2684[arg0.field2762] < 0);
                    arg0.field2769.method1124(var8, var10.method1119());
                }
                if (arg0.field2763.field2684[arg0.field2762] < 0) {
                    arg0.field2769.method1115(-1);
                }
                var10.method1158(var8);
                var10.method961(arg1, arg2, arg4 - arg2);
                if (var10.method1129()) {
                    this.field2758.method953(var10);
                }
            }
        }
        arg0.field2769.method961(arg1, arg2, arg3);
    }

    @ObfuscatedName("ff.c(Lfm;IB)V")
    public void method3166(class165 arg0, int arg1) {
        if ((this.field2759.field2731[arg0.field2770] & 0x4) != 0 && arg0.field2781 < 0) {
            int var3 = this.field2759.field2736[arg0.field2770] / Statics.field1095;
            int var4 = (var3 + 1048575 - arg0.field2782) / var3;
            arg0.field2782 = arg0.field2782 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2759.field2734[arg0.field2770] == 0) {
                    arg0.field2769 = class58.method1113(arg0.field2764, arg0.field2769.method1230(), arg0.field2769.method1119(), arg0.field2769.method1120());
                } else {
                    arg0.field2769 = class58.method1113(arg0.field2764, arg0.field2769.method1230(), 0, arg0.field2769.method1120());
                    this.field2759.method3122(arg0, arg0.field2763.field2684[arg0.field2762] < 0);
                }
                if (arg0.field2763.field2684[arg0.field2762] < 0) {
                    arg0.field2769.method1115(-1);
                }
                arg1 = arg0.field2782 / var3;
            }
        }
        arg0.field2769.method972(arg1);
    }
}
