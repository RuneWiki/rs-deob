package deob;

@ObfuscatedName("fn")
public class class165 extends class60 {

    @ObfuscatedName("fn.n")
    public class163 field2773;

    @ObfuscatedName("fn.x")
    public class178 field2774 = new class178();

    @ObfuscatedName("fn.k")
    public class49 field2775 = new class49();

    public class165(class163 arg0) {
        this.field2773 = arg0;
    }

    @ObfuscatedName("fn.q()Lbn;")
    public class60 method961() {
        class166 var1 = (class166) this.field2774.method3179();
        if (var1 == null) {
            return null;
        } else if (var1.field2799 == null) {
            return this.method962();
        } else {
            return var1.field2799;
        }
    }

    @ObfuscatedName("fn.m()Lbn;")
    public class60 method962() {
        class166 var1;
        do {
            var1 = (class166) this.field2774.method3199();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2799 == null);
        return var1.field2799;
    }

    @ObfuscatedName("fn.a()I")
    public int method967() {
        return 0;
    }

    @ObfuscatedName("fn.w([III)V")
    public void method963(int[] arg0, int arg1, int arg2) {
        this.field2775.method963(arg0, arg1, arg2);
        for (class166 var4 = (class166) this.field2774.method3179(); var4 != null; var4 = (class166) this.field2774.method3199()) {
            if (!this.field2773.method3019(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2800) {
                        this.method3099(var4, arg0, var5, var6, var5 + var6);
                        var4.field2800 -= var6;
                        break;
                    }
                    this.method3099(var4, arg0, var5, var4.field2800, var5 + var6);
                    var5 += var4.field2800;
                    var6 -= var4.field2800;
                } while (!this.field2773.method3018(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fn.o(I)V")
    public void method966(int arg0) {
        this.field2775.method966(arg0);
        for (class166 var2 = (class166) this.field2774.method3179(); var2 != null; var2 = (class166) this.field2774.method3199()) {
            if (!this.field2773.method3019(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2800) {
                        this.method3098(var2, var3);
                        var2.field2800 -= var3;
                        break;
                    }
                    this.method3098(var2, var2.field2800);
                    var3 -= var2.field2800;
                } while (!this.field2773.method3018(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fn.n(Lff;[IIIII)V")
    public void method3099(class166 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2773.field2740[arg0.field2803] & 0x4) != 0 && arg0.field2795 < 0) {
            int var6 = this.field2773.field2745[arg0.field2803] / Statics.field1082;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2801) / var6;
                if (var7 > arg3) {
                    arg0.field2801 += arg3 * var6;
                    break;
                }
                arg0.field2799.method963(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2801 += var6 * var7 - 1048576;
                int var8 = Statics.field1082 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2799;
                if (this.field2773.field2744[arg0.field2803] == 0) {
                    arg0.field2799 = class58.method1115(arg0.field2783, var10.method1136(), var10.method1121(), var10.method1134());
                } else {
                    arg0.field2799 = class58.method1115(arg0.field2783, var10.method1136(), 0, var10.method1134());
                    this.field2773.method3000(arg0, arg0.field2782.field2694[arg0.field2792] < 0);
                    arg0.field2799.method1202(var8, var10.method1121());
                }
                if (arg0.field2782.field2694[arg0.field2792] < 0) {
                    arg0.field2799.method1117(-1);
                }
                var10.method1128(var8);
                var10.method963(arg1, arg2, arg4 - arg2);
                if (var10.method1132()) {
                    this.field2775.method956(var10);
                }
            }
        }
        arg0.field2799.method963(arg1, arg2, arg3);
    }

    @ObfuscatedName("fn.x(Lff;II)V")
    public void method3098(class166 arg0, int arg1) {
        if ((this.field2773.field2740[arg0.field2803] & 0x4) != 0 && arg0.field2795 < 0) {
            int var3 = this.field2773.field2745[arg0.field2803] / Statics.field1082;
            int var4 = (var3 + 1048575 - arg0.field2801) / var3;
            arg0.field2801 = arg0.field2801 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2773.field2744[arg0.field2803] == 0) {
                    arg0.field2799 = class58.method1115(arg0.field2783, arg0.field2799.method1136(), arg0.field2799.method1121(), arg0.field2799.method1134());
                } else {
                    arg0.field2799 = class58.method1115(arg0.field2783, arg0.field2799.method1136(), 0, arg0.field2799.method1134());
                    this.field2773.method3000(arg0, arg0.field2782.field2694[arg0.field2792] < 0);
                }
                if (arg0.field2782.field2694[arg0.field2792] < 0) {
                    arg0.field2799.method1117(-1);
                }
                arg1 = arg0.field2801 / var3;
            }
        }
        arg0.field2799.method966(arg1);
    }
}
