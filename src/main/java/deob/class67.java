package deob;

@ObfuscatedName("bw")
public final class class67 extends class70 {

    @ObfuscatedName("bw.a")
    public class298 field619;

    @ObfuscatedName("bw.s")
    public class236 field612;

    @ObfuscatedName("bw.g")
    public int field613 = -1;

    @ObfuscatedName("bw.x")
    public int field628 = -1;

    @ObfuscatedName("bw.f")
    public String[] field611 = new String[3];

    @ObfuscatedName("bw.p")
    public int field616;

    @ObfuscatedName("bw.m")
    public int field617;

    @ObfuscatedName("bw.q")
    public int field634;

    @ObfuscatedName("bw.b")
    public int field637;

    @ObfuscatedName("bw.n")
    public int field620;

    @ObfuscatedName("bw.e")
    public int field638;

    @ObfuscatedName("bw.r")
    public int field618;

    @ObfuscatedName("bw.t")
    public int field623;

    @ObfuscatedName("bw.l")
    public class127 field624;

    @ObfuscatedName("bw.o")
    public int field631;

    @ObfuscatedName("bw.u")
    public int field626;

    @ObfuscatedName("bw.y")
    public int field627;

    @ObfuscatedName("bw.k")
    public int field629;

    @ObfuscatedName("bw.v")
    public boolean field614;

    @ObfuscatedName("bw.d")
    public int field615;

    @ObfuscatedName("bw.w")
    public boolean field633;

    @ObfuscatedName("bw.i")
    public int field632;

    @ObfuscatedName("bw.c")
    public int field622;

    @ObfuscatedName("bw.j")
    public class296 field621;

    @ObfuscatedName("bw.z")
    public class296 field635;

    @ObfuscatedName("bw.ag")
    public boolean field636;

    @ObfuscatedName("bw.af")
    public int field625;

