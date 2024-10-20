package deob;

@ObfuscatedName("ag")
public class class35 extends class17 {

    @ObfuscatedName("ag.m")
    public int field334;

    @ObfuscatedName("ag.d")
    public int field337;

    @ObfuscatedName("ag.j")
    public int field331;

    @ObfuscatedName("ag.x")
    public int field330;

    @ObfuscatedName("ag.g(Lgl;Lgl;I)V")
    public void method572(class185 arg0, class185 arg1) {
        int var3 = arg1.method3679();
        if (class26.field253.field255 != var3) {
            throw new IllegalStateException("");
        }
        this.field151 = arg1.method3679();
        this.field149 = arg1.method3679();
        this.field147 = arg1.method3467();
        this.field152 = arg1.method3467();
        this.field334 = arg1.method3679();
        this.field337 = arg1.method3679();
        this.field148 = arg1.method3467();
        this.field150 = arg1.method3467();
        this.field331 = arg1.method3679();
        this.field330 = arg1.method3679();
        this.field149 = Math.min(this.field149, 4);
        this.field153 = new short[1][64][64];
        this.field154 = new short[this.field149][64][64];
        this.field155 = new byte[this.field149][64][64];
        this.field156 = new byte[this.field149][64][64];
        this.field157 = new class20[this.field149][64][64][];
        int var4 = arg0.method3679();
        if (class25.field246.field248 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method3679();
        int var6 = arg0.method3679();
        int var7 = arg0.method3679();
        int var8 = arg0.method3679();
        if (this.field148 != var5 || this.field150 != var6 || this.field331 != var7 || this.field330 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method182(this.field331 * 8 + var9, this.field330 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("ag.r(III)Z")
    public boolean method559(int arg0, int arg1) {
        if (arg0 < this.field331 * 8) {
            return false;
        } else if (arg1 < this.field330 * 8) {
            return false;
        } else if (arg0 >= this.field331 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field330 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class35)) {
            return false;
        }
        class35 var2 = (class35) arg0;
        if (this.field148 == var2.field148 && this.field150 == var2.field150) {
            return this.field331 == var2.field331 && this.field330 == var2.field330;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field148 | this.field150 << 8 | this.field331 << 16 | this.field330 << 24;
    }

    @ObfuscatedName("ag.e(I)I")
    public int method568() {
        return this.field334;
    }

    @ObfuscatedName("ag.q(B)I")
    public int method561() {
        return this.field337;
    }

    @ObfuscatedName("ag.ac(I)I")
    public int method562() {
        return this.field331;
    }

    @ObfuscatedName("ag.az(I)I")
    public int method563() {
        return this.field330;
    }
}
