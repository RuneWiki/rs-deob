package deob;

@ObfuscatedName("bj")
public final class class67 extends class70 {

    @ObfuscatedName("bj.a")
    public class283 field601;

    @ObfuscatedName("bj.t")
    public class215 field597;

    @ObfuscatedName("bj.n")
    public int field598 = -1;

    @ObfuscatedName("bj.q")
    public int field599 = -1;

    @ObfuscatedName("bj.l")
    public String[] field609 = new String[3];

    @ObfuscatedName("bj.c")
    public int field622;

    @ObfuscatedName("bj.o")
    public int field603;

    @ObfuscatedName("bj.i")
    public int field615;

    @ObfuscatedName("bj.d")
    public int field611;

    @ObfuscatedName("bj.m")
    public int field606;

    @ObfuscatedName("bj.p")
    public int field621;

    @ObfuscatedName("bj.h")
    public int field608;

    @ObfuscatedName("bj.k")
    public int field614;

    @ObfuscatedName("bj.x")
    public class128 field610;

    @ObfuscatedName("bj.j")
    public int field596;

    @ObfuscatedName("bj.r")
    public int field612;

    @ObfuscatedName("bj.e")
    public int field613;

    @ObfuscatedName("bj.s")
    public int field605;

    @ObfuscatedName("bj.b")
    public boolean field623;

    @ObfuscatedName("bj.z")
    public int field602;

    @ObfuscatedName("bj.f")
    public boolean field617;

    @ObfuscatedName("bj.g")
    public int field618;

    @ObfuscatedName("bj.w")
    public int field619;

    @ObfuscatedName("bj.u")
    public class281 field620;

    @ObfuscatedName("bj.y")
    public class281 field604;

    @ObfuscatedName("bj.aa")
    public boolean field607;

    @ObfuscatedName("bj.aw")
    public int field616;

