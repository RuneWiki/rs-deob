package deob;

@ObfuscatedName("fl")
public class class164 extends class60 {

    @ObfuscatedName("fl.e")
    public class162 field2755;

    @ObfuscatedName("fl.o")
    public class177 field2758 = new class177();

    @ObfuscatedName("fl.y")
    public class49 field2757 = new class49();

    public class164(class162 arg0) {
        this.field2755 = arg0;
    }

    @ObfuscatedName("fl.r()Lbc;")
    public class60 method942() {
        class165 var1 = (class165) this.field2758.method3122();
        if (var1 == null) {
            return null;
        } else if (var1.field2784 == null) {
            return this.method933();
        } else {
            return var1.field2784;
        }
    }

    @ObfuscatedName("fl.l()Lbc;")
    public class60 method933() {
        class165 var1;
        do {
            var1 = (class165) this.field2758.method3124();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2784 == null);
        return var1.field2784;
    }

    @ObfuscatedName("fl.s()I")
    public int method930() {
        return 0;
    }

    @ObfuscatedName("fl.f([III)V")
    public void method931(int[] arg0, int arg1, int arg2) {
        this.field2757.method931(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2758.method3122(); var4 != null; var4 = (class165) this.field2758.method3124()) {
            if (!this.field2755.method3004(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2765) {
                        this.method3040(var4, arg0, var5, var6, var5 + var6);
                        var4.field2765 -= var6;
                        break;
                    }
                    this.method3040(var4, arg0, var5, var4.field2765, var5 + var6);
                    var5 += var4.field2765;
                    var6 -= var4.field2765;
                } while (!this.field2755.method2966(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fl.h(I)V")
    public void method959(int arg0) {
        this.field2757.method959(arg0);
        for (class165 var2 = (class165) this.field2758.method3122(); var2 != null; var2 = (class165) this.field2758.method3124()) {
            if (!this.field2755.method3004(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2765) {
                        this.method3049(var2, var3);
                        var2.field2765 -= var3;
                        break;
                    }
                    this.method3049(var2, var2.field2765);
                    var3 -= var2.field2765;
                } while (!this.field2755.method2966(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fl.e(Lfb;[IIIII)V")
    public void method3040(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2755.field2724[arg0.field2778] & 0x4) != 0 && arg0.field2780 < 0) {
            int var6 = this.field2755.field2720[arg0.field2778] / Statics.field1095;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2781) / var6;
                if (var7 > arg3) {
                    arg0.field2781 += arg3 * var6;
                    break;
                }
                arg0.field2784.method931(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2781 += var6 * var7 - 1048576;
                int var8 = Statics.field1095 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2784;
                if (this.field2755.field2727[arg0.field2778] == 0) {
                    arg0.field2784 = class58.method1083(arg0.field2779, var10.method1179(), var10.method1078(), var10.method1217());
                } else {
                    arg0.field2784 = class58.method1083(arg0.field2779, var10.method1179(), 0, var10.method1217());
                    this.field2755.method2948(arg0, arg0.field2762.field2675[arg0.field2766] < 0);
                    arg0.field2784.method1090(var8, var10.method1078());
                }
                if (arg0.field2762.field2675[arg0.field2766] < 0) {
                    arg0.field2784.method1085(-1);
                }
                var10.method1095(var8);
                var10.method931(arg1, arg2, arg4 - arg2);
                if (var10.method1135()) {
                    this.field2757.method923(var10);
                }
            }
        }
        arg0.field2784.method931(arg1, arg2, arg3);
    }

    @ObfuscatedName("fl.o(Lfb;II)V")
    public void method3049(class165 arg0, int arg1) {
        if ((this.field2755.field2724[arg0.field2778] & 0x4) != 0 && arg0.field2780 < 0) {
            int var3 = this.field2755.field2720[arg0.field2778] / Statics.field1095;
            int var4 = (var3 + 1048575 - arg0.field2781) / var3;
            arg0.field2781 = arg0.field2781 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2755.field2727[arg0.field2778] == 0) {
                    arg0.field2784 = class58.method1083(arg0.field2779, arg0.field2784.method1179(), arg0.field2784.method1078(), arg0.field2784.method1217());
                } else {
                    arg0.field2784 = class58.method1083(arg0.field2779, arg0.field2784.method1179(), 0, arg0.field2784.method1217());
                    this.field2755.method2948(arg0, arg0.field2762.field2675[arg0.field2766] < 0);
                }
                if (arg0.field2762.field2675[arg0.field2766] < 0) {
                    arg0.field2784.method1085(-1);
                }
                arg1 = arg0.field2781 / var3;
            }
        }
        arg0.field2784.method959(arg1);
    }
}
