package deob;

@ObfuscatedName("el")
public class class144 extends class48 {

    @ObfuscatedName("el.p")
    public class142 field2417;

    @ObfuscatedName("el.e")
    public class177 field2416 = new class177();

    @ObfuscatedName("el.a")
    public class46 field2418 = new class46();

    public class144(class142 arg0) {
        this.field2417 = arg0;
    }

    @ObfuscatedName("el.d()Las;")
    public class48 method985() {
        class146 var1 = (class146) this.field2416.method3325();
        if (var1 == null) {
            return null;
        } else if (var1.field2452 == null) {
            return this.method986();
        } else {
            return var1.field2452;
        }
    }

    @ObfuscatedName("el.t()Las;")
    public class48 method986() {
        class146 var1;
        do {
            var1 = (class146) this.field2416.method3333();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2452 == null);
        return var1.field2452;
    }

    @ObfuscatedName("el.b()I")
    public int method1041() {
        return 0;
    }

    @ObfuscatedName("el.c([III)V")
    public void method994(int[] arg0, int arg1, int arg2) {
        this.field2418.method994(arg0, arg1, arg2);
        for (class146 var4 = (class146) this.field2416.method3325(); var4 != null; var4 = (class146) this.field2416.method3333()) {
            if (!this.field2417.method2839(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2453) {
                        this.method2914(var4, arg0, var5, var6, var5 + var6);
                        var4.field2453 -= var6;
                        break;
                    }
                    this.method2914(var4, arg0, var5, var4.field2453, var5 + var6);
                    var5 += var4.field2453;
                    var6 -= var4.field2453;
                } while (!this.field2417.method2840(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("el.aw(I)V")
    public void method1061(int arg0) {
        this.field2418.method1061(arg0);
        for (class146 var2 = (class146) this.field2416.method3325(); var2 != null; var2 = (class146) this.field2416.method3333()) {
            if (!this.field2417.method2839(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2453) {
                        this.method2915(var2, var3);
                        var2.field2453 -= var3;
                        break;
                    }
                    this.method2915(var2, var2.field2453);
                    var3 -= var2.field2453;
                } while (!this.field2417.method2840(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("el.p(Lek;[IIIII)V")
    public void method2914(class146 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2417.field2391[arg0.field2443] & 0x4) != 0 && arg0.field2438 < 0) {
            int var6 = this.field2417.field2389[arg0.field2443] / Statics.field2457;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2446) / var6;
                if (var7 > arg3) {
                    arg0.field2446 += arg3 * var6;
                    break;
                }
                arg0.field2452.method994(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2446 += var6 * var7 - 1048576;
                int var8 = Statics.field2457 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class45 var10 = arg0.field2452;
                if (this.field2417.field2396[arg0.field2443] == 0) {
                    arg0.field2452 = class45.method968(arg0.field2436, var10.method1069(), var10.method974(), var10.method1100());
                } else {
                    arg0.field2452 = class45.method968(arg0.field2436, var10.method1069(), 0, var10.method1100());
                    this.field2417.method2824(arg0, arg0.field2454.field2365[arg0.field2439] < 0);
                    arg0.field2452.method976(var8, var10.method974());
                }
                if (arg0.field2454.field2365[arg0.field2439] < 0) {
                    arg0.field2452.method970(-1);
                }
                var10.method980(var8);
                var10.method994(arg1, arg2, arg4 - arg2);
                if (var10.method984()) {
                    this.field2418.method1121(var10);
                }
            }
        }
        arg0.field2452.method994(arg1, arg2, arg3);
    }

    @ObfuscatedName("el.e(Lek;II)V")
    public void method2915(class146 arg0, int arg1) {
        if ((this.field2417.field2391[arg0.field2443] & 0x4) != 0 && arg0.field2438 < 0) {
            int var3 = this.field2417.field2389[arg0.field2443] / Statics.field2457;
            int var4 = (var3 + 1048575 - arg0.field2446) / var3;
            arg0.field2446 = arg0.field2446 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2417.field2396[arg0.field2443] == 0) {
                    arg0.field2452 = class45.method968(arg0.field2436, arg0.field2452.method1069(), arg0.field2452.method974(), arg0.field2452.method1100());
                } else {
                    arg0.field2452 = class45.method968(arg0.field2436, arg0.field2452.method1069(), 0, arg0.field2452.method1100());
                    this.field2417.method2824(arg0, arg0.field2454.field2365[arg0.field2439] < 0);
                }
                if (arg0.field2454.field2365[arg0.field2439] < 0) {
                    arg0.field2452.method970(-1);
                }
                arg1 = arg0.field2446 / var3;
            }
        }
        arg0.field2452.method1061(arg1);
    }
}
