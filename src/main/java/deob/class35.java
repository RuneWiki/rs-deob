package deob;

@ObfuscatedName("au")
public abstract class class35 extends class80 {

    @ObfuscatedName("au.p")
    public int field777;

    @ObfuscatedName("au.t")
    public int field757;

    @ObfuscatedName("au.x")
    public int field768;

    @ObfuscatedName("au.d")
    public boolean field780 = false;

    @ObfuscatedName("au.j")
    public int field760 = 1;

    @ObfuscatedName("au.r")
    public int field761 = -1;

    @ObfuscatedName("au.at")
    public int field762 = -1;

    @ObfuscatedName("au.av")
    public int field815 = -1;

    @ObfuscatedName("au.ar")
    public int field764 = -1;

    @ObfuscatedName("au.aq")
    public int field765 = -1;

    @ObfuscatedName("au.as")
    public int field812 = -1;

    @ObfuscatedName("au.ad")
    public int field805 = -1;

    @ObfuscatedName("au.ap")
    public int field804 = -1;

    @ObfuscatedName("au.an")
    public String field769 = null;

    @ObfuscatedName("au.au")
    public boolean field770;

    @ObfuscatedName("au.aw")
    public boolean field771 = false;

    @ObfuscatedName("au.ag")
    public int field781 = 100;

    @ObfuscatedName("au.ah")
    public int field773 = 0;

    @ObfuscatedName("au.ao")
    public int field774 = 0;

    @ObfuscatedName("au.af")
    public int[] field775 = new int[4];

    @ObfuscatedName("au.ab")
    public int[] field776 = new int[4];

    @ObfuscatedName("au.ai")
    public int[] field758 = new int[4];

    @ObfuscatedName("au.ay")
    public int field778 = -1000;

    @ObfuscatedName("au.ak")
    public int field779;

    @ObfuscatedName("au.aj")
    public int field790;

    @ObfuscatedName("au.az")
    public int field789 = -1;

    @ObfuscatedName("au.am")
    public int field782 = 0;

    @ObfuscatedName("au.ax")
    public int field783 = 0;

    @ObfuscatedName("au.al")
    public int field799 = -1;

    @ObfuscatedName("au.aa")
    public int field784 = 0;

    @ObfuscatedName("au.ae")
    public int field786 = 0;

    @ObfuscatedName("au.bj")
    public int field787 = -1;

    @ObfuscatedName("au.bg")
    public int field788 = 0;

    @ObfuscatedName("au.bw")
    public int field793 = 0;

    @ObfuscatedName("au.bi")
    public int field792 = 0;

    @ObfuscatedName("au.bh")
    public int field791 = 0;

    @ObfuscatedName("au.bb")
    public int field767 = -1;

    @ObfuscatedName("au.bt")
    public int field759 = 0;

    @ObfuscatedName("au.bu")
    public int field794 = 0;

    @ObfuscatedName("au.bc")
    public int field795;

    @ObfuscatedName("au.ba")
    public int field756;

    @ObfuscatedName("au.bd")
    public int field797;

    @ObfuscatedName("au.bn")
    public int field798;

    @ObfuscatedName("au.bm")
    public int field816;

    @ObfuscatedName("au.bp")
    public int field800;

    @ObfuscatedName("au.bq")
    public int field801;

    @ObfuscatedName("au.bf")
    public int field802;

    @ObfuscatedName("au.be")
    public int field803;

    @ObfuscatedName("au.bo")
    public int field796 = 0;

    @ObfuscatedName("au.bv")
    public int field772 = 200;

    @ObfuscatedName("au.bx")
    public int field806;

    @ObfuscatedName("au.bs")
    public int field807 = 0;

    @ObfuscatedName("au.bl")
    public int field785 = 32;

    @ObfuscatedName("au.bz")
    public int field809 = 0;

    @ObfuscatedName("au.bk")
    public int[] field810 = new int[10];

    @ObfuscatedName("au.br")
    public int[] field811 = new int[10];

    @ObfuscatedName("au.by")
    public boolean[] field763 = new boolean[10];

    @ObfuscatedName("au.cd")
    public int field766 = 0;

    @ObfuscatedName("au.cu")
    public int field814 = 0;

    @ObfuscatedName("au.s(IIZB)V")
    public final void method621(int arg0, int arg1, boolean arg2) {
        if (this.field787 != -1 && class40.method122(this.field787).field942 == 1) {
            this.field787 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field810[0];
            int var5 = arg1 - this.field811[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field809 < 9) {
                    this.field809++;
                }
                for (int var6 = this.field809; var6 > 0; var6--) {
                    this.field810[var6] = this.field810[var6 - 1];
                    this.field811[var6] = this.field811[var6 - 1];
                    this.field763[var6] = this.field763[var6 - 1];
                }
                this.field810[0] = arg0;
                this.field811[0] = arg1;
                this.field763[0] = false;
                return;
            }
        }
        this.field809 = 0;
        this.field814 = 0;
        this.field766 = 0;
        this.field810[0] = arg0;
        this.field811[0] = arg1;
        this.field777 = this.field810[0] * 128 + this.field760 * 64;
        this.field757 = this.field811[0] * 128 + this.field760 * 64;
    }

    @ObfuscatedName("au.m(IZB)V")
    public final void method622(int arg0, boolean arg1) {
        int var3 = this.field810[0];
        int var4 = this.field811[0];
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
        if (this.field787 != -1 && class40.method122(this.field787).field942 == 1) {
            this.field787 = -1;
        }
        if (this.field809 < 9) {
            this.field809++;
        }
        for (int var5 = this.field809; var5 > 0; var5--) {
            this.field810[var5] = this.field810[var5 - 1];
            this.field811[var5] = this.field811[var5 - 1];
            this.field763[var5] = this.field763[var5 - 1];
        }
        this.field810[0] = var3;
        this.field811[0] = var4;
        this.field763[0] = arg1;
    }

    @ObfuscatedName("au.y(I)V")
    public final void method623() {
        this.field809 = 0;
        this.field814 = 0;
    }

    @ObfuscatedName("au.i(I)Z")
    public boolean method13() {
        return false;
    }

    @ObfuscatedName("au.b(IIII)V")
    public final void method628(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field758[var4] <= arg2) {
                this.field775[var4] = arg0;
                this.field776[var4] = arg1;
                this.field758[var4] = arg2 + 70;
                return;
            }
        }
    }
}
