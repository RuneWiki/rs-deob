package deob;

@ObfuscatedName("av")
public abstract class class33 extends class78 {

    @ObfuscatedName("av.n")
    public int field771;

    @ObfuscatedName("av.d")
    public int field721;

    @ObfuscatedName("av.p")
    public int field766;

    @ObfuscatedName("av.z")
    public boolean field739 = false;

    @ObfuscatedName("av.q")
    public int field764 = 1;

    @ObfuscatedName("av.i")
    public int field756 = -1;

    @ObfuscatedName("av.ah")
    public int field726 = -1;

    @ObfuscatedName("av.aj")
    public int field727 = -1;

    @ObfuscatedName("av.aq")
    public int field728 = -1;

    @ObfuscatedName("av.aa")
    public int field729 = -1;

    @ObfuscatedName("av.ar")
    public int field768 = -1;

    @ObfuscatedName("av.at")
    public int field731 = -1;

    @ObfuscatedName("av.av")
    public int field730 = -1;

    @ObfuscatedName("av.af")
    public String field748 = null;

    @ObfuscatedName("av.ap")
    public boolean field734;

    @ObfuscatedName("av.ao")
    public boolean field735 = false;

    @ObfuscatedName("av.az")
    public int field736 = 100;

    @ObfuscatedName("av.ac")
    public int field737 = 0;

    @ObfuscatedName("av.ad")
    public int field738 = 0;

    @ObfuscatedName("av.ay")
    public int[] field777 = new int[4];

    @ObfuscatedName("av.ag")
    public int[] field740 = new int[4];

    @ObfuscatedName("av.ak")
    public int[] field741 = new int[4];

    @ObfuscatedName("av.an")
    public int field742 = -1000;

    @ObfuscatedName("av.ab")
    public int field743;

    @ObfuscatedName("av.am")
    public int field744;

    @ObfuscatedName("av.aw")
    public int field745 = -1;

    @ObfuscatedName("av.as")
    public int field746 = 0;

    @ObfuscatedName("av.au")
    public int field755 = 0;

    @ObfuscatedName("av.ax")
    public int field770 = -1;

    @ObfuscatedName("av.ae")
    public int field749 = 0;

    @ObfuscatedName("av.ai")
    public int field750 = 0;

    @ObfuscatedName("av.bc")
    public int field751 = -1;

    @ObfuscatedName("av.bg")
    public int field752 = 0;

    @ObfuscatedName("av.bb")
    public int field778 = 0;

    @ObfuscatedName("av.bi")
    public int field754 = 0;

    @ObfuscatedName("av.by")
    public int field759 = 0;

    @ObfuscatedName("av.bf")
    public int field723 = -1;

    @ObfuscatedName("av.bs")
    public int field757 = 0;

    @ObfuscatedName("av.bw")
    public int field758 = 0;

    @ObfuscatedName("av.bo")
    public int field732;

    @ObfuscatedName("av.be")
    public int field760;

    @ObfuscatedName("av.bu")
    public int field747;

    @ObfuscatedName("av.bk")
    public int field762;

    @ObfuscatedName("av.bm")
    public int field763;

    @ObfuscatedName("av.bx")
    public int field733;

    @ObfuscatedName("av.bj")
    public int field765;

    @ObfuscatedName("av.bp")
    public int field753;

    @ObfuscatedName("av.bn")
    public int field767;

    @ObfuscatedName("av.br")
    public int field776 = 0;

    @ObfuscatedName("av.bt")
    public int field769 = 200;

    @ObfuscatedName("av.bv")
    public int field720;

    @ObfuscatedName("av.ba")
    public int field724 = 0;

    @ObfuscatedName("av.bq")
    public int field722 = 32;

    @ObfuscatedName("av.bd")
    public int field773 = 0;

    @ObfuscatedName("av.bl")
    public int[] field774 = new int[10];

    @ObfuscatedName("av.bz")
    public int[] field775 = new int[10];

    @ObfuscatedName("av.bh")
    public boolean[] field779 = new boolean[10];

    @ObfuscatedName("av.cb")
    public int field725 = 0;

    @ObfuscatedName("av.cj")
    public int field761 = 0;

    @ObfuscatedName("av.o(IIZI)V")
    public final void method605(int arg0, int arg1, boolean arg2) {
        if (this.field751 != -1 && class38.method114(this.field751).field908 == 1) {
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
                    this.field779[var6] = this.field779[var6 - 1];
                }
                this.field774[0] = arg0;
                this.field775[0] = arg1;
                this.field779[0] = false;
                return;
            }
        }
        this.field773 = 0;
        this.field761 = 0;
        this.field725 = 0;
        this.field774[0] = arg0;
        this.field775[0] = arg1;
        this.field771 = this.field774[0] * 128 + this.field764 * 64;
        this.field721 = this.field775[0] * 128 + this.field764 * 64;
    }

    @ObfuscatedName("av.a(IZI)V")
    public final void method598(int arg0, boolean arg1) {
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
        if (this.field751 != -1 && class38.method114(this.field751).field908 == 1) {
            this.field751 = -1;
        }
        if (this.field773 < 9) {
            this.field773++;
        }
        for (int var5 = this.field773; var5 > 0; var5--) {
            this.field774[var5] = this.field774[var5 - 1];
            this.field775[var5] = this.field775[var5 - 1];
            this.field779[var5] = this.field779[var5 - 1];
        }
        this.field774[0] = var3;
        this.field775[0] = var4;
        this.field779[0] = arg1;
    }

    @ObfuscatedName("av.f(I)V")
    public final void method599() {
        this.field773 = 0;
        this.field761 = 0;
    }

    @ObfuscatedName("av.h(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("av.r(IIII)V")
    public final void method597(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field741[var4] <= arg2) {
                this.field777[var4] = arg0;
                this.field740[var4] = arg1;
                this.field741[var4] = arg2 + 70;
                return;
            }
        }
    }
}
