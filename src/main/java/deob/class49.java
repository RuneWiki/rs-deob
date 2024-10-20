package deob;

@ObfuscatedName("ae")
public class class49 extends class31 {

    @ObfuscatedName("ae.r")
    public int field358;

    @ObfuscatedName("ae.y")
    public int field357;

    @ObfuscatedName("ae.s")
    public int field359;

    @ObfuscatedName("ae.j")
    public int field360;

    @ObfuscatedName("ae.f(Lkb;B)V")
    public void method662(class311 arg0) {
        int var2 = arg0.method5276();
        if (class41.field293.field292 != var2) {
            throw new IllegalStateException("");
        }
        this.field191 = arg0.method5276();
        this.field192 = arg0.method5276();
        this.field200 = arg0.method5163();
        this.field189 = arg0.method5163();
        this.field358 = arg0.method5276();
        this.field357 = arg0.method5276();
        this.field194 = arg0.method5163();
        this.field190 = arg0.method5163();
        this.field359 = arg0.method5276();
        this.field360 = arg0.method5276();
        this.field193 = arg0.method5394();
        this.field187 = arg0.method5394();
    }

    @ObfuscatedName("ae.b(Lkb;I)V")
    public void method223(class311 arg0) {
        this.field192 = Math.min(this.field192, 4);
        this.field195 = new short[1][64][64];
        this.field196 = new short[this.field192][64][64];
        this.field197 = new byte[this.field192][64][64];
        this.field188 = new byte[this.field192][64][64];
        this.field198 = new class35[this.field192][64][64][];
        int var2 = arg0.method5276();
        if (class40.field286.field287 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5276();
        int var4 = arg0.method5276();
        int var5 = arg0.method5276();
        int var6 = arg0.method5276();
        if (this.field194 != var3 || this.field190 != var4 || this.field359 != var5 || this.field360 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method305(this.field359 * 8 + var7, this.field360 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class49)) {
            return false;
        }
        class49 var2 = (class49) arg0;
        if (this.field194 == var2.field194 && this.field190 == var2.field190) {
            return this.field359 == var2.field359 && this.field360 == var2.field360;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field194 | this.field190 << 8 | this.field359 << 16 | this.field360 << 24;
    }

    @ObfuscatedName("ae.l(B)I")
    public int method676() {
        return this.field358;
    }

    @ObfuscatedName("ae.m(I)I")
    public int method665() {
        return this.field357;
    }

    @ObfuscatedName("ae.z(B)I")
    public int method666() {
        return this.field359;
    }

    @ObfuscatedName("ae.q(I)I")
    public int method667() {
        return this.field360;
    }
}
