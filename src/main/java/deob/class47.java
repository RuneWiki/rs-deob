package deob;

@ObfuscatedName("am")
public class class47 extends class29 {

    @ObfuscatedName("am.o")
    public int field577;

    @ObfuscatedName("am.d")
    public int field574;

    @ObfuscatedName("am.r")
    public int field575;

    @ObfuscatedName("am.p")
    public int field576;

    @ObfuscatedName("am.g(Lgg;Lgg;I)V")
    public void method635(class195 arg0, class195 arg1) {
        int var3 = arg1.method3332();
        if (class38.field501.field500 != var3) {
            throw new IllegalStateException("");
        }
        this.field403 = arg1.method3332();
        this.field404 = arg1.method3332();
        this.field406 = arg1.method3310();
        this.field400 = arg1.method3310();
        this.field577 = arg1.method3332();
        this.field574 = arg1.method3332();
        this.field411 = arg1.method3310();
        this.field399 = arg1.method3310();
        this.field575 = arg1.method3332();
        this.field576 = arg1.method3332();
        this.field404 = Math.min(this.field404, 4);
        this.field405 = new short[1][64][64];
        this.field401 = new short[this.field404][64][64];
        this.field407 = new byte[this.field404][64][64];
        this.field408 = new byte[this.field404][64][64];
        this.field409 = new class32[this.field404][64][64][];
        int var4 = arg0.method3332();
        if (class37.field493.field492 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3332();
        int var6 = arg0.method3332();
        int var7 = arg0.method3332();
        int var8 = arg0.method3332();
        if (this.field411 != var5 || this.field399 != var6 || this.field575 != var7 || this.field576 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method208(this.field575 * 8 + var9, this.field576 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("am.e(IIB)Z")
    public boolean method634(int arg0, int arg1) {
        if (arg0 < this.field575 * 8) {
            return false;
        } else if (arg1 < this.field576 * 8) {
            return false;
        } else if (arg0 >= this.field575 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field576 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class47)) {
            return false;
        }
        class47 var2 = (class47) arg0;
        if (this.field411 == var2.field411 && this.field399 == var2.field399) {
            return this.field575 == var2.field575 && this.field576 == var2.field576;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field411 | this.field399 << 8 | this.field575 << 16 | this.field576 << 24;
    }

    @ObfuscatedName("am.b(I)I")
    public int method611() {
        return this.field577;
    }

    @ObfuscatedName("am.z(I)I")
    public int method612() {
        return this.field574;
    }

    @ObfuscatedName("am.ai(I)I")
    public int method629() {
        return this.field575;
    }

    @ObfuscatedName("am.aj(B)I")
    public int method614() {
        return this.field576;
    }
}
