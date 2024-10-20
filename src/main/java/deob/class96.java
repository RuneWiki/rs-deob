package deob;

@ObfuscatedName("df")
public final class class96 extends class91 {

    @ObfuscatedName("df.af")
    public class191 field1277;

    @ObfuscatedName("df.aw")
    public String field1273 = "";

    @ObfuscatedName("df.au")
    public int field1272 = 31;

    @ObfuscatedName("df.ab")
    public class490 field1283;

    @ObfuscatedName("df.aq")
    public class190 field1276;

    @ObfuscatedName("df.al")
    public static int field1278 = 1;

    @ObfuscatedName("df.at")
    public class190 field1279;

    @ObfuscatedName("df.aa")
    public static int field1275 = 1;

    @ObfuscatedName("df.af(Ljava/lang/String;I)V")
    public void method2435(String arg0) {
        this.field1273 = arg0 == null ? "" : arg0;
    }

    @ObfuscatedName("df.aw(II)V")
    public void method2483(int arg0) {
        this.field1272 = arg0;
    }

    @ObfuscatedName("df.ac(II)Z")
    public boolean method2467(int arg0) {
        if (arg0 >= 0 && arg0 <= 4) {
            return (this.field1272 & 0x1 << arg0) != 0;
        } else {
            return true;
        }
    }

    @ObfuscatedName("df.at(I)Ljava/lang/String;")
    public final String method2470() {
        if (!this.field1273.isEmpty()) {
            return this.field1273;
        }
        class191 var1 = this.field1277;
        if (var1.field2045 != null) {
            var1 = var1.method3458();
            if (var1 == null) {
                var1 = this.field1277;
            }
        }
        return var1.field2013;
    }

    @ObfuscatedName("df.aa(ILiu;B)V")
    public final void method2439(int arg0, class211 arg1) {
        int var3 = this.field1174[0];
        int var4 = this.field1176[0];
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
        if (this.field1202 != -1 && class204.method2139(this.field1202).field2314 == 1) {
            this.field1202 = -1;
        }
        if (this.field1206 < 9) {
            this.field1206++;
        }
        for (int var5 = this.field1206; var5 > 0; var5--) {
            this.field1174[var5] = this.field1174[var5 - 1];
            this.field1176[var5] = this.field1176[var5 - 1];
            this.field1199[var5] = this.field1199[var5 - 1];
        }
        this.field1174[0] = var3;
        this.field1176[0] = var4;
        this.field1199[0] = arg1;
    }

    @ObfuscatedName("df.ay(IIZI)V")
    public final void method2440(int arg0, int arg1, boolean arg2) {
        if (this.field1202 != -1 && class204.method2139(this.field1202).field2314 == 1) {
            this.field1202 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field1174[0];
            int var5 = arg1 - this.field1176[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field1206 < 9) {
                    this.field1206++;
                }
                for (int var6 = this.field1206; var6 > 0; var6--) {
                    this.field1174[var6] = this.field1174[var6 - 1];
                    this.field1176[var6] = this.field1176[var6 - 1];
                    this.field1199[var6] = this.field1199[var6 - 1];
                }
                this.field1174[0] = arg0;
                this.field1176[0] = arg1;
                this.field1199[0] = class211.field2390;
                return;
            }
        }
        this.field1206 = 0;
        this.field1211 = 0;
        this.field1210 = 0;
        this.field1174[0] = arg0;
        this.field1176[0] = arg1;
        this.field1171 = this.field1174[0] * 128 + this.field1141 * 64;
        this.field1138 = this.field1176[0] * 128 + this.field1141 * 64;
    }

    @ObfuscatedName("df.an(B)Lit;")
    public final class232 method1921() {
        if (this.field1277 == null) {
            return null;
        }
        class204 var1 = this.field1202 != -1 && this.field1184 == 0 ? class204.method2139(this.field1202) : null;
        class204 var2 = this.field1187 == -1 || this.field1187 == this.field1139 && var1 != null ? null : class204.method2139(this.field1187);
        Object var3 = null;
        class232 var4;
        if (this.field1276 != null && this.field1276.field2005) {
            var4 = Statics.field3454.field1097.method5450(var1, this.field1182, var2, this.field1178);
        } else {
            var4 = this.field1277.method3455(var1, this.field1182, var2, this.field1178, this.field1276);
        }
        if (var4 == null) {
            return null;
        }
        var4.method4451();
        this.field1196 = var4.field2619;
        int var5 = var4.field2697;
        class232 var6 = this.method2254(var4);
        if (this.field1277.field2042 == 1) {
            var6.field2714 = true;
        }
        if (this.field1209 == 0 || client.field602 < this.field1169 || client.field602 >= this.field1157) {
            var6.field2762 = 0;
        } else {
            var6.field2757 = this.field1181;
            var6.field2715 = this.field1200;
            var6.field2754 = this.field1201;
            var6.field2762 = this.field1209;
            var6.field2756 = (short) var5;
        }
        return var6;
    }

    @ObfuscatedName("df.as(I)Z")
    public final boolean method2188() {
        return this.field1277 != null;
    }

    @ObfuscatedName("df.ao(B)[I")
    public int[] method2442() {
        return this.field1283 == null ? this.field1277.method3463() : this.field1283.method8501();
    }

    @ObfuscatedName("df.ax(I)[S")
    public short[] method2452() {
        return this.field1283 == null ? this.field1277.method3465() : this.field1283.method8494();
    }

    @ObfuscatedName("df.ai(IISI)V")
    public void method2444(int arg0, int arg1, short arg2) {
        if (this.field1283 == null) {
            this.field1283 = new class490(this.field1277);
        }
        this.field1283.method8495(arg0, arg1, arg2);
    }

    @ObfuscatedName("df.ag([I[SI)V")
    public void method2464(int[] arg0, short[] arg1) {
        if (this.field1283 == null) {
            this.field1283 = new class490(this.field1277);
        }
        this.field1283.method8507(arg0, arg1);
    }

    @ObfuscatedName("df.ah(B)V")
    public void method2479() {
        this.field1283 = null;
    }

    @ObfuscatedName("df.av(Lhv;I)V")
    public void method2447(class190 arg0) {
        this.field1279 = arg0;
    }

    @ObfuscatedName("df.ar(I)Lhv;")
    public class190 method2448() {
        return this.field1279;
    }

    @ObfuscatedName("df.am(Lhv;I)V")
    public void method2449(class190 arg0) {
        this.field1276 = arg0;
    }

    @ObfuscatedName("df.aj(S)V")
    public void method2488() {
        this.field1279 = null;
    }

    @ObfuscatedName("df.ak(B)V")
    public void method2451() {
        this.field1276 = null;
    }
}
