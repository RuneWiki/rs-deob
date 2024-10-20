package deob;

@ObfuscatedName("am")
public abstract class class27 extends class94 {

    @ObfuscatedName("am.l")
    public int field410;

    @ObfuscatedName("am.m")
    public int field407;

    @ObfuscatedName("am.b")
    public int field408;

    @ObfuscatedName("am.h")
    public boolean field409 = false;

    @ObfuscatedName("am.n")
    public int field436 = 1;

    @ObfuscatedName("am.s")
    public int field452 = -1;

    @ObfuscatedName("am.c")
    public int field412 = -1;

    @ObfuscatedName("am.am")
    public int field413 = -1;

    @ObfuscatedName("am.ap")
    public int field414 = -1;

    @ObfuscatedName("am.au")
    public int field418 = -1;

    @ObfuscatedName("am.ab")
    public int field416 = -1;

    @ObfuscatedName("am.ae")
    public int field417 = -1;

    @ObfuscatedName("am.as")
    public int field466 = -1;

    @ObfuscatedName("am.av")
    public String field419 = null;

    @ObfuscatedName("am.ar")
    public int field446 = 100;

    @ObfuscatedName("am.ad")
    public int field463 = 0;

    @ObfuscatedName("am.ac")
    public int field422 = 0;

    @ObfuscatedName("am.ao")
    public int[] field459 = new int[4];

    @ObfuscatedName("am.aj")
    public int[] field424 = new int[4];

    @ObfuscatedName("am.al")
    public int[] field425 = new int[4];

    @ObfuscatedName("am.ak")
    public int field426 = -1000;

    @ObfuscatedName("am.ag")
    public int field427;

    @ObfuscatedName("am.ah")
    public int field428;

    @ObfuscatedName("am.ay")
    public int field420 = -1;

    @ObfuscatedName("am.an")
    public int field430 = 0;

    @ObfuscatedName("am.aq")
    public int field431 = 0;

    @ObfuscatedName("am.af")
    public int field432 = -1;

    @ObfuscatedName("am.aw")
    public int field433 = 0;

    @ObfuscatedName("am.at")
    public int field434 = 0;

    @ObfuscatedName("am.aa")
    public int field435 = -1;

    @ObfuscatedName("am.ai")
    public int field421 = 0;

    @ObfuscatedName("am.az")
    public int field449 = 0;

    @ObfuscatedName("am.bz")
    public int field438 = 0;

    @ObfuscatedName("am.by")
    public int field439 = 0;

    @ObfuscatedName("am.bp")
    public int field455 = -1;

    @ObfuscatedName("am.bg")
    public int field441 = 0;

    @ObfuscatedName("am.bk")
    public int field460 = 0;

    @ObfuscatedName("am.be")
    public int field443;

    @ObfuscatedName("am.bc")
    public int field444;

    @ObfuscatedName("am.bd")
    public int field445;

    @ObfuscatedName("am.bf")
    public int field464;

    @ObfuscatedName("am.bl")
    public int field442;

    @ObfuscatedName("am.bx")
    public int field448;

    @ObfuscatedName("am.bh")
    public int field467;

    @ObfuscatedName("am.bu")
    public int field450;

    @ObfuscatedName("am.bi")
    public int field451;

    @ObfuscatedName("am.bb")
    public int field437 = 0;

    @ObfuscatedName("am.bq")
    public int field453 = 200;

    @ObfuscatedName("am.bs")
    public int field454;

    @ObfuscatedName("am.ba")
    public int field423 = 0;

    @ObfuscatedName("am.bt")
    public int field456 = 32;

    @ObfuscatedName("am.bo")
    public int field457 = 0;

    @ObfuscatedName("am.bv")
    public int[] field458 = new int[10];

    @ObfuscatedName("am.bw")
    public int[] field447 = new int[10];

    @ObfuscatedName("am.bn")
    public boolean[] field415 = new boolean[10];

    @ObfuscatedName("am.bj")
    public int field461 = 0;

    @ObfuscatedName("am.bm")
    public int field462 = 0;

    @ObfuscatedName("am.f(IIZB)V")
    public final void method253(int arg0, int arg1, boolean arg2) {
        if (this.field435 != -1 && class34.method2349(this.field435).field888 == 1) {
            this.field435 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field458[0];
            int var5 = arg1 - this.field447[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field457 < 9) {
                    this.field457++;
                }
                for (int var6 = this.field457; var6 > 0; var6--) {
                    this.field458[var6] = this.field458[var6 - 1];
                    this.field447[var6] = this.field447[var6 - 1];
                    this.field415[var6] = this.field415[var6 - 1];
                }
                this.field458[0] = arg0;
                this.field447[0] = arg1;
                this.field415[0] = false;
                return;
            }
        }
        this.field457 = 0;
        this.field462 = 0;
        this.field461 = 0;
        this.field458[0] = arg0;
        this.field447[0] = arg1;
        this.field410 = this.field458[0] * 128 + this.field436 * 64;
        this.field407 = this.field447[0] * 128 + this.field436 * 64;
    }

    @ObfuscatedName("am.k(IZB)V")
    public final void method266(int arg0, boolean arg1) {
        int var3 = this.field458[0];
        int var4 = this.field447[0];
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
        if (this.field435 != -1 && class34.method2349(this.field435).field888 == 1) {
            this.field435 = -1;
        }
        if (this.field457 < 9) {
            this.field457++;
        }
        for (int var5 = this.field457; var5 > 0; var5--) {
            this.field458[var5] = this.field458[var5 - 1];
            this.field447[var5] = this.field447[var5 - 1];
            this.field415[var5] = this.field415[var5 - 1];
        }
        this.field458[0] = var3;
        this.field447[0] = var4;
        this.field415[0] = arg1;
    }

    @ObfuscatedName("am.q(I)V")
    public final void method261() {
        this.field457 = 0;
        this.field462 = 0;
    }

    @ObfuscatedName("am.v(I)Z")
    public boolean method17() {
        return false;
    }

    @ObfuscatedName("am.a(IIIB)V")
    public final void method257(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field425[var4] <= arg2) {
                this.field459[var4] = arg0;
                this.field424[var4] = arg1;
                this.field425[var4] = arg2 + 70;
                return;
            }
        }
    }
}
