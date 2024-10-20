package deob;

@ObfuscatedName("kw")
public class class280 extends class294 {

    @ObfuscatedName("kw.ap(Lvl;B)V")
    public void method5434(class558 arg0) {
        int var2 = arg0.method9258();
        if (class300.field3245.field3243 != var2) {
            throw new IllegalStateException("");
        }
        this.field3210 = arg0.method9258();
        this.field3203 = arg0.method9258();
        this.field3216 = arg0.method9260();
        this.field3202 = arg0.method9260();
        this.field3205 = arg0.method9260();
        this.field3209 = arg0.method9260();
        this.field3207 = arg0.method9278();
        this.field3208 = arg0.method9278();
    }

    @ObfuscatedName("kw.aw(Lvl;I)V")
    public void method5435(class558 arg0) {
        this.field3203 = Math.min(this.field3203, 4);
        this.field3206 = new short[1][64][64];
        this.field3201 = new short[this.field3203][64][64];
        this.field3211 = new byte[this.field3203][64][64];
        this.field3212 = new byte[this.field3203][64][64];
        this.field3213 = new class296[this.field3203][64][64][];
        int var2 = arg0.method9258();
        if (class299.field3239.field3242 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method9258();
        int var4 = arg0.method9258();
        if (this.field3205 != var3 || this.field3209 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5773(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class280)) {
            class280 var2 = (class280) arg0;
            return this.field3205 == var2.field3205 && this.field3209 == var2.field3209;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3205 | this.field3209 << 8;
    }
}
