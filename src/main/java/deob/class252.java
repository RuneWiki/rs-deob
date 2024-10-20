package deob;

@ObfuscatedName("jh")
public class class252 extends class258 {

    @ObfuscatedName("jh.af")
    public int field2932;

    @ObfuscatedName("jh.an")
    public int field2933;

    @ObfuscatedName("jh.aw")
    public int field2934;

    @ObfuscatedName("jh.ac")
    public int field2935;

    @ObfuscatedName("jh.af(Lsg;I)V")
    public void method4926(class489 arg0) {
        int var2 = arg0.method8248();
        if (class264.field3031.field3032 != var2) {
            throw new IllegalStateException("");
        }
        this.field2990 = arg0.method8248();
        this.field2995 = arg0.method8248();
        this.field2996 = arg0.method8250();
        this.field3001 = arg0.method8250();
        this.field2932 = arg0.method8248();
        this.field2933 = arg0.method8248();
        this.field2988 = arg0.method8250();
        this.field2989 = arg0.method8250();
        this.field2934 = arg0.method8248();
        this.field2935 = arg0.method8248();
        this.field2992 = arg0.method8300();
        this.field2993 = arg0.method8300();
    }

    @ObfuscatedName("jh.an(Lsg;S)V")
    public void method4632(class489 arg0) {
        this.field2995 = Math.min(this.field2995, 4);
        this.field2994 = new short[1][64][64];
        this.field2987 = new short[this.field2995][64][64];
        this.field2991 = new byte[this.field2995][64][64];
        this.field2997 = new byte[this.field2995][64][64];
        this.field2998 = new class260[this.field2995][64][64][];
        int var2 = arg0.method8248();
        if (class263.field3028.field3027 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8248();
        int var4 = arg0.method8248();
        int var5 = arg0.method8248();
        int var6 = arg0.method8248();
        if (this.field2988 != var3 || this.field2989 != var4 || this.field2934 != var5 || this.field2935 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4957(this.field2934 * 8 + var7, this.field2935 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class252)) {
            return false;
        }
        class252 var2 = (class252) arg0;
        if (this.field2988 == var2.field2988 && this.field2989 == var2.field2989) {
            return this.field2934 == var2.field2934 && this.field2935 == var2.field2935;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2988 | this.field2989 << 8 | this.field2934 << 16 | this.field2935 << 24;
    }

    @ObfuscatedName("jh.aw(I)I")
    public int method4910() {
        return this.field2932;
    }

    @ObfuscatedName("jh.al(I)I")
    public int method4911() {
        return this.field2933;
    }

    @ObfuscatedName("jh.at(B)I")
    public int method4912() {
        return this.field2934;
    }

    @ObfuscatedName("jh.aa(S)I")
    public int method4914() {
        return this.field2935;
    }
}
