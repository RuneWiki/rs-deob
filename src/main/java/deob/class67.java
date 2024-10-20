package deob;

@ObfuscatedName("bd")
public final class class67 extends class70 {

    @ObfuscatedName("bd.q")
    public class284 field622;

    @ObfuscatedName("bd.w")
    public class215 field614;

    @ObfuscatedName("bd.e")
    public int field636 = -1;

    @ObfuscatedName("bd.p")
    public int field616 = -1;

    @ObfuscatedName("bd.l")
    public String[] field620 = new String[3];

    @ObfuscatedName("bd.b")
    public int field619;

    @ObfuscatedName("bd.i")
    public int field618;

    @ObfuscatedName("bd.c")
    public int field624;

    @ObfuscatedName("bd.f")
    public int field615;

    @ObfuscatedName("bd.m")
    public int field623;

    @ObfuscatedName("bd.u")
    public int field634;

    @ObfuscatedName("bd.x")
    public int field625;

    @ObfuscatedName("bd.r")
    public int field621;

    @ObfuscatedName("bd.v")
    public class128 field627;

    @ObfuscatedName("bd.y")
    public int field628;

    @ObfuscatedName("bd.g")
    public int field626;

    @ObfuscatedName("bd.a")
    public int field613;

    @ObfuscatedName("bd.j")
    public int field631;

    @ObfuscatedName("bd.t")
    public boolean field635;

    @ObfuscatedName("bd.h")
    public int field633;

    @ObfuscatedName("bd.o")
    public boolean field629;

    @ObfuscatedName("bd.n")
    public int field630;

    @ObfuscatedName("bd.d")
    public int field638;

    @ObfuscatedName("bd.s")
    public class282 field637;

    @ObfuscatedName("bd.z")
    public class282 field632;

    @ObfuscatedName("bd.al")
    public boolean field639;

    @ObfuscatedName("bd.av")
    public int field640;

    @ObfuscatedName("bd.as")
    public int field641;

