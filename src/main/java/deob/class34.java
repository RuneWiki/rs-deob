package deob;

@ObfuscatedName("ab")
public abstract class class34 extends class79 {

    @ObfuscatedName("ab.x")
    public int field746;

    @ObfuscatedName("ab.n")
    public int field752;

    @ObfuscatedName("ab.v")
    public int field703;

    @ObfuscatedName("ab.l")
    public boolean field704 = false;

    @ObfuscatedName("ab.t")
    public int field705 = 1;

    @ObfuscatedName("ab.i")
    public int field706 = -1;

    @ObfuscatedName("ab.aw")
    public int field707 = -1;

    @ObfuscatedName("ab.ar")
    public int field708 = -1;

    @ObfuscatedName("ab.af")
    public int field754 = -1;

    @ObfuscatedName("ab.am")
    public int field757 = -1;

    @ObfuscatedName("ab.ax")
    public int field709 = -1;

    @ObfuscatedName("ab.av")
    public int field721 = -1;

    @ObfuscatedName("ab.al")
    public int field749 = -1;

    @ObfuscatedName("ab.ab")
    public String field714 = null;

    @ObfuscatedName("ab.ac")
    public boolean field715;

    @ObfuscatedName("ab.aq")
    public boolean field753 = false;

    @ObfuscatedName("ab.az")
    public int field717 = 100;

    @ObfuscatedName("ab.ah")
    public int field718 = 0;

    @ObfuscatedName("ab.at")
    public int field719 = 0;

    @ObfuscatedName("ab.as")
    public int[] field720 = new int[4];

    @ObfuscatedName("ab.au")
    public int[] field701 = new int[4];

    @ObfuscatedName("ab.ag")
    public int[] field722 = new int[4];

    @ObfuscatedName("ab.an")
    public int field723 = -1000;

    @ObfuscatedName("ab.ad")
    public int field724;

    @ObfuscatedName("ab.ae")
    public int field725;

    @ObfuscatedName("ab.ak")
    public int field726 = -1;

    @ObfuscatedName("ab.ay")
    public int field727 = 0;

    @ObfuscatedName("ab.ao")
    public int field728 = 0;

    @ObfuscatedName("ab.ai")
    public int field729 = -1;

    @ObfuscatedName("ab.aa")
    public int field730 = 0;

    @ObfuscatedName("ab.aj")
    public int field731 = 0;

    @ObfuscatedName("ab.be")
    public int field732 = -1;

    @ObfuscatedName("ab.bi")
    public int field702 = 0;

    @ObfuscatedName("ab.bn")
    public int field734 = 0;

    @ObfuscatedName("ab.bt")
    public int field760 = 0;

    @ObfuscatedName("ab.bk")
    public int field740 = 0;

    @ObfuscatedName("ab.br")
    public int field738 = -1;

    @ObfuscatedName("ab.bg")
    public int field762 = 0;

    @ObfuscatedName("ab.bp")
    public int field737 = 0;

    @ObfuscatedName("ab.bw")
    public int field711;

    @ObfuscatedName("ab.bu")
    public int field741;

    @ObfuscatedName("ab.bb")
    public int field742;

    @ObfuscatedName("ab.bj")
    public int field743;

    @ObfuscatedName("ab.bc")
    public int field712;

    @ObfuscatedName("ab.bo")
    public int field745;

    @ObfuscatedName("ab.bd")
    public int field733;

    @ObfuscatedName("ab.bz")
    public int field735;

    @ObfuscatedName("ab.bs")
    public int field748;

    @ObfuscatedName("ab.bx")
    public int field736 = 0;

    @ObfuscatedName("ab.bl")
    public int field750 = 200;

    @ObfuscatedName("ab.bm")
    public int field716;

    @ObfuscatedName("ab.bq")
    public int field739 = 0;

    @ObfuscatedName("ab.bh")
    public int field710 = 32;

    @ObfuscatedName("ab.bf")
    public int field751 = 0;

    @ObfuscatedName("ab.by")
    public int[] field755 = new int[10];

    @ObfuscatedName("ab.bv")
    public int[] field756 = new int[10];

    @ObfuscatedName("ab.ba")
    public boolean[] field747 = new boolean[10];

    @ObfuscatedName("ab.cc")
    public int field758 = 0;

    @ObfuscatedName("ab.cb")
    public int field759 = 0;

    @ObfuscatedName("ab.k(IIZS)V")
    public final void method637(int arg0, int arg1, boolean arg2) {
        if (this.field732 != -1 && class39.method2920(this.field732).field896 == 1) {
            this.field732 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field755[0];
            int var5 = arg1 - this.field756[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field751 < 9) {
                    this.field751++;
                }
                for (int var6 = this.field751; var6 > 0; var6--) {
                    this.field755[var6] = this.field755[var6 - 1];
                    this.field756[var6] = this.field756[var6 - 1];
                    this.field747[var6] = this.field747[var6 - 1];
                }
                this.field755[0] = arg0;
                this.field756[0] = arg1;
                this.field747[0] = false;
                return;
            }
        }
        this.field751 = 0;
        this.field759 = 0;
        this.field758 = 0;
        this.field755[0] = arg0;
        this.field756[0] = arg1;
        this.field746 = this.field755[0] * 128 + this.field705 * 64;
        this.field752 = this.field756[0] * 128 + this.field705 * 64;
    }

    @ObfuscatedName("ab.s(IZI)V")
    public final void method625(int arg0, boolean arg1) {
        int var3 = this.field755[0];
        int var4 = this.field756[0];
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
        if (this.field732 != -1 && class39.method2920(this.field732).field896 == 1) {
            this.field732 = -1;
        }
        if (this.field751 < 9) {
            this.field751++;
        }
        for (int var5 = this.field751; var5 > 0; var5--) {
            this.field755[var5] = this.field755[var5 - 1];
            this.field756[var5] = this.field756[var5 - 1];
            this.field747[var5] = this.field747[var5 - 1];
        }
        this.field755[0] = var3;
        this.field756[0] = var4;
        this.field747[0] = arg1;
    }

    @ObfuscatedName("ab.h(I)V")
    public final void method638() {
        this.field751 = 0;
        this.field759 = 0;
    }

    @ObfuscatedName("ab.d(I)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("ab.m(IIII)V")
    public final void method627(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field722[var4] <= arg2) {
                this.field720[var4] = arg0;
                this.field701[var4] = arg1;
                this.field722[var4] = arg2 + 70;
                return;
            }
        }
    }
}
