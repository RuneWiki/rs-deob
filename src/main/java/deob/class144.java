package deob;

@ObfuscatedName("eo")
public class class144 extends class69 {

    @ObfuscatedName("eo.s")
    public class140 field2012;

    @ObfuscatedName("eo.c")
    public class129 field2013 = new class129();

    @ObfuscatedName("eo.f")
    public class52 field2011 = new class52();

    public class144(class140 arg0) {
        this.field2012 = arg0;
    }

    @ObfuscatedName("eo.u()Lby;")
    public class69 method852() {
        class141 var1 = (class141) this.field2013.method2187();
        if (var1 == null) {
            return null;
        } else if (var1.field1967 == null) {
            return this.method854();
        } else {
            return var1.field1967;
        }
    }

    @ObfuscatedName("eo.b()Lby;")
    public class69 method854() {
        class141 var1;
        do {
            var1 = (class141) this.field2013.method2203();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1967 == null);
        return var1.field1967;
    }

    @ObfuscatedName("eo.x()I")
    public int method855() {
        return 0;
    }

    @ObfuscatedName("eo.r([III)V")
    public void method869(int[] arg0, int arg1, int arg2) {
        this.field2011.method869(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2013.method2187(); var4 != null; var4 = (class141) this.field2013.method2203()) {
            if (!this.field2012.method2293(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1965) {
                        this.method2453(var4, arg0, var5, var6, var5 + var6);
                        var4.field1965 -= var6;
                        break;
                    }
                    this.method2453(var4, arg0, var5, var4.field1965, var5 + var6);
                    var5 += var4.field1965;
                    var6 -= var4.field1965;
                } while (!this.field2012.method2302(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eo.m(I)V")
    public void method857(int arg0) {
        this.field2011.method857(arg0);
        for (class141 var2 = (class141) this.field2013.method2187(); var2 != null; var2 = (class141) this.field2013.method2203()) {
            if (!this.field2012.method2293(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1965) {
                        this.method2451(var2, var3);
                        var2.field1965 -= var3;
                        break;
                    }
                    this.method2451(var2, var2.field1965);
                    var3 -= var2.field1965;
                } while (!this.field2012.method2302(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eo.s(Lel;[IIIII)V")
    public void method2453(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2012.field1939[arg0.field1980] & 0x4) != 0 && arg0.field1979 < 0) {
            int var6 = this.field2012.field1947[arg0.field1980] / Statics.field1058;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1985) / var6;
                if (var7 > arg3) {
                    arg0.field1985 += arg3 * var6;
                    break;
                }
                arg0.field1967.method869(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1985 += var6 * var7 - 1048576;
                int var8 = Statics.field1058 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1967;
                if (this.field2012.field1950[arg0.field1980] == 0) {
                    arg0.field1967 = class67.method1089(arg0.field1969, var10.method1103(), var10.method1095(), var10.method1174());
                } else {
                    arg0.field1967 = class67.method1089(arg0.field1969, var10.method1103(), 0, var10.method1174());
                    this.field2012.method2304(arg0, arg0.field1966.field2003[arg0.field1970] < 0);
                    arg0.field1967.method1133(var8, var10.method1095());
                }
                if (arg0.field1966.field2003[arg0.field1970] < 0) {
                    arg0.field1967.method1121(-1);
                }
                var10.method1101(var8);
                var10.method869(arg1, arg2, arg4 - arg2);
                if (var10.method1105()) {
                    this.field2011.method848(var10);
                }
            }
        }
        arg0.field1967.method869(arg1, arg2, arg3);
    }

    @ObfuscatedName("eo.c(Lel;II)V")
    public void method2451(class141 arg0, int arg1) {
        if ((this.field2012.field1939[arg0.field1980] & 0x4) != 0 && arg0.field1979 < 0) {
            int var3 = this.field2012.field1947[arg0.field1980] / Statics.field1058;
            int var4 = (var3 + 1048575 - arg0.field1985) / var3;
            arg0.field1985 = arg0.field1985 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2012.field1950[arg0.field1980] == 0) {
                    arg0.field1967 = class67.method1089(arg0.field1969, arg0.field1967.method1103(), arg0.field1967.method1095(), arg0.field1967.method1174());
                } else {
                    arg0.field1967 = class67.method1089(arg0.field1969, arg0.field1967.method1103(), 0, arg0.field1967.method1174());
                    this.field2012.method2304(arg0, arg0.field1966.field2003[arg0.field1970] < 0);
                }
                if (arg0.field1966.field2003[arg0.field1970] < 0) {
                    arg0.field1967.method1121(-1);
                }
                arg1 = arg0.field1985 / var3;
            }
        }
        arg0.field1967.method857(arg1);
    }
}
