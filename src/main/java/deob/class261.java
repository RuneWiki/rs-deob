package deob;

@ObfuscatedName("kt")
public class class261 extends class502 {

    @ObfuscatedName("kt.ab")
    public static boolean field2732 = false;

    @ObfuscatedName("kt.au")
    public static class315 field2733 = new class315(4096);

    @ObfuscatedName("kt.ax")
    public static class315 field2770 = new class315(500);

    @ObfuscatedName("kt.ao")
    public static class315 field2773 = new class315(30);

    @ObfuscatedName("kt.am")
    public static class315 field2772 = new class315(30);

    @ObfuscatedName("kt.ac")
    public static class176[] field2768 = new class176[4];

    @ObfuscatedName("kt.ae")
    public int field2753;

    @ObfuscatedName("kt.ad")
    public int[] field2739;

    @ObfuscatedName("kt.aq")
    public int[] field2740;

    @ObfuscatedName("kt.al")
    public String field2782 = class380.field4097;

    @ObfuscatedName("kt.aj")
    public short[] field2742;

    @ObfuscatedName("kt.as")
    public short[] field2735;

    @ObfuscatedName("kt.aw")
    public short[] field2737;

    @ObfuscatedName("kt.af")
    public short[] field2745;

    @ObfuscatedName("kt.aa")
    public int field2746 = 1;

    @ObfuscatedName("kt.ah")
    public int field2759 = 1;

    @ObfuscatedName("kt.ag")
    public int field2748 = 2;

    @ObfuscatedName("kt.av")
    public boolean field2749 = true;

    @ObfuscatedName("kt.ar")
    public int field2750 = -1;

    @ObfuscatedName("kt.ap")
    public int field2751 = -1;

    @ObfuscatedName("kt.ak")
    public boolean field2752 = false;

    @ObfuscatedName("kt.ai")
    public boolean field2778 = false;

    @ObfuscatedName("kt.at")
    public int field2754 = -1;

    @ObfuscatedName("kt.az")
    public int field2755 = 16;

    @ObfuscatedName("kt.bg")
    public int field2756 = 0;

    @ObfuscatedName("kt.bz")
    public int field2757 = 0;

    @ObfuscatedName("kt.bj")
    public String[] field2758 = new String[5];

    @ObfuscatedName("kt.bc")
    public int field2730 = -1;

    @ObfuscatedName("kt.bo")
    public int field2784 = -1;

    @ObfuscatedName("kt.bm")
    public boolean field2761 = false;

    @ObfuscatedName("kt.bd")
    public boolean field2762 = true;

    @ObfuscatedName("kt.bh")
    public int field2763 = 128;

    @ObfuscatedName("kt.bx")
    public int field2764 = 128;

    @ObfuscatedName("kt.bv")
    public int field2765 = 128;

    @ObfuscatedName("kt.bu")
    public int field2766 = 0;

    @ObfuscatedName("kt.bp")
    public int field2767 = 0;

    @ObfuscatedName("kt.br")
    public int field2760 = 0;

    @ObfuscatedName("kt.bf")
    public boolean field2769 = false;

    @ObfuscatedName("kt.bq")
    public boolean field2747 = false;

    @ObfuscatedName("kt.bt")
    public int field2771 = -1;

    @ObfuscatedName("kt.bi")
    public int[] field2783;

    @ObfuscatedName("kt.be")
    public int field2780 = -1;

    @ObfuscatedName("kt.ba")
    public int field2774 = -1;

    @ObfuscatedName("kt.bn")
    public int field2775 = -1;

    @ObfuscatedName("kt.bw")
    public int field2776 = 0;

    @ObfuscatedName("kt.bk")
    public int field2777 = 0;

    @ObfuscatedName("kt.bs")
    public int field2736 = 0;

    @ObfuscatedName("kt.bb")
    public int field2779 = 0;

    @ObfuscatedName("kt.by")
    public int[] field2741;

    @ObfuscatedName("kt.bl")
    public boolean field2781 = true;

    @ObfuscatedName("kt.cx")
    public boolean field2744 = false;

