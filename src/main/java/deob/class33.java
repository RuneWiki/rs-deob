package deob;

@ObfuscatedName("ap")
public abstract class class33 extends class78 {

    @ObfuscatedName("ap.o")
    public int field775;

    @ObfuscatedName("ap.r")
    public int field720;

    @ObfuscatedName("ap.t")
    public int field763;

    @ObfuscatedName("ap.k")
    public boolean field722 = false;

    @ObfuscatedName("ap.n")
    public int field723 = 1;

    @ObfuscatedName("ap.z")
    public int field750 = -1;

    @ObfuscatedName("ap.av")
    public int field725 = -1;

    @ObfuscatedName("ap.ao")
    public int field726 = -1;

    @ObfuscatedName("ap.am")
    public int field742 = -1;

    @ObfuscatedName("ap.ac")
    public int field755 = -1;

    @ObfuscatedName("ap.ak")
    public int field729 = -1;

    @ObfuscatedName("ap.ag")
    public int field728 = -1;

    @ObfuscatedName("ap.ap")
    public int field731 = -1;

    @ObfuscatedName("ap.ah")
    public String field732 = null;

    @ObfuscatedName("ap.an")
    public boolean field733;

    @ObfuscatedName("ap.ay")
    public int field734 = 100;

    @ObfuscatedName("ap.af")
    public int field735 = 0;

    @ObfuscatedName("ap.aq")
    public int field736 = 0;

    @ObfuscatedName("ap.at")
    public int[] field737 = new int[4];

    @ObfuscatedName("ap.aw")
    public int[] field727 = new int[4];

    @ObfuscatedName("ap.ar")
    public int[] field739 = new int[4];

    @ObfuscatedName("ap.az")
    public int field740 = -1000;

    @ObfuscatedName("ap.au")
    public int field760;

    @ObfuscatedName("ap.ai")
    public int field744;

    @ObfuscatedName("ap.ad")
    public int field743 = -1;

    @ObfuscatedName("ap.al")
    public int field741 = 0;

    @ObfuscatedName("ap.ae")
    public int field745 = 0;

    @ObfuscatedName("ap.as")
    public int field746 = -1;

    @ObfuscatedName("ap.ax")
    public int field747 = 0;

    @ObfuscatedName("ap.aa")
    public int field748 = 0;

    @ObfuscatedName("ap.ab")
    public int field749 = -1;

    @ObfuscatedName("ap.bc")
    public int field756 = 0;

    @ObfuscatedName("ap.bb")
    public int field751 = 0;

    @ObfuscatedName("ap.bo")
    public int field752 = 0;

    @ObfuscatedName("ap.bg")
    public int field753 = 0;

    @ObfuscatedName("ap.bf")
    public int field754 = -1;

    @ObfuscatedName("ap.bv")
    public int field762 = 0;

    @ObfuscatedName("ap.bd")
    public int field719 = 0;

    @ObfuscatedName("ap.bl")
    public int field757;

    @ObfuscatedName("ap.bp")
    public int field758;

    @ObfuscatedName("ap.bw")
    public int field759;

    @ObfuscatedName("ap.bs")
    public int field738;

    @ObfuscatedName("ap.by")
    public int field761;

    @ObfuscatedName("ap.bn")
    public int field765;

    @ObfuscatedName("ap.bh")
    public int field724;

    @ObfuscatedName("ap.bk")
    public int field730;

    @ObfuscatedName("ap.bq")
    public int field770;

    @ObfuscatedName("ap.bz")
    public int field766 = 0;

    @ObfuscatedName("ap.bx")
    public int field767 = 200;

    @ObfuscatedName("ap.bm")
    public int field721;

    @ObfuscatedName("ap.be")
    public int field769 = 0;

    @ObfuscatedName("ap.bi")
    public int field768 = 32;

    @ObfuscatedName("ap.ba")
    public int field764 = 0;

    @ObfuscatedName("ap.br")
    public int[] field772 = new int[10];

    @ObfuscatedName("ap.bj")
    public int[] field773 = new int[10];

    @ObfuscatedName("ap.bt")
    public boolean[] field774 = new boolean[10];

    @ObfuscatedName("ap.bu")
    public int field771 = 0;

    @ObfuscatedName("ap.cj")
    public int field776 = 0;

    @ObfuscatedName("ap.w(IIZI)V")
    public final void method576(int arg0, int arg1, boolean arg2) {
        if (this.field749 != -1 && class38.method730(this.field749).field909 == 1) {
            this.field749 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field772[0];
            int var5 = arg1 - this.field773[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field764 < 9) {
                    this.field764++;
                }
                for (int var6 = this.field764; var6 > 0; var6--) {
                    this.field772[var6] = this.field772[var6 - 1];
                    this.field773[var6] = this.field773[var6 - 1];
                    this.field774[var6] = this.field774[var6 - 1];
                }
                this.field772[0] = arg0;
                this.field773[0] = arg1;
                this.field774[0] = false;
                return;
            }
        }
        this.field764 = 0;
        this.field776 = 0;
        this.field771 = 0;
        this.field772[0] = arg0;
        this.field773[0] = arg1;
        this.field775 = this.field772[0] * 128 + this.field723 * 64;
        this.field720 = this.field773[0] * 128 + this.field723 * 64;
    }

    @ObfuscatedName("ap.y(IZS)V")
    public final void method577(int arg0, boolean arg1) {
        int var3 = this.field772[0];
        int var4 = this.field773[0];
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
        if (this.field749 != -1 && class38.method730(this.field749).field909 == 1) {
            this.field749 = -1;
        }
        if (this.field764 < 9) {
            this.field764++;
        }
        for (int var5 = this.field764; var5 > 0; var5--) {
            this.field772[var5] = this.field772[var5 - 1];
            this.field773[var5] = this.field773[var5 - 1];
            this.field774[var5] = this.field774[var5 - 1];
        }
        this.field772[0] = var3;
        this.field773[0] = var4;
        this.field774[0] = arg1;
    }

    @ObfuscatedName("ap.h(I)V")
    public final void method585() {
        this.field764 = 0;
        this.field776 = 0;
    }

    @ObfuscatedName("ap.i(I)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("ap.j(IIII)V")
    public final void method579(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field739[var4] <= arg2) {
                this.field737[var4] = arg0;
                this.field727[var4] = arg1;
                this.field739[var4] = arg2 + 70;
                return;
            }
        }
    }
}
