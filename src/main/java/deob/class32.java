package deob;

@ObfuscatedName("as")
public class class32 extends class174 {

    @ObfuscatedName("as.u")
    public static class167 field788 = new class167(64);

    @ObfuscatedName("as.t")
    public static class167 field775 = new class167(50);

    @ObfuscatedName("as.e")
    public int field776;

    @ObfuscatedName("as.a")
    public String field777 = "null";

    @ObfuscatedName("as.l")
    public int field778 = 1;

    @ObfuscatedName("as.v")
    public int[] field779;

    @ObfuscatedName("as.j")
    public int[] field780;

    @ObfuscatedName("as.k")
    public int field781 = -1;

    @ObfuscatedName("as.g")
    public int field774 = -1;

    @ObfuscatedName("as.d")
    public int field783 = -1;

    @ObfuscatedName("as.b")
    public int field801 = -1;

    @ObfuscatedName("as.i")
    public int field785 = -1;

    @ObfuscatedName("as.o")
    public int field786 = -1;

    @ObfuscatedName("as.x")
    public int field789 = -1;

    @ObfuscatedName("as.m")
    public short[] field797;

    @ObfuscatedName("as.f")
    public short[] field804;

    @ObfuscatedName("as.q")
    public short[] field806;

    @ObfuscatedName("as.c")
    public short[] field805;

    @ObfuscatedName("as.h")
    public String[] field792 = new String[5];

    @ObfuscatedName("as.y")
    public boolean field793 = true;

    @ObfuscatedName("as.r")
    public int field796 = -1;

    @ObfuscatedName("as.w")
    public int field795 = 128;

    @ObfuscatedName("as.p")
    public int field773 = 128;

    @ObfuscatedName("as.s")
    public boolean field790 = false;

    @ObfuscatedName("as.ag")
    public int field798 = 0;

    @ObfuscatedName("as.ad")
    public int field799 = 0;

    @ObfuscatedName("as.ak")
    public int field800 = -1;

    @ObfuscatedName("as.ai")
    public int field808 = 32;

    @ObfuscatedName("as.ac")
    public int[] field802;

    @ObfuscatedName("as.as")
    public int field803 = -1;

    @ObfuscatedName("as.ar")
    public int field807 = -1;

    @ObfuscatedName("as.an")
    public boolean field782 = true;

    @ObfuscatedName("as.ah")
    public boolean field794 = true;

    @ObfuscatedName("as.ax")
    public boolean field784 = false;

    @ObfuscatedName("e.z(Lel;Lel;I)V")
    public static void method38(class142 arg0, class142 arg1) {
        Statics.field791 = arg0;
        Statics.field810 = arg1;
    }

    @ObfuscatedName("as.u(I)V")
    public void method611() {
    }

