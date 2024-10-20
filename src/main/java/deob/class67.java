package deob;

@ObfuscatedName("bg")
public final class class67 extends class70 {

    @ObfuscatedName("bg.u")
    public class283 field607;

    @ObfuscatedName("bg.f")
    public class215 field617;

    @ObfuscatedName("bg.b")
    public int field608 = -1;

    @ObfuscatedName("bg.g")
    public int field606 = -1;

    @ObfuscatedName("bg.p")
    public String[] field610 = new String[3];

    @ObfuscatedName("bg.h")
    public int field611;

    @ObfuscatedName("bg.y")
    public int field612;

    @ObfuscatedName("bg.w")
    public int field613;

    @ObfuscatedName("bg.i")
    public int field614;

    @ObfuscatedName("bg.k")
    public int field620;

    @ObfuscatedName("bg.x")
    public int field624;

    @ObfuscatedName("bg.o")
    public int field633;

    @ObfuscatedName("bg.e")
    public int field618;

    @ObfuscatedName("bg.n")
    public class128 field616;

    @ObfuscatedName("bg.r")
    public int field619;

    @ObfuscatedName("bg.c")
    public int field621;

    @ObfuscatedName("bg.a")
    public int field622;

    @ObfuscatedName("bg.d")
    public int field623;

    @ObfuscatedName("bg.s")
    public boolean field615;

    @ObfuscatedName("bg.t")
    public int field625;

    @ObfuscatedName("bg.m")
    public boolean field626;

    @ObfuscatedName("bg.v")
    public int field627;

    @ObfuscatedName("bg.q")
    public int field609;

    @ObfuscatedName("bg.l")
    public class281 field629;

    @ObfuscatedName("bg.j")
    public class281 field630;

    @ObfuscatedName("bg.af")
    public boolean field631;

    @ObfuscatedName("bg.ad")
    public int field632;

