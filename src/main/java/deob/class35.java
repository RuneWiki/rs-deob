package deob;

@ObfuscatedName("au")
public abstract class class35 extends class80 {

    @ObfuscatedName("au.l")
    public int field773;

    @ObfuscatedName("au.u")
    public int field775;

    @ObfuscatedName("au.j")
    public int field825;

    @ObfuscatedName("au.z")
    public boolean field767 = false;

    @ObfuscatedName("au.b")
    public int field768 = 1;

    @ObfuscatedName("au.a")
    public int field769 = -1;

    @ObfuscatedName("au.ag")
    public int field807 = -1;

    @ObfuscatedName("au.am")
    public int field771 = -1;

    @ObfuscatedName("au.aa")
    public int field783 = -1;

    @ObfuscatedName("au.az")
    public int field806 = -1;

    @ObfuscatedName("au.aq")
    public int field774 = -1;

    @ObfuscatedName("au.ak")
    public int field812 = -1;

    @ObfuscatedName("au.ar")
    public int field776 = -1;

    @ObfuscatedName("au.al")
    public String field777 = null;

    @ObfuscatedName("au.au")
    public boolean field778;

    @ObfuscatedName("au.ao")
    public boolean field779 = false;

    @ObfuscatedName("au.af")
    public int field780 = 100;

    @ObfuscatedName("au.ai")
    public int field781 = 0;

    @ObfuscatedName("au.aj")
    public int field782 = 0;

    @ObfuscatedName("au.ab")
    public int[] field821 = new int[4];

    @ObfuscatedName("au.ad")
    public int[] field785 = new int[4];

    @ObfuscatedName("au.ae")
    public int[] field801 = new int[4];

    @ObfuscatedName("au.ay")
    public int field764 = -1000;

    @ObfuscatedName("au.ap")
    public int field787;

    @ObfuscatedName("au.av")
    public int field789;

    @ObfuscatedName("au.ah")
    public int field794 = -1;

    @ObfuscatedName("au.at")
    public int field790 = 0;

    @ObfuscatedName("au.an")
    public int field791 = 0;

    @ObfuscatedName("au.ac")
    public int field792 = -1;

    @ObfuscatedName("au.as")
    public int field793 = 0;

    @ObfuscatedName("au.ax")
    public int field766 = 0;

    @ObfuscatedName("au.bg")
    public int field795 = -1;

    @ObfuscatedName("au.bw")
    public int field765 = 0;

    @ObfuscatedName("au.bn")
    public int field797 = 0;

    @ObfuscatedName("au.by")
    public int field798 = 0;

    @ObfuscatedName("au.bb")
    public int field799 = 0;

    @ObfuscatedName("au.bp")
    public int field800 = -1;

    @ObfuscatedName("au.bc")
    public int field796 = 0;

    @ObfuscatedName("au.bx")
    public int field802 = 0;

    @ObfuscatedName("au.bt")
    public int field803;

    @ObfuscatedName("au.bv")
    public int field804;

    @ObfuscatedName("au.bh")
    public int field805;

    @ObfuscatedName("au.bj")
    public int field772;

    @ObfuscatedName("au.bo")
    public int field784;

    @ObfuscatedName("au.bs")
    public int field808;

    @ObfuscatedName("au.bi")
    public int field809;

    @ObfuscatedName("au.bd")
    public int field810;

    @ObfuscatedName("au.bl")
    public int field811;

    @ObfuscatedName("au.be")
    public int field786 = 0;

    @ObfuscatedName("au.bz")
    public int field770 = 200;

    @ObfuscatedName("au.ba")
    public int field813;

    @ObfuscatedName("au.bq")
    public int field819 = 0;

    @ObfuscatedName("au.br")
    public int field816 = 32;

    @ObfuscatedName("au.bf")
    public int field817 = 0;

    @ObfuscatedName("au.bk")
    public int[] field818 = new int[10];

    @ObfuscatedName("au.bm")
    public int[] field814 = new int[10];

    @ObfuscatedName("au.bu")
    public boolean[] field820 = new boolean[10];

    @ObfuscatedName("au.cz")
    public int field815 = 0;

    @ObfuscatedName("au.cu")
    public int field822 = 0;

    @ObfuscatedName("au.n(IIZI)V")
    public final void method641(int arg0, int arg1, boolean arg2) {
        if (this.field795 != -1 && class40.method678(this.field795).field941 == 1) {
            this.field795 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field818[0];
            int var5 = arg1 - this.field814[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field817 < 9) {
                    this.field817++;
                }
                for (int var6 = this.field817; var6 > 0; var6--) {
                    this.field818[var6] = this.field818[var6 - 1];
                    this.field814[var6] = this.field814[var6 - 1];
                    this.field820[var6] = this.field820[var6 - 1];
                }
                this.field818[0] = arg0;
                this.field814[0] = arg1;
                this.field820[0] = false;
                return;
            }
        }
        this.field817 = 0;
        this.field822 = 0;
        this.field815 = 0;
        this.field818[0] = arg0;
        this.field814[0] = arg1;
        this.field773 = this.field818[0] * 128 + this.field768 * 64;
        this.field775 = this.field814[0] * 128 + this.field768 * 64;
    }

    @ObfuscatedName("au.x(IZB)V")
    public final void method642(int arg0, boolean arg1) {
        int var3 = this.field818[0];
        int var4 = this.field814[0];
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
        if (this.field795 != -1 && class40.method678(this.field795).field941 == 1) {
            this.field795 = -1;
        }
        if (this.field817 < 9) {
            this.field817++;
        }
        for (int var5 = this.field817; var5 > 0; var5--) {
            this.field818[var5] = this.field818[var5 - 1];
            this.field814[var5] = this.field814[var5 - 1];
            this.field820[var5] = this.field820[var5 - 1];
        }
        this.field818[0] = var3;
        this.field814[0] = var4;
        this.field820[0] = arg1;
    }

    @ObfuscatedName("au.o(B)V")
    public final void method649() {
        this.field817 = 0;
        this.field822 = 0;
    }

    @ObfuscatedName("au.e(S)Z")
    public boolean method18() {
        return false;
    }

    @ObfuscatedName("au.r(IIII)V")
    public final void method644(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field801[var4] <= arg2) {
                this.field821[var4] = arg0;
                this.field785[var4] = arg1;
                this.field801[var4] = arg2 + 70;
                return;
            }
        }
    }
}
