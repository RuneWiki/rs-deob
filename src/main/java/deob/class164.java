package deob;

@ObfuscatedName("fo")
public class class164 extends class60 {

    @ObfuscatedName("fo.t")
    public class162 field2756;

    @ObfuscatedName("fo.o")
    public class177 field2753 = new class177();

    @ObfuscatedName("fo.i")
    public class49 field2752 = new class49();

    public class164(class162 arg0) {
        this.field2756 = arg0;
    }

    @ObfuscatedName("fo.y()Lbq;")
    public class60 method940() {
        class165 var1 = (class165) this.field2753.method3170();
        if (var1 == null) {
            return null;
        } else if (var1.field2781 == null) {
            return this.method944();
        } else {
            return var1.field2781;
        }
    }

    @ObfuscatedName("fo.g()Lbq;")
    public class60 method944() {
        class165 var1;
        do {
            var1 = (class165) this.field2753.method3172();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2781 == null);
        return var1.field2781;
    }

    @ObfuscatedName("fo.l()I")
    public int method942() {
        return 0;
    }

    @ObfuscatedName("fo.h([III)V")
    public void method943(int[] arg0, int arg1, int arg2) {
        this.field2752.method943(arg0, arg1, arg2);
        for (class165 var4 = (class165) this.field2753.method3170(); var4 != null; var4 = (class165) this.field2753.method3172()) {
            if (!this.field2756.method3044(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2777) {
                        this.method3082(var4, arg0, var5, var6, var5 + var6);
                        var4.field2777 -= var6;
                        break;
                    }
                    this.method3082(var4, arg0, var5, var4.field2777, var5 + var6);
                    var5 += var4.field2777;
                    var6 -= var4.field2777;
                } while (!this.field2756.method3014(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fo.w(I)V")
    public void method945(int arg0) {
        this.field2752.method945(arg0);
        for (class165 var2 = (class165) this.field2753.method3170(); var2 != null; var2 = (class165) this.field2753.method3172()) {
            if (!this.field2756.method3044(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2777) {
                        this.method3083(var2, var3);
                        var2.field2777 -= var3;
                        break;
                    }
                    this.method3083(var2, var2.field2777);
                    var3 -= var2.field2777;
                } while (!this.field2756.method3014(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fo.t(Lfh;[IIIII)V")
    public void method3082(class165 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2756.field2715[arg0.field2764] & 0x4) != 0 && arg0.field2780 < 0) {
            int var6 = this.field2756.field2729[arg0.field2764] / Statics.field1088;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2778) / var6;
                if (var7 > arg3) {
                    arg0.field2778 += arg3 * var6;
                    break;
                }
                arg0.field2781.method943(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2778 += var6 * var7 - 1048576;
                int var8 = Statics.field1088 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2781;
                if (this.field2756.field2740[arg0.field2764] == 0) {
                    arg0.field2781 = class58.method1079(arg0.field2760, var10.method1093(), var10.method1084(), var10.method1122());
                } else {
                    arg0.field2781 = class58.method1079(arg0.field2760, var10.method1093(), 0, var10.method1122());
                    this.field2756.method2992(arg0, arg0.field2759.field2677[arg0.field2763] < 0);
                    arg0.field2781.method1089(var8, var10.method1084());
                }
                if (arg0.field2759.field2677[arg0.field2763] < 0) {
                    arg0.field2781.method1206(-1);
                }
                var10.method1091(var8);
                var10.method943(arg1, arg2, arg4 - arg2);
                if (var10.method1095()) {
                    this.field2752.method935(var10);
                }
            }
        }
        arg0.field2781.method943(arg1, arg2, arg3);
    }

    @ObfuscatedName("fo.o(Lfh;IB)V")
    public void method3083(class165 arg0, int arg1) {
        if ((this.field2756.field2715[arg0.field2764] & 0x4) != 0 && arg0.field2780 < 0) {
            int var3 = this.field2756.field2729[arg0.field2764] / Statics.field1088;
            int var4 = (var3 + 1048575 - arg0.field2778) / var3;
            arg0.field2778 = arg0.field2778 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2756.field2740[arg0.field2764] == 0) {
                    arg0.field2781 = class58.method1079(arg0.field2760, arg0.field2781.method1093(), arg0.field2781.method1084(), arg0.field2781.method1122());
                } else {
                    arg0.field2781 = class58.method1079(arg0.field2760, arg0.field2781.method1093(), 0, arg0.field2781.method1122());
                    this.field2756.method2992(arg0, arg0.field2759.field2677[arg0.field2763] < 0);
                }
                if (arg0.field2759.field2677[arg0.field2763] < 0) {
                    arg0.field2781.method1206(-1);
                }
                arg1 = arg0.field2778 / var3;
            }
        }
        arg0.field2781.method945(arg1);
    }
}
