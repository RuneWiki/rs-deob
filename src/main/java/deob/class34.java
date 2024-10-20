package deob;

@ObfuscatedName("au")
public abstract class class34 extends class79 {

    @ObfuscatedName("au.m")
    public int field789;

    @ObfuscatedName("au.q")
    public int field754;

    @ObfuscatedName("au.h")
    public int field768;

    @ObfuscatedName("au.c")
    public boolean field743 = false;

    @ObfuscatedName("au.z")
    public int field793 = 1;

    @ObfuscatedName("au.i")
    public int field745 = -1;

    @ObfuscatedName("au.ah")
    public int field746 = -1;

    @ObfuscatedName("au.aj")
    public int field791 = -1;

    @ObfuscatedName("au.ar")
    public int field748 = -1;

    @ObfuscatedName("au.al")
    public int field797 = -1;

    @ObfuscatedName("au.aw")
    public int field750 = -1;

    @ObfuscatedName("au.ao")
    public int field794 = -1;

    @ObfuscatedName("au.ax")
    public int field752 = -1;

    @ObfuscatedName("au.au")
    public String field753 = null;

    @ObfuscatedName("au.av")
    public boolean field780;

    @ObfuscatedName("au.ae")
    public boolean field755 = false;

    @ObfuscatedName("au.ak")
    public int field756 = 100;

    @ObfuscatedName("au.ay")
    public int field757 = 0;

    @ObfuscatedName("au.at")
    public int field758 = 0;

    @ObfuscatedName("au.an")
    public int[] field771 = new int[4];

    @ObfuscatedName("au.ad")
    public int[] field760 = new int[4];

    @ObfuscatedName("au.ag")
    public int[] field761 = new int[4];

    @ObfuscatedName("au.am")
    public int field749 = -1000;

    @ObfuscatedName("au.ai")
    public int field741;

    @ObfuscatedName("au.ab")
    public int field764;

    @ObfuscatedName("au.af")
    public int field765 = -1;

    @ObfuscatedName("au.ac")
    public int field766 = 0;

    @ObfuscatedName("au.aq")
    public int field767 = 0;

    @ObfuscatedName("au.as")
    public int field778 = -1;

    @ObfuscatedName("au.az")
    public int field769 = 0;

    @ObfuscatedName("au.aa")
    public int field782 = 0;

    @ObfuscatedName("au.ba")
    public int field792 = -1;

    @ObfuscatedName("au.br")
    public int field759 = 0;

    @ObfuscatedName("au.bp")
    public int field773 = 0;

    @ObfuscatedName("au.bf")
    public int field774 = 0;

    @ObfuscatedName("au.bu")
    public int field775 = 0;

    @ObfuscatedName("au.bo")
    public int field776 = -1;

    @ObfuscatedName("au.be")
    public int field777 = 0;

    @ObfuscatedName("au.bx")
    public int field763 = 0;

    @ObfuscatedName("au.bh")
    public int field779;

    @ObfuscatedName("au.bj")
    public int field781;

    @ObfuscatedName("au.bm")
    public int field744;

    @ObfuscatedName("au.bz")
    public int field751;

    @ObfuscatedName("au.bc")
    public int field783;

    @ObfuscatedName("au.bw")
    public int field742;

    @ObfuscatedName("au.bs")
    public int field785;

    @ObfuscatedName("au.bi")
    public int field786;

    @ObfuscatedName("au.bl")
    public int field787;

    @ObfuscatedName("au.bd")
    public int field747 = 0;

    @ObfuscatedName("au.bt")
    public int field770 = 200;

    @ObfuscatedName("au.bn")
    public int field790;

    @ObfuscatedName("au.bq")
    public int field799 = 0;

    @ObfuscatedName("au.bk")
    public int field788 = 32;

    @ObfuscatedName("au.bg")
    public int field762 = 0;

    @ObfuscatedName("au.bv")
    public int[] field740 = new int[10];

    @ObfuscatedName("au.by")
    public int[] field795 = new int[10];

    @ObfuscatedName("au.bb")
    public boolean[] field796 = new boolean[10];

    @ObfuscatedName("au.cs")
    public int field784 = 0;

    @ObfuscatedName("au.cf")
    public int field798 = 0;

    @ObfuscatedName("au.v(IIZI)V")
    public final void method623(int arg0, int arg1, boolean arg2) {
        if (this.field792 != -1 && class39.method547(this.field792).field919 == 1) {
            this.field792 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field740[0];
            int var5 = arg1 - this.field795[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field762 < 9) {
                    this.field762++;
                }
                for (int var6 = this.field762; var6 > 0; var6--) {
                    this.field740[var6] = this.field740[var6 - 1];
                    this.field795[var6] = this.field795[var6 - 1];
                    this.field796[var6] = this.field796[var6 - 1];
                }
                this.field740[0] = arg0;
                this.field795[0] = arg1;
                this.field796[0] = false;
                return;
            }
        }
        this.field762 = 0;
        this.field798 = 0;
        this.field784 = 0;
        this.field740[0] = arg0;
        this.field795[0] = arg1;
        this.field789 = this.field740[0] * 128 + this.field793 * 64;
        this.field754 = this.field795[0] * 128 + this.field793 * 64;
    }

    @ObfuscatedName("au.w(IZI)V")
    public final void method622(int arg0, boolean arg1) {
        int var3 = this.field740[0];
        int var4 = this.field795[0];
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
        if (this.field792 != -1 && class39.method547(this.field792).field919 == 1) {
            this.field792 = -1;
        }
        if (this.field762 < 9) {
            this.field762++;
        }
        for (int var5 = this.field762; var5 > 0; var5--) {
            this.field740[var5] = this.field740[var5 - 1];
            this.field795[var5] = this.field795[var5 - 1];
            this.field796[var5] = this.field796[var5 - 1];
        }
        this.field740[0] = var3;
        this.field795[0] = var4;
        this.field796[0] = arg1;
    }

    @ObfuscatedName("au.t(I)V")
    public final void method627() {
        this.field762 = 0;
        this.field798 = 0;
    }

    @ObfuscatedName("au.y(I)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("au.s(IIII)V")
    public final void method625(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field761[var4] <= arg2) {
                this.field771[var4] = arg0;
                this.field760[var4] = arg1;
                this.field761[var4] = arg2 + 70;
                return;
            }
        }
    }
}
