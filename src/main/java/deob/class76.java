package deob;

@ObfuscatedName("bi")
public final class class76 extends class79 {

    @ObfuscatedName("bi.f")
    public class294 field660;

    @ObfuscatedName("bi.b")
    public class224 field646;

    @ObfuscatedName("bi.l")
    public int field654 = -1;

    @ObfuscatedName("bi.m")
    public int field648 = -1;

    @ObfuscatedName("bi.q")
    public String[] field673 = new String[3];

    @ObfuscatedName("bi.k")
    public int field650;

    @ObfuscatedName("bi.c")
    public int field651;

    @ObfuscatedName("bi.u")
    public int field652;

    @ObfuscatedName("bi.t")
    public int field671;

    @ObfuscatedName("bi.e")
    public int field649;

    @ObfuscatedName("bi.o")
    public int field655;

    @ObfuscatedName("bi.n")
    public int field656;

    @ObfuscatedName("bi.x")
    public int field657;

    @ObfuscatedName("bi.p")
    public class137 field658;

    @ObfuscatedName("bi.r")
    public int field647;

    @ObfuscatedName("bi.y")
    public int field670;

    @ObfuscatedName("bi.s")
    public int field661;

    @ObfuscatedName("bi.j")
    public int field662;

    @ObfuscatedName("bi.w")
    public boolean field663;

    @ObfuscatedName("bi.v")
    public int field653;

    @ObfuscatedName("bi.d")
    public boolean field659;

    @ObfuscatedName("bi.a")
    public int field666;

    @ObfuscatedName("bi.g")
    public int field667;

    @ObfuscatedName("bi.h")
    public class292 field668;

    @ObfuscatedName("bi.i")
    public class292 field669;

    @ObfuscatedName("bi.ab")
    public boolean field665;

    @ObfuscatedName("bi.ac")
    public int field664;

