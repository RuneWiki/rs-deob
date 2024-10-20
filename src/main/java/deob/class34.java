package deob;

@ObfuscatedName("aa")
public abstract class class34 extends class79 {

    @ObfuscatedName("aa.h")
    public int field732;

    @ObfuscatedName("aa.k")
    public int field777;

    @ObfuscatedName("aa.v")
    public int field721;

    @ObfuscatedName("aa.m")
    public boolean field723 = false;

    @ObfuscatedName("aa.d")
    public int field743 = 1;

    @ObfuscatedName("aa.q")
    public int field724 = -1;

    @ObfuscatedName("aa.ak")
    public int field725 = -1;

    @ObfuscatedName("aa.ah")
    public int field726 = -1;

    @ObfuscatedName("aa.an")
    public int field722 = -1;

    @ObfuscatedName("aa.aw")
    public int field763 = -1;

    @ObfuscatedName("aa.az")
    public int field773 = -1;

    @ObfuscatedName("aa.ad")
    public int field730 = -1;

    @ObfuscatedName("aa.ag")
    public int field731 = -1;

    @ObfuscatedName("aa.aa")
    public String field750 = null;

    @ObfuscatedName("aa.au")
    public boolean field733;

    @ObfuscatedName("aa.aq")
    public boolean field775 = false;

    @ObfuscatedName("aa.am")
    public int field735 = 100;

    @ObfuscatedName("aa.ax")
    public int field736 = 0;

    @ObfuscatedName("aa.af")
    public int field745 = 0;

    @ObfuscatedName("aa.ao")
    public int[] field738 = new int[4];

    @ObfuscatedName("aa.al")
    public int[] field739 = new int[4];

    @ObfuscatedName("aa.aj")
    public int[] field740 = new int[4];

    @ObfuscatedName("aa.ae")
    public int field719 = -1000;

    @ObfuscatedName("aa.ai")
    public int field742;

    @ObfuscatedName("aa.ay")
    public int field769;

    @ObfuscatedName("aa.ab")
    public int field744 = -1;

    @ObfuscatedName("aa.ar")
    public int field727 = 0;

    @ObfuscatedName("aa.as")
    public int field720 = 0;

    @ObfuscatedName("aa.at")
    public int field728 = -1;

    @ObfuscatedName("aa.ac")
    public int field748 = 0;

    @ObfuscatedName("aa.ap")
    public int field747 = 0;

    @ObfuscatedName("aa.bm")
    public int field760 = -1;

    @ObfuscatedName("aa.bl")
    public int field751 = 0;

    @ObfuscatedName("aa.bh")
    public int field752 = 0;

    @ObfuscatedName("aa.bv")
    public int field753 = 0;

    @ObfuscatedName("aa.be")
    public int field754 = 0;

    @ObfuscatedName("aa.bd")
    public int field755 = -1;

    @ObfuscatedName("aa.ba")
    public int field756 = 0;

    @ObfuscatedName("aa.bn")
    public int field741 = 0;

    @ObfuscatedName("aa.bc")
    public int field768;

    @ObfuscatedName("aa.bk")
    public int field759;

    @ObfuscatedName("aa.bf")
    public int field746;

    @ObfuscatedName("aa.bt")
    public int field761;

    @ObfuscatedName("aa.bo")
    public int field762;

    @ObfuscatedName("aa.bg")
    public int field757;

    @ObfuscatedName("aa.bi")
    public int field729;

    @ObfuscatedName("aa.bx")
    public int field765;

    @ObfuscatedName("aa.bs")
    public int field758;

    @ObfuscatedName("aa.bu")
    public int field767 = 0;

    @ObfuscatedName("aa.bj")
    public int field778 = 200;

    @ObfuscatedName("aa.bb")
    public int field737;

    @ObfuscatedName("aa.bq")
    public int field770 = 0;

    @ObfuscatedName("aa.bp")
    public int field771 = 32;

    @ObfuscatedName("aa.bw")
    public int field772 = 0;

    @ObfuscatedName("aa.br")
    public int[] field749 = new int[10];

    @ObfuscatedName("aa.by")
    public int[] field774 = new int[10];

    @ObfuscatedName("aa.bz")
    public boolean[] field734 = new boolean[10];

    @ObfuscatedName("aa.cc")
    public int field776 = 0;

    @ObfuscatedName("aa.cd")
    public int field766 = 0;

    @ObfuscatedName("aa.u(IIZI)V")
    public final void method609(int arg0, int arg1, boolean arg2) {
        if (this.field760 != -1 && class39.method821(this.field760).field914 == 1) {
            this.field760 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field749[0];
            int var5 = arg1 - this.field774[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field772 < 9) {
                    this.field772++;
                }
                for (int var6 = this.field772; var6 > 0; var6--) {
                    this.field749[var6] = this.field749[var6 - 1];
                    this.field774[var6] = this.field774[var6 - 1];
                    this.field734[var6] = this.field734[var6 - 1];
                }
                this.field749[0] = arg0;
                this.field774[0] = arg1;
                this.field734[0] = false;
                return;
            }
        }
        this.field772 = 0;
        this.field766 = 0;
        this.field776 = 0;
        this.field749[0] = arg0;
        this.field774[0] = arg1;
        this.field732 = this.field749[0] * 128 + this.field743 * 64;
        this.field777 = this.field774[0] * 128 + this.field743 * 64;
    }

    @ObfuscatedName("aa.s(IZI)V")
    public final void method601(int arg0, boolean arg1) {
        int var3 = this.field749[0];
        int var4 = this.field774[0];
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
        if (this.field760 != -1 && class39.method821(this.field760).field914 == 1) {
            this.field760 = -1;
        }
        if (this.field772 < 9) {
            this.field772++;
        }
        for (int var5 = this.field772; var5 > 0; var5--) {
            this.field749[var5] = this.field749[var5 - 1];
            this.field774[var5] = this.field774[var5 - 1];
            this.field734[var5] = this.field734[var5 - 1];
        }
        this.field749[0] = var3;
        this.field774[0] = var4;
        this.field734[0] = arg1;
    }

    @ObfuscatedName("aa.i(B)V")
    public final void method602() {
        this.field772 = 0;
        this.field766 = 0;
    }

    @ObfuscatedName("aa.g(B)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("aa.e(IIII)V")
    public final void method604(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field740[var4] <= arg2) {
                this.field738[var4] = arg0;
                this.field739[var4] = arg1;
                this.field740[var4] = arg2 + 70;
                return;
            }
        }
    }
}
