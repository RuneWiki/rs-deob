package deob;

@ObfuscatedName("fp")
public class class164 extends class60 {

    @ObfuscatedName("fp.e")
    public class162 field2759;

    @ObfuscatedName("fp.v")
    public class177 field2753 = new class177();

    @ObfuscatedName("fp.i")
    public class49 field2755 = new class49();

    public class164(class162 arg0) {
        this.field2759 = arg0;
    }

    @ObfuscatedName("fp.b()Lbl;")
    public class60 method962() {
        class165 var1 = (class165) this.field2753.method3210();
        if (var1 == null) {
            return null;
        } else if (var1.field2762 == null) {
            return this.method932();
        } else {
            return var1.field2762;
        }
    }

    @ObfuscatedName("fp.q()Lbl;")
    public class60 method932() {
        class165 var1;
        do {
            var1 = (class165) this.field2753.method3182();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2762 == null);
        return var1.field2762;
    }

    @ObfuscatedName("fp.l()I")
    public int method933() {
        return 0;
    }

    @ObfuscatedName("fp.m([III)V")
    public void method934(int[] arg0, int arg1, int arg2) {
        this.field2755.method934(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2753.method3210(); var4 != null; var4 = (class165) this.field2753.method3182()) {
            if (!this.field2759.method3030(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2771) {
                        this.method3109(var4, arg0, var5, var6, var5 + var6);
                        var4.field2771 -= var6;
                        break;
                    }
                    this.method3109(var4, arg0, var5, var4.field2771, var5 + var6);
                    var5 += var4.field2771;
                    var6 -= var4.field2771;
                } while (!this.field2759.method3031(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fp.s(I)V")
    public void method936(int arg0) {
        this.field2755.method936(arg0);
        for (class165 var2 = (class165) this.field2753.method3210(); var2 != null; var2 = (class165) this.field2753.method3182()) {
            if (!this.field2759.method3030(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2771) {
                        this.method3108(var2, var3);
                        var2.field2771 -= var3;
                        break;
                    }
                    this.method3108(var2, var2.field2771);
                    var3 -= var2.field2771;
                } while (!this.field2759.method3031(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fp.e(Lfu;[IIIII)V")
    public void method3109(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2759.field2725[arg0.field2760] & 0x4) != 0 && arg0.field2780 < 0) {
            int var6 = this.field2759.field2730[arg0.field2760] / Statics.field1077;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2779) / var6;
                if (var7 > arg3) {
                    arg0.field2779 += arg3 * var6;
                    break;
                }
                arg0.field2762.method934(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2779 += var6 * var7 - 1048576;
                int var8 = Statics.field1077 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2762;
                if (this.field2759.field2728[arg0.field2760] == 0) {
                    arg0.field2762 = class58.method1091(arg0.field2777, var10.method1128(), var10.method1097(), var10.method1110());
                } else {
                    arg0.field2762 = class58.method1091(arg0.field2777, var10.method1128(), 0, var10.method1110());
                    this.field2759.method3050(arg0, arg0.field2778.field2682[arg0.field2765] < 0);
                    arg0.field2762.method1101(var8, var10.method1097());
                }
                if (arg0.field2778.field2682[arg0.field2765] < 0) {
                    arg0.field2762.method1093(-1);
                }
                var10.method1219(var8);
                var10.method934(arg1, arg2, arg4 - arg2);
                if (var10.method1106()) {
                    this.field2755.method947(var10);
                }
            }
        }
        arg0.field2762.method934(arg1, arg2, arg3);
    }

    @ObfuscatedName("fp.v(Lfu;II)V")
    public void method3108(class165 arg0, int arg1) {
        if ((this.field2759.field2725[arg0.field2760] & 0x4) != 0 && arg0.field2780 < 0) {
            int var3 = this.field2759.field2730[arg0.field2760] / Statics.field1077;
            int var4 = (var3 + 1048575 - arg0.field2779) / var3;
            arg0.field2779 = arg0.field2779 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2759.field2728[arg0.field2760] == 0) {
                    arg0.field2762 = class58.method1091(arg0.field2777, arg0.field2762.method1128(), arg0.field2762.method1097(), arg0.field2762.method1110());
                } else {
                    arg0.field2762 = class58.method1091(arg0.field2777, arg0.field2762.method1128(), 0, arg0.field2762.method1110());
                    this.field2759.method3050(arg0, arg0.field2778.field2682[arg0.field2765] < 0);
                }
                if (arg0.field2778.field2682[arg0.field2765] < 0) {
                    arg0.field2762.method1093(-1);
                }
                arg1 = arg0.field2779 / var3;
            }
        }
        arg0.field2762.method936(arg1);
    }
}
