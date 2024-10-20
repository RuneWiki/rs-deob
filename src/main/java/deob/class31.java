package deob;

@ObfuscatedName("ad")
public class class31 extends class172 {

    @ObfuscatedName("ad.j")
    public static boolean field833 = false;

    @ObfuscatedName("ad.z")
    public static class168 field795 = new class168(64);

    @ObfuscatedName("ad.c")
    public static class168 field796 = new class168(500);

    @ObfuscatedName("ad.e")
    public static class168 field816 = new class168(30);

    @ObfuscatedName("ad.s")
    public static class168 field798 = new class168(30);

    @ObfuscatedName("ad.i")
    public static class100[] field821 = new class100[4];

    @ObfuscatedName("ad.g")
    public int field819;

    @ObfuscatedName("ad.q")
    public int[] field801;

    @ObfuscatedName("ad.w")
    public int[] field802;

    @ObfuscatedName("ad.k")
    public String field803 = "null";

    @ObfuscatedName("ad.v")
    public short[] field828;

    @ObfuscatedName("ad.o")
    public short[] field805;

    @ObfuscatedName("ad.m")
    public short[] field829;

    @ObfuscatedName("ad.u")
    public short[] field807;

    @ObfuscatedName("ad.r")
    public int field808 = 1;

    @ObfuscatedName("ad.d")
    public int field814 = 1;

    @ObfuscatedName("ad.n")
    public int field800 = 2;

    @ObfuscatedName("ad.b")
    public boolean field811 = true;

    @ObfuscatedName("ad.p")
    public int field812 = -1;

    @ObfuscatedName("ad.t")
    public int field813 = -1;

    @ObfuscatedName("ad.l")
    public boolean field825 = false;

    @ObfuscatedName("ad.a")
    public boolean field809 = false;

    @ObfuscatedName("ad.f")
    public int field810 = -1;

    @ObfuscatedName("ad.h")
    public int field817 = 16;

    @ObfuscatedName("ad.az")
    public int field818 = 0;

    @ObfuscatedName("ad.ao")
    public int field815 = 0;

    @ObfuscatedName("ad.au")
    public String[] field820 = new String[5];

    @ObfuscatedName("ad.aw")
    public int field827 = -1;

    @ObfuscatedName("ad.ad")
    public int field822 = -1;

    @ObfuscatedName("ad.av")
    public boolean field823 = false;

    @ObfuscatedName("ad.am")
    public boolean field824 = true;

    @ObfuscatedName("ad.an")
    public int field842 = 128;

    @ObfuscatedName("ad.ac")
    public int field826 = 128;

    @ObfuscatedName("ad.at")
    public int field806 = 128;

    @ObfuscatedName("ad.ax")
    public int field797 = 0;

    @ObfuscatedName("ad.aj")
    public int field799 = 0;

    @ObfuscatedName("ad.ai")
    public int field830 = 0;

    @ObfuscatedName("ad.ay")
    public int field804 = 0;

    @ObfuscatedName("ad.ag")
    public boolean field832 = false;

    @ObfuscatedName("ad.ar")
    public boolean field792 = false;

    @ObfuscatedName("ad.ae")
    public int field834 = -1;

    @ObfuscatedName("ad.ah")
    public int[] field835;

    @ObfuscatedName("ad.aa")
    public int field840 = -1;

    @ObfuscatedName("ad.ab")
    public int field837 = -1;

    @ObfuscatedName("ad.ak")
    public int field838 = -1;

    @ObfuscatedName("ad.al")
    public int field836 = 0;

    @ObfuscatedName("ad.as")
    public int field831 = 0;

    @ObfuscatedName("ad.ap")
    public int field841 = 0;

    @ObfuscatedName("ad.aq")
    public int[] field839;

