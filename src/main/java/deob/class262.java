package deob;

@ObfuscatedName("km")
public class class262 extends class502 {

    @ObfuscatedName("km.aq")
    public static class315 field2785 = new class315(64);

    @ObfuscatedName("km.al")
    public static class315 field2792 = new class315(50);

    @ObfuscatedName("km.aj")
    public static class315 field2793 = new class315(200);

    @ObfuscatedName("km.aw")
    public int field2794;

    @ObfuscatedName("km.af")
    public int field2795;

    @ObfuscatedName("km.aa")
    public String field2796 = class380.field4097;

    @ObfuscatedName("km.ah")
    public String field2797 = class380.field4097;

    @ObfuscatedName("km.ag")
    public short[] field2786;

    @ObfuscatedName("km.av")
    public short[] field2813;

    @ObfuscatedName("km.ar")
    public short[] field2800;

    @ObfuscatedName("km.ap")
    public short[] field2801;

    @ObfuscatedName("km.ak")
    public int field2802 = 2000;

    @ObfuscatedName("km.ai")
    public int field2803 = 0;

    @ObfuscatedName("km.at")
    public int field2809 = 0;

    @ObfuscatedName("km.az")
    public int field2827 = 0;

    @ObfuscatedName("km.bg")
    public int field2806 = 0;

    @ObfuscatedName("km.bz")
    public int field2807 = 0;

    @ObfuscatedName("km.bo")
    public int field2847 = 0;

    @ObfuscatedName("km.bm")
    public int field2810 = 1;

    @ObfuscatedName("km.bd")
    public int field2791 = -1;

    @ObfuscatedName("km.bh")
    public int field2832 = -1;

    @ObfuscatedName("km.bx")
    public int field2799 = -1;

    @ObfuscatedName("km.bv")
    public boolean field2814 = false;

    @ObfuscatedName("km.bu")
    public String[] field2815 = new String[] { null, null, class380.field4090, null, null };

    @ObfuscatedName("km.bp")
    public String[] field2816 = new String[] { null, null, null, null, class380.field4091 };

    @ObfuscatedName("km.br")
    public String[][] field2825 = (String[][]) null;

    @ObfuscatedName("km.bq")
    public int field2818 = -2;

    @ObfuscatedName("km.bt")
    public int field2817 = -1;

    @ObfuscatedName("km.bi")
    public int field2820 = -1;

    @ObfuscatedName("km.be")
    public int field2821 = 0;

    @ObfuscatedName("km.ba")
    public int field2822 = -1;

    @ObfuscatedName("km.bn")
    public int field2823 = -1;

    @ObfuscatedName("km.bw")
    public int field2804 = 0;

    @ObfuscatedName("km.bk")
    public int field2829 = -1;

    @ObfuscatedName("km.bs")
    public int field2826 = -1;

    @ObfuscatedName("km.bb")
    public int field2834 = -1;

    @ObfuscatedName("km.by")
    public int field2828 = -1;

    @ObfuscatedName("km.bl")
    public int field2844 = -1;

    @ObfuscatedName("km.cx")
    public int field2830 = -1;

    @ObfuscatedName("km.cu")
    public int[] field2841;

    @ObfuscatedName("km.cz")
    public int[] field2819;

    @ObfuscatedName("km.cm")
    public int field2824 = -1;

    @ObfuscatedName("km.ct")
    public int field2811 = -1;

    @ObfuscatedName("km.cl")
    public int field2835 = 128;

    @ObfuscatedName("km.cb")
    public int field2798 = 128;

    @ObfuscatedName("km.cr")
    public int field2837 = 128;

    @ObfuscatedName("km.cj")
    public int field2838 = 0;

    @ObfuscatedName("km.cg")
    public int field2839 = 0;

    @ObfuscatedName("km.cp")
    public int field2840 = 0;

    @ObfuscatedName("km.cq")
    public int field2787 = 0;

    @ObfuscatedName("km.ci")
    public class521 field2842;

    @ObfuscatedName("km.co")
    public boolean field2843 = false;

    @ObfuscatedName("km.cn")
    public int field2833 = -1;

