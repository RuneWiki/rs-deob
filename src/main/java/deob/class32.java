package deob;

@ObfuscatedName("aj")
public class class32 extends class174 {

    @ObfuscatedName("aj.y")
    public static class167 field756 = new class167(64);

    @ObfuscatedName("aj.g")
    public static class167 field757 = new class167(50);

    @ObfuscatedName("aj.r")
    public int field792;

    @ObfuscatedName("aj.i")
    public String field775 = "null";

    @ObfuscatedName("aj.f")
    public int field789 = 1;

    @ObfuscatedName("aj.a")
    public int[] field763;

    @ObfuscatedName("aj.w")
    public int[] field779;

    @ObfuscatedName("aj.u")
    public int field769 = -1;

    @ObfuscatedName("aj.d")
    public int field764 = -1;

    @ObfuscatedName("aj.t")
    public int field765 = -1;

    @ObfuscatedName("aj.j")
    public int field762 = -1;

    @ObfuscatedName("aj.q")
    public int field767 = -1;

    @ObfuscatedName("aj.p")
    public int field768 = -1;

    @ObfuscatedName("aj.v")
    public int field771 = -1;

    @ObfuscatedName("aj.n")
    public short[] field770;

    @ObfuscatedName("aj.l")
    public short[] field759;

    @ObfuscatedName("aj.c")
    public short[] field772;

    @ObfuscatedName("aj.b")
    public short[] field758;

    @ObfuscatedName("aj.s")
    public String[] field777 = new String[5];

    @ObfuscatedName("aj.o")
    public boolean field785 = true;

    @ObfuscatedName("aj.h")
    public int field776 = -1;

    @ObfuscatedName("aj.x")
    public int field783 = 128;

    @ObfuscatedName("aj.e")
    public int field755 = 128;

    @ObfuscatedName("aj.z")
    public boolean field773 = false;

    @ObfuscatedName("aj.az")
    public int field780 = 0;

    @ObfuscatedName("aj.av")
    public int field781 = 0;

    @ObfuscatedName("aj.ay")
    public int field782 = -1;

    @ObfuscatedName("aj.ah")
    public int field761 = 32;

    @ObfuscatedName("aj.ao")
    public int[] field774;

    @ObfuscatedName("aj.aj")
    public int field784 = -1;

    @ObfuscatedName("aj.ad")
    public int field786 = -1;

    @ObfuscatedName("aj.ai")
    public boolean field760 = true;

    @ObfuscatedName("aj.af")
    public boolean field788 = true;

    @ObfuscatedName("aj.am")
    public boolean field766 = false;

    @ObfuscatedName("s.m(II)Laj;")
    public static class32 method504(int arg0) {
        class32 var1 = (class32) field756.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field787.method2725(9, arg0);
        class32 var3 = new class32();
        var3.field792 = arg0;
        if (var2 != null) {
            var3.method581(new class104(var2));
        }
        var3.method591();
        field756.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.k(I)V")
    public void method591() {
    }

    @ObfuscatedName("aj.y(Lcb;I)V")
    public void method581(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method582(arg0, var2);
        }
    }

