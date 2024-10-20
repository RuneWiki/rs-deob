package deob;

@ObfuscatedName("ae")
public abstract class class27 extends class94 {

    @ObfuscatedName("ae.i")
    public int field420;

    @ObfuscatedName("ae.e")
    public int field400;

    @ObfuscatedName("ae.n")
    public int field401;

    @ObfuscatedName("ae.q")
    public boolean field402 = false;

    @ObfuscatedName("ae.w")
    public int field403 = 1;

    @ObfuscatedName("ae.o")
    public int field412 = -1;

    @ObfuscatedName("ae.j")
    public int field405 = -1;

    @ObfuscatedName("ae.ae")
    public int field443 = -1;

    @ObfuscatedName("ae.aq")
    public int field407 = -1;

    @ObfuscatedName("ae.ap")
    public int field426 = -1;

    @ObfuscatedName("ae.ah")
    public int field409 = -1;

    @ObfuscatedName("ae.ax")
    public int field406 = -1;

    @ObfuscatedName("ae.ai")
    public int field411 = -1;

    @ObfuscatedName("ae.aa")
    public String field457 = null;

    @ObfuscatedName("ae.ar")
    public int field413 = 100;

    @ObfuscatedName("ae.ak")
    public int field414 = 0;

    @ObfuscatedName("ae.al")
    public int field449 = 0;

    @ObfuscatedName("ae.aj")
    public int[] field434 = new int[4];

    @ObfuscatedName("ae.az")
    public int[] field417 = new int[4];

    @ObfuscatedName("ae.ac")
    public int[] field418 = new int[4];

    @ObfuscatedName("ae.ay")
    public int field419 = -1000;

    @ObfuscatedName("ae.as")
    public int field432;

    @ObfuscatedName("ae.af")
    public int field421;

    @ObfuscatedName("ae.an")
    public int field422 = -1;

    @ObfuscatedName("ae.am")
    public int field423 = 0;

    @ObfuscatedName("ae.av")
    public int field424 = 0;

    @ObfuscatedName("ae.aw")
    public int field408 = -1;

    @ObfuscatedName("ae.ao")
    public int field440 = 0;

    @ObfuscatedName("ae.at")
    public int field439 = 0;

    @ObfuscatedName("ae.ad")
    public int field428 = -1;

    @ObfuscatedName("ae.ag")
    public int field445 = 0;

    @ObfuscatedName("ae.ab")
    public int field430 = 0;

    @ObfuscatedName("ae.bw")
    public int field431 = 0;

    @ObfuscatedName("ae.bz")
    public int field416 = 0;

    @ObfuscatedName("ae.bm")
    public int field455 = -1;

    @ObfuscatedName("ae.bq")
    public int field429 = 0;

    @ObfuscatedName("ae.bh")
    public int field435 = 0;

    @ObfuscatedName("ae.bi")
    public int field436;

    @ObfuscatedName("ae.bf")
    public int field437;

    @ObfuscatedName("ae.bv")
    public int field438;

    @ObfuscatedName("ae.bk")
    public int field448;

    @ObfuscatedName("ae.bc")
    public int field425;

    @ObfuscatedName("ae.bl")
    public int field441;

    @ObfuscatedName("ae.bp")
    public int field442;

    @ObfuscatedName("ae.bs")
    public int field450;

    @ObfuscatedName("ae.bu")
    public int field444;

    @ObfuscatedName("ae.bt")
    public int field410 = 0;

    @ObfuscatedName("ae.be")
    public int field446 = 200;

    @ObfuscatedName("ae.bd")
    public int field447;

    @ObfuscatedName("ae.br")
    public int field415 = 0;

    @ObfuscatedName("ae.bo")
    public int field404 = 32;

    @ObfuscatedName("ae.bx")
    public int field427 = 0;

    @ObfuscatedName("ae.bb")
    public int[] field451 = new int[10];

    @ObfuscatedName("ae.by")
    public int[] field452 = new int[10];

    @ObfuscatedName("ae.ba")
    public boolean[] field453 = new boolean[10];

    @ObfuscatedName("ae.bg")
    public int field399 = 0;

    @ObfuscatedName("ae.bn")
    public int field454 = 0;

    @ObfuscatedName("ae.m(IIZI)V")
    public final void method231(int arg0, int arg1, boolean arg2) {
        if (this.field428 != -1 && class34.method136(this.field428).field883 == 1) {
            this.field428 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field451[0];
            int var5 = arg1 - this.field452[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field427 < 9) {
                    this.field427++;
                }
                for (int var6 = this.field427; var6 > 0; var6--) {
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
        this.field427 = 0;
        this.field454 = 0;
        this.field399 = 0;
        this.field451[0] = arg0;
        this.field452[0] = arg1;
        this.field420 = this.field451[0] * 128 + this.field403 * 64;
        this.field400 = this.field452[0] * 128 + this.field403 * 64;
    }

    @ObfuscatedName("ae.y(IZI)V")
    public final void method232(int arg0, boolean arg1) {
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
        if (this.field428 != -1 && class34.method136(this.field428).field883 == 1) {
            this.field428 = -1;
        }
        if (this.field427 < 9) {
            this.field427++;
        }
        for (int var5 = this.field427; var5 > 0; var5--) {
            this.field451[var5] = this.field451[var5 - 1];
            this.field452[var5] = this.field452[var5 - 1];
            this.field453[var5] = this.field453[var5 - 1];
        }
        this.field451[0] = var3;
        this.field452[0] = var4;
        this.field453[0] = arg1;
    }

    @ObfuscatedName("ae.b(I)V")
    public final void method234() {
        this.field427 = 0;
        this.field454 = 0;
    }

    @ObfuscatedName("ae.a(I)Z")
    public boolean method19() {
        return false;
    }

    @ObfuscatedName("ae.l(IIIB)V")
    public final void method246(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field418[var4] <= arg2) {
                this.field434[var4] = arg0;
                this.field417[var4] = arg1;
                this.field418[var4] = arg2 + 70;
                return;
            }
        }
    }
}
