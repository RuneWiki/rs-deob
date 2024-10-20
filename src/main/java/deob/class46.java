package deob;

@ObfuscatedName("aa")
public class class46 extends class29 {

    @ObfuscatedName("aa.m")
    public int field598;

    @ObfuscatedName("aa.i")
    public int field593;

    @ObfuscatedName("aa.s")
    public int field595;

    @ObfuscatedName("aa.r")
    public int field596;

    @ObfuscatedName("aa.j(Lfb;Lfb;I)V")
    public void method587(class175 arg0, class175 arg1) {
        int var3 = arg1.method2903();
        if (class37.field511.field510 != var3) {
            throw new IllegalStateException("");
        }
        this.field415 = arg1.method2903();
        this.field416 = arg1.method2903();
        this.field417 = arg1.method3023();
        this.field412 = arg1.method3023();
        this.field598 = arg1.method2903();
        this.field593 = arg1.method2903();
        this.field425 = arg1.method3023();
        this.field414 = arg1.method3023();
        this.field595 = arg1.method2903();
        this.field596 = arg1.method2903();
        this.field416 = Math.min(this.field416, 4);
        this.field420 = new short[1][64][64];
        this.field418 = new short[this.field416][64][64];
        this.field413 = new byte[this.field416][64][64];
        this.field424 = new byte[this.field416][64][64];
        this.field421 = new class32[this.field416][64][64][];
        int var4 = arg0.method2903();
        if (class36.field503.field504 != var4) {
            throw new IllegalStateException("");
        }
        int var5 = arg0.method2903();
        int var6 = arg0.method2903();
        int var7 = arg0.method2903();
        int var8 = arg0.method2903();
        if (this.field425 != var5 || this.field414 != var6 || this.field595 != var7 || this.field596 != var8) {
            throw new IllegalStateException("");
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                this.method222(this.field595 * 8 + var9, this.field596 * 8 + var10, arg0);
            }
        }
    }

    @ObfuscatedName("aa.h(IIB)Z")
    public boolean method579(int arg0, int arg1) {
        if (arg0 < this.field595 * 8) {
            return false;
        } else if (arg1 < this.field596 * 8) {
            return false;
        } else if (arg0 >= this.field595 * 8 + 8) {
            return false;
        } else {
            return arg1 < this.field596 * 8 + 8;
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class46)) {
            return false;
        }
        class46 var2 = (class46) arg0;
        if (this.field425 == var2.field425 && this.field414 == var2.field414) {
            return this.field595 == var2.field595 && this.field596 == var2.field596;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field425 | this.field414 << 8 | this.field595 << 16 | this.field596 << 24;
    }

    @ObfuscatedName("aa.f(I)I")
    public int method580() {
        return this.field598;
    }

    @ObfuscatedName("aa.ab(I)I")
    public int method581() {
        return this.field593;
    }

    @ObfuscatedName("aa.aj(I)I")
    public int method589() {
        return this.field595;
    }

    @ObfuscatedName("aa.ae(I)I")
    public int method577() {
        return this.field596;
    }
}