    @ObfuscatedName("bg.am")
    public int field634;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field610[var1] = "";
        }
        this.field611 = 0;
        this.field612 = 0;
        this.field614 = 0;
        this.field620 = 0;
        this.field615 = false;
        this.field625 = 0;
        this.field626 = false;
        this.field629 = class281.field3617;
        this.field630 = class281.field3617;
        this.field631 = false;
    }

    @ObfuscatedName("bg.u(Lkg;I)V")
    public final void method1095(class300 arg0) {
        arg0.field3707 = 0;
        int var2 = arg0.method5138();
        this.field608 = arg0.method5139();
        this.field606 = arg0.method5139();
        int var3 = -1;
        this.field625 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5138();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5138();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5337();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class255.method1847(var4[var5] - 512).field3410;
                    if (var8 != 0) {
                        this.field625 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5138();
            if (var11 < 0 || var11 >= Statics.field534[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field986 = arg0.method5337();
        if (this.field986 == 65535) {
            this.field986 = -1;
        }
        this.field942 = arg0.method5337();
        if (this.field942 == 65535) {
            this.field942 = -1;
        }
        this.field943 = this.field942;
        this.field944 = arg0.method5337();
        if (this.field944 == 65535) {
            this.field944 = -1;
        }
        this.field945 = arg0.method5337();
        if (this.field945 == 65535) {
            this.field945 = -1;
        }
        this.field946 = arg0.method5337();
        if (this.field946 == 65535) {
            this.field946 = -1;
        }
        this.field964 = arg0.method5337();
        if (this.field964 == 65535) {
            this.field964 = -1;
        }
        this.field948 = arg0.method5337();
        if (this.field948 == 65535) {
            this.field948 = -1;
        }
        this.field607 = new class283(arg0.method5147(), Statics.field120);
        this.method1119();
        this.method1125();
        if (Statics.field2558 == this) {
            Statics.field4043 = this.field607.method4837();
        }
        this.field611 = arg0.method5138();
        this.field612 = arg0.method5337();
        this.field626 = arg0.method5138() == 1;
        if (client.field647 == 0 && client.field812 >= 2) {
            this.field626 = false;
        }
        if (this.field617 == null) {
            this.field617 = new class215();
        }
        this.field617.method3707(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bg.f(B)Z")
    public boolean method1098() {
        if (class281.field3617 == this.field629) {
            this.method1113();
        }
        return class281.field3615 == this.field629;
    }

    @ObfuscatedName("bg.b(B)V")
    public void method1119() {
        this.field629 = class281.field3617;
    }

    @ObfuscatedName("bg.g(I)V")
    public void method1113() {
        this.field629 = Statics.field1745.method1713(this.field607) ? class281.field3615 : class281.field3616;
    }

    @ObfuscatedName("bg.z(I)Z")
    public boolean method1102() {
        if (class281.field3617 == this.field630) {
            this.method1101();
        }
        return class281.field3615 == this.field630;
    }

    @ObfuscatedName("bg.p(I)V")
    public void method1125() {
        this.field630 = class281.field3617;
    }

    @ObfuscatedName("bg.h(I)V")
    public void method1101() {
        this.field630 = Statics.field567 != null && Statics.field567.method4749(this.field607) ? class281.field3615 : class281.field3616;
    }

    @ObfuscatedName("bg.y(B)I")
    public int method1094() {
        return this.field617 == null || this.field617.field2545 == -1 ? 1 : class257.method4083(this.field617.field2545).field3490;
    }

    @ObfuscatedName("bg.w(I)Ldf;")
    public final class128 method1103() {
        if (this.field617 == null) {
            return null;
        }
        class259 var1 = this.field990 != -1 && this.field971 == 0 ? class259.method154(this.field990) : null;
        class259 var2 = this.field985 == -1 || this.field615 || this.field986 == this.field985 && var1 != null ? null : class259.method154(this.field985);
        class128 var3 = this.field617.method3698(var1, this.field969, var2, this.field996);
        if (var3 == null) {
            return null;
        }
        var3.method2640();
        this.field950 = var3.field1863;
        if (!this.field615 && this.field973 != -1 && this.field974 != -1) {
            class128 var4 = class244.method420(this.field973).method4091(this.field974);
            if (var4 != null) {
                var4.method2651(0, -this.field997, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field615 && this.field616 != null) {
            if (client.field655 >= this.field620) {
                this.field616 = null;
            }
            if (client.field655 >= this.field614 && client.field655 < this.field620) {
                class128 var6 = this.field616;
                var6.method2651(this.field624 - this.field992, this.field633 - this.field613, this.field618 - this.field936);
                if (this.field987 == 512) {
                    var6.method2643();
                    var6.method2643();
                    var6.method2643();
                } else if (this.field987 == 1024) {
                    var6.method2643();
                    var6.method2643();
                } else if (this.field987 == 1536) {
                    var6.method2643();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field987 == 512) {
                    var6.method2643();
                } else if (this.field987 == 1024) {
                    var6.method2643();
                    var6.method2643();
                } else if (this.field987 == 1536) {
                    var6.method2643();
                    var6.method2643();
                    var6.method2643();
                }
                var6.method2651(this.field992 - this.field624, this.field613 - this.field633, this.field936 - this.field618);
            }
        }
        var3.field1686 = true;
        return var3;
    }

    @ObfuscatedName("bg.i(IIBI)V")
    public final void method1104(int arg0, int arg1, byte arg2) {
        if (this.field990 != -1 && class259.method154(this.field990).field3516 == 1) {
            this.field990 = -1;
        }
        this.field966 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1105(arg0, arg1);
        } else if (this.field991[0] >= 0 && this.field991[0] < 104 && this.field956[0] >= 0 && this.field956[0] < 104) {
            if (arg2 == 2) {
                class67 var4 = this;
                int var5 = this.field991[0];
                int var6 = this.field956[0];
                int var7 = this.method1094();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = class174.method4207(var5, var6, this.method1094(), client.method282(arg0, arg1), client.field701[this.field627], true, client.field917, client.field863);
                    if (var8 >= 1) {
                        for (int var9 = 0; var9 < var8 - 1; var9++) {
                            var4.method1099(client.field917[var9], client.field863[var9], (byte) 2);
                        }
                    }
                }
            }
            this.method1099(arg0, arg1, arg2);
        } else {
            this.method1105(arg0, arg1);
        }
    }

    @ObfuscatedName("bg.k(III)V")
    public void method1105(int arg0, int arg1) {
        this.field967 = 0;
        this.field995 = 0;
        this.field977 = 0;
        this.field991[0] = arg0;
        this.field956[0] = arg1;
        int var3 = this.method1094();
        this.field992 = this.field991[0] * 128 + var3 * 64;
        this.field936 = this.field956[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bg.x(IIBI)V")
    public final void method1099(int arg0, int arg1, byte arg2) {
        if (this.field967 < 9) {
            this.field967++;
        }
        for (int var4 = this.field967; var4 > 0; var4--) {
            this.field991[var4] = this.field991[var4 - 1];
            this.field956[var4] = this.field956[var4 - 1];
            this.field993[var4] = this.field993[var4 - 1];
        }
        this.field991[0] = arg0;
        this.field956[0] = arg1;
        this.field993[0] = arg2;
    }

    @ObfuscatedName("bg.o(I)Z")
    public final boolean method1096() {
        return this.field617 != null;
    }
}
