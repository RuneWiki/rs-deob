package deob;

@ObfuscatedName("n")
public final class class24 extends class28 {

    @ObfuscatedName("n.u")
    public String field244;

    @ObfuscatedName("n.x")
    public class167 field256;

    @ObfuscatedName("n.i")
    public int field241 = -1;

    @ObfuscatedName("n.a")
    public int field243 = -1;

    @ObfuscatedName("n.c")
    public String[] field267 = new String[3];

    @ObfuscatedName("n.d")
    public int field246;

    @ObfuscatedName("n.l")
    public int field249;

    @ObfuscatedName("n.g")
    public int field248;

    @ObfuscatedName("n.z")
    public int field268;

    @ObfuscatedName("n.t")
    public int field250;

    @ObfuscatedName("n.m")
    public int field251;

    @ObfuscatedName("n.q")
    public int field252;

    @ObfuscatedName("n.e")
    public int field253;

    @ObfuscatedName("n.v")
    public class83 field240;

    @ObfuscatedName("n.j")
    public int field255;

    @ObfuscatedName("n.p")
    public int field259;

    @ObfuscatedName("n.k")
    public int field257;

    @ObfuscatedName("n.r")
    public int field258;

    @ObfuscatedName("n.y")
    public boolean field247;

    @ObfuscatedName("n.h")
    public int field260;

    @ObfuscatedName("n.s")
    public boolean field261;

    @ObfuscatedName("n.w")
    public int field262;

    @ObfuscatedName("n.n")
    public int field245;

    @ObfuscatedName("n.o")
    public boolean field264;

    @ObfuscatedName("n.b")
    public int field265;

    @ObfuscatedName("n.aj")
    public int field266;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field267[var1] = "";
        }
        this.field246 = 0;
        this.field249 = 0;
        this.field268 = 0;
        this.field250 = 0;
        this.field247 = false;
        this.field260 = 0;
        this.field261 = false;
        this.field264 = false;
    }

    @ObfuscatedName("n.u(Len;I)V")
    public final void method215(class154 arg0) {
        arg0.field2073 = 0;
        int var2 = arg0.method2708();
        this.field241 = arg0.method2754();
        this.field243 = arg0.method2754();
        int var3 = -1;
        this.field260 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2708();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2708();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2581();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = Statics.method1768(var4[var5] - 512).field2955;
                    if (var8 != 0) {
                        this.field260 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2708();
            if (var11 < 0 || var11 >= Statics.field3230[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field605 = arg0.method2581();
        if (this.field605 == 65535) {
            this.field605 = -1;
        }
        this.field606 = arg0.method2581();
        if (this.field606 == 65535) {
            this.field606 = -1;
        }
        this.field627 = this.field606;
        this.field608 = arg0.method2581();
        if (this.field608 == 65535) {
            this.field608 = -1;
        }
        this.field609 = arg0.method2581();
        if (this.field609 == 65535) {
            this.field609 = -1;
        }
        this.field640 = arg0.method2581();
        if (this.field640 == 65535) {
            this.field640 = -1;
        }
        this.field615 = arg0.method2581();
        if (this.field615 == 65535) {
            this.field615 = -1;
        }
        this.field623 = arg0.method2581();
        if (this.field623 == 65535) {
            this.field623 = -1;
        }
        this.field244 = arg0.method2778();
        if (Statics.field2019 == this) {
            Statics.field2107 = this.field244;
        }
        this.field246 = arg0.method2708();
        this.field249 = arg0.method2581();
        this.field261 = arg0.method2708() == 1;
        if (client.field417 == 0 && client.field353 >= 2) {
            this.field261 = false;
        }
        if (this.field256 == null) {
            this.field256 = new class167();
        }
        this.field256.method2922(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("n.x(I)I")
    public int method216() {
        return this.field256 == null || this.field256.field2152 == -1 ? 1 : class200.method614(this.field256.field2152).field3008;
    }

    @ObfuscatedName("n.i(B)Lcs;")
    public final class83 method217() {
        if (this.field256 == null) {
            return null;
        }
        class202 var1 = this.field632 != -1 && this.field653 == 0 ? class202.method3327(this.field632) : null;
        class202 var2 = this.field629 == -1 || this.field247 || this.field629 == this.field605 && var1 != null ? null : class202.method3327(this.field629);
        class83 var3 = this.field256.method2955(var1, this.field633, var2, this.field630);
        if (var3 == null) {
            return null;
        }
        var3.method1462();
        this.field650 = var3.field1541;
        if (!this.field247 && this.field637 != -1 && this.field635 != -1) {
            class83 var4 = class191.method3182(this.field637).method3239(this.field635);
            if (var4 != null) {
                var4.method1480(0, -this.field641, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field247 && this.field240 != null) {
            if (client.field291 >= this.field250) {
                this.field240 = null;
            }
            if (client.field291 >= this.field268 && client.field291 < this.field250) {
                class83 var6 = this.field240;
                var6.method1480(this.field251 - this.field612, this.field252 - this.field248, this.field253 - this.field601);
                if (this.field651 == 512) {
                    var6.method1455();
                    var6.method1455();
                    var6.method1455();
                } else if (this.field651 == 1024) {
                    var6.method1455();
                    var6.method1455();
                } else if (this.field651 == 1536) {
                    var6.method1455();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field651 == 512) {
                    var6.method1455();
                } else if (this.field651 == 1024) {
                    var6.method1455();
                    var6.method1455();
                } else if (this.field651 == 1536) {
                    var6.method1455();
                    var6.method1455();
                    var6.method1455();
                }
                var6.method1480(this.field612 - this.field251, this.field248 - this.field252, this.field601 - this.field253);
            }
        }
        var3.field1382 = true;
        return var3;
    }

    @ObfuscatedName("n.a(IIBI)V")
    public final void method218(int arg0, int arg1, byte arg2) {
        if (this.field632 != -1 && class202.method3327(this.field632).field3040 == 1) {
            this.field632 = -1;
        }
        this.field628 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method219(arg0, arg1);
        } else if (this.field655[0] >= 0 && this.field655[0] < 104 && this.field610[0] >= 0 && this.field610[0] < 104) {
            if (arg2 == 2) {
                client.method171(this, arg0, arg1, (byte) 2);
            }
            this.method220(arg0, arg1, arg2);
        } else {
            this.method219(arg0, arg1);
        }
    }

    @ObfuscatedName("n.c(IIB)V")
    public void method219(int arg0, int arg1) {
        this.field654 = 0;
        this.field659 = 0;
        this.field658 = 0;
        this.field655[0] = arg0;
        this.field610[0] = arg1;
        int var3 = this.method216();
        this.field612 = this.field655[0] * 128 + var3 * 64;
        this.field601 = this.field610[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("n.g(IIBI)V")
    public final void method220(int arg0, int arg1, byte arg2) {
        if (this.field654 < 9) {
            this.field654++;
        }
        for (int var4 = this.field654; var4 > 0; var4--) {
            this.field655[var4] = this.field655[var4 - 1];
            this.field610[var4] = this.field610[var4 - 1];
            this.field657[var4] = this.field657[var4 - 1];
        }
        this.field655[0] = arg0;
        this.field610[0] = arg1;
        this.field657[0] = arg2;
    }

    @ObfuscatedName("n.z(I)Z")
    public final boolean method221() {
        return this.field256 != null;
    }
}
