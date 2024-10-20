package deob;

@ObfuscatedName("fv")
public class class164 extends class60 {

    @ObfuscatedName("fv.g")
    public class162 field2767;

    @ObfuscatedName("fv.v")
    public class177 field2763 = new class177();

    @ObfuscatedName("fv.z")
    public class49 field2764 = new class49();

    public class164(class162 arg0) {
        this.field2767 = arg0;
    }

    @ObfuscatedName("fv.l()Lbn;")
    public class60 method1004() {
        class165 var1 = (class165) this.field2763.method3237();
        if (var1 == null) {
            return null;
        } else if (var1.field2786 == null) {
            return this.method998();
        } else {
            return var1.field2786;
        }
    }

    @ObfuscatedName("fv.e()Lbn;")
    public class60 method998() {
        class165 var1;
        do {
            var1 = (class165) this.field2763.method3239();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2786 == null);
        return var1.field2786;
    }

    @ObfuscatedName("fv.j()I")
    public int method983() {
        return 0;
    }

    @ObfuscatedName("fv.n([III)V")
    public void method984(int[] arg0, int arg1, int arg2) {
        this.field2764.method984(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2763.method3237(); var4 != null; var4 = (class165) this.field2763.method3239()) {
            if (!this.field2767.method3064(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2777) {
                        this.method3144(var4, arg0, var5, var6, var5 + var6);
                        var4.field2777 -= var6;
                        break;
                    }
                    this.method3144(var4, arg0, var5, var4.field2777, var5 + var6);
                    var5 += var4.field2777;
                    var6 -= var4.field2777;
                } while (!this.field2767.method3065(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fv.a(I)V")
    public void method994(int arg0) {
        this.field2764.method994(arg0);
        for (class165 var2 = (class165) this.field2763.method3237(); var2 != null; var2 = (class165) this.field2763.method3239()) {
            if (!this.field2767.method3064(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2777) {
                        this.method3143(var2, var3);
                        var2.field2777 -= var3;
                        break;
                    }
                    this.method3143(var2, var2.field2777);
                    var3 -= var2.field2777;
                } while (!this.field2767.method3065(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fv.g(Lfo;[IIIIB)V")
    public void method3144(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2767.field2731[arg0.field2778] & 0x4) != 0 && arg0.field2782 < 0) {
            int var6 = this.field2767.field2736[arg0.field2778] / Statics.field1074;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2788) / var6;
                if (var7 > arg3) {
                    arg0.field2788 += arg3 * var6;
                    break;
                }
                arg0.field2786.method984(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2788 += var6 * var7 - 1048576;
                int var8 = Statics.field1074 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2786;
                if (this.field2767.field2725[arg0.field2778] == 0) {
                    arg0.field2786 = class58.method1123(arg0.field2780, var10.method1137(), var10.method1136(), var10.method1129());
                } else {
                    arg0.field2786 = class58.method1123(arg0.field2780, var10.method1137(), 0, var10.method1129());
                    this.field2767.method3047(arg0, arg0.field2776.field2690[arg0.field2773] < 0);
                    arg0.field2786.method1133(var8, var10.method1136());
                }
                if (arg0.field2776.field2690[arg0.field2773] < 0) {
                    arg0.field2786.method1154(-1);
                }
                var10.method1191(var8);
                var10.method984(arg1, arg2, arg4 - arg2);
                if (var10.method1138()) {
                    this.field2764.method993(var10);
                }
            }
        }
        arg0.field2786.method984(arg1, arg2, arg3);
    }

    @ObfuscatedName("fv.v(Lfo;IS)V")
    public void method3143(class165 arg0, int arg1) {
        if ((this.field2767.field2731[arg0.field2778] & 0x4) != 0 && arg0.field2782 < 0) {
            int var3 = this.field2767.field2736[arg0.field2778] / Statics.field1074;
            int var4 = (var3 + 1048575 - arg0.field2788) / var3;
            arg0.field2788 = arg0.field2788 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2767.field2725[arg0.field2778] == 0) {
                    arg0.field2786 = class58.method1123(arg0.field2780, arg0.field2786.method1137(), arg0.field2786.method1136(), arg0.field2786.method1129());
                } else {
                    arg0.field2786 = class58.method1123(arg0.field2780, arg0.field2786.method1137(), 0, arg0.field2786.method1129());
                    this.field2767.method3047(arg0, arg0.field2776.field2690[arg0.field2773] < 0);
                }
                if (arg0.field2776.field2690[arg0.field2773] < 0) {
                    arg0.field2786.method1154(-1);
                }
                arg1 = arg0.field2788 / var3;
            }
        }
        arg0.field2786.method994(arg1);
    }
}
