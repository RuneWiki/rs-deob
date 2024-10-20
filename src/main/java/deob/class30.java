package deob;

@ObfuscatedName("aw")
public class class30 extends class172 {

    @ObfuscatedName("aw.x")
    public static class168 field756 = new class168(64);

    @ObfuscatedName("aw.z")
    public static class168 field780 = new class168(50);

    @ObfuscatedName("aw.c")
    public int field783;

    @ObfuscatedName("aw.e")
    public String field759 = "null";

    @ObfuscatedName("aw.s")
    public int field760 = 1;

    @ObfuscatedName("aw.i")
    public int[] field761;

    @ObfuscatedName("aw.g")
    public int[] field762;

    @ObfuscatedName("aw.q")
    public int field763 = -1;

    @ObfuscatedName("aw.w")
    public int field764 = -1;

    @ObfuscatedName("aw.k")
    public int field765 = -1;

    @ObfuscatedName("aw.v")
    public int field766 = -1;

    @ObfuscatedName("aw.o")
    public int field767 = -1;

    @ObfuscatedName("aw.m")
    public int field768 = -1;

    @ObfuscatedName("aw.u")
    public int field769 = -1;

    @ObfuscatedName("aw.r")
    public short[] field770;

    @ObfuscatedName("aw.d")
    public short[] field754;

    @ObfuscatedName("aw.n")
    public short[] field772;

    @ObfuscatedName("aw.b")
    public short[] field778;

    @ObfuscatedName("aw.p")
    public String[] field777 = new String[5];

    @ObfuscatedName("aw.t")
    public boolean field775 = true;

    @ObfuscatedName("aw.l")
    public int field776 = -1;

    @ObfuscatedName("aw.a")
    public int field785 = 128;

    @ObfuscatedName("aw.f")
    public int field773 = 128;

    @ObfuscatedName("aw.h")
    public boolean field779 = false;

    @ObfuscatedName("aw.az")
    public int field789 = 0;

    @ObfuscatedName("aw.ao")
    public int field781 = 0;

    @ObfuscatedName("aw.au")
    public int field782 = -1;

    @ObfuscatedName("aw.aw")
    public int field771 = 32;

    @ObfuscatedName("aw.ad")
    public int[] field784;

    @ObfuscatedName("aw.av")
    public int field774 = -1;

    @ObfuscatedName("aw.am")
    public int field786 = -1;

    @ObfuscatedName("aw.an")
    public boolean field787 = true;

    @ObfuscatedName("aw.ac")
    public boolean field788 = true;

    @ObfuscatedName("w.y(II)Law;")
    public static class30 method117(int arg0) {
        class30 var1 = (class30) field756.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field758.method2903(9, arg0);
        class30 var3 = new class30();
        var3.field783 = arg0;
        if (var2 != null) {
            var3.method618(new class126(var2));
        }
        var3.method595();
        field756.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.x(I)V")
    public void method595() {
    }

    @ObfuscatedName("aw.z(Ldr;B)V")
    public void method618(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method597(arg0, var2);
        }
    }

