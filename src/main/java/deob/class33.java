package deob;

@ObfuscatedName("ag")
public abstract class class33 extends class78 {

    @ObfuscatedName("ag.m")
    public int field747;

    @ObfuscatedName("ag.v")
    public int field735;

    @ObfuscatedName("ag.u")
    public int field768;

    @ObfuscatedName("ag.p")
    public boolean field743 = false;

    @ObfuscatedName("ag.l")
    public int field738 = 1;

    @ObfuscatedName("ag.w")
    public int field739 = -1;

    @ObfuscatedName("ag.x")
    public int field740 = -1;

    @ObfuscatedName("ag.aj")
    public int field758 = -1;

    @ObfuscatedName("ag.al")
    public int field742 = -1;

    @ObfuscatedName("ag.af")
    public int field761 = -1;

    @ObfuscatedName("ag.ai")
    public int field789 = -1;

    @ObfuscatedName("ag.ak")
    public int field765 = -1;

    @ObfuscatedName("ag.ae")
    public int field746 = -1;

    @ObfuscatedName("ag.ag")
    public String field749 = null;

    @ObfuscatedName("ag.ar")
    public boolean field773;

    @ObfuscatedName("ag.an")
    public int field745 = 100;

    @ObfuscatedName("ag.av")
    public int field750 = 0;

    @ObfuscatedName("ag.aw")
    public int field751 = 0;

    @ObfuscatedName("ag.ad")
    public int[] field752 = new int[4];

    @ObfuscatedName("ag.at")
    public int[] field737 = new int[4];

    @ObfuscatedName("ag.aa")
    public int[] field754 = new int[4];

    @ObfuscatedName("ag.ay")
    public int field755 = -1000;

    @ObfuscatedName("ag.am")
    public int field756;

    @ObfuscatedName("ag.az")
    public int field771;

    @ObfuscatedName("ag.au")
    public int field757 = -1;

    @ObfuscatedName("ag.ac")
    public int field759 = 0;

    @ObfuscatedName("ag.ab")
    public int field760 = 0;

    @ObfuscatedName("ag.ao")
    public int field741 = -1;

    @ObfuscatedName("ag.ah")
    public int field762 = 0;

    @ObfuscatedName("ag.ap")
    public int field763 = 0;

    @ObfuscatedName("ag.as")
    public int field785 = -1;

    @ObfuscatedName("ag.ax")
    public int field753 = 0;

    @ObfuscatedName("ag.bg")
    public int field766 = 0;

    @ObfuscatedName("ag.bd")
    public int field791 = 0;

    @ObfuscatedName("ag.bp")
    public int field782 = 0;

    @ObfuscatedName("ag.bm")
    public int field774 = -1;

    @ObfuscatedName("ag.bh")
    public int field770 = 0;

    @ObfuscatedName("ag.be")
    public int field788 = 0;

    @ObfuscatedName("ag.bt")
    public int field772;

    @ObfuscatedName("ag.bf")
    public int field764;

    @ObfuscatedName("ag.bk")
    public int field776;

    @ObfuscatedName("ag.bs")
    public int field775;

    @ObfuscatedName("ag.bi")
    public int field736;

    @ObfuscatedName("ag.bx")
    public int field777;

    @ObfuscatedName("ag.br")
    public int field778;

    @ObfuscatedName("ag.bb")
    public int field744;

    @ObfuscatedName("ag.bw")
    public int field780;

    @ObfuscatedName("ag.bo")
    public int field781 = 0;

    @ObfuscatedName("ag.bl")
    public int field767 = 200;

    @ObfuscatedName("ag.ba")
    public int field783;

    @ObfuscatedName("ag.bz")
    public int field784 = 0;

    @ObfuscatedName("ag.bq")
    public int field734 = 32;

    @ObfuscatedName("ag.bu")
    public int field786 = 0;

    @ObfuscatedName("ag.by")
    public int[] field787 = new int[10];

    @ObfuscatedName("ag.bn")
    public int[] field779 = new int[10];

    @ObfuscatedName("ag.bc")
    public boolean[] field748 = new boolean[10];

    @ObfuscatedName("ag.bj")
    public int field790 = 0;

    @ObfuscatedName("ag.bv")
    public int field769 = 0;

    @ObfuscatedName("ag.o(IIZI)V")
    public final void method569(int arg0, int arg1, boolean arg2) {
        if (this.field785 != -1 && class38.method38(this.field785).field917 == 1) {
            this.field785 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field787[0];
            int var5 = arg1 - this.field779[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field786 < 9) {
                    this.field786++;
                }
                for (int var6 = this.field786; var6 > 0; var6--) {
                    this.field787[var6] = this.field787[var6 - 1];
                    this.field779[var6] = this.field779[var6 - 1];
                    this.field748[var6] = this.field748[var6 - 1];
                }
                this.field787[0] = arg0;
                this.field779[0] = arg1;
                this.field748[0] = false;
                return;
            }
        }
        this.field786 = 0;
        this.field769 = 0;
        this.field790 = 0;
        this.field787[0] = arg0;
        this.field779[0] = arg1;
        this.field747 = this.field787[0] * 128 + this.field738 * 64;
        this.field735 = this.field779[0] * 128 + this.field738 * 64;
    }

    @ObfuscatedName("ag.t(IZI)V")
    public final void method570(int arg0, boolean arg1) {
        int var3 = this.field787[0];
        int var4 = this.field779[0];
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
        if (this.field785 != -1 && class38.method38(this.field785).field917 == 1) {
            this.field785 = -1;
        }
        if (this.field786 < 9) {
            this.field786++;
        }
        for (int var5 = this.field786; var5 > 0; var5--) {
            this.field787[var5] = this.field787[var5 - 1];
            this.field779[var5] = this.field779[var5 - 1];
            this.field748[var5] = this.field748[var5 - 1];
        }
        this.field787[0] = var3;
        this.field779[0] = var4;
        this.field748[0] = arg1;
    }

    @ObfuscatedName("ag.c(I)V")
    public final void method571() {
        this.field786 = 0;
        this.field769 = 0;
    }

    @ObfuscatedName("ag.y(I)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("ag.d(IIII)V")
    public final void method572(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field754[var4] <= arg2) {
                this.field752[var4] = arg0;
                this.field737[var4] = arg1;
                this.field754[var4] = arg2 + 70;
                return;
            }
        }
    }
}
