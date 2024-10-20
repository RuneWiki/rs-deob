package deob;

@ObfuscatedName("kh")
public class class274 extends class280 {

    @ObfuscatedName("kh.ac")
    public int field2979;

    @ObfuscatedName("kh.al")
    public int field2978;

    @ObfuscatedName("kh.ak")
    public int field2980;

    @ObfuscatedName("kh.ax")
    public int field2977;

    @ObfuscatedName("kh.ac(Lul;I)V")
    public void method5093(class530 arg0) {
        int var2 = arg0.method8365();
        if (class286.field3068.field3067 != var2) {
            throw new IllegalStateException("");
        }
        this.field3029 = arg0.method8365();
        this.field3030 = arg0.method8365();
        this.field3028 = arg0.method8598();
        this.field3026 = arg0.method8598();
        this.field2979 = arg0.method8365();
        this.field2978 = arg0.method8365();
        this.field3027 = arg0.method8598();
        this.field3043 = arg0.method8598();
        this.field2980 = arg0.method8365();
        this.field2977 = arg0.method8365();
        this.field3031 = arg0.method8385();
        this.field3038 = arg0.method8385();
    }

    @ObfuscatedName("kh.al(Lul;I)V")
    public void method4783(class530 arg0) {
        this.field3030 = Math.min(this.field3030, 4);
        this.field3033 = new short[1][64][64];
        this.field3042 = new short[this.field3030][64][64];
        this.field3035 = new byte[this.field3030][64][64];
        this.field3036 = new byte[this.field3030][64][64];
        this.field3037 = new class282[this.field3030][64][64][];
        int var2 = arg0.method8365();
        if (class285.field3064.field3062 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8365();
        int var4 = arg0.method8365();
        int var5 = arg0.method8365();
        int var6 = arg0.method8365();
        if (this.field3027 != var3 || this.field3043 != var4 || this.field2980 != var5 || this.field2977 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5139(this.field2980 * 8 + var7, this.field2977 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class274)) {
            return false;
        }
        class274 var2 = (class274) arg0;
        if (this.field3027 == var2.field3027 && this.field3043 == var2.field3043) {
            return this.field2980 == var2.field2980 && this.field2977 == var2.field2977;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3027 | this.field3043 << 8 | this.field2980 << 16 | this.field2977 << 24;
    }

    @ObfuscatedName("kh.ak(I)I")
    public int method5095() {
        return this.field2979;
    }

    @ObfuscatedName("kh.ar(S)I")
    public int method5108() {
        return this.field2978;
    }

    @ObfuscatedName("kh.ab(I)I")
    public int method5104() {
        return this.field2980;
    }

    @ObfuscatedName("kh.am(I)I")
    public int method5098() {
        return this.field2977;
    }
}
