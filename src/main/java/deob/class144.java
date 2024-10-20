package deob;

@ObfuscatedName("et")
public class class144 extends class69 {

    @ObfuscatedName("et.o")
    public class140 field2021;

    @ObfuscatedName("et.m")
    public class129 field2018 = new class129();

    @ObfuscatedName("et.b")
    public class52 field2019 = new class52();

    public class144(class140 arg0) {
        this.field2021 = arg0;
    }

    @ObfuscatedName("et.c()Lbi;")
    public class69 method882() {
        class141 var1 = (class141) this.field2018.method2201();
        if (var1 == null) {
            return null;
        } else if (var1.field1987 == null) {
            return this.method885();
        } else {
            return var1.field1987;
        }
    }

    @ObfuscatedName("et.u()Lbi;")
    public class69 method885() {
        class141 var1;
        do {
            var1 = (class141) this.field2018.method2203();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1987 == null);
        return var1.field1987;
    }

    @ObfuscatedName("et.k()I")
    public int method886() {
        return 0;
    }

    @ObfuscatedName("et.z([III)V")
    public void method887(int[] arg0, int arg1, int arg2) {
        this.field2019.method887(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2018.method2201(); var4 != null; var4 = (class141) this.field2018.method2203()) {
            if (!this.field2021.method2331(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1988) {
                        this.method2464(var4, arg0, var5, var6, var5 + var6);
                        var4.field1988 -= var6;
                        break;
                    }
                    this.method2464(var4, arg0, var5, var4.field1988, var5 + var6);
                    var5 += var4.field1988;
                    var6 -= var4.field1988;
                } while (!this.field2021.method2332(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("et.j(I)V")
    public void method889(int arg0) {
        this.field2019.method889(arg0);
        for (class141 var2 = (class141) this.field2018.method2201(); var2 != null; var2 = (class141) this.field2018.method2203()) {
            if (!this.field2021.method2331(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1988) {
                        this.method2465(var2, var3);
                        var2.field1988 -= var3;
                        break;
                    }
                    this.method2465(var2, var2.field1988);
                    var3 -= var2.field1988;
                } while (!this.field2021.method2332(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("et.o(Leh;[IIIII)V")
    public void method2464(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2021.field1951[arg0.field1985] & 0x4) != 0 && arg0.field1979 < 0) {
            int var6 = this.field2021.field1956[arg0.field1985] / Statics.field1043;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1990) / var6;
                if (var7 > arg3) {
                    arg0.field1990 += arg3 * var6;
                    break;
                }
                arg0.field1987.method887(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1990 += var6 * var7 - 1048576;
                int var8 = Statics.field1043 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1987;
                if (this.field2021.field1954[arg0.field1985] == 0) {
                    arg0.field1987 = class67.method1235(arg0.field1971, var10.method1136(), var10.method1128(), var10.method1129());
                } else {
                    arg0.field1987 = class67.method1235(arg0.field1971, var10.method1136(), 0, var10.method1129());
                    this.field2021.method2307(arg0, arg0.field1970.field2014[arg0.field1974] < 0);
                    arg0.field1987.method1244(var8, var10.method1128());
                }
                if (arg0.field1970.field2014[arg0.field1974] < 0) {
                    arg0.field1987.method1210(-1);
                }
                var10.method1135(var8);
                var10.method887(arg1, arg2, arg4 - arg2);
                if (var10.method1139()) {
                    this.field2019.method880(var10);
                }
            }
        }
        arg0.field1987.method887(arg1, arg2, arg3);
    }

    @ObfuscatedName("et.m(Leh;II)V")
    public void method2465(class141 arg0, int arg1) {
        if ((this.field2021.field1951[arg0.field1985] & 0x4) != 0 && arg0.field1979 < 0) {
            int var3 = this.field2021.field1956[arg0.field1985] / Statics.field1043;
            int var4 = (var3 + 1048575 - arg0.field1990) / var3;
            arg0.field1990 = arg0.field1990 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2021.field1954[arg0.field1985] == 0) {
                    arg0.field1987 = class67.method1235(arg0.field1971, arg0.field1987.method1136(), arg0.field1987.method1128(), arg0.field1987.method1129());
                } else {
                    arg0.field1987 = class67.method1235(arg0.field1971, arg0.field1987.method1136(), 0, arg0.field1987.method1129());
                    this.field2021.method2307(arg0, arg0.field1970.field2014[arg0.field1974] < 0);
                }
                if (arg0.field1970.field2014[arg0.field1974] < 0) {
                    arg0.field1987.method1210(-1);
                }
                arg1 = arg0.field1990 / var3;
            }
        }
        arg0.field1987.method889(arg1);
    }
}
