package deob;

@ObfuscatedName("ev")
public class class144 extends class48 {

    @ObfuscatedName("ev.j")
    public class142 field2406;

    @ObfuscatedName("ev.f")
    public class177 field2404 = new class177();

    @ObfuscatedName("ev.o")
    public class46 field2407 = new class46();

    public class144(class142 arg0) {
        this.field2406 = arg0;
    }

    @ObfuscatedName("ev.v()Lav;")
    public class48 method1009() {
        class146 var1 = (class146) this.field2404.method3338();
        if (var1 == null) {
            return null;
        } else if (var1.field2437 == null) {
            return this.method966();
        } else {
            return var1.field2437;
        }
    }

    @ObfuscatedName("ev.d()Lav;")
    public class48 method966() {
        class146 var1;
        do {
            var1 = (class146) this.field2404.method3323();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2437 == null);
        return var1.field2437;
    }

    @ObfuscatedName("ev.e()I")
    public int method967() {
        return 0;
    }

    @ObfuscatedName("ev.y([III)V")
    public void method1029(int[] arg0, int arg1, int arg2) {
        this.field2407.method1029(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2404.method3338(); var4 != null; var4 = (class146) this.field2404.method3323()) {
            if (!this.field2406.method2810(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2443) {
                        this.method2878(var4, arg0, var5, var6, var5 + var6);
                        var4.field2443 -= var6;
                        break;
                    }
                    this.method2878(var4, arg0, var5, var4.field2443, var5 + var6);
                    var5 += var4.field2443;
                    var6 -= var4.field2443;
                } while (!this.field2406.method2811(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("ev.aw(I)V")
    public void method969(int arg0) {
        this.field2407.method969(arg0);
        for (class146 var2 = (class146) this.field2404.method3338(); var2 != null; var2 = (class146) this.field2404.method3323()) {
            if (!this.field2406.method2810(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2443) {
                        this.method2879(var2, var3);
                        var2.field2443 -= var3;
                        break;
                    }
                    this.method2879(var2, var2.field2443);
                    var3 -= var2.field2443;
                } while (!this.field2406.method2811(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("ev.j(Lea;[IIIII)V")
    public void method2878(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2406.field2378[arg0.field2441] & 0x4) != 0 && arg0.field2438 < 0) {
            int var6 = this.field2406.field2392[arg0.field2441] / Statics.field277;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2444) / var6;
                if (var7 > arg3) {
                    arg0.field2444 += arg3 * var6;
                    break;
                }
                arg0.field2437.method1029(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2444 += var6 * var7 - 1048576;
                int var8 = Statics.field277 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2437;
                if (this.field2406.field2381[arg0.field2441] == 0) {
                    arg0.field2437 = class45.method1002(arg0.field2426, var10.method973(), var10.method954(), var10.method955());
                } else {
                    arg0.field2437 = class45.method1002(arg0.field2426, var10.method973(), 0, var10.method955());
                    this.field2406.method2814(arg0, arg0.field2434.field2356[arg0.field2429] < 0);
                    arg0.field2437.method959(var8, var10.method954());
                }
                if (arg0.field2434.field2356[arg0.field2429] < 0) {
                    arg0.field2437.method950(-1);
                }
                var10.method960(var8);
                var10.method1029(arg1, arg2, arg4 - arg2);
                if (var10.method964()) {
                    this.field2407.method1107(var10);
                }
            }
        }
        arg0.field2437.method1029(arg1, arg2, arg3);
    }

    @ObfuscatedName("ev.f(Lea;II)V")
    public void method2879(class146 arg0, int arg1) {
        if ((this.field2406.field2378[arg0.field2441] & 0x4) != 0 && arg0.field2438 < 0) {
            int var3 = this.field2406.field2392[arg0.field2441] / Statics.field277;
            int var4 = (var3 + 1048575 - arg0.field2444) / var3;
            arg0.field2444 = arg0.field2444 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2406.field2381[arg0.field2441] == 0) {
                    arg0.field2437 = class45.method1002(arg0.field2426, arg0.field2437.method973(), arg0.field2437.method954(), arg0.field2437.method955());
                } else {
                    arg0.field2437 = class45.method1002(arg0.field2426, arg0.field2437.method973(), 0, arg0.field2437.method955());
                    this.field2406.method2814(arg0, arg0.field2434.field2356[arg0.field2429] < 0);
                }
                if (arg0.field2434.field2356[arg0.field2429] < 0) {
                    arg0.field2437.method950(-1);
                }
                arg1 = arg0.field2444 / var3;
            }
        }
        arg0.field2437.method969(arg1);
    }
}
