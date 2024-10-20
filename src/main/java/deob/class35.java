package deob;

@ObfuscatedName("al")
public abstract class class35 extends class80 {

    @ObfuscatedName("al.d")
    public int field789;

    @ObfuscatedName("al.j")
    public int field773;

    @ObfuscatedName("al.k")
    public int field774;

    @ObfuscatedName("al.y")
    public boolean field775 = false;

    @ObfuscatedName("al.c")
    public int field776 = 1;

    @ObfuscatedName("al.g")
    public int field777 = -1;

    @ObfuscatedName("al.av")
    public int field778 = -1;

    @ObfuscatedName("al.ag")
    public int field819 = -1;

    @ObfuscatedName("al.aq")
    public int field792 = -1;

    @ObfuscatedName("al.an")
    public int field788 = -1;

    @ObfuscatedName("al.ao")
    public int field782 = -1;

    @ObfuscatedName("al.aj")
    public int field832 = -1;

    @ObfuscatedName("al.ax")
    public int field784 = -1;

    @ObfuscatedName("al.ac")
    public String field791 = null;

    @ObfuscatedName("al.al")
    public boolean field786;

    @ObfuscatedName("al.au")
    public boolean field787 = false;

    @ObfuscatedName("al.ap")
    public int field779 = 100;

    @ObfuscatedName("al.ar")
    public int field781 = 0;

    @ObfuscatedName("al.ah")
    public int field790 = 0;

    @ObfuscatedName("al.ay")
    public int[] field823 = new int[4];

    @ObfuscatedName("al.ab")
    public int[] field801 = new int[4];

    @ObfuscatedName("al.at")
    public int[] field833 = new int[4];

    @ObfuscatedName("al.as")
    public int field795 = -1000;

    @ObfuscatedName("al.af")
    public int field796;

    @ObfuscatedName("al.aa")
    public int field797;

    @ObfuscatedName("al.ad")
    public int field798 = -1;

    @ObfuscatedName("al.ai")
    public int field799 = 0;

    @ObfuscatedName("al.aw")
    public int field800 = 0;

    @ObfuscatedName("al.ak")
    public int field824 = -1;

    @ObfuscatedName("al.az")
    public int field802 = 0;

    @ObfuscatedName("al.am")
    public int field803 = 0;

    @ObfuscatedName("al.bj")
    public int field804 = -1;

    @ObfuscatedName("al.bf")
    public int field805 = 0;

    @ObfuscatedName("al.bb")
    public int field806 = 0;

    @ObfuscatedName("al.bv")
    public int field785 = 0;

    @ObfuscatedName("al.bl")
    public int field783 = 0;

    @ObfuscatedName("al.bu")
    public int field809 = -1;

    @ObfuscatedName("al.bm")
    public int field810 = 0;

    @ObfuscatedName("al.bo")
    public int field811 = 0;

    @ObfuscatedName("al.ba")
    public int field812;

    @ObfuscatedName("al.by")
    public int field813;

    @ObfuscatedName("al.bt")
    public int field814;

    @ObfuscatedName("al.bp")
    public int field815;

    @ObfuscatedName("al.bs")
    public int field816;

    @ObfuscatedName("al.bg")
    public int field817;

    @ObfuscatedName("al.bk")
    public int field808;

    @ObfuscatedName("al.bq")
    public int field807;

    @ObfuscatedName("al.bh")
    public int field820;

    @ObfuscatedName("al.bi")
    public int field821 = 0;

    @ObfuscatedName("al.br")
    public int field822 = 200;

    @ObfuscatedName("al.bx")
    public int field780;

    @ObfuscatedName("al.be")
    public int field772 = 0;

    @ObfuscatedName("al.bd")
    public int field825 = 32;

    @ObfuscatedName("al.bw")
    public int field826 = 0;

    @ObfuscatedName("al.bc")
    public int[] field828 = new int[10];

    @ObfuscatedName("al.bz")
    public int[] field827 = new int[10];

    @ObfuscatedName("al.bn")
    public boolean[] field829 = new boolean[10];

    @ObfuscatedName("al.cy")
    public int field830 = 0;

    @ObfuscatedName("al.cn")
    public int field831 = 0;

    @ObfuscatedName("al.i(IIZB)V")
    public final void method641(int arg0, int arg1, boolean arg2) {
        if (this.field804 != -1 && Statics.method860(this.field804).field961 == 1) {
            this.field804 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field828[0];
            int var5 = arg1 - this.field827[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field826 < 9) {
                    this.field826++;
                }
                for (int var6 = this.field826; var6 > 0; var6--) {
                    this.field828[var6] = this.field828[var6 - 1];
                    this.field827[var6] = this.field827[var6 - 1];
                    this.field829[var6] = this.field829[var6 - 1];
                }
                this.field828[0] = arg0;
                this.field827[0] = arg1;
                this.field829[0] = false;
                return;
            }
        }
        this.field826 = 0;
        this.field831 = 0;
        this.field830 = 0;
        this.field828[0] = arg0;
        this.field827[0] = arg1;
        this.field789 = this.field828[0] * 128 + this.field776 * 64;
        this.field773 = this.field827[0] * 128 + this.field776 * 64;
    }

    @ObfuscatedName("al.r(IZI)V")
    public final void method642(int arg0, boolean arg1) {
        int var3 = this.field828[0];
        int var4 = this.field827[0];
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
        if (this.field804 != -1 && Statics.method860(this.field804).field961 == 1) {
            this.field804 = -1;
        }
        if (this.field826 < 9) {
            this.field826++;
        }
        for (int var5 = this.field826; var5 > 0; var5--) {
            this.field828[var5] = this.field828[var5 - 1];
            this.field827[var5] = this.field827[var5 - 1];
            this.field829[var5] = this.field829[var5 - 1];
        }
        this.field828[0] = var3;
        this.field827[0] = var4;
        this.field829[0] = arg1;
    }

    @ObfuscatedName("al.l(I)V")
    public final void method659() {
        this.field826 = 0;
        this.field831 = 0;
    }

    @ObfuscatedName("al.a(I)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("al.f(IIIB)V")
    public final void method647(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field833[var4] <= arg2) {
                this.field823[var4] = arg0;
                this.field801[var4] = arg1;
                this.field833[var4] = arg2 + 70;
                return;
            }
        }
    }
}
