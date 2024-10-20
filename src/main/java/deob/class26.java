package deob;

@ObfuscatedName("y")
public abstract class class26 extends class93 {

    @ObfuscatedName("y.j")
    public int field410;

    @ObfuscatedName("y.a")
    public int field397;

    @ObfuscatedName("y.g")
    public int field452;

    @ObfuscatedName("y.x")
    public boolean field399 = false;

    @ObfuscatedName("y.b")
    public int field400 = 1;

    @ObfuscatedName("y.w")
    public int field437 = -1;

    @ObfuscatedName("y.y")
    public int field396 = -1;

    @ObfuscatedName("y.au")
    public int field403 = -1;

    @ObfuscatedName("y.az")
    public int field404 = -1;

    @ObfuscatedName("y.ak")
    public int field405 = -1;

    @ObfuscatedName("y.ah")
    public int field406 = -1;

    @ObfuscatedName("y.aa")
    public int field409 = -1;

    @ObfuscatedName("y.am")
    public int field427 = -1;

    @ObfuscatedName("y.al")
    public String field420 = null;

    @ObfuscatedName("y.ae")
    public int field398 = 100;

    @ObfuscatedName("y.ab")
    public int field417 = 0;

    @ObfuscatedName("y.as")
    public int field412 = 0;

    @ObfuscatedName("y.aj")
    public int[] field413 = new int[4];

    @ObfuscatedName("y.an")
    public int[] field414 = new int[4];

    @ObfuscatedName("y.av")
    public int[] field415 = new int[4];

    @ObfuscatedName("y.af")
    public int field416 = -1000;

    @ObfuscatedName("y.ax")
    public int field428;

    @ObfuscatedName("y.ao")
    public int field418;

    @ObfuscatedName("y.aw")
    public int field411 = -1;

    @ObfuscatedName("y.ap")
    public int field419 = 0;

    @ObfuscatedName("y.ay")
    public int field402 = 0;

    @ObfuscatedName("y.ag")
    public int field422 = -1;

    @ObfuscatedName("y.ar")
    public int field423 = 0;

    @ObfuscatedName("y.aq")
    public int field424 = 0;

    @ObfuscatedName("y.ac")
    public int field425 = -1;

    @ObfuscatedName("y.at")
    public int field426 = 0;

    @ObfuscatedName("y.ad")
    public int field444 = 0;

    @ObfuscatedName("y.bh")
    public int field451 = 0;

    @ObfuscatedName("y.bs")
    public int field446 = 0;

    @ObfuscatedName("y.bk")
    public int field401 = -1;

    @ObfuscatedName("y.be")
    public int field431 = 0;

    @ObfuscatedName("y.bp")
    public int field432 = 0;

    @ObfuscatedName("y.bi")
    public int field421;

    @ObfuscatedName("y.bf")
    public int field434;

    @ObfuscatedName("y.bo")
    public int field435;

    @ObfuscatedName("y.by")
    public int field436;

    @ObfuscatedName("y.bz")
    public int field442;

    @ObfuscatedName("y.bt")
    public int field438;

    @ObfuscatedName("y.bc")
    public int field439;

    @ObfuscatedName("y.bd")
    public int field440;

    @ObfuscatedName("y.bj")
    public int field441;

    @ObfuscatedName("y.bn")
    public int field429 = 0;

    @ObfuscatedName("y.bv")
    public int field443 = 200;

    @ObfuscatedName("y.bw")
    public int field408;

    @ObfuscatedName("y.bg")
    public int field445 = 0;

    @ObfuscatedName("y.bm")
    public int field430 = 32;

    @ObfuscatedName("y.bu")
    public int field447 = 0;

    @ObfuscatedName("y.br")
    public int[] field448 = new int[10];

    @ObfuscatedName("y.bx")
    public int[] field449 = new int[10];

    @ObfuscatedName("y.bq")
    public boolean[] field433 = new boolean[10];

    @ObfuscatedName("y.ba")
    public int field450 = 0;

    @ObfuscatedName("y.bb")
    public int field407 = 0;

    @ObfuscatedName("y.h(IIZI)V")
    public final void method225(int arg0, int arg1, boolean arg2) {
        if (this.field425 != -1 && class33.method1401(this.field425).field873 == 1) {
            this.field425 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field448[0];
            int var5 = arg1 - this.field449[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field447 < 9) {
                    this.field447++;
                }
                for (int var6 = this.field447; var6 > 0; var6--) {
                    this.field448[var6] = this.field448[var6 - 1];
                    this.field449[var6] = this.field449[var6 - 1];
                    this.field433[var6] = this.field433[var6 - 1];
                }
                this.field448[0] = arg0;
                this.field449[0] = arg1;
                this.field433[0] = false;
                return;
            }
        }
        this.field447 = 0;
        this.field407 = 0;
        this.field450 = 0;
        this.field448[0] = arg0;
        this.field449[0] = arg1;
        this.field410 = this.field448[0] * 128 + this.field400 * 64;
        this.field397 = this.field449[0] * 128 + this.field400 * 64;
    }

    @ObfuscatedName("y.p(IZS)V")
    public final void method227(int arg0, boolean arg1) {
        int var3 = this.field448[0];
        int var4 = this.field449[0];
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
        if (this.field425 != -1 && class33.method1401(this.field425).field873 == 1) {
            this.field425 = -1;
        }
        if (this.field447 < 9) {
            this.field447++;
        }
        for (int var5 = this.field447; var5 > 0; var5--) {
            this.field448[var5] = this.field448[var5 - 1];
            this.field449[var5] = this.field449[var5 - 1];
            this.field433[var5] = this.field433[var5 - 1];
        }
        this.field448[0] = var3;
        this.field449[0] = var4;
        this.field433[0] = arg1;
    }

    @ObfuscatedName("y.d(I)V")
    public final void method232() {
        this.field447 = 0;
        this.field407 = 0;
    }

    @ObfuscatedName("y.n(I)Z")
    public boolean method24() {
        return false;
    }

    @ObfuscatedName("y.m(IIIB)V")
    public final void method234(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field415[var4] <= arg2) {
                this.field413[var4] = arg0;
                this.field414[var4] = arg1;
                this.field415[var4] = arg2 + 70;
                return;
            }
        }
    }
}