    @ObfuscatedName("km.cy")
    public int field2845 = -1;

    @ObfuscatedName("km.ce")
    public int field2846 = -1;

    @ObfuscatedName("km.cf")
    public int field2805 = -1;

    @ObfuscatedName("aq.ab(Lob;Lob;ZLqe;I)V")
    public static void method79(class389 arg0, class389 arg1, boolean arg2, class433 arg3) {
        Statics.field2788 = arg0;
        Statics.field2789 = arg1;
        Statics.field2543 = arg2;
        Statics.field2790 = Statics.field2788.method6685(10);
        Statics.field5134 = arg3;
    }

    @ObfuscatedName("dw.ay(IB)Lkm;")
    public static class262 method2385(int arg0) {
        class262 var1 = (class262) field2785.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2788.method6670(10, arg0);
        class262 var3 = new class262();
        var3.field2794 = arg0;
        if (var2 != null) {
            var3.method4767(new class549(var2));
        }
        var3.method4836();
        if (var3.field2811 != -1) {
            var3.method4768(method2385(var3.field2811), method2385(var3.field2824));
        }
        if (var3.field2845 != -1) {
            var3.method4764(method2385(var3.field2845), method2385(var3.field2833));
        }
        if (var3.field2805 != -1) {
            var3.method4769(method2385(var3.field2805), method2385(var3.field2846));
        }
        if (!Statics.field2543 && var3.field2814) {
            if (var3.field2811 == -1 && var3.field2845 == -1 && var3.field2805 == -1) {
                var3.field2796 = var3.field2796 + class380.field4092;
            }
            var3.field2797 = class380.field4344;
            var3.field2843 = false;
            for (int var4 = 0; var4 < var3.field2815.length; var4++) {
                var3.field2815[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2816.length; var5++) {
                if (var5 != 4) {
                    if (var3.field2825 != null) {
                        var3.field2825[var5] = null;
                    }
                    var3.field2816[var5] = null;
                }
            }
            var3.field2818 = -2;
            var3.field2840 = 0;
            if (var3.field2842 != null) {
                boolean var6 = false;
                for (class506 var7 = var3.field2842.method8520(); var7 != null; var7 = var3.field2842.method8515()) {
                    class257 var8 = Statics.method1930((int) var7.field5075);
                    if (var8.field2695) {
                        var7.method8218();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2842 = null;
                }
            }
        }
        field2785.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("km.an(I)V")
    public void method4836() {
        if (this.field2847 == 1) {
            this.field2787 = 0;
        }
    }

    @ObfuscatedName("km.au(Lvg;I)V")
    public void method4767(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4838(arg0, var2);
        }
    }

    @ObfuscatedName("km.ax(Lvg;IB)V")
    public void method4838(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2795 = arg0.method8968();
        } else if (arg1 == 2) {
            this.field2796 = arg0.method8808();
        } else if (arg1 == 3) {
            this.field2797 = arg0.method8808();
        } else if (arg1 == 4) {
            this.field2802 = arg0.method8968();
        } else if (arg1 == 5) {
            this.field2803 = arg0.method8968();
        } else if (arg1 == 6) {
            this.field2809 = arg0.method8968();
        } else if (arg1 == 7) {
            this.field2806 = arg0.method8968();
            if (this.field2806 > 32767) {
                this.field2806 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2807 = arg0.method8968();
            if (this.field2807 > 32767) {
                this.field2807 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8808();
        } else if (arg1 == 11) {
            this.field2847 = 1;
        } else if (arg1 == 12) {
            this.field2810 = arg0.method8803();
        } else if (arg1 == 13) {
            this.field2791 = arg0.method9025();
        } else if (arg1 == 14) {
            this.field2832 = arg0.method9025();
        } else if (arg1 == 16) {
            this.field2814 = true;
        } else if (arg1 == 23) {
            this.field2817 = arg0.method8968();
            this.field2821 = arg0.method9025();
        } else if (arg1 == 24) {
            this.field2820 = arg0.method8968();
        } else if (arg1 == 25) {
            this.field2822 = arg0.method8968();
            this.field2804 = arg0.method9025();
        } else if (arg1 == 26) {
            this.field2823 = arg0.method8968();
        } else if (arg1 == 27) {
            this.field2799 = arg0.method9025();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2815[arg1 - 30] = arg0.method8808();
            if (this.field2815[arg1 - 30].equalsIgnoreCase(class380.field4137)) {
                this.field2815[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2816[arg1 - 35] = arg0.method8808();
        } else if (arg1 == 40) {
            int var3 = arg0.method9025();
            this.field2786 = new short[var3];
            this.field2813 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2786[var4] = (short) arg0.method8968();
                this.field2813[var4] = (short) arg0.method8968();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method9025();
            this.field2800 = new short[var5];
            this.field2801 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2800[var6] = (short) arg0.method8968();
                this.field2801[var6] = (short) arg0.method8968();
            }
        } else if (arg1 == 42) {
            this.field2818 = arg0.method8798();
        } else if (arg1 == 43) {
            int var7 = arg0.method9025();
            if (this.field2825 == null) {
                this.field2825 = new String[5][];
            }
            boolean var8 = var7 >= 0 && var7 < 5;
            if (var8 && this.field2825[var7] == null) {
                this.field2825[var7] = new String[20];
            }
            while (true) {
                int var9 = arg0.method9025() - 1;
                if (var9 == -1) {
                    break;
                }
                String var10 = arg0.method8808();
                if (var8 && var9 >= 0 && var9 < 20) {
                    this.field2825[var7][var9] = var10;
                }
            }
        } else if (arg1 == 65) {
            this.field2843 = true;
        } else if (arg1 == 75) {
            this.field2787 = arg0.method8919();
        } else if (arg1 == 78) {
            this.field2829 = arg0.method8968();
        } else if (arg1 == 79) {
            this.field2826 = arg0.method8968();
        } else if (arg1 == 90) {
            this.field2834 = arg0.method8968();
        } else if (arg1 == 91) {
            this.field2844 = arg0.method8968();
        } else if (arg1 == 92) {
            this.field2828 = arg0.method8968();
        } else if (arg1 == 93) {
            this.field2830 = arg0.method8968();
        } else if (arg1 == 94) {
            arg0.method8968();
        } else if (arg1 == 95) {
            this.field2827 = arg0.method8968();
        } else if (arg1 == 97) {
            this.field2824 = arg0.method8968();
        } else if (arg1 == 98) {
            this.field2811 = arg0.method8968();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2841 == null) {
                this.field2841 = new int[10];
                this.field2819 = new int[10];
            }
            this.field2841[arg1 - 100] = arg0.method8968();
            this.field2819[arg1 - 100] = arg0.method8968();
        } else if (arg1 == 110) {
            this.field2835 = arg0.method8968();
        } else if (arg1 == 111) {
            this.field2798 = arg0.method8968();
        } else if (arg1 == 112) {
            this.field2837 = arg0.method8968();
        } else if (arg1 == 113) {
            this.field2838 = arg0.method8798();
        } else if (arg1 == 114) {
            this.field2839 = arg0.method8798() * 5;
        } else if (arg1 == 115) {
            this.field2840 = arg0.method9025();
        } else if (arg1 == 139) {
            this.field2833 = arg0.method8968();
        } else if (arg1 == 140) {
            this.field2845 = arg0.method8968();
        } else if (arg1 == 148) {
            this.field2846 = arg0.method8968();
        } else if (arg1 == 149) {
            this.field2805 = arg0.method8968();
        } else if (arg1 == 249) {
            this.field2842 = class239.method3156(arg0, this.field2842);
        }
    }

    @ObfuscatedName("km.ao(Lkm;Lkm;I)V")
    public void method4768(class262 arg0, class262 arg1) {
        this.field2795 = arg0.field2795;
        this.field2802 = arg0.field2802;
        this.field2803 = arg0.field2803;
        this.field2809 = arg0.field2809;
        this.field2827 = arg0.field2827;
        this.field2806 = arg0.field2806;
        this.field2807 = arg0.field2807;
        this.field2786 = arg0.field2786;
        this.field2813 = arg0.field2813;
        this.field2800 = arg0.field2800;
        this.field2801 = arg0.field2801;
        this.field2796 = arg1.field2796;
        this.field2797 = class380.field4089;
        this.field2814 = arg1.field2814;
        this.field2810 = arg1.field2810;
        this.field2847 = 1;
    }

    @ObfuscatedName("km.am(Lkm;Lkm;I)V")
    public void method4764(class262 arg0, class262 arg1) {
        this.field2795 = arg0.field2795;
        this.field2802 = arg0.field2802;
        this.field2803 = arg0.field2803;
        this.field2809 = arg0.field2809;
        this.field2827 = arg0.field2827;
        this.field2806 = arg0.field2806;
        this.field2807 = arg0.field2807;
        this.field2786 = arg1.field2786;
        this.field2813 = arg1.field2813;
        this.field2800 = arg1.field2800;
        this.field2801 = arg1.field2801;
        this.field2796 = arg1.field2796;
        this.field2797 = arg1.field2797;
        this.field2814 = arg1.field2814;
        this.field2847 = arg1.field2847;
        this.field2791 = arg1.field2791;
        this.field2832 = arg1.field2832;
        this.field2799 = arg1.field2799;
        this.field2817 = arg1.field2817;
        this.field2820 = arg1.field2820;
        this.field2829 = arg1.field2829;
        this.field2822 = arg1.field2822;
        this.field2823 = arg1.field2823;
        this.field2826 = arg1.field2826;
        this.field2834 = arg1.field2834;
        this.field2828 = arg1.field2828;
        this.field2844 = arg1.field2844;
        this.field2830 = arg1.field2830;
        this.field2840 = arg1.field2840;
        this.field2815 = arg1.field2815;
        this.field2787 = arg1.field2787;
        this.field2816 = new String[5];
        if (arg1.field2816 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2816[var3] = arg1.field2816[var3];
            }
        }
        this.field2816[4] = class380.field4306;
        if (arg1.field2825 == null) {
            this.field2825 = (String[][]) null;
        } else {
            this.field2825 = new String[5][];
            System.arraycopy(arg1.field2825, 0, this.field2825, 0, 4);
        }
        this.field2810 = 0;
    }

    @ObfuscatedName("km.ac(Lkm;Lkm;B)V")
    public void method4769(class262 arg0, class262 arg1) {
        this.field2795 = arg0.field2795;
        this.field2802 = arg0.field2802;
        this.field2803 = arg0.field2803;
        this.field2809 = arg0.field2809;
        this.field2827 = arg0.field2827;
        this.field2806 = arg0.field2806;
        this.field2807 = arg0.field2807;
        this.field2786 = arg0.field2786;
        this.field2813 = arg0.field2813;
        this.field2800 = arg0.field2800;
        this.field2801 = arg0.field2801;
        this.field2847 = arg0.field2847;
        this.field2796 = arg1.field2796;
        this.field2797 = arg1.field2797;
        this.field2810 = 0;
        this.field2814 = false;
        this.field2843 = false;
    }

    @ObfuscatedName("km.ae(II)Lgm;")
    public final class176 method4770(int arg0) {
        if (this.field2841 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2819[var3] && this.field2819[var3] != 0) {
                    var2 = this.field2841[var3];
                }
            }
            if (var2 != -1) {
                return method2385(var2).method4770(1);
            }
        }
        class176 var4 = class176.method3343(Statics.field2789, this.field2795, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2835 != 128 || this.field2798 != 128 || this.field2837 != 128) {
            var4.method3370(this.field2835, this.field2798, this.field2837);
        }
        if (this.field2786 != null) {
            for (int var5 = 0; var5 < this.field2786.length; var5++) {
                var4.method3350(this.field2786[var5], this.field2813[var5]);
            }
        }
        if (this.field2800 != null) {
            for (int var6 = 0; var6 < this.field2800.length; var6++) {
                var4.method3360(this.field2800[var6], this.field2801[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("km.ad(IB)Lhr;")
    public final class197 method4771(int arg0) {
        if (this.field2841 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2819[var3] && this.field2819[var3] != 0) {
                    var2 = this.field2841[var3];
                }
            }
            if (var2 != -1) {
                return method2385(var2).method4771(1);
            }
        }
        class197 var4 = (class197) field2792.method5586((long) this.field2794);
        if (var4 != null) {
            return var4;
        }
        class176 var5 = class176.method3343(Statics.field2789, this.field2795, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2835 != 128 || this.field2798 != 128 || this.field2837 != 128) {
            var5.method3370(this.field2835, this.field2798, this.field2837);
        }
        if (this.field2786 != null) {
            for (int var6 = 0; var6 < this.field2786.length; var6++) {
                var5.method3350(this.field2786[var6], this.field2813[var6]);
            }
        }
        if (this.field2800 != null) {
            for (int var7 = 0; var7 < this.field2800.length; var7++) {
                var5.method3360(this.field2800[var7], this.field2801[var7]);
            }
        }
        class197 var8 = var5.method3424(this.field2838 + 64, this.field2839 + 768, -50, -10, -50);
        var8.field2152 = true;
        field2792.method5589(var8, (long) this.field2794);
        return var8;
    }

    @ObfuscatedName("km.aq(II)Lkm;")
    public class262 method4772(int arg0) {
        if (this.field2841 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2819[var3] && this.field2819[var3] != 0) {
                    var2 = this.field2841[var3];
                }
            }
            if (var2 != -1) {
                return method2385(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("oc.al(IIIIIZI)Lvc;")
    public static final class563 method6549(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class563 var8 = (class563) field2793.method5586(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class262 var9 = method2385(arg0);
        if (arg1 > 1 && var9.field2841 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2819[var11] && var9.field2819[var11] != 0) {
                    var10 = var9.field2841[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2385(var10);
            }
        }
        class197 var12 = var9.method4771(1);
        if (var12 == null) {
            return null;
        }
        class563 var13 = null;
        if (var9.field2811 != -1) {
            var13 = method6549(var9.field2824, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2845 != -1) {
            var13 = method6549(var9.field2833, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2805 != -1) {
            var13 = method6549(var9.field2846, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5453;
        int var15 = Statics.field5448;
        int var16 = Statics.field5452;
        float[] var17 = Statics.field5450;
        int[] var18 = new int[4];
        class559.method9143(var18);
        class563 var19 = new class563(36, 32);
        class181.method3449(var19.field5481, 36, 32, (float[]) null);
        class559.method9196();
        class181.method3483();
        class181.method3453(16, 16);
        class181.field1943.field2259 = false;
        if (var9.field2805 != -1) {
            var13.method9284(0, 0);
        }
        int var20 = var9.field2802;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class181.field1941[var9.field2803] * var20 >> 16;
        int var22 = class181.field1942[var9.field2803] * var20 >> 16;
        var12.method3909();
        var12.method3929(0, var9.field2809, var9.field2827, var9.field2803, var9.field2806, var9.field2807 + var12.field2086 / 2 + var21, var9.field2807 + var22);
        if (var9.field2845 != -1) {
            var13.method9284(0, 0);
        }
        if (arg2 >= 1) {
            var19.method9251(1);
        }
        if (arg2 >= 2) {
            var19.method9251(16777215);
        }
        if (arg3 != 0) {
            var19.method9252(arg3);
        }
        class181.method3449(var19.field5481, 36, 32, (float[]) null);
        if (var9.field2811 != -1) {
            var13.method9284(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2847 == 1) {
            Statics.field5134.method7565(method3082(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2793.method5589(var19, var6);
        }
        class181.method3449(var14, var15, var16, var17);
        class559.method9178(var18);
        class181.method3483();
        class181.field1943.field2259 = true;
        return var19;
    }

    @ObfuscatedName("fb.aj(II)Ljava/lang/String;")
    public static final String method3082(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class380.field4113 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class380.field4267 + "</col>";
        }
    }

    @ObfuscatedName("km.as(II)Z")
    public final boolean method4773(int arg0) {
        int var2 = this.field2817;
        int var3 = this.field2820;
        int var4 = this.field2829;
        if (arg0 == 1) {
            var2 = this.field2822;
            var3 = this.field2823;
            var4 = this.field2826;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2789.method6656(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2789.method6656(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2789.method6656(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("km.aw(IB)Lgm;")
    public final class176 method4774(int arg0) {
        int var2 = this.field2817;
        int var3 = this.field2820;
        int var4 = this.field2829;
        if (arg0 == 1) {
            var2 = this.field2822;
            var3 = this.field2823;
            var4 = this.field2826;
        }
        if (var2 == -1) {
            return null;
        }
        class176 var5 = class176.method3343(Statics.field2789, var2, 0);
        if (var3 != -1) {
            class176 var6 = class176.method3343(Statics.field2789, var3, 0);
            if (var4 == -1) {
                class176[] var9 = new class176[] { var5, var6 };
                var5 = new class176(var9, 2);
            } else {
                class176 var7 = class176.method3343(Statics.field2789, var4, 0);
                class176[] var8 = new class176[] { var5, var6, var7 };
                var5 = new class176(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2821 != 0) {
            var5.method3405(0, this.field2821, 0);
        }
        if (arg0 == 1 && this.field2804 != 0) {
            var5.method3405(0, this.field2804, 0);
        }
        if (this.field2786 != null) {
            for (int var10 = 0; var10 < this.field2786.length; var10++) {
                var5.method3350(this.field2786[var10], this.field2813[var10]);
            }
        }
        if (this.field2800 != null) {
            for (int var11 = 0; var11 < this.field2800.length; var11++) {
                var5.method3360(this.field2800[var11], this.field2801[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("km.af(IB)Z")
    public final boolean method4827(int arg0) {
        int var2 = this.field2834;
        int var3 = this.field2828;
        if (arg0 == 1) {
            var2 = this.field2844;
            var3 = this.field2830;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2789.method6656(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2789.method6656(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("km.aa(II)Lgm;")
    public final class176 method4776(int arg0) {
        int var2 = this.field2834;
        int var3 = this.field2828;
        if (arg0 == 1) {
            var2 = this.field2844;
            var3 = this.field2830;
        }
        if (var2 == -1) {
            return null;
        }
        class176 var4 = class176.method3343(Statics.field2789, var2, 0);
        if (var3 != -1) {
            class176 var5 = class176.method3343(Statics.field2789, var3, 0);
            class176[] var6 = new class176[] { var4, var5 };
            var4 = new class176(var6, 2);
        }
        if (this.field2786 != null) {
            for (int var7 = 0; var7 < this.field2786.length; var7++) {
                var4.method3350(this.field2786[var7], this.field2813[var7]);
            }
        }
        if (this.field2800 != null) {
            for (int var8 = 0; var8 < this.field2800.length; var8++) {
                var4.method3360(this.field2800[var8], this.field2801[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("km.ah(III)I")
    public int method4777(int arg0, int arg1) {
        class521 var3 = this.field2842;
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

    @ObfuscatedName("km.ag(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4778(int arg0, String arg1) {
        return class239.method6634(this.field2842, arg0, arg1);
    }

    @ObfuscatedName("km.av(I)I")
    public int method4803() {
        if (this.field2818 == -1 || this.field2816 == null) {
            return -1;
        } else if (this.field2818 >= 0) {
            return this.field2816[this.field2818] == null ? -1 : this.field2818;
        } else if (class380.field4091.equalsIgnoreCase(this.field2816[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("eh.ar(ZB)V")
    public static void method2730(boolean arg0) {
        if (Statics.field2543 != arg0) {
            field2785.method5588();
            field2792.method5588();
            field2793.method5588();
            Statics.field2543 = arg0;
        }
    }

    @ObfuscatedName("km.ap(B)Z")
    public boolean method4822() {
        return this.field2813 != null;
    }

    @ObfuscatedName("km.ak(I)Z")
    public boolean method4808() {
        return this.field2801 != null;
    }
}
