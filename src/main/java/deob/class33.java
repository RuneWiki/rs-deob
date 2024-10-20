package deob;

@ObfuscatedName("ae")
public abstract class class33 extends class78 {

    @ObfuscatedName("ae.k")
    public int field772;

    @ObfuscatedName("ae.b")
    public int field715;

    @ObfuscatedName("ae.h")
    public int field716;

    @ObfuscatedName("ae.i")
    public boolean field717 = false;

    @ObfuscatedName("ae.o")
    public int field718 = 1;

    @ObfuscatedName("ae.m")
    public int field719 = -1;

    @ObfuscatedName("ae.ak")
    public int field720 = -1;

    @ObfuscatedName("ae.aw")
    public int field754 = -1;

    @ObfuscatedName("ae.af")
    public int field722 = -1;

    @ObfuscatedName("ae.ab")
    public int field723 = -1;

    @ObfuscatedName("ae.ao")
    public int field753 = -1;

    @ObfuscatedName("ae.ah")
    public int field725 = -1;

    @ObfuscatedName("ae.ae")
    public int field726 = -1;

    @ObfuscatedName("ae.ax")
    public String field727 = null;

    @ObfuscatedName("ae.ar")
    public boolean field744;

    @ObfuscatedName("ae.aq")
    public int field729 = 100;

    @ObfuscatedName("ae.am")
    public int field728 = 0;

    @ObfuscatedName("ae.az")
    public int field751 = 0;

    @ObfuscatedName("ae.at")
    public int[] field732 = new int[4];

    @ObfuscatedName("ae.av")
    public int[] field733 = new int[4];

    @ObfuscatedName("ae.aa")
    public int[] field748 = new int[4];

    @ObfuscatedName("ae.ag")
    public int field735 = -1000;

    @ObfuscatedName("ae.au")
    public int field736;

    @ObfuscatedName("ae.aj")
    public int field734;

    @ObfuscatedName("ae.ay")
    public int field738 = -1;

    @ObfuscatedName("ae.ac")
    public int field730 = 0;

    @ObfuscatedName("ae.al")
    public int field740 = 0;

    @ObfuscatedName("ae.as")
    public int field742 = -1;

    @ObfuscatedName("ae.ai")
    public int field724 = 0;

    @ObfuscatedName("ae.ad")
    public int field743 = 0;

    @ObfuscatedName("ae.ap")
    public int field767 = -1;

    @ObfuscatedName("ae.bf")
    public int field745 = 0;

    @ObfuscatedName("ae.bu")
    public int field746 = 0;

    @ObfuscatedName("ae.bi")
    public int field762 = 0;

    @ObfuscatedName("ae.ba")
    public int field739 = 0;

    @ObfuscatedName("ae.bt")
    public int field749 = -1;

    @ObfuscatedName("ae.bo")
    public int field750 = 0;

    @ObfuscatedName("ae.br")
    public int field747 = 0;

    @ObfuscatedName("ae.be")
    public int field752;

    @ObfuscatedName("ae.bp")
    public int field737;

    @ObfuscatedName("ae.bc")
    public int field757;

    @ObfuscatedName("ae.bn")
    public int field755;

    @ObfuscatedName("ae.bd")
    public int field756;

    @ObfuscatedName("ae.bl")
    public int field731;

    @ObfuscatedName("ae.bz")
    public int field758;

    @ObfuscatedName("ae.bx")
    public int field759;

    @ObfuscatedName("ae.bk")
    public int field760;

    @ObfuscatedName("ae.bg")
    public int field761 = 0;

    @ObfuscatedName("ae.by")
    public int field721 = 200;

    @ObfuscatedName("ae.bm")
    public int field763;

    @ObfuscatedName("ae.bv")
    public int field764 = 0;

    @ObfuscatedName("ae.bh")
    public int field765 = 32;

    @ObfuscatedName("ae.bj")
    public int field766 = 0;

    @ObfuscatedName("ae.bs")
    public int[] field771 = new int[10];

    @ObfuscatedName("ae.bb")
    public int[] field768 = new int[10];

    @ObfuscatedName("ae.bw")
    public boolean[] field769 = new boolean[10];

    @ObfuscatedName("ae.bq")
    public int field770 = 0;

    @ObfuscatedName("ae.cb")
    public int field714 = 0;

    @ObfuscatedName("ae.j(IIZB)V")
    public final void method566(int arg0, int arg1, boolean arg2) {
        if (this.field767 != -1 && Statics.method448(this.field767).field906 == 1) {
            this.field767 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field771[0];
            int var5 = arg1 - this.field768[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field766 < 9) {
                    this.field766++;
                }
                for (int var6 = this.field766; var6 > 0; var6--) {
                    this.field771[var6] = this.field771[var6 - 1];
                    this.field768[var6] = this.field768[var6 - 1];
                    this.field769[var6] = this.field769[var6 - 1];
                }
                this.field771[0] = arg0;
                this.field768[0] = arg1;
                this.field769[0] = false;
                return;
            }
        }
        this.field766 = 0;
        this.field714 = 0;
        this.field770 = 0;
        this.field771[0] = arg0;
        this.field768[0] = arg1;
        this.field772 = this.field771[0] * 128 + this.field718 * 64;
        this.field715 = this.field768[0] * 128 + this.field718 * 64;
    }

    @ObfuscatedName("ae.u(IZI)V")
    public final void method567(int arg0, boolean arg1) {
        int var3 = this.field771[0];
        int var4 = this.field768[0];
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
        if (this.field767 != -1 && Statics.method448(this.field767).field906 == 1) {
            this.field767 = -1;
        }
        if (this.field766 < 9) {
            this.field766++;
        }
        for (int var5 = this.field766; var5 > 0; var5--) {
            this.field771[var5] = this.field771[var5 - 1];
            this.field768[var5] = this.field768[var5 - 1];
            this.field769[var5] = this.field769[var5 - 1];
        }
        this.field771[0] = var3;
        this.field768[0] = var4;
        this.field769[0] = arg1;
    }

    @ObfuscatedName("ae.g(I)V")
    public final void method568() {
        this.field766 = 0;
        this.field714 = 0;
    }

    @ObfuscatedName("ae.f(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("ae.a(IIIB)V")
    public final void method569(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field748[var4] <= arg2) {
                this.field732[var4] = arg0;
                this.field733[var4] = arg1;
                this.field748[var4] = arg2 + 70;
                return;
            }
        }
    }
}
