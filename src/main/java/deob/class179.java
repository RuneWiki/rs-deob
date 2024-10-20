package deob;

@ObfuscatedName("fz")
public abstract class class179 extends class166 {

    @ObfuscatedName("fz.r")
    public int field2630;

    @ObfuscatedName("fz.d")
    public int field2615;

    @ObfuscatedName("fz.k")
    public int field2616;

    @ObfuscatedName("fz.u")
    public boolean field2617 = false;

    @ObfuscatedName("fz.v")
    public int field2654 = 1;

    @ObfuscatedName("fz.f")
    public int field2619 = -1;

    @ObfuscatedName("fz.s")
    public int field2620 = -1;

    @ObfuscatedName("fz.j")
    public int field2621 = -1;

    @ObfuscatedName("fz.e")
    public int field2622 = -1;

    @ObfuscatedName("fz.t")
    public int field2668 = -1;

    @ObfuscatedName("fz.y")
    public int field2624 = -1;

    @ObfuscatedName("fz.b")
    public int field2625 = -1;

    @ObfuscatedName("fz.w")
    public int field2626 = -1;

    @ObfuscatedName("fz.g")
    public String field2627 = null;

    @ObfuscatedName("fz.p")
    public int field2628 = 100;

    @ObfuscatedName("fz.z")
    public int field2667 = 0;

    @ObfuscatedName("fz.n")
    public int field2653 = 0;

    @ObfuscatedName("fz.i")
    public int[] field2659 = new int[4];

    @ObfuscatedName("fz.m")
    public int[] field2633 = new int[4];

    @ObfuscatedName("fz.ai")
    public int[] field2634 = new int[4];

    @ObfuscatedName("fz.aa")
    public int field2635 = -1000;

    @ObfuscatedName("fz.af")
    public int field2636;

    @ObfuscatedName("fz.ae")
    public int field2637;

    @ObfuscatedName("fz.at")
    public int field2638 = -1;

    @ObfuscatedName("fz.aj")
    public int field2663 = 0;

    @ObfuscatedName("fz.ar")
    public int field2632 = 0;

    @ObfuscatedName("fz.au")
    public int field2641 = -1;

    @ObfuscatedName("fz.an")
    public int field2639 = 0;

    @ObfuscatedName("fz.az")
    public int field2643 = 0;

    @ObfuscatedName("fz.ac")
    public int field2644 = -1;

    @ObfuscatedName("fz.ap")
    public int field2631 = 0;

    @ObfuscatedName("fz.ad")
    public int field2646 = 0;

    @ObfuscatedName("fz.ax")
    public int field2647 = 0;

    @ObfuscatedName("fz.as")
    public int field2648 = 0;

    @ObfuscatedName("fz.ak")
    public int field2623 = -1;

    @ObfuscatedName("fz.av")
    public int field2650 = 0;

    @ObfuscatedName("fz.ay")
    public int field2651 = 0;

    @ObfuscatedName("fz.ab")
    public int field2645;

    @ObfuscatedName("fz.am")
    public int field2614;

    @ObfuscatedName("fz.aw")
    public int field2642;

    @ObfuscatedName("fz.ag")
    public int field2655;

    @ObfuscatedName("fz.al")
    public int field2656;

    @ObfuscatedName("fz.aq")
    public int field2657;

    @ObfuscatedName("fz.ah")
    public int field2658;

    @ObfuscatedName("fz.ao")
    public int field2629;

    @ObfuscatedName("fz.bg")
    public int field2660;

    @ObfuscatedName("fz.be")
    public int field2661 = 0;

    @ObfuscatedName("fz.bi")
    public int field2662 = 200;

    @ObfuscatedName("fz.bp")
    public int field2670;

    @ObfuscatedName("fz.bw")
    public int field2664 = 0;

    @ObfuscatedName("fz.bu")
    public int field2665 = 32;

    @ObfuscatedName("fz.bf")
    public int field2666 = 0;

    @ObfuscatedName("fz.bc")
    public int[] field2649 = new int[10];

    @ObfuscatedName("fz.bn")
    public int[] field2652 = new int[10];

    @ObfuscatedName("fz.bk")
    public boolean[] field2669 = new boolean[10];

    @ObfuscatedName("fz.bz")
    public int field2618 = 0;

    @ObfuscatedName("fz.bj")
    public int field2671 = 0;

    @ObfuscatedName("fz.w(IIZI)V")
    public final void method2908(int arg0, int arg1, boolean arg2) {
        if (this.field2644 != -1 && class156.method482(this.field2644).field2374 == 1) {
            this.field2644 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field2649[0];
            int var5 = arg1 - this.field2652[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field2666 < 9) {
                    this.field2666++;
                }
                for (int var6 = this.field2666; var6 > 0; var6--) {
                    this.field2649[var6] = this.field2649[var6 - 1];
                    this.field2652[var6] = this.field2652[var6 - 1];
                    this.field2669[var6] = this.field2669[var6 - 1];
                }
                this.field2649[0] = arg0;
                this.field2652[0] = arg1;
                this.field2669[0] = false;
                return;
            }
        }
        this.field2666 = 0;
        this.field2671 = 0;
        this.field2618 = 0;
        this.field2649[0] = arg0;
        this.field2652[0] = arg1;
        this.field2630 = this.field2649[0] * 128 + this.field2654 * 64;
        this.field2615 = this.field2652[0] * 128 + this.field2654 * 64;
    }

    @ObfuscatedName("fz.g(IZI)V")
    public final void method2911(int arg0, boolean arg1) {
        int var3 = this.field2649[0];
        int var4 = this.field2652[0];
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
        if (this.field2644 != -1 && class156.method482(this.field2644).field2374 == 1) {
            this.field2644 = -1;
        }
        if (this.field2666 < 9) {
            this.field2666++;
        }
        for (int var5 = this.field2666; var5 > 0; var5--) {
            this.field2649[var5] = this.field2649[var5 - 1];
            this.field2652[var5] = this.field2652[var5 - 1];
            this.field2669[var5] = this.field2669[var5 - 1];
        }
        this.field2649[0] = var3;
        this.field2652[0] = var4;
        this.field2669[0] = arg1;
    }

    @ObfuscatedName("fz.p(I)V")
    public final void method2906() {
        this.field2666 = 0;
        this.field2671 = 0;
    }

    @ObfuscatedName("fz.z(B)Z")
    public boolean method2909() {
        return false;
    }

    @ObfuscatedName("fz.n(IIII)V")
    public final void method2907(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field2634[var4] <= arg2) {
                this.field2659[var4] = arg0;
                this.field2633[var4] = arg1;
                this.field2634[var4] = arg2 + 70;
                return;
            }
        }
    }
}
