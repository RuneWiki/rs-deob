package deob;

@ObfuscatedName("aa")
public abstract class class33 extends class78 {

    @ObfuscatedName("aa.v")
    public int field780;

    @ObfuscatedName("aa.f")
    public int field761;

    @ObfuscatedName("aa.a")
    public int field792;

    @ObfuscatedName("aa.p")
    public boolean field796 = false;

    @ObfuscatedName("aa.s")
    public int field742 = 1;

    @ObfuscatedName("aa.c")
    public int field739 = -1;

    @ObfuscatedName("aa.ar")
    public int field786 = -1;

    @ObfuscatedName("aa.ac")
    public int field745 = -1;

    @ObfuscatedName("aa.ah")
    public int field746 = -1;

    @ObfuscatedName("aa.ap")
    public int field747 = -1;

    @ObfuscatedName("aa.aj")
    public int field748 = -1;

    @ObfuscatedName("aa.as")
    public int field749 = -1;

    @ObfuscatedName("aa.aa")
    public int field750 = -1;

    @ObfuscatedName("aa.am")
    public String field751 = null;

    @ObfuscatedName("aa.ae")
    public boolean field743;

    @ObfuscatedName("aa.ai")
    public boolean field754 = false;

    @ObfuscatedName("aa.ay")
    public int field788 = 100;

    @ObfuscatedName("aa.ax")
    public int field755 = 0;

    @ObfuscatedName("aa.au")
    public int field756 = 0;

    @ObfuscatedName("aa.aw")
    public int[] field757 = new int[4];

    @ObfuscatedName("aa.ag")
    public int[] field778 = new int[4];

    @ObfuscatedName("aa.ao")
    public int[] field759 = new int[4];

    @ObfuscatedName("aa.aq")
    public int field760 = -1000;

    @ObfuscatedName("aa.ak")
    public int field776;

    @ObfuscatedName("aa.al")
    public int field744;

    @ObfuscatedName("aa.at")
    public int field784 = -1;

    @ObfuscatedName("aa.an")
    public int field764 = 0;

    @ObfuscatedName("aa.av")
    public int field765 = 0;

    @ObfuscatedName("aa.ab")
    public int field766 = -1;

    @ObfuscatedName("aa.ad")
    public int field767 = 0;

    @ObfuscatedName("aa.af")
    public int field753 = 0;

    @ObfuscatedName("aa.by")
    public int field762 = -1;

    @ObfuscatedName("aa.bd")
    public int field770 = 0;

    @ObfuscatedName("aa.bu")
    public int field771 = 0;

    @ObfuscatedName("aa.bq")
    public int field772 = 0;

    @ObfuscatedName("aa.ba")
    public int field773 = 0;

    @ObfuscatedName("aa.bf")
    public int field774 = -1;

    @ObfuscatedName("aa.bw")
    public int field775 = 0;

    @ObfuscatedName("aa.bz")
    public int field768 = 0;

    @ObfuscatedName("aa.be")
    public int field777;

    @ObfuscatedName("aa.bc")
    public int field741;

    @ObfuscatedName("aa.bn")
    public int field779;

    @ObfuscatedName("aa.bb")
    public int field763;

    @ObfuscatedName("aa.bi")
    public int field781;

    @ObfuscatedName("aa.bm")
    public int field782;

    @ObfuscatedName("aa.bo")
    public int field769;

    @ObfuscatedName("aa.bv")
    public int field789;

    @ObfuscatedName("aa.bh")
    public int field785;

    @ObfuscatedName("aa.bx")
    public int field758 = 0;

    @ObfuscatedName("aa.bk")
    public int field787 = 200;

    @ObfuscatedName("aa.bt")
    public int field738;

    @ObfuscatedName("aa.bg")
    public int field740 = 0;

    @ObfuscatedName("aa.br")
    public int field790 = 32;

    @ObfuscatedName("aa.bj")
    public int field791 = 0;

    @ObfuscatedName("aa.bp")
    public int[] field783 = new int[10];

    @ObfuscatedName("aa.bs")
    public int[] field793 = new int[10];

    @ObfuscatedName("aa.bl")
    public boolean[] field794 = new boolean[10];

    @ObfuscatedName("aa.cc")
    public int field795 = 0;

    @ObfuscatedName("aa.cm")
    public int field752 = 0;

    @ObfuscatedName("aa.x(IIZI)V")
    public final void method567(int arg0, int arg1, boolean arg2) {
        if (this.field762 != -1 && class38.method552(this.field762).field924 == 1) {
            this.field762 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field783[0];
            int var5 = arg1 - this.field793[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field791 < 9) {
                    this.field791++;
                }
                for (int var6 = this.field791; var6 > 0; var6--) {
                    this.field783[var6] = this.field783[var6 - 1];
                    this.field793[var6] = this.field793[var6 - 1];
                    this.field794[var6] = this.field794[var6 - 1];
                }
                this.field783[0] = arg0;
                this.field793[0] = arg1;
                this.field794[0] = false;
                return;
            }
        }
        this.field791 = 0;
        this.field752 = 0;
        this.field795 = 0;
        this.field783[0] = arg0;
        this.field793[0] = arg1;
        this.field780 = this.field783[0] * 128 + this.field742 * 64;
        this.field761 = this.field793[0] * 128 + this.field742 * 64;
    }

    @ObfuscatedName("aa.q(IZI)V")
    public final void method573(int arg0, boolean arg1) {
        int var3 = this.field783[0];
        int var4 = this.field793[0];
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
        if (this.field762 != -1 && class38.method552(this.field762).field924 == 1) {
            this.field762 = -1;
        }
        if (this.field791 < 9) {
            this.field791++;
        }
        for (int var5 = this.field791; var5 > 0; var5--) {
            this.field783[var5] = this.field783[var5 - 1];
            this.field793[var5] = this.field793[var5 - 1];
            this.field794[var5] = this.field794[var5 - 1];
        }
        this.field783[0] = var3;
        this.field793[0] = var4;
        this.field794[0] = arg1;
    }

    @ObfuscatedName("aa.t(I)V")
    public final void method572() {
        this.field791 = 0;
        this.field752 = 0;
    }

    @ObfuscatedName("aa.k(B)Z")
    public boolean method25() {
        return false;
    }

    @ObfuscatedName("aa.y(IIII)V")
    public final void method581(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field759[var4] <= arg2) {
                this.field757[var4] = arg0;
                this.field778[var4] = arg1;
                this.field759[var4] = arg2 + 70;
                return;
            }
        }
    }
}
