package deob;

@ObfuscatedName("ak")
public abstract class class35 extends class80 {

    @ObfuscatedName("ak.z")
    public int field754;

    @ObfuscatedName("ak.x")
    public int field787;

    @ObfuscatedName("ak.v")
    public int field769;

    @ObfuscatedName("ak.i")
    public boolean field743 = false;

    @ObfuscatedName("ak.c")
    public int field744 = 1;

    @ObfuscatedName("ak.r")
    public int field745 = -1;

    @ObfuscatedName("ak.an")
    public int field746 = -1;

    @ObfuscatedName("ak.ad")
    public int field747 = -1;

    @ObfuscatedName("ak.ai")
    public int field748 = -1;

    @ObfuscatedName("ak.ae")
    public int field749 = -1;

    @ObfuscatedName("ak.aq")
    public int field750 = -1;

    @ObfuscatedName("ak.av")
    public int field800 = -1;

    @ObfuscatedName("ak.am")
    public int field742 = -1;

    @ObfuscatedName("ak.ac")
    public String field753 = null;

    @ObfuscatedName("ak.ak")
    public boolean field781;

    @ObfuscatedName("ak.aa")
    public boolean field755 = false;

    @ObfuscatedName("ak.al")
    public int field756 = 100;

    @ObfuscatedName("ak.ao")
    public int field757 = 0;

    @ObfuscatedName("ak.af")
    public int field751 = 0;

    @ObfuscatedName("ak.ab")
    public int[] field802 = new int[4];

    @ObfuscatedName("ak.ay")
    public int[] field761 = new int[4];

    @ObfuscatedName("ak.ax")
    public int[] field762 = new int[4];

    @ObfuscatedName("ak.au")
    public int field763 = -1000;

    @ObfuscatedName("ak.ap")
    public int field741;

    @ObfuscatedName("ak.aw")
    public int field765;

    @ObfuscatedName("ak.ar")
    public int field797 = -1;

    @ObfuscatedName("ak.at")
    public int field767 = 0;

    @ObfuscatedName("ak.ah")
    public int field768 = 0;

    @ObfuscatedName("ak.ag")
    public int field774 = -1;

    @ObfuscatedName("ak.aj")
    public int field770 = 0;

    @ObfuscatedName("ak.az")
    public int field771 = 0;

    @ObfuscatedName("ak.bu")
    public int field783 = -1;

    @ObfuscatedName("ak.bi")
    public int field773 = 0;

    @ObfuscatedName("ak.bb")
    public int field780 = 0;

    @ObfuscatedName("ak.bn")
    public int field789 = 0;

    @ObfuscatedName("ak.bz")
    public int field776 = 0;

    @ObfuscatedName("ak.bx")
    public int field777 = -1;

    @ObfuscatedName("ak.bs")
    public int field778 = 0;

    @ObfuscatedName("ak.bt")
    public int field779 = 0;

    @ObfuscatedName("ak.by")
    public int field760;

    @ObfuscatedName("ak.ba")
    public int field772;

    @ObfuscatedName("ak.bv")
    public int field782;

    @ObfuscatedName("ak.bc")
    public int field791;

    @ObfuscatedName("ak.bq")
    public int field784;

    @ObfuscatedName("ak.bw")
    public int field785;

    @ObfuscatedName("ak.bl")
    public int field786;

    @ObfuscatedName("ak.bg")
    public int field752;

    @ObfuscatedName("ak.bf")
    public int field788;

    @ObfuscatedName("ak.bj")
    public int field775 = 0;

    @ObfuscatedName("ak.bd")
    public int field790 = 200;

    @ObfuscatedName("ak.bo")
    public int field740;

    @ObfuscatedName("ak.bh")
    public int field792 = 0;

    @ObfuscatedName("ak.br")
    public int field793 = 32;

    @ObfuscatedName("ak.bp")
    public int field794 = 0;

    @ObfuscatedName("ak.bm")
    public int[] field795 = new int[10];

    @ObfuscatedName("ak.bk")
    public int[] field796 = new int[10];

    @ObfuscatedName("ak.be")
    public boolean[] field766 = new boolean[10];

    @ObfuscatedName("ak.ck")
    public int field798 = 0;

    @ObfuscatedName("ak.cq")
    public int field799 = 0;

    @ObfuscatedName("ak.y(IIZI)V")
    public final void method604(int arg0, int arg1, boolean arg2) {
        if (this.field783 != -1 && class40.method575(this.field783).field932 == 1) {
            this.field783 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field795[0];
            int var5 = arg1 - this.field796[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field794 < 9) {
                    this.field794++;
                }
                for (int var6 = this.field794; var6 > 0; var6--) {
                    this.field795[var6] = this.field795[var6 - 1];
                    this.field796[var6] = this.field796[var6 - 1];
                    this.field766[var6] = this.field766[var6 - 1];
                }
                this.field795[0] = arg0;
                this.field796[0] = arg1;
                this.field766[0] = false;
                return;
            }
        }
        this.field794 = 0;
        this.field799 = 0;
        this.field798 = 0;
        this.field795[0] = arg0;
        this.field796[0] = arg1;
        this.field754 = this.field795[0] * 128 + this.field744 * 64;
        this.field787 = this.field796[0] * 128 + this.field744 * 64;
    }

    @ObfuscatedName("ak.d(IZB)V")
    public final void method610(int arg0, boolean arg1) {
        int var3 = this.field795[0];
        int var4 = this.field796[0];
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
        if (this.field783 != -1 && class40.method575(this.field783).field932 == 1) {
            this.field783 = -1;
        }
        if (this.field794 < 9) {
            this.field794++;
        }
        for (int var5 = this.field794; var5 > 0; var5--) {
            this.field795[var5] = this.field795[var5 - 1];
            this.field796[var5] = this.field796[var5 - 1];
            this.field766[var5] = this.field766[var5 - 1];
        }
        this.field795[0] = var3;
        this.field796[0] = var4;
        this.field766[0] = arg1;
    }

    @ObfuscatedName("ak.b(B)V")
    public final void method605() {
        this.field794 = 0;
        this.field799 = 0;
    }

    @ObfuscatedName("ak.h(B)Z")
    public boolean method15() {
        return false;
    }

    @ObfuscatedName("ak.j(IIII)V")
    public final void method606(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field762[var4] <= arg2) {
                this.field802[var4] = arg0;
                this.field761[var4] = arg1;
                this.field762[var4] = arg2 + 70;
                return;
            }
        }
    }
}
