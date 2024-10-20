package deob;

@ObfuscatedName("aq")
public abstract class class34 extends class79 {

    @ObfuscatedName("aq.g")
    public int field793;

    @ObfuscatedName("aq.y")
    public int field736;

    @ObfuscatedName("aq.p")
    public int field777;

    @ObfuscatedName("aq.r")
    public boolean field750 = false;

    @ObfuscatedName("aq.z")
    public int field739 = 1;

    @ObfuscatedName("aq.c")
    public int field740 = -1;

    @ObfuscatedName("aq.an")
    public int field741 = -1;

    @ObfuscatedName("aq.as")
    public int field742 = -1;

    @ObfuscatedName("aq.ah")
    public int field753 = -1;

    @ObfuscatedName("aq.ar")
    public int field744 = -1;

    @ObfuscatedName("aq.ae")
    public int field745 = -1;

    @ObfuscatedName("aq.av")
    public int field789 = -1;

    @ObfuscatedName("aq.al")
    public int field747 = -1;

    @ObfuscatedName("aq.aq")
    public String field748 = null;

    @ObfuscatedName("aq.am")
    public boolean field755;

    @ObfuscatedName("aq.ax")
    public boolean field738 = false;

    @ObfuscatedName("aq.az")
    public int field751 = 100;

    @ObfuscatedName("aq.ai")
    public int field752 = 0;

    @ObfuscatedName("aq.aa")
    public int field780 = 0;

    @ObfuscatedName("aq.aw")
    public int[] field754 = new int[4];

    @ObfuscatedName("aq.ao")
    public int[] field791 = new int[4];

    @ObfuscatedName("aq.ag")
    public int[] field768 = new int[4];

    @ObfuscatedName("aq.ad")
    public int field776 = -1000;

    @ObfuscatedName("aq.au")
    public int field758;

    @ObfuscatedName("aq.ak")
    public int field759;

    @ObfuscatedName("aq.aj")
    public int field764 = -1;

    @ObfuscatedName("aq.af")
    public int field761 = 0;

    @ObfuscatedName("aq.ab")
    public int field762 = 0;

    @ObfuscatedName("aq.ac")
    public int field763 = -1;

    @ObfuscatedName("aq.ap")
    public int field737 = 0;

    @ObfuscatedName("aq.ay")
    public int field765 = 0;

    @ObfuscatedName("aq.bu")
    public int field766 = -1;

    @ObfuscatedName("aq.bo")
    public int field767 = 0;

    @ObfuscatedName("aq.bi")
    public int field757 = 0;

    @ObfuscatedName("aq.bs")
    public int field769 = 0;

    @ObfuscatedName("aq.bl")
    public int field770 = 0;

    @ObfuscatedName("aq.bp")
    public int field794 = -1;

    @ObfuscatedName("aq.bw")
    public int field772 = 0;

    @ObfuscatedName("aq.bm")
    public int field773 = 0;

    @ObfuscatedName("aq.bz")
    public int field774;

    @ObfuscatedName("aq.br")
    public int field775;

    @ObfuscatedName("aq.be")
    public int field756;

    @ObfuscatedName("aq.bb")
    public int field746;

    @ObfuscatedName("aq.bc")
    public int field778;

    @ObfuscatedName("aq.bk")
    public int field779;

    @ObfuscatedName("aq.bf")
    public int field735;

    @ObfuscatedName("aq.bg")
    public int field781;

    @ObfuscatedName("aq.bt")
    public int field782;

    @ObfuscatedName("aq.bx")
    public int field771 = 0;

    @ObfuscatedName("aq.bn")
    public int field784 = 200;

    @ObfuscatedName("aq.bq")
    public int field785;

    @ObfuscatedName("aq.ba")
    public int field786 = 0;

    @ObfuscatedName("aq.bv")
    public int field787 = 32;

    @ObfuscatedName("aq.bd")
    public int field788 = 0;

    @ObfuscatedName("aq.bh")
    public int[] field795 = new int[10];

    @ObfuscatedName("aq.bj")
    public int[] field743 = new int[10];

    @ObfuscatedName("aq.by")
    public boolean[] field790 = new boolean[10];

    @ObfuscatedName("aq.cr")
    public int field792 = 0;

    @ObfuscatedName("aq.ct")
    public int field749 = 0;

    @ObfuscatedName("aq.s(IIZB)V")
    public final void method613(int arg0, int arg1, boolean arg2) {
        if (this.field766 != -1 && Statics.method97(this.field766).field922 == 1) {
            this.field766 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field795[0];
            int var5 = arg1 - this.field743[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field788 < 9) {
                    this.field788++;
                }
                for (int var6 = this.field788; var6 > 0; var6--) {
                    this.field795[var6] = this.field795[var6 - 1];
                    this.field743[var6] = this.field743[var6 - 1];
                    this.field790[var6] = this.field790[var6 - 1];
                }
                this.field795[0] = arg0;
                this.field743[0] = arg1;
                this.field790[0] = false;
                return;
            }
        }
        this.field788 = 0;
        this.field749 = 0;
        this.field792 = 0;
        this.field795[0] = arg0;
        this.field743[0] = arg1;
        this.field793 = this.field795[0] * 128 + this.field739 * 64;
        this.field736 = this.field743[0] * 128 + this.field739 * 64;
    }

    @ObfuscatedName("aq.k(IZS)V")
    public final void method616(int arg0, boolean arg1) {
        int var3 = this.field795[0];
        int var4 = this.field743[0];
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
        if (this.field766 != -1 && Statics.method97(this.field766).field922 == 1) {
            this.field766 = -1;
        }
        if (this.field788 < 9) {
            this.field788++;
        }
        for (int var5 = this.field788; var5 > 0; var5--) {
            this.field795[var5] = this.field795[var5 - 1];
            this.field743[var5] = this.field743[var5 - 1];
            this.field790[var5] = this.field790[var5 - 1];
        }
        this.field795[0] = var3;
        this.field743[0] = var4;
        this.field790[0] = arg1;
    }

    @ObfuscatedName("aq.f(I)V")
    public final void method614() {
        this.field788 = 0;
        this.field749 = 0;
    }

    @ObfuscatedName("aq.i(I)Z")
    public boolean method15() {
        return false;
    }

    @ObfuscatedName("aq.d(IIII)V")
    public final void method620(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field768[var4] <= arg2) {
                this.field754[var4] = arg0;
                this.field791[var4] = arg1;
                this.field768[var4] = arg2 + 70;
                return;
            }
        }
    }
}
