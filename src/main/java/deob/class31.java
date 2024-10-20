package deob;

@ObfuscatedName("ag")
public class class31 extends class174 {

    @ObfuscatedName("ag.u")
    public static class170 field759 = new class170(64);

    @ObfuscatedName("ag.t")
    public static class170 field757 = new class170(50);

    @ObfuscatedName("ag.k")
    public int field761;

    @ObfuscatedName("ag.x")
    public String field770 = "null";

    @ObfuscatedName("ag.v")
    public int field792 = 1;

    @ObfuscatedName("ag.g")
    public int[] field764;

    @ObfuscatedName("ag.n")
    public int[] field778;

    @ObfuscatedName("ag.q")
    public int field766 = -1;

    @ObfuscatedName("ag.i")
    public int field762 = -1;

    @ObfuscatedName("ag.p")
    public int field768 = -1;

    @ObfuscatedName("ag.e")
    public int field773 = -1;

    @ObfuscatedName("ag.o")
    public int field769 = -1;

    @ObfuscatedName("ag.j")
    public int field771 = -1;

    @ObfuscatedName("ag.s")
    public int field772 = -1;

    @ObfuscatedName("ag.b")
    public short[] field767;

    @ObfuscatedName("ag.c")
    public short[] field774;

    @ObfuscatedName("ag.m")
    public short[] field786;

    @ObfuscatedName("ag.z")
    public short[] field776;

    @ObfuscatedName("ag.h")
    public String[] field777 = new String[5];

    @ObfuscatedName("ag.f")
    public boolean field782 = true;

    @ObfuscatedName("ag.w")
    public int field779 = -1;

    @ObfuscatedName("ag.l")
    public int field780 = 128;

    @ObfuscatedName("ag.d")
    public int field781 = 128;

    @ObfuscatedName("ag.y")
    public boolean field765 = false;

    @ObfuscatedName("ag.ah")
    public int field783 = 0;

    @ObfuscatedName("ag.ad")
    public int field784 = 0;

    @ObfuscatedName("ag.au")
    public int field785 = -1;

    @ObfuscatedName("ag.as")
    public int field763 = 32;

    @ObfuscatedName("ag.ag")
    public int[] field787;

    @ObfuscatedName("ag.ab")
    public int field788 = -1;

    @ObfuscatedName("ag.aq")
    public int field789 = -1;

    @ObfuscatedName("ag.af")
    public boolean field790 = true;

    @ObfuscatedName("ag.ay")
    public boolean field791 = true;

    @ObfuscatedName("cz.a(IB)Lag;")
    public static class31 method1792(int arg0) {
        class31 var1 = (class31) field759.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field775.method2943(9, arg0);
        class31 var3 = new class31();
        var3.field761 = arg0;
        if (var2 != null) {
            var3.method553(new class126(var2));
        }
        var3.method552();
        field759.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.r(B)V")
    public void method552() {
    }

    @ObfuscatedName("ag.u(Ldf;B)V")
    public void method553(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method554(arg0, var2);
        }
    }

