package deob;

@ObfuscatedName("af")
public abstract class class27 extends class94 {

    @ObfuscatedName("af.k")
    public int field404;

    @ObfuscatedName("af.t")
    public int field394;

    @ObfuscatedName("af.f")
    public int field428;

    @ObfuscatedName("af.h")
    public boolean field407 = false;

    @ObfuscatedName("af.j")
    public int field414 = 1;

    @ObfuscatedName("af.q")
    public int field398 = -1;

    @ObfuscatedName("af.z")
    public int field399 = -1;

    @ObfuscatedName("af.af")
    public int field400 = -1;

    @ObfuscatedName("af.ap")
    public int field401 = -1;

    @ObfuscatedName("af.ah")
    public int field402 = -1;

    @ObfuscatedName("af.at")
    public int field445 = -1;

    @ObfuscatedName("af.aa")
    public int field419 = -1;

    @ObfuscatedName("af.ae")
    public int field405 = -1;

    @ObfuscatedName("af.aw")
    public String field406 = null;

    @ObfuscatedName("af.ar")
    public int field429 = 100;

    @ObfuscatedName("af.ai")
    public int field408 = 0;

    @ObfuscatedName("af.au")
    public int field409 = 0;

    @ObfuscatedName("af.an")
    public int[] field397 = new int[4];

    @ObfuscatedName("af.al")
    public int[] field411 = new int[4];

    @ObfuscatedName("af.as")
    public int[] field412 = new int[4];

    @ObfuscatedName("af.az")
    public int field413 = -1000;

    @ObfuscatedName("af.aq")
    public int field393;

    @ObfuscatedName("af.ag")
    public int field415;

    @ObfuscatedName("af.aj")
    public int field416 = -1;

    @ObfuscatedName("af.ak")
    public int field417 = 0;

    @ObfuscatedName("af.ac")
    public int field418 = 0;

    @ObfuscatedName("af.ab")
    public int field424 = -1;

    @ObfuscatedName("af.ax")
    public int field420 = 0;

    @ObfuscatedName("af.av")
    public int field426 = 0;

    @ObfuscatedName("af.ad")
    public int field403 = -1;

    @ObfuscatedName("af.am")
    public int field423 = 0;

    @ObfuscatedName("af.ao")
    public int field438 = 0;

    @ObfuscatedName("af.bo")
    public int field410 = 0;

    @ObfuscatedName("af.bj")
    public int field396 = 0;

    @ObfuscatedName("af.bg")
    public int field427 = -1;

    @ObfuscatedName("af.bb")
    public int field422 = 0;

    @ObfuscatedName("af.bf")
    public int field421 = 0;

    @ObfuscatedName("af.bd")
    public int field430;

    @ObfuscatedName("af.br")
    public int field431;

    @ObfuscatedName("af.bu")
    public int field432;

    @ObfuscatedName("af.bl")
    public int field433;

    @ObfuscatedName("af.bw")
    public int field434;

    @ObfuscatedName("af.bx")
    public int field435;

    @ObfuscatedName("af.bn")
    public int field436;

    @ObfuscatedName("af.be")
    public int field437;

    @ObfuscatedName("af.by")
    public int field425;

    @ObfuscatedName("af.bq")
    public int field439 = 0;

    @ObfuscatedName("af.bi")
    public int field440 = 200;

    @ObfuscatedName("af.bt")
    public int field441;

    @ObfuscatedName("af.bk")
    public int field442 = 0;

    @ObfuscatedName("af.bp")
    public int field443 = 32;

    @ObfuscatedName("af.bv")
    public int field444 = 0;

    @ObfuscatedName("af.ba")
    public int[] field395 = new int[10];

    @ObfuscatedName("af.bc")
    public int[] field446 = new int[10];

    @ObfuscatedName("af.bm")
    public boolean[] field447 = new boolean[10];

    @ObfuscatedName("af.bs")
    public int field448 = 0;

    @ObfuscatedName("af.bz")
    public int field449 = 0;

    @ObfuscatedName("af.y(IIZI)V")
    public final void method222(int arg0, int arg1, boolean arg2) {
        if (this.field403 != -1 && class34.method93(this.field403).field867 == 1) {
            this.field403 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field395[0];
            int var5 = arg1 - this.field446[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field444 < 9) {
                    this.field444++;
                }
                for (int var6 = this.field444; var6 > 0; var6--) {
                    this.field395[var6] = this.field395[var6 - 1];
                    this.field446[var6] = this.field446[var6 - 1];
                    this.field447[var6] = this.field447[var6 - 1];
                }
                this.field395[0] = arg0;
                this.field446[0] = arg1;
                this.field447[0] = false;
                return;
            }
        }
        this.field444 = 0;
        this.field449 = 0;
        this.field448 = 0;
        this.field395[0] = arg0;
        this.field446[0] = arg1;
        this.field404 = this.field395[0] * 128 + this.field414 * 64;
        this.field394 = this.field446[0] * 128 + this.field414 * 64;
    }

    @ObfuscatedName("af.m(IZI)V")
    public final void method241(int arg0, boolean arg1) {
        int var3 = this.field395[0];
        int var4 = this.field446[0];
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
        if (this.field403 != -1 && class34.method93(this.field403).field867 == 1) {
            this.field403 = -1;
        }
        if (this.field444 < 9) {
            this.field444++;
        }
        for (int var5 = this.field444; var5 > 0; var5--) {
            this.field395[var5] = this.field395[var5 - 1];
            this.field446[var5] = this.field446[var5 - 1];
            this.field447[var5] = this.field447[var5 - 1];
        }
        this.field395[0] = var3;
        this.field446[0] = var4;
        this.field447[0] = arg1;
    }

    @ObfuscatedName("af.u(I)V")
    public final void method224() {
        this.field444 = 0;
        this.field449 = 0;
    }

    @ObfuscatedName("af.d(B)Z")
    public boolean method14() {
        return false;
    }

    @ObfuscatedName("af.s(IIII)V")
    public final void method226(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field412[var4] <= arg2) {
                this.field397[var4] = arg0;
                this.field411[var4] = arg1;
                this.field412[var4] = arg2 + 70;
                return;
            }
        }
    }
}
