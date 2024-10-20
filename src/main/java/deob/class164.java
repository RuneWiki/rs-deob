package deob;

@ObfuscatedName("fm")
public class class164 extends class60 {

    @ObfuscatedName("fm.z")
    public class162 field2751;

    @ObfuscatedName("fm.j")
    public class177 field2749 = new class177();

    @ObfuscatedName("fm.a")
    public class49 field2750 = new class49();

    public class164(class162 arg0) {
        this.field2751 = arg0;
    }

    @ObfuscatedName("fm.b()Lbq;")
    public class60 method943() {
        class165 var1 = (class165) this.field2749.method3232();
        if (var1 == null) {
            return null;
        } else if (var1.field2754 == null) {
            return this.method941();
        } else {
            return var1.field2754;
        }
    }

    @ObfuscatedName("fm.s()Lbq;")
    public class60 method941() {
        class165 var1;
        do {
            var1 = (class165) this.field2749.method3251();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2754 == null);
        return var1.field2754;
    }

    @ObfuscatedName("fm.q()I")
    public int method942() {
        return 0;
    }

    @ObfuscatedName("fm.p([III)V")
    public void method946(int[] arg0, int arg1, int arg2) {
        this.field2750.method946(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2749.method3232(); var4 != null; var4 = (class165) this.field2749.method3251()) {
            if (!this.field2751.method3062(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2753) {
                        this.method3146(var4, arg0, var5, var6, var5 + var6);
                        var4.field2753 -= var6;
                        break;
                    }
                    this.method3146(var4, arg0, var5, var4.field2753, var5 + var6);
                    var5 += var4.field2753;
                    var6 -= var4.field2753;
                } while (!this.field2751.method3063(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fm.r(I)V")
    public void method945(int arg0) {
        this.field2750.method945(arg0);
        for (class165 var2 = (class165) this.field2749.method3232(); var2 != null; var2 = (class165) this.field2749.method3251()) {
            if (!this.field2751.method3062(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2753) {
                        this.method3147(var2, var3);
                        var2.field2753 -= var3;
                        break;
                    }
                    this.method3147(var2, var2.field2753);
                    var3 -= var2.field2753;
                } while (!this.field2751.method3063(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fm.z(Lfo;[IIIII)V")
    public void method3146(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2751.field2720[arg0.field2762] & 0x4) != 0 && arg0.field2768 < 0) {
            int var6 = this.field2751.field2725[arg0.field2762] / Statics.field1044;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2767) / var6;
                if (var7 > arg3) {
                    arg0.field2767 += arg3 * var6;
                    break;
                }
                arg0.field2754.method946(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2767 += var6 * var7 - 1048576;
                int var8 = Statics.field1044 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2754;
                if (this.field2751.field2709[arg0.field2762] == 0) {
                    arg0.field2754 = class58.method1071(arg0.field2755, var10.method1086(), var10.method1077(), var10.method1078());
                } else {
                    arg0.field2754 = class58.method1071(arg0.field2755, var10.method1086(), 0, var10.method1078());
                    this.field2751.method3047(arg0, arg0.field2764.field2681[arg0.field2758] < 0);
                    arg0.field2754.method1082(var8, var10.method1077());
                }
                if (arg0.field2764.field2681[arg0.field2758] < 0) {
                    arg0.field2754.method1073(-1);
                }
                var10.method1084(var8);
                var10.method946(arg1, arg2, arg4 - arg2);
                if (var10.method1088()) {
                    this.field2750.method936(var10);
                }
            }
        }
        arg0.field2754.method946(arg1, arg2, arg3);
    }

    @ObfuscatedName("fm.j(Lfo;II)V")
    public void method3147(class165 arg0, int arg1) {
        if ((this.field2751.field2720[arg0.field2762] & 0x4) != 0 && arg0.field2768 < 0) {
            int var3 = this.field2751.field2725[arg0.field2762] / Statics.field1044;
            int var4 = (var3 + 1048575 - arg0.field2767) / var3;
            arg0.field2767 = arg0.field2767 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2751.field2709[arg0.field2762] == 0) {
                    arg0.field2754 = class58.method1071(arg0.field2755, arg0.field2754.method1086(), arg0.field2754.method1077(), arg0.field2754.method1078());
                } else {
                    arg0.field2754 = class58.method1071(arg0.field2755, arg0.field2754.method1086(), 0, arg0.field2754.method1078());
                    this.field2751.method3047(arg0, arg0.field2764.field2681[arg0.field2758] < 0);
                }
                if (arg0.field2764.field2681[arg0.field2758] < 0) {
                    arg0.field2754.method1073(-1);
                }
                arg1 = arg0.field2767 / var3;
            }
        }
        arg0.field2754.method945(arg1);
    }
}
