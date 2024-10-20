package deob;

@ObfuscatedName("ao")
public abstract class class35 extends class80 {

    @ObfuscatedName("ao.p")
    public int field809;

    @ObfuscatedName("ao.o")
    public int field749;

    @ObfuscatedName("ao.b")
    public int field750;

    @ObfuscatedName("ao.t")
    public boolean field800 = false;

    @ObfuscatedName("ao.w")
    public int field752 = 1;

    @ObfuscatedName("ao.i")
    public int field753 = -1;

    @ObfuscatedName("ao.ad")
    public int field754 = -1;

    @ObfuscatedName("ao.ak")
    public int field755 = -1;

    @ObfuscatedName("ao.ae")
    public int field756 = -1;

    @ObfuscatedName("ao.ax")
    public int field757 = -1;

    @ObfuscatedName("ao.al")
    public int field774 = -1;

    @ObfuscatedName("ao.ar")
    public int field792 = -1;

    @ObfuscatedName("ao.as")
    public int field775 = -1;

    @ObfuscatedName("ao.ab")
    public String field798 = null;

    @ObfuscatedName("ao.ao")
    public boolean field762;

    @ObfuscatedName("ao.ac")
    public boolean field763 = false;

    @ObfuscatedName("ao.az")
    public int field764 = 100;

    @ObfuscatedName("ao.at")
    public int field765 = 0;

    @ObfuscatedName("ao.aa")
    public int field766 = 0;

    @ObfuscatedName("ao.aw")
    public int[] field767 = new int[4];

    @ObfuscatedName("ao.ai")
    public int[] field768 = new int[4];

    @ObfuscatedName("ao.ah")
    public int[] field769 = new int[4];

    @ObfuscatedName("ao.aq")
    public int field770 = -1000;

    @ObfuscatedName("ao.ay")
    public int field771;

    @ObfuscatedName("ao.am")
    public int field758;

    @ObfuscatedName("ao.aj")
    public int field773 = -1;

    @ObfuscatedName("ao.ag")
    public int field760 = 0;

    @ObfuscatedName("ao.ap")
    public int field761 = 0;

    @ObfuscatedName("ao.af")
    public int field759 = -1;

    @ObfuscatedName("ao.au")
    public int field777 = 0;

    @ObfuscatedName("ao.av")
    public int field804 = 0;

    @ObfuscatedName("ao.bs")
    public int field779 = -1;

    @ObfuscatedName("ao.bo")
    public int field780 = 0;

    @ObfuscatedName("ao.bw")
    public int field781 = 0;

    @ObfuscatedName("ao.bm")
    public int field785 = 0;

    @ObfuscatedName("ao.bj")
    public int field783 = 0;

    @ObfuscatedName("ao.ba")
    public int field784 = -1;

    @ObfuscatedName("ao.br")
    public int field772 = 0;

    @ObfuscatedName("ao.bd")
    public int field797 = 0;

    @ObfuscatedName("ao.bn")
    public int field787;

    @ObfuscatedName("ao.bu")
    public int field788;

    @ObfuscatedName("ao.bq")
    public int field789;

    @ObfuscatedName("ao.bp")
    public int field790;

    @ObfuscatedName("ao.bt")
    public int field791;

    @ObfuscatedName("ao.bz")
    public int field786;

    @ObfuscatedName("ao.by")
    public int field793;

    @ObfuscatedName("ao.bg")
    public int field794;

    @ObfuscatedName("ao.bv")
    public int field795;

    @ObfuscatedName("ao.bh")
    public int field796 = 0;

    @ObfuscatedName("ao.bf")
    public int field748 = 200;

    @ObfuscatedName("ao.bk")
    public int field776;

    @ObfuscatedName("ao.bi")
    public int field799 = 0;

    @ObfuscatedName("ao.bx")
    public int field782 = 32;

    @ObfuscatedName("ao.bc")
    public int field801 = 0;

    @ObfuscatedName("ao.be")
    public int[] field751 = new int[10];

    @ObfuscatedName("ao.bb")
    public int[] field803 = new int[10];

    @ObfuscatedName("ao.bl")
    public boolean[] field778 = new boolean[10];

    @ObfuscatedName("ao.cj")
    public int field805 = 0;

    @ObfuscatedName("ao.cb")
    public int field806 = 0;

    @ObfuscatedName("ao.h(IIZI)V")
    public final void method661(int arg0, int arg1, boolean arg2) {
        if (this.field779 != -1 && class40.method3092(this.field779).field944 == 1) {
            this.field779 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field751[0];
            int var5 = arg1 - this.field803[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field801 < 9) {
                    this.field801++;
                }
                for (int var6 = this.field801; var6 > 0; var6--) {
                    this.field751[var6] = this.field751[var6 - 1];
                    this.field803[var6] = this.field803[var6 - 1];
                    this.field778[var6] = this.field778[var6 - 1];
                }
                this.field751[0] = arg0;
                this.field803[0] = arg1;
                this.field778[0] = false;
                return;
            }
        }
        this.field801 = 0;
        this.field806 = 0;
        this.field805 = 0;
        this.field751[0] = arg0;
        this.field803[0] = arg1;
        this.field809 = this.field751[0] * 128 + this.field752 * 64;
        this.field749 = this.field803[0] * 128 + this.field752 * 64;
    }

    @ObfuscatedName("ao.l(IZI)V")
    public final void method662(int arg0, boolean arg1) {
        int var3 = this.field751[0];
        int var4 = this.field803[0];
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
        if (this.field779 != -1 && class40.method3092(this.field779).field944 == 1) {
            this.field779 = -1;
        }
        if (this.field801 < 9) {
            this.field801++;
        }
        for (int var5 = this.field801; var5 > 0; var5--) {
            this.field751[var5] = this.field751[var5 - 1];
            this.field803[var5] = this.field803[var5 - 1];
            this.field778[var5] = this.field778[var5 - 1];
        }
        this.field751[0] = var3;
        this.field803[0] = var4;
        this.field778[0] = arg1;
    }

    @ObfuscatedName("ao.u(I)V")
    public final void method669() {
        this.field801 = 0;
        this.field806 = 0;
    }

    @ObfuscatedName("ao.z(I)Z")
    public boolean method19() {
        return false;
    }

    @ObfuscatedName("ao.q(IIII)V")
    public final void method664(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field769[var4] <= arg2) {
                this.field767[var4] = arg0;
                this.field768[var4] = arg1;
                this.field769[var4] = arg2 + 70;
                return;
            }
        }
    }
}
