package deob;

@ObfuscatedName("ah")
public abstract class class27 extends class94 {

    @ObfuscatedName("ah.x")
    public int field463;

    @ObfuscatedName("ah.k")
    public int field404;

    @ObfuscatedName("ah.a")
    public int field413;

    @ObfuscatedName("ah.y")
    public boolean field450 = false;

    @ObfuscatedName("ah.q")
    public int field407 = 1;

    @ObfuscatedName("ah.c")
    public int field408 = -1;

    @ObfuscatedName("ah.u")
    public int field409 = -1;

    @ObfuscatedName("ah.ah")
    public int field430 = -1;

    @ObfuscatedName("ah.az")
    public int field411 = -1;

    @ObfuscatedName("ah.au")
    public int field451 = -1;

    @ObfuscatedName("ah.ae")
    public int field445 = -1;

    @ObfuscatedName("ah.aa")
    public int field423 = -1;

    @ObfuscatedName("ah.av")
    public int field415 = -1;

    @ObfuscatedName("ah.aq")
    public String field416 = null;

    @ObfuscatedName("ah.ak")
    public int field417 = 100;

    @ObfuscatedName("ah.ad")
    public int field440 = 0;

    @ObfuscatedName("ah.at")
    public int field419 = 0;

    @ObfuscatedName("ah.aw")
    public int[] field420 = new int[4];

    @ObfuscatedName("ah.am")
    public int[] field421 = new int[4];

    @ObfuscatedName("ah.af")
    public int[] field422 = new int[4];

    @ObfuscatedName("ah.as")
    public int field443 = -1000;

    @ObfuscatedName("ah.ao")
    public int field424;

    @ObfuscatedName("ah.ab")
    public int field425;

    @ObfuscatedName("ah.ay")
    public int field426 = -1;

    @ObfuscatedName("ah.ar")
    public int field454 = 0;

    @ObfuscatedName("ah.aj")
    public int field433 = 0;

    @ObfuscatedName("ah.ai")
    public int field429 = -1;

    @ObfuscatedName("ah.ax")
    public int field410 = 0;

    @ObfuscatedName("ah.al")
    public int field427 = 0;

    @ObfuscatedName("ah.ag")
    public int field432 = -1;

    @ObfuscatedName("ah.ap")
    public int field418 = 0;

    @ObfuscatedName("ah.ac")
    public int field434 = 0;

    @ObfuscatedName("ah.bp")
    public int field435 = 0;

    @ObfuscatedName("ah.bm")
    public int field438 = 0;

    @ObfuscatedName("ah.ba")
    public int field437 = -1;

    @ObfuscatedName("ah.bx")
    public int field405 = 0;

    @ObfuscatedName("ah.bn")
    public int field439 = 0;

    @ObfuscatedName("ah.be")
    public int field431;

    @ObfuscatedName("ah.bs")
    public int field441;

    @ObfuscatedName("ah.bk")
    public int field455;

    @ObfuscatedName("ah.bu")
    public int field442;

    @ObfuscatedName("ah.by")
    public int field444;

    @ObfuscatedName("ah.bd")
    public int field412;

    @ObfuscatedName("ah.bq")
    public int field446;

    @ObfuscatedName("ah.bt")
    public int field447;

    @ObfuscatedName("ah.br")
    public int field448;

    @ObfuscatedName("ah.bg")
    public int field449 = 0;

    @ObfuscatedName("ah.bf")
    public int field452 = 200;

    @ObfuscatedName("ah.bi")
    public int field406;

    @ObfuscatedName("ah.bz")
    public int field403 = 0;

    @ObfuscatedName("ah.bl")
    public int field453 = 32;

    @ObfuscatedName("ah.bj")
    public int field428 = 0;

    @ObfuscatedName("ah.bo")
    public int[] field436 = new int[10];

    @ObfuscatedName("ah.bc")
    public int[] field456 = new int[10];

    @ObfuscatedName("ah.bh")
    public boolean[] field457 = new boolean[10];

    @ObfuscatedName("ah.bv")
    public int field458 = 0;

    @ObfuscatedName("ah.bb")
    public int field459 = 0;

    @ObfuscatedName("ah.b(IIZB)V")
    public final void method220(int arg0, int arg1, boolean arg2) {
        if (this.field432 != -1 && class34.method1536(this.field432).field865 == 1) {
            this.field432 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field436[0];
            int var5 = arg1 - this.field456[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field428 < 9) {
                    this.field428++;
                }
                for (int var6 = this.field428; var6 > 0; var6--) {
                    this.field436[var6] = this.field436[var6 - 1];
                    this.field456[var6] = this.field456[var6 - 1];
                    this.field457[var6] = this.field457[var6 - 1];
                }
                this.field436[0] = arg0;
                this.field456[0] = arg1;
                this.field457[0] = false;
                return;
            }
        }
        this.field428 = 0;
        this.field459 = 0;
        this.field458 = 0;
        this.field436[0] = arg0;
        this.field456[0] = arg1;
        this.field463 = this.field436[0] * 128 + this.field407 * 64;
        this.field404 = this.field456[0] * 128 + this.field407 * 64;
    }

    @ObfuscatedName("ah.z(IZI)V")
    public final void method221(int arg0, boolean arg1) {
        int var3 = this.field436[0];
        int var4 = this.field456[0];
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
        if (this.field432 != -1 && class34.method1536(this.field432).field865 == 1) {
            this.field432 = -1;
        }
        if (this.field428 < 9) {
            this.field428++;
        }
        for (int var5 = this.field428; var5 > 0; var5--) {
            this.field436[var5] = this.field436[var5 - 1];
            this.field456[var5] = this.field456[var5 - 1];
            this.field457[var5] = this.field457[var5 - 1];
        }
        this.field436[0] = var3;
        this.field456[0] = var4;
        this.field457[0] = arg1;
    }

    @ObfuscatedName("ah.l(B)V")
    public final void method222() {
        this.field428 = 0;
        this.field459 = 0;
    }

    @ObfuscatedName("ah.v(B)Z")
    public boolean method20() {
        return false;
    }

    @ObfuscatedName("ah.e(IIIB)V")
    public final void method239(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field422[var4] <= arg2) {
                this.field420[var4] = arg0;
                this.field421[var4] = arg1;
                this.field422[var4] = arg2 + 70;
                return;
            }
        }
    }
}
