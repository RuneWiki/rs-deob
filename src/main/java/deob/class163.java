package deob;

@ObfuscatedName("fs")
public class class163 extends class60 {

    @ObfuscatedName("fs.y")
    public class161 field2732;

    @ObfuscatedName("fs.u")
    public class176 field2729 = new class176();

    @ObfuscatedName("fs.k")
    public class49 field2730 = new class49();

    public class163(class161 arg0) {
        this.field2732 = arg0;
    }

    @ObfuscatedName("fs.g()Lba;")
    public class60 method948() {
        class164 var1 = (class164) this.field2729.method3234();
        if (var1 == null) {
            return null;
        } else if (var1.field2734 == null) {
            return this.method949();
        } else {
            return var1.field2734;
        }
    }

    @ObfuscatedName("fs.a()Lba;")
    public class60 method949() {
        class164 var1;
        do {
            var1 = (class164) this.field2729.method3209();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2734 == null);
        return var1.field2734;
    }

    @ObfuscatedName("fs.x()I")
    public int method965() {
        return 0;
    }

    @ObfuscatedName("fs.r([III)V")
    public void method951(int[] arg0, int arg1, int arg2) {
        this.field2730.method951(arg0, arg1, arg2);
        for (class164 var4 = (class164) this.field2729.method3234(); var4 != null; var4 = (class164) this.field2729.method3209()) {
            if (!this.field2732.method3104(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2752) {
                        this.method3119(var4, arg0, var5, var6, var5 + var6);
                        var4.field2752 -= var6;
                        break;
                    }
                    this.method3119(var4, arg0, var5, var4.field2752, var5 + var6);
                    var5 += var4.field2752;
                    var6 -= var4.field2752;
                } while (!this.field2732.method3043(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fs.c(I)V")
    public void method953(int arg0) {
        this.field2730.method953(arg0);
        for (class164 var2 = (class164) this.field2729.method3234(); var2 != null; var2 = (class164) this.field2729.method3209()) {
            if (!this.field2732.method3104(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2752) {
                        this.method3120(var2, var3);
                        var2.field2752 -= var3;
                        break;
                    }
                    this.method3120(var2, var2.field2752);
                    var3 -= var2.field2752;
                } while (!this.field2732.method3043(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fs.y(Lfd;[IIIII)V")
    public void method3119(class164 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2732.field2701[arg0.field2748] & 0x4) != 0 && arg0.field2747 < 0) {
            int var6 = this.field2732.field2704[arg0.field2748] / Statics.field1069;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2753) / var6;
                if (var7 > arg3) {
                    arg0.field2753 += arg3 * var6;
                    break;
                }
                arg0.field2734.method951(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2753 += var6 * var7 - 1048576;
                int var8 = Statics.field1069 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class58 var10 = arg0.field2734;
                if (this.field2732.field2687[arg0.field2748] == 0) {
                    arg0.field2734 = class58.method1105(arg0.field2735, var10.method1192(), var10.method1095(), var10.method1096());
                } else {
                    arg0.field2734 = class58.method1105(arg0.field2735, var10.method1192(), 0, var10.method1096());
                    this.field2732.method3024(arg0, arg0.field2749.field2656[arg0.field2738] < 0);
                    arg0.field2734.method1100(var8, var10.method1095());
                }
                if (arg0.field2749.field2656[arg0.field2738] < 0) {
                    arg0.field2734.method1174(-1);
                }
                var10.method1102(var8);
                var10.method951(arg1, arg2, arg4 - arg2);
                if (var10.method1106()) {
                    this.field2730.method973(var10);
                }
            }
        }
        arg0.field2734.method951(arg1, arg2, arg3);
    }

    @ObfuscatedName("fs.u(Lfd;II)V")
    public void method3120(class164 arg0, int arg1) {
        if ((this.field2732.field2701[arg0.field2748] & 0x4) != 0 && arg0.field2747 < 0) {
            int var3 = this.field2732.field2704[arg0.field2748] / Statics.field1069;
            int var4 = (var3 + 1048575 - arg0.field2753) / var3;
            arg0.field2753 = arg0.field2753 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2732.field2687[arg0.field2748] == 0) {
                    arg0.field2734 = class58.method1105(arg0.field2735, arg0.field2734.method1192(), arg0.field2734.method1095(), arg0.field2734.method1096());
                } else {
                    arg0.field2734 = class58.method1105(arg0.field2735, arg0.field2734.method1192(), 0, arg0.field2734.method1096());
                    this.field2732.method3024(arg0, arg0.field2749.field2656[arg0.field2738] < 0);
                }
                if (arg0.field2749.field2656[arg0.field2738] < 0) {
                    arg0.field2734.method1174(-1);
                }
                arg1 = arg0.field2753 / var3;
            }
        }
        arg0.field2734.method953(arg1);
    }
}
