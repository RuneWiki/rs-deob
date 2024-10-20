package deob;

@ObfuscatedName("ab")
public abstract class class35 extends class80 {

    @ObfuscatedName("ab.b")
    public int field767;

    @ObfuscatedName("ab.x")
    public int field722;

    @ObfuscatedName("ab.n")
    public int field725;

    @ObfuscatedName("ab.v")
    public boolean field724 = false;

    @ObfuscatedName("ab.p")
    public int field775 = 1;

    @ObfuscatedName("ab.k")
    public int field761 = -1;

    @ObfuscatedName("ab.ax")
    public int field727 = -1;

    @ObfuscatedName("ab.ap")
    public int field728 = -1;

    @ObfuscatedName("ab.ao")
    public int field729 = -1;

    @ObfuscatedName("ab.ai")
    public int field749 = -1;

    @ObfuscatedName("ab.aw")
    public int field758 = -1;

    @ObfuscatedName("ab.am")
    public int field732 = -1;

    @ObfuscatedName("ab.au")
    public int field733 = -1;

    @ObfuscatedName("ab.ae")
    public String field736 = null;

    @ObfuscatedName("ab.ab")
    public boolean field741;

    @ObfuscatedName("ab.av")
    public boolean field777 = false;

    @ObfuscatedName("ab.ay")
    public int field737 = 100;

    @ObfuscatedName("ab.ag")
    public int field738 = 0;

    @ObfuscatedName("ab.aj")
    public int field739 = 0;

    @ObfuscatedName("ab.at")
    public int[] field721 = new int[4];

    @ObfuscatedName("ab.al")
    public int[] field744 = new int[4];

    @ObfuscatedName("ab.ak")
    public int[] field743 = new int[4];

    @ObfuscatedName("ab.ar")
    public int field730 = -1000;

    @ObfuscatedName("ab.aq")
    public int field745;

    @ObfuscatedName("ab.ac")
    public int field781;

    @ObfuscatedName("ab.ad")
    public int field731 = -1;

    @ObfuscatedName("ab.an")
    public int field748 = 0;

    @ObfuscatedName("ab.az")
    public int field734 = 0;

    @ObfuscatedName("ab.af")
    public int field750 = -1;

    @ObfuscatedName("ab.as")
    public int field751 = 0;

    @ObfuscatedName("ab.aa")
    public int field752 = 0;

    @ObfuscatedName("ab.bl")
    public int field782 = -1;

    @ObfuscatedName("ab.bk")
    public int field754 = 0;

    @ObfuscatedName("ab.bm")
    public int field755 = 0;

    @ObfuscatedName("ab.bw")
    public int field756 = 0;

    @ObfuscatedName("ab.bp")
    public int field757 = 0;

    @ObfuscatedName("ab.be")
    public int field774 = -1;

    @ObfuscatedName("ab.bv")
    public int field759 = 0;

    @ObfuscatedName("ab.bc")
    public int field735 = 0;

    @ObfuscatedName("ab.br")
    public int field742;

    @ObfuscatedName("ab.bu")
    public int field747;

    @ObfuscatedName("ab.ba")
    public int field763;

    @ObfuscatedName("ab.bf")
    public int field762;

    @ObfuscatedName("ab.bx")
    public int field765;

    @ObfuscatedName("ab.bd")
    public int field766;

    @ObfuscatedName("ab.bb")
    public int field726;

    @ObfuscatedName("ab.bj")
    public int field746;

    @ObfuscatedName("ab.bq")
    public int field769;

    @ObfuscatedName("ab.bn")
    public int field770 = 0;

    @ObfuscatedName("ab.bi")
    public int field771 = 200;

    @ObfuscatedName("ab.by")
    public int field772;

    @ObfuscatedName("ab.bz")
    public int field773 = 0;

    @ObfuscatedName("ab.bh")
    public int field753 = 32;

    @ObfuscatedName("ab.bt")
    public int field764 = 0;

    @ObfuscatedName("ab.bs")
    public int[] field776 = new int[10];

    @ObfuscatedName("ab.bo")
    public int[] field723 = new int[10];

    @ObfuscatedName("ab.bg")
    public boolean[] field778 = new boolean[10];

    @ObfuscatedName("ab.cf")
    public int field779 = 0;

    @ObfuscatedName("ab.ch")
    public int field780 = 0;

    @ObfuscatedName("ab.t(IIZI)V")
    public final void method633(int arg0, int arg1, boolean arg2) {
        if (this.field782 != -1 && class40.method1826(this.field782).field910 == 1) {
            this.field782 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field776[0];
            int var5 = arg1 - this.field723[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field764 < 9) {
                    this.field764++;
                }
                for (int var6 = this.field764; var6 > 0; var6--) {
                    this.field776[var6] = this.field776[var6 - 1];
                    this.field723[var6] = this.field723[var6 - 1];
                    this.field778[var6] = this.field778[var6 - 1];
                }
                this.field776[0] = arg0;
                this.field723[0] = arg1;
                this.field778[0] = false;
                return;
            }
        }
        this.field764 = 0;
        this.field780 = 0;
        this.field779 = 0;
        this.field776[0] = arg0;
        this.field723[0] = arg1;
        this.field767 = this.field776[0] * 128 + this.field775 * 64;
        this.field722 = this.field723[0] * 128 + this.field775 * 64;
    }

    @ObfuscatedName("ab.z(IZI)V")
    public final void method634(int arg0, boolean arg1) {
        int var3 = this.field776[0];
        int var4 = this.field723[0];
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
        if (this.field782 != -1 && class40.method1826(this.field782).field910 == 1) {
            this.field782 = -1;
        }
        if (this.field764 < 9) {
            this.field764++;
        }
        for (int var5 = this.field764; var5 > 0; var5--) {
            this.field776[var5] = this.field776[var5 - 1];
            this.field723[var5] = this.field723[var5 - 1];
            this.field778[var5] = this.field778[var5 - 1];
        }
        this.field776[0] = var3;
        this.field723[0] = var4;
        this.field778[0] = arg1;
    }

    @ObfuscatedName("ab.y(I)V")
    public final void method642() {
        this.field764 = 0;
        this.field780 = 0;
    }

    @ObfuscatedName("ab.l(I)Z")
    public boolean method25() {
        return false;
    }

    @ObfuscatedName("ab.q(IIIB)V")
    public final void method638(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field743[var4] <= arg2) {
                this.field721[var4] = arg0;
                this.field744[var4] = arg1;
                this.field743[var4] = arg2 + 70;
                return;
            }
        }
    }
}
