package deob;

@ObfuscatedName("ai")
public abstract class class27 extends class94 {

    @ObfuscatedName("ai.m")
    public int field399;

    @ObfuscatedName("ai.o")
    public int field383;

    @ObfuscatedName("ai.e")
    public int field384;

    @ObfuscatedName("ai.f")
    public boolean field385 = false;

    @ObfuscatedName("ai.i")
    public int field433 = 1;

    @ObfuscatedName("ai.d")
    public int field387 = -1;

    @ObfuscatedName("ai.z")
    public int field388 = -1;

    @ObfuscatedName("ai.ai")
    public int field389 = -1;

    @ObfuscatedName("ai.ag")
    public int field390 = -1;

    @ObfuscatedName("ai.as")
    public int field412 = -1;

    @ObfuscatedName("ai.al")
    public int field442 = -1;

    @ObfuscatedName("ai.aj")
    public int field403 = -1;

    @ObfuscatedName("ai.am")
    public int field394 = -1;

    @ObfuscatedName("ai.ab")
    public String field395 = null;

    @ObfuscatedName("ai.ao")
    public int field396 = 100;

    @ObfuscatedName("ai.ac")
    public int field397 = 0;

    @ObfuscatedName("ai.ap")
    public int field439 = 0;

    @ObfuscatedName("ai.az")
    public int[] field409 = new int[4];

    @ObfuscatedName("ai.ae")
    public int[] field400 = new int[4];

    @ObfuscatedName("ai.ad")
    public int[] field401 = new int[4];

    @ObfuscatedName("ai.aw")
    public int field402 = -1000;

    @ObfuscatedName("ai.an")
    public int field427;

    @ObfuscatedName("ai.aq")
    public int field426;

    @ObfuscatedName("ai.ax")
    public int field405 = -1;

    @ObfuscatedName("ai.af")
    public int field406 = 0;

    @ObfuscatedName("ai.ar")
    public int field407 = 0;

    @ObfuscatedName("ai.ay")
    public int field408 = -1;

    @ObfuscatedName("ai.au")
    public int field429 = 0;

    @ObfuscatedName("ai.ak")
    public int field410 = 0;

    @ObfuscatedName("ai.aa")
    public int field411 = -1;

    @ObfuscatedName("ai.av")
    public int field398 = 0;

    @ObfuscatedName("ai.ah")
    public int field415 = 0;

    @ObfuscatedName("ai.bb")
    public int field414 = 0;

    @ObfuscatedName("ai.bz")
    public int field386 = 0;

    @ObfuscatedName("ai.bl")
    public int field416 = -1;

    @ObfuscatedName("ai.bc")
    public int field417 = 0;

    @ObfuscatedName("ai.bi")
    public int field418 = 0;

    @ObfuscatedName("ai.bd")
    public int field419;

    @ObfuscatedName("ai.bv")
    public int field392;

    @ObfuscatedName("ai.bs")
    public int field422;

    @ObfuscatedName("ai.be")
    public int field404;

    @ObfuscatedName("ai.bu")
    public int field423;

    @ObfuscatedName("ai.bj")
    public int field435;

    @ObfuscatedName("ai.bh")
    public int field425;

    @ObfuscatedName("ai.bm")
    public int field382;

    @ObfuscatedName("ai.bg")
    public int field413;

    @ObfuscatedName("ai.br")
    public int field424 = 0;

    @ObfuscatedName("ai.bw")
    public int field391 = 200;

    @ObfuscatedName("ai.bn")
    public int field430;

    @ObfuscatedName("ai.bx")
    public int field431 = 0;

    @ObfuscatedName("ai.bt")
    public int field432 = 32;

    @ObfuscatedName("ai.ba")
    public int field434 = 0;

    @ObfuscatedName("ai.bo")
    public int[] field420 = new int[10];

    @ObfuscatedName("ai.bp")
    public int[] field436 = new int[10];

    @ObfuscatedName("ai.bk")
    public boolean[] field393 = new boolean[10];

    @ObfuscatedName("ai.by")
    public int field437 = 0;

    @ObfuscatedName("ai.bf")
    public int field438 = 0;

    @ObfuscatedName("ai.s(IIZB)V")
    public final void method230(int arg0, int arg1, boolean arg2) {
        if (this.field411 != -1 && class34.method516(this.field411).field868 == 1) {
            this.field411 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field420[0];
            int var5 = arg1 - this.field436[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field434 < 9) {
                    this.field434++;
                }
                for (int var6 = this.field434; var6 > 0; var6--) {
                    this.field420[var6] = this.field420[var6 - 1];
                    this.field436[var6] = this.field436[var6 - 1];
                    this.field393[var6] = this.field393[var6 - 1];
                }
                this.field420[0] = arg0;
                this.field436[0] = arg1;
                this.field393[0] = false;
                return;
            }
        }
        this.field434 = 0;
        this.field438 = 0;
        this.field437 = 0;
        this.field420[0] = arg0;
        this.field436[0] = arg1;
        this.field399 = this.field420[0] * 128 + this.field433 * 64;
        this.field383 = this.field436[0] * 128 + this.field433 * 64;
    }

    @ObfuscatedName("ai.n(IZI)V")
    public final void method239(int arg0, boolean arg1) {
        int var3 = this.field420[0];
        int var4 = this.field436[0];
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
        if (this.field411 != -1 && class34.method516(this.field411).field868 == 1) {
            this.field411 = -1;
        }
        if (this.field434 < 9) {
            this.field434++;
        }
        for (int var5 = this.field434; var5 > 0; var5--) {
            this.field420[var5] = this.field420[var5 - 1];
            this.field436[var5] = this.field436[var5 - 1];
            this.field393[var5] = this.field393[var5 - 1];
        }
        this.field420[0] = var3;
        this.field436[0] = var4;
        this.field393[0] = arg1;
    }

    @ObfuscatedName("ai.c(I)V")
    public final void method232() {
        this.field434 = 0;
        this.field438 = 0;
    }

    @ObfuscatedName("ai.k(I)Z")
    public boolean method11() {
        return false;
    }

    @ObfuscatedName("ai.h(IIIB)V")
    public final void method235(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field401[var4] <= arg2) {
                this.field409[var4] = arg0;
                this.field400[var4] = arg1;
                this.field401[var4] = arg2 + 70;
                return;
            }
        }
    }
}
