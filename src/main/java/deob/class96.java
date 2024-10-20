package deob;

@ObfuscatedName("cf")
public final class class96 extends class91 {

    @ObfuscatedName("cf.f")
    public class191 field1295;

    @ObfuscatedName("cf.w")
    public String field1294 = "";

    @ObfuscatedName("cf.s")
    public int field1292 = 31;

    @ObfuscatedName("cf.z")
    public class475 field1293;

    @ObfuscatedName("cf.j")
    public class190 field1291;

    @ObfuscatedName("cf.i")
    public static int field1296 = 1;

    @ObfuscatedName("cf.n")
    public class190 field1290;

    @ObfuscatedName("cf.l")
    public static int field1297 = 1;

    @ObfuscatedName("cf.f(Ljava/lang/String;I)V")
    public void method2497(String arg0) {
        this.field1294 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("cf.v(IB)V")
    public void method2498(int arg0) {
        this.field1292 = arg0;
    }

    @ObfuscatedName("cf.s(II)Z")
    public boolean method2499(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1292 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("cf.k(I)Ljava/lang/String;")
    public final String method2500() {
        if (!this.field1294.isEmpty()) {
            return this.field1294;
        }
        class191 var1 = this.field1295;
        if (var1.field2023 != null) {
            var1 = var1.method3427();
            if (var1 == null) {
                var1 = this.field1295;
            }
        }
        return var1.field2029;
    }

    @ObfuscatedName("cf.c(ILhz;I)V")
    public final void method2504(int arg0, class209 arg1) {
        int var3 = this.field1210[0];
        int var4 = this.field1232[0];
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
        if (this.field1224 != -1 && class203.method2227(this.field1224).field2302 == 1) {
            this.field1224 = -1;
        }
        if (this.field1230 < 9) {
            this.field1230++;
        }
        for (int var5 = this.field1230; var5 > 0; var5--) {
            this.field1210[var5] = this.field1210[var5 - 1];
            this.field1232[var5] = this.field1232[var5 - 1];
            this.field1233[var5] = this.field1233[var5 - 1];
        }
        this.field1210[0] = var3;
        this.field1232[0] = var4;
        this.field1233[0] = arg1;
    }

    @ObfuscatedName("cf.r(IIZI)V")
    public final void method2501(int arg0, int arg1, boolean arg2) {
        if (this.field1224 != -1 && class203.method2227(this.field1224).field2302 == 1) {
            this.field1224 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1210[0];
            int var5 = arg1 - this.field1232[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1230 < 9) {
                    this.field1230++;
                }
                for (int var6 = this.field1230; var6 > 0; var6--) {
                    this.field1210[var6] = this.field1210[var6 - 1];
                    this.field1232[var6] = this.field1232[var6 - 1];
                    this.field1233[var6] = this.field1233[var6 - 1];
                }
                this.field1210[0] = arg0;
                this.field1232[0] = arg1;
                this.field1233[0] = class209.field2361;
                return;
            }
        }
        this.field1230 = 0;
        this.field1231 = 0;
        this.field1176 = 0;
        this.field1210[0] = arg0;
        this.field1232[0] = arg1;
        this.field1204 = this.field1210[0] * 128 + this.field1164 * 64;
        this.field1161 = this.field1232[0] * 128 + this.field1164 * 64;
    }

    @ObfuscatedName("cf.w(I)Lhs;")
    public final class228 method1977() {
        if (this.field1295 == null) {
            return null;
        }
        class203 var1 = this.field1224 != -1 && this.field1205 == 0 ? class203.method2227(this.field1224) : null;
        class203 var2 = this.field1198 == -1 || this.field1198 == this.field1166 && var1 != null ? null : class203.method2227(this.field1198);
        class228 var3 = this.field1295.method3424(var1, this.field1170, var2, this.field1234, this.field1291);
        if (var3 == null) {
            return null;
        }
        var3.method4338();
        this.field1220 = var3.field2609;
        int var4 = var3.field2681;
        if (this.field1207 != -1 && this.field1199 != -1) {
            class228 var5 = class193.method2221(this.field1207).method3483(this.field1199);
            if (var5 != null) {
                var5.method4336(0, -this.field1211, 0);
                class228[] var6 = new class228[] { var3, var5 };
                var3 = new class228(var6, 2);
            }
        }
        if (this.field1295.field2030 == 1) {
            var3.field2702 = true;
        }
        if (this.field1226 == 0 || client.field511 < this.field1177 || client.field511 >= this.field1222) {
            var3.field2743 = 0;
        } else {
            var3.field2712 = this.field1181;
            var3.field2741 = this.field1228;
            var3.field2687 = this.field1225;
            var3.field2743 = this.field1226;
            var3.field2744 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cf.a(I)Z")
    public final boolean method2258() {
        return this.field1295 != null;
    }

    @ObfuscatedName("cf.b(I)[I")
    public int[] method2529() {
        return this.field1293 == null ? this.field1295.method3458() : this.field1293.method8214();
    }

    @ObfuscatedName("cf.m(S)[S")
    public short[] method2517() {
        return this.field1293 == null ? this.field1295.method3450() : this.field1293.method8215();
    }

    @ObfuscatedName("cf.t(IISB)V")
    public void method2503(int arg0, int arg1, short arg2) {
        if (this.field1293 == null) {
            this.field1293 = new class475(this.field1295);
        }
        this.field1293.method8216(arg0, arg1, arg2);
    }

    @ObfuscatedName("cf.h([I[SI)V")
    public void method2496(int[] arg0, short[] arg1) {
        if (this.field1293 == null) {
            this.field1293 = new class475(this.field1295);
        }
        this.field1293.method8219(arg0, arg1);
    }

    @ObfuscatedName("cf.p(I)V")
    public void method2508() {
        this.field1293 = null;
    }

    @ObfuscatedName("cf.o(Lgj;B)V")
    public void method2506(class190 arg0) {
        this.field1290 = arg0;
    }

    @ObfuscatedName("cf.u(B)Lgj;")
    public class190 method2511() {
        return this.field1290;
    }

    @ObfuscatedName("cf.x(Lgj;I)V")
    public void method2514(class190 arg0) {
        this.field1291 = arg0;
    }

    @ObfuscatedName("cf.q(I)V")
    public void method2548() {
        this.field1290 = null;
    }

    @ObfuscatedName("cf.d(I)V")
    public void method2510() {
        this.field1291 = null;
    }
}
