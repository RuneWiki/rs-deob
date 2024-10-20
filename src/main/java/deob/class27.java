package deob;

@ObfuscatedName("ar")
public abstract class class27 extends class94 {

    @ObfuscatedName("ar.d")
    public int field442;

    @ObfuscatedName("ar.i")
    public int field430;

    @ObfuscatedName("ar.p")
    public int field413;

    @ObfuscatedName("ar.h")
    public boolean field437 = false;

    @ObfuscatedName("ar.f")
    public int field415 = 1;

    @ObfuscatedName("ar.t")
    public int field416 = -1;

    @ObfuscatedName("ar.x")
    public int field417 = -1;

    @ObfuscatedName("ar.ar")
    public int field418 = -1;

    @ObfuscatedName("ar.au")
    public int field419 = -1;

    @ObfuscatedName("ar.an")
    public int field420 = -1;

    @ObfuscatedName("ar.ad")
    public int field421 = -1;

    @ObfuscatedName("ar.at")
    public int field412 = -1;

    @ObfuscatedName("ar.ay")
    public int field411 = -1;

    @ObfuscatedName("ar.ac")
    public String field424 = null;

    @ObfuscatedName("ar.av")
    public int field458 = 100;

    @ObfuscatedName("ar.ae")
    public int field470 = 0;

    @ObfuscatedName("ar.ah")
    public int field427 = 0;

    @ObfuscatedName("ar.ax")
    public int[] field428 = new int[4];

    @ObfuscatedName("ar.am")
    public int[] field429 = new int[4];

    @ObfuscatedName("ar.af")
    public int[] field452 = new int[4];

    @ObfuscatedName("ar.ao")
    public int field422 = -1000;

    @ObfuscatedName("ar.ab")
    public int field449;

    @ObfuscatedName("ar.aj")
    public int field433;

    @ObfuscatedName("ar.ag")
    public int field434 = -1;

    @ObfuscatedName("ar.aw")
    public int field464 = 0;

    @ObfuscatedName("ar.az")
    public int field436 = 0;

    @ObfuscatedName("ar.al")
    public int field456 = -1;

    @ObfuscatedName("ar.as")
    public int field438 = 0;

    @ObfuscatedName("ar.ap")
    public int field439 = 0;

    @ObfuscatedName("ar.ai")
    public int field414 = -1;

    @ObfuscatedName("ar.aa")
    public int field441 = 0;

    @ObfuscatedName("ar.ak")
    public int field461 = 0;

    @ObfuscatedName("ar.bi")
    public int field443 = 0;

    @ObfuscatedName("ar.bd")
    public int field444 = 0;

    @ObfuscatedName("ar.bb")
    public int field445 = -1;

    @ObfuscatedName("ar.bn")
    public int field446 = 0;

    @ObfuscatedName("ar.bp")
    public int field447 = 0;

    @ObfuscatedName("ar.bm")
    public int field450;

    @ObfuscatedName("ar.bt")
    public int field451;

    @ObfuscatedName("ar.bh")
    public int field425;

    @ObfuscatedName("ar.bj")
    public int field435;

    @ObfuscatedName("ar.be")
    public int field426;

    @ObfuscatedName("ar.bl")
    public int field453;

    @ObfuscatedName("ar.bv")
    public int field454;

    @ObfuscatedName("ar.bc")
    public int field455;

    @ObfuscatedName("ar.br")
    public int field423;

    @ObfuscatedName("ar.bx")
    public int field457 = 0;

    @ObfuscatedName("ar.bu")
    public int field431 = 200;

    @ObfuscatedName("ar.bo")
    public int field459;

    @ObfuscatedName("ar.by")
    public int field460 = 0;

    @ObfuscatedName("ar.bg")
    public int field448 = 32;

    @ObfuscatedName("ar.ba")
    public int field462 = 0;

    @ObfuscatedName("ar.bf")
    public int[] field463 = new int[10];

    @ObfuscatedName("ar.bk")
    public int[] field440 = new int[10];

    @ObfuscatedName("ar.bz")
    public boolean[] field465 = new boolean[10];

    @ObfuscatedName("ar.bq")
    public int field466 = 0;

    @ObfuscatedName("ar.bw")
    public int field467 = 0;

    @ObfuscatedName("ar.j(IIZB)V")
    public final void method243(int arg0, int arg1, boolean arg2) {
        if (this.field414 != -1 && class34.method2198(this.field414).field868 == 1) {
            this.field414 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field463[0];
            int var5 = arg1 - this.field440[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field462 < 9) {
                    this.field462++;
                }
                for (int var6 = this.field462; var6 > 0; var6--) {
                    this.field463[var6] = this.field463[var6 - 1];
                    this.field440[var6] = this.field440[var6 - 1];
                    this.field465[var6] = this.field465[var6 - 1];
                }
                this.field463[0] = arg0;
                this.field440[0] = arg1;
                this.field465[0] = false;
                return;
            }
        }
        this.field462 = 0;
        this.field467 = 0;
        this.field466 = 0;
        this.field463[0] = arg0;
        this.field440[0] = arg1;
        this.field442 = this.field463[0] * 128 + this.field415 * 64;
        this.field430 = this.field440[0] * 128 + this.field415 * 64;
    }

    @ObfuscatedName("ar.c(IZB)V")
    public final void method257(int arg0, boolean arg1) {
        int var3 = this.field463[0];
        int var4 = this.field440[0];
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
        if (this.field414 != -1 && class34.method2198(this.field414).field868 == 1) {
            this.field414 = -1;
        }
        if (this.field462 < 9) {
            this.field462++;
        }
        for (int var5 = this.field462; var5 > 0; var5--) {
            this.field463[var5] = this.field463[var5 - 1];
            this.field440[var5] = this.field440[var5 - 1];
            this.field465[var5] = this.field465[var5 - 1];
        }
        this.field463[0] = var3;
        this.field440[0] = var4;
        this.field465[0] = arg1;
    }

    @ObfuscatedName("ar.m(I)V")
    public final void method244() {
        this.field462 = 0;
        this.field467 = 0;
    }

    @ObfuscatedName("ar.o(I)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("ar.a(IIIB)V")
    public final void method246(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field452[var4] <= arg2) {
                this.field428[var4] = arg0;
                this.field429[var4] = arg1;
                this.field452[var4] = arg2 + 70;
                return;
            }
        }
    }
}
