package deob;

@ObfuscatedName("u")
public abstract class class26 extends class93 {

    @ObfuscatedName("u.a")
    public int field446;

    @ObfuscatedName("u.v")
    public int field406;

    @ObfuscatedName("u.i")
    public int field407;

    @ObfuscatedName("u.k")
    public boolean field408 = false;

    @ObfuscatedName("u.o")
    public int field409 = 1;

    @ObfuscatedName("u.d")
    public int field430 = -1;

    @ObfuscatedName("u.u")
    public int field461 = -1;

    @ObfuscatedName("u.ap")
    public int field412 = -1;

    @ObfuscatedName("u.ad")
    public int field413 = -1;

    @ObfuscatedName("u.ao")
    public int field414 = -1;

    @ObfuscatedName("u.av")
    public int field433 = -1;

    @ObfuscatedName("u.af")
    public int field416 = -1;

    @ObfuscatedName("u.ae")
    public int field417 = -1;

    @ObfuscatedName("u.ax")
    public String field456 = null;

    @ObfuscatedName("u.aw")
    public int field419 = 100;

    @ObfuscatedName("u.an")
    public int field438 = 0;

    @ObfuscatedName("u.az")
    public int field420 = 0;

    @ObfuscatedName("u.ag")
    public int[] field422 = new int[4];

    @ObfuscatedName("u.am")
    public int[] field423 = new int[4];

    @ObfuscatedName("u.ah")
    public int[] field424 = new int[4];

    @ObfuscatedName("u.aj")
    public int field425 = -1000;

    @ObfuscatedName("u.ab")
    public int field426;

    @ObfuscatedName("u.at")
    public int field427;

    @ObfuscatedName("u.ai")
    public int field428 = -1;

    @ObfuscatedName("u.aa")
    public int field429 = 0;

    @ObfuscatedName("u.ar")
    public int field448 = 0;

    @ObfuscatedName("u.au")
    public int field463 = -1;

    @ObfuscatedName("u.aq")
    public int field410 = 0;

    @ObfuscatedName("u.ay")
    public int field452 = 0;

    @ObfuscatedName("u.ak")
    public int field434 = -1;

    @ObfuscatedName("u.ac")
    public int field436 = 0;

    @ObfuscatedName("u.al")
    public int field415 = 0;

    @ObfuscatedName("u.bd")
    public int field437 = 0;

    @ObfuscatedName("u.bt")
    public int field418 = 0;

    @ObfuscatedName("u.bh")
    public int field447 = -1;

    @ObfuscatedName("u.bl")
    public int field440 = 0;

    @ObfuscatedName("u.bx")
    public int field441 = 0;

    @ObfuscatedName("u.bk")
    public int field442;

    @ObfuscatedName("u.bu")
    public int field443;

    @ObfuscatedName("u.bo")
    public int field435;

    @ObfuscatedName("u.br")
    public int field444;

    @ObfuscatedName("u.bm")
    public int field432;

    @ObfuscatedName("u.bg")
    public int field421;

    @ObfuscatedName("u.bb")
    public int field445;

    @ObfuscatedName("u.bp")
    public int field449;

    @ObfuscatedName("u.bw")
    public int field450;

    @ObfuscatedName("u.bi")
    public int field451 = 0;

    @ObfuscatedName("u.bs")
    public int field405 = 200;

    @ObfuscatedName("u.bq")
    public int field453;

    @ObfuscatedName("u.bc")
    public int field454 = 0;

    @ObfuscatedName("u.bz")
    public int field455 = 32;

    @ObfuscatedName("u.be")
    public int field462 = 0;

    @ObfuscatedName("u.by")
    public int[] field457 = new int[10];

    @ObfuscatedName("u.bn")
    public int[] field458 = new int[10];

    @ObfuscatedName("u.bv")
    public boolean[] field459 = new boolean[10];

    @ObfuscatedName("u.ba")
    public int field460 = 0;

    @ObfuscatedName("u.bj")
    public int field439 = 0;

    @ObfuscatedName("u.m(IIZI)V")
    public final void method235(int arg0, int arg1, boolean arg2) {
        if (this.field434 != -1 && class33.method2589(this.field434).field874 == 1) {
            this.field434 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field457[0];
            int var5 = arg1 - this.field458[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field462 < 9) {
                    this.field462++;
                }
                for (int var6 = this.field462; var6 > 0; var6--) {
                    this.field457[var6] = this.field457[var6 - 1];
                    this.field458[var6] = this.field458[var6 - 1];
                    this.field459[var6] = this.field459[var6 - 1];
                }
                this.field457[0] = arg0;
                this.field458[0] = arg1;
                this.field459[0] = false;
                return;
            }
        }
        this.field462 = 0;
        this.field439 = 0;
        this.field460 = 0;
        this.field457[0] = arg0;
        this.field458[0] = arg1;
        this.field446 = this.field457[0] * 128 + this.field409 * 64;
        this.field406 = this.field458[0] * 128 + this.field409 * 64;
    }

    @ObfuscatedName("u.s(IZI)V")
    public final void method236(int arg0, boolean arg1) {
        int var3 = this.field457[0];
        int var4 = this.field458[0];
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
        if (this.field434 != -1 && class33.method2589(this.field434).field874 == 1) {
            this.field434 = -1;
        }
        if (this.field462 < 9) {
            this.field462++;
        }
        for (int var5 = this.field462; var5 > 0; var5--) {
            this.field457[var5] = this.field457[var5 - 1];
            this.field458[var5] = this.field458[var5 - 1];
            this.field459[var5] = this.field459[var5 - 1];
        }
        this.field457[0] = var3;
        this.field458[0] = var4;
        this.field459[0] = arg1;
    }

    @ObfuscatedName("u.p(I)V")
    public final void method244() {
        this.field462 = 0;
        this.field439 = 0;
    }

    @ObfuscatedName("u.f(I)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("u.w(IIIB)V")
    public final void method242(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field424[var4] <= arg2) {
                this.field422[var4] = arg0;
                this.field423[var4] = arg1;
                this.field424[var4] = arg2 + 70;
                return;
            }
        }
    }
}
