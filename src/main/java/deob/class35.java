package deob;

@ObfuscatedName("at")
public abstract class class35 extends class80 {

    @ObfuscatedName("at.p")
    public int field804;

    @ObfuscatedName("at.z")
    public int field750;

    @ObfuscatedName("at.s")
    public int field749;

    @ObfuscatedName("at.d")
    public boolean field752 = false;

    @ObfuscatedName("at.b")
    public int field753 = 1;

    @ObfuscatedName("at.e")
    public int field754 = -1;

    @ObfuscatedName("at.ar")
    public int field755 = -1;

    @ObfuscatedName("at.av")
    public int field756 = -1;

    @ObfuscatedName("at.ae")
    public int field757 = -1;

    @ObfuscatedName("at.aq")
    public int field758 = -1;

    @ObfuscatedName("at.ay")
    public int field759 = -1;

    @ObfuscatedName("at.ac")
    public int field760 = -1;

    @ObfuscatedName("at.ao")
    public int field799 = -1;

    @ObfuscatedName("at.ab")
    public String field776 = null;

    @ObfuscatedName("at.at")
    public boolean field763;

    @ObfuscatedName("at.ai")
    public boolean field764 = false;

    @ObfuscatedName("at.aa")
    public int field765 = 100;

    @ObfuscatedName("at.ap")
    public int field812 = 0;

    @ObfuscatedName("at.ad")
    public int field761 = 0;

    @ObfuscatedName("at.ax")
    public int[] field768 = new int[4];

    @ObfuscatedName("at.az")
    public int[] field769 = new int[4];

    @ObfuscatedName("at.af")
    public int[] field798 = new int[4];

    @ObfuscatedName("at.al")
    public int field771 = -1000;

    @ObfuscatedName("at.ak")
    public int field772;

    @ObfuscatedName("at.as")
    public int field773;

    @ObfuscatedName("at.ag")
    public int field788 = -1;

    @ObfuscatedName("at.an")
    public int field775 = 0;

    @ObfuscatedName("at.au")
    public int field780 = 0;

    @ObfuscatedName("at.am")
    public int field777 = -1;

    @ObfuscatedName("at.aj")
    public int field778 = 0;

    @ObfuscatedName("at.ah")
    public int field779 = 0;

    @ObfuscatedName("at.ba")
    public int field793 = -1;

    @ObfuscatedName("at.bm")
    public int field781 = 0;

    @ObfuscatedName("at.bx")
    public int field782 = 0;

    @ObfuscatedName("at.bb")
    public int field770 = 0;

    @ObfuscatedName("at.bd")
    public int field784 = 0;

    @ObfuscatedName("at.bz")
    public int field785 = -1;

    @ObfuscatedName("at.br")
    public int field783 = 0;

    @ObfuscatedName("at.bl")
    public int field787 = 0;

    @ObfuscatedName("at.bf")
    public int field792;

    @ObfuscatedName("at.bo")
    public int field796;

    @ObfuscatedName("at.bv")
    public int field790;

    @ObfuscatedName("at.bh")
    public int field791;

    @ObfuscatedName("at.bg")
    public int field797;

    @ObfuscatedName("at.bn")
    public int field751;

    @ObfuscatedName("at.bi")
    public int field794;

    @ObfuscatedName("at.by")
    public int field795;

    @ObfuscatedName("at.bt")
    public int field766;

    @ObfuscatedName("at.bq")
    public int field767 = 0;

    @ObfuscatedName("at.bs")
    public int field789 = 200;

    @ObfuscatedName("at.bu")
    public int field811;

    @ObfuscatedName("at.bp")
    public int field800 = 0;

    @ObfuscatedName("at.bc")
    public int field801 = 32;

    @ObfuscatedName("at.be")
    public int field762 = 0;

    @ObfuscatedName("at.bw")
    public int[] field803 = new int[10];

    @ObfuscatedName("at.bj")
    public int[] field786 = new int[10];

    @ObfuscatedName("at.bk")
    public boolean[] field805 = new boolean[10];

    @ObfuscatedName("at.cw")
    public int field806 = 0;

    @ObfuscatedName("at.ch")
    public int field807 = 0;

    @ObfuscatedName("at.a(IIZS)V")
    public final void method643(int arg0, int arg1, boolean arg2) {
        if (this.field793 != -1 && class40.method567(this.field793).field939 == 1) {
            this.field793 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field803[0];
            int var5 = arg1 - this.field786[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field762 < 9) {
                    this.field762++;
                }
                for (int var6 = this.field762; var6 > 0; var6--) {
                    this.field803[var6] = this.field803[var6 - 1];
                    this.field786[var6] = this.field786[var6 - 1];
                    this.field805[var6] = this.field805[var6 - 1];
                }
                this.field803[0] = arg0;
                this.field786[0] = arg1;
                this.field805[0] = false;
                return;
            }
        }
        this.field762 = 0;
        this.field807 = 0;
        this.field806 = 0;
        this.field803[0] = arg0;
        this.field786[0] = arg1;
        this.field804 = this.field803[0] * 128 + this.field753 * 64;
        this.field750 = this.field786[0] * 128 + this.field753 * 64;
    }

    @ObfuscatedName("at.f(IZB)V")
    public final void method645(int arg0, boolean arg1) {
        int var3 = this.field803[0];
        int var4 = this.field786[0];
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
        if (this.field793 != -1 && class40.method567(this.field793).field939 == 1) {
            this.field793 = -1;
        }
        if (this.field762 < 9) {
            this.field762++;
        }
        for (int var5 = this.field762; var5 > 0; var5--) {
            this.field803[var5] = this.field803[var5 - 1];
            this.field786[var5] = this.field786[var5 - 1];
            this.field805[var5] = this.field805[var5 - 1];
        }
        this.field803[0] = var3;
        this.field786[0] = var4;
        this.field805[0] = arg1;
    }

    @ObfuscatedName("at.i(I)V")
    public final void method658() {
        this.field762 = 0;
        this.field807 = 0;
    }

    @ObfuscatedName("at.g(I)Z")
    public boolean method15() {
        return false;
    }

    @ObfuscatedName("at.n(IIII)V")
    public final void method646(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field798[var4] <= arg2) {
                this.field768[var4] = arg0;
                this.field769[var4] = arg1;
                this.field798[var4] = arg2 + 70;
                return;
            }
        }
    }
}
