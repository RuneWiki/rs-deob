package deob;

@ObfuscatedName("as")
public abstract class class34 extends class79 {

    @ObfuscatedName("as.d")
    public int field780;

    @ObfuscatedName("as.m")
    public int field727;

    @ObfuscatedName("as.q")
    public int field729;

    @ObfuscatedName("as.e")
    public boolean field730 = false;

    @ObfuscatedName("as.t")
    public int field731 = 1;

    @ObfuscatedName("as.o")
    public int field732 = -1;

    @ObfuscatedName("as.at")
    public int field733 = -1;

    @ObfuscatedName("as.ag")
    public int field734 = -1;

    @ObfuscatedName("as.ae")
    public int field735 = -1;

    @ObfuscatedName("as.ak")
    public int field736 = -1;

    @ObfuscatedName("as.ap")
    public int field737 = -1;

    @ObfuscatedName("as.ao")
    public int field768 = -1;

    @ObfuscatedName("as.ac")
    public int field752 = -1;

    @ObfuscatedName("as.as")
    public String field740 = null;

    @ObfuscatedName("as.ai")
    public boolean field741;

    @ObfuscatedName("as.ab")
    public boolean field742 = false;

    @ObfuscatedName("as.an")
    public int field743 = 100;

    @ObfuscatedName("as.ah")
    public int field744 = 0;

    @ObfuscatedName("as.ad")
    public int field749 = 0;

    @ObfuscatedName("as.aj")
    public int[] field746 = new int[4];

    @ObfuscatedName("as.am")
    public int[] field728 = new int[4];

    @ObfuscatedName("as.ay")
    public int[] field759 = new int[4];

    @ObfuscatedName("as.au")
    public int field781 = -1000;

    @ObfuscatedName("as.aa")
    public int field750;

    @ObfuscatedName("as.aq")
    public int field773;

    @ObfuscatedName("as.av")
    public int field784 = -1;

    @ObfuscatedName("as.aw")
    public int field739 = 0;

    @ObfuscatedName("as.az")
    public int field770 = 0;

    @ObfuscatedName("as.al")
    public int field747 = -1;

    @ObfuscatedName("as.ar")
    public int field756 = 0;

    @ObfuscatedName("as.ax")
    public int field757 = 0;

    @ObfuscatedName("as.be")
    public int field758 = -1;

    @ObfuscatedName("as.bh")
    public int field738 = 0;

    @ObfuscatedName("as.bn")
    public int field755 = 0;

    @ObfuscatedName("as.by")
    public int field761 = 0;

    @ObfuscatedName("as.bg")
    public int field762 = 0;

    @ObfuscatedName("as.bb")
    public int field763 = -1;

    @ObfuscatedName("as.bm")
    public int field764 = 0;

    @ObfuscatedName("as.bq")
    public int field782 = 0;

    @ObfuscatedName("as.br")
    public int field766;

    @ObfuscatedName("as.bw")
    public int field767;

    @ObfuscatedName("as.bf")
    public int field775;

    @ObfuscatedName("as.bo")
    public int field769;

    @ObfuscatedName("as.bv")
    public int field765;

    @ObfuscatedName("as.bz")
    public int field771;

    @ObfuscatedName("as.bu")
    public int field772;

    @ObfuscatedName("as.bp")
    public int field787;

    @ObfuscatedName("as.ba")
    public int field774;

    @ObfuscatedName("as.bt")
    public int field745 = 0;

    @ObfuscatedName("as.bk")
    public int field748 = 200;

    @ObfuscatedName("as.bc")
    public int field777;

    @ObfuscatedName("as.bj")
    public int field778 = 0;

    @ObfuscatedName("as.bi")
    public int field779 = 32;

    @ObfuscatedName("as.bs")
    public int field754 = 0;

    @ObfuscatedName("as.bx")
    public int[] field760 = new int[10];

    @ObfuscatedName("as.bl")
    public int[] field776 = new int[10];

    @ObfuscatedName("as.bd")
    public boolean[] field783 = new boolean[10];

    @ObfuscatedName("as.cg")
    public int field751 = 0;

    @ObfuscatedName("as.ck")
    public int field785 = 0;

    @ObfuscatedName("as.i(IIZI)V")
    public final void method578(int arg0, int arg1, boolean arg2) {
        if (this.field758 != -1 && class39.method109(this.field758).field911 == 1) {
            this.field758 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field760[0];
            int var5 = arg1 - this.field776[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field754 < 9) {
                    this.field754++;
                }
                for (int var6 = this.field754; var6 > 0; var6--) {
                    this.field760[var6] = this.field760[var6 - 1];
                    this.field776[var6] = this.field776[var6 - 1];
                    this.field783[var6] = this.field783[var6 - 1];
                }
                this.field760[0] = arg0;
                this.field776[0] = arg1;
                this.field783[0] = false;
                return;
            }
        }
        this.field754 = 0;
        this.field785 = 0;
        this.field751 = 0;
        this.field760[0] = arg0;
        this.field776[0] = arg1;
        this.field780 = this.field760[0] * 128 + this.field731 * 64;
        this.field727 = this.field776[0] * 128 + this.field731 * 64;
    }

    @ObfuscatedName("as.x(IZI)V")
    public final void method585(int arg0, boolean arg1) {
        int var3 = this.field760[0];
        int var4 = this.field776[0];
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
        if (this.field758 != -1 && class39.method109(this.field758).field911 == 1) {
            this.field758 = -1;
        }
        if (this.field754 < 9) {
            this.field754++;
        }
        for (int var5 = this.field754; var5 > 0; var5--) {
            this.field760[var5] = this.field760[var5 - 1];
            this.field776[var5] = this.field776[var5 - 1];
            this.field783[var5] = this.field783[var5 - 1];
        }
        this.field760[0] = var3;
        this.field776[0] = var4;
        this.field783[0] = arg1;
    }

    @ObfuscatedName("as.h(S)V")
    public final void method582() {
        this.field754 = 0;
        this.field785 = 0;
    }

    @ObfuscatedName("as.y(I)Z")
    public boolean method10() {
        return false;
    }

    @ObfuscatedName("as.w(IIII)V")
    public final void method579(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field759[var4] <= arg2) {
                this.field746[var4] = arg0;
                this.field728[var4] = arg1;
                this.field759[var4] = arg2 + 70;
                return;
            }
        }
    }
}
