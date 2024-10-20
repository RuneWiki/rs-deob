package deob;

@ObfuscatedName("aw")
public abstract class class35 extends class80 {

    @ObfuscatedName("aw.g")
    public int field765;

    @ObfuscatedName("aw.z")
    public int field741;

    @ObfuscatedName("aw.m")
    public int field740;

    @ObfuscatedName("aw.y")
    public boolean field774 = false;

    @ObfuscatedName("aw.n")
    public int field742 = 1;

    @ObfuscatedName("aw.s")
    public int field796 = -1;

    @ObfuscatedName("aw.ac")
    public int field744 = -1;

    @ObfuscatedName("aw.au")
    public int field745 = -1;

    @ObfuscatedName("aw.ap")
    public int field746 = -1;

    @ObfuscatedName("aw.ah")
    public int field747 = -1;

    @ObfuscatedName("aw.ae")
    public int field797 = -1;

    @ObfuscatedName("aw.ag")
    public int field749 = -1;

    @ObfuscatedName("aw.as")
    public int field739 = -1;

    @ObfuscatedName("aw.at")
    public String field751 = null;

    @ObfuscatedName("aw.aw")
    public boolean field752;

    @ObfuscatedName("aw.ay")
    public boolean field753 = false;

    @ObfuscatedName("aw.ao")
    public int field789 = 100;

    @ObfuscatedName("aw.al")
    public int field755 = 0;

    @ObfuscatedName("aw.ab")
    public int field756 = 0;

    @ObfuscatedName("aw.ak")
    public int[] field754 = new int[4];

    @ObfuscatedName("aw.ar")
    public int[] field758 = new int[4];

    @ObfuscatedName("aw.ai")
    public int[] field759 = new int[4];

    @ObfuscatedName("aw.ax")
    public int field794 = -1000;

    @ObfuscatedName("aw.az")
    public int field761;

    @ObfuscatedName("aw.aq")
    public int field787;

    @ObfuscatedName("aw.ad")
    public int field763 = -1;

    @ObfuscatedName("aw.af")
    public int field768 = 0;

    @ObfuscatedName("aw.aa")
    public int field760 = 0;

    @ObfuscatedName("aw.av")
    public int field766 = -1;

    @ObfuscatedName("aw.an")
    public int field767 = 0;

    @ObfuscatedName("aw.am")
    public int field762 = 0;

    @ObfuscatedName("aw.bt")
    public int field748 = -1;

    @ObfuscatedName("aw.br")
    public int field782 = 0;

    @ObfuscatedName("aw.bs")
    public int field771 = 0;

    @ObfuscatedName("aw.bn")
    public int field772 = 0;

    @ObfuscatedName("aw.bu")
    public int field773 = 0;

    @ObfuscatedName("aw.bl")
    public int field743 = -1;

    @ObfuscatedName("aw.by")
    public int field775 = 0;

    @ObfuscatedName("aw.bi")
    public int field776 = 0;

    @ObfuscatedName("aw.bg")
    public int field757;

    @ObfuscatedName("aw.bw")
    public int field778;

    @ObfuscatedName("aw.bf")
    public int field779;

    @ObfuscatedName("aw.bk")
    public int field780;

    @ObfuscatedName("aw.ba")
    public int field781;

    @ObfuscatedName("aw.be")
    public int field777;

    @ObfuscatedName("aw.bz")
    public int field783;

    @ObfuscatedName("aw.bh")
    public int field769;

    @ObfuscatedName("aw.bp")
    public int field785;

    @ObfuscatedName("aw.bo")
    public int field786 = 0;

    @ObfuscatedName("aw.bj")
    public int field738 = 200;

    @ObfuscatedName("aw.bx")
    public int field788;

    @ObfuscatedName("aw.bm")
    public int field784 = 0;

    @ObfuscatedName("aw.bb")
    public int field790 = 32;

    @ObfuscatedName("aw.bq")
    public int field791 = 0;

    @ObfuscatedName("aw.bd")
    public int[] field792 = new int[10];

    @ObfuscatedName("aw.bv")
    public int[] field793 = new int[10];

    @ObfuscatedName("aw.bc")
    public boolean[] field764 = new boolean[10];

    @ObfuscatedName("aw.ce")
    public int field750 = 0;

    @ObfuscatedName("aw.cq")
    public int field795 = 0;

    @ObfuscatedName("aw.v(IIZS)V")
    public final void method674(int arg0, int arg1, boolean arg2) {
        if (this.field748 != -1 && class40.method168(this.field748).field930 == 1) {
            this.field748 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field792[0];
            int var5 = arg1 - this.field793[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field791 < 9) {
                    this.field791++;
                }
                for (int var6 = this.field791; var6 > 0; var6--) {
                    this.field792[var6] = this.field792[var6 - 1];
                    this.field793[var6] = this.field793[var6 - 1];
                    this.field764[var6] = this.field764[var6 - 1];
                }
                this.field792[0] = arg0;
                this.field793[0] = arg1;
                this.field764[0] = false;
                return;
            }
        }
        this.field791 = 0;
        this.field795 = 0;
        this.field750 = 0;
        this.field792[0] = arg0;
        this.field793[0] = arg1;
        this.field765 = this.field792[0] * 128 + this.field742 * 64;
        this.field741 = this.field793[0] * 128 + this.field742 * 64;
    }

    @ObfuscatedName("aw.a(IZB)V")
    public final void method665(int arg0, boolean arg1) {
        int var3 = this.field792[0];
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
        if (this.field748 != -1 && class40.method168(this.field748).field930 == 1) {
            this.field748 = -1;
        }
        if (this.field791 < 9) {
            this.field791++;
        }
        for (int var5 = this.field791; var5 > 0; var5--) {
            this.field792[var5] = this.field792[var5 - 1];
            this.field793[var5] = this.field793[var5 - 1];
            this.field764[var5] = this.field764[var5 - 1];
        }
        this.field792[0] = var3;
        this.field793[0] = var4;
        this.field764[0] = arg1;
    }

    @ObfuscatedName("aw.l(I)V")
    public final void method673() {
        this.field791 = 0;
        this.field795 = 0;
    }

    @ObfuscatedName("aw.p(I)Z")
    public boolean method15() {
        return false;
    }

    @ObfuscatedName("aw.h(IIII)V")
    public final void method667(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field759[var4] <= arg2) {
                this.field754[var4] = arg0;
                this.field758[var4] = arg1;
                this.field759[var4] = arg2 + 70;
                return;
            }
        }
    }
}
