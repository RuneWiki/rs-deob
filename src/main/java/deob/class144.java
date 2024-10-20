package deob;

@ObfuscatedName("eq")
public class class144 extends class69 {

    @ObfuscatedName("eq.x")
    public class140 field2010;

    @ObfuscatedName("eq.j")
    public class129 field2009 = new class129();

    @ObfuscatedName("eq.c")
    public class52 field2008 = new class52();

    public class144(class140 arg0) {
        this.field2010 = arg0;
    }

    @ObfuscatedName("eq.u()Lbo;")
    public class69 method969() {
        class141 var1 = (class141) this.field2009.method2290();
        if (var1 == null) {
            return null;
        } else if (var1.field1975 == null) {
            return this.method970();
        } else {
            return var1.field1975;
        }
    }

    @ObfuscatedName("eq.y()Lbo;")
    public class69 method970() {
        class141 var1;
        do {
            var1 = (class141) this.field2009.method2287();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1975 == null);
        return var1.field1975;
    }

    @ObfuscatedName("eq.e()I")
    public int method971() {
        return 0;
    }

    @ObfuscatedName("eq.q([III)V")
    public void method972(int[] arg0, int arg1, int arg2) {
        this.field2008.method972(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2009.method2290(); var4 != null; var4 = (class141) this.field2009.method2287()) {
            if (!this.field2010.method2400(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1976) {
                        this.method2547(var4, arg0, var5, var6, var5 + var6);
                        var4.field1976 -= var6;
                        break;
                    }
                    this.method2547(var4, arg0, var5, var4.field1976, var5 + var6);
                    var5 += var4.field1976;
                    var6 -= var4.field1976;
                } while (!this.field2010.method2462(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eq.l(I)V")
    public void method974(int arg0) {
        this.field2008.method974(arg0);
        for (class141 var2 = (class141) this.field2009.method2290(); var2 != null; var2 = (class141) this.field2009.method2287()) {
            if (!this.field2010.method2400(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1976) {
                        this.method2548(var2, var3);
                        var2.field1976 -= var3;
                        break;
                    }
                    this.method2548(var2, var2.field1976);
                    var3 -= var2.field1976;
                } while (!this.field2010.method2462(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eq.x(Lee;[IIIII)V")
    public void method2547(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2010.field1939[arg0.field1958] & 0x4) != 0 && arg0.field1971 < 0) {
            int var6 = this.field2010.field1944[arg0.field1958] / Statics.field2034;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1970) / var6;
                if (var7 > arg3) {
                    arg0.field1970 += arg3 * var6;
                    break;
                }
                arg0.field1975.method972(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1970 += var6 * var7 - 1048576;
                int var8 = Statics.field2034 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1975;
                if (this.field2010.field1942[arg0.field1958] == 0) {
                    arg0.field1975 = class67.method1204(arg0.field1959, var10.method1219(), var10.method1210(), var10.method1211());
                } else {
                    arg0.field1975 = class67.method1204(arg0.field1959, var10.method1219(), 0, var10.method1211());
                    this.field2010.method2420(arg0, arg0.field1972.field1997[arg0.field1962] < 0);
                    arg0.field1975.method1215(var8, var10.method1210());
                }
                if (arg0.field1972.field1997[arg0.field1962] < 0) {
                    arg0.field1975.method1279(-1);
                }
                var10.method1217(var8);
                var10.method972(arg1, arg2, arg4 - arg2);
                if (var10.method1221()) {
                    this.field2008.method973(var10);
                }
            }
        }
        arg0.field1975.method972(arg1, arg2, arg3);
    }

    @ObfuscatedName("eq.j(Lee;IB)V")
    public void method2548(class141 arg0, int arg1) {
        if ((this.field2010.field1939[arg0.field1958] & 0x4) != 0 && arg0.field1971 < 0) {
            int var3 = this.field2010.field1944[arg0.field1958] / Statics.field2034;
            int var4 = (var3 + 1048575 - arg0.field1970) / var3;
            arg0.field1970 = arg0.field1970 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2010.field1942[arg0.field1958] == 0) {
                    arg0.field1975 = class67.method1204(arg0.field1959, arg0.field1975.method1219(), arg0.field1975.method1210(), arg0.field1975.method1211());
                } else {
                    arg0.field1975 = class67.method1204(arg0.field1959, arg0.field1975.method1219(), 0, arg0.field1975.method1211());
                    this.field2010.method2420(arg0, arg0.field1972.field1997[arg0.field1962] < 0);
                }
                if (arg0.field1972.field1997[arg0.field1962] < 0) {
                    arg0.field1975.method1279(-1);
                }
                arg1 = arg0.field1970 / var3;
            }
        }
        arg0.field1975.method974(arg1);
    }
}
