package deob;

@ObfuscatedName("fz")
public class class160 extends class57 {

    @ObfuscatedName("fz.z")
    public class158 field2732;

    @ObfuscatedName("fz.n")
    public class171 field2731 = new class171();

    @ObfuscatedName("fz.u")
    public class46 field2730 = new class46();

    public class160(class158 arg0) {
        this.field2732 = arg0;
    }

    @ObfuscatedName("fz.a()Lbt;")
    public class57 method956() {
        class161 var1 = (class161) this.field2731.method3236();
        if (var1 == null) {
            return null;
        } else if (var1.field2751 == null) {
            return this.method957();
        } else {
            return var1.field2751;
        }
    }

    @ObfuscatedName("fz.l()Lbt;")
    public class57 method957() {
        class161 var1;
        do {
            var1 = (class161) this.field2731.method3228();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2751 == null);
        return var1.field2751;
    }

    @ObfuscatedName("fz.v()I")
    public int method958() {
        return 0;
    }

    @ObfuscatedName("fz.j([III)V")
    public void method973(int[] arg0, int arg1, int arg2) {
        this.field2730.method973(arg0, arg1, arg2);
        for (class161 var4 = (class161) this.field2731.method3236(); var4 != null; var4 = (class161) this.field2731.method3228()) {
            if (!this.field2732.method3089(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2752) {
                        this.method3163(var4, arg0, var5, var6, var5 + var6);
                        var4.field2752 -= var6;
                        break;
                    }
                    this.method3163(var4, arg0, var5, var4.field2752, var5 + var6);
                    var5 += var4.field2752;
                    var6 -= var4.field2752;
                } while (!this.field2732.method3090(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fz.g(I)V")
    public void method961(int arg0) {
        this.field2730.method961(arg0);
        for (class161 var2 = (class161) this.field2731.method3236(); var2 != null; var2 = (class161) this.field2731.method3228()) {
            if (!this.field2732.method3089(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2752) {
                        this.method3165(var2, var3);
                        var2.field2752 -= var3;
                        break;
                    }
                    this.method3165(var2, var2.field2752);
                    var3 -= var2.field2752;
                } while (!this.field2732.method3090(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fz.z(Lfg;[IIIII)V")
    public void method3163(class161 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2732.field2699[arg0.field2754] & 0x4) != 0 && arg0.field2747 < 0) {
            int var6 = this.field2732.field2704[arg0.field2754] / Statics.field2844;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2753) / var6;
                if (var7 > arg3) {
                    arg0.field2753 += arg3 * var6;
                    break;
                }
                arg0.field2751.method973(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2753 += var6 * var7 - 1048576;
                int var8 = Statics.field2844 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class55 var10 = arg0.field2751;
                if (this.field2732.field2691[arg0.field2754] == 0) {
                    arg0.field2751 = class55.method1100(arg0.field2735, var10.method1114(), var10.method1107(), var10.method1106());
                } else {
                    arg0.field2751 = class55.method1100(arg0.field2735, var10.method1114(), 0, var10.method1106());
                    this.field2732.method3072(arg0, arg0.field2748.field2653[arg0.field2738] < 0);
                    arg0.field2751.method1157(var8, var10.method1107());
                }
                if (arg0.field2748.field2653[arg0.field2738] < 0) {
                    arg0.field2751.method1135(-1);
                }
                var10.method1112(var8);
                var10.method973(arg1, arg2, arg4 - arg2);
                if (var10.method1178()) {
                    this.field2730.method967(var10);
                }
            }
        }
        arg0.field2751.method973(arg1, arg2, arg3);
    }

    @ObfuscatedName("fz.n(Lfg;II)V")
    public void method3165(class161 arg0, int arg1) {
        if ((this.field2732.field2699[arg0.field2754] & 0x4) != 0 && arg0.field2747 < 0) {
            int var3 = this.field2732.field2704[arg0.field2754] / Statics.field2844;
            int var4 = (var3 + 1048575 - arg0.field2753) / var3;
            arg0.field2753 = arg0.field2753 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2732.field2691[arg0.field2754] == 0) {
                    arg0.field2751 = class55.method1100(arg0.field2735, arg0.field2751.method1114(), arg0.field2751.method1107(), arg0.field2751.method1106());
                } else {
                    arg0.field2751 = class55.method1100(arg0.field2735, arg0.field2751.method1114(), 0, arg0.field2751.method1106());
                    this.field2732.method3072(arg0, arg0.field2748.field2653[arg0.field2738] < 0);
                }
                if (arg0.field2748.field2653[arg0.field2738] < 0) {
                    arg0.field2751.method1135(-1);
                }
                arg1 = arg0.field2753 / var3;
            }
        }
        arg0.field2751.method961(arg1);
    }
}
