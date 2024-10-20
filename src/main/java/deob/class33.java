package deob;

@ObfuscatedName("aj")
public abstract class class33 extends class78 {

    @ObfuscatedName("aj.x")
    public int field729;

    @ObfuscatedName("aj.q")
    public int field740;

    @ObfuscatedName("aj.s")
    public int field714;

    @ObfuscatedName("aj.j")
    public boolean field715 = false;

    @ObfuscatedName("aj.y")
    public int field716 = 1;

    @ObfuscatedName("aj.r")
    public int field717 = -1;

    @ObfuscatedName("aj.h")
    public int field718 = -1;

    @ObfuscatedName("aj.ak")
    public int field721 = -1;

    @ObfuscatedName("aj.ab")
    public int field720 = -1;

    @ObfuscatedName("aj.as")
    public int field755 = -1;

    @ObfuscatedName("aj.aq")
    public int field741 = -1;

    @ObfuscatedName("aj.ai")
    public int field757 = -1;

    @ObfuscatedName("aj.aw")
    public int field724 = -1;

    @ObfuscatedName("aj.aj")
    public String field712 = null;

    @ObfuscatedName("aj.ax")
    public boolean field726;

    @ObfuscatedName("aj.ar")
    public int field733 = 100;

    @ObfuscatedName("aj.ac")
    public int field728 = 0;

    @ObfuscatedName("aj.ap")
    public int field722 = 0;

    @ObfuscatedName("aj.ae")
    public int[] field719 = new int[4];

    @ObfuscatedName("aj.ah")
    public int[] field731 = new int[4];

    @ObfuscatedName("aj.ad")
    public int[] field723 = new int[4];

    @ObfuscatedName("aj.ay")
    public int field730 = -1000;

    @ObfuscatedName("aj.at")
    public int field727;

    @ObfuscatedName("aj.au")
    public int field735;

    @ObfuscatedName("aj.an")
    public int field736 = -1;

    @ObfuscatedName("aj.al")
    public int field737 = 0;

    @ObfuscatedName("aj.am")
    public int field749 = 0;

    @ObfuscatedName("aj.av")
    public int field739 = -1;

    @ObfuscatedName("aj.ag")
    public int field761 = 0;

    @ObfuscatedName("aj.af")
    public int field769 = 0;

    @ObfuscatedName("aj.ao")
    public int field742 = -1;

    @ObfuscatedName("aj.aa")
    public int field713 = 0;

    @ObfuscatedName("aj.bv")
    public int field744 = 0;

    @ObfuscatedName("aj.bl")
    public int field745 = 0;

    @ObfuscatedName("aj.be")
    public int field746 = 0;

    @ObfuscatedName("aj.bo")
    public int field751 = -1;

    @ObfuscatedName("aj.bg")
    public int field748 = 0;

    @ObfuscatedName("aj.bh")
    public int field725 = 0;

    @ObfuscatedName("aj.bi")
    public int field750;

    @ObfuscatedName("aj.bc")
    public int field753;

    @ObfuscatedName("aj.bn")
    public int field752;

    @ObfuscatedName("aj.ba")
    public int field734;

    @ObfuscatedName("aj.bm")
    public int field754;

    @ObfuscatedName("aj.bf")
    public int field758;

    @ObfuscatedName("aj.bb")
    public int field756;

    @ObfuscatedName("aj.br")
    public int field738;

    @ObfuscatedName("aj.bt")
    public int field747;

    @ObfuscatedName("aj.bw")
    public int field759 = 0;

    @ObfuscatedName("aj.by")
    public int field760 = 200;

    @ObfuscatedName("aj.bj")
    public int field732;

    @ObfuscatedName("aj.bq")
    public int field762 = 0;

    @ObfuscatedName("aj.bu")
    public int field763 = 32;

    @ObfuscatedName("aj.bk")
    public int field764 = 0;

    @ObfuscatedName("aj.bd")
    public int[] field765 = new int[10];

    @ObfuscatedName("aj.bx")
    public int[] field766 = new int[10];

    @ObfuscatedName("aj.bs")
    public boolean[] field767 = new boolean[10];

    @ObfuscatedName("aj.bz")
    public int field768 = 0;

    @ObfuscatedName("aj.bp")
    public int field743 = 0;

    @ObfuscatedName("aj.t(IIZI)V")
    public final void method600(int arg0, int arg1, boolean arg2) {
        if (this.field742 != -1 && class38.method81(this.field742).field905 == 1) {
            this.field742 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field765[0];
            int var5 = arg1 - this.field766[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field764 < 9) {
                    this.field764++;
                }
                for (int var6 = this.field764; var6 > 0; var6--) {
                    this.field765[var6] = this.field765[var6 - 1];
                    this.field766[var6] = this.field766[var6 - 1];
                    this.field767[var6] = this.field767[var6 - 1];
                }
                this.field765[0] = arg0;
                this.field766[0] = arg1;
                this.field767[0] = false;
                return;
            }
        }
        this.field764 = 0;
        this.field743 = 0;
        this.field768 = 0;
        this.field765[0] = arg0;
        this.field766[0] = arg1;
        this.field729 = this.field765[0] * 128 + this.field716 * 64;
        this.field740 = this.field766[0] * 128 + this.field716 * 64;
    }

    @ObfuscatedName("aj.l(IZS)V")
    public final void method604(int arg0, boolean arg1) {
        int var3 = this.field765[0];
        int var4 = this.field766[0];
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
        if (this.field742 != -1 && class38.method81(this.field742).field905 == 1) {
            this.field742 = -1;
        }
        if (this.field764 < 9) {
            this.field764++;
        }
        for (int var5 = this.field764; var5 > 0; var5--) {
            this.field765[var5] = this.field765[var5 - 1];
            this.field766[var5] = this.field766[var5 - 1];
            this.field767[var5] = this.field767[var5 - 1];
        }
        this.field765[0] = var3;
        this.field766[0] = var4;
        this.field767[0] = arg1;
    }

    @ObfuscatedName("aj.f(I)V")
    public final void method602() {
        this.field764 = 0;
        this.field743 = 0;
    }

    @ObfuscatedName("aj.a(I)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("aj.c(IIII)V")
    public final void method616(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field723[var4] <= arg2) {
                this.field719[var4] = arg0;
                this.field731[var4] = arg1;
                this.field723[var4] = arg2 + 70;
                return;
            }
        }
    }
}
