package deob;

@ObfuscatedName("am")
public abstract class class35 extends class80 {

    @ObfuscatedName("am.y")
    public int field830;

    @ObfuscatedName("am.z")
    public int field828;

    @ObfuscatedName("am.u")
    public int field789;

    @ObfuscatedName("am.w")
    public boolean field782 = false;

    @ObfuscatedName("am.d")
    public int field783 = 1;

    @ObfuscatedName("am.l")
    public int field784 = -1;

    @ObfuscatedName("am.aj")
    public int field779 = -1;

    @ObfuscatedName("am.aq")
    public int field786 = -1;

    @ObfuscatedName("am.al")
    public int field787 = -1;

    @ObfuscatedName("am.az")
    public int field796 = -1;

    @ObfuscatedName("am.ah")
    public int field785 = -1;

    @ObfuscatedName("am.ag")
    public int field788 = -1;

    @ObfuscatedName("am.ad")
    public int field791 = -1;

    @ObfuscatedName("am.ao")
    public String field836 = null;

    @ObfuscatedName("am.am")
    public boolean field793;

    @ObfuscatedName("am.ax")
    public boolean field792 = false;

    @ObfuscatedName("am.at")
    public int field795 = 100;

    @ObfuscatedName("am.ar")
    public int field838 = 0;

    @ObfuscatedName("am.ai")
    public int field797 = 0;

    @ObfuscatedName("am.ak")
    public int[] field798 = new int[4];

    @ObfuscatedName("am.an")
    public int[] field835 = new int[4];

    @ObfuscatedName("am.av")
    public int[] field800 = new int[4];

    @ObfuscatedName("am.af")
    public int field801 = -1000;

    @ObfuscatedName("am.ae")
    public int field802;

    @ObfuscatedName("am.au")
    public int field803;

    @ObfuscatedName("am.aa")
    public int field804 = -1;

    @ObfuscatedName("am.ay")
    public int field805 = 0;

    @ObfuscatedName("am.ac")
    public int field822 = 0;

    @ObfuscatedName("am.ab")
    public int field807 = -1;

    @ObfuscatedName("am.ap")
    public int field808 = 0;

    @ObfuscatedName("am.as")
    public int field809 = 0;

    @ObfuscatedName("am.bi")
    public int field810 = -1;

    @ObfuscatedName("am.bv")
    public int field811 = 0;

    @ObfuscatedName("am.bl")
    public int field812 = 0;

    @ObfuscatedName("am.by")
    public int field813 = 0;

    @ObfuscatedName("am.bm")
    public int field814 = 0;

    @ObfuscatedName("am.br")
    public int field815 = -1;

    @ObfuscatedName("am.bo")
    public int field834 = 0;

    @ObfuscatedName("am.bt")
    public int field817 = 0;

    @ObfuscatedName("am.be")
    public int field818;

    @ObfuscatedName("am.bh")
    public int field806;

    @ObfuscatedName("am.bb")
    public int field820;

    @ObfuscatedName("am.bd")
    public int field821;

    @ObfuscatedName("am.bc")
    public int field819;

    @ObfuscatedName("am.bx")
    public int field816;

    @ObfuscatedName("am.bs")
    public int field824;

    @ObfuscatedName("am.bg")
    public int field825;

    @ObfuscatedName("am.bf")
    public int field826;

    @ObfuscatedName("am.bw")
    public int field827 = 0;

    @ObfuscatedName("am.bq")
    public int field781 = 200;

    @ObfuscatedName("am.bz")
    public int field790;

    @ObfuscatedName("am.bp")
    public int field780 = 0;

    @ObfuscatedName("am.ba")
    public int field829 = 32;

    @ObfuscatedName("am.bn")
    public int field832 = 0;

    @ObfuscatedName("am.bj")
    public int[] field833 = new int[10];

    @ObfuscatedName("am.bk")
    public int[] field794 = new int[10];

    @ObfuscatedName("am.bu")
    public boolean[] field831 = new boolean[10];

    @ObfuscatedName("am.ce")
    public int field823 = 0;

    @ObfuscatedName("am.cj")
    public int field837 = 0;

    @ObfuscatedName("am.t(IIZI)V")
    public final void method634(int arg0, int arg1, boolean arg2) {
        if (this.field810 != -1 && class40.method2146(this.field810).field971 == 1) {
            this.field810 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field833[0];
            int var5 = arg1 - this.field794[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field832 < 9) {
                    this.field832++;
                }
                for (int var6 = this.field832; var6 > 0; var6--) {
                    this.field833[var6] = this.field833[var6 - 1];
                    this.field794[var6] = this.field794[var6 - 1];
                    this.field831[var6] = this.field831[var6 - 1];
                }
                this.field833[0] = arg0;
                this.field794[0] = arg1;
                this.field831[0] = false;
                return;
            }
        }
        this.field832 = 0;
        this.field837 = 0;
        this.field823 = 0;
        this.field833[0] = arg0;
        this.field794[0] = arg1;
        this.field830 = this.field833[0] * 128 + this.field783 * 64;
        this.field828 = this.field794[0] * 128 + this.field783 * 64;
    }

    @ObfuscatedName("am.i(IZI)V")
    public final void method635(int arg0, boolean arg1) {
        int var3 = this.field833[0];
        int var4 = this.field794[0];
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
        if (this.field810 != -1 && class40.method2146(this.field810).field971 == 1) {
            this.field810 = -1;
        }
        if (this.field832 < 9) {
            this.field832++;
        }
        for (int var5 = this.field832; var5 > 0; var5--) {
            this.field833[var5] = this.field833[var5 - 1];
            this.field794[var5] = this.field794[var5 - 1];
            this.field831[var5] = this.field831[var5 - 1];
        }
        this.field833[0] = var3;
        this.field794[0] = var4;
        this.field831[0] = arg1;
    }

    @ObfuscatedName("am.c(I)V")
    public final void method643() {
        this.field832 = 0;
        this.field837 = 0;
    }

    @ObfuscatedName("am.a(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("am.k(IIIB)V")
    public final void method637(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field800[var4] <= arg2) {
                this.field798[var4] = arg0;
                this.field835[var4] = arg1;
                this.field800[var4] = arg2 + 70;
                return;
            }
        }
    }
}
