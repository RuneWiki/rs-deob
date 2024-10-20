package deob;

@ObfuscatedName("fj")
public class class169 extends class61 {

    @ObfuscatedName("fj.v")
    public class167 field2793;

    @ObfuscatedName("fj.t")
    public class182 field2787 = new class182();

    @ObfuscatedName("fj.f")
    public class50 field2788 = new class50();

    public class169(class167 arg0) {
        this.field2793 = arg0;
    }

    @ObfuscatedName("fj.g()Lbc;")
    public class61 method958() {
        class170 var1 = (class170) this.field2787.method3303();
        if (var1 == null) {
            return null;
        } else if (var1.field2810 == null) {
            return this.method956();
        } else {
            return var1.field2810;
        }
    }

    @ObfuscatedName("fj.k()Lbc;")
    public class61 method956() {
        class170 var1;
        do {
            var1 = (class170) this.field2787.method3305();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2810 == null);
        return var1.field2810;
    }

    @ObfuscatedName("fj.p()I")
    public int method957() {
        return 0;
    }

    @ObfuscatedName("fj.y([III)V")
    public void method949(int[] arg0, int arg1, int arg2) {
        this.field2788.method949(arg0, arg1, arg2);
        for (class170 var4 = (class170) this.field2787.method3303(); var4 != null; var4 = (class170) this.field2787.method3305()) {
            if (!this.field2793.method3186(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2813) {
                        this.method3212(var4, arg0, var5, var6, var5 + var6);
                        var4.field2813 -= var6;
                        break;
                    }
                    this.method3212(var4, arg0, var5, var4.field2813, var5 + var6);
                    var5 += var4.field2813;
                    var6 -= var4.field2813;
                } while (!this.field2793.method3142(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fj.o(I)V")
    public void method960(int arg0) {
        this.field2788.method960(arg0);
        for (class170 var2 = (class170) this.field2787.method3303(); var2 != null; var2 = (class170) this.field2787.method3305()) {
            if (!this.field2793.method3186(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2813) {
                        this.method3210(var2, var3);
                        var2.field2813 -= var3;
                        break;
                    }
                    this.method3210(var2, var2.field2813);
                    var3 -= var2.field2813;
                } while (!this.field2793.method3142(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fj.v(Lfn;[IIIII)V")
    public void method3212(class170 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2793.field2756[arg0.field2809] & 0x4) != 0 && arg0.field2808 < 0) {
            int var6 = this.field2793.field2761[arg0.field2809] / Statics.field1819;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2814) / var6;
                if (var7 > arg3) {
                    arg0.field2814 += arg3 * var6;
                    break;
                }
                arg0.field2810.method949(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2814 += var6 * var7 - 1048576;
                int var8 = Statics.field1819 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2810;
                if (this.field2793.field2759[arg0.field2809] == 0) {
                    arg0.field2810 = class59.method1115(arg0.field2796, var10.method1130(), var10.method1121(), var10.method1122());
                } else {
                    arg0.field2810 = class59.method1115(arg0.field2796, var10.method1130(), 0, var10.method1122());
                    this.field2793.method3123(arg0, arg0.field2795.field2709[arg0.field2799] < 0);
                    arg0.field2810.method1126(var8, var10.method1121());
                }
                if (arg0.field2795.field2709[arg0.field2799] < 0) {
                    arg0.field2810.method1117(-1);
                }
                var10.method1201(var8);
                var10.method949(arg1, arg2, arg4 - arg2);
                if (var10.method1132()) {
                    this.field2788.method950(var10);
                }
            }
        }
        arg0.field2810.method949(arg1, arg2, arg3);
    }

    @ObfuscatedName("fj.t(Lfn;IB)V")
    public void method3210(class170 arg0, int arg1) {
        if ((this.field2793.field2756[arg0.field2809] & 0x4) != 0 && arg0.field2808 < 0) {
            int var3 = this.field2793.field2761[arg0.field2809] / Statics.field1819;
            int var4 = (var3 + 1048575 - arg0.field2814) / var3;
            arg0.field2814 = arg0.field2814 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2793.field2759[arg0.field2809] == 0) {
                    arg0.field2810 = class59.method1115(arg0.field2796, arg0.field2810.method1130(), arg0.field2810.method1121(), arg0.field2810.method1122());
                } else {
                    arg0.field2810 = class59.method1115(arg0.field2796, arg0.field2810.method1130(), 0, arg0.field2810.method1122());
                    this.field2793.method3123(arg0, arg0.field2795.field2709[arg0.field2799] < 0);
                }
                if (arg0.field2795.field2709[arg0.field2799] < 0) {
                    arg0.field2810.method1117(-1);
                }
                arg1 = arg0.field2814 / var3;
            }
        }
        arg0.field2810.method960(arg1);
    }
}
