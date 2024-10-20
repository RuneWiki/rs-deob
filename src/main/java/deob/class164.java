package deob;

@ObfuscatedName("fx")
public class class164 extends class60 {

    @ObfuscatedName("fx.j")
    public class162 field2765;

    @ObfuscatedName("fx.z")
    public class177 field2763 = new class177();

    @ObfuscatedName("fx.y")
    public class49 field2762 = new class49();

    public class164(class162 arg0) {
        this.field2765 = arg0;
    }

    @ObfuscatedName("fx.e()Lbf;")
    public class60 method935() {
        class165 var1 = (class165) this.field2763.method3236();
        if (var1 == null) {
            return null;
        } else if (var1.field2786 == null) {
            return this.method954();
        } else {
            return var1.field2786;
        }
    }

    @ObfuscatedName("fx.k()Lbf;")
    public class60 method954() {
        class165 var1;
        do {
            var1 = (class165) this.field2763.method3243();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2786 == null);
        return var1.field2786;
    }

    @ObfuscatedName("fx.b()I")
    public int method937() {
        return 0;
    }

    @ObfuscatedName("fx.n([III)V")
    public void method938(int[] arg0, int arg1, int arg2) {
        this.field2762.method938(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2763.method3236(); var4 != null; var4 = (class165) this.field2763.method3243()) {
            if (!this.field2765.method3077(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2787) {
                        this.method3150(var4, arg0, var5, var6, var5 + var6);
                        var4.field2787 -= var6;
                        break;
                    }
                    this.method3150(var4, arg0, var5, var4.field2787, var5 + var6);
                    var5 += var4.field2787;
                    var6 -= var4.field2787;
                } while (!this.field2765.method3078(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fx.q(I)V")
    public void method940(int arg0) {
        this.field2762.method940(arg0);
        for (class165 var2 = (class165) this.field2763.method3236(); var2 != null; var2 = (class165) this.field2763.method3243()) {
            if (!this.field2765.method3077(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2787) {
                        this.method3149(var2, var3);
                        var2.field2787 -= var3;
                        break;
                    }
                    this.method3149(var2, var2.field2787);
                    var3 -= var2.field2787;
                } while (!this.field2765.method3078(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fx.j(Lfb;[IIIII)V")
    public void method3150(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2765.field2733[arg0.field2785] & 0x4) != 0 && arg0.field2782 < 0) {
            int var6 = this.field2765.field2740[arg0.field2785] / Statics.field1090;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2788) / var6;
                if (var7 > arg3) {
                    arg0.field2788 += arg3 * var6;
                    break;
                }
                arg0.field2786.method938(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2788 += var6 * var7 - 1048576;
                int var8 = Statics.field1090 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2786;
                if (this.field2765.field2739[arg0.field2785] == 0) {
                    arg0.field2786 = class58.method1089(arg0.field2769, var10.method1104(), var10.method1095(), var10.method1214());
                } else {
                    arg0.field2786 = class58.method1089(arg0.field2769, var10.method1104(), 0, var10.method1214());
                    this.field2765.method3082(arg0, arg0.field2779.field2688[arg0.field2773] < 0);
                    arg0.field2786.method1100(var8, var10.method1095());
                }
                if (arg0.field2779.field2688[arg0.field2773] < 0) {
                    arg0.field2786.method1091(-1);
                }
                var10.method1140(var8);
                var10.method938(arg1, arg2, arg4 - arg2);
                if (var10.method1127()) {
                    this.field2762.method957(var10);
                }
            }
        }
        arg0.field2786.method938(arg1, arg2, arg3);
    }

    @ObfuscatedName("fx.z(Lfb;II)V")
    public void method3149(class165 arg0, int arg1) {
        if ((this.field2765.field2733[arg0.field2785] & 0x4) != 0 && arg0.field2782 < 0) {
            int var3 = this.field2765.field2740[arg0.field2785] / Statics.field1090;
            int var4 = (var3 + 1048575 - arg0.field2788) / var3;
            arg0.field2788 = arg0.field2788 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2765.field2739[arg0.field2785] == 0) {
                    arg0.field2786 = class58.method1089(arg0.field2769, arg0.field2786.method1104(), arg0.field2786.method1095(), arg0.field2786.method1214());
                } else {
                    arg0.field2786 = class58.method1089(arg0.field2769, arg0.field2786.method1104(), 0, arg0.field2786.method1214());
                    this.field2765.method3082(arg0, arg0.field2779.field2688[arg0.field2773] < 0);
                }
                if (arg0.field2779.field2688[arg0.field2773] < 0) {
                    arg0.field2786.method1091(-1);
                }
                arg1 = arg0.field2788 / var3;
            }
        }
        arg0.field2786.method940(arg1);
    }
}
