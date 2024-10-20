package deob;

@ObfuscatedName("fb")
public class class164 extends class60 {

    @ObfuscatedName("fb.b")
    public class162 field2757;

    @ObfuscatedName("fb.u")
    public class177 field2758 = new class177();

    @ObfuscatedName("fb.x")
    public class49 field2756 = new class49();

    public class164(class162 arg0) {
        this.field2757 = arg0;
    }

    @ObfuscatedName("fb.n()Lbl;")
    public class60 method952() {
        class165 var1 = (class165) this.field2758.method3185();
        if (var1 == null) {
            return null;
        } else if (var1.field2775 == null) {
            return this.method942();
        } else {
            return var1.field2775;
        }
    }

    @ObfuscatedName("fb.y()Lbl;")
    public class60 method942() {
        class165 var1;
        do {
            var1 = (class165) this.field2758.method3187();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2775 == null);
        return var1.field2775;
    }

    @ObfuscatedName("fb.f()I")
    public int method943() {
        return 0;
    }

    @ObfuscatedName("fb.p([III)V")
    public void method944(int[] arg0, int arg1, int arg2) {
        this.field2756.method944(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2758.method3185(); var4 != null; var4 = (class165) this.field2758.method3187()) {
            if (!this.field2757.method3026(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2781) {
                        this.method3095(var4, arg0, var5, var6, var5 + var6);
                        var4.field2781 -= var6;
                        break;
                    }
                    this.method3095(var4, arg0, var5, var4.field2781, var5 + var6);
                    var5 += var4.field2781;
                    var6 -= var4.field2781;
                } while (!this.field2757.method3027(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fb.k(I)V")
    public void method969(int arg0) {
        this.field2756.method969(arg0);
        for (class165 var2 = (class165) this.field2758.method3185(); var2 != null; var2 = (class165) this.field2758.method3187()) {
            if (!this.field2757.method3026(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2781) {
                        this.method3094(var2, var3);
                        var2.field2781 -= var3;
                        break;
                    }
                    this.method3094(var2, var2.field2781);
                    var3 -= var2.field2781;
                } while (!this.field2757.method3027(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fb.b(Lfu;[IIIII)V")
    public void method3095(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2757.field2725[arg0.field2780] & 0x4) != 0 && arg0.field2776 < 0) {
            int var6 = this.field2757.field2730[arg0.field2780] / Statics.field1087;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2779) / var6;
                if (var7 > arg3) {
                    arg0.field2779 += arg3 * var6;
                    break;
                }
                arg0.field2775.method944(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2779 += var6 * var7 - 1048576;
                int var8 = Statics.field1087 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2775;
                if (this.field2757.field2719[arg0.field2780] == 0) {
                    arg0.field2775 = class58.method1091(arg0.field2765, var10.method1104(), var10.method1097(), var10.method1098());
                } else {
                    arg0.field2775 = class58.method1091(arg0.field2765, var10.method1104(), 0, var10.method1098());
                    this.field2757.method3009(arg0, arg0.field2763.field2684[arg0.field2770] < 0);
                    arg0.field2775.method1090(var8, var10.method1097());
                }
                if (arg0.field2763.field2684[arg0.field2770] < 0) {
                    arg0.field2775.method1197(-1);
                }
                var10.method1111(var8);
                var10.method944(arg1, arg2, arg4 - arg2);
                if (var10.method1106()) {
                    this.field2756.method978(var10);
                }
            }
        }
        arg0.field2775.method944(arg1, arg2, arg3);
    }

    @ObfuscatedName("fb.u(Lfu;II)V")
    public void method3094(class165 arg0, int arg1) {
        if ((this.field2757.field2725[arg0.field2780] & 0x4) != 0 && arg0.field2776 < 0) {
            int var3 = this.field2757.field2730[arg0.field2780] / Statics.field1087;
            int var4 = (var3 + 1048575 - arg0.field2779) / var3;
            arg0.field2779 = arg0.field2779 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2757.field2719[arg0.field2780] == 0) {
                    arg0.field2775 = class58.method1091(arg0.field2765, arg0.field2775.method1104(), arg0.field2775.method1097(), arg0.field2775.method1098());
                } else {
                    arg0.field2775 = class58.method1091(arg0.field2765, arg0.field2775.method1104(), 0, arg0.field2775.method1098());
                    this.field2757.method3009(arg0, arg0.field2763.field2684[arg0.field2770] < 0);
                }
                if (arg0.field2763.field2684[arg0.field2770] < 0) {
                    arg0.field2775.method1197(-1);
                }
                arg1 = arg0.field2779 / var3;
            }
        }
        arg0.field2775.method969(arg1);
    }
}
