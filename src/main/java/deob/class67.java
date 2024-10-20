package deob;

@ObfuscatedName("by")
public final class class67 extends class70 {

    @ObfuscatedName("by.c")
    public class283 field596;

    @ObfuscatedName("by.x")
    public class215 field588;

    @ObfuscatedName("by.t")
    public int field589 = -1;

    @ObfuscatedName("by.g")
    public int field590 = -1;

    @ObfuscatedName("by.u")
    public String[] field614 = new String[3];

    @ObfuscatedName("by.j")
    public int field593;

    @ObfuscatedName("by.v")
    public int field587;

    @ObfuscatedName("by.d")
    public int field595;

    @ObfuscatedName("by.z")
    public int field594;

    @ObfuscatedName("by.n")
    public int field604;

    @ObfuscatedName("by.h")
    public int field598;

    @ObfuscatedName("by.f")
    public int field599;

    @ObfuscatedName("by.s")
    public int field600;

    @ObfuscatedName("by.p")
    public class128 field601;

    @ObfuscatedName("by.e")
    public int field602;

    @ObfuscatedName("by.i")
    public int field603;

    @ObfuscatedName("by.q")
    public int field610;

    @ObfuscatedName("by.y")
    public int field605;

    @ObfuscatedName("by.r")
    public boolean field606;

    @ObfuscatedName("by.k")
    public int field607;

    @ObfuscatedName("by.w")
    public boolean field591;

    @ObfuscatedName("by.m")
    public int field609;

    @ObfuscatedName("by.o")
    public int field615;

    @ObfuscatedName("by.a")
    public class281 field611;

    @ObfuscatedName("by.b")
    public class281 field612;

    @ObfuscatedName("by.ag")
    public boolean field608;

    @ObfuscatedName("by.at")
    public int field597;

