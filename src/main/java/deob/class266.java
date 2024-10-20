package deob;

@ObfuscatedName("kj")
public class class266 extends class280 {

    @ObfuscatedName("kj.ac(Lul;B)V")
    public void method4782(class530 arg0) {
        int var2 = arg0.method8365();
        if (class286.field3070.field3067 != var2) {
            throw new IllegalStateException("");
        }
        this.field3029 = arg0.method8365();
        this.field3030 = arg0.method8365();
        this.field3028 = arg0.method8598();
        this.field3026 = arg0.method8598();
        this.field3027 = arg0.method8598();
        this.field3043 = arg0.method8598();
        this.field3031 = arg0.method8385();
        this.field3038 = arg0.method8385();
    }

    @ObfuscatedName("kj.al(Lul;I)V")
    public void method4783(class530 arg0) {
        this.field3030 = Math.min(this.field3030, 4);
        this.field3033 = new short[1][64][64];
        this.field3042 = new short[this.field3030][64][64];
        this.field3035 = new byte[this.field3030][64][64];
        this.field3036 = new byte[this.field3030][64][64];
        this.field3037 = new class282[this.field3030][64][64][];
        int var2 = arg0.method8365();
        if (class285.field3063.field3062 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8365();
        int var4 = arg0.method8365();
        if (this.field3027 != var3 || this.field3043 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5139(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class266)) {
            class266 var2 = (class266) arg0;
            return this.field3027 == var2.field3027 && this.field3043 == var2.field3043;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3027 | this.field3043 << 8;
    }
}
