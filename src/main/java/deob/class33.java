package deob;

@ObfuscatedName("aw")
public abstract class class33 extends class78 {

    @ObfuscatedName("aw.m")
    public int field777;

    @ObfuscatedName("aw.o")
    public int field722;

    @ObfuscatedName("aw.b")
    public int field728;

    @ObfuscatedName("aw.c")
    public boolean field731 = false;

    @ObfuscatedName("aw.w")
    public int field732 = 1;

    @ObfuscatedName("aw.u")
    public int field726 = -1;

    @ObfuscatedName("aw.ac")
    public int field727 = -1;

    @ObfuscatedName("aw.ap")
    public int field753 = -1;

    @ObfuscatedName("aw.ai")
    public int field740 = -1;

    @ObfuscatedName("aw.as")
    public int field730 = -1;

    @ObfuscatedName("aw.aa")
    public int field759 = -1;

    @ObfuscatedName("aw.aq")
    public int field761 = -1;

    @ObfuscatedName("aw.aw")
    public int field733 = -1;

    @ObfuscatedName("aw.am")
    public String field742 = null;

    @ObfuscatedName("aw.av")
    public boolean field735;

    @ObfuscatedName("aw.an")
    public int field736 = 100;

    @ObfuscatedName("aw.at")
    public int field760 = 0;

    @ObfuscatedName("aw.ao")
    public int field738 = 0;

    @ObfuscatedName("aw.ax")
    public int[] field741 = new int[4];

    @ObfuscatedName("aw.ay")
    public int[] field739 = new int[4];

    @ObfuscatedName("aw.ab")
    public int[] field752 = new int[4];

    @ObfuscatedName("aw.al")
    public int field725 = -1000;

    @ObfuscatedName("aw.ae")
    public int field743;

    @ObfuscatedName("aw.af")
    public int field744;

    @ObfuscatedName("aw.aj")
    public int field745 = -1;

    @ObfuscatedName("aw.ah")
    public int field746 = 0;

    @ObfuscatedName("aw.au")
    public int field770 = 0;

    @ObfuscatedName("aw.ad")
    public int field748 = -1;

    @ObfuscatedName("aw.az")
    public int field749 = 0;

    @ObfuscatedName("aw.ak")
    public int field750 = 0;

    @ObfuscatedName("aw.ar")
    public int field751 = -1;

    @ObfuscatedName("aw.bu")
    public int field724 = 0;

    @ObfuscatedName("aw.bo")
    public int field779 = 0;

    @ObfuscatedName("aw.be")
    public int field754 = 0;

    @ObfuscatedName("aw.bq")
    public int field755 = 0;

    @ObfuscatedName("aw.bh")
    public int field756 = -1;

    @ObfuscatedName("aw.bc")
    public int field757 = 0;

    @ObfuscatedName("aw.ba")
    public int field758 = 0;

    @ObfuscatedName("aw.bn")
    public int field764;

    @ObfuscatedName("aw.bx")
    public int field771;

    @ObfuscatedName("aw.by")
    public int field729;

    @ObfuscatedName("aw.bs")
    public int field762;

    @ObfuscatedName("aw.bv")
    public int field763;

    @ObfuscatedName("aw.bm")
    public int field734;

    @ObfuscatedName("aw.br")
    public int field765;

    @ObfuscatedName("aw.bd")
    public int field766;

    @ObfuscatedName("aw.bz")
    public int field767;

    @ObfuscatedName("aw.bf")
    public int field768 = 0;

    @ObfuscatedName("aw.bg")
    public int field769 = 200;

    @ObfuscatedName("aw.bp")
    public int field737;

    @ObfuscatedName("aw.bk")
    public int field780 = 0;

    @ObfuscatedName("aw.bl")
    public int field772 = 32;

    @ObfuscatedName("aw.bt")
    public int field773 = 0;

    @ObfuscatedName("aw.bi")
    public int[] field774 = new int[10];

    @ObfuscatedName("aw.bb")
    public int[] field775 = new int[10];

    @ObfuscatedName("aw.bw")
    public boolean[] field776 = new boolean[10];

    @ObfuscatedName("aw.bj")
    public int field721 = 0;

    @ObfuscatedName("aw.cm")
    public int field778 = 0;

    @ObfuscatedName("aw.y(IIZI)V")
    public final void method594(int arg0, int arg1, boolean arg2) {
        if (this.field751 != -1 && class38.method1996(this.field751).field900 == 1) {
            this.field751 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field774[0];
            int var5 = arg1 - this.field775[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field773 < 9) {
                    this.field773++;
                }
                for (int var6 = this.field773; var6 > 0; var6--) {
                    this.field774[var6] = this.field774[var6 - 1];
                    this.field775[var6] = this.field775[var6 - 1];
                    this.field776[var6] = this.field776[var6 - 1];
                }
                this.field774[0] = arg0;
                this.field775[0] = arg1;
                this.field776[0] = false;
                return;
            }
        }
        this.field773 = 0;
        this.field778 = 0;
        this.field721 = 0;
        this.field774[0] = arg0;
        this.field775[0] = arg1;
        this.field777 = this.field774[0] * 128 + this.field732 * 64;
        this.field722 = this.field775[0] * 128 + this.field732 * 64;
    }

    @ObfuscatedName("aw.p(IZI)V")
    public final void method595(int arg0, boolean arg1) {
        int var3 = this.field774[0];
        int var4 = this.field775[0];
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
        if (this.field751 != -1 && class38.method1996(this.field751).field900 == 1) {
            this.field751 = -1;
        }
        if (this.field773 < 9) {
            this.field773++;
        }
        for (int var5 = this.field773; var5 > 0; var5--) {
            this.field774[var5] = this.field774[var5 - 1];
            this.field775[var5] = this.field775[var5 - 1];
            this.field776[var5] = this.field776[var5 - 1];
        }
        this.field774[0] = var3;
        this.field775[0] = var4;
        this.field776[0] = arg1;
    }

    @ObfuscatedName("aw.q(I)V")
    public final void method597() {
        this.field773 = 0;
        this.field778 = 0;
    }

    @ObfuscatedName("aw.z(I)Z")
    public boolean method15() {
        return false;
    }

    @ObfuscatedName("aw.t(IIIB)V")
    public final void method598(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field752[var4] <= arg2) {
                this.field741[var4] = arg0;
                this.field739[var4] = arg1;
                this.field752[var4] = arg2 + 70;
                return;
            }
        }
    }
}
