package deob;

@ObfuscatedName("am")
public class class32 extends class174 {

    @ObfuscatedName("am.x")
    public static boolean field788 = false;

    @ObfuscatedName("am.a")
    public static class170 field783 = new class170(64);

    @ObfuscatedName("am.q")
    public static class170 field784 = new class170(500);

    @ObfuscatedName("am.j")
    public static class170 field832 = new class170(30);

    @ObfuscatedName("am.v")
    public static class170 field786 = new class170(30);

    @ObfuscatedName("am.w")
    public static class101[] field787 = new class101[4];

    @ObfuscatedName("am.l")
    public int field797;

    @ObfuscatedName("am.s")
    public int[] field795;

    @ObfuscatedName("am.n")
    public int[] field790;

    @ObfuscatedName("am.c")
    public String field791 = "null";

    @ObfuscatedName("am.h")
    public short[] field792;

    @ObfuscatedName("am.u")
    public short[] field793;

    @ObfuscatedName("am.y")
    public short[] field794;

    @ObfuscatedName("am.b")
    public short[] field836;

    @ObfuscatedName("am.t")
    public int field796 = 1;

    @ObfuscatedName("am.r")
    public int field807 = 1;

    @ObfuscatedName("am.g")
    public int field798 = 2;

    @ObfuscatedName("am.m")
    public boolean field799 = true;

    @ObfuscatedName("am.o")
    public int field800 = -1;

    @ObfuscatedName("am.e")
    public int field801 = -1;

    @ObfuscatedName("am.f")
    public boolean field802 = false;

    @ObfuscatedName("am.i")
    public boolean field785 = false;

    @ObfuscatedName("am.d")
    public int field804 = -1;

    @ObfuscatedName("am.z")
    public int field782 = 16;

    @ObfuscatedName("am.ai")
    public int field818 = 0;

    @ObfuscatedName("am.ag")
    public int field827 = 0;

    @ObfuscatedName("am.as")
    public String[] field808 = new String[5];

    @ObfuscatedName("am.al")
    public int field809 = -1;

    @ObfuscatedName("am.aj")
    public int field810 = -1;

    @ObfuscatedName("am.am")
    public boolean field811 = false;

    @ObfuscatedName("am.ab")
    public boolean field812 = true;

    @ObfuscatedName("am.ao")
    public int field813 = 128;

    @ObfuscatedName("am.ac")
    public int field814 = 128;

    @ObfuscatedName("am.ap")
    public int field817 = 128;

    @ObfuscatedName("am.at")
    public int field816 = 0;

    @ObfuscatedName("am.az")
    public int field826 = 0;

    @ObfuscatedName("am.ae")
    public int field789 = 0;

    @ObfuscatedName("am.ad")
    public int field834 = 0;

    @ObfuscatedName("am.aw")
    public boolean field820 = false;

    @ObfuscatedName("am.an")
    public boolean field819 = false;

    @ObfuscatedName("am.aq")
    public int field805 = -1;

    @ObfuscatedName("am.ax")
    public int[] field823;

    @ObfuscatedName("am.af")
    public int field824 = -1;

    @ObfuscatedName("am.ar")
    public int field825 = -1;

    @ObfuscatedName("am.ay")
    public int field822 = -1;

    @ObfuscatedName("am.au")
    public int field833 = 0;

    @ObfuscatedName("am.ak")
    public int field828 = 0;

    @ObfuscatedName("am.aa")
    public int field829 = 0;

    @ObfuscatedName("am.av")
    public int[] field830;

