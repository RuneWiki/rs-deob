package deob;

@ObfuscatedName("at")
public abstract class class35 extends class80 {

    @ObfuscatedName("at.a")
    public int field802;

    @ObfuscatedName("at.p")
    public int field762;

    @ObfuscatedName("at.c")
    public int field763;

    @ObfuscatedName("at.u")
    public boolean field765 = false;

    @ObfuscatedName("at.d")
    public int field808 = 1;

    @ObfuscatedName("at.o")
    public int field766 = -1;

    @ObfuscatedName("at.aj")
    public int field814 = -1;

    @ObfuscatedName("at.au")
    public int field768 = -1;

    @ObfuscatedName("at.ah")
    public int field769 = -1;

    @ObfuscatedName("at.ab")
    public int field787 = -1;

    @ObfuscatedName("at.am")
    public int field771 = -1;

    @ObfuscatedName("at.ar")
    public int field820 = -1;

    @ObfuscatedName("at.an")
    public int field792 = -1;

    @ObfuscatedName("at.az")
    public String field772 = null;

    @ObfuscatedName("at.at")
    public boolean field775;

    @ObfuscatedName("at.ag")
    public boolean field776 = false;

    @ObfuscatedName("at.as")
    public int field819 = 100;

    @ObfuscatedName("at.ao")
    public int field778 = 0;

    @ObfuscatedName("at.af")
    public int field779 = 0;

    @ObfuscatedName("at.aq")
    public int[] field783 = new int[4];

    @ObfuscatedName("at.aw")
    public int[] field786 = new int[4];

    @ObfuscatedName("at.al")
    public int[] field782 = new int[4];

    @ObfuscatedName("at.ap")
    public int field794 = -1000;

    @ObfuscatedName("at.ac")
    public int field773;

    @ObfuscatedName("at.av")
    public int field785;

    @ObfuscatedName("at.ai")
    public int field764 = -1;

    @ObfuscatedName("at.ax")
    public int field805 = 0;

    @ObfuscatedName("at.ae")
    public int field788 = 0;

    @ObfuscatedName("at.aa")
    public int field789 = -1;

    @ObfuscatedName("at.ak")
    public int field790 = 0;

    @ObfuscatedName("at.ad")
    public int field791 = 0;

    @ObfuscatedName("at.bt")
    public int field777 = -1;

    @ObfuscatedName("at.bf")
    public int field793 = 0;

    @ObfuscatedName("at.bn")
    public int field767 = 0;

    @ObfuscatedName("at.ba")
    public int field795 = 0;

    @ObfuscatedName("at.bj")
    public int field796 = 0;

    @ObfuscatedName("at.bc")
    public int field797 = -1;

    @ObfuscatedName("at.bh")
    public int field798 = 0;

    @ObfuscatedName("at.bd")
    public int field799 = 0;

    @ObfuscatedName("at.by")
    public int field800;

    @ObfuscatedName("at.bk")
    public int field801;

    @ObfuscatedName("at.bo")
    public int field817;

    @ObfuscatedName("at.bi")
    public int field803;

    @ObfuscatedName("at.be")
    public int field804;

    @ObfuscatedName("at.bq")
    public int field774;

    @ObfuscatedName("at.bg")
    public int field807;

    @ObfuscatedName("at.bp")
    public int field761;

    @ObfuscatedName("at.bx")
    public int field770;

    @ObfuscatedName("at.br")
    public int field809 = 0;

    @ObfuscatedName("at.bl")
    public int field810 = 200;

    @ObfuscatedName("at.bu")
    public int field811;

    @ObfuscatedName("at.bv")
    public int field812 = 0;

    @ObfuscatedName("at.bb")
    public int field813 = 32;

    @ObfuscatedName("at.bs")
    public int field780 = 0;

    @ObfuscatedName("at.bz")
    public int[] field815 = new int[10];

    @ObfuscatedName("at.bm")
    public int[] field816 = new int[10];

    @ObfuscatedName("at.bw")
    public boolean[] field784 = new boolean[10];

    @ObfuscatedName("at.cj")
    public int field818 = 0;

    @ObfuscatedName("at.cr")
    public int field806 = 0;

    @ObfuscatedName("at.v(IIZI)V")
    public final void method657(int arg0, int arg1, boolean arg2) {
        if (this.field777 != -1 && class40.method547(this.field777).field951 == 1) {
            this.field777 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field815[0];
            int var5 = arg1 - this.field816[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field780 < 9) {
                    this.field780++;
                }
                for (int var6 = this.field780; var6 > 0; var6--) {
                    this.field815[var6] = this.field815[var6 - 1];
                    this.field816[var6] = this.field816[var6 - 1];
                    this.field784[var6] = this.field784[var6 - 1];
                }
                this.field815[0] = arg0;
                this.field816[0] = arg1;
                this.field784[0] = false;
                return;
            }
        }
        this.field780 = 0;
        this.field806 = 0;
        this.field818 = 0;
        this.field815[0] = arg0;
        this.field816[0] = arg1;
        this.field802 = this.field815[0] * 128 + this.field808 * 64;
        this.field762 = this.field816[0] * 128 + this.field808 * 64;
    }

    @ObfuscatedName("at.b(IZI)V")
    public final void method662(int arg0, boolean arg1) {
        int var3 = this.field815[0];
        int var4 = this.field816[0];
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
        if (this.field777 != -1 && class40.method547(this.field777).field951 == 1) {
            this.field777 = -1;
        }
        if (this.field780 < 9) {
            this.field780++;
        }
        for (int var5 = this.field780; var5 > 0; var5--) {
            this.field815[var5] = this.field815[var5 - 1];
            this.field816[var5] = this.field816[var5 - 1];
            this.field784[var5] = this.field784[var5 - 1];
        }
        this.field815[0] = var3;
        this.field816[0] = var4;
        this.field784[0] = arg1;
    }

    @ObfuscatedName("at.f(B)V")
    public final void method659() {
        this.field780 = 0;
        this.field806 = 0;
    }

    @ObfuscatedName("at.g(I)Z")
    public boolean method19() {
        return false;
    }

    @ObfuscatedName("at.i(IIII)V")
    public final void method661(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field782[var4] <= arg2) {
                this.field783[var4] = arg0;
                this.field786[var4] = arg1;
                this.field782[var4] = arg2 + 70;
                return;
            }
        }
    }
}
