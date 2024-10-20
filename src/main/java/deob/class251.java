package deob;

@ObfuscatedName("ja")
public class class251 extends class265 {

    @ObfuscatedName("ja.at(Ltz;I)V")
    public void method4634(class501 arg0) {
        int var2 = arg0.method8129();
        if (class271.field3021.field3026 != var2) {
            throw new IllegalStateException("");
        }
        this.field2983 = arg0.method8129();
        this.field2981 = arg0.method8129();
        this.field2984 = arg0.method8195();
        this.field2980 = arg0.method8195();
        this.field2993 = arg0.method8195();
        this.field2982 = arg0.method8195();
        this.field2985 = arg0.method8148();
        this.field2990 = arg0.method8148();
    }

    @ObfuscatedName("ja.an(Ltz;S)V")
    public void method4635(class501 arg0) {
        this.field2981 = Math.min(this.field2981, 4);
        this.field2987 = new short[1][64][64];
        this.field2988 = new short[this.field2981][64][64];
        this.field2989 = new byte[this.field2981][64][64];
        this.field2986 = new byte[this.field2981][64][64];
        this.field2991 = new class267[this.field2981][64][64][];
        int var2 = arg0.method8129();
        if (class270.field3020.field3019 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8129();
        int var4 = arg0.method8129();
        if (this.field2993 != var3 || this.field2982 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4974(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class251)) {
            class251 var2 = (class251) arg0;
            return this.field2993 == var2.field2993 && this.field2982 == var2.field2982;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2993 | this.field2982 << 8;
    }
}
