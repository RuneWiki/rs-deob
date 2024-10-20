package deob;

@ObfuscatedName("bi")
public final class class67 extends class70 {

    @ObfuscatedName("bi.z")
    public class283 field599;

    @ObfuscatedName("bi.n")
    public class215 field597;

    @ObfuscatedName("bi.v")
    public int field598 = -1;

    @ObfuscatedName("bi.u")
    public int field605 = -1;

    @ObfuscatedName("bi.p")
    public String[] field601 = new String[3];

    @ObfuscatedName("bi.q")
    public int field596;

    @ObfuscatedName("bi.m")
    public int field616;

    @ObfuscatedName("bi.y")
    public int field604;

    @ObfuscatedName("bi.i")
    public int field611;

    @ObfuscatedName("bi.c")
    public int field606;

    @ObfuscatedName("bi.b")
    public int field607;

    @ObfuscatedName("bi.o")
    public int field608;

    @ObfuscatedName("bi.a")
    public int field609;

    @ObfuscatedName("bi.e")
    public class128 field610;

    @ObfuscatedName("bi.w")
    public int field623;

    @ObfuscatedName("bi.t")
    public int field612;

    @ObfuscatedName("bi.g")
    public int field613;

    @ObfuscatedName("bi.x")
    public int field614;

    @ObfuscatedName("bi.h")
    public boolean field602;

    @ObfuscatedName("bi.s")
    public int field617;

    @ObfuscatedName("bi.f")
    public boolean field615;

    @ObfuscatedName("bi.j")
    public int field624;

    @ObfuscatedName("bi.d")
    public int field619;

    @ObfuscatedName("bi.l")
    public class281 field620;

    @ObfuscatedName("bi.k")
    public class281 field621;

    @ObfuscatedName("bi.ac")
    public boolean field622;

    @ObfuscatedName("bi.az")
    public int field603;

