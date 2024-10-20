package deob;

@ObfuscatedName("fq")
public class class164 extends class60 {

    @ObfuscatedName("fq.k")
    public class162 field2767;

    @ObfuscatedName("fq.b")
    public class177 field2769 = new class177();

    @ObfuscatedName("fq.e")
    public class49 field2768 = new class49();

    public class164(class162 arg0) {
        this.field2767 = arg0;
    }

    @ObfuscatedName("fq.z()Lbh;")
    public class60 method948() {
        class165 var1 = (class165) this.field2769.method3228();
        if (var1 == null) {
            return null;
        } else if (var1.field2790 == null) {
            return this.method942();
        } else {
            return var1.field2790;
        }
    }

    @ObfuscatedName("fq.g()Lbh;")
    public class60 method942() {
        class165 var1;
        do {
            var1 = (class165) this.field2769.method3254();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2790 == null);
        return var1.field2790;
    }

    @ObfuscatedName("fq.c()I")
    public int method951() {
        return 0;
    }

    @ObfuscatedName("fq.o([III)V")
    public void method979(int[] arg0, int arg1, int arg2) {
        this.field2768.method979(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2769.method3228(); var4 != null; var4 = (class165) this.field2769.method3254()) {
            if (!this.field2767.method3056(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2784) {
                        this.method3137(var4, arg0, var5, var6, var5 + var6);
                        var4.field2784 -= var6;
                        break;
                    }
                    this.method3137(var4, arg0, var5, var4.field2784, var5 + var6);
                    var5 += var4.field2784;
                    var6 -= var4.field2784;
                } while (!this.field2767.method3057(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fq.w(I)V")
    public void method943(int arg0) {
        this.field2768.method943(arg0);
        for (class165 var2 = (class165) this.field2769.method3228(); var2 != null; var2 = (class165) this.field2769.method3254()) {
            if (!this.field2767.method3056(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2784) {
                        this.method3138(var2, var3);
                        var2.field2784 -= var3;
                        break;
                    }
                    this.method3138(var2, var2.field2784);
                    var3 -= var2.field2784;
                } while (!this.field2767.method3057(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fq.k(Lfd;[IIIIB)V")
    public void method3137(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2767.field2745[arg0.field2779] & 0x4) != 0 && arg0.field2777 < 0) {
            int var6 = this.field2767.field2737[arg0.field2779] / Statics.field1075;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2792) / var6;
                if (var7 > arg3) {
                    arg0.field2792 += arg3 * var6;
                    break;
                }
                arg0.field2790.method979(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2792 += var6 * var7 - 1048576;
                int var8 = Statics.field1075 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2790;
                if (this.field2767.field2736[arg0.field2779] == 0) {
                    arg0.field2790 = class58.method1101(arg0.field2774, var10.method1095(), var10.method1098(), var10.method1137());
                } else {
                    arg0.field2790 = class58.method1101(arg0.field2774, var10.method1095(), 0, var10.method1137());
                    this.field2767.method3041(arg0, arg0.field2773.field2693[arg0.field2772] < 0);
                    arg0.field2790.method1105(var8, var10.method1098());
                }
                if (arg0.field2773.field2693[arg0.field2772] < 0) {
                    arg0.field2790.method1097(-1);
                }
                var10.method1107(var8);
                var10.method979(arg1, arg2, arg4 - arg2);
                if (var10.method1208()) {
                    this.field2768.method958(var10);
                }
            }
        }
        arg0.field2790.method979(arg1, arg2, arg3);
    }

    @ObfuscatedName("fq.b(Lfd;II)V")
    public void method3138(class165 arg0, int arg1) {
        if ((this.field2767.field2745[arg0.field2779] & 0x4) != 0 && arg0.field2777 < 0) {
            int var3 = this.field2767.field2737[arg0.field2779] / Statics.field1075;
            int var4 = (var3 + 1048575 - arg0.field2792) / var3;
            arg0.field2792 = arg0.field2792 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2767.field2736[arg0.field2779] == 0) {
                    arg0.field2790 = class58.method1101(arg0.field2774, arg0.field2790.method1095(), arg0.field2790.method1098(), arg0.field2790.method1137());
                } else {
                    arg0.field2790 = class58.method1101(arg0.field2774, arg0.field2790.method1095(), 0, arg0.field2790.method1137());
                    this.field2767.method3041(arg0, arg0.field2773.field2693[arg0.field2772] < 0);
                }
                if (arg0.field2773.field2693[arg0.field2772] < 0) {
                    arg0.field2790.method1097(-1);
                }
                arg1 = arg0.field2792 / var3;
            }
        }
        arg0.field2790.method943(arg1);
    }
}
