package deob;

@ObfuscatedName("aq")
public class class40 extends class22 {

    @ObfuscatedName("aq.r")
    public int field328;

    @ObfuscatedName("aq.x")
    public int field329;

    @ObfuscatedName("aq.y")
    public int field330;

    @ObfuscatedName("aq.p")
    public int field331;

    @ObfuscatedName("aq.n(Lgc;I)V")
    public void method569(class190 arg0) {
        int var2 = arg0.method3511();
        if (class32.field264.field256 != var2) {
            throw new IllegalStateException("");
        }
        this.field160 = arg0.method3511();
        this.field161 = arg0.method3511();
        this.field164 = arg0.method3513();
        this.field149 = arg0.method3513();
        this.field328 = arg0.method3511();
        this.field329 = arg0.method3511();
        this.field152 = arg0.method3513();
        this.field151 = arg0.method3513();
        this.field330 = arg0.method3511();
        this.field331 = arg0.method3511();
        this.field154 = arg0.method3516();
        this.field155 = arg0.method3516();
    }

    @ObfuscatedName("aq.h(Lgc;I)V")
    public void method161(class190 arg0) {
        this.field161 = Math.min(this.field161, 4);
        this.field148 = new short[1][64][64];
        this.field157 = new short[this.field161][64][64];
        this.field158 = new byte[this.field161][64][64];
        this.field159 = new byte[this.field161][64][64];
        this.field153 = new class26[this.field161][64][64][];
        int var2 = arg0.method3511();
        if (class31.field248.field251 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method3511();
        int var4 = arg0.method3511();
        int var5 = arg0.method3511();
        int var6 = arg0.method3511();
        if (this.field152 != var3 || this.field151 != var4 || this.field330 != var5 || this.field331 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method235(this.field330 * 8 + var7, this.field331 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field152 == var2.field152 && this.field151 == var2.field151) {
            return this.field330 == var2.field330 && this.field331 == var2.field331;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field152 | this.field151 << 8 | this.field330 << 16 | this.field331 << 24;
    }

    @ObfuscatedName("aq.l(I)I")
    public int method579() {
        return this.field328;
    }

    @ObfuscatedName("aq.g(I)I")
    public int method570() {
        return this.field329;
    }

    @ObfuscatedName("aq.b(I)I")
    public int method571() {
        return this.field330;
    }

    @ObfuscatedName("aq.a(I)I")
    public int method572() {
        return this.field331;
    }
}