    @ObfuscatedName("bw.ay")
    public int field630;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field611[var1] = "";
        }
        this.field616 = 0;
        this.field617 = 0;
        this.field637 = 0;
        this.field620 = 0;
        this.field614 = false;
        this.field615 = 0;
        this.field633 = false;
        this.field621 = class296.field3721;
        this.field635 = class296.field3721;
        this.field636 = false;
    }

    @ObfuscatedName("bw.a(Lgx;B)V")
    public final void method1115(class190 arg0) {
        arg0.field2419 = 0;
        int var2 = arg0.method3443();
        this.field613 = arg0.method3599();
        this.field628 = arg0.method3599();
        int var3 = -1;
        this.field615 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3443();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3443();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3610();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class276.method1049(var4[var5] - 512).field3557;
                    if (var8 != 0) {
                        this.field615 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3443();
            if (var11 < 0 || var11 >= Statics.field2660[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field952 = arg0.method3610();
        if (this.field952 == 65535) {
            this.field952 = -1;
        }
        this.field946 = arg0.method3610();
        if (this.field946 == 65535) {
            this.field946 = -1;
        }
        this.field947 = this.field946;
        this.field945 = arg0.method3610();
        if (this.field945 == 65535) {
            this.field945 = -1;
        }
        this.field980 = arg0.method3610();
        if (this.field980 == 65535) {
            this.field980 = -1;
        }
        this.field950 = arg0.method3610();
        if (this.field950 == 65535) {
            this.field950 = -1;
        }
        this.field972 = arg0.method3610();
        if (this.field972 == 65535) {
            this.field972 = -1;
        }
        this.field969 = arg0.method3610();
        if (this.field969 == 65535) {
            this.field969 = -1;
        }
        this.field619 = new class298(arg0.method3647(), Statics.field415);
        this.method1134();
        this.method1117();
        if (Statics.field187 == this) {
            Statics.field2020 = this.field619.method5236();
        }
        this.field616 = arg0.method3443();
        this.field617 = arg0.method3610();
        this.field633 = arg0.method3443() == 1;
        if (client.field652 == 0 && client.field678 >= 2) {
            this.field633 = false;
        }
        if (this.field612 == null) {
            this.field612 = new class236();
        }
        this.field612.method4303(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bw.s(B)Z")
    public boolean method1113() {
        if (class296.field3721 == this.field621) {
            this.method1157();
        }
        return class296.field3717 == this.field621;
    }

    @ObfuscatedName("bw.g(I)V")
    public void method1134() {
        this.field621 = class296.field3721;
    }

    @ObfuscatedName("bw.x(B)V")
    public void method1157() {
        this.field621 = Statics.field355.method1696(this.field619) ? class296.field3717 : class296.field3718;
    }

    @ObfuscatedName("bw.h(I)Z")
    public boolean method1136() {
        if (class296.field3721 == this.field635) {
            this.method1111();
        }
        return class296.field3717 == this.field635;
    }

    @ObfuscatedName("bw.f(I)V")
    public void method1117() {
        this.field635 = class296.field3721;
    }

    @ObfuscatedName("bw.p(B)V")
    public void method1111() {
        this.field635 = Statics.field366 != null && Statics.field366.method5151(this.field619) ? class296.field3717 : class296.field3718;
    }

    @ObfuscatedName("bw.m(B)I")
    public int method1119() {
        return this.field612 == null || this.field612.field2658 == -1 ? 1 : class278.method3363(this.field612.field2658).field3571;
    }

    @ObfuscatedName("bw.q(I)Ldv;")
    public final class127 method1112() {
        if (this.field612 == null) {
            return null;
        }
        class280 var1 = this.field939 != -1 && this.field975 == 0 ? class280.method3173(this.field939) : null;
        class280 var2 = this.field970 == -1 || this.field614 || this.field970 == this.field952 && var1 != null ? null : class280.method3173(this.field970);
        class127 var3 = this.field612.method4312(var1, this.field973, var2, this.field981);
        if (var3 == null) {
            return null;
        }
        var3.method2683();
        this.field978 = var3.field1863;
        if (!this.field614 && this.field977 != -1 && this.field965 != -1) {
            class127 var4 = class265.method2303(this.field977).method4644(this.field965);
            if (var4 != null) {
                var4.method2739(0, -this.field993, 0);
                class127[] var5 = new class127[] { var3, var4 };
                var3 = new class127(var5, 2);
            }
        }
        if (!this.field614 && this.field624 != null) {
            if (client.field660 >= this.field620) {
                this.field624 = null;
            }
            if (client.field660 >= this.field637 && client.field660 < this.field620) {
                class127 var6 = this.field624;
                var6.method2739(this.field638 - this.field948, this.field618 - this.field634, this.field623 - this.field949);
                if (this.field991 == 512) {
                    var6.method2692();
                    var6.method2692();
                    var6.method2692();
                } else if (this.field991 == 1024) {
                    var6.method2692();
                    var6.method2692();
                } else if (this.field991 == 1536) {
                    var6.method2692();
                }
                class127[] var7 = new class127[] { var3, var6 };
                var3 = new class127(var7, 2);
                if (this.field991 == 512) {
                    var6.method2692();
                } else if (this.field991 == 1024) {
                    var6.method2692();
                    var6.method2692();
                } else if (this.field991 == 1536) {
                    var6.method2692();
                    var6.method2692();
                    var6.method2692();
                }
                var6.method2739(this.field948 - this.field638, this.field634 - this.field618, this.field949 - this.field623);
            }
        }
        var3.field1697 = true;
        return var3;
    }

    @ObfuscatedName("bw.b(IIBI)V")
    public final void method1121(int arg0, int arg1, byte arg2) {
        if (this.field939 != -1 && class280.method3173(this.field939).field3625 == 1) {
            this.field939 = -1;
        }
        this.field968 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1122(arg0, arg1);
        } else if (this.field999[0] >= 0 && this.field999[0] < 104 && this.field996[0] >= 0 && this.field996[0] < 104) {
            if (arg2 == 2) {
                client.method212(this, arg0, arg1, (byte) 2);
            }
            this.method1123(arg0, arg1, arg2);
        } else {
            this.method1122(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.n(III)V")
    public void method1122(int arg0, int arg1) {
        this.field994 = 0;
        this.field951 = 0;
        this.field998 = 0;
        this.field999[0] = arg0;
        this.field996[0] = arg1;
        int var3 = this.method1119();
        this.field948 = this.field999[0] * 128 + var3 * 64;
        this.field949 = this.field996[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bw.e(IIBB)V")
    public final void method1123(int arg0, int arg1, byte arg2) {
        if (this.field994 < 9) {
            this.field994++;
        }
        for (int var4 = this.field994; var4 > 0; var4--) {
            this.field999[var4] = this.field999[var4 - 1];
            this.field996[var4] = this.field996[var4 - 1];
            this.field956[var4] = this.field956[var4 - 1];
        }
        this.field999[0] = arg0;
        this.field996[0] = arg1;
        this.field956[0] = arg2;
    }

    @ObfuscatedName("bw.r(I)Z")
    public final boolean method1116() {
        return this.field612 != null;
    }
}
