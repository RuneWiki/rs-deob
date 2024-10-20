package deob;

@ObfuscatedName("by")
public final class class76 extends class79 {

    @ObfuscatedName("by.m")
    public class293 field658;

    @ObfuscatedName("by.o")
    public class224 field635;

    @ObfuscatedName("by.q")
    public int field636 = -1;

    @ObfuscatedName("by.j")
    public int field637 = -1;

    @ObfuscatedName("by.g")
    public String[] field645 = new String[3];

    @ObfuscatedName("by.n")
    public int field640;

    @ObfuscatedName("by.u")
    public int field641;

    @ObfuscatedName("by.a")
    public int field642;

    @ObfuscatedName("by.z")
    public int field643;

    @ObfuscatedName("by.w")
    public int field644;

    @ObfuscatedName("by.y")
    public int field662;

    @ObfuscatedName("by.c")
    public int field648;

    @ObfuscatedName("by.h")
    public int field654;

    @ObfuscatedName("by.k")
    public class137 field659;

    @ObfuscatedName("by.r")
    public int field649;

    @ObfuscatedName("by.s")
    public int field650;

    @ObfuscatedName("by.v")
    public int field651;

    @ObfuscatedName("by.d")
    public int field652;

    @ObfuscatedName("by.e")
    public boolean field647;

    @ObfuscatedName("by.l")
    public int field653;

    @ObfuscatedName("by.t")
    public boolean field655;

    @ObfuscatedName("by.x")
    public int field656;

    @ObfuscatedName("by.b")
    public int field657;

    @ObfuscatedName("by.i")
    public class291 field663;

    @ObfuscatedName("by.f")
    public class291 field646;

    @ObfuscatedName("by.ah")
    public boolean field660;

    @ObfuscatedName("by.ai")
    public int field634;

