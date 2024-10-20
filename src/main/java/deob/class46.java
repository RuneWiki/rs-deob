package deob;

@ObfuscatedName("ak")
public class class46 extends class29 {

    @ObfuscatedName("ak.s")
    public int field554;

    @ObfuscatedName("ak.o")
    public int field558;

    @ObfuscatedName("ak.p")
    public int field555;

    @ObfuscatedName("ak.u")
    public int field557;

    @ObfuscatedName("ak.d(Lfw;Lfw;I)V")
    public void method555(class174 arg0, class174 arg1) {
        int var3 = arg1.method2921();
        if (class37.field478.field479 != var3) {
            throw new IllegalStateException("");
        }
        this.field384 = arg1.method2921();
        this.field383 = arg1.method2921();
        this.field385 = arg1.method2916();
        this.field381 = arg1.method2916();
        this.field554 = arg1.method2921();
        this.field558 = arg1.method2921();
        this.field382 = arg1.method2916();
        this.field391 = arg1.method2916();
        this.field555 = arg1.method2921();
        this.field557 = arg1.method2921();
        this.field383 = Math.min(this.field383, 4);
        this.field386 = new short[1][64][64];
        this.field387 = new short[this.field383][64][64];
        this.field389 = new byte[this.field383][64][64];
        this.field388 = new byte[this.field383][64][64];
        this.field390 = new class32[this.field383][64][64][];
        int var4 = arg0.method2921();
        if (class36.field470.field471 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2921();
        int var6 = arg0.method2921();
        int var7 = arg0.method2921();
        int var8 = arg0.method2921();
        if (this.field382 != var5 || this.field391 != var6 || this.field555 != var7 || this.field557 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method201(this.field555 * 8 + var9, this.field557 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ak.q(IIS)Z")
    public boolean method556(int arg0, int arg1) {
        if (arg0 < this.field555 * 8) {
            return false;
        } else if (arg1 < this.field557 * 8) {
            return false;
        } else if (arg0 >= this.field555 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field557 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field382 == var2.field382 && this.field391 == var2.field391) {
            return this.field555 == var2.field555 && this.field557 == var2.field557;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field382 | this.field391 << 8 | this.field555 << 16 | this.field557 << 24;
    }

    @ObfuscatedName("ak.x(I)I")
    public int method559() {
        return this.field554;
    }

    @ObfuscatedName("ak.y(I)I")
    public int method560() {
        return this.field558;
    }

    @ObfuscatedName("ak.ag(I)I")
    public int method561() {
        return this.field555;
    }

    @ObfuscatedName("ak.ar(I)I")
    public int method554() {
        return this.field557;
    }
}
