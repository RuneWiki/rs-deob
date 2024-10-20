package deob;

@ObfuscatedName("t")
public final class class3 extends class40 {

    @ObfuscatedName("t.s")
    public String field30;

    @ObfuscatedName("t.z")
    public class183 field27;

    @ObfuscatedName("t.t")
    public int field28 = -1;

    @ObfuscatedName("t.y")
    public int field29 = -1;

    @ObfuscatedName("t.g")
    public String[] field31 = new String[3];

    @ObfuscatedName("t.m")
    public int field32;

    @ObfuscatedName("t.f")
    public int field33;

    @ObfuscatedName("t.k")
    public int field34;

    @ObfuscatedName("t.h")
    public int field40;

    @ObfuscatedName("t.r")
    public int field36;

    @ObfuscatedName("t.w")
    public int field45;

    @ObfuscatedName("t.u")
    public int field38;

    @ObfuscatedName("t.n")
    public int field39;

    @ObfuscatedName("t.d")
    public class109 field46;

    @ObfuscatedName("t.a")
    public int field41;

    @ObfuscatedName("t.b")
    public int field42;

    @ObfuscatedName("t.q")
    public int field43;

    @ObfuscatedName("t.o")
    public int field44;

    @ObfuscatedName("t.c")
    public boolean field37;

    @ObfuscatedName("t.i")
    public int field26;

    @ObfuscatedName("t.x")
    public boolean field51;

    @ObfuscatedName("t.v")
    public int field48;

    @ObfuscatedName("t.l")
    public int field49;

    @ObfuscatedName("t.e")
    public boolean field47;

    @ObfuscatedName("t.j")
    public int field54;

    @ObfuscatedName("t.ae")
    public int field52;

    public class3() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field31[var1] = "";
        }
        this.field32 = 0;
        this.field33 = 0;
        this.field40 = 0;
        this.field36 = 0;
        this.field37 = false;
        this.field26 = 0;
        this.field51 = false;
        this.field47 = false;
    }

    @ObfuscatedName("t.s(Ldy;B)V")
    public final void method8(class123 arg0) {
        arg0.field2028 = 0;
        int var2 = arg0.method2363();
        this.field28 = arg0.method2483();
        this.field29 = arg0.method2483();
        int var3 = -1;
        this.field26 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2363();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2363();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2550();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class56.method3201(var4[var5] - 512).field1188;
                    if (var8 != 0) {
                        this.field26 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2363();
            if (var11 < 0 || var11 >= Statics.field2965[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field830 = arg0.method2550();
        if (this.field830 == 65535) {
            this.field830 = -1;
        }
        this.field808 = arg0.method2550();
        if (this.field808 == 65535) {
            this.field808 = -1;
        }
        this.field807 = this.field808;
        this.field814 = arg0.method2550();
        if (this.field814 == 65535) {
            this.field814 = -1;
        }
        this.field803 = arg0.method2550();
        if (this.field803 == 65535) {
            this.field803 = -1;
        }
        this.field809 = arg0.method2550();
        if (this.field809 == 65535) {
            this.field809 = -1;
        }
        this.field862 = arg0.method2550();
        if (this.field862 == 65535) {
            this.field862 = -1;
        }
        this.field813 = arg0.method2550();
        if (this.field813 == 65535) {
            this.field813 = -1;
        }
        this.field30 = arg0.method2385();
        if (Statics.field1663 == this) {
            Statics.field2265 = this.field30;
        }
        this.field32 = arg0.method2363();
        this.field33 = arg0.method2550();
        this.field51 = arg0.method2363() == 1;
        if (client.field268 == 0 && client.field436 >= 2) {
            this.field51 = false;
        }
        if (this.field27 == null) {
            this.field27 = new class183();
        }
        this.field27.method3284(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("t.z(S)I")
    public int method10() {
        return this.field27 == null || this.field27.field2964 == -1 ? 1 : class42.method2674(this.field27.field2964).field903;
    }

    @ObfuscatedName("t.t(B)Lde;")
    public final class109 method27() {
        if (this.field27 == null) {
            return null;
        }
        class45 var1 = this.field858 != -1 && this.field837 == 0 ? class45.method44(this.field858) : null;
        class45 var2 = this.field827 == -1 || this.field37 || this.field830 == this.field827 && var1 != null ? null : class45.method44(this.field827);
        class109 var3 = this.field27.method3307(var1, this.field835, var2, this.field842);
        if (var3 == null) {
            return null;
        }
        var3.method2169();
        this.field852 = var3.field1503;
        if (!this.field37 && this.field805 != -1 && this.field812 != -1) {
            class109 var4 = class46.method2163(this.field805).method900(this.field812);
            if (var4 != null) {
                var4.method2174(0, -this.field840, 0);
                class109[] var5 = new class109[] { var3, var4 };
                var3 = new class109(var5, 2);
            }
        }
        if (!this.field37 && this.field46 != null) {
            if (client.field326 >= this.field36) {
                this.field46 = null;
            }
            if (client.field326 >= this.field40 && client.field326 < this.field36) {
                class109 var6 = this.field46;
                var6.method2174(this.field45 - this.field810, this.field38 - this.field34, this.field39 - this.field843);
                if (this.field853 == 512) {
                    var6.method2217();
                    var6.method2217();
                    var6.method2217();
                } else if (this.field853 == 1024) {
                    var6.method2217();
                    var6.method2217();
                } else if (this.field853 == 1536) {
                    var6.method2217();
                }
                class109[] var7 = new class109[] { var3, var6 };
                var3 = new class109(var7, 2);
                if (this.field853 == 512) {
                    var6.method2217();
                } else if (this.field853 == 1024) {
                    var6.method2217();
                    var6.method2217();
                } else if (this.field853 == 1536) {
                    var6.method2217();
                    var6.method2217();
                    var6.method2217();
                }
                var6.method2174(this.field810 - this.field45, this.field34 - this.field38, this.field843 - this.field39);
            }
        }
        var3.field1865 = true;
        return var3;
    }

    @ObfuscatedName("t.y(IIBI)V")
    public final void method12(int arg0, int arg1, byte arg2) {
        if (this.field858 != -1 && class45.method44(this.field858).field981 == 1) {
            this.field858 = -1;
        }
        this.field851 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method13(arg0, arg1);
        } else if (this.field857[0] >= 0 && this.field857[0] < 104 && this.field831[0] >= 0 && this.field831[0] < 104) {
            if (arg2 == 2) {
                client.method187(this, arg0, arg1, (byte) 2);
            }
            this.method14(arg0, arg1, arg2);
        } else {
            this.method13(arg0, arg1);
        }
    }

    @ObfuscatedName("t.p(III)V")
    public void method13(int arg0, int arg1) {
        this.field856 = 0;
        this.field822 = 0;
        this.field860 = 0;
        this.field857[0] = arg0;
        this.field831[0] = arg1;
        int var3 = this.method10();
        this.field810 = this.field857[0] * 128 + var3 * 64;
        this.field843 = this.field831[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("t.g(IIBB)V")
    public final void method14(int arg0, int arg1, byte arg2) {
        if (this.field856 < 9) {
            this.field856++;
        }
        for (int var4 = this.field856; var4 > 0; var4--) {
            this.field857[var4] = this.field857[var4 - 1];
            this.field831[var4] = this.field831[var4 - 1];
            this.field859[var4] = this.field859[var4 - 1];
        }
        this.field857[0] = arg0;
        this.field831[0] = arg1;
        this.field859[0] = arg2;
    }

    @ObfuscatedName("t.m(I)Z")
    public final boolean method35() {
        return this.field27 != null;
    }
}
