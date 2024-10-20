package deob;

@ObfuscatedName("as")
public abstract class class27 extends class94 {

    @ObfuscatedName("as.z")
    public int field444;

    @ObfuscatedName("as.v")
    public int field399;

    @ObfuscatedName("as.w")
    public int field400;

    @ObfuscatedName("as.h")
    public boolean field425 = false;

    @ObfuscatedName("as.q")
    public int field414 = 1;

    @ObfuscatedName("as.g")
    public int field441 = -1;

    @ObfuscatedName("as.e")
    public int field404 = -1;

    @ObfuscatedName("as.as")
    public int field405 = -1;

    @ObfuscatedName("as.an")
    public int field406 = -1;

    @ObfuscatedName("as.aj")
    public int field449 = -1;

    @ObfuscatedName("as.ax")
    public int field408 = -1;

    @ObfuscatedName("as.av")
    public int field434 = -1;

    @ObfuscatedName("as.ae")
    public int field410 = -1;

    @ObfuscatedName("as.am")
    public String field402 = null;

    @ObfuscatedName("as.aq")
    public int field412 = 100;

    @ObfuscatedName("as.at")
    public int field413 = 0;

    @ObfuscatedName("as.ac")
    public int field409 = 0;

    @ObfuscatedName("as.ab")
    public int[] field431 = new int[4];

    @ObfuscatedName("as.aa")
    public int[] field417 = new int[4];

    @ObfuscatedName("as.ao")
    public int[] field418 = new int[4];

    @ObfuscatedName("as.ah")
    public int field423 = -1000;

    @ObfuscatedName("as.au")
    public int field420;

    @ObfuscatedName("as.aw")
    public int field421;

    @ObfuscatedName("as.az")
    public int field422 = -1;

    @ObfuscatedName("as.af")
    public int field403 = 0;

    @ObfuscatedName("as.ap")
    public int field424 = 0;

    @ObfuscatedName("as.ak")
    public int field446 = -1;

    @ObfuscatedName("as.ad")
    public int field426 = 0;

    @ObfuscatedName("as.ag")
    public int field398 = 0;

    @ObfuscatedName("as.ay")
    public int field428 = -1;

    @ObfuscatedName("as.ai")
    public int field419 = 0;

    @ObfuscatedName("as.ar")
    public int field430 = 0;

    @ObfuscatedName("as.br")
    public int field411 = 0;

    @ObfuscatedName("as.bd")
    public int field432 = 0;

    @ObfuscatedName("as.be")
    public int field433 = -1;

    @ObfuscatedName("as.bl")
    public int field416 = 0;

    @ObfuscatedName("as.bi")
    public int field435 = 0;

    @ObfuscatedName("as.bh")
    public int field436;

    @ObfuscatedName("as.bq")
    public int field437;

    @ObfuscatedName("as.bj")
    public int field438;

    @ObfuscatedName("as.bw")
    public int field439;

    @ObfuscatedName("as.bg")
    public int field440;

    @ObfuscatedName("as.bx")
    public int field401;

    @ObfuscatedName("as.bt")
    public int field442;

    @ObfuscatedName("as.bo")
    public int field443;

    @ObfuscatedName("as.bz")
    public int field407;

    @ObfuscatedName("as.bk")
    public int field445 = 0;

    @ObfuscatedName("as.bb")
    public int field429 = 200;

    @ObfuscatedName("as.bf")
    public int field447;

    @ObfuscatedName("as.by")
    public int field448 = 0;

    @ObfuscatedName("as.bm")
    public int field427 = 32;

    @ObfuscatedName("as.bc")
    public int field450 = 0;

    @ObfuscatedName("as.bs")
    public int[] field451 = new int[10];

    @ObfuscatedName("as.ba")
    public int[] field452 = new int[10];

    @ObfuscatedName("as.bn")
    public boolean[] field453 = new boolean[10];

    @ObfuscatedName("as.bp")
    public int field454 = 0;

    @ObfuscatedName("as.bu")
    public int field455 = 0;

    @ObfuscatedName("as.l(IIZI)V")
    public final void method234(int arg0, int arg1, boolean arg2) {
        if (this.field428 != -1 && class34.method540(this.field428).field871 == 1) {
            this.field428 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field451[0];
            int var5 = arg1 - this.field452[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field450 < 9) {
                    this.field450++;
                }
                for (int var6 = this.field450; var6 > 0; var6--) {
                    this.field451[var6] = this.field451[var6 - 1];
                    this.field452[var6] = this.field452[var6 - 1];
                    this.field453[var6] = this.field453[var6 - 1];
                }
                this.field451[0] = arg0;
                this.field452[0] = arg1;
                this.field453[0] = false;
                return;
            }
        }
        this.field450 = 0;
        this.field455 = 0;
        this.field454 = 0;
        this.field451[0] = arg0;
        this.field452[0] = arg1;
        this.field444 = this.field451[0] * 128 + this.field414 * 64;
        this.field399 = this.field452[0] * 128 + this.field414 * 64;
    }

    @ObfuscatedName("as.i(IZB)V")
    public final void method217(int arg0, boolean arg1) {
        int var3 = this.field451[0];
        int var4 = this.field452[0];
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
        if (this.field428 != -1 && class34.method540(this.field428).field871 == 1) {
            this.field428 = -1;
        }
        if (this.field450 < 9) {
            this.field450++;
        }
        for (int var5 = this.field450; var5 > 0; var5--) {
            this.field451[var5] = this.field451[var5 - 1];
            this.field452[var5] = this.field452[var5 - 1];
            this.field453[var5] = this.field453[var5 - 1];
        }
        this.field451[0] = var3;
        this.field452[0] = var4;
        this.field453[0] = arg1;
    }

    @ObfuscatedName("as.r(B)V")
    public final void method220() {
        this.field450 = 0;
        this.field455 = 0;
    }

    @ObfuscatedName("as.d(I)Z")
    public boolean method33() {
        return false;
    }

    @ObfuscatedName("as.o(IIII)V")
    public final void method222(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field418[var4] <= arg2) {
                this.field431[var4] = arg0;
                this.field417[var4] = arg1;
                this.field418[var4] = arg2 + 70;
                return;
            }
        }
    }
}
