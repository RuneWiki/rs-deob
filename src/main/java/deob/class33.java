package deob;

@ObfuscatedName("aa")
public abstract class class33 extends class78 {

    @ObfuscatedName("aa.j")
    public int field740;

    @ObfuscatedName("aa.o")
    public int field730;

    @ObfuscatedName("aa.i")
    public int field774;

    @ObfuscatedName("aa.m")
    public boolean field732 = false;

    @ObfuscatedName("aa.f")
    public int field733 = 1;

    @ObfuscatedName("aa.k")
    public int field734 = -1;

    @ObfuscatedName("aa.an")
    public int field735 = -1;

    @ObfuscatedName("aa.aw")
    public int field736 = -1;

    @ObfuscatedName("aa.at")
    public int field746 = -1;

    @ObfuscatedName("aa.al")
    public int field738 = -1;

    @ObfuscatedName("aa.as")
    public int field784 = -1;

    @ObfuscatedName("aa.ak")
    public int field751 = -1;

    @ObfuscatedName("aa.aa")
    public int field741 = -1;

    @ObfuscatedName("aa.ao")
    public String field729 = null;

    @ObfuscatedName("aa.af")
    public boolean field743;

    @ObfuscatedName("aa.aj")
    public int field744 = 100;

    @ObfuscatedName("aa.az")
    public int field745 = 0;

    @ObfuscatedName("aa.ae")
    public int field769 = 0;

    @ObfuscatedName("aa.ax")
    public int[] field747 = new int[4];

    @ObfuscatedName("aa.ai")
    public int[] field768 = new int[4];

    @ObfuscatedName("aa.aq")
    public int[] field770 = new int[4];

    @ObfuscatedName("aa.ad")
    public int field750 = -1000;

    @ObfuscatedName("aa.au")
    public int field749;

    @ObfuscatedName("aa.ag")
    public int field752;

    @ObfuscatedName("aa.ar")
    public int field739 = -1;

    @ObfuscatedName("aa.am")
    public int field757 = 0;

    @ObfuscatedName("aa.ab")
    public int field755 = 0;

    @ObfuscatedName("aa.ac")
    public int field756 = -1;

    @ObfuscatedName("aa.ah")
    public int field731 = 0;

    @ObfuscatedName("aa.ay")
    public int field758 = 0;

    @ObfuscatedName("aa.ap")
    public int field759 = -1;

    @ObfuscatedName("aa.bj")
    public int field760 = 0;

    @ObfuscatedName("aa.bm")
    public int field761 = 0;

    @ObfuscatedName("aa.by")
    public int field762 = 0;

    @ObfuscatedName("aa.bp")
    public int field763 = 0;

    @ObfuscatedName("aa.bc")
    public int field764 = -1;

    @ObfuscatedName("aa.bd")
    public int field765 = 0;

    @ObfuscatedName("aa.bk")
    public int field766 = 0;

    @ObfuscatedName("aa.bn")
    public int field788;

    @ObfuscatedName("aa.bt")
    public int field767;

    @ObfuscatedName("aa.bz")
    public int field776;

    @ObfuscatedName("aa.bh")
    public int field737;

    @ObfuscatedName("aa.bo")
    public int field771;

    @ObfuscatedName("aa.bf")
    public int field772;

    @ObfuscatedName("aa.bi")
    public int field773;

    @ObfuscatedName("aa.bg")
    public int field778;

    @ObfuscatedName("aa.bq")
    public int field775;

    @ObfuscatedName("aa.bx")
    public int field748 = 0;

    @ObfuscatedName("aa.bv")
    public int field777 = 200;

    @ObfuscatedName("aa.ba")
    public int field754;

    @ObfuscatedName("aa.bs")
    public int field779 = 0;

    @ObfuscatedName("aa.bw")
    public int field780 = 32;

    @ObfuscatedName("aa.bu")
    public int field781 = 0;

    @ObfuscatedName("aa.br")
    public int[] field782 = new int[10];

    @ObfuscatedName("aa.bl")
    public int[] field783 = new int[10];

    @ObfuscatedName("aa.be")
    public boolean[] field753 = new boolean[10];

    @ObfuscatedName("aa.bb")
    public int field785 = 0;

    @ObfuscatedName("aa.cl")
    public int field786 = 0;

    @ObfuscatedName("aa.a(IIZI)V")
    public final void method609(int arg0, int arg1, boolean arg2) {
        if (this.field759 != -1 && class38.method507(this.field759).field917 == 1) {
            this.field759 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field782[0];
            int var5 = arg1 - this.field783[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field781 < 9) {
                    this.field781++;
                }
                for (int var6 = this.field781; var6 > 0; var6--) {
                    this.field782[var6] = this.field782[var6 - 1];
                    this.field783[var6] = this.field783[var6 - 1];
                    this.field753[var6] = this.field753[var6 - 1];
                }
                this.field782[0] = arg0;
                this.field783[0] = arg1;
                this.field753[0] = false;
                return;
            }
        }
        this.field781 = 0;
        this.field786 = 0;
        this.field785 = 0;
        this.field782[0] = arg0;
        this.field783[0] = arg1;
        this.field740 = this.field782[0] * 128 + this.field733 * 64;
        this.field730 = this.field783[0] * 128 + this.field733 * 64;
    }

    @ObfuscatedName("aa.y(IZS)V")
    public final void method611(int arg0, boolean arg1) {
        int var3 = this.field782[0];
        int var4 = this.field783[0];
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
        if (this.field759 != -1 && class38.method507(this.field759).field917 == 1) {
            this.field759 = -1;
        }
        if (this.field781 < 9) {
            this.field781++;
        }
        for (int var5 = this.field781; var5 > 0; var5--) {
            this.field782[var5] = this.field782[var5 - 1];
            this.field783[var5] = this.field783[var5 - 1];
            this.field753[var5] = this.field753[var5 - 1];
        }
        this.field782[0] = var3;
        this.field783[0] = var4;
        this.field753[0] = arg1;
    }

    @ObfuscatedName("aa.v(I)V")
    public final void method612() {
        this.field781 = 0;
        this.field786 = 0;
    }

    @ObfuscatedName("aa.x(B)Z")
    public boolean method21() {
        return false;
    }

    @ObfuscatedName("aa.e(IIII)V")
    public final void method614(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field770[var4] <= arg2) {
                this.field747[var4] = arg0;
                this.field768[var4] = arg1;
                this.field770[var4] = arg2 + 70;
                return;
            }
        }
    }
}
