package deob;

@ObfuscatedName("aw")
public class class46 extends class29 {

    @ObfuscatedName("aw.o")
    public int field608;

    @ObfuscatedName("aw.i")
    public int field605;

    @ObfuscatedName("aw.u")
    public int field604;

    @ObfuscatedName("aw.b")
    public int field607;

    @ObfuscatedName("aw.d(Lfg;Lfg;B)V")
    public void method563(class174 arg0, class174 arg1) {
        int var3 = arg1.method2955();
        if (class37.field525.field524 != var3) {
            throw new IllegalStateException("");
        }
        this.field426 = arg1.method2955();
        this.field420 = arg1.method2955();
        this.field419 = arg1.method3035();
        this.field427 = arg1.method3035();
        this.field608 = arg1.method2955();
        this.field605 = arg1.method2955();
        this.field417 = arg1.method3035();
        this.field418 = arg1.method3035();
        this.field604 = arg1.method2955();
        this.field607 = arg1.method2955();
        this.field420 = Math.min(this.field420, 4);
        this.field421 = new short[1][64][64];
        this.field422 = new short[this.field420][64][64];
        this.field423 = new byte[this.field420][64][64];
        this.field424 = new byte[this.field420][64][64];
        this.field425 = new class32[this.field420][64][64][];
        int var4 = arg0.method2955();
        if (class36.field513.field514 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2955();
        int var6 = arg0.method2955();
        int var7 = arg0.method2955();
        int var8 = arg0.method2955();
        if (this.field417 != var5 || this.field418 != var6 || this.field604 != var7 || this.field607 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method219(this.field604 * 8 + var9, this.field607 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aw.k(III)Z")
    public boolean method565(int arg0, int arg1) {
        if (arg0 < this.field604 * 8) {
            return false;
        } else if (arg1 < this.field607 * 8) {
            return false;
        } else if (arg0 >= this.field604 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field607 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field417 == var2.field417 && this.field418 == var2.field418) {
            return this.field604 == var2.field604 && this.field607 == var2.field607;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field417 | this.field418 << 8 | this.field604 << 16 | this.field607 << 24;
    }

    @ObfuscatedName("aw.e(I)I")
    public int method579() {
        return this.field608;
    }

    @ObfuscatedName("aw.p(I)I")
    public int method566() {
        return this.field605;
    }

    @ObfuscatedName("aw.ad(I)I")
    public int method569() {
        return this.field604;
    }

    @ObfuscatedName("aw.ag(I)I")
    public int method570() {
        return this.field607;
    }
}
