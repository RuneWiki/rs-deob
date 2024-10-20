package deob;

@ObfuscatedName("as")
public abstract class class34 extends class79 {

    @ObfuscatedName("as.x")
    public int field753;

    @ObfuscatedName("as.t")
    public int field736;

    @ObfuscatedName("as.e")
    public int field785;

    @ObfuscatedName("as.m")
    public boolean field770 = false;

    @ObfuscatedName("as.o")
    public int field741 = 1;

    @ObfuscatedName("as.a")
    public int field740 = -1;

    @ObfuscatedName("as.am")
    public int field760 = -1;

    @ObfuscatedName("as.ac")
    public int field742 = -1;

    @ObfuscatedName("as.ap")
    public int field774 = -1;

    @ObfuscatedName("as.aq")
    public int field764 = -1;

    @ObfuscatedName("as.az")
    public int field768 = -1;

    @ObfuscatedName("as.ae")
    public int field746 = -1;

    @ObfuscatedName("as.at")
    public int field738 = -1;

    @ObfuscatedName("as.as")
    public String field748 = null;

    @ObfuscatedName("as.aj")
    public boolean field749;

    @ObfuscatedName("as.an")
    public boolean field750 = false;

    @ObfuscatedName("as.al")
    public int field751 = 100;

    @ObfuscatedName("as.ag")
    public int field752 = 0;

    @ObfuscatedName("as.ah")
    public int field788 = 0;

    @ObfuscatedName("as.aa")
    public int[] field754 = new int[4];

    @ObfuscatedName("as.ax")
    public int[] field755 = new int[4];

    @ObfuscatedName("as.ay")
    public int[] field756 = new int[4];

    @ObfuscatedName("as.ao")
    public int field757 = -1000;

    @ObfuscatedName("as.ad")
    public int field758;

    @ObfuscatedName("as.ab")
    public int field759;

    @ObfuscatedName("as.af")
    public int field793 = -1;

    @ObfuscatedName("as.aw")
    public int field789 = 0;

    @ObfuscatedName("as.ai")
    public int field762 = 0;

    @ObfuscatedName("as.ak")
    public int field775 = -1;

    @ObfuscatedName("as.au")
    public int field763 = 0;

    @ObfuscatedName("as.av")
    public int field765 = 0;

    @ObfuscatedName("as.bq")
    public int field766 = -1;

    @ObfuscatedName("as.bs")
    public int field767 = 0;

    @ObfuscatedName("as.bh")
    public int field777 = 0;

    @ObfuscatedName("as.bt")
    public int field769 = 0;

    @ObfuscatedName("as.bg")
    public int field745 = 0;

    @ObfuscatedName("as.bx")
    public int field771 = -1;

    @ObfuscatedName("as.bk")
    public int field772 = 0;

    @ObfuscatedName("as.by")
    public int field773 = 0;

    @ObfuscatedName("as.br")
    public int field779;

    @ObfuscatedName("as.be")
    public int field739;

    @ObfuscatedName("as.bm")
    public int field776;

    @ObfuscatedName("as.bl")
    public int field744;

    @ObfuscatedName("as.bz")
    public int field778;

    @ObfuscatedName("as.bp")
    public int field743;

    @ObfuscatedName("as.bu")
    public int field780;

    @ObfuscatedName("as.bd")
    public int field781;

    @ObfuscatedName("as.bo")
    public int field782;

    @ObfuscatedName("as.bn")
    public int field783 = 0;

    @ObfuscatedName("as.bc")
    public int field784 = 200;

    @ObfuscatedName("as.bf")
    public int field737;

    @ObfuscatedName("as.bw")
    public int field786 = 0;

    @ObfuscatedName("as.ba")
    public int field787 = 32;

    @ObfuscatedName("as.bb")
    public int field761 = 0;

    @ObfuscatedName("as.bi")
    public int[] field747 = new int[10];

    @ObfuscatedName("as.bj")
    public int[] field790 = new int[10];

    @ObfuscatedName("as.bv")
    public boolean[] field791 = new boolean[10];

    @ObfuscatedName("as.ca")
    public int field792 = 0;

    @ObfuscatedName("as.cc")
    public int field735 = 0;

    @ObfuscatedName("as.n(IIZI)V")
    public final void method562(int arg0, int arg1, boolean arg2) {
        if (this.field766 != -1 && class39.method2627(this.field766).field929 == 1) {
            this.field766 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field747[0];
            int var5 = arg1 - this.field790[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field761 < 9) {
                    this.field761++;
                }
                for (int var6 = this.field761; var6 > 0; var6--) {
                    this.field747[var6] = this.field747[var6 - 1];
                    this.field790[var6] = this.field790[var6 - 1];
                    this.field791[var6] = this.field791[var6 - 1];
                }
                this.field747[0] = arg0;
                this.field790[0] = arg1;
                this.field791[0] = false;
                return;
            }
        }
        this.field761 = 0;
        this.field735 = 0;
        this.field792 = 0;
        this.field747[0] = arg0;
        this.field790[0] = arg1;
        this.field753 = this.field747[0] * 128 + this.field741 * 64;
        this.field736 = this.field790[0] * 128 + this.field741 * 64;
    }

    @ObfuscatedName("as.d(IZI)V")
    public final void method563(int arg0, boolean arg1) {
        int var3 = this.field747[0];
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
        if (this.field766 != -1 && class39.method2627(this.field766).field929 == 1) {
            this.field766 = -1;
        }
        if (this.field761 < 9) {
            this.field761++;
        }
        for (int var5 = this.field761; var5 > 0; var5--) {
            this.field747[var5] = this.field747[var5 - 1];
            this.field790[var5] = this.field790[var5 - 1];
            this.field791[var5] = this.field791[var5 - 1];
        }
        this.field747[0] = var3;
        this.field790[0] = var4;
        this.field791[0] = arg1;
    }

    @ObfuscatedName("as.h(I)V")
    public final void method564() {
        this.field761 = 0;
        this.field735 = 0;
    }

    @ObfuscatedName("as.z(I)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("as.y(IIII)V")
    public final void method565(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field756[var4] <= arg2) {
                this.field754[var4] = arg0;
                this.field755[var4] = arg1;
                this.field756[var4] = arg2 + 70;
                return;
            }
        }
    }
}
