package deob;

@ObfuscatedName("er")
public class class144 extends class69 {

    @ObfuscatedName("er.n")
    public class140 field2010;

    @ObfuscatedName("er.d")
    public class129 field2014 = new class129();

    @ObfuscatedName("er.m")
    public class52 field2009 = new class52();

    public class144(class140 arg0) {
        this.field2010 = arg0;
    }

    @ObfuscatedName("er.r()Lbb;")
    public class69 method887() {
        class141 var1 = (class141) this.field2014.method2290();
        if (var1 == null) {
            return null;
        } else if (var1.field1972 == null) {
            return this.method914();
        } else {
            return var1.field1972;
        }
    }

    @ObfuscatedName("er.c()Lbb;")
    public class69 method914() {
        class141 var1;
        do {
            var1 = (class141) this.field2014.method2285();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1972 == null);
        return var1.field1972;
    }

    @ObfuscatedName("er.z()I")
    public int method888() {
        return 0;
    }

    @ObfuscatedName("er.q([III)V")
    public void method905(int[] arg0, int arg1, int arg2) {
        this.field2009.method905(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2014.method2290(); var4 != null; var4 = (class141) this.field2014.method2285()) {
            if (!this.field2010.method2416(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1960) {
                        this.method2557(var4, arg0, var5, var6, var5 + var6);
                        var4.field1960 -= var6;
                        break;
                    }
                    this.method2557(var4, arg0, var5, var4.field1960, var5 + var6);
                    var5 += var4.field1960;
                    var6 -= var4.field1960;
                } while (!this.field2010.method2427(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("er.y(I)V")
    public void method897(int arg0) {
        this.field2009.method897(arg0);
        for (class141 var2 = (class141) this.field2014.method2290(); var2 != null; var2 = (class141) this.field2014.method2285()) {
            if (!this.field2010.method2416(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1960) {
                        this.method2556(var2, var3);
                        var2.field1960 -= var3;
                        break;
                    }
                    this.method2556(var2, var2.field1960);
                    var3 -= var2.field1960;
                } while (!this.field2010.method2427(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("er.n(Lee;[IIIII)V")
    public void method2557(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2010.field1933[arg0.field1954] & 0x4) != 0 && arg0.field1968 < 0) {
            int var6 = this.field2010.field1941[arg0.field1954] / Statics.field1032;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1975) / var6;
                if (var7 > arg3) {
                    arg0.field1975 += arg3 * var6;
                    break;
                }
                arg0.field1972.method905(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1975 += var6 * var7 - 1048576;
                int var8 = Statics.field1032 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1972;
                if (this.field2010.field1939[arg0.field1954] == 0) {
                    arg0.field1972 = class67.method1161(arg0.field1956, var10.method1136(), var10.method1163(), var10.method1183());
                } else {
                    arg0.field1972 = class67.method1161(arg0.field1956, var10.method1136(), 0, var10.method1183());
                    this.field2010.method2386(arg0, arg0.field1977.field2005[arg0.field1959] < 0);
                    arg0.field1972.method1132(var8, var10.method1163());
                }
                if (arg0.field1977.field2005[arg0.field1959] < 0) {
                    arg0.field1972.method1138(-1);
                }
                var10.method1134(var8);
                var10.method905(arg1, arg2, arg4 - arg2);
                if (var10.method1182()) {
                    this.field2009.method882(var10);
                }
            }
        }
        arg0.field1972.method905(arg1, arg2, arg3);
    }

    @ObfuscatedName("er.d(Lee;II)V")
    public void method2556(class141 arg0, int arg1) {
        if ((this.field2010.field1933[arg0.field1954] & 0x4) != 0 && arg0.field1968 < 0) {
            int var3 = this.field2010.field1941[arg0.field1954] / Statics.field1032;
            int var4 = (var3 + 1048575 - arg0.field1975) / var3;
            arg0.field1975 = arg0.field1975 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2010.field1939[arg0.field1954] == 0) {
                    arg0.field1972 = class67.method1161(arg0.field1956, arg0.field1972.method1136(), arg0.field1972.method1163(), arg0.field1972.method1183());
                } else {
                    arg0.field1972 = class67.method1161(arg0.field1956, arg0.field1972.method1136(), 0, arg0.field1972.method1183());
                    this.field2010.method2386(arg0, arg0.field1977.field2005[arg0.field1959] < 0);
                }
                if (arg0.field1977.field2005[arg0.field1959] < 0) {
                    arg0.field1972.method1138(-1);
                }
                arg1 = arg0.field1975 / var3;
            }
        }
        arg0.field1972.method897(arg1);
    }
}
