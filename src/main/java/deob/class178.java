package deob;

@ObfuscatedName("fx")
public abstract class class178 extends class165 {

    @ObfuscatedName("fx.l")
    public int field2642;

    @ObfuscatedName("fx.i")
    public int field2614;

    @ObfuscatedName("fx.e")
    public int field2615;

    @ObfuscatedName("fx.a")
    public boolean field2650 = false;

    @ObfuscatedName("fx.g")
    public int field2668 = 1;

    @ObfuscatedName("fx.w")
    public int field2618 = -1;

    @ObfuscatedName("fx.v")
    public int field2656 = -1;

    @ObfuscatedName("fx.u")
    public int field2655 = -1;

    @ObfuscatedName("fx.m")
    public int field2621 = -1;

    @ObfuscatedName("fx.b")
    public int field2622 = -1;

    @ObfuscatedName("fx.f")
    public int field2664 = -1;

    @ObfuscatedName("fx.d")
    public int field2617 = -1;

    @ObfuscatedName("fx.x")
    public int field2625 = -1;

    @ObfuscatedName("fx.z")
    public String field2661 = null;

    @ObfuscatedName("fx.o")
    public int field2627 = 100;

    @ObfuscatedName("fx.c")
    public int field2628 = 0;

    @ObfuscatedName("fx.y")
    public int field2629 = 0;

    @ObfuscatedName("fx.s")
    public int[] field2631 = new int[4];

    @ObfuscatedName("fx.p")
    public int[] field2632 = new int[4];

    @ObfuscatedName("fx.ak")
    public int[] field2633 = new int[4];

    @ObfuscatedName("fx.ap")
    public int field2634 = -1000;

    @ObfuscatedName("fx.ai")
    public int field2635;

    @ObfuscatedName("fx.ae")
    public int field2636;

    @ObfuscatedName("fx.ad")
    public int field2637 = -1;

    @ObfuscatedName("fx.am")
    public int field2626 = 0;

    @ObfuscatedName("fx.ah")
    public int field2639 = 0;

    @ObfuscatedName("fx.au")
    public int field2613 = -1;

    @ObfuscatedName("fx.ac")
    public int field2641 = 0;

    @ObfuscatedName("fx.at")
    public int field2648 = 0;

    @ObfuscatedName("fx.aq")
    public int field2643 = -1;

    @ObfuscatedName("fx.ar")
    public int field2644 = 0;

    @ObfuscatedName("fx.aa")
    public int field2645 = 0;

    @ObfuscatedName("fx.ay")
    public int field2620 = 0;

    @ObfuscatedName("fx.ax")
    public int field2647 = 0;

    @ObfuscatedName("fx.av")
    public int field2640 = -1;

    @ObfuscatedName("fx.az")
    public int field2619 = 0;

    @ObfuscatedName("fx.al")
    public int field2616 = 0;

    @ObfuscatedName("fx.ag")
    public int field2651;

    @ObfuscatedName("fx.as")
    public int field2652;

    @ObfuscatedName("fx.ab")
    public int field2653;

    @ObfuscatedName("fx.af")
    public int field2646;

    @ObfuscatedName("fx.an")
    public int field2670;

    @ObfuscatedName("fx.aj")
    public int field2623;

    @ObfuscatedName("fx.ao")
    public int field2657;

    @ObfuscatedName("fx.aw")
    public int field2658;

    @ObfuscatedName("fx.bk")
    public int field2659;

    @ObfuscatedName("fx.ba")
    public int field2660 = 0;

    @ObfuscatedName("fx.bj")
    public int field2654 = 200;

    @ObfuscatedName("fx.bs")
    public int field2662;

    @ObfuscatedName("fx.bz")
    public int field2663 = 0;

    @ObfuscatedName("fx.bl")
    public int field2669 = 32;

    @ObfuscatedName("fx.bf")
    public int field2665 = 0;

    @ObfuscatedName("fx.bn")
    public int[] field2666 = new int[10];

    @ObfuscatedName("fx.bq")
    public int[] field2649 = new int[10];

    @ObfuscatedName("fx.bh")
    public boolean[] field2667 = new boolean[10];

    @ObfuscatedName("fx.be")
    public int field2638 = 0;

    @ObfuscatedName("fx.bx")
    public int field2624 = 0;

    @ObfuscatedName("fx.w(IIZI)V")
    public final void method2897(int arg0, int arg1, boolean arg2) {
        if (this.field2643 != -1 && class155.method2497(this.field2643).field2371 == 1) {
            this.field2643 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field2666[0];
            int var5 = arg1 - this.field2649[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field2665 < 9) {
                    this.field2665++;
                }
                for (int var6 = this.field2665; var6 > 0; var6--) {
                    this.field2666[var6] = this.field2666[var6 - 1];
                    this.field2649[var6] = this.field2649[var6 - 1];
                    this.field2667[var6] = this.field2667[var6 - 1];
                }
                this.field2666[0] = arg0;
                this.field2649[0] = arg1;
                this.field2667[0] = false;
                return;
            }
        }
        this.field2665 = 0;
        this.field2624 = 0;
        this.field2638 = 0;
        this.field2666[0] = arg0;
        this.field2649[0] = arg1;
        this.field2642 = this.field2666[0] * 128 + this.field2668 * 64;
        this.field2614 = this.field2649[0] * 128 + this.field2668 * 64;
    }

    @ObfuscatedName("fx.v(IZB)V")
    public final void method2896(int arg0, boolean arg1) {
        int var3 = this.field2666[0];
        int var4 = this.field2649[0];
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
        if (this.field2643 != -1 && class155.method2497(this.field2643).field2371 == 1) {
            this.field2643 = -1;
        }
        if (this.field2665 < 9) {
            this.field2665++;
        }
        for (int var5 = this.field2665; var5 > 0; var5--) {
            this.field2666[var5] = this.field2666[var5 - 1];
            this.field2649[var5] = this.field2649[var5 - 1];
            this.field2667[var5] = this.field2667[var5 - 1];
        }
        this.field2666[0] = var3;
        this.field2649[0] = var4;
        this.field2667[0] = arg1;
    }

    @ObfuscatedName("fx.u(I)V")
    public final void method2901() {
        this.field2665 = 0;
        this.field2624 = 0;
    }

    @ObfuscatedName("fx.m(B)Z")
    public boolean method2900() {
        return false;
    }

    @ObfuscatedName("fx.b(IIIB)V")
    public final void method2898(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field2633[var4] <= arg2) {
                this.field2631[var4] = arg0;
                this.field2632[var4] = arg1;
                this.field2633[var4] = arg2 + 70;
                return;
            }
        }
    }
}
