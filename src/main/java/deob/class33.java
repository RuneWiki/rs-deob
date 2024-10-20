package deob;

@ObfuscatedName("aj")
public abstract class class33 extends class78 {

    @ObfuscatedName("aj.s")
    public int field770;

    @ObfuscatedName("aj.r")
    public int field728;

    @ObfuscatedName("aj.j")
    public int field729;

    @ObfuscatedName("aj.h")
    public boolean field759 = false;

    @ObfuscatedName("aj.d")
    public int field731 = 1;

    @ObfuscatedName("aj.l")
    public int field775 = -1;

    @ObfuscatedName("aj.ag")
    public int field749 = -1;

    @ObfuscatedName("aj.au")
    public int field734 = -1;

    @ObfuscatedName("aj.ak")
    public int field735 = -1;

    @ObfuscatedName("aj.aw")
    public int field736 = -1;

    @ObfuscatedName("aj.at")
    public int field730 = -1;

    @ObfuscatedName("aj.ah")
    public int field738 = -1;

    @ObfuscatedName("aj.aj")
    public int field769 = -1;

    @ObfuscatedName("aj.an")
    public String field740 = null;

    @ObfuscatedName("aj.as")
    public boolean field741;

    @ObfuscatedName("aj.ap")
    public int field742 = 100;

    @ObfuscatedName("aj.ai")
    public int field754 = 0;

    @ObfuscatedName("aj.av")
    public int field744 = 0;

    @ObfuscatedName("aj.ay")
    public int[] field733 = new int[4];

    @ObfuscatedName("aj.ab")
    public int[] field746 = new int[4];

    @ObfuscatedName("aj.az")
    public int[] field777 = new int[4];

    @ObfuscatedName("aj.ad")
    public int field751 = -1000;

    @ObfuscatedName("aj.ao")
    public int field748;

    @ObfuscatedName("aj.am")
    public int field750;

    @ObfuscatedName("aj.al")
    public int field765 = -1;

    @ObfuscatedName("aj.ac")
    public int field752 = 0;

    @ObfuscatedName("aj.ax")
    public int field753 = 0;

    @ObfuscatedName("aj.aa")
    public int field778 = -1;

    @ObfuscatedName("aj.aq")
    public int field755 = 0;

    @ObfuscatedName("aj.af")
    public int field756 = 0;

    @ObfuscatedName("aj.ar")
    public int field757 = -1;

    @ObfuscatedName("aj.bl")
    public int field758 = 0;

    @ObfuscatedName("aj.bb")
    public int field727 = 0;

    @ObfuscatedName("aj.bm")
    public int field760 = 0;

    @ObfuscatedName("aj.bf")
    public int field761 = 0;

    @ObfuscatedName("aj.bn")
    public int field762 = -1;

    @ObfuscatedName("aj.bi")
    public int field763 = 0;

    @ObfuscatedName("aj.bp")
    public int field780 = 0;

    @ObfuscatedName("aj.bh")
    public int field772;

    @ObfuscatedName("aj.bq")
    public int field766;

    @ObfuscatedName("aj.bc")
    public int field747;

    @ObfuscatedName("aj.bw")
    public int field768;

    @ObfuscatedName("aj.bg")
    public int field732;

    @ObfuscatedName("aj.bt")
    public int field767;

    @ObfuscatedName("aj.bk")
    public int field771;

    @ObfuscatedName("aj.by")
    public int field782;

    @ObfuscatedName("aj.bo")
    public int field773;

    @ObfuscatedName("aj.bs")
    public int field774 = 0;

    @ObfuscatedName("aj.bv")
    public int field737 = 200;

    @ObfuscatedName("aj.be")
    public int field776;

    @ObfuscatedName("aj.bd")
    public int field781 = 0;

    @ObfuscatedName("aj.br")
    public int field739 = 32;

    @ObfuscatedName("aj.bu")
    public int field745 = 0;

    @ObfuscatedName("aj.bx")
    public int[] field779 = new int[10];

    @ObfuscatedName("aj.bj")
    public int[] field764 = new int[10];

    @ObfuscatedName("aj.ba")
    public boolean[] field743 = new boolean[10];

    @ObfuscatedName("aj.bz")
    public int field783 = 0;

    @ObfuscatedName("aj.cb")
    public int field784 = 0;

    @ObfuscatedName("aj.q(IIZI)V")
    public final void method587(int arg0, int arg1, boolean arg2) {
        if (this.field757 != -1 && class38.method595(this.field757).field910 == 1) {
            this.field757 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field779[0];
            int var5 = arg1 - this.field764[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field745 < 9) {
                    this.field745++;
                }
                for (int var6 = this.field745; var6 > 0; var6--) {
                    this.field779[var6] = this.field779[var6 - 1];
                    this.field764[var6] = this.field764[var6 - 1];
                    this.field743[var6] = this.field743[var6 - 1];
                }
                this.field779[0] = arg0;
                this.field764[0] = arg1;
                this.field743[0] = false;
                return;
            }
        }
        this.field745 = 0;
        this.field784 = 0;
        this.field783 = 0;
        this.field779[0] = arg0;
        this.field764[0] = arg1;
        this.field770 = this.field779[0] * 128 + this.field731 * 64;
        this.field728 = this.field764[0] * 128 + this.field731 * 64;
    }

    @ObfuscatedName("aj.w(IZI)V")
    public final void method586(int arg0, boolean arg1) {
        int var3 = this.field779[0];
        int var4 = this.field764[0];
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
        if (this.field757 != -1 && class38.method595(this.field757).field910 == 1) {
            this.field757 = -1;
        }
        if (this.field745 < 9) {
            this.field745++;
        }
        for (int var5 = this.field745; var5 > 0; var5--) {
            this.field779[var5] = this.field779[var5 - 1];
            this.field764[var5] = this.field764[var5 - 1];
            this.field743[var5] = this.field743[var5 - 1];
        }
        this.field779[0] = var3;
        this.field764[0] = var4;
        this.field743[0] = arg1;
    }

    @ObfuscatedName("aj.y(B)V")
    public final void method590() {
        this.field745 = 0;
        this.field784 = 0;
    }

    @ObfuscatedName("aj.e(B)Z")
    public boolean method11() {
        return false;
    }

    @ObfuscatedName("aj.p(IIII)V")
    public final void method588(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field777[var4] <= arg2) {
                this.field733[var4] = arg0;
                this.field746[var4] = arg1;
                this.field777[var4] = arg2 + 70;
                return;
            }
        }
    }
}
