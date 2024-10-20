package deob;

@ObfuscatedName("u")
public final class class24 extends class28 {

    @ObfuscatedName("u.b")
    public String field267;

    @ObfuscatedName("u.e")
    public class167 field246;

    @ObfuscatedName("u.c")
    public int field245 = -1;

    @ObfuscatedName("u.l")
    public int field248 = -1;

    @ObfuscatedName("u.j")
    public String[] field250 = new String[3];

    @ObfuscatedName("u.g")
    public int field255;

    @ObfuscatedName("u.s")
    public int field270;

    @ObfuscatedName("u.r")
    public int field254;

    @ObfuscatedName("u.t")
    public int field269;

    @ObfuscatedName("u.k")
    public int field247;

    @ObfuscatedName("u.f")
    public int field258;

    @ObfuscatedName("u.a")
    public int field257;

    @ObfuscatedName("u.v")
    public int field251;

    @ObfuscatedName("u.d")
    public class83 field259;

    @ObfuscatedName("u.o")
    public int field260;

    @ObfuscatedName("u.q")
    public int field261;

    @ObfuscatedName("u.i")
    public int field264;

    @ObfuscatedName("u.x")
    public int field263;

    @ObfuscatedName("u.z")
    public boolean field256;

    @ObfuscatedName("u.n")
    public int field265;

    @ObfuscatedName("u.w")
    public boolean field266;

    @ObfuscatedName("u.h")
    public int field252;

    @ObfuscatedName("u.u")
    public int field268;

    @ObfuscatedName("u.m")
    public boolean field262;

    @ObfuscatedName("u.p")
    public int field253;

    @ObfuscatedName("u.aq")
    public int field271;

