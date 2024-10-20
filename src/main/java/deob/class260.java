package deob;

@ObfuscatedName("jh")
public class class260 extends class266 {

    @ObfuscatedName("jh.au")
    public int field2952;

    @ObfuscatedName("jh.ae")
    public int field2953;

    @ObfuscatedName("jh.ao")
    public int field2951;

    @ObfuscatedName("jh.at")
    public int field2954;

    @ObfuscatedName("jh.au(Ltm;B)V")
    public void method4965(class515 arg0) {
        int var2 = arg0.method8300();
        if (class272.field3045.field3046 != var2) {
            throw new IllegalStateException("");
        }
        this.field3004 = arg0.method8300();
        this.field3005 = arg0.method8300();
        this.field3009 = arg0.method8448();
        this.field3007 = arg0.method8448();
        this.field2952 = arg0.method8300();
        this.field2953 = arg0.method8300();
        this.field3002 = arg0.method8448();
        this.field3010 = arg0.method8448();
        this.field2951 = arg0.method8300();
        this.field2954 = arg0.method8300();
        this.field3011 = arg0.method8440();
        this.field3000 = arg0.method8440();
    }

    @ObfuscatedName("jh.ae(Ltm;I)V")
    public void method4666(class515 arg0) {
        this.field3005 = Math.min(this.field3005, 4);
        this.field3008 = new short[1][64][64];
        this.field3006 = new short[this.field3005][64][64];
        this.field3015 = new byte[this.field3005][64][64];
        this.field3001 = new byte[this.field3005][64][64];
        this.field3012 = new class268[this.field3005][64][64][];
        int var2 = arg0.method8300();
        if (class271.field3040.field3039 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8300();
        int var4 = arg0.method8300();
        int var5 = arg0.method8300();
        int var6 = arg0.method8300();
        if (this.field3002 != var3 || this.field3010 != var4 || this.field2951 != var5 || this.field2954 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method5015(this.field2951 * 8 + var7, this.field2954 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class260)) {
            return false;
        }
        class260 var2 = (class260) arg0;
        if (this.field3002 == var2.field3002 && this.field3010 == var2.field3010) {
            return this.field2951 == var2.field2951 && this.field2954 == var2.field2954;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3002 | this.field3010 << 8 | this.field2951 << 16 | this.field2954 << 24;
    }

    @ObfuscatedName("jh.ao(I)I")
    public int method4980() {
        return this.field2952;
    }

    @ObfuscatedName("jh.at(I)I")
    public int method4984() {
        return this.field2953;
    }

    @ObfuscatedName("jh.ac(B)I")
    public int method4973() {
        return this.field2951;
    }

    @ObfuscatedName("jh.ai(I)I")
    public int method4969() {
        return this.field2954;
    }
}
