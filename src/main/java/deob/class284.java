package deob;

@ObfuscatedName("ku")
public class class284 extends class290 {

    @ObfuscatedName("ku.ak")
    public int field3121;

    @ObfuscatedName("ku.al")
    public int field3123;

    @ObfuscatedName("ku.aj")
    public int field3122;

    @ObfuscatedName("ku.az")
    public int field3120;

    @ObfuscatedName("ku.ak(Lua;I)V")
    public void method5355(class546 arg0) {
        int var2 = arg0.method8796();
        if (class296.field3214.field3215 != var2) {
            throw new IllegalStateException("");
        }
        this.field3175 = arg0.method8796();
        this.field3176 = arg0.method8796();
        this.field3173 = arg0.method8798();
        this.field3172 = arg0.method8798();
        this.field3121 = arg0.method8796();
        this.field3123 = arg0.method8796();
        this.field3184 = arg0.method8798();
        this.field3174 = arg0.method8798();
        this.field3122 = arg0.method8796();
        this.field3120 = arg0.method8796();
        this.field3178 = arg0.method8814();
        this.field3177 = arg0.method8814();
    }

    @ObfuscatedName("ku.al(Lua;I)V")
    public void method5040(class546 arg0) {
        this.field3176 = Math.min(this.field3176, 4);
        this.field3179 = new short[1][64][64];
        this.field3180 = new short[this.field3176][64][64];
        this.field3171 = new byte[this.field3176][64][64];
        this.field3182 = new byte[this.field3176][64][64];
        this.field3183 = new class292[this.field3176][64][64][];
        int var2 = arg0.method8796();
        if (class295.field3207.field3209 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8796();
        int var4 = arg0.method8796();
        int var5 = arg0.method8796();
        int var6 = arg0.method8796();
        if (this.field3184 != var3 || this.field3174 != var4 || this.field3122 != var5 || this.field3120 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5406(this.field3122 * 8 + var7, this.field3120 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class284)) {
            return false;
        }
        class284 var2 = (class284) arg0;
        if (this.field3184 == var2.field3184 && this.field3174 == var2.field3174) {
            return this.field3122 == var2.field3122 && this.field3120 == var2.field3120;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3184 | this.field3174 << 8 | this.field3122 << 16 | this.field3120 << 24;
    }

    @ObfuscatedName("ku.aj(I)I")
    public int method5357() {
        return this.field3121;
    }

    @ObfuscatedName("ku.af(I)I")
    public int method5367() {
        return this.field3123;
    }

    @ObfuscatedName("ku.aa(I)I")
    public int method5358() {
        return this.field3122;
    }

    @ObfuscatedName("ku.at(B)I")
    public int method5359() {
        return this.field3120;
    }
}
