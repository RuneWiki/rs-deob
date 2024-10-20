package deob;

@ObfuscatedName("ac")
public abstract class class179 extends class145 {

    @ObfuscatedName("ac.c")
    public int field2668 = -1;

    @ObfuscatedName("ac.a")
    public int field2706;

    @ObfuscatedName("ac.m")
    public int field2667 = 1;

    @ObfuscatedName("ac.v")
    public int field2669 = -1;

    @ObfuscatedName("ac.u")
    public int field2707;

    @ObfuscatedName("ac.p")
    public boolean field2682 = false;

    @ObfuscatedName("ac.y")
    public int field2664;

    @ObfuscatedName("ac.bz")
    public int field2719 = 0;

    @ObfuscatedName("ac.bw")
    public int field2685 = 0;

    @ObfuscatedName("ac.bv")
    public int field2718 = 0;

    @ObfuscatedName("ac.by")
    public int field2703;

    @ObfuscatedName("ac.bx")
    public int field2708;

    @ObfuscatedName("ac.bs")
    public boolean[] field2717 = new boolean[10];

    @ObfuscatedName("ac.br")
    public int field2713 = 32;

    @ObfuscatedName("ac.bu")
    public int field2697 = -1;

    @ObfuscatedName("ac.bt")
    public int[] field2716 = new int[10];

    @ObfuscatedName("ac.bn")
    public int field2700;

    @ObfuscatedName("ac.bo")
    public int field2699 = 0;

    @ObfuscatedName("ac.bp")
    public int field2671 = 0;

    @ObfuscatedName("ac.bq")
    public int field2705;

    @ObfuscatedName("ac.bj")
    public int field2695 = 0;

    @ObfuscatedName("ac.bk")
    public int field2683;

    @ObfuscatedName("ac.bl")
    public int field2710 = 200;

    @ObfuscatedName("ac.bm")
    public int field2698 = 0;

    @ObfuscatedName("ac.bf")
    public int[] field2676 = new int[10];

    @ObfuscatedName("ac.bg")
    public int field2714 = 0;

    @ObfuscatedName("ac.bh")
    public int field2701;

    @ObfuscatedName("ac.bi")
    public int field2666;

    @ObfuscatedName("ac.bb")
    public int field2712 = 0;

    @ObfuscatedName("ac.bc")
    public int field2702;

    @ObfuscatedName("ac.be")
    public int field2709;

    @ObfuscatedName("ac.az")
    public int field2693 = 0;

    @ObfuscatedName("ac.ay")
    public int field2689 = -1;

    @ObfuscatedName("ac.ba")
    public int field2711;

    @ObfuscatedName("ac.at")
    public int field2704 = 0;

    @ObfuscatedName("ac.ar")
    public String field2684 = null;

    @ObfuscatedName("ac.aq")
    public int field2673 = -1;

    @ObfuscatedName("ac.ax")
    public int field2678 = -1;

    @ObfuscatedName("ac.aw")
    public int field2672 = -1;

    @ObfuscatedName("ac.av")
    public int[] field2680 = new int[4];

    @ObfuscatedName("ac.au")
    public int[] field2681 = new int[4];

    @ObfuscatedName("ac.ak")
    public int field2688 = -1;

    @ObfuscatedName("ac.al")
    public int field2715;

    @ObfuscatedName("ac.ai")
    public int field2665 = 100;

    @ObfuscatedName("ac.aj")
    public int field2692 = -1;

    @ObfuscatedName("ac.ao")
    public int field2663;

    @ObfuscatedName("ac.ap")
    public int[] field2696 = new int[4];

    @ObfuscatedName("ac.am")
    public int field2677 = -1000;

    @ObfuscatedName("ac.an")
    public int field2686 = -1;

    @ObfuscatedName("ac.ac")
    public int field2670 = -1;

    @ObfuscatedName("ac.ad")
    public int field2679 = 0;

    @ObfuscatedName("ac.aa")
    public int field2674 = 0;

    @ObfuscatedName("ac.ab")
    public int field2675 = -1;

    @ObfuscatedName("ac.ag")
    public int field2690 = 0;

    @ObfuscatedName("ac.ah")
    public int field2687 = 0;

    @ObfuscatedName("ac.ae")
    public int field2694 = 0;

    @ObfuscatedName("ac.af")
    public int field2691 = 0;

    @ObfuscatedName("ac.j(IIZI)V")
    public final void method3112(int arg0, int arg1, boolean arg2) {
        if (this.field2692 != -1 && class173.method3098(this.field2692).field2583 == 1) {
            this.field2692 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field2676[0];
            int var5 = arg1 - this.field2716[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field2714 < 9) {
                    this.field2714++;
                }
                for (int var6 = this.field2714; var6 > 0; var6--) {
                    this.field2676[var6] = this.field2676[var6 - 1];
                    this.field2716[var6] = this.field2716[var6 - 1];
                    this.field2717[var6] = this.field2717[var6 - 1];
                }
                this.field2676[0] = arg0;
                this.field2716[0] = arg1;
                this.field2717[0] = false;
                return;
            }
        }
        this.field2714 = 0;
        this.field2719 = 0;
        this.field2718 = 0;
        this.field2676[0] = arg0;
        this.field2716[0] = arg1;
        this.field2707 = this.field2676[0] * 128 + this.field2667 * 64;
        this.field2664 = this.field2716[0] * 128 + this.field2667 * 64;
    }

    @ObfuscatedName("ac.x(IZI)V")
    public final void method3113(int arg0, boolean arg1) {
        int var3 = this.field2676[0];
        int var4 = this.field2716[0];
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
        if (this.field2692 != -1 && class173.method3098(this.field2692).field2583 == 1) {
            this.field2692 = -1;
        }
        if (this.field2714 < 9) {
            this.field2714++;
        }
        for (int var5 = this.field2714; var5 > 0; var5--) {
            this.field2676[var5] = this.field2676[var5 - 1];
            this.field2716[var5] = this.field2716[var5 - 1];
            this.field2717[var5] = this.field2717[var5 - 1];
        }
        this.field2676[0] = var3;
        this.field2716[0] = var4;
        this.field2717[0] = arg1;
    }

    @ObfuscatedName("ac.g(I)V")
    public final void method3114() {
        this.field2714 = 0;
        this.field2719 = 0;
    }

    @ObfuscatedName("ac.k(I)Z")
    public boolean method1095() {
        return false;
    }

    @ObfuscatedName("ac.o(IIIB)V")
    public final void method3115(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field2696[var4] <= arg2) {
                this.field2680[var4] = arg0;
                this.field2681[var4] = arg1;
                this.field2696[var4] = arg2 + 70;
                return;
            }
        }
    }
}
