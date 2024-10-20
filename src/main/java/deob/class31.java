package deob;

@ObfuscatedName("av")
public class class31 extends class174 {

    @ObfuscatedName("av.d")
    public static class170 field763 = new class170(64);

    @ObfuscatedName("av.k")
    public static class170 field790 = new class170(50);

    @ObfuscatedName("av.n")
    public int field765;

    @ObfuscatedName("av.s")
    public String field766 = "null";

    @ObfuscatedName("av.x")
    public int field767 = 1;

    @ObfuscatedName("av.b")
    public int[] field768;

    @ObfuscatedName("av.j")
    public int[] field769;

    @ObfuscatedName("av.p")
    public int field770 = -1;

    @ObfuscatedName("av.l")
    public int field771 = -1;

    @ObfuscatedName("av.i")
    public int field796 = -1;

    @ObfuscatedName("av.r")
    public int field779 = -1;

    @ObfuscatedName("av.o")
    public int field774 = -1;

    @ObfuscatedName("av.c")
    public int field775 = -1;

    @ObfuscatedName("av.f")
    public int field776 = -1;

    @ObfuscatedName("av.a")
    public short[] field777;

    @ObfuscatedName("av.t")
    public short[] field778;

    @ObfuscatedName("av.u")
    public short[] field764;

    @ObfuscatedName("av.z")
    public short[] field762;

    @ObfuscatedName("av.v")
    public String[] field781 = new String[5];

    @ObfuscatedName("av.w")
    public boolean field782 = true;

    @ObfuscatedName("av.h")
    public int field783 = -1;

    @ObfuscatedName("av.q")
    public int field786 = 128;

    @ObfuscatedName("av.g")
    public int field792 = 128;

    @ObfuscatedName("av.e")
    public boolean field784 = false;

    @ObfuscatedName("av.as")
    public int field780 = 0;

    @ObfuscatedName("av.an")
    public int field785 = 0;

    @ObfuscatedName("av.aj")
    public int field789 = -1;

    @ObfuscatedName("av.ax")
    public int field772 = 32;

    @ObfuscatedName("av.av")
    public int[] field791;

    @ObfuscatedName("av.ae")
    public int field788 = -1;

    @ObfuscatedName("av.am")
    public int field793 = -1;

    @ObfuscatedName("av.aq")
    public boolean field773 = true;

    @ObfuscatedName("av.at")
    public boolean field795 = true;

    @ObfuscatedName("q.y(II)Lav;")
    public static class31 method208(int arg0) {
        class31 var1 = (class31) field763.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field794.method2991(9, arg0);
        class31 var3 = new class31();
        var3.field765 = arg0;
        if (var2 != null) {
            var3.method618(new class127(var2));
        }
        var3.method624();
        field763.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.m(B)V")
    public void method624() {
    }

    @ObfuscatedName("av.d(Ldp;I)V")
    public void method618(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method629(arg0, var2);
        }
    }

