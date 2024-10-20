package deob;

@ObfuscatedName("bi")
public final class class76 extends class79 {

    @ObfuscatedName("bi.x")
    public class293 field653;

    @ObfuscatedName("bi.m")
    public class224 field647;

    @ObfuscatedName("bi.k")
    public int field649 = -1;

    @ObfuscatedName("bi.d")
    public int field648 = -1;

    @ObfuscatedName("bi.v")
    public String[] field650 = new String[3];

    @ObfuscatedName("bi.q")
    public int field651;

    @ObfuscatedName("bi.z")
    public int field672;

    @ObfuscatedName("bi.t")
    public int field646;

    @ObfuscatedName("bi.e")
    public int field654;

    @ObfuscatedName("bi.s")
    public int field655;

    @ObfuscatedName("bi.p")
    public int field663;

    @ObfuscatedName("bi.n")
    public int field656;

    @ObfuscatedName("bi.u")
    public int field658;

    @ObfuscatedName("bi.h")
    public class137 field657;

    @ObfuscatedName("bi.g")
    public int field660;

    @ObfuscatedName("bi.i")
    public int field661;

    @ObfuscatedName("bi.a")
    public int field662;

    @ObfuscatedName("bi.b")
    public int field665;

    @ObfuscatedName("bi.l")
    public boolean field664;

    @ObfuscatedName("bi.r")
    public int field645;

    @ObfuscatedName("bi.o")
    public boolean field652;

    @ObfuscatedName("bi.c")
    public int field667;

    @ObfuscatedName("bi.j")
    public int field668;

    @ObfuscatedName("bi.y")
    public class291 field669;

    @ObfuscatedName("bi.f")
    public class291 field670;

    @ObfuscatedName("bi.ae")
    public boolean field671;

    @ObfuscatedName("bi.ai")
    public int field666;

