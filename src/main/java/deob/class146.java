package deob;

@ObfuscatedName("em")
public class class146 extends class49 {

    @ObfuscatedName("em.e")
    public class144 field2444;

    @ObfuscatedName("em.i")
    public class179 field2443 = new class179();

    @ObfuscatedName("em.k")
    public class47 field2449 = new class47();

    public class146(class144 arg0) {
        this.field2444 = arg0;
    }

    @ObfuscatedName("em.l()Lac;")
    public class49 method1100() {
        class148 var1 = (class148) this.field2443.method3331();
        if (var1 == null) {
            return null;
        } else if (var1.field2483 == null) {
            return this.method1012();
        } else {
            return var1.field2483;
        }
    }

    @ObfuscatedName("em.n()Lac;")
    public class49 method1012() {
        class148 var1;
        do {
            var1 = (class148) this.field2443.method3333();
            if (var1 == null) {
                return null;
            }
        } while (var1.field2483 == null);
        return var1.field2483;
    }

    @ObfuscatedName("em.h()I")
    public int method1006() {
        return 0;
    }

    @ObfuscatedName("em.v([III)V")
    public void method1014(int[] arg0, int arg1, int arg2) {
        this.field2449.method1014(arg0, arg1, arg2);
        for (class148 var4 = (class148) this.field2443.method3331(); var4 != null; var4 = (class148) this.field2443.method3333()) {
            if (!this.field2444.method2788(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field2484) {
                        this.method2895(var4, arg0, var5, var6, var5 + var6);
                        var4.field2484 -= var6;
                        break;
                    }
                    this.method2895(var4, arg0, var5, var4.field2484, var5 + var6);
                    var5 += var4.field2484;
                    var6 -= var4.field2484;
                } while (!this.field2444.method2891(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("em.ax(I)V")
    public void method1055(int arg0) {
        this.field2449.method1055(arg0);
        for (class148 var2 = (class148) this.field2443.method3331(); var2 != null; var2 = (class148) this.field2443.method3333()) {
            if (!this.field2444.method2788(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2484) {
                        this.method2896(var2, var3);
                        var2.field2484 -= var3;
                        break;
                    }
                    this.method2896(var2, var2.field2484);
                    var3 -= var2.field2484;
                } while (!this.field2444.method2891(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("em.e(Lei;[IIIIB)V")
    public void method2895(class148 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field2444.field2414[arg0.field2470] & 0x4) != 0 && arg0.field2479 < 0) {
            int var6 = this.field2444.field2406[arg0.field2470] / Statics.field1126;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field2467) / var6;
                if (var7 > arg3) {
                    arg0.field2467 += arg3 * var6;
                    break;
                }
                arg0.field2483.method1014(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field2467 += var6 * var7 - 1048576;
                int var8 = Statics.field1126 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class46 var10 = arg0.field2483;
                if (this.field2444.field2417[arg0.field2470] == 0) {
                    arg0.field2483 = class46.method1141(arg0.field2480, var10.method1008(), var10.method1106(), var10.method1121());
                } else {
                    arg0.field2483 = class46.method1141(arg0.field2480, var10.method1008(), 0, var10.method1121());
                    this.field2444.method2786(arg0, arg0.field2474.field2390[arg0.field2481] < 0);
                    arg0.field2483.method1004(var8, var10.method1106());
                }
                if (arg0.field2474.field2390[arg0.field2481] < 0) {
                    arg0.field2483.method996(-1);
                }
                var10.method1015(var8);
                var10.method1014(arg1, arg2, arg4 - arg2);
                if (var10.method1010()) {
                    this.field2449.method1148(var10);
                }
            }
        }
        arg0.field2483.method1014(arg1, arg2, arg3);
    }

    @ObfuscatedName("em.i(Lei;II)V")
    public void method2896(class148 arg0, int arg1) {
        if ((this.field2444.field2414[arg0.field2470] & 0x4) != 0 && arg0.field2479 < 0) {
            int var3 = this.field2444.field2406[arg0.field2470] / Statics.field1126;
            int var4 = (var3 + 1048575 - arg0.field2467) / var3;
            arg0.field2467 = arg0.field2467 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field2444.field2417[arg0.field2470] == 0) {
                    arg0.field2483 = class46.method1141(arg0.field2480, arg0.field2483.method1008(), arg0.field2483.method1106(), arg0.field2483.method1121());
                } else {
                    arg0.field2483 = class46.method1141(arg0.field2480, arg0.field2483.method1008(), 0, arg0.field2483.method1121());
                    this.field2444.method2786(arg0, arg0.field2474.field2390[arg0.field2481] < 0);
                }
                if (arg0.field2474.field2390[arg0.field2481] < 0) {
                    arg0.field2483.method996(-1);
                }
                arg1 = arg0.field2467 / var3;
            }
        }
        arg0.field2483.method1055(arg1);
    }
}
