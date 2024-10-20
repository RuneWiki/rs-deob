package deob;

@ObfuscatedName("ap")
public class class35 extends class17 {

    @ObfuscatedName("ap.k")
    public int field325;

    @ObfuscatedName("ap.o")
    public int field321;

    @ObfuscatedName("ap.q")
    public int field323;

    @ObfuscatedName("ap.l")
    public int field324;

    @ObfuscatedName("ap.y(Lge;Lge;S)V")
    public void method535(class185 arg0, class185 arg1) {
        int var3 = arg1.method3299();
        if (class26.field247.field245 != var3) {
            throw new IllegalStateException("");
        }
        this.field133 = arg1.method3299();
        this.field134 = arg1.method3299();
        this.field143 = arg1.method3280();
        this.field130 = arg1.method3280();
        this.field325 = arg1.method3299();
        this.field321 = arg1.method3299();
        this.field131 = arg1.method3280();
        this.field138 = arg1.method3280();
        this.field323 = arg1.method3299();
        this.field324 = arg1.method3299();
        this.field134 = Math.min(this.field134, 4);
        this.field135 = new short[1][64][64];
        this.field141 = new short[this.field134][64][64];
        this.field137 = new byte[this.field134][64][64];
        this.field129 = new byte[this.field134][64][64];
        this.field142 = new class20[this.field134][64][64][];
        int var4 = arg0.method3299();
        if (class25.field233.field235 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3299();
        int var6 = arg0.method3299();
        int var7 = arg0.method3299();
        int var8 = arg0.method3299();
        if (this.field131 != var5 || this.field138 != var6 || this.field323 != var7 || this.field324 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method154(this.field323 * 8 + var9, this.field324 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ap.h(III)Z")
    public boolean method547(int arg0, int arg1) {
        if (arg0 < this.field323 * 8) {
            return false;
        } else if (arg1 < this.field324 * 8) {
            return false;
        } else if (arg0 >= this.field323 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field324 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field131 == var2.field131 && this.field138 == var2.field138) {
            return this.field323 == var2.field323 && this.field324 == var2.field324;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field131 | this.field138 << 8 | this.field323 << 16 | this.field324 << 24;
    }

    @ObfuscatedName("ap.ah(I)I")
    public int method532() {
        return this.field325;
    }

    @ObfuscatedName("ap.ad(I)I")
    public int method533() {
        return this.field321;
    }

    @ObfuscatedName("ap.aa(B)I")
    public int method546() {
        return this.field323;
    }

    @ObfuscatedName("ap.ag(S)I")
    public int method530() {
        return this.field324;
    }
}
