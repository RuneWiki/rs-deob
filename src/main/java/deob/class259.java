package deob;

@ObfuscatedName("jl")
public class class259 extends class265 {

    @ObfuscatedName("jl.at")
    public int field2932;

    @ObfuscatedName("jl.an")
    public int field2930;

    @ObfuscatedName("jl.av")
    public int field2931;

    @ObfuscatedName("jl.as")
    public int field2929;

    @ObfuscatedName("jl.at(Ltz;S)V")
    public void method4926(class501 arg0) {
        int var2 = arg0.method8129();
        if (class271.field3023.field3026 != var2) {
            throw new IllegalStateException("");
        }
        this.field2983 = arg0.method8129();
        this.field2981 = arg0.method8129();
        this.field2984 = arg0.method8195();
        this.field2980 = arg0.method8195();
        this.field2932 = arg0.method8129();
        this.field2930 = arg0.method8129();
        this.field2993 = arg0.method8195();
        this.field2982 = arg0.method8195();
        this.field2931 = arg0.method8129();
        this.field2929 = arg0.method8129();
        this.field2985 = arg0.method8148();
        this.field2990 = arg0.method8148();
    }

    @ObfuscatedName("jl.an(Ltz;S)V")
    public void method4635(class501 arg0) {
        this.field2981 = Math.min(this.field2981, 4);
        this.field2987 = new short[1][64][64];
        this.field2988 = new short[this.field2981][64][64];
        this.field2989 = new byte[this.field2981][64][64];
        this.field2986 = new byte[this.field2981][64][64];
        this.field2991 = new class267[this.field2981][64][64][];
        int var2 = arg0.method8129();
        if (class270.field3017.field3019 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8129();
        int var4 = arg0.method8129();
        int var5 = arg0.method8129();
        int var6 = arg0.method8129();
        if (this.field2993 != var3 || this.field2982 != var4 || this.field2931 != var5 || this.field2929 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4974(this.field2931 * 8 + var7, this.field2929 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class259)) {
            return false;
        }
        class259 var2 = (class259) arg0;
        if (this.field2993 == var2.field2993 && this.field2982 == var2.field2982) {
            return this.field2931 == var2.field2931 && this.field2929 == var2.field2929;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2993 | this.field2982 << 8 | this.field2931 << 16 | this.field2929 << 24;
    }

    @ObfuscatedName("jl.av(S)I")
    public int method4922() {
        return this.field2932;
    }

    @ObfuscatedName("jl.as(I)I")
    public int method4923() {
        return this.field2930;
    }

    @ObfuscatedName("jl.ax(I)I")
    public int method4924() {
        return this.field2931;
    }

    @ObfuscatedName("jl.ap(I)I")
    public int method4925() {
        return this.field2929;
    }
}
