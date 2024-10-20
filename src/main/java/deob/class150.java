package deob;

@ObfuscatedName("ef")
public class class150 extends class130 {

    @ObfuscatedName("ef.d")
    public class149 field2254;

    @ObfuscatedName("ef.k")
    public class105 field2253 = new class105();

    @ObfuscatedName("ef.u")
    public class148 field2255 = new class148();

    public class150(class149 arg0) {
        this.field2254 = arg0;
    }

    @ObfuscatedName("ef.d()Ldr;")
    public class130 method1527() {
        class139 var1 = (class139) this.field2253.method1298();
        if (var1 == null) {
            return null;
        } else if (var1.field1744 == null) {
            return this.method1511();
        } else {
            return var1.field1744;
        }
    }

    @ObfuscatedName("ef.k()Ldr;")
    public class130 method1511() {
        class139 var1;
        do {
            var1 = (class139) this.field2253.method1299();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1744 == null);
        return var1.field1744;
    }

    @ObfuscatedName("ef.u()I")
    public int method1512() {
        return 0;
    }

    @ObfuscatedName("ef.f([III)V")
    public void method1514(int[] arg0, int arg1, int arg2) {
        this.field2255.method1514(arg0, arg1, arg2);
        for (class139 var4 = (class139) this.field2253.method1298(); var4 != null; var4 = (class139) this.field2253.method1299()) {
            if (!this.field2254.method2235(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1743) {
                        this.method2300(var4, arg0, var5, var6, var5 + var6);
                        var4.field1743 -= var6;
                        break;
                    }
                    this.method2300(var4, arg0, var5, var4.field1743, var5 + var6);
                    var5 += var4.field1743;
                    var6 -= var4.field1743;
                } while (!this.field2254.method2236(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ef.s(I)V")
    public void method1515(int arg0) {
        this.field2255.method1515(arg0);
        for (class139 var2 = (class139) this.field2253.method1298(); var2 != null; var2 = (class139) this.field2253.method1299()) {
            if (!this.field2254.method2235(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1743) {
                        this.method2301(var2, var3);
                        var2.field1743 -= var3;
                        break;
                    }
                    this.method2301(var2, var2.field1743);
                    var3 -= var2.field1743;
                } while (!this.field2254.method2236(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ef.ar(Lep;[IIIIB)V")
    public void method2300(class139 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2254.field2238[arg0.field1742] & 0x4) != 0 && arg0.field1753 < 0) {
            int var6 = this.field2254.field2228[arg0.field1742] / Statics.field354;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1760) / var6;
                if (var7 > arg3) {
                    arg0.field1760 += arg3 * var6;
                    break;
                }
                arg0.field1744.method1514(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1760 += var6 * var7 - 1048576;
                int var8 = Statics.field354 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class147 var10 = arg0.field1744;
                if (this.field2254.field2241[arg0.field1742] == 0) {
                    arg0.field1744 = class147.method2056(arg0.field1741, var10.method2160(), var10.method2062(), var10.method2063());
                } else {
                    arg0.field1744 = class147.method2056(arg0.field1741, var10.method2160(), 0, var10.method2063());
                    this.field2254.method2219(arg0, arg0.field1740.field1732[arg0.field1758] < 0);
                    arg0.field1744.method2067(var8, var10.method2062());
                }
                if (arg0.field1740.field1732[arg0.field1758] < 0) {
                    arg0.field1744.method2058(-1);
                }
                var10.method2069(var8);
                var10.method1514(arg1, arg2, arg4 - arg2);
                if (var10.method2118()) {
                    this.field2255.method2194(var10);
                }
            }
        }
        arg0.field1744.method1514(arg1, arg2, arg3);
    }

    @ObfuscatedName("ef.au(Lep;II)V")
    public void method2301(class139 arg0, int arg1) {
        if ((this.field2254.field2238[arg0.field1742] & 0x4) != 0 && arg0.field1753 < 0) {
            int var3 = this.field2254.field2228[arg0.field1742] / Statics.field354;
            int var4 = (var3 + 1048575 - arg0.field1760) / var3;
            arg0.field1760 = arg0.field1760 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2254.field2241[arg0.field1742] == 0) {
                    arg0.field1744 = class147.method2056(arg0.field1741, arg0.field1744.method2160(), arg0.field1744.method2062(), arg0.field1744.method2063());
                } else {
                    arg0.field1744 = class147.method2056(arg0.field1741, arg0.field1744.method2160(), 0, arg0.field1744.method2063());
                    this.field2254.method2219(arg0, arg0.field1740.field1732[arg0.field1758] < 0);
                }
                if (arg0.field1740.field1732[arg0.field1758] < 0) {
                    arg0.field1744.method2058(-1);
                }
                arg1 = arg0.field1760 / var3;
            }
        }
        arg0.field1744.method1515(arg1);
    }
}
