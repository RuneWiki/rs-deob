package deob;

@ObfuscatedName("ao")
public abstract class class34 extends class79 {

    @ObfuscatedName("ao.y")
    public int field763;

    @ObfuscatedName("ao.o")
    public int field735;

    @ObfuscatedName("ao.m")
    public int field748;

    @ObfuscatedName("ao.h")
    public boolean field765 = false;

    @ObfuscatedName("ao.x")
    public int field738 = 1;

    @ObfuscatedName("ao.d")
    public int field793 = -1;

    @ObfuscatedName("ao.ac")
    public int field747 = -1;

    @ObfuscatedName("ao.ax")
    public int field741 = -1;

    @ObfuscatedName("ao.af")
    public int field792 = -1;

    @ObfuscatedName("ao.am")
    public int field743 = -1;

    @ObfuscatedName("ao.ah")
    public int field787 = -1;

    @ObfuscatedName("ao.ar")
    public int field745 = -1;

    @ObfuscatedName("ao.ad")
    public int field746 = -1;

    @ObfuscatedName("ao.ao")
    public String field791 = null;

    @ObfuscatedName("ao.ae")
    public boolean field734;

    @ObfuscatedName("ao.ab")
    public boolean field740 = false;

    @ObfuscatedName("ao.ai")
    public int field774 = 100;

    @ObfuscatedName("ao.ag")
    public int field753 = 0;

    @ObfuscatedName("ao.ap")
    public int field752 = 0;

    @ObfuscatedName("ao.az")
    public int[] field744 = new int[4];

    @ObfuscatedName("ao.an")
    public int[] field754 = new int[4];

    @ObfuscatedName("ao.ay")
    public int[] field762 = new int[4];

    @ObfuscatedName("ao.aw")
    public int field786 = -1000;

    @ObfuscatedName("ao.ak")
    public int field757;

    @ObfuscatedName("ao.aq")
    public int field758;

    @ObfuscatedName("ao.aa")
    public int field759 = -1;

    @ObfuscatedName("ao.aj")
    public int field760 = 0;

    @ObfuscatedName("ao.au")
    public int field761 = 0;

    @ObfuscatedName("ao.al")
    public int field782 = -1;

    @ObfuscatedName("ao.as")
    public int field750 = 0;

    @ObfuscatedName("ao.av")
    public int field764 = 0;

    @ObfuscatedName("ao.bw")
    public int field736 = -1;

    @ObfuscatedName("ao.bq")
    public int field766 = 0;

    @ObfuscatedName("ao.bk")
    public int field739 = 0;

    @ObfuscatedName("ao.bv")
    public int field768 = 0;

    @ObfuscatedName("ao.br")
    public int field769 = 0;

    @ObfuscatedName("ao.bn")
    public int field770 = -1;

    @ObfuscatedName("ao.bc")
    public int field771 = 0;

    @ObfuscatedName("ao.bt")
    public int field772 = 0;

    @ObfuscatedName("ao.bz")
    public int field773;

    @ObfuscatedName("ao.bb")
    public int field767;

    @ObfuscatedName("ao.bu")
    public int field775;

    @ObfuscatedName("ao.bm")
    public int field776;

    @ObfuscatedName("ao.bl")
    public int field777;

    @ObfuscatedName("ao.bi")
    public int field778;

    @ObfuscatedName("ao.bg")
    public int field755;

    @ObfuscatedName("ao.bp")
    public int field780;

    @ObfuscatedName("ao.bh")
    public int field781;

    @ObfuscatedName("ao.bx")
    public int field783 = 0;

    @ObfuscatedName("ao.be")
    public int field756 = 200;

    @ObfuscatedName("ao.ba")
    public int field784;

    @ObfuscatedName("ao.bo")
    public int field785 = 0;

    @ObfuscatedName("ao.by")
    public int field751 = 32;

    @ObfuscatedName("ao.bf")
    public int field737 = 0;

    @ObfuscatedName("ao.bs")
    public int[] field788 = new int[10];

    @ObfuscatedName("ao.bd")
    public int[] field789 = new int[10];

    @ObfuscatedName("ao.bj")
    public boolean[] field749 = new boolean[10];

    @ObfuscatedName("ao.ck")
    public int field790 = 0;

    @ObfuscatedName("ao.cv")
    public int field779 = 0;

    @ObfuscatedName("ao.n(IIZI)V")
    public final void method573(int arg0, int arg1, boolean arg2) {
        if (this.field736 != -1 && class39.method2315(this.field736).field927 == 1) {
            this.field736 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field788[0];
            int var5 = arg1 - this.field789[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field737 < 9) {
                    this.field737++;
                }
                for (int var6 = this.field737; var6 > 0; var6--) {
                    this.field788[var6] = this.field788[var6 - 1];
                    this.field789[var6] = this.field789[var6 - 1];
                    this.field749[var6] = this.field749[var6 - 1];
                }
                this.field788[0] = arg0;
                this.field789[0] = arg1;
                this.field749[0] = false;
                return;
            }
        }
        this.field737 = 0;
        this.field779 = 0;
        this.field790 = 0;
        this.field788[0] = arg0;
        this.field789[0] = arg1;
        this.field763 = this.field788[0] * 128 + this.field738 * 64;
        this.field735 = this.field789[0] * 128 + this.field738 * 64;
    }

    @ObfuscatedName("ao.r(IZI)V")
    public final void method577(int arg0, boolean arg1) {
        int var3 = this.field788[0];
        int var4 = this.field789[0];
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
        if (this.field736 != -1 && class39.method2315(this.field736).field927 == 1) {
            this.field736 = -1;
        }
        if (this.field737 < 9) {
            this.field737++;
        }
        for (int var5 = this.field737; var5 > 0; var5--) {
            this.field788[var5] = this.field788[var5 - 1];
            this.field789[var5] = this.field789[var5 - 1];
            this.field749[var5] = this.field749[var5 - 1];
        }
        this.field788[0] = var3;
        this.field789[0] = var4;
        this.field749[0] = arg1;
    }

    @ObfuscatedName("ao.s(I)V")
    public final void method572() {
        this.field737 = 0;
        this.field779 = 0;
    }

    @ObfuscatedName("ao.k(I)Z")
    public boolean method25() {
        return false;
    }

    @ObfuscatedName("ao.f(IIII)V")
    public final void method576(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field762[var4] <= arg2) {
                this.field744[var4] = arg0;
                this.field754[var4] = arg1;
                this.field762[var4] = arg2 + 70;
                return;
            }
        }
    }
}
