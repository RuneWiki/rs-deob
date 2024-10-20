package deob;

@ObfuscatedName("e")
public final class class24 extends class28 {

    @ObfuscatedName("e.k")
    public String field262;

    @ObfuscatedName("e.y")
    public class148 field244;

    @ObfuscatedName("e.o")
    public int field245 = -1;

    @ObfuscatedName("e.r")
    public int field246 = -1;

    @ObfuscatedName("e.j")
    public String[] field247 = new String[3];

    @ObfuscatedName("e.q")
    public int field267;

    @ObfuscatedName("e.d")
    public int field249;

    @ObfuscatedName("e.n")
    public int field250;

    @ObfuscatedName("e.c")
    public int field268;

    @ObfuscatedName("e.s")
    public int field252;

    @ObfuscatedName("e.g")
    public int field253;

    @ObfuscatedName("e.i")
    public int field256;

    @ObfuscatedName("e.v")
    public int field259;

    @ObfuscatedName("e.a")
    public class83 field248;

    @ObfuscatedName("e.h")
    public int field265;

    @ObfuscatedName("e.p")
    public int field255;

    @ObfuscatedName("e.t")
    public int field251;

    @ObfuscatedName("e.f")
    public int field260;

    @ObfuscatedName("e.z")
    public boolean field261;

    @ObfuscatedName("e.u")
    public int field258;

    @ObfuscatedName("e.b")
    public boolean field263;

    @ObfuscatedName("e.m")
    public int field264;

    @ObfuscatedName("e.e")
    public int field257;

    @ObfuscatedName("e.l")
    public boolean field266;

    @ObfuscatedName("e.x")
    public int field243;

    @ObfuscatedName("e.ap")
    public int field254;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field247[var1] = "";
        }
        this.field267 = 0;
        this.field249 = 0;
        this.field268 = 0;
        this.field252 = 0;
        this.field261 = false;
        this.field258 = 0;
        this.field263 = false;
        this.field266 = false;
    }

    @ObfuscatedName("e.k(Lfm;I)V")
    public final void method236(class161 arg0) {
        arg0.field2267 = 0;
        int var2 = arg0.method2733();
        this.field245 = arg0.method2734();
        this.field246 = arg0.method2734();
        int var3 = -1;
        this.field258 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2733();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2733();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2735();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method2569(var4[var5] - 512).field2975;
                    if (var8 != 0) {
                        this.field258 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2733();
            if (var11 < 0 || var11 >= Statics.field1662[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field652 = arg0.method2735();
        if (this.field652 == 65535) {
            this.field652 = -1;
        }
        this.field597 = arg0.method2735();
        if (this.field597 == 65535) {
            this.field597 = -1;
        }
        this.field643 = this.field597;
        this.field599 = arg0.method2735();
        if (this.field599 == 65535) {
            this.field599 = -1;
        }
        this.field600 = arg0.method2735();
        if (this.field600 == 65535) {
            this.field600 = -1;
        }
        this.field601 = arg0.method2735();
        if (this.field601 == 65535) {
            this.field601 = -1;
        }
        this.field602 = arg0.method2735();
        if (this.field602 == 65535) {
            this.field602 = -1;
        }
        this.field603 = arg0.method2735();
        if (this.field603 == 65535) {
            this.field603 = -1;
        }
        this.field262 = arg0.method2740();
        if (Statics.field1425 == this) {
            Statics.field1659 = this.field262;
        }
        this.field267 = arg0.method2733();
        this.field249 = arg0.method2735();
        this.field263 = arg0.method2733() == 1;
        if (client.field282 == 0 && client.field397 >= 2) {
            this.field263 = false;
        }
        if (this.field244 == null) {
            this.field244 = new class148();
        }
        this.field244.method2539(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("e.y(I)I")
    public int method237() {
        return this.field244 == null || this.field244.field2015 == -1 ? 1 : class200.method818(this.field244.field2015).field2988;
    }

    @ObfuscatedName("e.o(I)Lcu;")
    public final class83 method258() {
        if (this.field244 == null) {
            return null;
        }
        class202 var1 = this.field623 != -1 && this.field626 == 0 ? class202.method1368(this.field623) : null;
        class202 var2 = this.field620 == -1 || this.field261 || this.field652 == this.field620 && var1 != null ? null : class202.method1368(this.field620);
        class83 var3 = this.field244.method2545(var1, this.field624, var2, this.field621);
        if (var3 == null) {
            return null;
        }
        var3.method1482();
        this.field593 = var3.field1544;
        if (!this.field261 && this.field628 != -1 && this.field648 != -1) {
            class83 var4 = class191.method188(this.field628).method3242(this.field648);
            if (var4 != null) {
                var4.method1492(0, -this.field632, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field261 && this.field248 != null) {
            if (client.field454 >= this.field252) {
                this.field248 = null;
            }
            if (client.field454 >= this.field268 && client.field454 < this.field252) {
                class83 var6 = this.field248;
                var6.method1492(this.field253 - this.field619, this.field256 - this.field250, this.field259 - this.field609);
                if (this.field642 == 512) {
                    var6.method1488();
                    var6.method1488();
                    var6.method1488();
                } else if (this.field642 == 1024) {
                    var6.method1488();
                    var6.method1488();
                } else if (this.field642 == 1536) {
                    var6.method1488();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field642 == 512) {
                    var6.method1488();
                } else if (this.field642 == 1024) {
                    var6.method1488();
                    var6.method1488();
                } else if (this.field642 == 1536) {
                    var6.method1488();
                    var6.method1488();
                    var6.method1488();
                }
                var6.method1492(this.field619 - this.field253, this.field250 - this.field256, this.field609 - this.field259);
            }
        }
        var3.field1379 = true;
        return var3;
    }

    @ObfuscatedName("e.r(IIBI)V")
    public final void method244(int arg0, int arg1, byte arg2) {
        if (this.field623 != -1 && class202.method1368(this.field623).field3033 == 1) {
            this.field623 = -1;
        }
        this.field636 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method251(arg0, arg1);
        } else if (this.field629[0] >= 0 && this.field629[0] < 104 && this.field641[0] >= 0 && this.field641[0] < 104) {
            if (arg2 == 2) {
                client.method875(this, arg0, arg1, (byte) 2);
            }
            this.method241(arg0, arg1, arg2);
        } else {
            this.method251(arg0, arg1);
        }
    }

    @ObfuscatedName("e.w(IIB)V")
    public void method251(int arg0, int arg1) {
        this.field645 = 0;
        this.field646 = 0;
        this.field639 = 0;
        this.field629[0] = arg0;
        this.field641[0] = arg1;
        int var3 = this.method237();
        this.field619 = this.field629[0] * 128 + var3 * 64;
        this.field609 = this.field641[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("e.j(IIBI)V")
    public final void method241(int arg0, int arg1, byte arg2) {
        if (this.field645 < 9) {
            this.field645++;
        }
        for (int var4 = this.field645; var4 > 0; var4--) {
            this.field629[var4] = this.field629[var4 - 1];
            this.field641[var4] = this.field641[var4 - 1];
            this.field595[var4] = this.field595[var4 - 1];
        }
        this.field629[0] = arg0;
        this.field641[0] = arg1;
        this.field595[0] = arg2;
    }

    @ObfuscatedName("e.c(I)Z")
    public final boolean method242() {
        return this.field244 != null;
    }
}
