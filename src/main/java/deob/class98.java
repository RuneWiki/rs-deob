package deob;

@ObfuscatedName("dz")
public final class class98 extends class93 {

    @ObfuscatedName("dz.aj")
    public class193 field1277;

    @ObfuscatedName("dz.al")
    public String field1278 = "";

    @ObfuscatedName("dz.ab")
    public int field1279 = 31;

    @ObfuscatedName("dz.ao")
    public class479 field1281;

    @ObfuscatedName("dz.av")
    public class192 field1282;

    @ObfuscatedName("dz.aq")
    public static int field1283 = 1;

    @ObfuscatedName("dz.ap")
    public class192 field1284;

    @ObfuscatedName("dz.ar")
    public static int field1285 = 1;

    @ObfuscatedName("dz.aj(Ljava/lang/String;B)V")
    public void method2497(String arg0) {
        this.field1278 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("dz.ac(IB)V")
    public void method2453(int arg0) {
        this.field1279 = arg0;
    }

    @ObfuscatedName("dz.ab(II)Z")
    public boolean method2439(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1279 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("dz.an(I)Ljava/lang/String;")
    public final String method2479() {
        if (!this.field1278.isEmpty()) {
            return this.field1278;
        }
        class193 var1 = this.field1277;
        if (var1.field2032 != null) {
            var1 = var1.method3355();
            if (var1 == null) {
                var1 = this.field1277;
            }
        }
        return var1.field1993;
    }

    @ObfuscatedName("dz.ao(ILis;B)V")
    public final void method2441(int arg0, class212 arg1) {
        int var3 = this.field1212[0];
        int var4 = this.field1171[0];
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
        if (this.field1183 != -1 && class206.method5217(this.field1183).field2256 == 1) {
            this.field1183 = -1;
        }
        if (this.field1211 < 9) {
            this.field1211++;
        }
        for (int var5 = this.field1211; var5 > 0; var5--) {
            this.field1212[var5] = this.field1212[var5 - 1];
            this.field1171[var5] = this.field1171[var5 - 1];
            this.field1214[var5] = this.field1214[var5 - 1];
        }
        this.field1212[0] = var3;
        this.field1171[0] = var4;
        this.field1214[0] = arg1;
    }

    @ObfuscatedName("dz.ap(IIZI)V")
    public final void method2442(int arg0, int arg1, boolean arg2) {
        if (this.field1183 != -1 && class206.method5217(this.field1183).field2256 == 1) {
            this.field1183 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1212[0];
            int var5 = arg1 - this.field1171[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1211 < 9) {
                    this.field1211++;
                }
                for (int var6 = this.field1211; var6 > 0; var6--) {
                    this.field1212[var6] = this.field1212[var6 - 1];
                    this.field1171[var6] = this.field1171[var6 - 1];
                    this.field1214[var6] = this.field1214[var6 - 1];
                }
                this.field1212[0] = arg0;
                this.field1171[0] = arg1;
                this.field1214[0] = class212.field2333;
                return;
            }
        }
        this.field1211 = 0;
        this.field1216 = 0;
        this.field1215 = 0;
        this.field1212[0] = arg0;
        this.field1171[0] = arg1;
        this.field1200 = this.field1212[0] * 128 + this.field1143 * 64;
        this.field1205 = this.field1171[0] * 128 + this.field1143 * 64;
    }

    @ObfuscatedName("dz.al(I)Lix;")
    public final class231 method1936() {
        if (this.field1277 == null) {
            return null;
        }
        class206 var1 = this.field1183 != -1 && this.field1189 == 0 ? class206.method5217(this.field1183) : null;
        class206 var2 = this.field1179 == -1 || this.field1179 == this.field1145 && var1 != null ? null : class206.method5217(this.field1179);
        class231 var3 = this.field1277.method3352(var1, this.field1184, var2, this.field1180, this.field1282);
        if (var3 == null) {
            return null;
        }
        var3.method4242();
        this.field1178 = var3.field2587;
        int var4 = var3.field2691;
        if (this.field1148 != -1 && this.field1188 != -1) {
            class231 var5 = class195.method298(this.field1148).method3405(this.field1188);
            if (var5 != null) {
                var5.method4258(0, -this.field1192, 0);
                class231[] var6 = new class231[] { var3, var5 };
                var3 = new class231(var6, 2);
            }
        }
        if (this.field1277.field1994 == 1) {
            var3.field2683 = true;
        }
        if (this.field1207 == 0 || client.field494 < this.field1202 || client.field494 >= this.field1160) {
            var3.field2708 = 0;
        } else {
            var3.field2709 = this.field1204;
            var3.field2723 = this.field1186;
            var3.field2666 = this.field1166;
            var3.field2708 = this.field1207;
            var3.field2726 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dz.au(I)Z")
    public final boolean method2204() {
        return this.field1277 != null;
    }

    @ObfuscatedName("dz.ar(I)[I")
    public int[] method2443() {
        return this.field1281 == null ? this.field1277.method3360() : this.field1281.method8166();
    }

    @ObfuscatedName("dz.ak(B)[S")
    public short[] method2444() {
        return this.field1281 == null ? this.field1277.method3356() : this.field1281.method8167();
    }

    @ObfuscatedName("dz.ax(IISI)V")
    public void method2445(int arg0, int arg1, short arg2) {
        if (this.field1281 == null) {
            this.field1281 = new class479(this.field1277);
        }
        this.field1281.method8168(arg0, arg1, arg2);
    }

    @ObfuscatedName("dz.as([I[SI)V")
    public void method2446(int[] arg0, short[] arg1) {
        if (this.field1281 == null) {
            this.field1281 = new class479(this.field1277);
        }
        this.field1281.method8165(arg0, arg1);
    }

    @ObfuscatedName("dz.ay(I)V")
    public void method2463() {
        this.field1281 = null;
    }

    @ObfuscatedName("dz.am(Lhj;I)V")
    public void method2448(class192 arg0) {
        this.field1284 = arg0;
    }

    @ObfuscatedName("dz.az(I)Lhj;")
    public class192 method2449() {
        return this.field1284;
    }

    @ObfuscatedName("dz.ae(Lhj;I)V")
    public void method2450(class192 arg0) {
        this.field1282 = arg0;
    }

    @ObfuscatedName("dz.ag(B)V")
    public void method2467() {
        this.field1284 = null;
    }

    @ObfuscatedName("dz.at(B)V")
    public void method2485() {
        this.field1282 = null;
    }
}
