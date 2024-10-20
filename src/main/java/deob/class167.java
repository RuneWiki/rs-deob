package deob;

@ObfuscatedName("fq")
public class class167 extends class61 {

    @ObfuscatedName("fq.e")
    public class165 field2785;

    @ObfuscatedName("fq.v")
    public class180 field2783 = new class180();

    @ObfuscatedName("fq.k")
    public class50 field2784 = new class50();

    public class167(class165 arg0) {
        this.field2785 = arg0;
    }

    @ObfuscatedName("fq.l()Lbz;")
    public class61 method980() {
        class168 var1 = (class168) this.field2783.method3226();
        if (var1 == null) {
            return null;
        } else if (var1.field2807 == null) {
            return this.method946();
        } else {
            return var1.field2807;
        }
    }

    @ObfuscatedName("fq.a()Lbz;")
    public class61 method946() {
        class168 var1;
        do {
            var1 = (class168) this.field2783.method3231();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2807 == null);
        return var1.field2807;
    }

    @ObfuscatedName("fq.b()I")
    public int method950() {
        return 0;
    }

    @ObfuscatedName("fq.z([III)V")
    public void method952(int[] arg0, int arg1, int arg2) {
        this.field2784.method952(arg0, arg1, arg2);
        for (class168 var4 = (class168) this.field2783.method3226(); var4 != null; var4 = (class168) this.field2783.method3231()) {
            if (!this.field2785.method3064(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2808) {
                        this.method3137(var4, arg0, var5, var6, var5 + var6);
                        var4.field2808 -= var6;
                        break;
                    }
                    this.method3137(var4, arg0, var5, var4.field2808, var5 + var6);
                    var5 += var4.field2808;
                    var6 -= var4.field2808;
                } while (!this.field2785.method3065(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("fq.j(I)V")
    public void method957(int arg0) {
        this.field2784.method957(arg0);
        for (class168 var2 = (class168) this.field2783.method3226(); var2 != null; var2 = (class168) this.field2783.method3231()) {
            if (!this.field2785.method3064(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2808) {
                        this.method3139(var2, var3);
                        var2.field2808 -= var3;
                        break;
                    }
                    this.method3139(var2, var2.field2808);
                    var3 -= var2.field2808;
                } while (!this.field2785.method3065(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("fq.e(Lfs;[IIIII)V")
    public void method3137(class168 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2785.field2749[arg0.field2792] & 0x4) != 0 && arg0.field2801 < 0) {
            int var6 = this.field2785.field2754[arg0.field2792] / Statics.field1108;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2809) / var6;
                if (var7 > arg3) {
                    arg0.field2809 += arg3 * var6;
                    break;
                }
                arg0.field2807.method952(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2809 += var6 * var7 - 1048576;
                int var8 = Statics.field1108 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class59 var10 = arg0.field2807;
                if (this.field2785.field2742[arg0.field2792] == 0) {
                    arg0.field2807 = class59.method1229(arg0.field2796, var10.method1126(), var10.method1117(), var10.method1118());
                } else {
                    arg0.field2807 = class59.method1229(arg0.field2796, var10.method1126(), 0, var10.method1118());
                    this.field2785.method3046(arg0, arg0.field2790.field2709[arg0.field2794] < 0);
                    arg0.field2807.method1172(var8, var10.method1117());
                }
                if (arg0.field2790.field2709[arg0.field2794] < 0) {
                    arg0.field2807.method1113(-1);
                }
                var10.method1189(var8);
                var10.method952(arg1, arg2, arg4 - arg2);
                if (var10.method1212()) {
                    this.field2784.method956(var10);
                }
            }
        }
        arg0.field2807.method952(arg1, arg2, arg3);
    }

    @ObfuscatedName("fq.v(Lfs;II)V")
    public void method3139(class168 arg0, int arg1) {
        if ((this.field2785.field2749[arg0.field2792] & 0x4) != 0 && arg0.field2801 < 0) {
            int var3 = this.field2785.field2754[arg0.field2792] / Statics.field1108;
            int var4 = (var3 + 1048575 - arg0.field2809) / var3;
            arg0.field2809 = arg0.field2809 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2785.field2742[arg0.field2792] == 0) {
                    arg0.field2807 = class59.method1229(arg0.field2796, arg0.field2807.method1126(), arg0.field2807.method1117(), arg0.field2807.method1118());
                } else {
                    arg0.field2807 = class59.method1229(arg0.field2796, arg0.field2807.method1126(), 0, arg0.field2807.method1118());
                    this.field2785.method3046(arg0, arg0.field2790.field2709[arg0.field2794] < 0);
                }
                if (arg0.field2790.field2709[arg0.field2794] < 0) {
                    arg0.field2807.method1113(-1);
                }
                arg1 = arg0.field2809 / var3;
            }
        }
        arg0.field2807.method957(arg1);
    }
}