    public class67() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field620[var1] = "";
        }
        this.field619 = 0;
        this.field618 = 0;
        this.field615 = 0;
        this.field623 = 0;
        this.field635 = false;
        this.field633 = 0;
        this.field629 = false;
        this.field637 = class282.field3638;
        this.field632 = class282.field3638;
        this.field639 = false;
    }

    @ObfuscatedName("bd.q(Lkf;I)V")
    public final void method1041(class301 arg0) {
        arg0.field3733 = 0;
        int var2 = arg0.method5077();
        this.field636 = arg0.method5068();
        this.field616 = arg0.method5068();
        int var3 = -1;
        this.field633 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method5077();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method5077();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method5069();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class255.method348(var4[var5] - 512).field3451;
                    if (var8 != 0) {
                        this.field633 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method5077();
            if (var11 < 0 || var11 >= Statics.field3292[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1005 = arg0.method5069();
        if (this.field1005 == 65535) {
            this.field1005 = -1;
        }
        this.field956 = arg0.method5069();
        if (this.field956 == 65535) {
            this.field956 = -1;
        }
        this.field957 = this.field956;
        this.field958 = arg0.method5069();
        if (this.field958 == 65535) {
            this.field958 = -1;
        }
        this.field959 = arg0.method5069();
        if (this.field959 == 65535) {
            this.field959 = -1;
        }
        this.field960 = arg0.method5069();
        if (this.field960 == 65535) {
            this.field960 = -1;
        }
        this.field961 = arg0.method5069();
        if (this.field961 == 65535) {
            this.field961 = -1;
        }
        this.field962 = arg0.method5069();
        if (this.field962 == 65535) {
            this.field962 = -1;
        }
        this.field622 = new class284(arg0.method5076(), Statics.field354);
        this.method1044();
        this.method1047();
        if (Statics.field658 == this) {
            Statics.field70 = this.field622.method4790();
        }
        this.field619 = arg0.method5077();
        this.field618 = arg0.method5069();
        this.field629 = arg0.method5077() == 1;
        if (client.field704 == 0 && client.field891 >= 2) {
            this.field629 = false;
        }
        if (this.field614 == null) {
            this.field614 = new class215();
        }
        this.field614.method3646(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bd.w(I)Z")
    public boolean method1043() {
        if (class282.field3638 == this.field637) {
            this.method1082();
        }
        return class282.field3639 == this.field637;
    }

    @ObfuscatedName("bd.e(B)V")
    public void method1044() {
        this.field637 = class282.field3638;
    }

    @ObfuscatedName("bd.p(I)V")
    public void method1082() {
        this.field637 = Statics.field547.method1616(this.field622) ? class282.field3639 : class282.field3640;
    }

    @ObfuscatedName("bd.k(B)Z")
    public boolean method1046() {
        if (class282.field3638 == this.field632) {
            this.method1048();
        }
        return class282.field3639 == this.field632;
    }

    @ObfuscatedName("bd.l(I)V")
    public void method1047() {
        this.field632 = class282.field3638;
    }

    @ObfuscatedName("bd.b(I)V")
    public void method1048() {
        this.field632 = Statics.field411 != null && Statics.field411.method4695(this.field622) ? class282.field3639 : class282.field3640;
    }

    @ObfuscatedName("bd.i(I)I")
    public int method1049() {
        return this.field614 == null || this.field614.field2533 == -1 ? 1 : class257.method867(this.field614.field2533).field3470;
    }

    @ObfuscatedName("bd.c(I)Ldm;")
    public final class128 method1087() {
        if (this.field614 == null) {
            return null;
        }
        class259 var1 = this.field982 != -1 && this.field985 == 0 ? class259.method67(this.field982) : null;
        class259 var2 = this.field979 == -1 || this.field635 || this.field979 == this.field1005 && var1 != null ? null : class259.method67(this.field979);
        class128 var3 = this.field614.method3634(var1, this.field952, var2, this.field980);
        if (var3 == null) {
            return null;
        }
        var3.method2642();
        this.field1000 = var3.field1874;
        if (!this.field635 && this.field987 != -1 && this.field988 != -1) {
            class128 var4 = class244.method3544(this.field987).method4023(this.field988);
            if (var4 != null) {
                var4.method2644(0, -this.field991, 0);
                class128[] var5 = new class128[] { var3, var4 };
                var3 = new class128(var5, 2);
            }
        }
        if (!this.field635 && this.field627 != null) {
            if (client.field882 >= this.field623) {
                this.field627 = null;
            }
            if (client.field882 >= this.field615 && client.field882 < this.field623) {
                class128 var6 = this.field627;
                var6.method2644(this.field634 - this.field1006, this.field625 - this.field624, this.field621 - this.field950);
                if (this.field1001 == 512) {
                    var6.method2612();
                    var6.method2612();
                    var6.method2612();
                } else if (this.field1001 == 1024) {
                    var6.method2612();
                    var6.method2612();
                } else if (this.field1001 == 1536) {
                    var6.method2612();
                }
                class128[] var7 = new class128[] { var3, var6 };
                var3 = new class128(var7, 2);
                if (this.field1001 == 512) {
                    var6.method2612();
                } else if (this.field1001 == 1024) {
                    var6.method2612();
                    var6.method2612();
                } else if (this.field1001 == 1536) {
                    var6.method2612();
                    var6.method2612();
                    var6.method2612();
                }
                var6.method2644(this.field1006 - this.field634, this.field624 - this.field625, this.field950 - this.field621);
            }
        }
        var3.field1731 = true;
        return var3;
    }

    @ObfuscatedName("bd.u(IIBS)V")
    public final void method1051(int arg0, int arg1, byte arg2) {
        if (this.field982 != -1 && class259.method67(this.field982).field3533 == 1) {
            this.field982 = -1;
        }
        this.field977 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1067(arg0, arg1);
        } else if (this.field995[0] >= 0 && this.field995[0] < 104 && this.field963[0] >= 0 && this.field963[0] < 104) {
            if (arg2 == 2) {
                client.method3693(this, arg0, arg1, (byte) 2);
            }
            this.method1053(arg0, arg1, arg2);
        } else {
            this.method1067(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.x(III)V")
    public void method1067(int arg0, int arg1) {
        this.field1004 = 0;
        this.field1009 = 0;
        this.field1008 = 0;
        this.field995[0] = arg0;
        this.field963[0] = arg1;
        int var3 = this.method1049();
        this.field1006 = this.field995[0] * 128 + var3 * 64;
        this.field950 = this.field963[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bd.r(IIBB)V")
    public final void method1053(int arg0, int arg1, byte arg2) {
        if (this.field1004 < 9) {
            this.field1004++;
        }
        for (int var4 = this.field1004; var4 > 0; var4--) {
            this.field995[var4] = this.field995[var4 - 1];
            this.field963[var4] = this.field963[var4 - 1];
            this.field1007[var4] = this.field1007[var4 - 1];
        }
        this.field995[0] = arg0;
        this.field963[0] = arg1;
        this.field1007[0] = arg2;
    }

    @ObfuscatedName("bd.v(I)Z")
    public final boolean method1045() {
        return this.field614 != null;
    }
}
