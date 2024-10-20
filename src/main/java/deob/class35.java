package deob;

@ObfuscatedName("aa")
public class class35 extends class17 {

    @ObfuscatedName("aa.k")
    public int field318;

    @ObfuscatedName("aa.v")
    public int field319;

    @ObfuscatedName("aa.p")
    public int field315;

    @ObfuscatedName("aa.n")
    public int field316;

    @ObfuscatedName("aa.c(Lgg;Lgg;I)V")
    public void method574(class185 arg0, class185 arg1) {
        int var3 = arg1.method3243();
        if (class26.field238.field236 != var3) {
            throw new IllegalStateException("");
        }
        this.field150 = arg1.method3243();
        this.field147 = arg1.method3243();
        this.field144 = arg1.method3245();
        this.field143 = arg1.method3245();
        this.field318 = arg1.method3243();
        this.field319 = arg1.method3243();
        this.field152 = arg1.method3245();
        this.field145 = arg1.method3245();
        this.field315 = arg1.method3243();
        this.field316 = arg1.method3243();
        this.field147 = Math.min(this.field147, 4);
        this.field142 = new short[1][64][64];
        this.field149 = new short[this.field147][64][64];
        this.field148 = new byte[this.field147][64][64];
        this.field151 = new byte[this.field147][64][64];
        this.field146 = new class20[this.field147][64][64][];
        int var4 = arg0.method3243();
        if (class25.field231.field232 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3243();
        int var6 = arg0.method3243();
        int var7 = arg0.method3243();
        int var8 = arg0.method3243();
        if (this.field152 != var5 || this.field145 != var6 || this.field315 != var7 || this.field316 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method167(this.field315 * 8 + var9, this.field316 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aa.q(III)Z")
    public boolean method555(int arg0, int arg1) {
        if (arg0 < this.field315 * 8) {
            return false;
        } else if (arg1 < this.field316 * 8) {
            return false;
        } else if (arg0 >= this.field315 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field316 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field152 == var2.field152 && this.field145 == var2.field145) {
            return this.field315 == var2.field315 && this.field316 == var2.field316;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field152 | this.field145 << 8 | this.field315 << 16 | this.field316 << 24;
    }

    @ObfuscatedName("aa.m(I)I")
    public int method562() {
        return this.field318;
    }

    @ObfuscatedName("aa.af(B)I")
    public int method557() {
        return this.field319;
    }

    @ObfuscatedName("aa.ah(I)I")
    public int method572() {
        return this.field315;
    }

    @ObfuscatedName("aa.ab(S)I")
    public int method559() {
        return this.field316;
    }
}
