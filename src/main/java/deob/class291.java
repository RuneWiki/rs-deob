package deob;

@ObfuscatedName("kg")
public class class291 extends class50 {

    @ObfuscatedName("kg.h")
    public class288 field3409;

    @ObfuscatedName("kg.e")
    public class352 field3408 = new class352();

    @ObfuscatedName("kg.v")
    public class40 field3410 = new class40();

    public class291(class288 arg0) {
        this.field3409 = arg0;
    }

    @ObfuscatedName("kg.q()Laa;")
    public class50 method737() {
        class293 var1 = (class293) this.field3408.method6086();
        if (var1 == null) {
            return null;
        } else if (var1.field3433 == null) {
            return this.method713();
        } else {
            return var1.field3433;
        }
    }

    @ObfuscatedName("kg.f()Laa;")
    public class50 method713() {
        class293 var1;
        do {
            var1 = (class293) this.field3408.method6088();
            if (var1 == null) {
                return null;
            }
        } while (var1.field3433 == null);
        return var1.field3433;
    }

    @ObfuscatedName("kg.r()I")
    public int method709() {
        return 0;
    }

    @ObfuscatedName("kg.u([III)V")
    public void method715(int[] arg0, int arg1, int arg2) {
        this.field3410.method715(arg0, arg1, arg2);
        for (class293 var4 = (class293) this.field3408.method6086(); var4 != null; var4 = (class293) this.field3408.method6088()) {
            if (!this.field3409.method5048(var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3434) {
                        this.method5186(var4, arg0, var5, var6, var5 + var6);
                        var4.field3434 -= var6;
                        break;
                    }
                    this.method5186(var4, arg0, var5, var4.field3434, var5 + var6);
                    var5 += var4.field3434;
                    var6 -= var4.field3434;
                } while (!this.field3409.method5049(var4, arg0, var5, var6));
            }
        }
    }

    @ObfuscatedName("kg.j(I)V")
    public void method717(int arg0) {
        this.field3410.method717(arg0);
        for (class293 var2 = (class293) this.field3408.method6086(); var2 != null; var2 = (class293) this.field3408.method6088()) {
            if (!this.field3409.method5048(var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3434) {
                        this.method5184(var2, var3);
                        var2.field3434 -= var3;
                        break;
                    }
                    this.method5184(var2, var2.field3434);
                    var3 -= var2.field3434;
                } while (!this.field3409.method5049(var2, (int[]) null, 0, var3));
            }
        }
    }

    @ObfuscatedName("kg.h(Lkx;[IIIII)V")
    public void method5186(class293 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if ((this.field3409.field3357[arg0.field3428] & 0x4) != 0 && arg0.field3416 < 0) {
            int var6 = this.field3409.field3373[arg0.field3428] / Statics.field326;
            while (true) {
                int var7 = (var6 + 1048575 - arg0.field3435) / var6;
                if (var7 > arg3) {
                    arg0.field3435 += arg3 * var6;
                    break;
                }
                arg0.field3433.method715(arg1, arg2, var7);
                arg2 += var7;
                arg3 -= var7;
                arg0.field3435 += var6 * var7 - 1048576;
                int var8 = Statics.field326 / 100;
                int var9 = 262144 / var6;
                if (var9 < var8) {
                    var8 = var9;
                }
                class49 var10 = arg0.field3433;
                if (this.field3409.field3359[arg0.field3428] == 0) {
                    arg0.field3433 = class49.method973(arg0.field3427, var10.method878(), var10.method912(), var10.method881());
                } else {
                    arg0.field3433 = class49.method973(arg0.field3427, var10.method878(), 0, var10.method881());
                    this.field3409.method5073(arg0, arg0.field3418.field3400[arg0.field3420] < 0);
                    arg0.field3433.method874(var8, var10.method912());
                }
                if (arg0.field3418.field3400[arg0.field3420] < 0) {
                    arg0.field3433.method866(-1);
                }
                var10.method876(var8);
                var10.method715(arg1, arg2, arg4 - arg2);
                if (var10.method924()) {
                    this.field3410.method707(var10);
                }
            }
        }
        arg0.field3433.method715(arg1, arg2, arg3);
    }

    @ObfuscatedName("kg.e(Lkx;II)V")
    public void method5184(class293 arg0, int arg1) {
        if ((this.field3409.field3357[arg0.field3428] & 0x4) != 0 && arg0.field3416 < 0) {
            int var3 = this.field3409.field3373[arg0.field3428] / Statics.field326;
            int var4 = (var3 + 1048575 - arg0.field3435) / var3;
            arg0.field3435 = arg0.field3435 + arg1 * var3 & 0xFFFFF;
            if (var4 <= arg1) {
                if (this.field3409.field3359[arg0.field3428] == 0) {
                    arg0.field3433 = class49.method973(arg0.field3427, arg0.field3433.method878(), arg0.field3433.method912(), arg0.field3433.method881());
                } else {
                    arg0.field3433 = class49.method973(arg0.field3427, arg0.field3433.method878(), 0, arg0.field3433.method881());
                    this.field3409.method5073(arg0, arg0.field3418.field3400[arg0.field3420] < 0);
                }
                if (arg0.field3418.field3400[arg0.field3420] < 0) {
                    arg0.field3433.method866(-1);
                }
                arg1 = arg0.field3435 / var3;
            }
        }
        arg0.field3433.method717(arg1);
    }
}
