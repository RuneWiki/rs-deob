package deob;

@ObfuscatedName("hu")
public class class221 extends class227 {

    @ObfuscatedName("hu.c")
    public int field2651;

    @ObfuscatedName("hu.b")
    public int field2650;

    @ObfuscatedName("hu.p")
    public int field2652;

    @ObfuscatedName("hu.m")
    public int field2654;

    @ObfuscatedName("hu.c(Lpi;B)V")
    public void method4310(class419 arg0) {
        int var2 = arg0.method6781();
        if (class233.field2742.field2741 != var2) {
            throw new IllegalStateException("");
        }
        this.field2711 = arg0.method6781();
        this.field2704 = arg0.method6781();
        this.field2708 = arg0.method6672();
        this.field2709 = arg0.method6672();
        this.field2651 = arg0.method6781();
        this.field2650 = arg0.method6781();
        this.field2698 = arg0.method6672();
        this.field2701 = arg0.method6672();
        this.field2652 = arg0.method6781();
        this.field2654 = arg0.method6781();
        this.field2702 = arg0.method6708();
        this.field2703 = arg0.method6708();
    }

    @ObfuscatedName("hu.b(Lpi;B)V")
    public void method4002(class419 arg0) {
        this.field2704 = Math.min(this.field2704, 4);
        this.field2696 = new short[1][64][64];
        this.field2705 = new short[this.field2704][64][64];
        this.field2700 = new byte[this.field2704][64][64];
        this.field2707 = new byte[this.field2704][64][64];
        this.field2706 = new class229[this.field2704][64][64][];
        int var2 = arg0.method6781();
        if (class232.field2736.field2738 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6781();
        int var4 = arg0.method6781();
        int var5 = arg0.method6781();
        int var6 = arg0.method6781();
        if (this.field2698 != var3 || this.field2701 != var4 || this.field2652 != var5 || this.field2654 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4357(this.field2652 * 8 + var7, this.field2654 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class221)) {
            return false;
        }
        class221 var2 = (class221) arg0;
        if (this.field2698 == var2.field2698 && this.field2701 == var2.field2701) {
            return this.field2652 == var2.field2652 && this.field2654 == var2.field2654;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2698 | this.field2701 << 8 | this.field2652 << 16 | this.field2654 << 24;
    }

    @ObfuscatedName("hu.p(I)I")
    public int method4322() {
        return this.field2651;
    }

    @ObfuscatedName("hu.m(B)I")
    public int method4313() {
        return this.field2650;
    }

    @ObfuscatedName("hu.j(B)I")
    public int method4314() {
        return this.field2652;
    }

    @ObfuscatedName("hu.w(I)I")
    public int method4315() {
        return this.field2654;
    }
}
