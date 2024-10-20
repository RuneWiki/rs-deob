package deob;

@ObfuscatedName("fw")
public class class177 extends class62 {

    @ObfuscatedName("fw.t")
    public class175 field2895;

    @ObfuscatedName("fw.b")
    public class190 field2896 = new class190();

    @ObfuscatedName("fw.p")
    public class51 field2897 = new class51();

    public class177(class175 arg0) {
        this.field2895 = arg0;
    }

    @ObfuscatedName("fw.o()Lbw;")
    public class62 method1038() {
        class178 var1 = (class178) this.field2896.method3415();
        if (var1 == null) {
            return null;
        } else if (var1.field2920 == null) {
            return this.method1047();
        } else {
            return var1.field2920;
        }
    }

    @ObfuscatedName("fw.f()Lbw;")
    public class62 method1047() {
        class178 var1;
        do {
            var1 = (class178) this.field2896.method3419();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2920 == null);
        return var1.field2920;
    }

    @ObfuscatedName("fw.d()I")
    public int method1040() {
        return 0;
    }

    @ObfuscatedName("fw.j([III)V")
    public void method1041(int[] arg0, int arg1, int arg2) {
        this.field2897.method1041(arg0, arg1, arg2);
        for (class178 var4 = (class178) this.field2896.method3415(); var4 != null; var4 = (class178) this.field2896.method3419()) {
            if (!this.field2895.method3241(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2921) {
                        this.method3323(var4, arg0, var5, var6, var5 + var6);
                        var4.field2921 -= var6;
                        break;
                    }
                    this.method3323(var4, arg0, var5, var4.field2921, var5 + var6);
                    var5 += var4.field2921;
                    var6 -= var4.field2921;
                } while (!this.field2895.method3256(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fw.v(I)V")
    public void method1043(int arg0) {
        this.field2897.method1043(arg0);
        for (class178 var2 = (class178) this.field2896.method3415(); var2 != null; var2 = (class178) this.field2896.method3419()) {
            if (!this.field2895.method3241(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2921) {
                        this.method3322(var2, var3);
                        var2.field2921 -= var3;
                        break;
                    }
                    this.method3322(var2, var2.field2921);
                    var3 -= var2.field2921;
                } while (!this.field2895.method3256(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fw.t(Lfd;[IIIII)V")
    public void method3323(class178 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2895.field2866[arg0.field2907] & 0x4) != 0 && arg0.field2924 < 0) {
            int var6 = this.field2895.field2871[arg0.field2907] / Statics.field1106;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2923) / var6;
                if (var7 > arg3) {
                    arg0.field2923 += arg3 * var6;
                    break;
                }
                arg0.field2920.method1041(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2923 += var6 * var7 - 1048576;
                int var8 = Statics.field1106 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class60 var10 = arg0.field2920;
                if (this.field2895.field2869[arg0.field2907] == 0) {
                    arg0.field2920 = class60.method1260(arg0.field2904, var10.method1183(), var10.method1193(), var10.method1194());
                } else {
                    arg0.field2920 = class60.method1260(arg0.field2904, var10.method1183(), 0, var10.method1194());
                    this.field2895.method3270(arg0, arg0.field2903.field2819[arg0.field2922] < 0);
                    arg0.field2920.method1198(var8, var10.method1193());
                }
                if (arg0.field2903.field2819[arg0.field2922] < 0) {
                    arg0.field2920.method1189(-1);
                }
                var10.method1205(var8);
                var10.method1041(arg1, arg2, arg4 - arg2);
                if (var10.method1204()) {
                    this.field2897.method1078(var10);
                }
            }
        }
        arg0.field2920.method1041(arg1, arg2, arg3);
    }

    @ObfuscatedName("fw.b(Lfd;II)V")
    public void method3322(class178 arg0, int arg1) {
        if ((this.field2895.field2866[arg0.field2907] & 0x4) != 0 && arg0.field2924 < 0) {
            int var3 = this.field2895.field2871[arg0.field2907] / Statics.field1106;
            int var4 = (var3 + 1048575 - arg0.field2923) / var3;
            arg0.field2923 = arg0.field2923 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2895.field2869[arg0.field2907] == 0) {
                    arg0.field2920 = class60.method1260(arg0.field2904, arg0.field2920.method1183(), arg0.field2920.method1193(), arg0.field2920.method1194());
                } else {
                    arg0.field2920 = class60.method1260(arg0.field2904, arg0.field2920.method1183(), 0, arg0.field2920.method1194());
                    this.field2895.method3270(arg0, arg0.field2903.field2819[arg0.field2922] < 0);
                }
                if (arg0.field2903.field2819[arg0.field2922] < 0) {
                    arg0.field2920.method1189(-1);
                }
                arg1 = arg0.field2923 / var3;
            }
        }
        arg0.field2920.method1043(arg1);
    }
}