    @ObfuscatedName("bi.ao")
    public int field672;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field673[var1] = "";
        }
        this.field650 = 0;
        this.field651 = 0;
        this.field671 = 0;
        this.field649 = 0;
        this.field663 = false;
        this.field653 = 0;
        this.field659 = false;
        this.field668 = class292.field3644;
        this.field669 = class292.field3644;
        this.field665 = false;
    }

    @ObfuscatedName("bi.f(Lkb;I)V")
    public final void method1173(class311 arg0) {
        arg0.field3741 = 0;
        int var2 = arg0.method5276();
        this.field654 = arg0.method5181();
        this.field648 = arg0.method5181();
        int var3 = -1;
        this.field653 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5276();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5276();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5163();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class266.method335(var4[var5] - 512).field3472;
                    if (var8 != 0) {
                        this.field653 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5276();
            if (var11 < 0 || var11 >= Statics.field629[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field998 = arg0.method5163();
        if (this.field998 == 65535) {
            this.field998 = -1;
        }
        this.field982 = arg0.method5163();
        if (this.field982 == 65535) {
            this.field982 = -1;
        }
        this.field983 = this.field982;
        this.field991 = arg0.method5163();
        if (this.field991 == 65535) {
            this.field991 = -1;
        }
        this.field985 = arg0.method5163();
        if (this.field985 == 65535) {
            this.field985 = -1;
        }
        this.field986 = arg0.method5163();
        if (this.field986 == 65535) {
            this.field986 = -1;
        }
        this.field984 = arg0.method5163();
        if (this.field984 == 65535) {
            this.field984 = -1;
        }
        this.field988 = arg0.method5163();
        if (this.field988 == 65535) {
            this.field988 = -1;
        }
        this.field660 = new class294(arg0.method5189(), Statics.field1990);
        this.method1169();
        this.method1172();
        if (Statics.field3130 == this) {
            Statics.field2532 = this.field660.method4912();
        }
        this.field650 = arg0.method5276();
        this.field651 = arg0.method5163();
        this.field659 = arg0.method5276() == 1;
        if (client.field871 == 0 && client.field851 >= 2) {
            this.field659 = false;
        }
        if (this.field646 == null) {
            this.field646 = new class224();
        }
        this.field646.method3768(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bi.b(B)Z")
    public boolean method1182() {
        if (class292.field3644 == this.field668) {
            this.method1210();
        }
        return class292.field3645 == this.field668;
    }

    @ObfuscatedName("bi.l(I)V")
    public void method1169() {
        this.field668 = class292.field3644;
    }

    @ObfuscatedName("bi.m(I)V")
    public void method1210() {
        this.field668 = Statics.field150.method1788(this.field660) ? class292.field3645 : class292.field3646;
    }

    @ObfuscatedName("bi.z(B)Z")
    public boolean method1171() {
        if (class292.field3644 == this.field669) {
            this.method1167();
        }
        return class292.field3645 == this.field669;
    }

    @ObfuscatedName("bi.q(I)V")
    public void method1172() {
        this.field669 = class292.field3644;
    }

    @ObfuscatedName("bi.k(I)V")
    public void method1167() {
        this.field669 = Statics.field438 != null && Statics.field438.method4811(this.field660) ? class292.field3645 : class292.field3646;
    }

    @ObfuscatedName("bi.c(I)I")
    public int method1174() {
        return this.field646 == null || this.field646.field2563 == -1 ? 1 : class268.method3332(this.field646.field2563).field3485;
    }

    @ObfuscatedName("bi.u(I)Leh;")
    public final class137 method1175() {
        if (this.field646 == null) {
            return null;
        }
        class270 var1 = this.field1008 != -1 && this.field981 == 0 ? class270.method2219(this.field1008) : null;
        class270 var2 = this.field1005 == -1 || this.field663 || this.field998 == this.field1005 && var1 != null ? null : class270.method2219(this.field1005);
        class137 var3 = this.field646.method3781(var1, this.field1007, var2, this.field1006);
        if (var3 == null) {
            return null;
        }
        var3.method2746();
        this.field1026 = var3.field1900;
        if (!this.field663 && this.field1013 != -1 && this.field1014 != -1) {
            class137 var4 = class255.method1685(this.field1013).method4158(this.field1014);
            if (var4 != null) {
                var4.method2757(0, -this.field1017, 0);
                class137[] var5 = new class137[] { var3, var4 };
                var3 = new class137(var5, 2);
            }
        }
        if (!this.field663 && this.field658 != null) {
            if (client.field863 >= this.field649) {
                this.field658 = null;
            }
            if (client.field863 >= this.field671 && client.field863 < this.field649) {
                class137 var6 = this.field658;
                var6.method2757(this.field655 - this.field1000, this.field656 - this.field652, this.field657 - this.field976);
                if (this.field1027 == 512) {
                    var6.method2753();
                    var6.method2753();
                    var6.method2753();
                } else if (this.field1027 == 1024) {
                    var6.method2753();
                    var6.method2753();
                } else if (this.field1027 == 1536) {
                    var6.method2753();
                }
                class137[] var7 = new class137[] { var3, var6 };
                var3 = new class137(var7, 2);
                if (this.field1027 == 512) {
                    var6.method2753();
                } else if (this.field1027 == 1024) {
                    var6.method2753();
                    var6.method2753();
                } else if (this.field1027 == 1536) {
                    var6.method2753();
                    var6.method2753();
                    var6.method2753();
                }
                var6.method2757(this.field1000 - this.field655, this.field652 - this.field656, this.field976 - this.field657);
            }
        }
        var3.field1726 = true;
        return var3;
    }

    @ObfuscatedName("bi.t(IIBI)V")
    public final void method1176(int arg0, int arg1, byte arg2) {
        if (this.field1008 != -1 && class270.method2219(this.field1008).field3551 == 1) {
            this.field1008 = -1;
        }
        this.field1004 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1177(arg0, arg1);
        } else if (this.field1031[0] >= 0 && this.field1031[0] < 104 && this.field1032[0] >= 0 && this.field1032[0] < 104) {
            if (arg2 == 2) {
                client.method4719(this, arg0, arg1, (byte) 2);
            }
            this.method1178(arg0, arg1, arg2);
        } else {
            this.method1177(arg0, arg1);
        }
    }

    @ObfuscatedName("bi.e(III)V")
    public void method1177(int arg0, int arg1) {
        this.field999 = 0;
        this.field1035 = 0;
        this.field979 = 0;
        this.field1031[0] = arg0;
        this.field1032[0] = arg1;
        int var3 = this.method1174();
        this.field1000 = this.field1031[0] * 128 + var3 * 64;
        this.field976 = this.field1032[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bi.o(IIBI)V")
    public final void method1178(int arg0, int arg1, byte arg2) {
        if (this.field999 < 9) {
            this.field999++;
        }
        for (int var4 = this.field999; var4 > 0; var4--) {
            this.field1031[var4] = this.field1031[var4 - 1];
            this.field1032[var4] = this.field1032[var4 - 1];
            this.field1033[var4] = this.field1033[var4 - 1];
        }
        this.field1031[0] = arg0;
        this.field1032[0] = arg1;
        this.field1033[0] = arg2;
    }

    @ObfuscatedName("bi.n(I)Z")
    public final boolean method1179() {
        return this.field646 != null;
    }
}
