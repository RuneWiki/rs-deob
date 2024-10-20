package deob;

@ObfuscatedName("cg")
public final class class97 extends class92 {

    @ObfuscatedName("cg.h")
    public class187 field1319;

    @ObfuscatedName("cg.e")
    public String field1312 = "";

    @ObfuscatedName("cg.x")
    public int field1313 = 31;

    @ObfuscatedName("cg.m")
    public class468 field1314;

    @ObfuscatedName("cg.q")
    public class186 field1315;

    @ObfuscatedName("cg.f")
    public static int field1316 = 1;

    @ObfuscatedName("cg.r")
    public class186 field1317;

    @ObfuscatedName("cg.u")
    public static int field1318 = 1;

    @ObfuscatedName("cg.h(Ljava/lang/String;I)V")
    public void method2441(String arg0) {
        this.field1312 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("cg.m(II)V")
    public void method2404(int arg0) {
        this.field1313 = arg0;
    }

    @ObfuscatedName("cg.q(II)Z")
    public boolean method2444(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1313 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cg.f(I)Ljava/lang/String;")
    public final String method2408() {
        if (!this.field1312.isEmpty()) {
            return this.field1312;
        }
        class187 var1 = this.field1319;
        if (var1.field2059 != null) {
            var1 = var1.method3323();
            if (var1 == null) {
                var1 = this.field1319;
            }
        }
        return var1.field2025;
    }

    @ObfuscatedName("cg.r(ILgs;B)V")
    public final void method2406(int arg0, class205 arg1) {
        int var3 = this.field1204[0];
        int var4 = this.field1252[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field1220 != -1 && class199.method4223(this.field1220).field2285 == 1) {
            this.field1220 = -1;
        }
        if (this.field1178 < 9) {
            this.field1178++;
        }
        for (int var5 = this.field1178; var5 > 0; var5--) {
            this.field1204[var5] = this.field1204[var5 - 1];
            this.field1252[var5] = this.field1252[var5 - 1];
            this.field1232[var5] = this.field1232[var5 - 1];
        }
        this.field1204[0] = var3;
        this.field1252[0] = var4;
        this.field1232[0] = arg1;
    }

    @ObfuscatedName("cg.u(IIZI)V")
    public final void method2407(int arg0, int arg1, boolean arg2) {
        if (this.field1220 != -1 && class199.method4223(this.field1220).field2285 == 1) {
            this.field1220 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1204[0];
            int var5 = arg1 - this.field1252[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1178 < 9) {
                    this.field1178++;
                }
                for (int var6 = this.field1178; var6 > 0; var6--) {
                    this.field1204[var6] = this.field1204[var6 - 1];
                    this.field1252[var6] = this.field1252[var6 - 1];
                    this.field1232[var6] = this.field1232[var6 - 1];
                }
                this.field1204[0] = arg0;
                this.field1252[0] = arg1;
                this.field1232[0] = class205.field2356;
                return;
            }
        }
        this.field1178 = 0;
        this.field1253 = 0;
        this.field1240 = 0;
        this.field1204[0] = arg0;
        this.field1252[0] = arg1;
        this.field1243 = this.field1204[0] * 128 + this.field1182 * 64;
        this.field1179 = this.field1252[0] * 128 + this.field1182 * 64;
    }

    @ObfuscatedName("cg.e(I)Lhh;")
    public final class224 method1915() {
        if (this.field1319 == null) {
            return null;
        }
        class199 var1 = this.field1220 != -1 && this.field1223 == 0 ? class199.method4223(this.field1220) : null;
        class199 var2 = this.field1216 == -1 || this.field1216 == this.field1184 && var1 != null ? null : class199.method4223(this.field1216);
        class224 var3 = this.field1319.method3378(var1, this.field1211, var2, this.field1217, this.field1315);
        if (var3 == null) {
            return null;
        }
        var3.method4301();
        this.field1238 = var3.field2603;
        int var4 = var3.field2717;
        if (this.field1225 != -1 && this.field1226 != -1) {
            class224 var5 = class189.method3000(this.field1225).method3385(this.field1226);
            if (var5 != null) {
                var5.method4297(0, -this.field1247, 0);
                class224[] var6 = new class224[] { var3, var5 };
                var3 = new class224(var6, 2);
            }
        }
        if (this.field1319.field2035 == 1) {
            var3.field2699 = true;
        }
        if (this.field1244 == 0 || client.field519 < this.field1239 || client.field519 >= this.field1201) {
            var3.field2680 = 0;
        } else {
            var3.field2738 = this.field1241;
            var3.field2739 = this.field1221;
            var3.field2740 = this.field1233;
            var3.field2680 = this.field1244;
            var3.field2742 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cg.s(I)Z")
    public final boolean method2164() {
        return this.field1319 != null;
    }

    @ObfuscatedName("cg.b(B)[I")
    public int[] method2419() {
        return this.field1314 == null ? this.field1319.method3333() : this.field1314.method8039();
    }

    @ObfuscatedName("cg.j(B)[S")
    public short[] method2411() {
        return this.field1314 == null ? this.field1319.method3370() : this.field1314.method8041();
    }

    @ObfuscatedName("cg.g(IISI)V")
    public void method2412(int arg0, int arg1, short arg2) {
        if (this.field1314 == null) {
            this.field1314 = new class468(this.field1319);
        }
        this.field1314.method8042(arg0, arg1, arg2);
    }

    @ObfuscatedName("cg.i([I[SI)V")
    public void method2413(int[] arg0, short[] arg1) {
        if (this.field1314 == null) {
            this.field1314 = new class468(this.field1319);
        }
        this.field1314.method8043(arg0, arg1);
    }

    @ObfuscatedName("cg.o(B)V")
    public void method2414() {
        this.field1314 = null;
    }

    @ObfuscatedName("cg.n(Lgp;I)V")
    public void method2415(class186 arg0) {
        this.field1317 = arg0;
    }

    @ObfuscatedName("cg.k(I)Lgp;")
    public class186 method2416() {
        return this.field1317;
    }

    @ObfuscatedName("cg.a(Lgp;I)V")
    public void method2417(class186 arg0) {
        this.field1315 = arg0;
    }

    @ObfuscatedName("cg.l(I)V")
    public void method2430() {
        this.field1317 = null;
    }

    @ObfuscatedName("cg.t(I)V")
    public void method2437() {
        this.field1315 = null;
    }
}
