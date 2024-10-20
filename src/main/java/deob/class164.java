package deob;

@ObfuscatedName("fg")
public class class164 extends class60 {

    @ObfuscatedName("fg.k")
    public class162 field2764;

    @ObfuscatedName("fg.r")
    public class177 field2765 = new class177();

    @ObfuscatedName("fg.y")
    public class49 field2766 = new class49();

    public class164(class162 arg0) {
        this.field2764 = arg0;
    }

    @ObfuscatedName("fg.j()Lbz;")
    public class60 method991() {
        class165 var1 = (class165) this.field2765.method3195();
        if (var1 == null) {
            return null;
        } else if (var1.field2786 == null) {
            return this.method969();
        } else {
            return var1.field2786;
        }
    }

    @ObfuscatedName("fg.g()Lbz;")
    public class60 method969() {
        class165 var1;
        do {
            var1 = (class165) this.field2765.method3212();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2786 == null);
        return var1.field2786;
    }

    @ObfuscatedName("fg.p()I")
    public int method974() {
        return 0;
    }

    @ObfuscatedName("fg.o([III)V")
    public void method1004(int[] arg0, int arg1, int arg2) {
        this.field2766.method1004(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2765.method3195(); var4 != null; var4 = (class165) this.field2765.method3212()) {
            if (!this.field2764.method3033(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2784) {
                        this.method3116(var4, arg0, var5, var6, var5 + var6);
                        var4.field2784 -= var6;
                        break;
                    }
                    this.method3116(var4, arg0, var5, var4.field2784, var5 + var6);
                    var5 += var4.field2784;
                    var6 -= var4.field2784;
                } while (!this.field2764.method3034(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fg.x(I)V")
    public void method976(int arg0) {
        this.field2766.method976(arg0);
        for (class165 var2 = (class165) this.field2765.method3195(); var2 != null; var2 = (class165) this.field2765.method3212()) {
            if (!this.field2764.method3033(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2784) {
                        this.method3117(var2, var3);
                        var2.field2784 -= var3;
                        break;
                    }
                    this.method3117(var2, var2.field2784);
                    var3 -= var2.field2784;
                } while (!this.field2764.method3034(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fg.k(Lfn;[IIIII)V")
    public void method3116(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2764.field2735[arg0.field2781] & 0x4) != 0 && arg0.field2782 < 0) {
            int var6 = this.field2764.field2741[arg0.field2781] / Statics.field1096;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2768) / var6;
                if (var7 > arg3) {
                    arg0.field2768 += arg3 * var6;
                    break;
                }
                arg0.field2786.method1004(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2768 += var6 * var7 - 1048576;
                int var8 = Statics.field1096 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2786;
                if (this.field2764.field2739[arg0.field2781] == 0) {
                    arg0.field2786 = class58.method1111(arg0.field2770, var10.method1126(), var10.method1117(), var10.method1187());
                } else {
                    arg0.field2786 = class58.method1111(arg0.field2770, var10.method1126(), 0, var10.method1187());
                    this.field2764.method3015(arg0, arg0.field2775.field2696[arg0.field2773] < 0);
                    arg0.field2786.method1122(var8, var10.method1117());
                }
                if (arg0.field2775.field2696[arg0.field2773] < 0) {
                    arg0.field2786.method1113(-1);
                }
                var10.method1124(var8);
                var10.method1004(arg1, arg2, arg4 - arg2);
                if (var10.method1253()) {
                    this.field2766.method967(var10);
                }
            }
        }
        arg0.field2786.method1004(arg1, arg2, arg3);
    }

    @ObfuscatedName("fg.r(Lfn;IB)V")
    public void method3117(class165 arg0, int arg1) {
        if ((this.field2764.field2735[arg0.field2781] & 0x4) != 0 && arg0.field2782 < 0) {
            int var3 = this.field2764.field2741[arg0.field2781] / Statics.field1096;
            int var4 = (var3 + 1048575 - arg0.field2768) / var3;
            arg0.field2768 = arg0.field2768 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2764.field2739[arg0.field2781] == 0) {
                    arg0.field2786 = class58.method1111(arg0.field2770, arg0.field2786.method1126(), arg0.field2786.method1117(), arg0.field2786.method1187());
                } else {
                    arg0.field2786 = class58.method1111(arg0.field2770, arg0.field2786.method1126(), 0, arg0.field2786.method1187());
                    this.field2764.method3015(arg0, arg0.field2775.field2696[arg0.field2773] < 0);
                }
                if (arg0.field2775.field2696[arg0.field2773] < 0) {
                    arg0.field2786.method1113(-1);
                }
                arg1 = arg0.field2768 / var3;
            }
        }
        arg0.field2786.method976(arg1);
    }
}
