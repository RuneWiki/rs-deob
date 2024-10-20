package deob;

@ObfuscatedName("aj")
public class class40 extends class22 {

    @ObfuscatedName("aj.j")
    public int field337;

    @ObfuscatedName("aj.r")
    public int field333;

    @ObfuscatedName("aj.e")
    public int field334;

    @ObfuscatedName("aj.s")
    public int field332;

    @ObfuscatedName("aj.a(Lkc;B)V")
    public void method620(class300 arg0) {
        int var2 = arg0.method5123();
        if (class32.field258.field259 != var2) {
            throw new IllegalStateException("");
        }
        this.field151 = arg0.method5123();
        this.field157 = arg0.method5123();
        this.field159 = arg0.method5166();
        this.field148 = arg0.method5166();
        this.field337 = arg0.method5123();
        this.field333 = arg0.method5123();
        this.field149 = arg0.method5166();
        this.field150 = arg0.method5166();
        this.field334 = arg0.method5123();
        this.field332 = arg0.method5123();
        this.field153 = arg0.method5152();
        this.field154 = arg0.method5152();
    }

    @ObfuscatedName("aj.t(Lkc;I)V")
    public void method175(class300 arg0) {
        this.field157 = Math.min(this.field157, 4);
        this.field147 = new short[1][64][64];
        this.field161 = new short[this.field157][64][64];
        this.field162 = new byte[this.field157][64][64];
        this.field158 = new byte[this.field157][64][64];
        this.field164 = new class26[this.field157][64][64][];
        int var2 = arg0.method5123();
        if (class31.field250.field254 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5123();
        int var4 = arg0.method5123();
        int var5 = arg0.method5123();
        int var6 = arg0.method5123();
        if (this.field149 != var3 || this.field150 != var4 || this.field334 != var5 || this.field332 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method264(this.field334 * 8 + var7, this.field332 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field149 == var2.field149 && this.field150 == var2.field150) {
            return this.field334 == var2.field334 && this.field332 == var2.field332;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field149 | this.field150 << 8 | this.field334 << 16 | this.field332 << 24;
    }

    @ObfuscatedName("aj.n(I)I")
    public int method623() {
        return this.field337;
    }

    @ObfuscatedName("aj.q(I)I")
    public int method624() {
        return this.field333;
    }

    @ObfuscatedName("aj.v(I)I")
    public int method645() {
        return this.field334;
    }

    @ObfuscatedName("aj.aj(B)I")
    public int method625() {
        return this.field332;
    }
}
