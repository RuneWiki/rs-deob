package deob;

@ObfuscatedName("bf")
public final class class76 extends class79 {

    @ObfuscatedName("bf.z")
    public class293 field649;

    @ObfuscatedName("bf.k")
    public class224 field645;

    @ObfuscatedName("bf.s")
    public int field642 = -1;

    @ObfuscatedName("bf.t")
    public int field638 = -1;

    @ObfuscatedName("bf.o")
    public String[] field640 = new String[3];

    @ObfuscatedName("bf.x")
    public int field653;

    @ObfuscatedName("bf.w")
    public int field654;

    @ObfuscatedName("bf.g")
    public int field643;

    @ObfuscatedName("bf.m")
    public int field659;

    @ObfuscatedName("bf.n")
    public int field651;

    @ObfuscatedName("bf.d")
    public int field646;

    @ObfuscatedName("bf.h")
    public int field647;

    @ObfuscatedName("bf.a")
    public int field641;

    @ObfuscatedName("bf.q")
    public class137 field648;

    @ObfuscatedName("bf.c")
    public int field650;

    @ObfuscatedName("bf.f")
    public int field636;

    @ObfuscatedName("bf.y")
    public int field652;

    @ObfuscatedName("bf.v")
    public int field644;

    @ObfuscatedName("bf.j")
    public boolean field635;

    @ObfuscatedName("bf.r")
    public int field655;

    @ObfuscatedName("bf.u")
    public boolean field656;

    @ObfuscatedName("bf.p")
    public int field657;

    @ObfuscatedName("bf.b")
    public int field658;

    @ObfuscatedName("bf.l")
    public class291 field639;

    @ObfuscatedName("bf.e")
    public class291 field660;

    @ObfuscatedName("bf.ab")
    public boolean field661;

    @ObfuscatedName("bf.ag")
    public int field662;

