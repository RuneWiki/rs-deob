package deob;

@ObfuscatedName("ah")
public abstract class class33 extends class78 {

    @ObfuscatedName("ah.z")
    public int field777;

    @ObfuscatedName("ah.t")
    public int field744;

    @ObfuscatedName("ah.c")
    public int field760;

    @ObfuscatedName("ah.q")
    public boolean field746 = false;

    @ObfuscatedName("ah.g")
    public int field747 = 1;

    @ObfuscatedName("ah.m")
    public int field748 = -1;

    @ObfuscatedName("ah.ay")
    public int field762 = -1;

    @ObfuscatedName("ah.ae")
    public int field750 = -1;

    @ObfuscatedName("ah.af")
    public int field751 = -1;

    @ObfuscatedName("ah.ab")
    public int field768 = -1;

    @ObfuscatedName("ah.ao")
    public int field753 = -1;

    @ObfuscatedName("ah.ak")
    public int field754 = -1;

    @ObfuscatedName("ah.ah")
    public int field758 = -1;

    @ObfuscatedName("ah.ai")
    public String field764 = null;

    @ObfuscatedName("ah.al")
    public boolean field757;

    @ObfuscatedName("ah.av")
    public int field780 = 100;

    @ObfuscatedName("ah.ap")
    public int field755 = 0;

    @ObfuscatedName("ah.ar")
    public int field749 = 0;

    @ObfuscatedName("ah.aq")
    public int[] field761 = new int[4];

    @ObfuscatedName("ah.at")
    public int[] field756 = new int[4];

    @ObfuscatedName("ah.ag")
    public int[] field775 = new int[4];

    @ObfuscatedName("ah.am")
    public int field793 = -1000;

    @ObfuscatedName("ah.aw")
    public int field765;

    @ObfuscatedName("ah.ac")
    public int field766;

    @ObfuscatedName("ah.as")
    public int field767 = -1;

    @ObfuscatedName("ah.az")
    public int field783 = 0;

    @ObfuscatedName("ah.ad")
    public int field798 = 0;

    @ObfuscatedName("ah.ax")
    public int field770 = -1;

    @ObfuscatedName("ah.aa")
    public int field771 = 0;

    @ObfuscatedName("ah.aj")
    public int field778 = 0;

    @ObfuscatedName("ah.an")
    public int field773 = -1;

    @ObfuscatedName("ah.bw")
    public int field774 = 0;

    @ObfuscatedName("ah.br")
    public int field743 = 0;

    @ObfuscatedName("ah.bl")
    public int field772 = 0;

    @ObfuscatedName("ah.bt")
    public int field776 = 0;

    @ObfuscatedName("ah.bo")
    public int field763 = -1;

    @ObfuscatedName("ah.bu")
    public int field779 = 0;

    @ObfuscatedName("ah.bh")
    public int field759 = 0;

    @ObfuscatedName("ah.bc")
    public int field781;

    @ObfuscatedName("ah.bn")
    public int field782;

    @ObfuscatedName("ah.by")
    public int field785;

    @ObfuscatedName("ah.be")
    public int field784;

    @ObfuscatedName("ah.bd")
    public int field802;

    @ObfuscatedName("ah.bk")
    public int field786;

    @ObfuscatedName("ah.bb")
    public int field787;

    @ObfuscatedName("ah.bq")
    public int field788;

    @ObfuscatedName("ah.bx")
    public int field789;

    @ObfuscatedName("ah.bf")
    public int field790 = 0;

    @ObfuscatedName("ah.bj")
    public int field791 = 200;

    @ObfuscatedName("ah.ba")
    public int field792;

    @ObfuscatedName("ah.bg")
    public int field797 = 0;

    @ObfuscatedName("ah.bs")
    public int field769 = 32;

    @ObfuscatedName("ah.bi")
    public int field795 = 0;

    @ObfuscatedName("ah.bv")
    public int[] field796 = new int[10];

    @ObfuscatedName("ah.bp")
    public int[] field745 = new int[10];

    @ObfuscatedName("ah.bz")
    public boolean[] field752 = new boolean[10];

    @ObfuscatedName("ah.bm")
    public int field799 = 0;

    @ObfuscatedName("ah.ch")
    public int field800 = 0;

    @ObfuscatedName("ah.s(IIZI)V")
    public final void method586(int arg0, int arg1, boolean arg2) {
        if (this.field773 != -1 && class38.method131(this.field773).field915 == 1) {
            this.field773 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field796[0];
            int var5 = arg1 - this.field745[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field795 < 9) {
                    this.field795++;
                }
                for (int var6 = this.field795; var6 > 0; var6--) {
                    this.field796[var6] = this.field796[var6 - 1];
                    this.field745[var6] = this.field745[var6 - 1];
                    this.field752[var6] = this.field752[var6 - 1];
                }
                this.field796[0] = arg0;
                this.field745[0] = arg1;
                this.field752[0] = false;
                return;
            }
        }
        this.field795 = 0;
        this.field800 = 0;
        this.field799 = 0;
        this.field796[0] = arg0;
        this.field745[0] = arg1;
        this.field777 = this.field796[0] * 128 + this.field747 * 64;
        this.field744 = this.field745[0] * 128 + this.field747 * 64;
    }

    @ObfuscatedName("ah.f(IZI)V")
    public final void method587(int arg0, boolean arg1) {
        int var3 = this.field796[0];
        int var4 = this.field745[0];
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
        if (this.field773 != -1 && class38.method131(this.field773).field915 == 1) {
            this.field773 = -1;
        }
        if (this.field795 < 9) {
            this.field795++;
        }
        for (int var5 = this.field795; var5 > 0; var5--) {
            this.field796[var5] = this.field796[var5 - 1];
            this.field745[var5] = this.field745[var5 - 1];
            this.field752[var5] = this.field752[var5 - 1];
        }
        this.field796[0] = var3;
        this.field745[0] = var4;
        this.field752[0] = arg1;
    }

    @ObfuscatedName("ah.x(I)V")
    public final void method591() {
        this.field795 = 0;
        this.field800 = 0;
    }

    @ObfuscatedName("ah.y(I)Z")
    public boolean method22() {
        return false;
    }

    @ObfuscatedName("ah.h(IIII)V")
    public final void method594(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field775[var4] <= arg2) {
                this.field761[var4] = arg0;
                this.field756[var4] = arg1;
                this.field775[var4] = arg2 + 70;
                return;
            }
        }
    }
}
