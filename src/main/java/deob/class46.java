package deob;

@ObfuscatedName("ab")
public class class46 extends class29 {

    @ObfuscatedName("ab.h")
    public int field609;

    @ObfuscatedName("ab.a")
    public int field613;

    @ObfuscatedName("ab.p")
    public int field604;

    @ObfuscatedName("ab.q")
    public int field605;

    @ObfuscatedName("ab.w(Lfi;Lfi;I)V")
    public void method563(class177 arg0, class177 arg1) {
        int var3 = arg1.method2931();
        if (class37.field516.field517 != var3) {
            throw new IllegalStateException("");
        }
        this.field415 = arg1.method2931();
        this.field421 = arg1.method2931();
        this.field427 = arg1.method2886();
        this.field416 = arg1.method2886();
        this.field609 = arg1.method2931();
        this.field613 = arg1.method2931();
        this.field417 = arg1.method2886();
        this.field422 = arg1.method2886();
        this.field604 = arg1.method2931();
        this.field605 = arg1.method2931();
        this.field421 = Math.min(this.field421, 4);
        this.field418 = new short[1][64][64];
        this.field419 = new short[this.field421][64][64];
        this.field423 = new byte[this.field421][64][64];
        this.field424 = new byte[this.field421][64][64];
        this.field425 = new class32[this.field421][64][64][];
        int var4 = arg0.method2931();
        if (class36.field511.field507 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2931();
        int var6 = arg0.method2931();
        int var7 = arg0.method2931();
        int var8 = arg0.method2931();
        if (this.field417 != var5 || this.field422 != var6 || this.field604 != var7 || this.field605 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method210(this.field604 * 8 + var9, this.field605 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ab.o(III)Z")
    public boolean method559(int arg0, int arg1) {
        if (arg0 < this.field604 * 8) {
            return false;
        } else if (arg1 < this.field605 * 8) {
            return false;
        } else if (arg0 >= this.field604 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field605 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field417 == var2.field417 && this.field422 == var2.field422) {
            return this.field604 == var2.field604 && this.field605 == var2.field605;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field417 | this.field422 << 8 | this.field604 << 16 | this.field605 << 24;
    }

    @ObfuscatedName("ab.ag(B)I")
    public int method558() {
        return this.field609;
    }

    @ObfuscatedName("ab.ak(I)I")
    public int method573() {
        return this.field613;
    }

    @ObfuscatedName("ab.ae(I)I")
    public int method572() {
        return this.field604;
    }

    @ObfuscatedName("ab.am(I)I")
    public int method565() {
        return this.field605;
    }
}
