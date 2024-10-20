package deob;

@ObfuscatedName("ar")
public abstract class class33 extends class78 {

    @ObfuscatedName("ar.a")
    public int field762;

    @ObfuscatedName("ar.w")
    public int field726;

    @ObfuscatedName("ar.z")
    public int field733;

    @ObfuscatedName("ar.v")
    public boolean field728 = false;

    @ObfuscatedName("ar.s")
    public int field763 = 1;

    @ObfuscatedName("ar.r")
    public int field730 = -1;

    @ObfuscatedName("ar.d")
    public int field731 = -1;

    @ObfuscatedName("ar.al")
    public int field732 = -1;

    @ObfuscatedName("ar.ab")
    public int field766 = -1;

    @ObfuscatedName("ar.au")
    public int field741 = -1;

    @ObfuscatedName("ar.az")
    public int field735 = -1;

    @ObfuscatedName("ar.ai")
    public int field772 = -1;

    @ObfuscatedName("ar.ay")
    public int field734 = -1;

    @ObfuscatedName("ar.ar")
    public String field738 = null;

    @ObfuscatedName("ar.af")
    public boolean field739;

    @ObfuscatedName("ar.as")
    public int field748 = 100;

    @ObfuscatedName("ar.ap")
    public int field737 = 0;

    @ObfuscatedName("ar.aj")
    public int field742 = 0;

    @ObfuscatedName("ar.aa")
    public int[] field744 = new int[4];

    @ObfuscatedName("ar.ag")
    public int[] field743 = new int[4];

    @ObfuscatedName("ar.ae")
    public int[] field746 = new int[4];

    @ObfuscatedName("ar.ak")
    public int field747 = -1000;

    @ObfuscatedName("ar.aw")
    public int field725;

    @ObfuscatedName("ar.ao")
    public int field749;

    @ObfuscatedName("ar.aq")
    public int field729 = -1;

    @ObfuscatedName("ar.av")
    public int field751 = 0;

    @ObfuscatedName("ar.am")
    public int field752 = 0;

    @ObfuscatedName("ar.at")
    public int field759 = -1;

    @ObfuscatedName("ar.an")
    public int field754 = 0;

    @ObfuscatedName("ar.ax")
    public int field755 = 0;

    @ObfuscatedName("ar.ah")
    public int field756 = -1;

    @ObfuscatedName("ar.ad")
    public int field757 = 0;

    @ObfuscatedName("ar.bm")
    public int field727 = 0;

    @ObfuscatedName("ar.bs")
    public int field781 = 0;

    @ObfuscatedName("ar.bj")
    public int field760 = 0;

    @ObfuscatedName("ar.bq")
    public int field761 = -1;

    @ObfuscatedName("ar.bv")
    public int field750 = 0;

    @ObfuscatedName("ar.bi")
    public int field745 = 0;

    @ObfuscatedName("ar.bp")
    public int field764;

    @ObfuscatedName("ar.bl")
    public int field765;

    @ObfuscatedName("ar.bz")
    public int field758;

    @ObfuscatedName("ar.bx")
    public int field767;

    @ObfuscatedName("ar.bb")
    public int field768;

    @ObfuscatedName("ar.be")
    public int field769;

    @ObfuscatedName("ar.bf")
    public int field770;

    @ObfuscatedName("ar.bd")
    public int field771;

    @ObfuscatedName("ar.by")
    public int field740;

    @ObfuscatedName("ar.br")
    public int field773 = 0;

    @ObfuscatedName("ar.bu")
    public int field774 = 200;

    @ObfuscatedName("ar.bh")
    public int field775;

    @ObfuscatedName("ar.bw")
    public int field776 = 0;

    @ObfuscatedName("ar.bk")
    public int field777 = 32;

    @ObfuscatedName("ar.bg")
    public int field778 = 0;

    @ObfuscatedName("ar.bo")
    public int[] field779 = new int[10];

    @ObfuscatedName("ar.bc")
    public int[] field780 = new int[10];

    @ObfuscatedName("ar.bt")
    public boolean[] field753 = new boolean[10];

    @ObfuscatedName("ar.ba")
    public int field782 = 0;

    @ObfuscatedName("ar.bn")
    public int field736 = 0;

    @ObfuscatedName("ar.k(IIZI)V")
    public final void method587(int arg0, int arg1, boolean arg2) {
        if (this.field756 != -1 && Statics.method484(this.field756).field916 == 1) {
            this.field756 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field779[0];
            int var5 = arg1 - this.field780[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field778 < 9) {
                    this.field778++;
                }
                for (int var6 = this.field778; var6 > 0; var6--) {
                    this.field779[var6] = this.field779[var6 - 1];
                    this.field780[var6] = this.field780[var6 - 1];
                    this.field753[var6] = this.field753[var6 - 1];
                }
                this.field779[0] = arg0;
                this.field780[0] = arg1;
                this.field753[0] = false;
                return;
            }
        }
        this.field778 = 0;
        this.field736 = 0;
        this.field782 = 0;
        this.field779[0] = arg0;
        this.field780[0] = arg1;
        this.field762 = this.field779[0] * 128 + this.field763 * 64;
        this.field726 = this.field780[0] * 128 + this.field763 * 64;
    }

    @ObfuscatedName("ar.q(IZI)V")
    public final void method588(int arg0, boolean arg1) {
        int var3 = this.field779[0];
        int var4 = this.field780[0];
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
        if (this.field756 != -1 && Statics.method484(this.field756).field916 == 1) {
            this.field756 = -1;
        }
        if (this.field778 < 9) {
            this.field778++;
        }
        for (int var5 = this.field778; var5 > 0; var5--) {
            this.field779[var5] = this.field779[var5 - 1];
            this.field780[var5] = this.field780[var5 - 1];
            this.field753[var5] = this.field753[var5 - 1];
        }
        this.field779[0] = var3;
        this.field780[0] = var4;
        this.field753[0] = arg1;
    }

    @ObfuscatedName("ar.e(I)V")
    public final void method589() {
        this.field778 = 0;
        this.field736 = 0;
    }

    @ObfuscatedName("ar.x(I)Z")
    public boolean method12() {
        return false;
    }

    @ObfuscatedName("ar.t(IIII)V")
    public final void method591(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field746[var4] <= arg2) {
                this.field744[var4] = arg0;
                this.field743[var4] = arg1;
                this.field746[var4] = arg2 + 70;
                return;
            }
        }
    }
}
