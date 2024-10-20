package deob;

@ObfuscatedName("hk")
public class class209 extends class120 {

    @ObfuscatedName("hk.e")
    public class205 field2577;

    @ObfuscatedName("hk.o")
    public class194 field2575 = new class194();

    @ObfuscatedName("hk.m")
    public class103 field2574 = new class103();

    public class209(class205 arg0) {
        this.field2577 = arg0;
    }

    @ObfuscatedName("hk.b()Ldx;")
    public class120 method1708() {
        class206 var1 = (class206) this.field2575.method3336();
        if (var1 == null) {
            return null;
        } else if (var1.field2543 == null) {
            return this.method1707();
        } else {
            return var1.field2543;
        }
    }

    @ObfuscatedName("hk.k()Ldx;")
    public class120 method1707() {
        class206 var1;
        do {
            var1 = (class206) this.field2575.method3324();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2543 == null);
        return var1.field2543;
    }

    @ObfuscatedName("hk.q()I")
    public int method1710() {
        return 0;
    }

    @ObfuscatedName("hk.h([III)V")
    public void method1711(int[] arg0, int arg1, int arg2) {
        this.field2574.method1711(arg0, arg1, arg2);
        for (class206 var4 = (class206) this.field2575.method3336(); var4 != null; var4 = (class206) this.field2575.method3324()) {
            if (!this.field2577.method3442(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2544) {
                        this.method3562(var4, arg0, var5, var6, var5 + var6);
                        var4.field2544 -= var6;
                        break;
                    }
                    this.method3562(var4, arg0, var5, var4.field2544, var5 + var6);
                    var5 += var4.field2544;
                    var6 -= var4.field2544;
                } while (!this.field2577.method3438(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("hk.s(I)V")
    public void method1713(int arg0) {
        this.field2574.method1713(arg0);
        for (class206 var2 = (class206) this.field2575.method3336(); var2 != null; var2 = (class206) this.field2575.method3324()) {
            if (!this.field2577.method3442(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2544) {
                        this.method3568(var2, var3);
                        var2.field2544 -= var3;
                        break;
                    }
                    this.method3568(var2, var2.field2544);
                    var3 -= var2.field2544;
                } while (!this.field2577.method3438(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("hk.e(Lgl;[IIIII)V")
    public void method3562(class206 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2577.field2508[arg0.field2527] & 0x4) != 0 && arg0.field2539 < 0) {
            int var6 = this.field2577.field2513[arg0.field2527] / Statics.field1644;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2545) / var6;
                if (var7 > arg3) {
                    arg0.field2545 += arg3 * var6;
                    break;
                }
                arg0.field2543.method1711(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2545 += var6 * var7 - 1048576;
                int var8 = Statics.field1644 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class118 var10 = arg0.field2543;
                if (this.field2577.field2511[arg0.field2527] == 0) {
                    arg0.field2543 = class118.method1981(arg0.field2534, var10.method1940(), var10.method1942(), var10.method1943());
                } else {
                    arg0.field2543 = class118.method1981(arg0.field2534, var10.method1940(), 0, var10.method1943());
                    this.field2577.method3492(arg0, arg0.field2526.field2567[arg0.field2531] < 0);
                    arg0.field2543.method1947(var8, var10.method1942());
                }
                if (arg0.field2526.field2567[arg0.field2531] < 0) {
                    arg0.field2543.method1938(-1);
                }
                var10.method1949(var8);
                var10.method1711(arg1, arg2, arg4 - arg2);
                if (var10.method1952()) {
                    this.field2574.method1728(var10);
                }
            }
        }
        arg0.field2543.method1711(arg1, arg2, arg3);
    }

    @ObfuscatedName("hk.o(Lgl;II)V")
    public void method3568(class206 arg0, int arg1) {
        if ((this.field2577.field2508[arg0.field2527] & 0x4) != 0 && arg0.field2539 < 0) {
            int var3 = this.field2577.field2513[arg0.field2527] / Statics.field1644;
            int var4 = (var3 + 1048575 - arg0.field2545) / var3;
            arg0.field2545 = arg0.field2545 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2577.field2511[arg0.field2527] == 0) {
                    arg0.field2543 = class118.method1981(arg0.field2534, arg0.field2543.method1940(), arg0.field2543.method1942(), arg0.field2543.method1943());
                } else {
                    arg0.field2543 = class118.method1981(arg0.field2534, arg0.field2543.method1940(), 0, arg0.field2543.method1943());
                    this.field2577.method3492(arg0, arg0.field2526.field2567[arg0.field2531] < 0);
                }
                if (arg0.field2526.field2567[arg0.field2531] < 0) {
                    arg0.field2543.method1938(-1);
                }
                arg1 = arg0.field2545 / var3;
            }
        }
        arg0.field2543.method1713(arg1);
    }
}
