package deob;

@ObfuscatedName("ad")
public class class49 extends class31 {

    @ObfuscatedName("ad.i")
    public int field367;

    @ObfuscatedName("ad.x")
    public int field366;

    @ObfuscatedName("ad.f")
    public int field370;

    @ObfuscatedName("ad.g")
    public int field365;

    @ObfuscatedName("ad.n(Lkx;I)V")
    public void method669(class311 arg0) {
        int var2 = arg0.method5310();
        if (class41.field291.field292 != var2) {
            throw new IllegalStateException("");
        }
        this.field198 = arg0.method5310();
        this.field199 = arg0.method5310();
        this.field200 = arg0.method5247();
        this.field195 = arg0.method5247();
        this.field367 = arg0.method5310();
        this.field366 = arg0.method5310();
        this.field196 = arg0.method5247();
        this.field207 = arg0.method5247();
        this.field370 = arg0.method5310();
        this.field365 = arg0.method5310();
        this.field197 = arg0.method5389();
        this.field201 = arg0.method5389();
    }

    @ObfuscatedName("ad.v(Lkx;B)V")
    public void method221(class311 arg0) {
        this.field199 = Math.min(this.field199, 4);
        this.field202 = new short[1][64][64];
        this.field203 = new short[this.field199][64][64];
        this.field194 = new byte[this.field199][64][64];
        this.field205 = new byte[this.field199][64][64];
        this.field206 = new class35[this.field199][64][64][];
        int var2 = arg0.method5310();
        if (class40.field284.field288 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5310();
        int var4 = arg0.method5310();
        int var5 = arg0.method5310();
        int var6 = arg0.method5310();
        if (this.field196 != var3 || this.field207 != var4 || this.field370 != var5 || this.field365 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method318(this.field370 * 8 + var7, this.field365 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class49)) {
            return false;
        }
        class49 var2 = (class49) arg0;
        if (this.field196 == var2.field196 && this.field207 == var2.field207) {
            return this.field370 == var2.field370 && this.field365 == var2.field365;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field196 | this.field207 << 8 | this.field370 << 16 | this.field365 << 24;
    }

    @ObfuscatedName("ad.d(I)I")
    public int method675() {
        return this.field367;
    }

    @ObfuscatedName("ad.c(B)I")
    public int method676() {
        return this.field366;
    }

    @ObfuscatedName("ad.y(I)I")
    public int method674() {
        return this.field370;
    }

    @ObfuscatedName("ad.ar(I)I")
    public int method670() {
        return this.field365;
    }
}
