package deob;

@ObfuscatedName("jx")
public class class252 extends class266 {

    @ObfuscatedName("jx.au(Ltm;B)V")
    public void method4677(class515 arg0) {
        int var2 = arg0.method8300();
        if (class272.field3044.field3046 != var2) {
            throw new IllegalStateException("");
        }
        this.field3004 = arg0.method8300();
        this.field3005 = arg0.method8300();
        this.field3009 = arg0.method8448();
        this.field3007 = arg0.method8448();
        this.field3002 = arg0.method8448();
        this.field3010 = arg0.method8448();
        this.field3011 = arg0.method8440();
        this.field3000 = arg0.method8440();
    }

    @ObfuscatedName("jx.ae(Ltm;I)V")
    public void method4666(class515 arg0) {
        this.field3005 = Math.min(this.field3005, 4);
        this.field3008 = new short[1][64][64];
        this.field3006 = new short[this.field3005][64][64];
        this.field3015 = new byte[this.field3005][64][64];
        this.field3001 = new byte[this.field3005][64][64];
        this.field3012 = new class268[this.field3005][64][64][];
        int var2 = arg0.method8300();
        if (class271.field3037.field3039 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8300();
        int var4 = arg0.method8300();
        if (this.field3002 != var3 || this.field3010 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method5015(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class252)) {
            class252 var2 = (class252) arg0;
            return this.field3002 == var2.field3002 && this.field3010 == var2.field3010;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3002 | this.field3010 << 8;
    }
}
