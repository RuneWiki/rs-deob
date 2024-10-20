package deob;

@ObfuscatedName("ah")
public abstract class class27 extends class94 {

    @ObfuscatedName("ah.z")
    public int field400;

    @ObfuscatedName("ah.h")
    public int field404;

    @ObfuscatedName("ah.f")
    public int field397;

    @ObfuscatedName("ah.w")
    public boolean field420 = false;

    @ObfuscatedName("ah.l")
    public int field399 = 1;

    @ObfuscatedName("ah.d")
    public int field453 = -1;

    @ObfuscatedName("ah.y")
    public int field401 = -1;

    @ObfuscatedName("ah.ah")
    public int field402 = -1;

    @ObfuscatedName("ah.ad")
    public int field403 = -1;

    @ObfuscatedName("ah.au")
    public int field429 = -1;

    @ObfuscatedName("ah.as")
    public int field413 = -1;

    @ObfuscatedName("ah.ag")
    public int field406 = -1;

    @ObfuscatedName("ah.ab")
    public int field407 = -1;

    @ObfuscatedName("ah.aq")
    public String field408 = null;

    @ObfuscatedName("ah.af")
    public int field409 = 100;

    @ObfuscatedName("ah.ay")
    public int field410 = 0;

    @ObfuscatedName("ah.ax")
    public int field411 = 0;

    @ObfuscatedName("ah.ak")
    public int[] field412 = new int[4];

    @ObfuscatedName("ah.ac")
    public int[] field414 = new int[4];

    @ObfuscatedName("ah.aj")
    public int[] field450 = new int[4];

    @ObfuscatedName("ah.av")
    public int field415 = -1000;

    @ObfuscatedName("ah.al")
    public int field416;

    @ObfuscatedName("ah.an")
    public int field417;

    @ObfuscatedName("ah.ap")
    public int field418 = -1;

    @ObfuscatedName("ah.at")
    public int field419 = 0;

    @ObfuscatedName("ah.ae")
    public int field405 = 0;

    @ObfuscatedName("ah.aw")
    public int field421 = -1;

    @ObfuscatedName("ah.am")
    public int field436 = 0;

    @ObfuscatedName("ah.ar")
    public int field428 = 0;

    @ObfuscatedName("ah.ai")
    public int field424 = -1;

    @ObfuscatedName("ah.ao")
    public int field425 = 0;

    @ObfuscatedName("ah.az")
    public int field426 = 0;

    @ObfuscatedName("ah.bg")
    public int field427 = 0;

    @ObfuscatedName("ah.bd")
    public int field422 = 0;

    @ObfuscatedName("ah.bo")
    public int field398 = -1;

    @ObfuscatedName("ah.by")
    public int field430 = 0;

    @ObfuscatedName("ah.bk")
    public int field431 = 0;

    @ObfuscatedName("ah.be")
    public int field441;

    @ObfuscatedName("ah.bc")
    public int field433;

    @ObfuscatedName("ah.bl")
    public int field434;

    @ObfuscatedName("ah.ba")
    public int field435;

    @ObfuscatedName("ah.bx")
    public int field443;

    @ObfuscatedName("ah.bq")
    public int field437;

    @ObfuscatedName("ah.bu")
    public int field438;

    @ObfuscatedName("ah.bz")
    public int field439;

    @ObfuscatedName("ah.bw")
    public int field440;

    @ObfuscatedName("ah.br")
    public int field446 = 0;

    @ObfuscatedName("ah.bf")
    public int field452 = 200;

    @ObfuscatedName("ah.bi")
    public int field395;

    @ObfuscatedName("ah.bh")
    public int field444 = 0;

    @ObfuscatedName("ah.bp")
    public int field445 = 32;

    @ObfuscatedName("ah.bb")
    public int field442 = 0;

    @ObfuscatedName("ah.bs")
    public int[] field447 = new int[10];

    @ObfuscatedName("ah.bn")
    public int[] field448 = new int[10];

    @ObfuscatedName("ah.bm")
    public boolean[] field449 = new boolean[10];

    @ObfuscatedName("ah.bt")
    public int field423 = 0;

    @ObfuscatedName("ah.bv")
    public int field451 = 0;

    @ObfuscatedName("ah.p(IIZI)V")
    public final void method207(int arg0, int arg1, boolean arg2) {
        if (this.field424 != -1 && class34.method30(this.field424).field875 == 1) {
            this.field424 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field447[0];
            int var5 = arg1 - this.field448[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field442 < 9) {
                    this.field442++;
                }
                for (int var6 = this.field442; var6 > 0; var6--) {
                    this.field447[var6] = this.field447[var6 - 1];
                    this.field448[var6] = this.field448[var6 - 1];
                    this.field449[var6] = this.field449[var6 - 1];
                }
                this.field447[0] = arg0;
                this.field448[0] = arg1;
                this.field449[0] = false;
                return;
            }
        }
        this.field442 = 0;
        this.field451 = 0;
        this.field423 = 0;
        this.field447[0] = arg0;
        this.field448[0] = arg1;
        this.field400 = this.field447[0] * 128 + this.field399 * 64;
        this.field404 = this.field448[0] * 128 + this.field399 * 64;
    }

    @ObfuscatedName("ah.e(IZB)V")
    public final void method215(int arg0, boolean arg1) {
        int var3 = this.field447[0];
        int var4 = this.field448[0];
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
        if (this.field424 != -1 && class34.method30(this.field424).field875 == 1) {
            this.field424 = -1;
        }
        if (this.field442 < 9) {
            this.field442++;
        }
        for (int var5 = this.field442; var5 > 0; var5--) {
            this.field447[var5] = this.field447[var5 - 1];
            this.field448[var5] = this.field448[var5 - 1];
            this.field449[var5] = this.field449[var5 - 1];
        }
        this.field447[0] = var3;
        this.field448[0] = var4;
        this.field449[0] = arg1;
    }

    @ObfuscatedName("ah.o(I)V")
    public final void method214() {
        this.field442 = 0;
        this.field451 = 0;
    }

    @ObfuscatedName("ah.u(B)Z")
    public boolean method19() {
        return false;
    }

    @ObfuscatedName("ah.j(IIII)V")
    public final void method209(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field450[var4] <= arg2) {
                this.field412[var4] = arg0;
                this.field414[var4] = arg1;
                this.field450[var4] = arg2 + 70;
                return;
            }
        }
    }
}