    @ObfuscatedName("bj.ar")
    public int field624;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field609[var1] = "";
        }
        this.field622 = 0;
        this.field603 = 0;
        this.field611 = 0;
        this.field606 = 0;
        this.field623 = false;
        this.field602 = 0;
        this.field617 = false;
        this.field620 = class281.field3603;
        this.field604 = class281.field3603;
        this.field607 = false;
    }

    @ObfuscatedName("bj.a(Lkc;B)V")
    public final void method1183(class300 arg0) {
        arg0.field3694 = 0;
        int var2 = arg0.method5123();
        this.field598 = arg0.method5268();
        this.field599 = arg0.method5268();
        int var3 = -1;
        this.field602 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5123();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5123();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5166();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class255.method3852(var4[var5] - 512).field3439;
                    if (var8 != 0) {
                        this.field602 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5123();
            if (var11 < 0 || var11 >= Statics.field2521[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field965 = arg0.method5166();
        if (this.field965 == 65535) {
            this.field965 = -1;
        }
        this.field925 = arg0.method5166();
        if (this.field925 == 65535) {
            this.field925 = -1;
        }
        this.field932 = this.field925;
        this.field976 = arg0.method5166();
        if (this.field976 == 65535) {
            this.field976 = -1;
        }
        this.field934 = arg0.method5166();
        if (this.field934 == 65535) {
            this.field934 = -1;
        }
        this.field969 = arg0.method5166();
        if (this.field969 == 65535) {
            this.field969 = -1;
        }
        this.field936 = arg0.method5166();
        if (this.field936 == 65535) {
            this.field936 = -1;
        }
        this.field937 = arg0.method5166();
        if (this.field937 == 65535) {
            this.field937 = -1;
        }
        this.field601 = new class283(arg0.method5132(), Statics.field536);
        this.method1174();
        this.method1156();
        if (Statics.field2530 == this) {
            Statics.field4044 = this.field601.method4851();
        }
        this.field622 = arg0.method5123();
        this.field603 = arg0.method5166();
        this.field617 = arg0.method5123() == 1;
        if (client.field635 == 0 && client.field755 >= 2) {
            this.field617 = false;
        }
        if (this.field597 == null) {
            this.field597 = new class215();
        }
        this.field597.method3737(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bj.t(S)Z")
    public boolean method1152() {
        if (class281.field3603 == this.field620) {
            this.method1154();
        }
        return class281.field3600 == this.field620;
    }

    @ObfuscatedName("bj.n(B)V")
    public void method1174() {
        this.field620 = class281.field3603;
    }

    @ObfuscatedName("bj.q(I)V")
    public void method1154() {
        this.field620 = Statics.field1296.method1772(this.field601) ? class281.field3600 : class281.field3602;
    }

    @ObfuscatedName("bj.v(I)Z")
    public boolean method1155() {
        if (class281.field3603 == this.field604) {
            this.method1157();
        }
        return class281.field3600 == this.field604;
    }

    @ObfuscatedName("bj.l(I)V")
    public void method1156() {
        this.field604 = class281.field3603;
    }

    @ObfuscatedName("bj.c(S)V")
    public void method1157() {
        this.field604 = Statics.field28 != null && Statics.field28.method4796(this.field601) ? class281.field3600 : class281.field3602;
    }

    @ObfuscatedName("bj.o(S)I")
    public int method1158() {
        return this.field597 == null || this.field597.field2517 == -1 ? 1 : class257.method1054(this.field597.field2517).field3460;
    }

    @ObfuscatedName("bj.i(B)Ldv;")
    public final class128 method1159() {
        if (this.field597 == null) {
            return null;
        }
        class259 var1 = this.field957 != -1 && this.field960 == 0 ? class259.method3856(this.field957) : null;
        class259 var2 = this.field954 == -1 || this.field623 || this.field965 == this.field954 && var1 != null ? null : class259.method3856(this.field954);
        class128 var3 = this.field597.method3753(var1, this.field958, var2, this.field977);
        if (var3 == null) {
            return null;
        }
        var3.method2734();
        this.field975 = var3.field1849;
        if (!this.field623 && this.field962 != -1 && this.field963 != -1) {
            class128 var4 = class244.method1992(this.field962).method4119(this.field963);
            if (var4 != null) {
                var4.method2740(0, -this.field966, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field623 && this.field610 != null) {
            if (client.field643 >= this.field606) {
                this.field610 = null;
            }
            if (client.field643 >= this.field611 && client.field643 < this.field606) {
                class128 var6 = this.field610;
                var6.method2740(this.field621 - this.field930, this.field608 - this.field615, this.field614 - this.field933);
                if (this.field927 == 512) {
                    var6.method2741();
                    var6.method2741();
                    var6.method2741();
                } else if (this.field927 == 1024) {
                    var6.method2741();
                    var6.method2741();
                } else if (this.field927 == 1536) {
                    var6.method2741();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field927 == 512) {
                    var6.method2741();
                } else if (this.field927 == 1024) {
                    var6.method2741();
                    var6.method2741();
                } else if (this.field927 == 1536) {
                    var6.method2741();
                    var6.method2741();
                    var6.method2741();
                }
                var6.method2740(this.field930 - this.field621, this.field615 - this.field608, this.field933 - this.field614);
            }
        }
        var3.field1670 = true;
        return var3;
    }

    @ObfuscatedName("bj.d(IIBI)V")
    public final void method1160(int arg0, int arg1, byte arg2) {
        if (this.field957 != -1 && class259.method3856(this.field957).field3514 == 1) {
            this.field957 = -1;
        }
        this.field935 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1151(arg0, arg1);
        } else if (this.field924[0] >= 0 && this.field924[0] < 104 && this.field931[0] >= 0 && this.field931[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field924[0];
                int var6 = this.field931[0];
                int var7 = this.method1158();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class174.method1137(var5, var6, this.method1158(), client.method567(arg0, arg1), client.field812[this.field618], true, client.field891, client.field907);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1178(client.field891[var9], client.field907[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1178(arg0, arg1, arg2);
        } else {
            this.method1151(arg0, arg1);
        }
    }

    @ObfuscatedName("bj.m(III)V")
    public void method1151(int arg0, int arg1) {
        this.field979 = 0;
        this.field984 = 0;
        this.field983 = 0;
        this.field924[0] = arg0;
        this.field931[0] = arg1;
        int var3 = this.method1158();
        this.field930 = this.field924[0] * 128 + var3 * 64;
        this.field933 = this.field931[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bj.p(IIBI)V")
    public final void method1178(int arg0, int arg1, byte arg2) {
        if (this.field979 < 9) {
            this.field979++;
        }
        for (int var4 = this.field979; var4 > 0; var4--) {
            this.field924[var4] = this.field924[var4 - 1];
            this.field931[var4] = this.field931[var4 - 1];
            this.field982[var4] = this.field982[var4 - 1];
        }
        this.field924[0] = arg0;
        this.field931[0] = arg1;
        this.field982[0] = arg2;
    }

    @ObfuscatedName("bj.h(B)Z")
    public final boolean method1163() {
        return this.field597 != null;
    }
}
