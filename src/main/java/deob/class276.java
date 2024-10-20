package deob;

@ObfuscatedName("kg")
public class class276 extends class282 {

    @ObfuscatedName("kg.az")
    public int field3040;

    @ObfuscatedName("kg.ah")
    public int field3037;

    @ObfuscatedName("kg.af")
    public int field3038;

    @ObfuscatedName("kg.at")
    public int field3039;

    @ObfuscatedName("kg.az(Lur;B)V")
    public void method5122(class535 arg0) {
        int var2 = arg0.method8462();
        if (class288.field3135.field3133 != var2) {
            throw new IllegalStateException("");
        }
        this.field3095 = arg0.method8462();
        this.field3096 = arg0.method8462();
        this.field3103 = arg0.method8670();
        this.field3104 = arg0.method8670();
        this.field3040 = arg0.method8462();
        this.field3037 = arg0.method8462();
        this.field3093 = arg0.method8670();
        this.field3094 = arg0.method8670();
        this.field3038 = arg0.method8462();
        this.field3039 = arg0.method8462();
        this.field3100 = arg0.method8633();
        this.field3091 = arg0.method8633();
    }

    @ObfuscatedName("kg.ah(Lur;B)V")
    public void method4815(class535 arg0) {
        this.field3096 = Math.min(this.field3096, 4);
        this.field3099 = new short[1][64][64];
        this.field3092 = new short[this.field3096][64][64];
        this.field3101 = new byte[this.field3096][64][64];
        this.field3102 = new byte[this.field3096][64][64];
        this.field3097 = new class284[this.field3096][64][64][];
        int var2 = arg0.method8462();
        if (class287.field3129.field3132 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8462();
        int var4 = arg0.method8462();
        int var5 = arg0.method8462();
        int var6 = arg0.method8462();
        if (this.field3093 != var3 || this.field3094 != var4 || this.field3038 != var5 || this.field3039 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5176(this.field3038 * 8 + var7, this.field3039 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class276)) {
            return false;
        }
        class276 var2 = (class276) arg0;
        if (this.field3093 == var2.field3093 && this.field3094 == var2.field3094) {
            return this.field3038 == var2.field3038 && this.field3039 == var2.field3039;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3093 | this.field3094 << 8 | this.field3038 << 16 | this.field3039 << 24;
    }

    @ObfuscatedName("kg.af(I)I")
    public int method5141() {
        return this.field3040;
    }

    @ObfuscatedName("kg.at(I)I")
    public int method5124() {
        return this.field3037;
    }

    @ObfuscatedName("kg.an(I)I")
    public int method5125() {
        return this.field3038;
    }

    @ObfuscatedName("kg.aw(I)I")
    public int method5140() {
        return this.field3039;
    }
}
