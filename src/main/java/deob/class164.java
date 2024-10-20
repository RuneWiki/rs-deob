package deob;

@ObfuscatedName("as")
public abstract class class164 extends class107 {

    @ObfuscatedName("as.n")
    public int field2459 = -1;

    @ObfuscatedName("as.l")
    public int field2458 = 1;

    @ObfuscatedName("as.h")
    public int field2461;

    @ObfuscatedName("as.w")
    public int field2490;

    @ObfuscatedName("as.t")
    public int field2500;

    @ObfuscatedName("as.r")
    public boolean field2457 = false;

    @ObfuscatedName("as.q")
    public int field2460 = -1;

    @ObfuscatedName("as.bz")
    public int field2509 = 0;

    @ObfuscatedName("as.bw")
    public int field2497;

    @ObfuscatedName("as.bv")
    public int field2514 = 0;

    @ObfuscatedName("as.by")
    public int field2495;

    @ObfuscatedName("as.bx")
    public int field2491;

    @ObfuscatedName("as.bs")
    public int field2504 = 32;

    @ObfuscatedName("as.br")
    public int[] field2503 = new int[10];

    @ObfuscatedName("as.bu")
    public int field2501 = 200;

    @ObfuscatedName("as.bt")
    public int field2474 = 0;

    @ObfuscatedName("as.bn")
    public int field2496;

    @ObfuscatedName("as.bo")
    public int field2471;

    @ObfuscatedName("as.bp")
    public int field2494;

    @ObfuscatedName("as.bq")
    public int field2475 = 0;

    @ObfuscatedName("as.bj")
    public int field2510 = 0;

    @ObfuscatedName("as.bk")
    public int field2505 = 0;

    @ObfuscatedName("as.bl")
    public int field2484 = 0;

    @ObfuscatedName("as.bm")
    public int field2488 = -1;

    @ObfuscatedName("as.bf")
    public int field2454;

    @ObfuscatedName("as.bg")
    public int field2487 = 0;

    @ObfuscatedName("as.bh")
    public int field2502;

    @ObfuscatedName("as.bi")
    public int field2498;

    @ObfuscatedName("as.bb")
    public int field2499;

    @ObfuscatedName("as.bc")
    public int[] field2507 = new int[10];

    @ObfuscatedName("as.be")
    public boolean[] field2508 = new boolean[10];

    @ObfuscatedName("as.az")
    public int field2479 = 0;

    @ObfuscatedName("as.ay")
    public int field2477 = 0;

    @ObfuscatedName("as.ba")
    public int field2470 = 0;

    @ObfuscatedName("as.at")
    public int field2485 = 0;

    @ObfuscatedName("as.as")
    public int field2489 = -1;

    @ObfuscatedName("as.ar")
    public int field2468 = 100;

    @ObfuscatedName("as.aq")
    public int field2483 = -1;

    @ObfuscatedName("as.ax")
    public int field2463 = -1;

    @ObfuscatedName("as.aw")
    public int field2465 = -1000;

    @ObfuscatedName("as.av")
    public int field2506;

    @ObfuscatedName("as.au")
    public int[] field2472 = new int[4];

    @ObfuscatedName("as.ak")
    public int field2482 = 0;

    @ObfuscatedName("as.al")
    public int[] field2473 = new int[4];

    @ObfuscatedName("as.ai")
    public int field2492 = 0;

    @ObfuscatedName("as.aj")
    public int[] field2456 = new int[4];

    @ObfuscatedName("as.ao")
    public int field2464 = -1;

    @ObfuscatedName("as.ap")
    public int field2455 = -1;

    @ObfuscatedName("as.an")
    public String field2467 = null;

    @ObfuscatedName("as.ac")
    public int field2462 = -1;

    @ObfuscatedName("as.ad")
    public int field2478 = 0;

    @ObfuscatedName("as.aa")
    public int field2466 = -1;

    @ObfuscatedName("as.ab")
    public int field2481 = 0;

    @ObfuscatedName("as.ag")
    public int field2480 = -1;

    @ObfuscatedName("as.ah")
    public int field2516 = -1;

    @ObfuscatedName("as.ae")
    public int field2486 = 0;

    @ObfuscatedName("as.af")
    public int field2476;

    @ObfuscatedName("as.u(IIZB)V")
    public final void method2956(int arg0, int arg1, boolean arg2) {
        if (this.field2483 != -1 && class165.method3233(this.field2483).field2530 == 1) {
            this.field2483 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field2503[0];
            int var5 = arg1 - this.field2507[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field2505 < 9) {
                    this.field2505++;
                }
                for (int var6 = this.field2505; var6 > 0; var6--) {
                    this.field2503[var6] = this.field2503[var6 - 1];
                    this.field2507[var6] = this.field2507[var6 - 1];
                    this.field2508[var6] = this.field2508[var6 - 1];
                }
                this.field2503[0] = arg0;
                this.field2507[0] = arg1;
                this.field2508[0] = false;
                return;
            }
        }
        this.field2505 = 0;
        this.field2474 = 0;
        this.field2509 = 0;
        this.field2503[0] = arg0;
        this.field2507[0] = arg1;
        this.field2461 = this.field2503[0] * 128 + this.field2458 * 64;
        this.field2500 = this.field2507[0] * 128 + this.field2458 * 64;
    }

    @ObfuscatedName("as.p(IIII)V")
    public final void method2960(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field2473[var4] <= arg2) {
                this.field2456[var4] = arg0;
                this.field2472[var4] = arg1;
                this.field2473[var4] = arg2 + 70;
                return;
            }
        }
    }

    @ObfuscatedName("as.e(S)V")
    public final void method2968() {
        this.field2505 = 0;
        this.field2474 = 0;
    }

    @ObfuscatedName("as.b(I)Z")
    public boolean method944() {
        return false;
    }

    @ObfuscatedName("as.k(IZS)V")
    public final void method2970(int arg0, boolean arg1) {
        int var3 = this.field2503[0];
        int var4 = this.field2507[0];
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
        if (this.field2483 != -1 && class165.method3233(this.field2483).field2530 == 1) {
            this.field2483 = -1;
        }
        if (this.field2505 < 9) {
            this.field2505++;
        }
        for (int var5 = this.field2505; var5 > 0; var5--) {
            this.field2503[var5] = this.field2503[var5 - 1];
            this.field2507[var5] = this.field2507[var5 - 1];
            this.field2508[var5] = this.field2508[var5 - 1];
        }
        this.field2503[0] = var3;
        this.field2507[0] = var4;
        this.field2508[0] = arg1;
    }
}