    @ObfuscatedName("bi.aw")
    public int field618;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field601[var1] = "";
        }
        this.field596 = 0;
        this.field616 = 0;
        this.field611 = 0;
        this.field606 = 0;
        this.field602 = false;
        this.field617 = 0;
        this.field615 = false;
        this.field620 = class281.field3603;
        this.field621 = class281.field3603;
        this.field622 = false;
    }

    @ObfuscatedName("bi.z(Lkl;B)V")
    public final void method1095(class300 arg0) {
        arg0.field3702 = 0;
        int var2 = arg0.method4990();
        this.field598 = arg0.method5002();
        this.field605 = arg0.method5002();
        int var3 = -1;
        this.field617 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method4990();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method4990();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method4992();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class255.method2964(var4[var5] - 512).field3435;
                    if (var8 != 0) {
                        this.field617 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method4990();
            if (var11 < 0 || var11 >= Statics.field2520[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field935 = arg0.method4992();
        if (this.field935 == 65535) {
            this.field935 = -1;
        }
        this.field946 = arg0.method4992();
        if (this.field946 == 65535) {
            this.field946 = -1;
        }
        this.field979 = this.field946;
        this.field938 = arg0.method4992();
        if (this.field938 == 65535) {
            this.field938 = -1;
        }
        this.field939 = arg0.method4992();
        if (this.field939 == 65535) {
            this.field939 = -1;
        }
        this.field940 = arg0.method4992();
        if (this.field940 == 65535) {
            this.field940 = -1;
        }
        this.field941 = arg0.method4992();
        if (this.field941 == 65535) {
            this.field941 = -1;
        }
        this.field942 = arg0.method4992();
        if (this.field942 == 65535) {
            this.field942 = -1;
        }
        this.field599 = new class283(arg0.method4999(), Statics.field275);
        this.method1098();
        this.method1129();
        if (Statics.field2737 == this) {
            Statics.field4040 = this.field599.method4712();
        }
        this.field596 = arg0.method4990();
        this.field616 = arg0.method4992();
        this.field615 = arg0.method4990() == 1;
        if (client.field791 == 0 && client.field806 >= 2) {
            this.field615 = false;
        }
        if (this.field597 == null) {
            this.field597 = new class215();
        }
        this.field597.method3625(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bi.n(I)Z")
    public boolean method1097() {
        if (class281.field3603 == this.field620) {
            this.method1099();
        }
        return class281.field3605 == this.field620;
    }

    @ObfuscatedName("bi.v(B)V")
    public void method1098() {
        this.field620 = class281.field3603;
    }

    @ObfuscatedName("bi.u(B)V")
    public void method1099() {
        this.field620 = Statics.field500.method1690(this.field599) ? class281.field3605 : class281.field3604;
    }

    @ObfuscatedName("bi.r(I)Z")
    public boolean method1100() {
        if (class281.field3603 == this.field621) {
            this.method1101();
        }
        return class281.field3605 == this.field621;
    }

    @ObfuscatedName("bi.p(I)V")
    public void method1129() {
        this.field621 = class281.field3603;
    }

    @ObfuscatedName("bi.q(B)V")
    public void method1101() {
        this.field621 = Statics.field2513 != null && Statics.field2513.method4612(this.field599) ? class281.field3605 : class281.field3604;
    }

    @ObfuscatedName("bi.m(B)I")
    public int method1096() {
        return this.field597 == null || this.field597.field2524 == -1 ? 1 : class257.method3280(this.field597.field2524).field3474;
    }

    @ObfuscatedName("bi.y(I)Ldh;")
    public final class128 method1115() {
        if (this.field597 == null) {
            return null;
        }
        class259 var1 = this.field936 != -1 && this.field937 == 0 ? class259.method122(this.field936) : null;
        class259 var2 = this.field980 == -1 || this.field602 || this.field980 == this.field935 && var1 != null ? null : class259.method122(this.field980);
        class128 var3 = this.field597.method3629(var1, this.field961, var2, this.field965);
        if (var3 == null) {
            return null;
        }
        var3.method2592();
        this.field943 = var3.field1843;
        if (!this.field602 && this.field967 != -1 && this.field968 != -1) {
            class128 var4 = class244.method1038(this.field967).method3979(this.field968);
            if (var4 != null) {
                var4.method2656(0, -this.field971, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field602 && this.field610 != null) {
            if (client.field645 >= this.field606) {
                this.field610 = null;
            }
            if (client.field645 >= this.field611 && client.field645 < this.field606) {
                class128 var6 = this.field610;
                var6.method2656(this.field607 - this.field986, this.field608 - this.field604, this.field609 - this.field930);
                if (this.field981 == 512) {
                    var6.method2599();
                    var6.method2599();
                    var6.method2599();
                } else if (this.field981 == 1024) {
                    var6.method2599();
                    var6.method2599();
                } else if (this.field981 == 1536) {
                    var6.method2599();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field981 == 512) {
                    var6.method2599();
                } else if (this.field981 == 1024) {
                    var6.method2599();
                    var6.method2599();
                } else if (this.field981 == 1536) {
                    var6.method2599();
                    var6.method2599();
                    var6.method2599();
                }
                var6.method2656(this.field986 - this.field607, this.field604 - this.field608, this.field930 - this.field609);
            }
        }
        var3.field1697 = true;
        return var3;
    }

    @ObfuscatedName("bi.i(IIBB)V")
    public final void method1118(int arg0, int arg1, byte arg2) {
        if (this.field936 != -1 && class259.method122(this.field936).field3511 == 1) {
            this.field936 = -1;
        }
        this.field958 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1106(arg0, arg1);
        } else if (this.field985[0] >= 0 && this.field985[0] < 104 && this.field960[0] >= 0 && this.field960[0] < 104) {
            if (arg2 == 2) {
                client.method10(this, arg0, arg1, (byte) 2);
            }
            this.method1107(arg0, arg1, arg2);
        } else {
            this.method1106(arg0, arg1);
        }
    }

    @ObfuscatedName("bi.c(IIB)V")
    public void method1106(int arg0, int arg1) {
        this.field984 = 0;
        this.field989 = 0;
        this.field950 = 0;
        this.field985[0] = arg0;
        this.field960[0] = arg1;
        int var3 = this.method1096();
        this.field986 = this.field985[0] * 128 + var3 * 64;
        this.field930 = this.field960[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bi.b(IIBI)V")
    public final void method1107(int arg0, int arg1, byte arg2) {
        if (this.field984 < 9) {
            this.field984++;
        }
        for (int var4 = this.field984; var4 > 0; var4--) {
            this.field985[var4] = this.field985[var4 - 1];
            this.field960[var4] = this.field960[var4 - 1];
            this.field987[var4] = this.field987[var4 - 1];
        }
        this.field985[0] = arg0;
        this.field960[0] = arg1;
        this.field987[0] = arg2;
    }

    @ObfuscatedName("bi.o(S)Z")
    public final boolean method1108() {
        return this.field597 != null;
    }
}