    @ObfuscatedName("av.k(Ldp;II)V")
    public void method629(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2534();
            this.field768 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field768[var4] = arg0.method2460();
            }
        } else if (arg1 == 2) {
            this.field766 = arg0.method2466();
        } else if (arg1 == 12) {
            this.field767 = arg0.method2534();
        } else if (arg1 == 13) {
            this.field770 = arg0.method2460();
        } else if (arg1 == 14) {
            this.field779 = arg0.method2460();
        } else if (arg1 == 15) {
            this.field771 = arg0.method2460();
        } else if (arg1 == 16) {
            this.field796 = arg0.method2460();
        } else if (arg1 == 17) {
            this.field779 = arg0.method2460();
            this.field774 = arg0.method2460();
            this.field775 = arg0.method2460();
            this.field776 = arg0.method2460();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field781[arg1 - 30] = arg0.method2466();
            if (this.field781[arg1 - 30].equalsIgnoreCase(class134.field2083)) {
                this.field781[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2534();
            this.field777 = new short[var5];
            this.field778 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field777[var6] = (short) arg0.method2460();
                this.field778[var6] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2534();
            this.field764 = new short[var7];
            this.field762 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field764[var8] = (short) arg0.method2460();
                this.field762[var8] = (short) arg0.method2460();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2534();
            this.field769 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field769[var10] = arg0.method2460();
            }
        } else if (arg1 == 93) {
            this.field782 = false;
        } else if (arg1 == 95) {
            this.field783 = arg0.method2460();
        } else if (arg1 == 97) {
            this.field786 = arg0.method2460();
        } else if (arg1 == 98) {
            this.field792 = arg0.method2460();
        } else if (arg1 == 99) {
            this.field784 = true;
        } else if (arg1 == 100) {
            this.field780 = arg0.method2459();
        } else if (arg1 == 101) {
            this.field785 = arg0.method2459();
        } else if (arg1 == 102) {
            this.field789 = arg0.method2460();
        } else if (arg1 == 103) {
            this.field772 = arg0.method2460();
        } else if (arg1 == 106) {
            this.field788 = arg0.method2460();
            if (this.field788 == 65535) {
                this.field788 = -1;
            }
            this.field793 = arg0.method2460();
            if (this.field793 == 65535) {
                this.field793 = -1;
            }
            int var11 = arg0.method2534();
            this.field791 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field791[var12] = arg0.method2460();
                if (this.field791[var12] == 65535) {
                    this.field791[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field773 = false;
        } else if (arg1 == 109) {
            this.field795 = false;
        }
    }

    @ObfuscatedName("av.n(Laq;ILaq;II)Ldw;")
    public final class112 method603(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field791 != null) {
            class31 var5 = this.method612();
            return var5 == null ? null : var5.method603(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field790.method3288((long) this.field765);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field768.length; var8++) {
                if (!Statics.field761.method2993(this.field768[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field768.length];
            for (int var10 = 0; var10 < this.field768.length; var10++) {
                var9[var10] = class101.method2060(Statics.field761, this.field768[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field777 != null) {
                for (int var12 = 0; var12 < this.field777.length; var12++) {
                    var11.method2108(this.field777[var12], this.field778[var12]);
                }
            }
            if (this.field764 != null) {
                for (int var13 = 0; var13 < this.field764.length; var13++) {
                    var11.method2073(this.field764[var13], this.field762[var13]);
                }
            }
            var6 = var11.method2081(this.field780 + 64, this.field785 * 5 + 850, -30, -50, -30);
            field790.method3291(var6, (long) this.field765);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method715(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method710(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2266(true);
        } else {
            var14 = arg2.method710(var6, arg3);
        }
        if (this.field786 != 128 || this.field792 != 128) {
            var14.method2265(this.field786, this.field792, this.field786);
        }
        return var14;
    }

    @ObfuscatedName("av.s(I)Lcq;")
    public final class101 method605() {
        if (this.field791 != null) {
            class31 var1 = this.method612();
            return var1 == null ? null : var1.method605();
        } else if (this.field769 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field769.length; var3++) {
                if (!Statics.field761.method2993(this.field769[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field769.length];
            for (int var5 = 0; var5 < this.field769.length; var5++) {
                var4[var5] = class101.method2060(Statics.field761, this.field769[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field777 != null) {
                for (int var7 = 0; var7 < this.field777.length; var7++) {
                    var6.method2108(this.field777[var7], this.field778[var7]);
                }
            }
            if (this.field764 != null) {
                for (int var8 = 0; var8 < this.field764.length; var8++) {
                    var6.method2073(this.field764[var8], this.field762[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("av.x(I)Lav;")
    public final class31 method612() {
        int var1 = -1;
        if (this.field788 != -1) {
            var1 = class159.method2974(this.field788);
        } else if (this.field793 != -1) {
            var1 = class159.field2705[this.field793];
        }
        return var1 < 0 || var1 >= this.field791.length || this.field791[var1] == -1 ? null : method208(this.field791[var1]);
    }

    @ObfuscatedName("av.b(I)Z")
    public boolean method606() {
        if (this.field791 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field788 != -1) {
            var1 = class159.method2974(this.field788);
        } else if (this.field793 != -1) {
            var1 = class159.field2705[this.field793];
        }
        return var1 >= 0 && var1 < this.field791.length && this.field791[var1] != -1;
    }

    @ObfuscatedName("en.j(I)V")
    public static void method2912() {
        field763.method3297();
        field790.method3297();
    }
}
