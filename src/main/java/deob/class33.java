package deob;

@ObfuscatedName("az")
public abstract class class33 extends class78 {

    @ObfuscatedName("az.x")
    public int field729;

    @ObfuscatedName("az.e")
    public int field761;

    @ObfuscatedName("az.a")
    public int field740;

    @ObfuscatedName("az.y")
    public boolean field721 = false;

    @ObfuscatedName("az.f")
    public int field722 = 1;

    @ObfuscatedName("az.u")
    public int field756 = -1;

    @ObfuscatedName("az.ab")
    public int field724 = -1;

    @ObfuscatedName("az.ai")
    public int field766 = -1;

    @ObfuscatedName("az.aj")
    public int field726 = -1;

    @ObfuscatedName("az.as")
    public int field727 = -1;

    @ObfuscatedName("az.ax")
    public int field728 = -1;

    @ObfuscatedName("az.ac")
    public int field731 = -1;

    @ObfuscatedName("az.az")
    public int field747 = -1;

    @ObfuscatedName("az.au")
    public String field757 = null;

    @ObfuscatedName("az.av")
    public boolean field758;

    @ObfuscatedName("az.am")
    public int field719 = 100;

    @ObfuscatedName("az.ao")
    public int field734 = 0;

    @ObfuscatedName("az.aq")
    public int field735 = 0;

    @ObfuscatedName("az.an")
    public int[] field736 = new int[4];

    @ObfuscatedName("az.ak")
    public int[] field737 = new int[4];

    @ObfuscatedName("az.ae")
    public int[] field738 = new int[4];

    @ObfuscatedName("az.ad")
    public int field772 = -1000;

    @ObfuscatedName("az.aw")
    public int field723;

    @ObfuscatedName("az.ah")
    public int field741;

    @ObfuscatedName("az.at")
    public int field771 = -1;

    @ObfuscatedName("az.aa")
    public int field764 = 0;

    @ObfuscatedName("az.ar")
    public int field744 = 0;

    @ObfuscatedName("az.ap")
    public int field745 = -1;

    @ObfuscatedName("az.ag")
    public int field746 = 0;

    @ObfuscatedName("az.af")
    public int field743 = 0;

    @ObfuscatedName("az.al")
    public int field748 = -1;

    @ObfuscatedName("az.bq")
    public int field730 = 0;

    @ObfuscatedName("az.bc")
    public int field769 = 0;

    @ObfuscatedName("az.bf")
    public int field750 = 0;

    @ObfuscatedName("az.bk")
    public int field752 = 0;

    @ObfuscatedName("az.bn")
    public int field753 = -1;

    @ObfuscatedName("az.bp")
    public int field754 = 0;

    @ObfuscatedName("az.bx")
    public int field755 = 0;

    @ObfuscatedName("az.bm")
    public int field739;

    @ObfuscatedName("az.ba")
    public int field725;

    @ObfuscatedName("az.be")
    public int field760;

    @ObfuscatedName("az.bl")
    public int field759;

    @ObfuscatedName("az.bt")
    public int field749;

    @ObfuscatedName("az.bw")
    public int field718;

    @ObfuscatedName("az.bv")
    public int field762;

    @ObfuscatedName("az.by")
    public int field763;

    @ObfuscatedName("az.bi")
    public int field732;

    @ObfuscatedName("az.bd")
    public int field765 = 0;

    @ObfuscatedName("az.bu")
    public int field751 = 200;

    @ObfuscatedName("az.bj")
    public int field767;

    @ObfuscatedName("az.br")
    public int field768 = 0;

    @ObfuscatedName("az.bg")
    public int field742 = 32;

    @ObfuscatedName("az.bb")
    public int field770 = 0;

    @ObfuscatedName("az.bz")
    public int[] field720 = new int[10];

    @ObfuscatedName("az.bo")
    public int[] field733 = new int[10];

    @ObfuscatedName("az.bh")
    public boolean[] field773 = new boolean[10];

    @ObfuscatedName("az.bs")
    public int field774 = 0;

    @ObfuscatedName("az.cb")
    public int field775 = 0;

    @ObfuscatedName("az.p(IIZI)V")
    public final void method590(int arg0, int arg1, boolean arg2) {
        if (this.field748 != -1 && class38.method1935(this.field748).field910 == 1) {
            this.field748 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field720[0];
            int var5 = arg1 - this.field733[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field770 < 9) {
                    this.field770++;
                }
                for (int var6 = this.field770; var6 > 0; var6--) {
                    this.field720[var6] = this.field720[var6 - 1];
                    this.field733[var6] = this.field733[var6 - 1];
                    this.field773[var6] = this.field773[var6 - 1];
                }
                this.field720[0] = arg0;
                this.field733[0] = arg1;
                this.field773[0] = false;
                return;
            }
        }
        this.field770 = 0;
        this.field775 = 0;
        this.field774 = 0;
        this.field720[0] = arg0;
        this.field733[0] = arg1;
        this.field729 = this.field720[0] * 128 + this.field722 * 64;
        this.field761 = this.field733[0] * 128 + this.field722 * 64;
    }

    @ObfuscatedName("az.r(IZB)V")
    public final void method595(int arg0, boolean arg1) {
        int var3 = this.field720[0];
        int var4 = this.field733[0];
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
        if (this.field748 != -1 && class38.method1935(this.field748).field910 == 1) {
            this.field748 = -1;
        }
        if (this.field770 < 9) {
            this.field770++;
        }
        for (int var5 = this.field770; var5 > 0; var5--) {
            this.field720[var5] = this.field720[var5 - 1];
            this.field733[var5] = this.field733[var5 - 1];
            this.field773[var5] = this.field773[var5 - 1];
        }
        this.field720[0] = var3;
        this.field733[0] = var4;
        this.field773[0] = arg1;
    }

    @ObfuscatedName("az.j(I)V")
    public final void method592() {
        this.field770 = 0;
        this.field775 = 0;
    }

    @ObfuscatedName("az.v(I)Z")
    public boolean method28() {
        return false;
    }

    @ObfuscatedName("az.c(IIII)V")
    public final void method589(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field738[var4] <= arg2) {
                this.field736[var4] = arg0;
                this.field737[var4] = arg1;
                this.field738[var4] = arg2 + 70;
                return;
            }
        }
    }
}
