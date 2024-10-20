package deob;

@ObfuscatedName("af")
public class class46 extends class29 {

    @ObfuscatedName("af.l")
    public int field604;

    @ObfuscatedName("af.t")
    public int field602;

    @ObfuscatedName("af.y")
    public int field598;

    @ObfuscatedName("af.v")
    public int field599;

    @ObfuscatedName("af.i(Lfp;Lfp;B)V")
    public void method582(class175 arg0, class175 arg1) {
        int var3 = arg1.method2999();
        if (class37.field515.field514 != var3) {
            throw new IllegalStateException("");
        }
        this.field423 = arg1.method2999();
        this.field420 = arg1.method2999();
        this.field416 = arg1.method2995();
        this.field417 = arg1.method2995();
        this.field604 = arg1.method2999();
        this.field602 = arg1.method2999();
        this.field415 = arg1.method2995();
        this.field418 = arg1.method2995();
        this.field598 = arg1.method2999();
        this.field599 = arg1.method2999();
        this.field420 = Math.min(this.field420, 4);
        this.field421 = new short[1][64][64];
        this.field419 = new short[this.field420][64][64];
        this.field422 = new byte[this.field420][64][64];
        this.field424 = new byte[this.field420][64][64];
        this.field425 = new class32[this.field420][64][64][];
        int var4 = arg0.method2999();
        if (class36.field507.field513 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2999();
        int var6 = arg0.method2999();
        int var7 = arg0.method2999();
        int var8 = arg0.method2999();
        if (this.field415 != var5 || this.field418 != var6 || this.field598 != var7 || this.field599 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method252(this.field598 * 8 + var9, this.field599 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("af.j(III)Z")
    public boolean method583(int arg0, int arg1) {
        if (arg0 < this.field598 * 8) {
            return false;
        } else if (arg1 < this.field599 * 8) {
            return false;
        } else if (arg0 >= this.field598 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field599 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field415 == var2.field415 && this.field418 == var2.field418) {
            return this.field598 == var2.field598 && this.field599 == var2.field599;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field415 | this.field418 << 8 | this.field598 << 16 | this.field599 << 24;
    }

    @ObfuscatedName("af.a(I)I")
    public int method585() {
        return this.field604;
    }

    @ObfuscatedName("af.r(I)I")
    public int method597() {
        return this.field602;
    }

    @ObfuscatedName("af.ax(B)I")
    public int method591() {
        return this.field598;
    }

    @ObfuscatedName("af.al(I)I")
    public int method588() {
        return this.field599;
    }
}