    @ObfuscatedName("by.ao")
    public int field661;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field645[var1] = "";
        }
        this.field640 = 0;
        this.field641 = 0;
        this.field643 = 0;
        this.field644 = 0;
        this.field647 = false;
        this.field653 = 0;
        this.field655 = false;
        this.field663 = class291.field3648;
        this.field646 = class291.field3648;
        this.field660 = false;
    }

    @ObfuscatedName("by.m(Lkn;I)V")
    public final void method1123(class310 arg0) {
        arg0.field3734 = 0;
        int var2 = arg0.method5227();
        this.field636 = arg0.method5228();
        this.field637 = arg0.method5228();
        int var3 = -1;
        this.field653 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5227();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5227();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5283();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class265.method4218(var4[var5] - 512).field3483;
                    if (var8 != 0) {
                        this.field653 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5227();
            if (var11 < 0 || var11 >= Statics.field2576[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field970 = arg0.method5283();
        if (this.field970 == 65535) {
            this.field970 = -1;
        }
        this.field971 = arg0.method5283();
        if (this.field971 == 65535) {
            this.field971 = -1;
        }
        this.field964 = this.field971;
        this.field973 = arg0.method5283();
        if (this.field973 == 65535) {
            this.field973 = -1;
        }
        this.field1013 = arg0.method5283();
        if (this.field1013 == 65535) {
            this.field1013 = -1;
        }
        this.field975 = arg0.method5283();
        if (this.field975 == 65535) {
            this.field975 = -1;
        }
        this.field978 = arg0.method5283();
        if (this.field978 == 65535) {
            this.field978 = -1;
        }
        this.field982 = arg0.method5283();
        if (this.field982 == 65535) {
            this.field982 = -1;
        }
        this.field658 = new class293(arg0.method5236(), Statics.field2368);
        this.method1125();
        this.method1157();
        if (Statics.field455 == this) {
            Statics.field4070 = this.field658.method4925();
        }
        this.field640 = arg0.method5227();
        this.field641 = arg0.method5283();
        this.field655 = arg0.method5227() == 1;
        if (client.field863 == 0 && client.field843 >= 2) {
            this.field655 = false;
        }
        if (this.field635 == null) {
            this.field635 = new class224();
        }
        this.field635.method3763(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("by.o(I)Z")
    public boolean method1128() {
        if (class291.field3648 == this.field663) {
            this.method1126();
        }
        return class291.field3645 == this.field663;
    }

    @ObfuscatedName("by.q(I)V")
    public void method1125() {
        this.field663 = class291.field3648;
    }

    @ObfuscatedName("by.j(I)V")
    public void method1126() {
        this.field663 = Statics.field2418.method1741(this.field658) ? class291.field3645 : class291.field3646;
    }

    @ObfuscatedName("by.p(I)Z")
    public boolean method1127() {
        if (class291.field3648 == this.field646) {
            this.method1154();
        }
        return class291.field3645 == this.field646;
    }

    @ObfuscatedName("by.g(I)V")
    public void method1157() {
        this.field646 = class291.field3648;
    }

    @ObfuscatedName("by.n(B)V")
    public void method1154() {
        this.field646 = Statics.field1085 != null && Statics.field1085.method4889(this.field658) ? class291.field3645 : class291.field3646;
    }

    @ObfuscatedName("by.u(I)I")
    public int method1130() {
        return this.field635 == null || this.field635.field2572 == -1 ? 1 : class267.method3880(this.field635.field2572).field3500;
    }

    @ObfuscatedName("by.a(I)Lef;")
    public final class137 method1131() {
        if (this.field635 == null) {
            return null;
        }
        class269 var1 = this.field992 != -1 && this.field1000 == 0 ? class269.method3330(this.field992) : null;
        class269 var2 = this.field1019 == -1 || this.field647 || this.field970 == this.field1019 && var1 != null ? null : class269.method3330(this.field1019);
        class137 var3 = this.field635.method3740(var1, this.field998, var2, this.field995);
        if (var3 == null) {
            return null;
        }
        var3.method2711();
        this.field1015 = var3.field1898;
        if (!this.field647 && this.field1002 != -1 && this.field974 != -1) {
            class137 var4 = class254.method41(this.field1002).method4145(this.field974);
            if (var4 != null) {
                var4.method2779(0, -this.field1006, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (!this.field647 && this.field659 != null) {
            if (client.field671 >= this.field644) {
                this.field659 = null;
            }
            if (client.field671 >= this.field643 && client.field671 < this.field644) {
                class137 var6 = this.field659;
                var6.method2779(this.field662 - this.field983, this.field648 - this.field642, this.field654 - this.field965);
                if (this.field1016 == 512) {
                    var6.method2718();
                    var6.method2718();
                    var6.method2718();
                } else if (this.field1016 == 1024) {
                    var6.method2718();
                    var6.method2718();
                } else if (this.field1016 == 1536) {
                    var6.method2718();
                }
                class137[] var7 = new class137[] { var3, var6 };
                var3 = new class137(var7, 2);
                if (this.field1016 == 512) {
                    var6.method2718();
                } else if (this.field1016 == 1024) {
                    var6.method2718();
                    var6.method2718();
                } else if (this.field1016 == 1536) {
                    var6.method2718();
                    var6.method2718();
                    var6.method2718();
                }
                var6.method2779(this.field983 - this.field662, this.field642 - this.field648, this.field965 - this.field654);
            }
        }
        var3.field1755 = true;
        return var3;
    }

    @ObfuscatedName("by.z(IIBI)V")
    public final void method1132(int arg0, int arg1, byte arg2) {
        if (this.field992 != -1 && class269.method3330(this.field992).field3561 == 1) {
            this.field992 = -1;
        }
        this.field993 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1133(arg0, arg1);
        } else if (this.field1020[0] >= 0 && this.field1020[0] < 104 && this.field1021[0] >= 0 && this.field1021[0] < 104) {
            if (arg2 == 2) {
                client.method1116(this, arg0, arg1, (byte) 2);
            }
            this.method1134(arg0, arg1, arg2);
        } else {
            this.method1133(arg0, arg1);
        }
    }

    @ObfuscatedName("by.w(III)V")
    public void method1133(int arg0, int arg1) {
        this.field976 = 0;
        this.field1024 = 0;
        this.field1023 = 0;
        this.field1020[0] = arg0;
        this.field1021[0] = arg1;
        int var3 = this.method1130();
        this.field983 = this.field1020[0] * 128 + var3 * 64;
        this.field965 = this.field1021[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("by.y(IIBI)V")
    public final void method1134(int arg0, int arg1, byte arg2) {
        if (this.field976 < 9) {
            this.field976++;
        }
        for (int var4 = this.field976; var4 > 0; var4--) {
            this.field1020[var4] = this.field1020[var4 - 1];
            this.field1021[var4] = this.field1021[var4 - 1];
            this.field1022[var4] = this.field1022[var4 - 1];
        }
        this.field1020[0] = arg0;
        this.field1021[0] = arg1;
        this.field1022[0] = arg2;
    }

    @ObfuscatedName("by.c(B)Z")
    public final boolean method1124() {
        return this.field635 != null;
    }
}