    @ObfuscatedName("c.j(IB)Lad;")
    public static class31 method35(int arg0) {
        class31 var1 = (class31) field795.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field793.method2903(6, arg0);
        class31 var3 = new class31();
        var3.field819 = arg0;
        if (var2 != null) {
            var3.method622(new class126(var2));
        }
        var3.method645();
        if (var3.field792) {
            var3.field800 = 0;
            var3.field811 = false;
        }
        field795.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.y(I)V")
    public void method645() {
        if (this.field812 == -1) {
            this.field812 = 0;
            if (this.field801 != null && (this.field802 == null || this.field802[0] == 10)) {
                this.field812 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field820[var1] != null) {
                    this.field812 = 1;
                }
            }
        }
        if (this.field834 == -1) {
            this.field834 = this.field800 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ad.x(Ldr;B)V")
    public void method622(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method623(arg0, var2);
        }
    }

    @ObfuscatedName("ad.z(Ldr;II)V")
    public void method623(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2399();
            if (var3 > 0) {
                if (this.field801 == null || field833) {
                    this.field802 = new int[var3];
                    this.field801 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field801[var4] = arg0.method2405();
                        this.field802[var4] = arg0.method2399();
                    }
                } else {
                    arg0.field2020 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field803 = arg0.method2390();
        } else if (arg1 == 5) {
            int var5 = arg0.method2399();
            if (var5 > 0) {
                if (this.field801 == null || field833) {
                    this.field802 = null;
                    this.field801 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field801[var6] = arg0.method2405();
                    }
                } else {
                    arg0.field2020 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field808 = arg0.method2399();
        } else if (arg1 == 15) {
            this.field814 = arg0.method2399();
        } else if (arg1 == 17) {
            this.field800 = 0;
            this.field811 = false;
        } else if (arg1 == 18) {
            this.field811 = false;
        } else if (arg1 == 19) {
            this.field812 = arg0.method2399();
        } else if (arg1 == 21) {
            this.field813 = 0;
        } else if (arg1 == 22) {
            this.field825 = true;
        } else if (arg1 == 23) {
            this.field809 = true;
        } else if (arg1 == 24) {
            this.field810 = arg0.method2405();
            if (this.field810 == 65535) {
                this.field810 = -1;
            }
        } else if (arg1 == 27) {
            this.field800 = 1;
        } else if (arg1 == 28) {
            this.field817 = arg0.method2399();
        } else if (arg1 == 29) {
            this.field818 = arg0.method2383();
        } else if (arg1 == 39) {
            this.field815 = arg0.method2383() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field820[arg1 - 30] = arg0.method2390();
            if (this.field820[arg1 - 30].equalsIgnoreCase(class133.field2229)) {
                this.field820[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2399();
            this.field828 = new short[var7];
            this.field805 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field828[var8] = (short) arg0.method2405();
                this.field805[var8] = (short) arg0.method2405();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2399();
            this.field829 = new short[var9];
            this.field807 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field829[var10] = (short) arg0.method2405();
                this.field807[var10] = (short) arg0.method2405();
            }
        } else if (arg1 == 60) {
            this.field827 = arg0.method2405();
        } else if (arg1 == 62) {
            this.field823 = true;
        } else if (arg1 == 64) {
            this.field824 = false;
        } else if (arg1 == 65) {
            this.field842 = arg0.method2405();
        } else if (arg1 == 66) {
            this.field826 = arg0.method2405();
        } else if (arg1 == 67) {
            this.field806 = arg0.method2405();
        } else if (arg1 == 68) {
            this.field822 = arg0.method2405();
        } else if (arg1 == 69) {
            this.field804 = arg0.method2399();
        } else if (arg1 == 70) {
            this.field797 = arg0.method2385();
        } else if (arg1 == 71) {
            this.field799 = arg0.method2385();
        } else if (arg1 == 72) {
            this.field830 = arg0.method2385();
        } else if (arg1 == 73) {
            this.field832 = true;
        } else if (arg1 == 74) {
            this.field792 = true;
        } else if (arg1 == 75) {
            this.field834 = arg0.method2399();
        } else if (arg1 == 77) {
            this.field840 = arg0.method2405();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
            this.field837 = arg0.method2405();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
            int var11 = arg0.method2399();
            this.field835 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field835[var12] = arg0.method2405();
                if (this.field835[var12] == 65535) {
                    this.field835[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field838 = arg0.method2405();
            this.field836 = arg0.method2399();
        } else if (arg1 == 79) {
            this.field831 = arg0.method2405();
            this.field841 = arg0.method2405();
            this.field836 = arg0.method2399();
            int var13 = arg0.method2399();
            this.field839 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field839[var14] = arg0.method2405();
            }
        } else if (arg1 == 81) {
            this.field813 = arg0.method2399() * 256;
        }
    }

    @ObfuscatedName("ad.c(II)Z")
    public final boolean method624(int arg0) {
        if (this.field802 != null) {
            for (int var4 = 0; var4 < this.field802.length; var4++) {
                if (this.field802[var4] == arg0) {
                    return Statics.field794.method2965(this.field801[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field801 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field801.length; var3++) {
                var2 &= Statics.field794.method2965(this.field801[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ad.e(I)Z")
    public final boolean method625() {
        if (this.field801 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field801.length; var2++) {
            var1 &= Statics.field794.method2965(this.field801[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ad.s(II[[IIIII)Lco;")
    public final class93 method631(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field802 == null) {
            var7 = (long) ((this.field819 << 10) + arg1);
        } else {
            var7 = (long) ((this.field819 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field816.method3191(var7);
        if (var9 == null) {
            class100 var10 = this.method629(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field825) {
                var10.field1700 = (short) (this.field818 + 64);
                var10.field1701 = (short) (this.field815 + 768);
                var10.method2064();
                var9 = var10;
            } else {
                var9 = var10.method2057(this.field818 + 64, this.field815 + 768, -50, -10, -50);
            }
            field816.method3181(var9, var7);
        }
        if (this.field825) {
            var9 = ((class100) var9).method2005();
        }
        if (this.field813 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2236(arg2, arg3, arg4, arg5, true, this.field813);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2008(arg2, arg3, arg4, arg5, true, this.field813);
            }
        }
        return var9;
    }

    @ObfuscatedName("ad.i(II[[IIIII)Ldh;")
    public final class111 method627(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field802 == null) {
            var7 = (long) ((this.field819 << 10) + arg1);
        } else {
            var7 = (long) ((this.field819 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field798.method3191(var7);
        if (var9 == null) {
            class100 var10 = this.method629(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2057(this.field818 + 64, this.field815 + 768, -50, -10, -50);
            field798.method3181(var9, var7);
        }
        if (this.field813 >= 0) {
            var9 = var9.method2236(arg2, arg3, arg4, arg5, true, this.field813);
        }
        return var9;
    }

    @ObfuscatedName("ad.g(II[[IIIILam;IS)Ldh;")
    public final class111 method621(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field802 == null) {
            var9 = (long) ((this.field819 << 10) + arg1);
        } else {
            var9 = (long) ((this.field819 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field798.method3191(var9);
        if (var11 == null) {
            class100 var12 = this.method629(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2057(this.field818 + 64, this.field815 + 768, -50, -10, -50);
            field798.method3181(var11, var9);
        }
        if (arg6 == null && this.field813 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2189(true);
        } else {
            var13 = arg6.method700(var11, arg7, arg1);
        }
        if (this.field813 >= 0) {
            var13 = var13.method2236(arg2, arg3, arg4, arg5, false, this.field813);
        }
        return var13;
    }

    @ObfuscatedName("ad.q(III)Lck;")
    public final class100 method629(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field802 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field801 == null) {
                return null;
            }
            boolean var4 = this.field823;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field801.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field801[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field796.method3191((long) var7);
                if (var3 == null) {
                    var3 = class100.method2001(Statics.field794, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2015();
                    }
                    field796.method3181(var3, (long) var7);
                }
                if (var5 > 1) {
                    field821[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field821, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field802.length; var9++) {
                if (this.field802[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field801[var8];
            boolean var11 = this.field823 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field796.method3191((long) var10);
            if (var3 == null) {
                var3 = class100.method2001(Statics.field794, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2015();
                }
                field796.method3181(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field842 == 128 && this.field826 == 128 && this.field806 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field797 == 0 && this.field799 == 0 && this.field830 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field828 == null, this.field829 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2067(256);
            var14.method2062(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2053();
        } else if (var15 == 2) {
            var14.method2009();
        } else if (var15 == 3) {
            var14.method2010();
        }
        if (this.field828 != null) {
            for (int var16 = 0; var16 < this.field828.length; var16++) {
                var14.method2013(this.field828[var16], this.field805[var16]);
            }
        }
        if (this.field829 != null) {
            for (int var17 = 0; var17 < this.field829.length; var17++) {
                var14.method2000(this.field829[var17], this.field807[var17]);
            }
        }
        if (var12) {
            var14.method2016(this.field842, this.field826, this.field806);
        }
        if (var13) {
            var14.method2062(this.field797, this.field799, this.field830);
        }
        return var14;
    }

    @ObfuscatedName("ad.w(I)Lad;")
    public final class31 method630() {
        int var1 = -1;
        if (this.field840 != -1) {
            var1 = class157.method1999(this.field840);
        } else if (this.field837 != -1) {
            var1 = class157.field2647[this.field837];
        }
        return var1 < 0 || var1 >= this.field835.length || this.field835[var1] == -1 ? null : method35(this.field835[var1]);
    }

    @ObfuscatedName("ad.k(B)Z")
    public boolean method655() {
        if (this.field835 == null) {
            return this.field838 != -1 || this.field839 != null;
        }
        for (int var1 = 0; var1 < this.field835.length; var1++) {
            if (this.field835[var1] != -1) {
                class31 var2 = method35(this.field835[var1]);
                if (var2.field838 != -1 || var2.field839 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
