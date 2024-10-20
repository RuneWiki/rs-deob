package deob;

@ObfuscatedName("ep")
public class class95 extends class183 {

    @ObfuscatedName("ep.b")
    public class57 field1323;

    @ObfuscatedName("ep.k")
    public class163 field1324 = new class163();

    @ObfuscatedName("ep.h")
    public class15 field1322 = new class15();

    @ObfuscatedName("ep.m()Lag;")
    public class183 method992() {
        class63 var1;
        do {
            var1 = (class63) this.field1322.method201();
            if (var1 == null) {
                return null;
            }
        } while (var1.field697 == null);
        return var1.field697;
    }

    @ObfuscatedName("ep.c()I")
    public int method976() {
        return 0;
    }

    @ObfuscatedName("ep.v([III)V")
    public void method1018(int[] arg0, int arg1, int arg2) {
        this.field1324.method1018(arg0, arg1, arg2);
        for (class63 var4 = (class63) this.field1322.method212(); var4 != null; var4 = (class63) this.field1322.method201()) {
            if (!this.field1323.method997(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field698) {
                        this.method1376(var4, arg0, var5, var6, var5 + var6);
                        var4.field698 -= var6;
                        break;
                    }
                    this.method1376(var4, arg0, var5, var4.field698, var5 + var6);
                    var5 += var4.field698;
                    var6 -= var4.field698;
                } while (!this.field1323.method998(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ep.ac(I)V")
    public void method995(int arg0) {
        this.field1324.method995(arg0);
        for (class63 var2 = (class63) this.field1322.method212(); var2 != null; var2 = (class63) this.field1322.method201()) {
            if (!this.field1323.method997(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field698) {
                        this.method1377(var2, var3);
                        var2.field698 -= var3;
                        break;
                    }
                    this.method1377(var2, var2.field698);
                    var3 -= var2.field698;
                } while (!this.field1323.method998(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ep.b(Ley;[IIIIB)V")
    public void method1376(class63 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field1323.field588[arg0.field686] & 0x4) != 0 && arg0.field693 < 0) {
            int var6 = this.field1323.field599[arg0.field686] / Statics.field2840;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field699) / var6;
                if (var7 > arg3) {
                    arg0.field699 += arg3 * var6;
                    break;
                }
                arg0.field697.method1018(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field699 += var6 * var7 - 1048576;
                int var8 = Statics.field2840 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class181 var10 = arg0.field697;
                if (this.field1323.field602[arg0.field686] == 0) {
                    arg0.field697 = class181.method3157(arg0.field681, var10.method3221(), var10.method3162(), var10.method3163());
                } else {
                    arg0.field697 = class181.method3157(arg0.field681, var10.method3221(), 0, var10.method3163());
                    this.field1323.method975(arg0, arg0.field700.field1226[arg0.field684] < 0);
                    arg0.field697.method3166(var8, var10.method3162());
                }
                if (arg0.field700.field1226[arg0.field684] < 0) {
                    arg0.field697.method3238(-1);
                }
                var10.method3168(var8);
                var10.method1018(arg1, arg2, arg4 - arg2);
                if (var10.method3172()) {
                    this.field1324.method2799(var10);
                }
            }
        }
        arg0.field697.method1018(arg1, arg2, arg3);
    }

    @ObfuscatedName("ep.h(Ley;IB)V")
    public void method1377(class63 arg0, int arg1) {
        if ((this.field1323.field588[arg0.field686] & 0x4) != 0 && arg0.field693 < 0) {
            int var3 = this.field1323.field599[arg0.field686] / Statics.field2840;
            int var4 = (var3 + 1048575 - arg0.field699) / var3;
            arg0.field699 = arg0.field699 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field1323.field602[arg0.field686] == 0) {
                    arg0.field697 = class181.method3157(arg0.field681, arg0.field697.method3221(), arg0.field697.method3162(), arg0.field697.method3163());
                } else {
                    arg0.field697 = class181.method3157(arg0.field681, arg0.field697.method3221(), 0, arg0.field697.method3163());
                    this.field1323.method975(arg0, arg0.field700.field1226[arg0.field684] < 0);
                }
                if (arg0.field700.field1226[arg0.field684] < 0) {
                    arg0.field697.method3238(-1);
                }
                arg1 = arg0.field699 / var3;
            }
        }
        arg0.field697.method995(arg1);
    }

    @ObfuscatedName("ep.p()Lag;")
    public class183 method1027() {
        class63 var1 = (class63) this.field1322.method212();
        if (var1 == null) {
            return null;
        } else if (var1.field697 == null) {
            return this.method992();
        } else {
            return var1.field697;
        }
    }

    public class95(class57 arg0) {
        this.field1323 = arg0;
    }
}
