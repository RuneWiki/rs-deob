package deob;

@ObfuscatedName("aa")
public abstract class class27 extends class94 {

    @ObfuscatedName("aa.z")
    public int field401;

    @ObfuscatedName("aa.w")
    public int field414;

    @ObfuscatedName("aa.h")
    public int field416;

    @ObfuscatedName("aa.y")
    public boolean field399 = false;

    @ObfuscatedName("aa.x")
    public int field400 = 1;

    @ObfuscatedName("aa.p")
    public int field417 = -1;

    @ObfuscatedName("aa.i")
    public int field407 = -1;

    @ObfuscatedName("aa.aa")
    public int field403 = -1;

    @ObfuscatedName("aa.ax")
    public int field404 = -1;

    @ObfuscatedName("aa.ad")
    public int field405 = -1;

    @ObfuscatedName("aa.af")
    public int field406 = -1;

    @ObfuscatedName("aa.ai")
    public int field396 = -1;

    @ObfuscatedName("aa.ag")
    public int field408 = -1;

    @ObfuscatedName("aa.an")
    public String field410 = null;

    @ObfuscatedName("aa.ac")
    public int field449 = 100;

    @ObfuscatedName("aa.al")
    public int field429 = 0;

    @ObfuscatedName("aa.at")
    public int field412 = 0;

    @ObfuscatedName("aa.am")
    public int[] field436 = new int[4];

    @ObfuscatedName("aa.ab")
    public int[] field444 = new int[4];

    @ObfuscatedName("aa.aq")
    public int[] field415 = new int[4];

    @ObfuscatedName("aa.ap")
    public int field430 = -1000;

    @ObfuscatedName("aa.ar")
    public int field409;

    @ObfuscatedName("aa.as")
    public int field418;

    @ObfuscatedName("aa.az")
    public int field419 = -1;

    @ObfuscatedName("aa.aw")
    public int field453 = 0;

    @ObfuscatedName("aa.av")
    public int field421 = 0;

    @ObfuscatedName("aa.ay")
    public int field422 = -1;

    @ObfuscatedName("aa.aj")
    public int field423 = 0;

    @ObfuscatedName("aa.ae")
    public int field402 = 0;

    @ObfuscatedName("aa.au")
    public int field425 = -1;

    @ObfuscatedName("aa.ao")
    public int field426 = 0;

    @ObfuscatedName("aa.ak")
    public int field427 = 0;

    @ObfuscatedName("aa.bg")
    public int field428 = 0;

    @ObfuscatedName("aa.br")
    public int field411 = 0;

    @ObfuscatedName("aa.bw")
    public int field413 = -1;

    @ObfuscatedName("aa.bc")
    public int field398 = 0;

    @ObfuscatedName("aa.bn")
    public int field432 = 0;

    @ObfuscatedName("aa.bo")
    public int field433;

    @ObfuscatedName("aa.by")
    public int field434;

    @ObfuscatedName("aa.bi")
    public int field435;

    @ObfuscatedName("aa.bk")
    public int field397;

    @ObfuscatedName("aa.ba")
    public int field437;

    @ObfuscatedName("aa.bt")
    public int field438;

    @ObfuscatedName("aa.bs")
    public int field439;

    @ObfuscatedName("aa.bd")
    public int field431;

    @ObfuscatedName("aa.bh")
    public int field441;

    @ObfuscatedName("aa.bp")
    public int field442 = 0;

    @ObfuscatedName("aa.bb")
    public int field451 = 200;

    @ObfuscatedName("aa.bv")
    public int field424;

    @ObfuscatedName("aa.bz")
    public int field445 = 0;

    @ObfuscatedName("aa.bl")
    public int field446 = 32;

    @ObfuscatedName("aa.bu")
    public int field447 = 0;

    @ObfuscatedName("aa.bm")
    public int[] field443 = new int[10];

    @ObfuscatedName("aa.bj")
    public int[] field420 = new int[10];

    @ObfuscatedName("aa.bf")
    public boolean[] field450 = new boolean[10];

    @ObfuscatedName("aa.bq")
    public int field440 = 0;

    @ObfuscatedName("aa.be")
    public int field452 = 0;

    @ObfuscatedName("aa.s(IIZI)V")
    public final void method242(int arg0, int arg1, boolean arg2) {
        if (this.field425 != -1 && class34.method572(this.field425).field880 == 1) {
            this.field425 = -1;
        }
        if (!arg2) {
            int var4 = arg0 - this.field443[0];
            int var5 = arg1 - this.field420[0];
            if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
                if (this.field447 < 9) {
                    this.field447++;
                }
                for (int var6 = this.field447; var6 > 0; var6--) {
                    this.field443[var6] = this.field443[var6 - 1];
                    this.field420[var6] = this.field420[var6 - 1];
                    this.field450[var6] = this.field450[var6 - 1];
                }
                this.field443[0] = arg0;
                this.field420[0] = arg1;
                this.field450[0] = false;
                return;
            }
        }
        this.field447 = 0;
        this.field452 = 0;
        this.field440 = 0;
        this.field443[0] = arg0;
        this.field420[0] = arg1;
        this.field401 = this.field443[0] * 128 + this.field400 * 64;
        this.field414 = this.field420[0] * 128 + this.field400 * 64;
    }

    @ObfuscatedName("aa.b(IZI)V")
    public final void method243(int arg0, boolean arg1) {
        int var3 = this.field443[0];
        int var4 = this.field420[0];
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
        if (this.field425 != -1 && class34.method572(this.field425).field880 == 1) {
            this.field425 = -1;
        }
        if (this.field447 < 9) {
            this.field447++;
        }
        for (int var5 = this.field447; var5 > 0; var5--) {
            this.field443[var5] = this.field443[var5 - 1];
            this.field420[var5] = this.field420[var5 - 1];
            this.field450[var5] = this.field450[var5 - 1];
        }
        this.field443[0] = var3;
        this.field420[0] = var4;
        this.field450[0] = arg1;
    }

    @ObfuscatedName("aa.v(I)V")
    public final void method244() {
        this.field447 = 0;
        this.field452 = 0;
    }

    @ObfuscatedName("aa.n(I)Z")
    public boolean method22() {
        return false;
    }

    @ObfuscatedName("aa.j(IIII)V")
    public final void method252(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            if (this.field415[var4] <= arg2) {
                this.field436[var4] = arg0;
                this.field444[var4] = arg1;
                this.field415[var4] = arg2 + 70;
                return;
            }
        }
    }
}