    @ObfuscatedName("bi.ap")
    public int field673;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field650[var1] = "";
        }
        this.field651 = 0;
        this.field672 = 0;
        this.field654 = 0;
        this.field655 = 0;
        this.field664 = false;
        this.field645 = 0;
        this.field652 = false;
        this.field669 = class291.field3615;
        this.field670 = class291.field3615;
        this.field671 = false;
    }

    @ObfuscatedName("bi.x(Lkb;I)V")
    public final void method1174(class310 arg0) {
        arg0.field3711 = 0;
        int var2 = arg0.method5137();
        this.field649 = arg0.method5138();
        this.field648 = arg0.method5138();
        int var3 = -1;
        this.field645 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5137();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5137();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5139();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class265.method337(var4[var5] - 512).field3445;
                    if (var8 != 0) {
                        this.field645 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5137();
            if (var11 < 0 || var11 >= Statics.field1765[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field979 = arg0.method5139();
        if (this.field979 == 65535) {
            this.field979 = -1;
        }
        this.field1011 = arg0.method5139();
        if (this.field1011 == 65535) {
            this.field1011 = -1;
        }
        this.field981 = this.field1011;
        this.field994 = arg0.method5139();
        if (this.field994 == 65535) {
            this.field994 = -1;
        }
        this.field983 = arg0.method5139();
        if (this.field983 == 65535) {
            this.field983 = -1;
        }
        this.field1004 = arg0.method5139();
        if (this.field1004 == 65535) {
            this.field1004 = -1;
        }
        this.field985 = arg0.method5139();
        if (this.field985 == 65535) {
            this.field985 = -1;
        }
        this.field986 = arg0.method5139();
        if (this.field986 == 65535) {
            this.field986 = -1;
        }
        this.field653 = new class293(arg0.method5257(), Statics.field165);
        this.method1176();
        this.method1219();
        if (Statics.field3718 == this) {
            Statics.field4070 = this.field653.method4845();
        }
        this.field651 = arg0.method5137();
        this.field672 = arg0.method5139();
        this.field652 = arg0.method5137() == 1;
        if (client.field683 == 0 && client.field850 >= 2) {
            this.field652 = false;
        }
        if (this.field647 == null) {
            this.field647 = new class224();
        }
        this.field647.method3737(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bi.m(I)Z")
    public boolean method1195() {
        if (class291.field3615 == this.field669) {
            this.method1177();
        }
        return class291.field3614 == this.field669;
    }

    @ObfuscatedName("bi.k(I)V")
    public void method1176() {
        this.field669 = class291.field3615;
    }

    @ObfuscatedName("bi.d(I)V")
    public void method1177() {
        this.field669 = Statics.field1253.method1783(this.field653) ? class291.field3614 : class291.field3613;
    }

    @ObfuscatedName("bi.w(I)Z")
    public boolean method1178() {
        if (class291.field3615 == this.field670) {
            this.method1180();
        }
        return class291.field3614 == this.field670;
    }

    @ObfuscatedName("bi.v(B)V")
    public void method1219() {
        this.field670 = class291.field3615;
    }

    @ObfuscatedName("bi.q(B)V")
    public void method1180() {
        this.field670 = Statics.field597 != null && Statics.field597.method4745(this.field653) ? class291.field3614 : class291.field3613;
    }

    @ObfuscatedName("bi.z(B)I")
    public int method1181() {
        return this.field647 == null || this.field647.field2538 == -1 ? 1 : class267.method3854(this.field647.field2538).field3471;
    }

    @ObfuscatedName("bi.t(I)Lel;")
    public final class137 method1182() {
        if (this.field647 == null) {
            return null;
        }
        class269 var1 = this.field1017 != -1 && this.field1009 == 0 ? class269.method4110(this.field1017) : null;
        class269 var2 = this.field1025 == -1 || this.field664 || this.field979 == this.field1025 && var1 != null ? null : class269.method4110(this.field1025);
        class137 var3 = this.field647.method3726(var1, this.field1015, var2, this.field975);
        if (var3 == null) {
            return null;
        }
        var3.method2705();
        this.field1024 = var3.field1884;
        if (!this.field664 && this.field1010 != -1 && this.field1007 != -1) {
            class137 var4 = class254.method1049(this.field1010).method4099(this.field1007);
            if (var4 != null) {
                var4.method2716(0, -this.field1034, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (!this.field664 && this.field657 != null) {
            if (client.field690 >= this.field655) {
                this.field657 = null;
            }
            if (client.field690 >= this.field654 && client.field690 < this.field655) {
                class137 var6 = this.field657;
                var6.method2716(this.field663 - this.field984, this.field656 - this.field646, this.field658 - this.field974);
                if (this.field980 == 512) {
                    var6.method2719();
                    var6.method2719();
                    var6.method2719();
                } else if (this.field980 == 1024) {
                    var6.method2719();
                    var6.method2719();
                } else if (this.field980 == 1536) {
                    var6.method2719();
                }
                class137[] var7 = new class137[] { var3, var6 };
                var3 = new class137(var7, 2);
                if (this.field980 == 512) {
                    var6.method2719();
                } else if (this.field980 == 1024) {
                    var6.method2719();
                    var6.method2719();
                } else if (this.field980 == 1536) {
                    var6.method2719();
                    var6.method2719();
                    var6.method2719();
                }
                var6.method2716(this.field984 - this.field663, this.field646 - this.field656, this.field974 - this.field658);
            }
        }
        var3.field1717 = true;
        return var3;
    }

    @ObfuscatedName("bi.e(IIBI)V")
    public final void method1183(int arg0, int arg1, byte arg2) {
        if (this.field1017 != -1 && class269.method4110(this.field1017).field3525 == 1) {
            this.field1017 = -1;
        }
        this.field1016 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1223(arg0, arg1);
        } else if (this.field1029[0] >= 0 && this.field1029[0] < 104 && this.field1030[0] >= 0 && this.field1030[0] < 104) {
            if (arg2 == 2) {
                client.method2379(this, arg0, arg1, (byte) 2);
            }
            this.method1185(arg0, arg1, arg2);
        } else {
            this.method1223(arg0, arg1);
        }
    }

    @ObfuscatedName("bi.s(III)V")
    public void method1223(int arg0, int arg1) {
        this.field1028 = 0;
        this.field1033 = 0;
        this.field1032 = 0;
        this.field1029[0] = arg0;
        this.field1030[0] = arg1;
        int var3 = this.method1181();
        this.field984 = this.field1029[0] * 128 + var3 * 64;
        this.field974 = this.field1030[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bi.p(IIBI)V")
    public final void method1185(int arg0, int arg1, byte arg2) {
        if (this.field1028 < 9) {
            this.field1028++;
        }
        for (int var4 = this.field1028; var4 > 0; var4--) {
            this.field1029[var4] = this.field1029[var4 - 1];
            this.field1030[var4] = this.field1030[var4 - 1];
            this.field1023[var4] = this.field1023[var4 - 1];
        }
        this.field1029[0] = arg0;
        this.field1030[0] = arg1;
        this.field1023[0] = arg2;
    }

    @ObfuscatedName("bi.n(I)Z")
    public final boolean method1179() {
        return this.field647 != null;
    }
}
