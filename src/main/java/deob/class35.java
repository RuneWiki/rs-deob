package deob;

@ObfuscatedName("aa")
public class class35 extends class17 {

    @ObfuscatedName("aa.z")
    public int field333;

    @ObfuscatedName("aa.x")
    public int field329;

    @ObfuscatedName("aa.v")
    public int field331;

    @ObfuscatedName("aa.g")
    public int field332;

    @ObfuscatedName("aa.f(Lgm;Lgm;I)V")
    public void method534(class185 arg0, class185 arg1) {
        int var3 = arg1.method3344();
        if (class26.field248.field245 != var3) {
            throw new IllegalStateException("");
        }
        this.field153 = arg1.method3344();
        this.field146 = arg1.method3344();
        this.field157 = arg1.method3346();
        this.field151 = arg1.method3346();
        this.field333 = arg1.method3344();
        this.field329 = arg1.method3344();
        this.field145 = arg1.method3346();
        this.field144 = arg1.method3346();
        this.field331 = arg1.method3344();
        this.field332 = arg1.method3344();
        this.field146 = Math.min(this.field146, 4);
        this.field147 = new short[1][64][64];
        this.field148 = new short[this.field146][64][64];
        this.field149 = new byte[this.field146][64][64];
        this.field150 = new byte[this.field146][64][64];
        this.field156 = new class20[this.field146][64][64][];
        int var4 = arg0.method3344();
        if (class25.field234.field235 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3344();
        int var6 = arg0.method3344();
        int var7 = arg0.method3344();
        int var8 = arg0.method3344();
        if (this.field145 != var5 || this.field144 != var6 || this.field331 != var7 || this.field332 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method156(this.field331 * 8 + var9, this.field332 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aa.l(III)Z")
    public boolean method535(int arg0, int arg1) {
        if (arg0 < this.field331 * 8) {
            return false;
        } else if (arg1 < this.field332 * 8) {
            return false;
        } else if (arg0 >= this.field331 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field332 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field145 == var2.field145 && this.field144 == var2.field144) {
            return this.field331 == var2.field331 && this.field332 == var2.field332;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field145 | this.field144 << 8 | this.field331 << 16 | this.field332 << 24;
    }

    @ObfuscatedName("aa.w(I)I")
    public int method536() {
        return this.field333;
    }

    @ObfuscatedName("aa.ag(B)I")
    public int method555() {
        return this.field329;
    }

    @ObfuscatedName("aa.af(I)I")
    public int method546() {
        return this.field331;
    }

    @ObfuscatedName("aa.az(I)I")
    public int method539() {
        return this.field332;
    }
}
