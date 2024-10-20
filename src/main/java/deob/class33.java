package deob;

@ObfuscatedName("am")
public abstract class class33 extends class78 {

    @ObfuscatedName("am.f")
    public int field744;

    @ObfuscatedName("am.k")
    public int field738;

    @ObfuscatedName("am.p")
    public int field770;

    @ObfuscatedName("am.n")
    public boolean field753 = false;

    @ObfuscatedName("am.j")
    public int field773 = 1;

    @ObfuscatedName("am.x")
    public int field762 = -1;

    @ObfuscatedName("am.al")
    public int field786 = -1;

    @ObfuscatedName("am.au")
    public int field774 = -1;

    @ObfuscatedName("am.az")
    public int field747 = -1;

    @ObfuscatedName("am.ag")
    public int field746 = -1;

    @ObfuscatedName("am.aj")
    public int field790 = -1;

    @ObfuscatedName("am.af")
    public int field748 = -1;

    @ObfuscatedName("am.am")
    public int field749 = -1;

    @ObfuscatedName("am.aa")
    public String field750 = null;

    @ObfuscatedName("am.ab")
    public boolean field751;

    @ObfuscatedName("am.ai")
    public int field752 = 100;

    @ObfuscatedName("am.ak")
    public int field743 = 0;

    @ObfuscatedName("am.ao")
    public int field754 = 0;

    @ObfuscatedName("am.aq")
    public int[] field755 = new int[4];

    @ObfuscatedName("am.an")
    public int[] field756 = new int[4];

    @ObfuscatedName("am.av")
    public int[] field757 = new int[4];

    @ObfuscatedName("am.ac")
    public int field758 = -1000;

    @ObfuscatedName("am.ay")
    public int field759;

    @ObfuscatedName("am.ae")
    public int field739;

    @ObfuscatedName("am.ah")
    public int field761 = -1;

    @ObfuscatedName("am.aw")
    public int field777 = 0;

    @ObfuscatedName("am.ax")
    public int field780 = 0;

    @ObfuscatedName("am.at")
    public int field764 = -1;

    @ObfuscatedName("am.ad")
    public int field765 = 0;

    @ObfuscatedName("am.as")
    public int field766 = 0;

    @ObfuscatedName("am.ap")
    public int field742 = -1;

    @ObfuscatedName("am.ba")
    public int field768 = 0;

    @ObfuscatedName("am.bw")
    public int field769 = 0;

    @ObfuscatedName("am.bm")
    public int field767 = 0;

    @ObfuscatedName("am.bg")
    public int field771 = 0;

    @ObfuscatedName("am.bv")
    public int field772 = -1;

    @ObfuscatedName("am.bf")
    public int field740 = 0;

    @ObfuscatedName("am.bq")
    public int field795 = 0;

    @ObfuscatedName("am.bk")
    public int field775;

    @ObfuscatedName("am.bu")
    public int field776;

    @ObfuscatedName("am.br")
    public int field745;

    @ObfuscatedName("am.bi")
    public int field778;

    @ObfuscatedName("am.bl")
    public int field779;

    @ObfuscatedName("am.bh")
    public int field741;

    @ObfuscatedName("am.bd")
    public int field781;

    @ObfuscatedName("am.be")
    public int field782;

    @ObfuscatedName("am.bj")
    public int field783;

    @ObfuscatedName("am.bt")
    public int field784 = 0;

    @ObfuscatedName("am.bn")
    public int field785 = 200;

    @ObfuscatedName("am.bc")
    public int field760;

    @ObfuscatedName("am.bp")
    public int field787 = 0;

    @ObfuscatedName("am.bz")
    public int field788 = 32;

    @ObfuscatedName("am.bb")
    public int field793 = 0;

    @ObfuscatedName("am.bx")
    public int[] field763 = new int[10];

    @ObfuscatedName("am.bo")
    public int[] field791 = new int[10];

    @ObfuscatedName("am.by")
    public boolean[] field789 = new boolean[10];

    @ObfuscatedName("am.bs")
    public int field792 = 0;

    @ObfuscatedName("am.ck")
    public int field794 = 0;

    @ObfuscatedName("am.l(IIZB)V")
    public final void method596(int arg0, int arg1, boolean arg2) {
        if (this.field742 != -1 && class38.method3551(this.field742).field923 == 1) {
            this.field742 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field763[0];
            int var5 = arg1 - this.field791[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field793 < 9) {
                    this.field793++;
                }
                for (int var6 = this.field793; var6 > 0; var6--) {
                    this.field763[var6] = this.field763[var6 - 1];
                    this.field791[var6] = this.field791[var6 - 1];
                    this.field789[var6] = this.field789[var6 - 1];
                }
                this.field763[0] = arg0;
                this.field791[0] = arg1;
                this.field789[0] = false;
                return;
            }
        }
        this.field793 = 0;
        this.field794 = 0;
        this.field792 = 0;
        this.field763[0] = arg0;
        this.field791[0] = arg1;
        this.field744 = this.field763[0] * 128 + this.field773 * 64;
        this.field738 = this.field791[0] * 128 + this.field773 * 64;
    }

    @ObfuscatedName("am.o(IZI)V")
    public final void method598(int arg0, boolean arg1) {
        int var3 = this.field763[0];
        int var4 = this.field791[0];
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
        if (this.field742 != -1 && class38.method3551(this.field742).field923 == 1) {
            this.field742 = -1;
        }
        if (this.field793 < 9) {
            this.field793++;
        }
        for (int var5 = this.field793; var5 > 0; var5--) {
            this.field763[var5] = this.field763[var5 - 1];
            this.field791[var5] = this.field791[var5 - 1];
            this.field789[var5] = this.field789[var5 - 1];
        }
        this.field763[0] = var3;
        this.field791[0] = var4;
        this.field789[0] = arg1;
    }

    @ObfuscatedName("am.w(I)V")
    public final void method600() {
        this.field793 = 0;
        this.field794 = 0;
    }

    @ObfuscatedName("am.h(S)Z")
    public boolean method23() {
        return false;
    }

    @ObfuscatedName("am.t(IIII)V")
    public final void method605(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field757[var4] <= arg2) {
                this.field755[var4] = arg0;
                this.field756[var4] = arg1;
                this.field757[var4] = arg2 + 70;
                return;
            }
        }
    }
}
