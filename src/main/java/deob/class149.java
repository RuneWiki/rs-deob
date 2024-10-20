package deob;

@ObfuscatedName("eq")
public class class149 extends class129 {

    @ObfuscatedName("eq.i")
    public class148 field2252;

    @ObfuscatedName("eq.e")
    public class104 field2251 = new class104();

    @ObfuscatedName("eq.a")
    public class147 field2253 = new class147();

    public class149(class148 arg0) {
        this.field2252 = arg0;
    }

    @ObfuscatedName("eq.l()Ldb;")
    public class129 method1512() {
        class138 var1 = (class138) this.field2251.method1305();
        if (var1 == null) {
            return null;
        } else if (var1.field1747 == null) {
            return this.method1493();
        } else {
            return var1.field1747;
        }
    }

    @ObfuscatedName("eq.i()Ldb;")
    public class129 method1493() {
        class138 var1;
        do {
            var1 = (class138) this.field2251.method1287();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1747 == null);
        return var1.field1747;
    }

    @ObfuscatedName("eq.e()I")
    public int method1504() {
        return 0;
    }

    @ObfuscatedName("eq.g([III)V")
    public void method1499(int[] arg0, int arg1, int arg2) {
        this.field2253.method1499(arg0, arg1, arg2);
        for (class138 var4 = (class138) this.field2251.method1305(); var4 != null; var4 = (class138) this.field2251.method1287()) {
            if (!this.field2252.method2224(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1759) {
                        this.method2281(var4, arg0, var5, var6, var5 + var6);
                        var4.field1759 -= var6;
                        break;
                    }
                    this.method2281(var4, arg0, var5, var4.field1759, var5 + var6);
                    var5 += var4.field1759;
                    var6 -= var4.field1759;
                } while (!this.field2252.method2260(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("eq.w(I)V")
    public void method1500(int arg0) {
        this.field2253.method1500(arg0);
        for (class138 var2 = (class138) this.field2251.method1305(); var2 != null; var2 = (class138) this.field2251.method1287()) {
            if (!this.field2252.method2224(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1759) {
                        this.method2285(var2, var3);
                        var2.field1759 -= var3;
                        break;
                    }
                    this.method2285(var2, var2.field1759);
                    var3 -= var2.field1759;
                } while (!this.field2252.method2260(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("eq.ak(Lem;[IIIII)V")
    public void method2281(class138 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2252.field2247[arg0.field1748] & 0x4) != 0 && arg0.field1746 < 0) {
            int var6 = this.field2252.field2240[arg0.field1748] / Statics.field823;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1761) / var6;
                if (var7 > arg3) {
                    arg0.field1761 += arg3 * var6;
                    break;
                }
                arg0.field1747.method1499(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1761 += var6 * var7 - 1048576;
                int var8 = Statics.field823 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class146 var10 = arg0.field1747;
                if (this.field2252.field2239[arg0.field1748] == 0) {
                    arg0.field1747 = class146.method2133(arg0.field1742, var10.method2068(), var10.method2059(), var10.method2144());
                } else {
                    arg0.field1747 = class146.method2133(arg0.field1742, var10.method2068(), 0, var10.method2144());
                    this.field2252.method2206(arg0, arg0.field1754.field1732[arg0.field1745] < 0);
                    arg0.field1747.method2064(var8, var10.method2059());
                }
                if (arg0.field1754.field1732[arg0.field1745] < 0) {
                    arg0.field1747.method2056(-1);
                }
                var10.method2075(var8);
                var10.method1499(arg1, arg2, arg4 - arg2);
                if (var10.method2070()) {
                    this.field2253.method2172(var10);
                }
            }
        }
        arg0.field1747.method1499(arg1, arg2, arg3);
    }

    @ObfuscatedName("eq.ap(Lem;IB)V")
    public void method2285(class138 arg0, int arg1) {
        if ((this.field2252.field2247[arg0.field1748] & 0x4) != 0 && arg0.field1746 < 0) {
            int var3 = this.field2252.field2240[arg0.field1748] / Statics.field823;
            int var4 = (var3 + 1048575 - arg0.field1761) / var3;
            arg0.field1761 = arg0.field1761 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2252.field2239[arg0.field1748] == 0) {
                    arg0.field1747 = class146.method2133(arg0.field1742, arg0.field1747.method2068(), arg0.field1747.method2059(), arg0.field1747.method2144());
                } else {
                    arg0.field1747 = class146.method2133(arg0.field1742, arg0.field1747.method2068(), 0, arg0.field1747.method2144());
                    this.field2252.method2206(arg0, arg0.field1754.field1732[arg0.field1745] < 0);
                }
                if (arg0.field1754.field1732[arg0.field1745] < 0) {
                    arg0.field1747.method2056(-1);
                }
                arg1 = arg0.field1761 / var3;
            }
        }
        arg0.field1747.method1500(arg1);
    }
}