    @ObfuscatedName("by.ao")
    public int field613;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field614[var1] = "";
        }
        this.field593 = 0;
        this.field587 = 0;
        this.field594 = 0;
        this.field604 = 0;
        this.field606 = false;
        this.field607 = 0;
        this.field591 = false;
        this.field611 = class281.field3587;
        this.field612 = class281.field3587;
        this.field608 = false;
    }

    @ObfuscatedName("by.c(Lkz;I)V")
    public final void method1054(class300 arg0) {
        arg0.field3696 = 0;
        int var2 = arg0.method5103();
        this.field589 = arg0.method5168();
        this.field590 = arg0.method5168();
        int var3 = -1;
        this.field607 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5103();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5103();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5304();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class255.method1055(var4[var5] - 512).field3385;
                    if (var8 != 0) {
                        this.field607 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5103();
            if (var11 < 0 || var11 >= Statics.field2509[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field923 = arg0.method5304();
        if (this.field923 == 65535) {
            this.field923 = -1;
        }
        this.field956 = arg0.method5304();
        if (this.field956 == 65535) {
            this.field956 = -1;
        }
        this.field947 = this.field956;
        this.field926 = arg0.method5304();
        if (this.field926 == 65535) {
            this.field926 = -1;
        }
        this.field927 = arg0.method5304();
        if (this.field927 == 65535) {
            this.field927 = -1;
        }
        this.field924 = arg0.method5304();
        if (this.field924 == 65535) {
            this.field924 = -1;
        }
        this.field929 = arg0.method5304();
        if (this.field929 == 65535) {
            this.field929 = -1;
        }
        this.field930 = arg0.method5304();
        if (this.field930 == 65535) {
            this.field930 = -1;
        }
        this.field596 = new class283(arg0.method5112(), Statics.field22);
        this.method1056();
        this.method1075();
        if (Statics.field2495 == this) {
            Statics.field4044 = this.field596.method4815();
        }
        this.field593 = arg0.method5103();
        this.field587 = arg0.method5304();
        this.field591 = arg0.method5103() == 1;
        if (client.field626 == 0 && client.field792 >= 2) {
            this.field591 = false;
        }
        if (this.field588 == null) {
            this.field588 = new class215();
        }
        this.field588.method3700(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("by.x(I)Z")
    public boolean method1083() {
        if (class281.field3587 == this.field611) {
            this.method1057();
        }
        return class281.field3585 == this.field611;
    }

    @ObfuscatedName("by.t(I)V")
    public void method1056() {
        this.field611 = class281.field3587;
    }

    @ObfuscatedName("by.g(I)V")
    public void method1057() {
        this.field611 = Statics.field2683.method1695(this.field596) ? class281.field3585 : class281.field3584;
    }

    @ObfuscatedName("by.l(I)Z")
    public boolean method1058() {
        if (class281.field3587 == this.field612) {
            this.method1059();
        }
        return class281.field3585 == this.field612;
    }

    @ObfuscatedName("by.u(I)V")
    public void method1075() {
        this.field612 = class281.field3587;
    }

    @ObfuscatedName("by.j(I)V")
    public void method1059() {
        this.field612 = Statics.field73 != null && Statics.field73.method4774(this.field596) ? class281.field3585 : class281.field3584;
    }

    @ObfuscatedName("by.v(I)I")
    public int method1061() {
        return this.field588 == null || this.field588.field2515 == -1 ? 1 : class257.method4928(this.field588.field2515).field3441;
    }

    @ObfuscatedName("by.d(B)Ldr;")
    public final class128 method1062() {
        if (this.field588 == null) {
            return null;
        }
        class259 var1 = this.field950 != -1 && this.field953 == 0 ? class259.method1897(this.field950) : null;
        class259 var2 = this.field973 == -1 || this.field606 || this.field973 == this.field923 && var1 != null ? null : class259.method1897(this.field973);
        class128 var3 = this.field588.method3686(var1, this.field951, var2, this.field948);
        if (var3 == null) {
            return null;
        }
        var3.method2635();
        this.field968 = var3.field1837;
        if (!this.field606 && this.field955 != -1 && this.field919 != -1) {
            class128 var4 = class244.method3966(this.field955).method4082(this.field919);
            if (var4 != null) {
                var4.method2664(0, -this.field959, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field606 && this.field601 != null) {
            if (client.field628 >= this.field604) {
                this.field601 = null;
            }
            if (client.field628 >= this.field594 && client.field628 < this.field604) {
                class128 var6 = this.field601;
                var6.method2664(this.field598 - this.field971, this.field599 - this.field595, this.field600 - this.field918);
                if (this.field969 == 512) {
                    var6.method2642();
                    var6.method2642();
                    var6.method2642();
                } else if (this.field969 == 1024) {
                    var6.method2642();
                    var6.method2642();
                } else if (this.field969 == 1536) {
                    var6.method2642();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field969 == 512) {
                    var6.method2642();
                } else if (this.field969 == 1024) {
                    var6.method2642();
                    var6.method2642();
                } else if (this.field969 == 1536) {
                    var6.method2642();
                    var6.method2642();
                    var6.method2642();
                }
                var6.method2664(this.field971 - this.field598, this.field595 - this.field599, this.field918 - this.field600);
            }
        }
        var3.field1664 = true;
        return var3;
    }

    @ObfuscatedName("by.z(IIBI)V")
    public final void method1063(int arg0, int arg1, byte arg2) {
        if (this.field950 != -1 && class259.method1897(this.field950).field3502 == 1) {
            this.field950 = -1;
        }
        this.field946 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1081(arg0, arg1);
        } else if (this.field940[0] >= 0 && this.field940[0] < 104 && this.field974[0] >= 0 && this.field974[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field940[0];
                int var6 = this.field974[0];
                int var7 = this.method1061();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method1061();
                    client.field897.field2079 = arg0;
                    client.field897.field2081 = arg1;
                    client.field897.field2085 = 1;
                    client.field897.field2080 = 1;
                    class66 var11 = client.field897;
                    int var12 = Statics.method180(var5, var6, var10, var11, client.field659[this.field609], true, client.field898, client.field623);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method1065(client.field898[var13], client.field623[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method1065(arg0, arg1, arg2);
        } else {
            this.method1081(arg0, arg1);
        }
    }

    @ObfuscatedName("by.s(III)V")
    public void method1081(int arg0, int arg1) {
        this.field972 = 0;
        this.field970 = 0;
        this.field976 = 0;
        this.field940[0] = arg0;
        this.field974[0] = arg1;
        int var3 = this.method1061();
        this.field971 = this.field940[0] * 128 + var3 * 64;
        this.field918 = this.field974[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("by.p(IIBI)V")
    public final void method1065(int arg0, int arg1, byte arg2) {
        if (this.field972 < 9) {
            this.field972++;
        }
        for (int var4 = this.field972; var4 > 0; var4--) {
            this.field940[var4] = this.field940[var4 - 1];
            this.field974[var4] = this.field974[var4 - 1];
            this.field975[var4] = this.field975[var4 - 1];
        }
        this.field940[0] = arg0;
        this.field974[0] = arg1;
        this.field975[0] = arg2;
    }

    @ObfuscatedName("by.e(B)Z")
    public final boolean method1066() {
        return this.field588 != null;
    }
}
