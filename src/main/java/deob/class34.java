package deob;

@ObfuscatedName("al")
public abstract class class34 extends class79 {

    @ObfuscatedName("al.c")
    public int field731;

    @ObfuscatedName("al.j")
    public int field787;

    @ObfuscatedName("al.d")
    public int field761;

    @ObfuscatedName("al.l")
    public boolean field729 = false;

    @ObfuscatedName("al.u")
    public int field730 = 1;

    @ObfuscatedName("al.r")
    public int field783 = -1;

    @ObfuscatedName("al.an")
    public int field732 = -1;

    @ObfuscatedName("al.ao")
    public int field764 = -1;

    @ObfuscatedName("al.ah")
    public int field734 = -1;

    @ObfuscatedName("al.ai")
    public int field728 = -1;

    @ObfuscatedName("al.aa")
    public int field781 = -1;

    @ObfuscatedName("al.ag")
    public int field737 = -1;

    @ObfuscatedName("al.ar")
    public int field744 = -1;

    @ObfuscatedName("al.al")
    public String field739 = null;

    @ObfuscatedName("al.ae")
    public boolean field738;

    @ObfuscatedName("al.ak")
    public boolean field741 = false;

    @ObfuscatedName("al.at")
    public int field735 = 100;

    @ObfuscatedName("al.am")
    public int field743 = 0;

    @ObfuscatedName("al.aw")
    public int field733 = 0;

    @ObfuscatedName("al.aq")
    public int[] field753 = new int[4];

    @ObfuscatedName("al.ac")
    public int[] field746 = new int[4];

    @ObfuscatedName("al.aj")
    public int[] field742 = new int[4];

    @ObfuscatedName("al.av")
    public int field748 = -1000;

    @ObfuscatedName("al.ax")
    public int field760;

    @ObfuscatedName("al.ap")
    public int field750;

    @ObfuscatedName("al.af")
    public int field751 = -1;

    @ObfuscatedName("al.az")
    public int field745 = 0;

    @ObfuscatedName("al.ay")
    public int field757 = 0;

    @ObfuscatedName("al.au")
    public int field754 = -1;

    @ObfuscatedName("al.ab")
    public int field766 = 0;

    @ObfuscatedName("al.ad")
    public int field740 = 0;

    @ObfuscatedName("al.bq")
    public int field747 = -1;

    @ObfuscatedName("al.bc")
    public int field758 = 0;

    @ObfuscatedName("al.bj")
    public int field759 = 0;

    @ObfuscatedName("al.bm")
    public int field756 = 0;

    @ObfuscatedName("al.bx")
    public int field755 = 0;

    @ObfuscatedName("al.bi")
    public int field762 = -1;

    @ObfuscatedName("al.bp")
    public int field763 = 0;

    @ObfuscatedName("al.ba")
    public int field749 = 0;

    @ObfuscatedName("al.be")
    public int field765;

    @ObfuscatedName("al.bt")
    public int field736;

    @ObfuscatedName("al.bo")
    public int field767;

    @ObfuscatedName("al.bz")
    public int field768;

    @ObfuscatedName("al.bb")
    public int field769;

    @ObfuscatedName("al.bk")
    public int field770;

    @ObfuscatedName("al.bh")
    public int field771;

    @ObfuscatedName("al.br")
    public int field772;

    @ObfuscatedName("al.bd")
    public int field773;

    @ObfuscatedName("al.bw")
    public int field774 = 0;

    @ObfuscatedName("al.bu")
    public int field775 = 200;

    @ObfuscatedName("al.bg")
    public int field776;

    @ObfuscatedName("al.by")
    public int field777 = 0;

    @ObfuscatedName("al.bs")
    public int field778 = 32;

    @ObfuscatedName("al.bf")
    public int field779 = 0;

    @ObfuscatedName("al.bl")
    public int[] field780 = new int[10];

    @ObfuscatedName("al.bn")
    public int[] field752 = new int[10];

    @ObfuscatedName("al.bv")
    public boolean[] field782 = new boolean[10];

    @ObfuscatedName("al.ci")
    public int field784 = 0;

    @ObfuscatedName("al.cf")
    public int field727 = 0;

    @ObfuscatedName("al.z(IIZB)V")
    public final void method591(int arg0, int arg1, boolean arg2) {
        if (this.field747 != -1 && class39.method1863(this.field747).field916 == 1) {
            this.field747 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field780[0];
            int var5 = arg1 - this.field752[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field779 < 9) {
                    this.field779++;
                }
                for (int var6 = this.field779; var6 > 0; var6--) {
                    this.field780[var6] = this.field780[var6 - 1];
                    this.field752[var6] = this.field752[var6 - 1];
                    this.field782[var6] = this.field782[var6 - 1];
                }
                this.field780[0] = arg0;
                this.field752[0] = arg1;
                this.field782[0] = false;
                return;
            }
        }
        this.field779 = 0;
        this.field727 = 0;
        this.field784 = 0;
        this.field780[0] = arg0;
        this.field752[0] = arg1;
        this.field731 = this.field780[0] * 128 + this.field730 * 64;
        this.field787 = this.field752[0] * 128 + this.field730 * 64;
    }

    @ObfuscatedName("al.t(IZI)V")
    public final void method600(int arg0, boolean arg1) {
        int var3 = this.field780[0];
        int var4 = this.field752[0];
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
        if (this.field747 != -1 && class39.method1863(this.field747).field916 == 1) {
            this.field747 = -1;
        }
        if (this.field779 < 9) {
            this.field779++;
        }
        for (int var5 = this.field779; var5 > 0; var5--) {
            this.field780[var5] = this.field780[var5 - 1];
            this.field752[var5] = this.field752[var5 - 1];
            this.field782[var5] = this.field782[var5 - 1];
        }
        this.field780[0] = var3;
        this.field752[0] = var4;
        this.field782[0] = arg1;
    }

    @ObfuscatedName("al.y(I)V")
    public final void method592() {
        this.field779 = 0;
        this.field727 = 0;
    }

    @ObfuscatedName("al.i(B)Z")
    public boolean method16() {
        return false;
    }

    @ObfuscatedName("al.w(IIII)V")
    public final void method593(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field742[var4] <= arg2) {
                this.field753[var4] = arg0;
                this.field746[var4] = arg1;
                this.field742[var4] = arg2 + 70;
                return;
            }
        }
    }
}