    @ObfuscatedName("ag.t(Ldf;IS)V")
    public void method554(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2481();
            this.field764 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field764[var4] = arg0.method2373();
            }
        } else if (arg1 == 2) {
            this.field770 = arg0.method2386();
        } else if (arg1 == 12) {
            this.field792 = arg0.method2481();
        } else if (arg1 == 13) {
            this.field766 = arg0.method2373();
        } else if (arg1 == 14) {
            this.field773 = arg0.method2373();
        } else if (arg1 == 15) {
            this.field762 = arg0.method2373();
        } else if (arg1 == 16) {
            this.field768 = arg0.method2373();
        } else if (arg1 == 17) {
            this.field773 = arg0.method2373();
            this.field769 = arg0.method2373();
            this.field771 = arg0.method2373();
            this.field772 = arg0.method2373();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field777[arg1 - 30] = arg0.method2386();
            if (this.field777[arg1 - 30].equalsIgnoreCase(class134.field2234)) {
                this.field777[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2481();
            this.field767 = new short[var5];
            this.field774 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field767[var6] = (short) arg0.method2373();
                this.field774[var6] = (short) arg0.method2373();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2481();
            this.field786 = new short[var7];
            this.field776 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field786[var8] = (short) arg0.method2373();
                this.field776[var8] = (short) arg0.method2373();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2481();
            this.field778 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field778[var10] = arg0.method2373();
            }
        } else if (arg1 == 93) {
            this.field782 = false;
        } else if (arg1 == 95) {
            this.field779 = arg0.method2373();
        } else if (arg1 == 97) {
            this.field780 = arg0.method2373();
        } else if (arg1 == 98) {
            this.field781 = arg0.method2373();
        } else if (arg1 == 99) {
            this.field765 = true;
        } else if (arg1 == 100) {
            this.field783 = arg0.method2379();
        } else if (arg1 == 101) {
            this.field784 = arg0.method2379();
        } else if (arg1 == 102) {
            this.field785 = arg0.method2373();
        } else if (arg1 == 103) {
            this.field763 = arg0.method2373();
        } else if (arg1 == 106) {
            this.field788 = arg0.method2373();
            if (this.field788 == 65535) {
                this.field788 = -1;
            }
            this.field789 = arg0.method2373();
            if (this.field789 == 65535) {
                this.field789 = -1;
            }
            int var11 = arg0.method2481();
            this.field787 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field787[var12] = arg0.method2373();
                if (this.field787[var12] == 65535) {
                    this.field787[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field790 = false;
        } else if (arg1 == 109) {
            this.field791 = false;
        }
    }

    @ObfuscatedName("ag.k(Laf;ILaf;II)Ldw;")
    public final class112 method581(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field787 != null) {
            class31 var5 = this.method551();
            return var5 == null ? null : var5.method581(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field757.method3208((long) this.field761);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field764.length; var8++) {
                if (!Statics.field758.method2945(this.field764[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field764.length];
            for (int var10 = 0; var10 < this.field764.length; var10++) {
                var9[var10] = class101.method1993(Statics.field758, this.field764[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field767 != null) {
                for (int var12 = 0; var12 < this.field767.length; var12++) {
                    var11.method2006(this.field767[var12], this.field774[var12]);
                }
            }
            if (this.field786 != null) {
                for (int var13 = 0; var13 < this.field786.length; var13++) {
                    var11.method2007(this.field786[var13], this.field776[var13]);
                }
            }
            var6 = var11.method2014(this.field783 + 64, this.field784 * 5 + 850, -30, -50, -30);
            field757.method3210(var6, (long) this.field761);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method666(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method656(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2176(true);
        } else {
            var14 = arg2.method656(var6, arg3);
        }
        if (this.field780 != 128 || this.field781 != 128) {
            var14.method2228(this.field780, this.field781, this.field780);
        }
        return var14;
    }

    @ObfuscatedName("ag.x(I)Lck;")
    public final class101 method556() {
        if (this.field787 != null) {
            class31 var1 = this.method551();
            return var1 == null ? null : var1.method556();
        } else if (this.field778 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field778.length; var3++) {
                if (!Statics.field758.method2945(this.field778[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field778.length];
            for (int var5 = 0; var5 < this.field778.length; var5++) {
                var4[var5] = class101.method1993(Statics.field758, this.field778[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field767 != null) {
                for (int var7 = 0; var7 < this.field767.length; var7++) {
                    var6.method2006(this.field767[var7], this.field774[var7]);
                }
            }
            if (this.field786 != null) {
                for (int var8 = 0; var8 < this.field786.length; var8++) {
                    var6.method2007(this.field786[var8], this.field776[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.v(I)Lag;")
    public final class31 method551() {
        int var1 = -1;
        if (this.field788 != -1) {
            var1 = class159.method2281(this.field788);
        } else if (this.field789 != -1) {
            var1 = class159.field2700[this.field789];
        }
        return var1 < 0 || var1 >= this.field787.length || this.field787[var1] == -1 ? null : method1792(this.field787[var1]);
    }

    @ObfuscatedName("ag.g(I)Z")
    public boolean method558() {
        if (this.field787 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field788 != -1) {
            var1 = class159.method2281(this.field788);
        } else if (this.field789 != -1) {
            var1 = class159.field2700[this.field789];
        }
        return var1 >= 0 && var1 < this.field787.length && this.field787[var1] != -1;
    }

    @ObfuscatedName("bv.n(S)V")
    public static void method1514() {
        field759.method3216();
        field757.method3216();
    }
}
