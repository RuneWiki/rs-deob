package deob;

@ObfuscatedName("ee")
public class class144 extends class69 {

    @ObfuscatedName("ee.f")
    public class140 field2028;

    @ObfuscatedName("ee.i")
    public class129 field2025 = new class129();

    @ObfuscatedName("ee.u")
    public class52 field2024 = new class52();

    public class144(class140 arg0) {
        this.field2028 = arg0;
    }

    @ObfuscatedName("ee.l()Lbm;")
    public class69 method936() {
        class141 var1 = (class141) this.field2025.method2301();
        if (var1 == null) {
            return null;
        } else if (var1.field1994 == null) {
            return this.method928();
        } else {
            return var1.field1994;
        }
    }

    @ObfuscatedName("ee.n()Lbm;")
    public class69 method928() {
        class141 var1;
        do {
            var1 = (class141) this.field2025.method2309();
            if (var1 == null) {
                return null;
            }
        } while (var1.field1994 == null);
        return var1.field1994;
    }

    @ObfuscatedName("ee.m()I")
    public int method960() {
        return 0;
    }

    @ObfuscatedName("ee.w([III)V")
    public void method930(int[] arg0, int arg1, int arg2) {
        this.field2024.method930(arg0, arg1, arg2);
        for (class141 var4 = (class141) this.field2025.method2301(); var4 != null; var4 = (class141) this.field2025.method2309()) {
            if (!this.field2028.method2418(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1995) {
                        this.method2572(var4, arg0, var5, var6, var5 + var6);
                        var4.field1995 -= var6;
                        break;
                    }
                    this.method2572(var4, arg0, var5, var4.field1995, var5 + var6);
                    var5 += var4.field1995;
                    var6 -= var4.field1995;
                } while (!this.field2028.method2419(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ee.s(I)V")
    public void method929(int arg0) {
        this.field2024.method929(arg0);
        for (class141 var2 = (class141) this.field2025.method2301(); var2 != null; var2 = (class141) this.field2025.method2309()) {
            if (!this.field2028.method2418(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1995) {
                        this.method2573(var2, var3);
                        var2.field1995 -= var3;
                        break;
                    }
                    this.method2573(var2, var2.field1995);
                    var3 -= var2.field1995;
                } while (!this.field2028.method2419(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ee.f(Leu;[IIIIB)V")
    public void method2572(class141 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2028.field1959[arg0.field1991] & 0x4) != 0 && arg0.field1984 < 0) {
            int var6 = this.field2028.field1964[arg0.field1991] / Statics.field1078;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field1997) / var6;
                if (var7 > arg3) {
                    arg0.field1997 += arg3 * var6;
                    break;
                }
                arg0.field1994.method930(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field1997 += var6 * var7 - 1048576;
                int var8 = Statics.field1078 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class67 var10 = arg0.field1994;
                if (this.field2028.field1970[arg0.field1991] == 0) {
                    arg0.field1994 = class67.method1206(arg0.field1987, var10.method1178(), var10.method1277(), var10.method1171());
                } else {
                    arg0.field1994 = class67.method1206(arg0.field1987, var10.method1178(), 0, var10.method1171());
                    this.field2028.method2410(arg0, arg0.field1977.field2014[arg0.field1981] < 0);
                    arg0.field1994.method1175(var8, var10.method1277());
                }
                if (arg0.field1977.field2014[arg0.field1981] < 0) {
                    arg0.field1994.method1169(-1);
                }
                var10.method1195(var8);
                var10.method930(arg1, arg2, arg4 - arg2);
                if (var10.method1179()) {
                    this.field2024.method920(var10);
                }
            }
        }
        arg0.field1994.method930(arg1, arg2, arg3);
    }

    @ObfuscatedName("ee.i(Leu;IB)V")
    public void method2573(class141 arg0, int arg1) {
        if ((this.field2028.field1959[arg0.field1991] & 0x4) != 0 && arg0.field1984 < 0) {
            int var3 = this.field2028.field1964[arg0.field1991] / Statics.field1078;
            int var4 = (var3 + 1048575 - arg0.field1997) / var3;
            arg0.field1997 = arg0.field1997 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2028.field1970[arg0.field1991] == 0) {
                    arg0.field1994 = class67.method1206(arg0.field1987, arg0.field1994.method1178(), arg0.field1994.method1277(), arg0.field1994.method1171());
                } else {
                    arg0.field1994 = class67.method1206(arg0.field1987, arg0.field1994.method1178(), 0, arg0.field1994.method1171());
                    this.field2028.method2410(arg0, arg0.field1977.field2014[arg0.field1981] < 0);
                }
                if (arg0.field1977.field2014[arg0.field1981] < 0) {
                    arg0.field1994.method1169(-1);
                }
                arg1 = arg0.field1997 / var3;
            }
        }
        arg0.field1994.method929(arg1);
    }
}
