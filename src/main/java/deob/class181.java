package deob;

@ObfuscatedName("aa")
public abstract class class181 extends class144 {

    @ObfuscatedName("aa.d")
    public int field2687 = -1;

    @ObfuscatedName("aa.b")
    public int field2684;

    @ObfuscatedName("aa.a")
    public int field2688 = -1;

    @ObfuscatedName("aa.k")
    public boolean field2721 = false;

    @ObfuscatedName("aa.u")
    public int field2735;

    @ObfuscatedName("aa.q")
    public int field2697 = 1;

    @ObfuscatedName("aa.y")
    public int field2683;

    @ObfuscatedName("aa.bz")
    public int field2738 = 0;

    @ObfuscatedName("aa.bv")
    public int[] field2698 = new int[10];

    @ObfuscatedName("aa.by")
    public int field2707;

    @ObfuscatedName("aa.bx")
    public int field2724;

    @ObfuscatedName("aa.bs")
    public int field2729 = 200;

    @ObfuscatedName("aa.br")
    public int field2727;

    @ObfuscatedName("aa.bu")
    public int field2703;

    @ObfuscatedName("aa.bt")
    public int field2731 = 0;

    @ObfuscatedName("aa.bn")
    public int field2728 = 0;

    @ObfuscatedName("aa.bo")
    public int field2730;

    @ObfuscatedName("aa.bp")
    public int field2725;

    @ObfuscatedName("aa.bq")
    public int field2716 = -1;

    @ObfuscatedName("aa.bj")
    public int field2732 = 32;

    @ObfuscatedName("aa.bk")
    public int[] field2734 = new int[10];

    @ObfuscatedName("aa.bl")
    public int field2720;

    @ObfuscatedName("aa.bm")
    public int field2723;

    @ObfuscatedName("aa.bf")
    public int field2718 = 0;

    @ObfuscatedName("aa.bg")
    public int field2693;

    @ObfuscatedName("aa.bh")
    public int field2714 = 0;

    @ObfuscatedName("aa.bi")
    public int field2689 = 0;

    @ObfuscatedName("aa.bb")
    public int field2717 = 0;

    @ObfuscatedName("aa.bc")
    public int field2722;

    @ObfuscatedName("aa.bd")
    public int field2737 = 0;

    @ObfuscatedName("aa.be")
    public int field2709 = 0;

    @ObfuscatedName("aa.az")
    public int field2706 = 0;

    @ObfuscatedName("aa.ay")
    public int field2712 = 0;

    @ObfuscatedName("aa.ba")
    public boolean[] field2736 = new boolean[10];

    @ObfuscatedName("aa.at")
    public int field2690 = -1;

    @ObfuscatedName("aa.ar")
    public int[] field2701 = new int[4];

    @ObfuscatedName("aa.aq")
    public int field2696 = 100;

    @ObfuscatedName("aa.ax")
    public int field2692 = -1;

    @ObfuscatedName("aa.aw")
    public int field2711 = -1;

    @ObfuscatedName("aa.av")
    public int field2708 = 0;

    @ObfuscatedName("aa.au")
    public int field2691 = -1;

    @ObfuscatedName("aa.ak")
    public int field2710 = 0;

    @ObfuscatedName("aa.al")
    public int field2705 = -1;

    @ObfuscatedName("aa.ai")
    public int field2686 = 0;

    @ObfuscatedName("aa.aj")
    public int[] field2700 = new int[4];

    @ObfuscatedName("aa.ao")
    public int field2726 = 0;

    @ObfuscatedName("aa.ap")
    public int field2702 = -1000;

    @ObfuscatedName("aa.am")
    public int field2733 = 0;

    @ObfuscatedName("aa.an")
    public int field2704;

    @ObfuscatedName("aa.ac")
    public int field2740;

    @ObfuscatedName("aa.ad")
    public String field2695 = null;

    @ObfuscatedName("aa.aa")
    public int field2715 = -1;

    @ObfuscatedName("aa.ab")
    public int[] field2699 = new int[4];

    @ObfuscatedName("aa.ag")
    public int field2719 = -1;

    @ObfuscatedName("aa.ah")
    public int field2694 = -1;

    @ObfuscatedName("aa.ae")
    public int field2682 = -1;

    @ObfuscatedName("aa.af")
    public int field2713 = 0;

    @ObfuscatedName("aa.s(IIZI)V")
    public final void method3435(int arg0, int arg1, boolean arg2) {
        if (this.field2711 != -1 && class166.method274(this.field2711).field2541 == 1) {
            this.field2711 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field2734[0];
            int var5 = arg1 - this.field2698[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field2689 < 9) {
                    this.field2689++;
                }
                for (int var6 = this.field2689; var6 > 0; var6--) {
                    this.field2734[var6] = this.field2734[var6 - 1];
                    this.field2698[var6] = this.field2698[var6 - 1];
                    this.field2736[var6] = this.field2736[var6 - 1];
                }
                this.field2734[0] = arg0;
                this.field2698[0] = arg1;
                this.field2736[0] = false;
                return;
            }
        }
        this.field2689 = 0;
        this.field2738 = 0;
        this.field2737 = 0;
        this.field2734[0] = arg0;
        this.field2698[0] = arg1;
        this.field2735 = this.field2734[0] * 128 + this.field2697 * 64;
        this.field2683 = this.field2698[0] * 128 + this.field2697 * 64;
    }

    @ObfuscatedName("aa.v(I)V")
    public final void method3436() {
        this.field2689 = 0;
        this.field2738 = 0;
    }

    @ObfuscatedName("aa.c(IIII)V")
    public final void method3440(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field2701[var4] <= arg2) {
                this.field2699[var4] = arg0;
                this.field2700[var4] = arg1;
                this.field2701[var4] = arg2 + 70;
                return;
            }
        }
    }

    @ObfuscatedName("aa.m(IZI)V")
    public final void method3444(int arg0, boolean arg1) {
        int var3 = this.field2734[0];
        int var4 = this.field2698[0];
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
        if (this.field2711 != -1 && class166.method274(this.field2711).field2541 == 1) {
            this.field2711 = -1;
        }
        if (this.field2689 < 9) {
            this.field2689++;
        }
        for (int var5 = this.field2689; var5 > 0; var5--) {
            this.field2734[var5] = this.field2734[var5 - 1];
            this.field2698[var5] = this.field2698[var5 - 1];
            this.field2736[var5] = this.field2736[var5 - 1];
        }
        this.field2734[0] = var3;
        this.field2698[0] = var4;
        this.field2736[0] = arg1;
    }

    @ObfuscatedName("aa.o(B)Z")
    public boolean method821() {
        return false;
    }
}
