package deob;

@ObfuscatedName("ab")
public abstract class class34 extends class79 {

    @ObfuscatedName("ab.o")
    public int field747;

    @ObfuscatedName("ab.z")
    public int field749;

    @ObfuscatedName("ab.d")
    public int field769;

    @ObfuscatedName("ab.y")
    public boolean field736 = false;

    @ObfuscatedName("ab.a")
    public int field737 = 1;

    @ObfuscatedName("ab.n")
    public int field766 = -1;

    @ObfuscatedName("ab.ae")
    public int field790 = -1;

    @ObfuscatedName("ab.ay")
    public int field733 = -1;

    @ObfuscatedName("ab.ac")
    public int field740 = -1;

    @ObfuscatedName("ab.ag")
    public int field742 = -1;

    @ObfuscatedName("ab.am")
    public int field760 = -1;

    @ObfuscatedName("ab.au")
    public int field744 = -1;

    @ObfuscatedName("ab.ai")
    public int field741 = -1;

    @ObfuscatedName("ab.ab")
    public String field738 = null;

    @ObfuscatedName("ab.az")
    public boolean field745;

    @ObfuscatedName("ab.as")
    public boolean field748 = false;

    @ObfuscatedName("ab.ah")
    public int field735 = 100;

    @ObfuscatedName("ab.aw")
    public int field750 = 0;

    @ObfuscatedName("ab.ar")
    public int field751 = 0;

    @ObfuscatedName("ab.ap")
    public int[] field752 = new int[4];

    @ObfuscatedName("ab.ak")
    public int[] field753 = new int[4];

    @ObfuscatedName("ab.aa")
    public int[] field754 = new int[4];

    @ObfuscatedName("ab.av")
    public int field743 = -1000;

    @ObfuscatedName("ab.al")
    public int field756;

    @ObfuscatedName("ab.af")
    public int field757;

    @ObfuscatedName("ab.aj")
    public int field758 = -1;

    @ObfuscatedName("ab.ao")
    public int field746 = 0;

    @ObfuscatedName("ab.an")
    public int field776 = 0;

    @ObfuscatedName("ab.ad")
    public int field761 = -1;

    @ObfuscatedName("ab.aq")
    public int field762 = 0;

    @ObfuscatedName("ab.ax")
    public int field763 = 0;

    @ObfuscatedName("ab.bk")
    public int field764 = -1;

    @ObfuscatedName("ab.by")
    public int field765 = 0;

    @ObfuscatedName("ab.bp")
    public int field782 = 0;

    @ObfuscatedName("ab.bs")
    public int field767 = 0;

    @ObfuscatedName("ab.bn")
    public int field768 = 0;

    @ObfuscatedName("ab.bb")
    public int field786 = -1;

    @ObfuscatedName("ab.bt")
    public int field770 = 0;

    @ObfuscatedName("ab.bj")
    public int field771 = 0;

    @ObfuscatedName("ab.bh")
    public int field772;

    @ObfuscatedName("ab.bw")
    public int field773;

    @ObfuscatedName("ab.bx")
    public int field774;

    @ObfuscatedName("ab.bf")
    public int field775;

    @ObfuscatedName("ab.ba")
    public int field777;

    @ObfuscatedName("ab.bl")
    public int field739;

    @ObfuscatedName("ab.bd")
    public int field778;

    @ObfuscatedName("ab.bz")
    public int field779;

    @ObfuscatedName("ab.br")
    public int field780;

    @ObfuscatedName("ab.be")
    public int field793 = 0;

    @ObfuscatedName("ab.bo")
    public int field734 = 200;

    @ObfuscatedName("ab.bv")
    public int field783;

    @ObfuscatedName("ab.bu")
    public int field784 = 0;

    @ObfuscatedName("ab.bq")
    public int field785 = 32;

    @ObfuscatedName("ab.bg")
    public int field755 = 0;

    @ObfuscatedName("ab.bm")
    public int[] field787 = new int[10];

    @ObfuscatedName("ab.bi")
    public int[] field788 = new int[10];

    @ObfuscatedName("ab.bc")
    public boolean[] field781 = new boolean[10];

    @ObfuscatedName("ab.cj")
    public int field759 = 0;

    @ObfuscatedName("ab.cq")
    public int field791 = 0;

    @ObfuscatedName("ab.g(IIZI)V")
    public final void method619(int arg0, int arg1, boolean arg2) {
        if (this.field764 != -1 && class39.method633(this.field764).field929 == 1) {
            this.field764 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field787[0];
            int var5 = arg1 - this.field788[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field755 < 9) {
                    this.field755++;
                }
                for (int var6 = this.field755; var6 > 0; var6--) {
                    this.field787[var6] = this.field787[var6 - 1];
                    this.field788[var6] = this.field788[var6 - 1];
                    this.field781[var6] = this.field781[var6 - 1];
                }
                this.field787[0] = arg0;
                this.field788[0] = arg1;
                this.field781[0] = false;
                return;
            }
        }
        this.field755 = 0;
        this.field791 = 0;
        this.field759 = 0;
        this.field787[0] = arg0;
        this.field788[0] = arg1;
        this.field747 = this.field787[0] * 128 + this.field737 * 64;
        this.field749 = this.field788[0] * 128 + this.field737 * 64;
    }

    @ObfuscatedName("ab.s(IZI)V")
    public final void method635(int arg0, boolean arg1) {
        int var3 = this.field787[0];
        int var4 = this.field788[0];
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
        if (this.field764 != -1 && class39.method633(this.field764).field929 == 1) {
            this.field764 = -1;
        }
        if (this.field755 < 9) {
            this.field755++;
        }
        for (int var5 = this.field755; var5 > 0; var5--) {
            this.field787[var5] = this.field787[var5 - 1];
            this.field788[var5] = this.field788[var5 - 1];
            this.field781[var5] = this.field781[var5 - 1];
        }
        this.field787[0] = var3;
        this.field788[0] = var4;
        this.field781[0] = arg1;
    }

    @ObfuscatedName("ab.c(I)V")
    public final void method623() {
        this.field755 = 0;
        this.field791 = 0;
    }

    @ObfuscatedName("ab.m(I)Z")
    public boolean method9() {
        return false;
    }

    @ObfuscatedName("ab.r(IIII)V")
    public final void method621(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field754[var4] <= arg2) {
                this.field752[var4] = arg0;
                this.field753[var4] = arg1;
                this.field754[var4] = arg2 + 70;
                return;
            }
        }
    }
}
