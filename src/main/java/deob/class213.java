package deob;

@ObfuscatedName("hn")
public class class213 extends class227 {

    @ObfuscatedName("hn.c(Lpi;B)V")
    public void method4001(class419 arg0) {
        int var2 = arg0.method6781();
        if (class233.field2740.field2741 != var2) {
            throw new IllegalStateException("");
        }
        this.field2711 = arg0.method6781();
        this.field2704 = arg0.method6781();
        this.field2708 = arg0.method6672();
        this.field2709 = arg0.method6672();
        this.field2698 = arg0.method6672();
        this.field2701 = arg0.method6672();
        this.field2702 = arg0.method6708();
        this.field2703 = arg0.method6708();
    }

    @ObfuscatedName("hn.b(Lpi;B)V")
    public void method4002(class419 arg0) {
        this.field2704 = Math.min(this.field2704, 4);
        this.field2696 = new short[1][64][64];
        this.field2705 = new short[this.field2704][64][64];
        this.field2700 = new byte[this.field2704][64][64];
        this.field2707 = new byte[this.field2704][64][64];
        this.field2706 = new class229[this.field2704][64][64][];
        int var2 = arg0.method6781();
        if (class232.field2737.field2738 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6781();
        int var4 = arg0.method6781();
        if (this.field2698 != var3 || this.field2701 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4357(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class213)) {
            class213 var2 = (class213) arg0;
            return this.field2698 == var2.field2698 && this.field2701 == var2.field2701;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2698 | this.field2701 << 8;
    }
}