    @ObfuscatedName("aj.g(Lcb;II)V")
    public void method582(class104 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2190();
            this.field763 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field763[var4] = arg0.method2132();
            }
        } else if (arg1 == 2) {
            this.field775 = arg0.method2138();
        } else if (arg1 == 12) {
            this.field789 = arg0.method2190();
        } else if (arg1 == 13) {
            this.field769 = arg0.method2132();
        } else if (arg1 == 14) {
            this.field762 = arg0.method2132();
        } else if (arg1 == 15) {
            this.field764 = arg0.method2132();
        } else if (arg1 == 16) {
            this.field765 = arg0.method2132();
        } else if (arg1 == 17) {
            this.field762 = arg0.method2132();
            this.field767 = arg0.method2132();
            this.field768 = arg0.method2132();
            this.field771 = arg0.method2132();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field777[arg1 - 30] = arg0.method2138();
            if (this.field777[arg1 - 30].equalsIgnoreCase(class139.field2124)) {
                this.field777[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2190();
            this.field770 = new short[var5];
            this.field759 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field770[var6] = (short) arg0.method2132();
                this.field759[var6] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2190();
            this.field772 = new short[var7];
            this.field758 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field772[var8] = (short) arg0.method2132();
                this.field758[var8] = (short) arg0.method2132();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2190();
            this.field779 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field779[var10] = arg0.method2132();
            }
        } else if (arg1 == 93) {
            this.field785 = false;
        } else if (arg1 == 95) {
            this.field776 = arg0.method2132();
        } else if (arg1 == 97) {
            this.field783 = arg0.method2132();
        } else if (arg1 == 98) {
            this.field755 = arg0.method2132();
        } else if (arg1 == 99) {
            this.field773 = true;
        } else if (arg1 == 100) {
            this.field780 = arg0.method2159();
        } else if (arg1 == 101) {
            this.field781 = arg0.method2159() * 5;
        } else if (arg1 == 102) {
            this.field782 = arg0.method2132();
        } else if (arg1 == 103) {
            this.field761 = arg0.method2132();
        } else if (arg1 == 106) {
            this.field784 = arg0.method2132();
            if (this.field784 == 65535) {
                this.field784 = -1;
            }
            this.field786 = arg0.method2132();
            if (this.field786 == 65535) {
                this.field786 = -1;
            }
            int var11 = arg0.method2190();
            this.field774 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field774[var12] = arg0.method2132();
                if (this.field774[var12] == 65535) {
                    this.field774[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field760 = false;
        } else if (arg1 == 109) {
            this.field788 = false;
        } else if (arg1 == 111) {
            this.field766 = true;
        }
    }

    @ObfuscatedName("aj.r(Laf;ILaf;II)Lcl;")
    public final class95 method583(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field774 != null) {
            class32 var5 = this.method579();
            return var5 == null ? null : var5.method583(arg0, arg1, arg2, arg3);
        }
        class95 var6 = (class95) field757.method3137((long) this.field792);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field763.length; var8++) {
                if (!Statics.field1421.method2754(this.field763[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class90[] var9 = new class90[this.field763.length];
            for (int var10 = 0; var10 < this.field763.length; var10++) {
                var9[var10] = class90.method1944(Statics.field1421, this.field763[var10], 0);
            }
            class90 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class90(var9, var9.length);
            }
            if (this.field770 != null) {
                for (int var12 = 0; var12 < this.field770.length; var12++) {
                    var11.method1957(this.field770[var12], this.field759[var12]);
                }
            }
            if (this.field772 != null) {
                for (int var13 = 0; var13 < this.field772.length; var13++) {
                    var11.method1910(this.field772[var13], this.field758[var13]);
                }
            }
            var6 = var11.method1872(this.field780 + 64, this.field781 + 850, -30, -50, -30);
            field757.method3130(var6, (long) this.field792);
        }
        class95 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method676(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method673(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1982(true);
        } else {
            var14 = arg2.method673(var6, arg3);
        }
        if (this.field783 != 128 || this.field755 != 128) {
            var14.method2046(this.field783, this.field755, this.field783);
        }
        return var14;
    }

    @ObfuscatedName("aj.i(I)Lck;")
    public final class90 method584() {
        if (this.field774 != null) {
            class32 var1 = this.method579();
            return var1 == null ? null : var1.method584();
        } else if (this.field779 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field779.length; var3++) {
                if (!Statics.field1421.method2754(this.field779[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class90[] var4 = new class90[this.field779.length];
            for (int var5 = 0; var5 < this.field779.length; var5++) {
                var4[var5] = class90.method1944(Statics.field1421, this.field779[var5], 0);
            }
            class90 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class90(var4, var4.length);
            }
            if (this.field770 != null) {
                for (int var7 = 0; var7 < this.field770.length; var7++) {
                    var6.method1957(this.field770[var7], this.field759[var7]);
                }
            }
            if (this.field772 != null) {
                for (int var8 = 0; var8 < this.field772.length; var8++) {
                    var6.method1910(this.field772[var8], this.field758[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.f(I)Laj;")
    public final class32 method579() {
        int var1 = -1;
        if (this.field784 != -1) {
            var1 = class150.method88(this.field784);
        } else if (this.field786 != -1) {
            var1 = class150.field2603[this.field786];
        }
        return var1 < 0 || var1 >= this.field774.length || this.field774[var1] == -1 ? null : method504(this.field774[var1]);
    }

    @ObfuscatedName("aj.a(I)Z")
    public boolean method605() {
        if (this.field774 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field784 != -1) {
            var1 = class150.method88(this.field784);
        } else if (this.field786 != -1) {
            var1 = class150.field2603[this.field786];
        }
        return var1 >= 0 && var1 < this.field774.length && this.field774[var1] != -1;
    }

    @ObfuscatedName("co.w(I)V")
    public static void method1959() {
        field756.method3134();
        field757.method3134();
    }
}
