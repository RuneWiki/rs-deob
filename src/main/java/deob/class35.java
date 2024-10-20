package deob;

@ObfuscatedName("ak")
public abstract class class35 extends class80 {

    @ObfuscatedName("ak.g")
    public int field749;

    @ObfuscatedName("ak.f")
    public int field752;

    @ObfuscatedName("ak.y")
    public int field785;

    @ObfuscatedName("ak.j")
    public boolean field738 = false;

    @ObfuscatedName("ak.x")
    public int field739 = 1;

    @ObfuscatedName("ak.d")
    public int field793 = -1;

    @ObfuscatedName("ak.ax")
    public int field741 = -1;

    @ObfuscatedName("ak.ag")
    public int field742 = -1;

    @ObfuscatedName("ak.ai")
    public int field743 = -1;

    @ObfuscatedName("ak.ar")
    public int field744 = -1;

    @ObfuscatedName("ak.aw")
    public int field756 = -1;

    @ObfuscatedName("ak.ac")
    public int field746 = -1;

    @ObfuscatedName("ak.ap")
    public int field783 = -1;

    @ObfuscatedName("ak.al")
    public String field764 = null;

    @ObfuscatedName("ak.ak")
    public boolean field773;

    @ObfuscatedName("ak.at")
    public boolean field758 = false;

    @ObfuscatedName("ak.au")
    public int field751 = 100;

    @ObfuscatedName("ak.am")
    public int field755 = 0;

    @ObfuscatedName("ak.aa")
    public int field736 = 0;

    @ObfuscatedName("ak.ae")
    public int[] field747 = new int[4];

    @ObfuscatedName("ak.ah")
    public int[] field786 = new int[4];

    @ObfuscatedName("ak.an")
    public int[] field750 = new int[4];

    @ObfuscatedName("ak.aq")
    public int field757 = -1000;

    @ObfuscatedName("ak.as")
    public int field771;

    @ObfuscatedName("ak.ay")
    public int field759;

    @ObfuscatedName("ak.ad")
    public int field760 = -1;

    @ObfuscatedName("ak.af")
    public int field753 = 0;

    @ObfuscatedName("ak.ab")
    public int field762 = 0;

    @ObfuscatedName("ak.av")
    public int field763 = -1;

    @ObfuscatedName("ak.ao")
    public int field754 = 0;

    @ObfuscatedName("ak.aj")
    public int field765 = 0;

    @ObfuscatedName("ak.bj")
    public int field766 = -1;

    @ObfuscatedName("ak.bv")
    public int field767 = 0;

    @ObfuscatedName("ak.bw")
    public int field768 = 0;

    @ObfuscatedName("ak.bi")
    public int field769 = 0;

    @ObfuscatedName("ak.bh")
    public int field770 = 0;

    @ObfuscatedName("ak.be")
    public int field748 = -1;

    @ObfuscatedName("ak.br")
    public int field772 = 0;

    @ObfuscatedName("ak.bb")
    public int field784 = 0;

    @ObfuscatedName("ak.bq")
    public int field740;

    @ObfuscatedName("ak.bk")
    public int field775;

    @ObfuscatedName("ak.bs")
    public int field776;

    @ObfuscatedName("ak.bo")
    public int field774;

    @ObfuscatedName("ak.bp")
    public int field778;

    @ObfuscatedName("ak.by")
    public int field779;

    @ObfuscatedName("ak.bc")
    public int field780;

    @ObfuscatedName("ak.bn")
    public int field781;

    @ObfuscatedName("ak.bt")
    public int field782;

    @ObfuscatedName("ak.bm")
    public int field745 = 0;

    @ObfuscatedName("ak.bz")
    public int field761 = 200;

    @ObfuscatedName("ak.bx")
    public int field777;

    @ObfuscatedName("ak.ba")
    public int field735 = 0;

    @ObfuscatedName("ak.bf")
    public int field787 = 32;

    @ObfuscatedName("ak.bl")
    public int field788 = 0;

    @ObfuscatedName("ak.bd")
    public int[] field789 = new int[10];

    @ObfuscatedName("ak.bu")
    public int[] field790 = new int[10];

    @ObfuscatedName("ak.bg")
    public boolean[] field791 = new boolean[10];

    @ObfuscatedName("ak.cg")
    public int field792 = 0;

    @ObfuscatedName("ak.cm")
    public int field737 = 0;

    @ObfuscatedName("ak.r(IIZI)V")
    public final void method619(int arg0, int arg1, boolean arg2) {
        if (this.field766 != -1 && class40.method512(this.field766).field930 == 1) {
            this.field766 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field789[0];
            int var5 = arg1 - this.field790[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field788 < 9) {
                    this.field788++;
                }
                for (int var6 = this.field788; var6 > 0; var6--) {
                    this.field789[var6] = this.field789[var6 - 1];
                    this.field790[var6] = this.field790[var6 - 1];
                    this.field791[var6] = this.field791[var6 - 1];
                }
                this.field789[0] = arg0;
                this.field790[0] = arg1;
                this.field791[0] = false;
                return;
            }
        }
        this.field788 = 0;
        this.field737 = 0;
        this.field792 = 0;
        this.field789[0] = arg0;
        this.field790[0] = arg1;
        this.field749 = this.field789[0] * 128 + this.field739 * 64;
        this.field752 = this.field790[0] * 128 + this.field739 * 64;
    }

    @ObfuscatedName("ak.i(IZI)V")
    public final void method620(int arg0, boolean arg1) {
        int var3 = this.field789[0];
        int var4 = this.field790[0];
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
        if (this.field766 != -1 && class40.method512(this.field766).field930 == 1) {
            this.field766 = -1;
        }
        if (this.field788 < 9) {
            this.field788++;
        }
        for (int var5 = this.field788; var5 > 0; var5--) {
            this.field789[var5] = this.field789[var5 - 1];
            this.field790[var5] = this.field790[var5 - 1];
            this.field791[var5] = this.field791[var5 - 1];
        }
        this.field789[0] = var3;
        this.field790[0] = var4;
        this.field791[0] = arg1;
    }

    @ObfuscatedName("ak.s(I)V")
    public final void method621() {
        this.field788 = 0;
        this.field737 = 0;
    }

    @ObfuscatedName("ak.a(I)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("ak.c(IIII)V")
    public final void method629(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field750[var4] <= arg2) {
                this.field747[var4] = arg0;
                this.field786[var4] = arg1;
                this.field750[var4] = arg2 + 70;
                return;
            }
        }
    }
}
