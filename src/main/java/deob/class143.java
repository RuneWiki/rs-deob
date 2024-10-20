package deob;

@ObfuscatedName("ee")
public class class143 extends class48 {

    @ObfuscatedName("ee.j")
    public class141 field2388;

    @ObfuscatedName("ee.r")
    public class177 field2384 = new class177();

    @ObfuscatedName("ee.v")
    public class46 field2385 = new class46();

    public class143(class141 arg0) {
        this.field2388 = arg0;
    }

    @ObfuscatedName("ee.h()Law;")
    public class48 method962() {
        class145 var1 = (class145) this.field2384.method3326();
        if (var1 == null) {
            return null;
        } else if (var1.field2421 == null) {
            return this.method963();
        } else {
            return var1.field2421;
        }
    }

    @ObfuscatedName("ee.n()Law;")
    public class48 method963() {
        class145 var1;
        do {
            var1 = (class145) this.field2384.method3347();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2421 == null);
        return var1.field2421;
    }

    @ObfuscatedName("ee.s()I")
    public int method1080() {
        return 0;
    }

    @ObfuscatedName("ee.c([III)V")
    public void method965(int[] arg0, int arg1, int arg2) {
        this.field2385.method965(arg0, arg1, arg2);
        for (class145 var4 = (class145) this.field2384.method3326(); var4 != null; var4 = (class145) this.field2384.method3347()) {
            if (!this.field2388.method2783(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2422) {
                        this.method2829(var4, arg0, var5, var6, var5 + var6);
                        var4.field2422 -= var6;
                        break;
                    }
                    this.method2829(var4, arg0, var5, var4.field2422, var5 + var6);
                    var5 += var4.field2422;
                    var6 -= var4.field2422;
                } while (!this.field2388.method2751(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ee.am(I)V")
    public void method966(int arg0) {
        this.field2385.method966(arg0);
        for (class145 var2 = (class145) this.field2384.method3326(); var2 != null; var2 = (class145) this.field2384.method3347()) {
            if (!this.field2388.method2783(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2422) {
                        this.method2825(var2, var3);
                        var2.field2422 -= var3;
                        break;
                    }
                    this.method2825(var2, var2.field2422);
                    var3 -= var2.field2422;
                } while (!this.field2388.method2751(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ee.j(Let;[IIIII)V")
    public void method2829(class145 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2388.field2359[arg0.field2415] & 0x4) != 0 && arg0.field2404 < 0) {
            int var6 = this.field2388.field2363[arg0.field2415] / Statics.field1205;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2406) / var6;
                if (var7 > arg3) {
                    arg0.field2406 += arg3 * var6;
                    break;
                }
                arg0.field2421.method965(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2406 += var6 * var7 - 1048576;
                int var8 = Statics.field1205 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2421;
                if (this.field2388.field2362[arg0.field2415] == 0) {
                    arg0.field2421 = class45.method1008(arg0.field2410, var10.method1047(), var10.method950(), var10.method951());
                } else {
                    arg0.field2421 = class45.method1008(arg0.field2410, var10.method1047(), 0, var10.method951());
                    this.field2388.method2732(arg0, arg0.field2405.field2342[arg0.field2408] < 0);
                    arg0.field2421.method955(var8, var10.method950());
                }
                if (arg0.field2405.field2342[arg0.field2408] < 0) {
                    arg0.field2421.method967(-1);
                }
                var10.method957(var8);
                var10.method965(arg1, arg2, arg4 - arg2);
                if (var10.method961()) {
                    this.field2385.method1123(var10);
                }
            }
        }
        arg0.field2421.method965(arg1, arg2, arg3);
    }

    @ObfuscatedName("ee.r(Let;II)V")
    public void method2825(class145 arg0, int arg1) {
        if ((this.field2388.field2359[arg0.field2415] & 0x4) != 0 && arg0.field2404 < 0) {
            int var3 = this.field2388.field2363[arg0.field2415] / Statics.field1205;
            int var4 = (var3 + 1048575 - arg0.field2406) / var3;
            arg0.field2406 = arg0.field2406 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2388.field2362[arg0.field2415] == 0) {
                    arg0.field2421 = class45.method1008(arg0.field2410, arg0.field2421.method1047(), arg0.field2421.method950(), arg0.field2421.method951());
                } else {
                    arg0.field2421 = class45.method1008(arg0.field2410, arg0.field2421.method1047(), 0, arg0.field2421.method951());
                    this.field2388.method2732(arg0, arg0.field2405.field2342[arg0.field2408] < 0);
                }
                if (arg0.field2405.field2342[arg0.field2408] < 0) {
                    arg0.field2421.method967(-1);
                }
                arg1 = arg0.field2406 / var3;
            }
        }
        arg0.field2421.method966(arg1);
    }
}
