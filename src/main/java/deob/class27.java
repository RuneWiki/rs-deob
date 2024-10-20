package deob;

@ObfuscatedName("ap")
public abstract class class27 extends class94 {

    @ObfuscatedName("ap.a")
    public int field467;

    @ObfuscatedName("ap.f")
    public int field409;

    @ObfuscatedName("ap.s")
    public int field410;

    @ObfuscatedName("ap.w")
    public boolean field411 = false;

    @ObfuscatedName("ap.x")
    public int field463 = 1;

    @ObfuscatedName("ap.j")
    public int field432 = -1;

    @ObfuscatedName("ap.i")
    public int field414 = -1;

    @ObfuscatedName("ap.ap")
    public int field415 = -1;

    @ObfuscatedName("ap.am")
    public int field457 = -1;

    @ObfuscatedName("ap.ao")
    public int field447 = -1;

    @ObfuscatedName("ap.af")
    public int field436 = -1;

    @ObfuscatedName("ap.ae")
    public int field419 = -1;

    @ObfuscatedName("ap.az")
    public int field420 = -1;

    @ObfuscatedName("ap.al")
    public String field421 = null;

    @ObfuscatedName("ap.ak")
    public int field460 = 100;

    @ObfuscatedName("ap.ac")
    public int field443 = 0;

    @ObfuscatedName("ap.an")
    public int field412 = 0;

    @ObfuscatedName("ap.aa")
    public int[] field423 = new int[4];

    @ObfuscatedName("ap.ab")
    public int[] field426 = new int[4];

    @ObfuscatedName("ap.aj")
    public int[] field434 = new int[4];

    @ObfuscatedName("ap.au")
    public int field428 = -1000;

    @ObfuscatedName("ap.ar")
    public int field429;

    @ObfuscatedName("ap.ad")
    public int field430;

    @ObfuscatedName("ap.at")
    public int field431 = -1;

    @ObfuscatedName("ap.ag")
    public int field448 = 0;

    @ObfuscatedName("ap.ax")
    public int field433 = 0;

    @ObfuscatedName("ap.ah")
    public int field452 = -1;

    @ObfuscatedName("ap.av")
    public int field435 = 0;

    @ObfuscatedName("ap.as")
    public int field413 = 0;

    @ObfuscatedName("ap.ay")
    public int field437 = -1;

    @ObfuscatedName("ap.aq")
    public int field438 = 0;

    @ObfuscatedName("ap.aw")
    public int field425 = 0;

    @ObfuscatedName("ap.bc")
    public int field440 = 0;

    @ObfuscatedName("ap.bb")
    public int field441 = 0;

    @ObfuscatedName("ap.bf")
    public int field442 = -1;

    @ObfuscatedName("ap.bn")
    public int field466 = 0;

    @ObfuscatedName("ap.bh")
    public int field444 = 0;

    @ObfuscatedName("ap.bt")
    public int field418;

    @ObfuscatedName("ap.bq")
    public int field446;

    @ObfuscatedName("ap.bk")
    public int field454;

    @ObfuscatedName("ap.bi")
    public int field408;

    @ObfuscatedName("ap.br")
    public int field449;

    @ObfuscatedName("ap.by")
    public int field450;

    @ObfuscatedName("ap.bv")
    public int field451;

    @ObfuscatedName("ap.bs")
    public int field458;

    @ObfuscatedName("ap.bj")
    public int field453;

    @ObfuscatedName("ap.bp")
    public int field427 = 0;

    @ObfuscatedName("ap.bw")
    public int field455 = 200;

    @ObfuscatedName("ap.bz")
    public int field456;

    @ObfuscatedName("ap.bo")
    public int field445 = 0;

    @ObfuscatedName("ap.bm")
    public int field416 = 32;

    @ObfuscatedName("ap.bu")
    public int field459 = 0;

    @ObfuscatedName("ap.bl")
    public int[] field439 = new int[10];

    @ObfuscatedName("ap.ba")
    public int[] field461 = new int[10];

    @ObfuscatedName("ap.bd")
    public boolean[] field462 = new boolean[10];

    @ObfuscatedName("ap.bx")
    public int field424 = 0;

    @ObfuscatedName("ap.be")
    public int field464 = 0;

    @ObfuscatedName("ap.h(IIZS)V")
    public final void method226(int arg0, int arg1, boolean arg2) {
        if (this.field437 != -1 && class34.method2178(this.field437).field893 == 1) {
            this.field437 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field439[0];
            int var5 = arg1 - this.field461[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field459 < 9) {
                    this.field459++;
                }
                for (int var6 = this.field459; var6 > 0; var6--) {
                    this.field439[var6] = this.field439[var6 - 1];
                    this.field461[var6] = this.field461[var6 - 1];
                    this.field462[var6] = this.field462[var6 - 1];
                }
                this.field439[0] = arg0;
                this.field461[0] = arg1;
                this.field462[0] = false;
                return;
            }
        }
        this.field459 = 0;
        this.field464 = 0;
        this.field424 = 0;
        this.field439[0] = arg0;
        this.field461[0] = arg1;
        this.field467 = this.field439[0] * 128 + this.field463 * 64;
        this.field409 = this.field461[0] * 128 + this.field463 * 64;
    }

    @ObfuscatedName("ap.b(IZB)V")
    public final void method227(int arg0, boolean arg1) {
        int var3 = this.field439[0];
        int var4 = this.field461[0];
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
        if (this.field437 != -1 && class34.method2178(this.field437).field893 == 1) {
            this.field437 = -1;
        }
        if (this.field459 < 9) {
            this.field459++;
        }
        for (int var5 = this.field459; var5 > 0; var5--) {
            this.field439[var5] = this.field439[var5 - 1];
            this.field461[var5] = this.field461[var5 - 1];
            this.field462[var5] = this.field462[var5 - 1];
        }
        this.field439[0] = var3;
        this.field461[0] = var4;
        this.field462[0] = arg1;
    }

    @ObfuscatedName("ap.r(I)V")
    public final void method246() {
        this.field459 = 0;
        this.field464 = 0;
    }

    @ObfuscatedName("ap.p(S)Z")
    public boolean method21() {
        return false;
    }

    @ObfuscatedName("ap.t(IIIB)V")
    public final void method230(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field434[var4] <= arg2) {
                this.field423[var4] = arg0;
                this.field426[var4] = arg1;
                this.field434[var4] = arg2 + 70;
                return;
            }
        }
    }
}
