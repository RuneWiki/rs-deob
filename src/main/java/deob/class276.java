package deob;

@ObfuscatedName("kv")
public class class276 extends class290 {

    @ObfuscatedName("kv.ak(Lua;I)V")
    public void method5039(class546 arg0) {
        int var2 = arg0.method8796();
        if (class296.field3213.field3215 != var2) {
            throw new IllegalStateException("");
        }
        this.field3175 = arg0.method8796();
        this.field3176 = arg0.method8796();
        this.field3173 = arg0.method8798();
        this.field3172 = arg0.method8798();
        this.field3184 = arg0.method8798();
        this.field3174 = arg0.method8798();
        this.field3178 = arg0.method8814();
        this.field3177 = arg0.method8814();
    }

    @ObfuscatedName("kv.al(Lua;I)V")
    public void method5040(class546 arg0) {
        this.field3176 = Math.min(this.field3176, 4);
        this.field3179 = new short[1][64][64];
        this.field3180 = new short[this.field3176][64][64];
        this.field3171 = new byte[this.field3176][64][64];
        this.field3182 = new byte[this.field3176][64][64];
        this.field3183 = new class292[this.field3176][64][64][];
        int var2 = arg0.method8796();
        if (class295.field3210.field3209 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8796();
        int var4 = arg0.method8796();
        if (this.field3184 != var3 || this.field3174 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5406(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class276)) {
            class276 var2 = (class276) arg0;
            return this.field3184 == var2.field3184 && this.field3174 == var2.field3174;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3184 | this.field3174 << 8;
    }
}