    @ObfuscatedName("as.t(Lcj;I)V")
    public void method641(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method617(arg0, var2);
        }
    }

    @ObfuscatedName("as.e(Lcj;II)V")
    public void method617(class104 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2257();
            this.field779 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field779[var4] = arg0.method2206();
            }
        } else if (arg1 == 2) {
            this.field777 = arg0.method2187();
        } else if (arg1 == 12) {
            this.field778 = arg0.method2257();
        } else if (arg1 == 13) {
            this.field781 = arg0.method2206();
        } else if (arg1 == 14) {
            this.field801 = arg0.method2206();
        } else if (arg1 == 15) {
            this.field774 = arg0.method2206();
        } else if (arg1 == 16) {
            this.field783 = arg0.method2206();
        } else if (arg1 == 17) {
            this.field801 = arg0.method2206();
            this.field785 = arg0.method2206();
            this.field786 = arg0.method2206();
            this.field789 = arg0.method2206();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field792[arg1 - 30] = arg0.method2187();
            if (this.field792[arg1 - 30].equalsIgnoreCase(class139.field2248)) {
                this.field792[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2257();
            this.field797 = new short[var5];
            this.field804 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field797[var6] = (short) arg0.method2206();
                this.field804[var6] = (short) arg0.method2206();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2257();
            this.field806 = new short[var7];
            this.field805 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field806[var8] = (short) arg0.method2206();
                this.field805[var8] = (short) arg0.method2206();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2257();
            this.field780 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field780[var10] = arg0.method2206();
            }
        } else if (arg1 == 93) {
            this.field793 = false;
        } else if (arg1 == 95) {
            this.field796 = arg0.method2206();
        } else if (arg1 == 97) {
            this.field795 = arg0.method2206();
        } else if (arg1 == 98) {
            this.field773 = arg0.method2206();
        } else if (arg1 == 99) {
            this.field790 = true;
        } else if (arg1 == 100) {
            this.field798 = arg0.method2237();
        } else if (arg1 == 101) {
            this.field799 = arg0.method2237() * 5;
        } else if (arg1 == 102) {
            this.field800 = arg0.method2206();
        } else if (arg1 == 103) {
            this.field808 = arg0.method2206();
        } else if (arg1 == 106) {
            this.field803 = arg0.method2206();
            if (this.field803 == 65535) {
                this.field803 = -1;
            }
            this.field807 = arg0.method2206();
            if (this.field807 == 65535) {
                this.field807 = -1;
            }
            int var11 = arg0.method2257();
            this.field802 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field802[var12] = arg0.method2206();
                if (this.field802[var12] == 65535) {
                    this.field802[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field782 = false;
        } else if (arg1 == 109) {
            this.field794 = false;
        } else if (arg1 == 111) {
            this.field784 = true;
        }
    }

    @ObfuscatedName("as.a(Lah;ILah;II)Lcp;")
    public final class95 method614(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field802 != null) {
            class32 var5 = this.method616();
            return var5 == null ? null : var5.method614(arg0, arg1, arg2, arg3);
        }
        class95 var6 = (class95) field775.method3183((long) this.field776);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field779.length; var8++) {
                if (!Statics.field810.method2747(this.field779[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class90[] var9 = new class90[this.field779.length];
            for (int var10 = 0; var10 < this.field779.length; var10++) {
                var9[var10] = class90.method1964(Statics.field810, this.field779[var10], 0);
            }
            class90 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class90(var9, var9.length);
            }
            if (this.field797 != null) {
                for (int var12 = 0; var12 < this.field797.length; var12++) {
                    var11.method1909(this.field797[var12], this.field804[var12]);
                }
            }
            if (this.field806 != null) {
                for (int var13 = 0; var13 < this.field806.length; var13++) {
                    var11.method1898(this.field806[var13], this.field805[var13]);
                }
            }
            var6 = var11.method1975(this.field798 + 64, this.field799 + 850, -30, -50, -30);
            field775.method3185(var6, (long) this.field776);
        }
        class95 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method726(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method731(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2000(true);
        } else {
            var14 = arg2.method731(var6, arg3);
        }
        if (this.field795 != 128 || this.field773 != 128) {
            var14.method2020(this.field795, this.field773, this.field795);
        }
        return var14;
    }

    @ObfuscatedName("as.l(I)Lcv;")
    public final class90 method615() {
        if (this.field802 != null) {
            class32 var1 = this.method616();
            return var1 == null ? null : var1.method615();
        } else if (this.field780 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field780.length; var3++) {
                if (!Statics.field810.method2747(this.field780[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class90[] var4 = new class90[this.field780.length];
            for (int var5 = 0; var5 < this.field780.length; var5++) {
                var4[var5] = class90.method1964(Statics.field810, this.field780[var5], 0);
            }
            class90 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class90(var4, var4.length);
            }
            if (this.field797 != null) {
                for (int var7 = 0; var7 < this.field797.length; var7++) {
                    var6.method1909(this.field797[var7], this.field804[var7]);
                }
            }
            if (this.field806 != null) {
                for (int var8 = 0; var8 < this.field806.length; var8++) {
                    var6.method1898(this.field806[var8], this.field805[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("as.v(I)Las;")
    public final class32 method616() {
        int var1 = -1;
        if (this.field803 != -1) {
            var1 = class150.method117(this.field803);
        } else if (this.field807 != -1) {
            var1 = class150.field2625[this.field807];
        }
        return var1 < 0 || var1 >= this.field802.length || this.field802[var1] == -1 ? null : Statics.method15(this.field802[var1]);
    }

    @ObfuscatedName("as.j(I)Z")
    public boolean method624() {
        if (this.field802 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field803 != -1) {
            var1 = class150.method117(this.field803);
        } else if (this.field807 != -1) {
            var1 = class150.field2625[this.field807];
        }
        return var1 >= 0 && var1 < this.field802.length && this.field802[var1] != -1;
    }

    @ObfuscatedName("y.k(I)V")
    public static void method539() {
        field788.method3193();
        field775.method3193();
    }
}
