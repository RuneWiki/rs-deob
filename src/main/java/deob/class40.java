package deob;

@ObfuscatedName("au")
public class class40 extends class22 {

    @ObfuscatedName("au.b")
    public int field326;

    @ObfuscatedName("au.g")
    public int field329;

    @ObfuscatedName("au.e")
    public int field322;

    @ObfuscatedName("au.z")
    public int field323;

    @ObfuscatedName("au.s(Lky;I)V")
    public void method570(class300 arg0) {
        int var2 = arg0.method5179();
        if (class32.field258.field259 != var2) {
            throw new IllegalStateException("");
        }
        this.field150 = arg0.method5179();
        this.field153 = arg0.method5179();
        this.field155 = arg0.method5054();
        this.field147 = arg0.method5054();
        this.field326 = arg0.method5179();
        this.field329 = arg0.method5179();
        this.field148 = arg0.method5054();
        this.field156 = arg0.method5054();
        this.field322 = arg0.method5179();
        this.field323 = arg0.method5179();
        this.field152 = arg0.method5246();
        this.field149 = arg0.method5246();
    }

    @ObfuscatedName("au.j(Lky;B)V")
    public void method145(class300 arg0) {
        this.field153 = Math.min(this.field153, 4);
        this.field154 = new short[1][64][64];
        this.field151 = new short[this.field153][64][64];
        this.field146 = new byte[this.field153][64][64];
        this.field157 = new byte[this.field153][64][64];
        this.field158 = new class26[this.field153][64][64][];
        int var2 = arg0.method5179();
        if (class31.field251.field255 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5179();
        int var4 = arg0.method5179();
        int var5 = arg0.method5179();
        int var6 = arg0.method5179();
        if (this.field148 != var3 || this.field156 != var4 || this.field322 != var5 || this.field323 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method219(this.field322 * 8 + var7, this.field323 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class40)) {
            return false;
        }
        class40 var2 = (class40) arg0;
        if (this.field148 == var2.field148 && this.field156 == var2.field156) {
            return this.field322 == var2.field322 && this.field323 == var2.field323;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field148 | this.field156 << 8 | this.field322 << 16 | this.field323 << 24;
    }

    @ObfuscatedName("au.i(B)I")
    public int method559() {
        return this.field326;
    }

    @ObfuscatedName("au.au(I)I")
    public int method560() {
        return this.field329;
    }

    @ObfuscatedName("au.ax(I)I")
    public int method561() {
        return this.field322;
    }

    @ObfuscatedName("au.ag(I)I")
    public int method562() {
        return this.field323;
    }
}