    public class24() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field250[var1] = "";
        }
        this.field255 = 0;
        this.field270 = 0;
        this.field269 = 0;
        this.field247 = 0;
        this.field256 = false;
        this.field265 = 0;
        this.field266 = false;
        this.field262 = false;
    }

    @ObfuscatedName("u.b(Lec;I)V")
    public final void method239(class154 arg0) {
        arg0.field2079 = 0;
        int var2 = arg0.method2669();
        this.field245 = arg0.method2670();
        this.field248 = arg0.method2670();
        int var3 = -1;
        this.field265 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2669();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2669();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2671();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class199.method751(var4[var5] - 512).field2979;
                    if (var8 != 0) {
                        this.field265 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2669();
            if (var11 < 0 || var11 >= Statics.field2168[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field604 = arg0.method2671();
        if (this.field604 == 65535) {
            this.field604 = -1;
        }
        this.field621 = arg0.method2671();
        if (this.field621 == 65535) {
            this.field621 = -1;
        }
        this.field608 = this.field621;
        this.field622 = arg0.method2671();
        if (this.field622 == 65535) {
            this.field622 = -1;
        }
        this.field634 = arg0.method2671();
        if (this.field634 == 65535) {
            this.field634 = -1;
        }
        this.field611 = arg0.method2671();
        if (this.field611 == 65535) {
            this.field611 = -1;
        }
        this.field612 = arg0.method2671();
        if (this.field612 == 65535) {
            this.field612 = -1;
        }
        this.field613 = arg0.method2671();
        if (this.field613 == 65535) {
            this.field613 = -1;
        }
        this.field267 = arg0.method2677();
        if (Statics.field685 == this) {
            Statics.field1647 = this.field267;
        }
        this.field255 = arg0.method2669();
        this.field270 = arg0.method2671();
        this.field266 = arg0.method2669() == 1;
        if (client.field562 == 0 && client.field507 >= 2) {
            this.field266 = false;
        }
        if (this.field246 == null) {
            this.field246 = new class167();
        }
        this.field246.method2996(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("u.e(B)I")
    public int method249() {
        return this.field246 == null || this.field246.field2171 == -1 ? 1 : class200.method3376(this.field246.field2171).field3042;
    }

    @ObfuscatedName("u.c(B)Lco;")
    public final class83 method241() {
        if (this.field246 == null) {
            return null;
        }
        class202 var1 = this.field633 != -1 && this.field636 == 0 ? class202.method17(this.field633) : null;
        class202 var2 = this.field630 == -1 || this.field256 || this.field630 == this.field604 && var1 != null ? null : class202.method17(this.field630);
        class83 var3 = this.field246.method3021(var1, this.field650, var2, this.field615);
        if (var3 == null) {
            return null;
        }
        var3.method1505();
        this.field651 = var3.field1548;
        if (!this.field256 && this.field638 != -1 && this.field639 != -1) {
            class83 var4 = class191.method3117(this.field638).method3304(this.field639);
            if (var4 != null) {
                var4.method1513(0, -this.field642, 0);
                class83[] var5 = new class83[] { var3, var4 };
                var3 = new class83(var5, 2);
            }
        }
        if (!this.field256 && this.field259 != null) {
            if (client.field489 >= this.field247) {
                this.field259 = null;
            }
            if (client.field489 >= this.field269 && client.field489 < this.field247) {
                class83 var6 = this.field259;
                var6.method1513(this.field258 - this.field610, this.field257 - this.field254, this.field251 - this.field609);
                if (this.field652 == 512) {
                    var6.method1511();
                    var6.method1511();
                    var6.method1511();
                } else if (this.field652 == 1024) {
                    var6.method1511();
                    var6.method1511();
                } else if (this.field652 == 1536) {
                    var6.method1511();
                }
                class83[] var7 = new class83[] { var3, var6 };
                var3 = new class83(var7, 2);
                if (this.field652 == 512) {
                    var6.method1511();
                } else if (this.field652 == 1024) {
                    var6.method1511();
                    var6.method1511();
                } else if (this.field652 == 1536) {
                    var6.method1511();
                    var6.method1511();
                    var6.method1511();
                }
                var6.method1513(this.field610 - this.field258, this.field254 - this.field257, this.field609 - this.field251);
            }
        }
        var3.field1397 = true;
        return var3;
    }

    @ObfuscatedName("u.l(IIBI)V")
    public final void method240(int arg0, int arg1, byte arg2) {
        if (this.field633 != -1 && class202.method17(this.field633).field3075 == 1) {
            this.field633 = -1;
        }
        this.field629 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method243(arg0, arg1);
        } else if (this.field656[0] >= 0 && this.field656[0] < 104 && this.field657[0] >= 0 && this.field657[0] < 104) {
            if (arg2 == 2) {
                class24 var4 = this;
                int var5 = this.field656[0];
                int var6 = this.field657[0];
                int var7 = this.method249();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var10 = this.method249();
                    client.field394.field1842 = arg0;
                    client.field394.field1838 = arg1;
                    client.field394.field1836 = 1;
                    client.field394.field1839 = 1;
                    class23 var11 = client.field394;
                    int var12 = class119.method30(var5, var6, var10, var11, client.field348[this.field252], true, client.field568, client.field349);
                    if (var12 >= 1) {
                        for (int var13 = 0; var13 < var12 - 1; var13++) {
                            var4.method248(client.field568[var13], client.field349[var13], (byte) 2);
                        }
                    }
                }
            }
            this.method248(arg0, arg1, arg2);
        } else {
            this.method243(arg0, arg1);
        }
    }

    @ObfuscatedName("u.y(III)V")
    public void method243(int arg0, int arg1) {
        this.field655 = 0;
        this.field660 = 0;
        this.field659 = 0;
        this.field656[0] = arg0;
        this.field657[0] = arg1;
        int var3 = this.method249();
        this.field610 = this.field656[0] * 128 + var3 * 64;
        this.field609 = this.field657[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("u.j(IIBI)V")
    public final void method248(int arg0, int arg1, byte arg2) {
        if (this.field655 < 9) {
            this.field655++;
        }
        for (int var4 = this.field655; var4 > 0; var4--) {
            this.field656[var4] = this.field656[var4 - 1];
            this.field657[var4] = this.field657[var4 - 1];
            this.field658[var4] = this.field658[var4 - 1];
        }
        this.field656[0] = arg0;
        this.field657[0] = arg1;
        this.field658[0] = arg2;
    }

    @ObfuscatedName("u.t(I)Z")
    public final boolean method245() {
        return this.field246 != null;
    }
}
