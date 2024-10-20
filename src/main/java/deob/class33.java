package deob;

@ObfuscatedName("ai")
public abstract class class33 extends class78 {

    @ObfuscatedName("ai.b")
    public int field746;

    @ObfuscatedName("ai.i")
    public int field713;

    @ObfuscatedName("ai.h")
    public int field714;

    @ObfuscatedName("ai.q")
    public boolean field727 = false;

    @ObfuscatedName("ai.d")
    public int field716 = 1;

    @ObfuscatedName("ai.z")
    public int field751 = -1;

    @ObfuscatedName("ai.e")
    public int field718 = -1;

    @ObfuscatedName("ai.av")
    public int field719 = -1;

    @ObfuscatedName("ai.al")
    public int field720 = -1;

    @ObfuscatedName("ai.aq")
    public int field721 = -1;

    @ObfuscatedName("ai.aa")
    public int field722 = -1;

    @ObfuscatedName("ai.ah")
    public int field723 = -1;

    @ObfuscatedName("ai.au")
    public int field736 = -1;

    @ObfuscatedName("ai.ai")
    public String field725 = null;

    @ObfuscatedName("ai.ab")
    public boolean field726;

    @ObfuscatedName("ai.ag")
    public int field715 = 100;

    @ObfuscatedName("ai.ax")
    public int field740 = 0;

    @ObfuscatedName("ai.af")
    public int field729 = 0;

    @ObfuscatedName("ai.ac")
    public int[] field730 = new int[4];

    @ObfuscatedName("ai.aj")
    public int[] field731 = new int[4];

    @ObfuscatedName("ai.ap")
    public int[] field732 = new int[4];

    @ObfuscatedName("ai.ae")
    public int field733 = -1000;

    @ObfuscatedName("ai.at")
    public int field762;

    @ObfuscatedName("ai.as")
    public int field735;

    @ObfuscatedName("ai.aw")
    public int field765 = -1;

    @ObfuscatedName("ai.ak")
    public int field717 = 0;

    @ObfuscatedName("ai.az")
    public int field724 = 0;

    @ObfuscatedName("ai.ay")
    public int field739 = -1;

    @ObfuscatedName("ai.ad")
    public int field737 = 0;

    @ObfuscatedName("ai.ar")
    public int field741 = 0;

    @ObfuscatedName("ai.an")
    public int field742 = -1;

    @ObfuscatedName("ai.am")
    public int field743 = 0;

    @ObfuscatedName("ai.bw")
    public int field772 = 0;

    @ObfuscatedName("ai.bq")
    public int field745 = 0;

    @ObfuscatedName("ai.bl")
    public int field738 = 0;

    @ObfuscatedName("ai.bh")
    public int field747 = -1;

    @ObfuscatedName("ai.bd")
    public int field748 = 0;

    @ObfuscatedName("ai.bn")
    public int field749 = 0;

    @ObfuscatedName("ai.bm")
    public int field750;

    @ObfuscatedName("ai.ba")
    public int field760;

    @ObfuscatedName("ai.bp")
    public int field759;

    @ObfuscatedName("ai.bt")
    public int field753;

    @ObfuscatedName("ai.bz")
    public int field754;

    @ObfuscatedName("ai.bf")
    public int field755;

    @ObfuscatedName("ai.bv")
    public int field756;

    @ObfuscatedName("ai.by")
    public int field757;

    @ObfuscatedName("ai.bc")
    public int field758;

    @ObfuscatedName("ai.bo")
    public int field752 = 0;

    @ObfuscatedName("ai.bb")
    public int field744 = 200;

    @ObfuscatedName("ai.bi")
    public int field761;

    @ObfuscatedName("ai.bu")
    public int field728 = 0;

    @ObfuscatedName("ai.be")
    public int field763 = 32;

    @ObfuscatedName("ai.bk")
    public int field764 = 0;

    @ObfuscatedName("ai.bg")
    public int[] field766 = new int[10];

    @ObfuscatedName("ai.bs")
    public int[] field712 = new int[10];

    @ObfuscatedName("ai.bj")
    public boolean[] field767 = new boolean[10];

    @ObfuscatedName("ai.br")
    public int field768 = 0;

    @ObfuscatedName("ai.bx")
    public int field769 = 0;

    @ObfuscatedName("ai.a(IIZI)V")
    public final void method566(int arg0, int arg1, boolean arg2) {
        if (this.field742 != -1 && class38.method1866(this.field742).field892 == 1) {
            this.field742 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field766[0];
            int var5 = arg1 - this.field712[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field764 < 9) {
                    this.field764++;
                }
                for (int var6 = this.field764; var6 > 0; var6--) {
                    this.field766[var6] = this.field766[var6 - 1];
                    this.field712[var6] = this.field712[var6 - 1];
                    this.field767[var6] = this.field767[var6 - 1];
                }
                this.field766[0] = arg0;
                this.field712[0] = arg1;
                this.field767[0] = false;
                return;
            }
        }
        this.field764 = 0;
        this.field769 = 0;
        this.field768 = 0;
        this.field766[0] = arg0;
        this.field712[0] = arg1;
        this.field746 = this.field766[0] * 128 + this.field716 * 64;
        this.field713 = this.field712[0] * 128 + this.field716 * 64;
    }

    @ObfuscatedName("ai.x(IZI)V")
    public final void method567(int arg0, boolean arg1) {
        int var3 = this.field766[0];
        int var4 = this.field712[0];
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
        if (this.field742 != -1 && class38.method1866(this.field742).field892 == 1) {
            this.field742 = -1;
        }
        if (this.field764 < 9) {
            this.field764++;
        }
        for (int var5 = this.field764; var5 > 0; var5--) {
            this.field766[var5] = this.field766[var5 - 1];
            this.field712[var5] = this.field712[var5 - 1];
            this.field767[var5] = this.field767[var5 - 1];
        }
        this.field766[0] = var3;
        this.field712[0] = var4;
        this.field767[0] = arg1;
    }

    @ObfuscatedName("ai.r(B)V")
    public final void method570() {
        this.field764 = 0;
        this.field769 = 0;
    }

    @ObfuscatedName("ai.k(B)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("ai.w(IIIB)V")
    public final void method569(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field732[var4] <= arg2) {
                this.field730[var4] = arg0;
                this.field731[var4] = arg1;
                this.field732[var4] = arg2 + 70;
                return;
            }
        }
    }
}
