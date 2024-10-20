package deob;

@ObfuscatedName("ex")
public class class149 extends class129 {

    @ObfuscatedName("ex.z")
    public class148 field2256;

    @ObfuscatedName("ex.g")
    public class104 field2255 = new class104();

    @ObfuscatedName("ex.q")
    public class147 field2254 = new class147();

    public class149(class148 arg0) {
        this.field2256 = arg0;
    }

    @ObfuscatedName("ex.n()Ldx;")
    public class129 method1516() {
        class138 var1 = (class138) this.field2255.method1297();
        if (var1 == null) {
            return null;
        } else if (var1.field1763 == null) {
            return this.method1517();
        } else {
            return var1.field1763;
        }
    }

    @ObfuscatedName("ex.j()Ldx;")
    public class129 method1517() {
        class138 var1;
        do {
            var1 = (class138) this.field2255.method1299();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1763 == null);
        return var1.field1763;
    }

    @ObfuscatedName("ex.z()I")
    public int method1518() {
        return 0;
    }

    @ObfuscatedName("ex.q([III)V")
    public void method1520(int[] arg0, int arg1, int arg2) {
        this.field2254.method1520(arg0, arg1, arg2);
        for (class138 var4 = (class138) this.field2255.method1297(); var4 != null; var4 = (class138) this.field2255.method1299()) {
            if (!this.field2256.method2223(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1764) {
                        this.method2291(var4, arg0, var5, var6, var5 + var6);
                        var4.field1764 -= var6;
                        break;
                    }
                    this.method2291(var4, arg0, var5, var4.field1764, var5 + var6);
                    var5 += var4.field1764;
                    var6 -= var4.field1764;
                } while (!this.field2256.method2260(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ex.i(I)V")
    public void method1521(int arg0) {
        this.field2254.method1521(arg0);
        for (class138 var2 = (class138) this.field2255.method1297(); var2 != null; var2 = (class138) this.field2255.method1299()) {
            if (!this.field2256.method2223(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1764) {
                        this.method2292(var2, var3);
                        var2.field1764 -= var3;
                        break;
                    }
                    this.method2292(var2, var2.field1764);
                    var3 -= var2.field1764;
                } while (!this.field2256.method2260(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ex.p(Lej;[IIIII)V")
    public void method2291(class138 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2256.field2244[arg0.field1760] & 0x4) != 0 && arg0.field1745 < 0) {
            int var6 = this.field2256.field2250[arg0.field1760] / Statics.field241;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1766) / var6;
                if (var7 > arg3) {
                    arg0.field1766 += arg3 * var6;
                    break;
                }
                arg0.field1763.method1520(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1766 += var6 * var7 - 1048576;
                int var8 = Statics.field241 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class146 var10 = arg0.field1763;
                if (this.field2256.field2242[arg0.field1760] == 0) {
                    arg0.field1763 = class146.method2059(arg0.field1759, var10.method2074(), var10.method2065(), var10.method2066());
                } else {
                    arg0.field1763 = class146.method2059(arg0.field1759, var10.method2074(), 0, var10.method2066());
                    this.field2256.method2205(arg0, arg0.field1746.field1743[arg0.field1750] < 0);
                    arg0.field1763.method2070(var8, var10.method2065());
                }
                if (arg0.field1746.field1743[arg0.field1750] < 0) {
                    arg0.field1763.method2061(-1);
                }
                var10.method2081(var8);
                var10.method1520(arg1, arg2, arg4 - arg2);
                if (var10.method2076()) {
                    this.field2254.method2174(var10);
                }
            }
        }
        arg0.field1763.method1520(arg1, arg2, arg3);
    }

    @ObfuscatedName("ex.ad(Lej;II)V")
    public void method2292(class138 arg0, int arg1) {
        if ((this.field2256.field2244[arg0.field1760] & 0x4) != 0 && arg0.field1745 < 0) {
            int var3 = this.field2256.field2250[arg0.field1760] / Statics.field241;
            int var4 = (var3 + 1048575 - arg0.field1766) / var3;
            arg0.field1766 = arg0.field1766 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2256.field2242[arg0.field1760] == 0) {
                    arg0.field1763 = class146.method2059(arg0.field1759, arg0.field1763.method2074(), arg0.field1763.method2065(), arg0.field1763.method2066());
                } else {
                    arg0.field1763 = class146.method2059(arg0.field1759, arg0.field1763.method2074(), 0, arg0.field1763.method2066());
                    this.field2256.method2205(arg0, arg0.field1746.field1743[arg0.field1750] < 0);
                }
                if (arg0.field1746.field1743[arg0.field1750] < 0) {
                    arg0.field1763.method2061(-1);
                }
                arg1 = arg0.field1766 / var3;
            }
        }
        arg0.field1763.method1521(arg1);
    }
}