    @ObfuscatedName("kt.cu")
    public class521 field2743;

    @ObfuscatedName("pg.ab(Lob;Lob;ZI)V")
    public static void method6879(class389 arg0, class389 arg1, boolean arg2) {
        Statics.field2731 = arg0;
        Statics.field2738 = arg1;
        field2732 = arg2;
    }

    @ObfuscatedName("is.ay(II)Lkt;")
    public static class261 method4328(int arg0) {
        class261 var1 = (class261) field2733.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2731.method6670(6, arg0);
        class261 var3 = new class261();
        var3.field2753 = arg0;
        if (var2 != null) {
            var3.method4712(new class549(var2));
        }
        var3.method4711();
        if (var3.field2747) {
            var3.field2748 = 0;
            var3.field2749 = false;
        }
        field2733.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kt.an(B)V")
    public void method4711() {
        if (this.field2750 == -1) {
            this.field2750 = 0;
            if (this.field2739 != null && (this.field2740 == null || this.field2740[0] == 10)) {
                this.field2750 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2758[var1] != null) {
                    this.field2750 = 1;
                }
            }
        }
        if (this.field2771 == -1) {
            this.field2771 = this.field2748 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("kt.au(Lvg;I)V")
    public void method4712(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4713(arg0, var2);
        }
    }

    @ObfuscatedName("kt.ax(Lvg;IB)V")
    public void method4713(class549 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method9025();
            if (var3 > 0) {
                if (this.field2739 == null || field2732) {
                    this.field2740 = new int[var3];
                    this.field2739 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2739[var4] = arg0.method8968();
                        this.field2740[var4] = arg0.method9025();
                    }
                } else {
                    arg0.field5378 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2782 = arg0.method8808();
        } else if (arg1 == 5) {
            int var5 = arg0.method9025();
            if (var5 > 0) {
                if (this.field2739 == null || field2732) {
                    this.field2740 = null;
                    this.field2739 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2739[var6] = arg0.method8968();
                    }
                } else {
                    arg0.field5378 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2746 = arg0.method9025();
        } else if (arg1 == 15) {
            this.field2759 = arg0.method9025();
        } else if (arg1 == 17) {
            this.field2748 = 0;
            this.field2749 = false;
        } else if (arg1 == 18) {
            this.field2749 = false;
        } else if (arg1 == 19) {
            this.field2750 = arg0.method9025();
        } else if (arg1 == 21) {
            this.field2751 = 0;
        } else if (arg1 == 22) {
            this.field2752 = true;
        } else if (arg1 == 23) {
            this.field2778 = true;
        } else if (arg1 == 24) {
            this.field2754 = arg0.method8968();
            if (this.field2754 == 65535) {
                this.field2754 = -1;
            }
        } else if (arg1 == 27) {
            this.field2748 = 1;
        } else if (arg1 == 28) {
            this.field2755 = arg0.method9025();
        } else if (arg1 == 29) {
            this.field2756 = arg0.method8798();
        } else if (arg1 == 39) {
            this.field2757 = arg0.method8798() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2758[arg1 - 30] = arg0.method8808();
            if (this.field2758[arg1 - 30].equalsIgnoreCase(class380.field4137)) {
                this.field2758[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method9025();
            this.field2742 = new short[var7];
            this.field2735 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2742[var8] = (short) arg0.method8968();
                this.field2735[var8] = (short) arg0.method8968();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method9025();
            this.field2737 = new short[var9];
            this.field2745 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2737[var10] = (short) arg0.method8968();
                this.field2745[var10] = (short) arg0.method8968();
            }
        } else if (arg1 == 61) {
            arg0.method8968();
        } else if (arg1 == 62) {
            this.field2761 = true;
        } else if (arg1 == 64) {
            this.field2762 = false;
        } else if (arg1 == 65) {
            this.field2763 = arg0.method8968();
        } else if (arg1 == 66) {
            this.field2764 = arg0.method8968();
        } else if (arg1 == 67) {
            this.field2765 = arg0.method8968();
        } else if (arg1 == 68) {
            this.field2784 = arg0.method8968();
        } else if (arg1 == 69) {
            arg0.method9025();
        } else if (arg1 == 70) {
            this.field2766 = arg0.method8919();
        } else if (arg1 == 71) {
            this.field2767 = arg0.method8919();
        } else if (arg1 == 72) {
            this.field2760 = arg0.method8919();
        } else if (arg1 == 73) {
            this.field2769 = true;
        } else if (arg1 == 74) {
            this.field2747 = true;
        } else if (arg1 == 75) {
            this.field2771 = arg0.method9025();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2780 = arg0.method8968();
            if (this.field2780 == 65535) {
                this.field2780 = -1;
            }
            this.field2774 = arg0.method8968();
            if (this.field2774 == 65535) {
                this.field2774 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8968();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method9025();
            this.field2783 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2783[var15] = arg0.method8968();
                if (this.field2783[var15] == 65535) {
                    this.field2783[var15] = -1;
                }
            }
            this.field2783[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2775 = arg0.method8968();
            this.field2776 = arg0.method9025();
            this.field2777 = arg0.method9025();
        } else if (arg1 == 79) {
            this.field2736 = arg0.method8968();
            this.field2779 = arg0.method8968();
            this.field2776 = arg0.method9025();
            this.field2777 = arg0.method9025();
            int var11 = arg0.method9025();
            this.field2741 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2741[var12] = arg0.method8968();
            }
        } else if (arg1 == 81) {
            arg0.method9025();
        } else if (arg1 == 82) {
            this.field2730 = arg0.method8968();
        } else if (arg1 == 89) {
            this.field2781 = false;
        } else if (arg1 == 90) {
            this.field2744 = true;
        } else if (arg1 == 249) {
            this.field2743 = class239.method3156(arg0, this.field2743);
        }
    }

    @ObfuscatedName("kt.ao(IB)Z")
    public final boolean method4714(int arg0) {
        if (this.field2740 != null) {
            for (int var4 = 0; var4 < this.field2740.length; var4++) {
                if (this.field2740[var4] == arg0) {
                    return Statics.field2738.method6656(this.field2739[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2739 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2739.length; var3++) {
                var2 &= Statics.field2738.method6656(this.field2739[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("kt.am(I)Z")
    public final boolean method4715() {
        if (this.field2739 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2739.length; var2++) {
            var1 &= Statics.field2738.method6656(this.field2739[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("kt.ac(II[[IIIIB)Lhs;")
    public final class189 method4716(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2740 == null) {
            var7 = (long) ((this.field2753 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2753 << 10) + (arg0 << 3) + arg1);
        }
        class189 var9 = (class189) field2773.method5586(var7);
        if (var9 == null) {
            class176 var10 = this.method4718(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2752) {
                var10.field1860 = (short) (this.field2756 + 64);
                var10.field1869 = (short) (this.field2757 + 768);
                var10.method3365();
                var9 = var10;
            } else {
                var9 = var10.method3424(this.field2756 + 64, this.field2757 + 768, -50, -10, -50);
            }
            field2773.method5589(var9, var7);
        }
        if (this.field2752) {
            var9 = ((class176) var9).method3351();
        }
        if (this.field2751 >= 0) {
            if (var9 instanceof class197) {
                var9 = ((class197) var9).method3904(arg2, arg3, arg4, arg5, true, this.field2751);
            } else if (var9 instanceof class176) {
                var9 = ((class176) var9).method3380(arg2, arg3, arg4, arg5, true, this.field2751);
            }
        }
        return var9;
    }

    @ObfuscatedName("kt.ae(II[[IIIII)Lhr;")
    public final class197 method4745(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2740 == null) {
            var7 = (long) ((this.field2753 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2753 << 10) + (arg0 << 3) + arg1);
        }
        class197 var9 = (class197) field2772.method5586(var7);
        if (var9 == null) {
            class176 var10 = this.method4718(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3424(this.field2756 + 64, this.field2757 + 768, -50, -10, -50);
            field2772.method5589(var9, var7);
        }
        if (this.field2751 >= 0) {
            var9 = var9.method3904(arg2, arg3, arg4, arg5, true, this.field2751);
        }
        return var9;
    }

    @ObfuscatedName("kt.ad(II[[IIIILkr;II)Lhr;")
    public final class197 method4747(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class264 arg6, int arg7) {
        long var9;
        if (this.field2740 == null) {
            var9 = (long) ((this.field2753 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2753 << 10) + (arg0 << 3) + arg1);
        }
        class197 var11 = (class197) field2772.method5586(var9);
        if (var11 == null) {
            class176 var12 = this.method4718(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3424(this.field2756 + 64, this.field2757 + 768, -50, -10, -50);
            field2772.method5589(var11, var9);
        }
        if (arg6 == null && this.field2751 == -1) {
            return var11;
        }
        class197 var13;
        if (arg6 == null) {
            var13 = var11.method3976(true);
        } else {
            var13 = arg6.method4870(var11, arg7, arg1);
        }
        if (this.field2751 >= 0) {
            var13 = var13.method3904(arg2, arg3, arg4, arg5, false, this.field2751);
        }
        return var13;
    }

    @ObfuscatedName("kt.aq(IIB)Lgm;")
    public final class176 method4718(int arg0, int arg1) {
        class176 var3 = null;
        if (this.field2740 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2739 == null) {
                return null;
            }
            boolean var4 = this.field2761;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2739.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2739[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class176) field2770.method5586((long) var7);
                if (var3 == null) {
                    var3 = class176.method3343(Statics.field2738, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3361();
                    }
                    field2770.method5589(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2768[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class176(field2768, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2740.length; var9++) {
                if (this.field2740[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2739[var8];
            boolean var11 = this.field2761 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class176) field2770.method5586((long) var10);
            if (var3 == null) {
                var3 = class176.method3343(Statics.field2738, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3361();
                }
                field2770.method5589(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2763 == 128 && this.field2764 == 128 && this.field2765 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2766 == 0 && this.field2767 == 0 && this.field2760 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class176 var14 = new class176(var3, arg1 == 0 && !var12 && !var13, this.field2742 == null, this.field2737 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3357(256);
            var14.method3405(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3354();
        } else if (var15 == 2) {
            var14.method3355();
        } else if (var15 == 3) {
            var14.method3368();
        }
        if (this.field2742 != null) {
            for (int var16 = 0; var16 < this.field2742.length; var16++) {
                var14.method3350(this.field2742[var16], this.field2735[var16]);
            }
        }
        if (this.field2737 != null) {
            for (int var17 = 0; var17 < this.field2737.length; var17++) {
                var14.method3360(this.field2737[var17], this.field2745[var17]);
            }
        }
        if (var12) {
            var14.method3370(this.field2763, this.field2764, this.field2765);
        }
        if (var13) {
            var14.method3405(this.field2766, this.field2767, this.field2760);
        }
        return var14;
    }

    @ObfuscatedName("kt.al(I)Lkt;")
    public final class261 method4719() {
        int var1 = -1;
        if (this.field2780 != -1) {
            var1 = class349.method3159(this.field2780);
        } else if (this.field2774 != -1) {
            var1 = class349.field3702[this.field2774];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2783.length - 1) {
            var2 = this.field2783[var1];
        } else {
            var2 = this.field2783[this.field2783.length - 1];
        }
        return var2 == -1 ? null : method4328(var2);
    }

    @ObfuscatedName("kt.aj(III)I")
    public int method4720(int arg0, int arg1) {
        class521 var3 = this.field2743;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8512((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5073;
            }
        }
        return var4;
    }

    @ObfuscatedName("kt.as(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4721(int arg0, String arg1) {
        return class239.method6634(this.field2743, arg0, arg1);
    }

    @ObfuscatedName("kt.aw(B)Z")
    public boolean method4734() {
        if (this.field2783 == null) {
            return this.field2775 != -1 || this.field2741 != null;
        }
        for (int var1 = 0; var1 < this.field2783.length; var1++) {
            if (this.field2783[var1] != -1) {
                class261 var2 = method4328(this.field2783[var1]);
                if (var2.field2775 != -1 || var2.field2741 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
