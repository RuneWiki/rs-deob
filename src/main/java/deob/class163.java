package deob;

@ObfuscatedName("fz")
public class class163 extends class60 {

    @ObfuscatedName("fz.e")
    public class161 field2741;

    @ObfuscatedName("fz.p")
    public class176 field2738 = new class176();

    @ObfuscatedName("fz.a")
    public class49 field2737 = new class49();

    public class163(class161 arg0) {
        this.field2741 = arg0;
    }

    @ObfuscatedName("fz.k()Lbc;")
    public class60 method1002() {
        class164 var1 = (class164) this.field2738.method3225();
        if (var1 == null) {
            return null;
        } else if (var1.field2748 == null) {
            return this.method980();
        } else {
            return var1.field2748;
        }
    }

    @ObfuscatedName("fz.m()Lbc;")
    public class60 method980() {
        class164 var1;
        do {
            var1 = (class164) this.field2738.method3227();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2748 == null);
        return var1.field2748;
    }

    @ObfuscatedName("fz.t()I")
    public int method1017() {
        return 0;
    }

    @ObfuscatedName("fz.l([III)V")
    public void method982(int[] arg0, int arg1, int arg2) {
        this.field2737.method982(arg0, arg1, arg2);
        for (class164 var4 = (class164) this.field2738.method3225(); var4 != null; var4 = (class164) this.field2738.method3227()) {
            if (!this.field2741.method3135(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2761) {
                        this.method3140(var4, arg0, var5, var6, var5 + var6);
                        var4.field2761 -= var6;
                        break;
                    }
                    this.method3140(var4, arg0, var5, var4.field2761, var5 + var6);
                    var5 += var4.field2761;
                    var6 -= var4.field2761;
                } while (!this.field2741.method3082(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fz.c(I)V")
    public void method984(int arg0) {
        this.field2737.method984(arg0);
        for (class164 var2 = (class164) this.field2738.method3225(); var2 != null; var2 = (class164) this.field2738.method3227()) {
            if (!this.field2741.method3135(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2761) {
                        this.method3139(var2, var3);
                        var2.field2761 -= var3;
                        break;
                    }
                    this.method3139(var2, var2.field2761);
                    var3 -= var2.field2761;
                } while (!this.field2741.method3082(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fz.e(Lfl;[IIIIS)V")
    public void method3140(class164 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2741.field2725[arg0.field2764] & 0x4) != 0 && arg0.field2756 < 0) {
            int var6 = this.field2741.field2717[arg0.field2764] / Statics.field1076;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2762) / var6;
                if (var7 > arg3) {
                    arg0.field2762 += arg3 * var6;
                    break;
                }
                arg0.field2748.method982(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2762 += var6 * var7 - 1048576;
                int var8 = Statics.field1076 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2748;
                if (this.field2741.field2715[arg0.field2764] == 0) {
                    arg0.field2748 = class58.method1144(arg0.field2744, var10.method1139(), var10.method1130(), var10.method1131());
                } else {
                    arg0.field2748 = class58.method1144(arg0.field2744, var10.method1139(), 0, var10.method1131());
                    this.field2741.method3077(arg0, arg0.field2743.field2666[arg0.field2747] < 0);
                    arg0.field2748.method1134(var8, var10.method1130());
                }
                if (arg0.field2743.field2666[arg0.field2747] < 0) {
                    arg0.field2748.method1126(-1);
                }
                var10.method1137(var8);
                var10.method982(arg1, arg2, arg4 - arg2);
                if (var10.method1141()) {
                    this.field2737.method974(var10);
                }
            }
        }
        arg0.field2748.method982(arg1, arg2, arg3);
    }

    @ObfuscatedName("fz.p(Lfl;IB)V")
    public void method3139(class164 arg0, int arg1) {
        if ((this.field2741.field2725[arg0.field2764] & 0x4) != 0 && arg0.field2756 < 0) {
            int var3 = this.field2741.field2717[arg0.field2764] / Statics.field1076;
            int var4 = (var3 + 1048575 - arg0.field2762) / var3;
            arg0.field2762 = arg0.field2762 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2741.field2715[arg0.field2764] == 0) {
                    arg0.field2748 = class58.method1144(arg0.field2744, arg0.field2748.method1139(), arg0.field2748.method1130(), arg0.field2748.method1131());
                } else {
                    arg0.field2748 = class58.method1144(arg0.field2744, arg0.field2748.method1139(), 0, arg0.field2748.method1131());
                    this.field2741.method3077(arg0, arg0.field2743.field2666[arg0.field2747] < 0);
                }
                if (arg0.field2743.field2666[arg0.field2747] < 0) {
                    arg0.field2748.method1126(-1);
                }
                arg1 = arg0.field2762 / var3;
            }
        }
        arg0.field2748.method984(arg1);
    }
}