    @ObfuscatedName("aw.c(Ldr;II)V")
    public void method597(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2399();
            this.field761 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field761[var4] = arg0.method2405();
            }
        } else if (arg1 == 2) {
            this.field759 = arg0.method2390();
        } else if (arg1 == 12) {
            this.field760 = arg0.method2399();
        } else if (arg1 == 13) {
            this.field763 = arg0.method2405();
        } else if (arg1 == 14) {
            this.field766 = arg0.method2405();
        } else if (arg1 == 15) {
            this.field764 = arg0.method2405();
        } else if (arg1 == 16) {
            this.field765 = arg0.method2405();
        } else if (arg1 == 17) {
            this.field766 = arg0.method2405();
            this.field767 = arg0.method2405();
            this.field768 = arg0.method2405();
            this.field769 = arg0.method2405();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field777[arg1 - 30] = arg0.method2390();
            if (this.field777[arg1 - 30].equalsIgnoreCase(class133.field2229)) {
                this.field777[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2399();
            this.field770 = new short[var5];
            this.field754 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field770[var6] = (short) arg0.method2405();
                this.field754[var6] = (short) arg0.method2405();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2399();
            this.field772 = new short[var7];
            this.field778 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field772[var8] = (short) arg0.method2405();
                this.field778[var8] = (short) arg0.method2405();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2399();
            this.field762 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field762[var10] = arg0.method2405();
            }
        } else if (arg1 == 93) {
            this.field775 = false;
        } else if (arg1 == 95) {
            this.field776 = arg0.method2405();
        } else if (arg1 == 97) {
            this.field785 = arg0.method2405();
        } else if (arg1 == 98) {
            this.field773 = arg0.method2405();
        } else if (arg1 == 99) {
            this.field779 = true;
        } else if (arg1 == 100) {
            this.field789 = arg0.method2383();
        } else if (arg1 == 101) {
            this.field781 = arg0.method2383();
        } else if (arg1 == 102) {
            this.field782 = arg0.method2405();
        } else if (arg1 == 103) {
            this.field771 = arg0.method2405();
        } else if (arg1 == 106) {
            this.field774 = arg0.method2405();
            if (this.field774 == 65535) {
                this.field774 = -1;
            }
            this.field786 = arg0.method2405();
            if (this.field786 == 65535) {
                this.field786 = -1;
            }
            int var11 = arg0.method2399();
            this.field784 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field784[var12] = arg0.method2405();
                if (this.field784[var12] == 65535) {
                    this.field784[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field787 = false;
        } else if (arg1 == 109) {
            this.field788 = false;
        }
    }

    @ObfuscatedName("aw.e(Lam;ILam;IB)Ldh;")
    public final class111 method598(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field784 != null) {
            class30 var5 = this.method596();
            return var5 == null ? null : var5.method598(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field780.method3191((long) this.field783);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field761.length; var8++) {
                if (!Statics.field755.method2965(this.field761[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field761.length];
            for (int var10 = 0; var10 < this.field761.length; var10++) {
                var9[var10] = class100.method2001(Statics.field755, this.field761[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field770 != null) {
                for (int var12 = 0; var12 < this.field770.length; var12++) {
                    var11.method2013(this.field770[var12], this.field754[var12]);
                }
            }
            if (this.field772 != null) {
                for (int var13 = 0; var13 < this.field772.length; var13++) {
                    var11.method2000(this.field772[var13], this.field778[var13]);
                }
            }
            var6 = var11.method2057(this.field789 + 64, this.field781 * 5 + 850, -30, -50, -30);
            field780.method3181(var6, (long) this.field783);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method707(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method686(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2189(true);
        } else {
            var14 = arg2.method686(var6, arg3);
        }
        if (this.field785 != 128 || this.field773 != 128) {
            var14.method2181(this.field785, this.field773, this.field785);
        }
        return var14;
    }

    @ObfuscatedName("aw.s(B)Lck;")
    public final class100 method600() {
        if (this.field784 != null) {
            class30 var1 = this.method596();
            return var1 == null ? null : var1.method600();
        } else if (this.field762 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field762.length; var3++) {
                if (!Statics.field755.method2965(this.field762[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field762.length];
            for (int var5 = 0; var5 < this.field762.length; var5++) {
                var4[var5] = class100.method2001(Statics.field755, this.field762[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field770 != null) {
                for (int var7 = 0; var7 < this.field770.length; var7++) {
                    var6.method2013(this.field770[var7], this.field754[var7]);
                }
            }
            if (this.field772 != null) {
                for (int var8 = 0; var8 < this.field772.length; var8++) {
                    var6.method2000(this.field772[var8], this.field778[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aw.i(I)Law;")
    public final class30 method596() {
        int var1 = -1;
        if (this.field774 != -1) {
            var1 = class157.method1999(this.field774);
        } else if (this.field786 != -1) {
            var1 = class157.field2647[this.field786];
        }
        return var1 < 0 || var1 >= this.field784.length || this.field784[var1] == -1 ? null : method117(this.field784[var1]);
    }

    @ObfuscatedName("aw.g(B)Z")
    public boolean method594() {
        if (this.field784 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field774 != -1) {
            var1 = class157.method1999(this.field774);
        } else if (this.field786 != -1) {
            var1 = class157.field2647[this.field786];
        }
        return var1 >= 0 && var1 < this.field784.length && this.field784[var1] != -1;
    }
}
