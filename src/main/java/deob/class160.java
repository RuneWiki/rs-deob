package deob;

@ObfuscatedName("fi")
public class class160 extends class57 {

    @ObfuscatedName("fi.m")
    public class158 field2708;

    @ObfuscatedName("fi.k")
    public class171 field2710 = new class171();

    @ObfuscatedName("fi.y")
    public class46 field2711 = new class46();

    public class160(class158 arg0) {
        this.field2708 = arg0;
    }

    @ObfuscatedName("fi.i()Lbm;")
    public class57 method919() {
        class161 var1 = (class161) this.field2710.method3178();
        if (var1 == null) {
            return null;
        } else if (var1.field2733 == null) {
            return this.method920();
        } else {
            return var1.field2733;
        }
    }

    @ObfuscatedName("fi.f()Lbm;")
    public class57 method920() {
        class161 var1;
        do {
            var1 = (class161) this.field2710.method3179();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2733 == null);
        return var1.field2733;
    }

    @ObfuscatedName("fi.a()I")
    public int method921() {
        return 0;
    }

    @ObfuscatedName("fi.w([III)V")
    public void method922(int[] arg0, int arg1, int arg2) {
        this.field2711.method922(arg0, arg1, arg2);
        for (class161 var4 = (class161) this.field2710.method3178(); var4 != null; var4 = (class161) this.field2710.method3179()) {
            if (!this.field2708.method3039(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2734) {
                        this.method3117(var4, arg0, var5, var6, var5 + var6);
                        var4.field2734 -= var6;
                        break;
                    }
                    this.method3117(var4, arg0, var5, var4.field2734, var5 + var6);
                    var5 += var4.field2734;
                    var6 -= var4.field2734;
                } while (!this.field2708.method3040(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fi.d(I)V")
    public void method924(int arg0) {
        this.field2711.method924(arg0);
        for (class161 var2 = (class161) this.field2710.method3178(); var2 != null; var2 = (class161) this.field2710.method3179()) {
            if (!this.field2708.method3039(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2734) {
                        this.method3116(var2, var3);
                        var2.field2734 -= var3;
                        break;
                    }
                    this.method3116(var2, var2.field2734);
                    var3 -= var2.field2734;
                } while (!this.field2708.method3040(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fi.m(Lfq;[IIIIS)V")
    public void method3117(class161 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2708.field2679[arg0.field2715] & 0x4) != 0 && arg0.field2719 < 0) {
            int var6 = this.field2708.field2684[arg0.field2715] / Statics.field1056;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2735) / var6;
                if (var7 > arg3) {
                    arg0.field2735 += arg3 * var6;
                    break;
                }
                arg0.field2733.method922(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2735 += var6 * var7 - 1048576;
                int var8 = Statics.field1056 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class55 var10 = arg0.field2733;
                if (this.field2708.field2677[arg0.field2715] == 0) {
                    arg0.field2733 = class55.method1086(arg0.field2717, var10.method1100(), var10.method1189(), var10.method1092());
                } else {
                    arg0.field2733 = class55.method1086(arg0.field2717, var10.method1100(), 0, var10.method1092());
                    this.field2708.method3093(arg0, arg0.field2716.field2634[arg0.field2720] < 0);
                    arg0.field2733.method1096(var8, var10.method1189());
                }
                if (arg0.field2716.field2634[arg0.field2720] < 0) {
                    arg0.field2733.method1179(-1);
                }
                var10.method1146(var8);
                var10.method922(arg1, arg2, arg4 - arg2);
                if (var10.method1098()) {
                    this.field2711.method914(var10);
                }
            }
        }
        arg0.field2733.method922(arg1, arg2, arg3);
    }

    @ObfuscatedName("fi.k(Lfq;II)V")
    public void method3116(class161 arg0, int arg1) {
        if ((this.field2708.field2679[arg0.field2715] & 0x4) != 0 && arg0.field2719 < 0) {
            int var3 = this.field2708.field2684[arg0.field2715] / Statics.field1056;
            int var4 = (var3 + 1048575 - arg0.field2735) / var3;
            arg0.field2735 = arg0.field2735 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2708.field2677[arg0.field2715] == 0) {
                    arg0.field2733 = class55.method1086(arg0.field2717, arg0.field2733.method1100(), arg0.field2733.method1189(), arg0.field2733.method1092());
                } else {
                    arg0.field2733 = class55.method1086(arg0.field2717, arg0.field2733.method1100(), 0, arg0.field2733.method1092());
                    this.field2708.method3093(arg0, arg0.field2716.field2634[arg0.field2720] < 0);
                }
                if (arg0.field2716.field2634[arg0.field2720] < 0) {
                    arg0.field2733.method1179(-1);
                }
                arg1 = arg0.field2735 / var3;
            }
        }
        arg0.field2733.method924(arg1);
    }
}
