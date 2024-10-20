package deob;

@ObfuscatedName("av")
public abstract class class36 extends class83 {

    @ObfuscatedName("av.p")
    public int field814;

    @ObfuscatedName("av.c")
    public int field821;

    @ObfuscatedName("av.x")
    public int field795;

    @ObfuscatedName("av.q")
    public boolean field833 = false;

    @ObfuscatedName("av.b")
    public int field797 = 1;

    @ObfuscatedName("av.k")
    public int field844 = -1;

    @ObfuscatedName("av.at")
    public int field799 = -1;

    @ObfuscatedName("av.au")
    public int field800 = -1;

    @ObfuscatedName("av.aa")
    public int field837 = -1;

    @ObfuscatedName("av.ak")
    public int field802 = -1;

    @ObfuscatedName("av.an")
    public int field803 = -1;

    @ObfuscatedName("av.ad")
    public int field804 = -1;

    @ObfuscatedName("av.ap")
    public int field805 = -1;

    @ObfuscatedName("av.ag")
    public String field806 = null;

    @ObfuscatedName("av.aj")
    public boolean field793;

    @ObfuscatedName("av.av")
    public boolean field808 = false;

    @ObfuscatedName("av.ar")
    public int field809 = 100;

    @ObfuscatedName("av.ab")
    public int field810 = 0;

    @ObfuscatedName("av.ai")
    public int field820 = 0;

    @ObfuscatedName("av.ax")
    public int[] field852 = new int[4];

    @ObfuscatedName("av.aw")
    public int[] field813 = new int[4];

    @ObfuscatedName("av.ac")
    public int[] field812 = new int[4];

    @ObfuscatedName("av.al")
    public int field815 = -1000;

    @ObfuscatedName("av.az")
    public int field816;

    @ObfuscatedName("av.as")
    public int field817;

    @ObfuscatedName("av.am")
    public int field818 = -1;

    @ObfuscatedName("av.ay")
    public int field794 = 0;

    @ObfuscatedName("av.ao")
    public int field853 = 0;

    @ObfuscatedName("av.aq")
    public int field798 = -1;

    @ObfuscatedName("av.af")
    public int field819 = 0;

    @ObfuscatedName("av.ah")
    public int field823 = 0;

    @ObfuscatedName("av.bz")
    public int field824 = -1;

    @ObfuscatedName("av.bw")
    public int field825 = 0;

    @ObfuscatedName("av.bd")
    public int field811 = 0;

    @ObfuscatedName("av.bs")
    public int field796 = 0;

    @ObfuscatedName("av.bj")
    public int field828 = 0;

    @ObfuscatedName("av.bf")
    public int field835 = -1;

    @ObfuscatedName("av.bo")
    public int field830 = 0;

    @ObfuscatedName("av.bi")
    public int field831 = 0;

    @ObfuscatedName("av.bv")
    public int field832;

    @ObfuscatedName("av.bp")
    public int field801;

    @ObfuscatedName("av.bm")
    public int field834;

    @ObfuscatedName("av.br")
    public int field845;

    @ObfuscatedName("av.bx")
    public int field836;

    @ObfuscatedName("av.bg")
    public int field827;

    @ObfuscatedName("av.bn")
    public int field838;

    @ObfuscatedName("av.bb")
    public int field839;

    @ObfuscatedName("av.bu")
    public int field840;

    @ObfuscatedName("av.by")
    public int field841 = 0;

    @ObfuscatedName("av.bt")
    public int field842 = 200;

    @ObfuscatedName("av.ba")
    public int field843;

    @ObfuscatedName("av.bq")
    public int field829 = 0;

    @ObfuscatedName("av.bk")
    public int field849 = 32;

    @ObfuscatedName("av.bc")
    public int field846 = 0;

    @ObfuscatedName("av.be")
    public int[] field847 = new int[10];

    @ObfuscatedName("av.bh")
    public int[] field848 = new int[10];

    @ObfuscatedName("av.bl")
    public boolean[] field826 = new boolean[10];

    @ObfuscatedName("av.cb")
    public int field850 = 0;

    @ObfuscatedName("av.cl")
    public int field851 = 0;

    @ObfuscatedName("av.m(IIZI)V")
    public final void method716(int arg0, int arg1, boolean arg2) {
        if (this.field824 != -1 && class41.method1016(this.field824).field974 == 1) {
            this.field824 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field847[0];
            int var5 = arg1 - this.field848[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field846 < 9) {
                    this.field846++;
                }
                for (int var6 = this.field846; var6 > 0; var6--) {
                    this.field847[var6] = this.field847[var6 - 1];
                    this.field848[var6] = this.field848[var6 - 1];
                    this.field826[var6] = this.field826[var6 - 1];
                }
                this.field847[0] = arg0;
                this.field848[0] = arg1;
                this.field826[0] = false;
                return;
            }
        }
        this.field846 = 0;
        this.field851 = 0;
        this.field850 = 0;
        this.field847[0] = arg0;
        this.field848[0] = arg1;
        this.field814 = this.field847[0] * 128 + this.field797 * 64;
        this.field821 = this.field848[0] * 128 + this.field797 * 64;
    }

    @ObfuscatedName("av.e(IZI)V")
    public final void method715(int arg0, boolean arg1) {
        int var3 = this.field847[0];
        int var4 = this.field848[0];
        if (arg0 == 0) {
            var3--;
            var4++;
        }
        if (arg0 == 1) {
            var4++;
        }
        if (arg0 == 2) {
            var3++;
            var4++;
        }
        if (arg0 == 3) {
            var3--;
        }
        if (arg0 == 4) {
            var3++;
        }
        if (arg0 == 5) {
            var3--;
            var4--;
        }
        if (arg0 == 6) {
            var4--;
        }
        if (arg0 == 7) {
            var3++;
            var4--;
        }
        if (this.field824 != -1 && class41.method1016(this.field824).field974 == 1) {
            this.field824 = -1;
        }
        if (this.field846 < 9) {
            this.field846++;
        }
        for (int var5 = this.field846; var5 > 0; var5--) {
            this.field847[var5] = this.field847[var5 - 1];
            this.field848[var5] = this.field848[var5 - 1];
            this.field826[var5] = this.field826[var5 - 1];
        }
        this.field847[0] = var3;
        this.field848[0] = var4;
        this.field826[0] = arg1;
    }

    @ObfuscatedName("av.v(I)V")
    public final void method713() {
        this.field846 = 0;
        this.field851 = 0;
    }

    @ObfuscatedName("av.z(I)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("av.r(IIII)V")
    public final void method719(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field812[var4] <= arg2) {
                this.field852[var4] = arg0;
                this.field813[var4] = arg1;
                this.field812[var4] = arg2 + 70;
                return;
            }
        }
    }
}