    @ObfuscatedName("ah.x(IB)Lam;")
    public static class32 method1131(int arg0) {
        class32 var1 = (class32) field783.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2697.method2920(6, arg0);
        class32 var3 = new class32();
        var3.field797 = arg0;
        if (var2 != null) {
            var3.method617(new class127(var2));
        }
        var3.method616();
        if (var3.field819) {
            var3.field798 = 0;
            var3.field799 = false;
        }
        field783.method3197(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.p(I)V")
    public void method616() {
        if (this.field800 == -1) {
            this.field800 = 0;
            if (this.field795 != null && (this.field790 == null || this.field790[0] == 10)) {
                this.field800 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field808[var1] != null) {
                    this.field800 = 1;
                }
            }
        }
        if (this.field805 == -1) {
            this.field805 = this.field798 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.k(Ldg;B)V")
    public void method617(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method630(arg0, var2);
        }
    }

    @ObfuscatedName("am.a(Ldg;IB)V")
    public void method630(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2484();
            if (var3 > 0) {
                if (this.field795 == null || field788) {
                    this.field790 = new int[var3];
                    this.field795 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field795[var4] = arg0.method2539();
                        this.field790[var4] = arg0.method2484();
                    }
                } else {
                    arg0.field2008 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field791 = arg0.method2571();
        } else if (arg1 == 5) {
            int var5 = arg0.method2484();
            if (var5 > 0) {
                if (this.field795 == null || field788) {
                    this.field790 = null;
                    this.field795 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field795[var6] = arg0.method2539();
                    }
                } else {
                    arg0.field2008 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field796 = arg0.method2484();
        } else if (arg1 == 15) {
            this.field807 = arg0.method2484();
        } else if (arg1 == 17) {
            this.field798 = 0;
            this.field799 = false;
        } else if (arg1 == 18) {
            this.field799 = false;
        } else if (arg1 == 19) {
            this.field800 = arg0.method2484();
        } else if (arg1 == 21) {
            this.field801 = 0;
        } else if (arg1 == 22) {
            this.field802 = true;
        } else if (arg1 == 23) {
            this.field785 = true;
        } else if (arg1 == 24) {
            this.field804 = arg0.method2539();
            if (this.field804 == 65535) {
                this.field804 = -1;
            }
        } else if (arg1 == 27) {
            this.field798 = 1;
        } else if (arg1 == 28) {
            this.field782 = arg0.method2484();
        } else if (arg1 == 29) {
            this.field818 = arg0.method2411();
        } else if (arg1 == 39) {
            this.field827 = arg0.method2411();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field808[arg1 - 30] = arg0.method2571();
            if (this.field808[arg1 - 30].equalsIgnoreCase(class134.field2057)) {
                this.field808[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2484();
            this.field792 = new short[var7];
            this.field793 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field792[var8] = (short) arg0.method2539();
                this.field793[var8] = (short) arg0.method2539();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2484();
            this.field794 = new short[var9];
            this.field836 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field794[var10] = (short) arg0.method2539();
                this.field836[var10] = (short) arg0.method2539();
            }
        } else if (arg1 == 60) {
            this.field809 = arg0.method2539();
        } else if (arg1 == 62) {
            this.field811 = true;
        } else if (arg1 == 64) {
            this.field812 = false;
        } else if (arg1 == 65) {
            this.field813 = arg0.method2539();
        } else if (arg1 == 66) {
            this.field814 = arg0.method2539();
        } else if (arg1 == 67) {
            this.field817 = arg0.method2539();
        } else if (arg1 == 68) {
            this.field810 = arg0.method2539();
        } else if (arg1 == 69) {
            this.field834 = arg0.method2484();
        } else if (arg1 == 70) {
            this.field816 = arg0.method2517();
        } else if (arg1 == 71) {
            this.field826 = arg0.method2517();
        } else if (arg1 == 72) {
            this.field789 = arg0.method2517();
        } else if (arg1 == 73) {
            this.field820 = true;
        } else if (arg1 == 74) {
            this.field819 = true;
        } else if (arg1 == 75) {
            this.field805 = arg0.method2484();
        } else if (arg1 == 77) {
            this.field824 = arg0.method2539();
            if (this.field824 == 65535) {
                this.field824 = -1;
            }
            this.field825 = arg0.method2539();
            if (this.field825 == 65535) {
                this.field825 = -1;
            }
            int var11 = arg0.method2484();
            this.field823 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field823[var12] = arg0.method2539();
                if (this.field823[var12] == 65535) {
                    this.field823[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field822 = arg0.method2539();
            this.field833 = arg0.method2484();
        } else if (arg1 == 79) {
            this.field828 = arg0.method2539();
            this.field829 = arg0.method2539();
            this.field833 = arg0.method2484();
            int var13 = arg0.method2484();
            this.field830 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field830[var14] = arg0.method2539();
            }
        } else if (arg1 == 81) {
            this.field801 = arg0.method2484() * 256;
        }
    }

    @ObfuscatedName("am.q(II)Z")
    public final boolean method619(int arg0) {
        if (this.field790 != null) {
            for (int var4 = 0; var4 < this.field790.length; var4++) {
                if (this.field790[var4] == arg0) {
                    return Statics.field1997.method2983(this.field795[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field795 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field795.length; var3++) {
                var2 &= Statics.field1997.method2983(this.field795[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.j(S)Z")
    public final boolean method620() {
        if (this.field795 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field795.length; var2++) {
            var1 &= Statics.field1997.method2983(this.field795[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.v(II[[IIIII)Lct;")
    public final class94 method625(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field790 == null) {
            var7 = (long) ((this.field797 << 10) + arg1);
        } else {
            var7 = (long) ((this.field797 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field832.method3196(var7);
        if (var9 == null) {
            class101 var10 = this.method626(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field802) {
                var10.field1690 = (short) (this.field818 + 64);
                var10.field1688 = (short) (this.field827 * 25 + 768);
                var10.method2020();
                var9 = var10;
            } else {
                var9 = var10.method2004(this.field818 + 64, this.field827 * 25 + 768, -50, -10, -50);
            }
            field832.method3197(var9, var7);
        }
        if (this.field802) {
            var9 = ((class101) var9).method2009();
        }
        if (this.field801 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2235(arg2, arg3, arg4, arg5, true, this.field801);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2019(arg2, arg3, arg4, arg5, true, this.field801);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.w(II[[IIIII)Ldi;")
    public final class112 method618(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field790 == null) {
            var7 = (long) ((this.field797 << 10) + arg1);
        } else {
            var7 = (long) ((this.field797 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field786.method3196(var7);
        if (var9 == null) {
            class101 var10 = this.method626(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2004(this.field818 + 64, this.field827 * 25 + 768, -50, -10, -50);
            field786.method3197(var9, var7);
        }
        if (this.field801 >= 0) {
            var9 = var9.method2235(arg2, arg3, arg4, arg5, true, this.field801);
        }
        return var9;
    }

    @ObfuscatedName("am.l(II[[IIIILao;II)Ldi;")
    public final class112 method643(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field790 == null) {
            var9 = (long) ((this.field797 << 10) + arg1);
        } else {
            var9 = (long) ((this.field797 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field786.method3196(var9);
        if (var11 == null) {
            class101 var12 = this.method626(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2004(this.field818 + 64, this.field827 * 25 + 768, -50, -10, -50);
            field786.method3197(var11, var9);
        }
        if (arg6 == null && this.field801 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2207(true);
        } else {
            var13 = arg6.method682(var11, arg7, arg1);
        }
        if (this.field801 >= 0) {
            var13 = var13.method2235(arg2, arg3, arg4, arg5, false, this.field801);
        }
        return var13;
    }

    @ObfuscatedName("am.s(III)Lcy;")
    public final class101 method626(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field790 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field795 == null) {
                return null;
            }
            boolean var4 = this.field811;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field795.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field795[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field784.method3196((long) var7);
                if (var3 == null) {
                    var3 = class101.method2034(Statics.field1997, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2041();
                    }
                    field784.method3197(var3, (long) var7);
                }
                if (var5 > 1) {
                    field787[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field787, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field790.length; var9++) {
                if (this.field790[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field795[var8];
            boolean var11 = this.field811 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field784.method3196((long) var10);
            if (var3 == null) {
                var3 = class101.method2034(Statics.field1997, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2041();
                }
                field784.method3197(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field813 == 128 && this.field814 == 128 && this.field817 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field816 == 0 && this.field826 == 0 && this.field789 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field792 == null, this.field794 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2014(256);
            var14.method2015(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2012();
        } else if (var15 == 2) {
            var14.method2081();
        } else if (var15 == 3) {
            var14.method2013();
        }
        if (this.field792 != null) {
            for (int var16 = 0; var16 < this.field792.length; var16++) {
                var14.method2016(this.field792[var16], this.field793[var16]);
            }
        }
        if (this.field794 != null) {
            for (int var17 = 0; var17 < this.field794.length; var17++) {
                var14.method2017(this.field794[var17], this.field836[var17]);
            }
        }
        if (var12) {
            var14.method2003(this.field813, this.field814, this.field817);
        }
        if (var13) {
            var14.method2015(this.field816, this.field826, this.field789);
        }
        return var14;
    }

    @ObfuscatedName("am.n(I)Lam;")
    public final class32 method623() {
        int var1 = -1;
        if (this.field824 != -1) {
            var1 = class159.method1498(this.field824);
        } else if (this.field825 != -1) {
            var1 = class159.field2696[this.field825];
        }
        return var1 < 0 || var1 >= this.field823.length || this.field823[var1] == -1 ? null : method1131(this.field823[var1]);
    }

    @ObfuscatedName("am.c(B)Z")
    public boolean method624() {
        if (this.field823 == null) {
            return this.field822 != -1 || this.field830 != null;
        }
        for (int var1 = 0; var1 < this.field823.length; var1++) {
            if (this.field823[var1] != -1) {
                class32 var2 = method1131(this.field823[var1]);
                if (var2.field822 != -1 || var2.field830 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
