package deob;

@ObfuscatedName("em")
public class class144 extends class69 {

    @ObfuscatedName("em.i")
    public class140 field2003;

    @ObfuscatedName("em.e")
    public class129 field2006 = new class129();

    @ObfuscatedName("em.f")
    public class52 field2005 = new class52();

    public class144(class140 arg0) {
        this.field2003 = arg0;
    }

    @ObfuscatedName("em.q()Lbg;")
    public class69 method868() {
        class141 var1 = (class141) this.field2006.method2209();
        if (var1 == null) {
            return null;
        } else if (var1.field1963 == null) {
            return this.method871();
        } else {
            return var1.field1963;
        }
    }

    @ObfuscatedName("em.w()Lbg;")
    public class69 method871() {
        class141 var1;
        do {
            var1 = (class141) this.field2006.method2211();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1963 == null);
        return var1.field1963;
    }

    @ObfuscatedName("em.v()I")
    public int method872() {
        return 0;
    }

    @ObfuscatedName("em.h([III)V")
    public void method873(int[] arg0, int arg1, int arg2) {
        this.field2005.method873(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2006.method2209(); var4 != null; var4 = (class141) this.field2006.method2211()) {
            if (!this.field2003.method2338(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1972) {
                        this.method2480(var4, arg0, var5, var6, var5 + var6);
                        var4.field1972 -= var6;
                        break;
                    }
                    this.method2480(var4, arg0, var5, var4.field1972, var5 + var6);
                    var5 += var4.field1972;
                    var6 -= var4.field1972;
                } while (!this.field2003.method2339(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("em.l(I)V")
    public void method875(int arg0) {
        this.field2005.method875(arg0);
        for (class141 var2 = (class141) this.field2006.method2209(); var2 != null; var2 = (class141) this.field2006.method2211()) {
            if (!this.field2003.method2338(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1972) {
                        this.method2481(var2, var3);
                        var2.field1972 -= var3;
                        break;
                    }
                    this.method2481(var2, var2.field1972);
                    var3 -= var2.field1972;
                } while (!this.field2003.method2339(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("em.i(Lef;[IIIII)V")
    public void method2480(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2003.field1936[arg0.field1964] & 0x4) != 0 && arg0.field1967 < 0) {
            int var6 = this.field2003.field1941[arg0.field1964] / Statics.field1054;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1973) / var6;
                if (var7 > arg3) {
                    arg0.field1973 += arg3 * var6;
                    break;
                }
                arg0.field1963.method873(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1973 += var6 * var7 - 1048576;
                int var8 = Statics.field1054 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1963;
                if (this.field2003.field1939[arg0.field1964] == 0) {
                    arg0.field1963 = class67.method1123(arg0.field1969, var10.method1151(), var10.method1129(), var10.method1130());
                } else {
                    arg0.field1963 = class67.method1123(arg0.field1969, var10.method1151(), 0, var10.method1130());
                    this.field2003.method2320(arg0, arg0.field1954.field1992[arg0.field1958] < 0);
                    arg0.field1963.method1150(var8, var10.method1129());
                }
                if (arg0.field1954.field1992[arg0.field1958] < 0) {
                    arg0.field1963.method1125(-1);
                }
                var10.method1136(var8);
                var10.method873(arg1, arg2, arg4 - arg2);
                if (var10.method1221()) {
                    this.field2005.method865(var10);
                }
            }
        }
        arg0.field1963.method873(arg1, arg2, arg3);
    }

    @ObfuscatedName("em.e(Lef;II)V")
    public void method2481(class141 arg0, int arg1) {
        if ((this.field2003.field1936[arg0.field1964] & 0x4) != 0 && arg0.field1967 < 0) {
            int var3 = this.field2003.field1941[arg0.field1964] / Statics.field1054;
            int var4 = (var3 + 1048575 - arg0.field1973) / var3;
            arg0.field1973 = arg0.field1973 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2003.field1939[arg0.field1964] == 0) {
                    arg0.field1963 = class67.method1123(arg0.field1969, arg0.field1963.method1151(), arg0.field1963.method1129(), arg0.field1963.method1130());
                } else {
                    arg0.field1963 = class67.method1123(arg0.field1969, arg0.field1963.method1151(), 0, arg0.field1963.method1130());
                    this.field2003.method2320(arg0, arg0.field1954.field1992[arg0.field1958] < 0);
                }
                if (arg0.field1954.field1992[arg0.field1958] < 0) {
                    arg0.field1963.method1125(-1);
                }
                arg1 = arg0.field1973 / var3;
            }
        }
        arg0.field1963.method875(arg1);
    }
}