    @ObfuscatedName("bf.ao")
    public int field663;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field640[var1] = "";
        }
        this.field653 = 0;
        this.field654 = 0;
        this.field659 = 0;
        this.field651 = 0;
        this.field635 = false;
        this.field655 = 0;
        this.field656 = false;
        this.field639 = class291.field3639;
        this.field660 = class291.field3639;
        this.field661 = false;
    }

    @ObfuscatedName("bf.z(Lkf;I)V")
    public final void method1145(class310 arg0) {
        arg0.field3734 = 0;
        int var2 = arg0.method5193();
        this.field642 = arg0.method5194();
        this.field638 = arg0.method5194();
        int var3 = -1;
        this.field655 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5193();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5193();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5195();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class265.method136(var4[var5] - 512).field3477;
                    if (var8 != 0) {
                        this.field655 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5193();
            if (var11 < 0 || var11 >= Statics.field254[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field978 = arg0.method5195();
        if (this.field978 == 65535) {
            this.field978 = -1;
        }
        this.field979 = arg0.method5195();
        if (this.field979 == 65535) {
            this.field979 = -1;
        }
        this.field980 = this.field979;
        this.field981 = arg0.method5195();
        if (this.field981 == 65535) {
            this.field981 = -1;
        }
        this.field982 = arg0.method5195();
        if (this.field982 == 65535) {
            this.field982 = -1;
        }
        this.field983 = arg0.method5195();
        if (this.field983 == 65535) {
            this.field983 = -1;
        }
        this.field984 = arg0.method5195();
        if (this.field984 == 65535) {
            this.field984 = -1;
        }
        this.field985 = arg0.method5195();
        if (this.field985 == 65535) {
            this.field985 = -1;
        }
        this.field649 = new class293(arg0.method5202(), Statics.field356);
        this.method1132();
        this.method1138();
        if (Statics.field141 == this) {
            Statics.field4072 = this.field649.method4889();
        }
        this.field653 = arg0.method5193();
        this.field654 = arg0.method5195();
        this.field656 = arg0.method5193() == 1;
        if (client.field905 == 0 && client.field814 >= 2) {
            this.field656 = false;
        }
        if (this.field645 == null) {
            this.field645 = new class224();
        }
        this.field645.method3742(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bf.k(I)Z")
    public boolean method1134() {
        if (class291.field3639 == this.field639) {
            this.method1136();
        }
        return class291.field3637 == this.field639;
    }

    @ObfuscatedName("bf.s(I)V")
    public void method1132() {
        this.field639 = class291.field3639;
    }

    @ObfuscatedName("bf.t(I)V")
    public void method1136() {
        this.field639 = Statics.field456.method1763(this.field649) ? class291.field3637 : class291.field3638;
    }

    @ObfuscatedName("bf.i(B)Z")
    public boolean method1137() {
        if (class291.field3639 == this.field660) {
            this.method1139();
        }
        return class291.field3637 == this.field660;
    }

    @ObfuscatedName("bf.o(B)V")
    public void method1138() {
        this.field660 = class291.field3639;
    }

    @ObfuscatedName("bf.x(I)V")
    public void method1139() {
        this.field660 = Statics.field1907 != null && Statics.field1907.method4816(this.field649) ? class291.field3637 : class291.field3638;
    }

    @ObfuscatedName("bf.w(I)I")
    public int method1140() {
        return this.field645 == null || this.field645.field2573 == -1 ? 1 : class267.method2944(this.field645.field2573).field3513;
    }

    @ObfuscatedName("bf.g(I)Ler;")
    public final class137 method1141() {
        if (this.field645 == null) {
            return null;
        }
        class269 var1 = this.field1005 != -1 && this.field1008 == 0 ? class269.method536(this.field1005) : null;
        class269 var2 = this.field1002 == -1 || this.field635 || this.field978 == this.field1002 && var1 != null ? null : class269.method536(this.field1002);
        class137 var3 = this.field645.method3761(var1, this.field1009, var2, this.field1003);
        if (var3 == null) {
            return null;
        }
        var3.method2758();
        this.field1023 = var3.field1906;
        if (!this.field635 && this.field972 != -1 && this.field1011 != -1) {
            class137 var4 = class254.method1045(this.field972).method4116(this.field1011);
            if (var4 != null) {
                var4.method2760(0, -this.field1004, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (!this.field635 && this.field648 != null) {
            if (client.field674 >= this.field651) {
                this.field648 = null;
            }
            if (client.field674 >= this.field659 && client.field674 < this.field651) {
                class137 var6 = this.field648;
                var6.method2760(this.field646 - this.field995, this.field647 - this.field643, this.field641 - this.field1024);
                if (this.field1032 == 512) {
                    var6.method2756();
                    var6.method2756();
                    var6.method2756();
                } else if (this.field1032 == 1024) {
                    var6.method2756();
                    var6.method2756();
                } else if (this.field1032 == 1536) {
                    var6.method2756();
                }
                class137[] var7 = new class137[] { var3, var6 };
                var3 = new class137(var7, 2);
                if (this.field1032 == 512) {
                    var6.method2756();
                } else if (this.field1032 == 1024) {
                    var6.method2756();
                    var6.method2756();
                } else if (this.field1032 == 1536) {
                    var6.method2756();
                    var6.method2756();
                    var6.method2756();
                }
                var6.method2760(this.field995 - this.field646, this.field643 - this.field647, this.field1024 - this.field641);
            }
        }
        var3.field1712 = true;
        return var3;
    }

    @ObfuscatedName("bf.m(IIBI)V")
    public final void method1142(int arg0, int arg1, byte arg2) {
        if (this.field1005 != -1 && class269.method536(this.field1005).field3542 == 1) {
            this.field1005 = -1;
        }
        this.field1001 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1135(arg0, arg1);
        } else if (this.field1031[0] >= 0 && this.field1031[0] < 104 && this.field1029[0] >= 0 && this.field1029[0] < 104) {
            if (arg2 == 2) {
                client.method5174(this, arg0, arg1, (byte) 2);
            }
            this.method1144(arg0, arg1, arg2);
        } else {
            this.method1135(arg0, arg1);
        }
    }

    @ObfuscatedName("bf.n(III)V")
    public void method1135(int arg0, int arg1) {
        this.field1006 = 0;
        this.field974 = 0;
        this.field1033 = 0;
        this.field1031[0] = arg0;
        this.field1029[0] = arg1;
        int var3 = this.method1140();
        this.field995 = this.field1031[0] * 128 + var3 * 64;
        this.field1024 = this.field1029[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bf.d(IIBB)V")
    public final void method1144(int arg0, int arg1, byte arg2) {
        if (this.field1006 < 9) {
            this.field1006++;
        }
        for (int var4 = this.field1006; var4 > 0; var4--) {
            this.field1031[var4] = this.field1031[var4 - 1];
            this.field1029[var4] = this.field1029[var4 - 1];
            this.field1013[var4] = this.field1013[var4 - 1];
        }
        this.field1031[0] = arg0;
        this.field1029[0] = arg1;
        this.field1013[0] = arg2;
    }

    @ObfuscatedName("bf.h(I)Z")
    public final boolean method1165() {
        return this.field645 != null;
    }
}
