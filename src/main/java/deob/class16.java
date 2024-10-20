package deob;

@ObfuscatedName("w")
public class class16 extends class22 {

    @ObfuscatedName("w.z(Lkl;I)V")
    public void method164(class300 arg0) {
        int var2 = arg0.method4990();
        if (class32.field257.field259 != var2) {
            throw new IllegalStateException("");
        }
        this.field157 = arg0.method4990();
        this.field158 = arg0.method4990();
        this.field159 = arg0.method4992();
        this.field154 = arg0.method4992();
        this.field155 = arg0.method4992();
        this.field156 = arg0.method4992();
        this.field160 = arg0.method5001();
        this.field168 = arg0.method5001();
    }

    @ObfuscatedName("w.n(Lkl;I)V")
    public void method165(class300 arg0) {
        this.field158 = Math.min(this.field158, 4);
        this.field161 = new short[1][64][64];
        this.field162 = new short[this.field158][64][64];
        this.field165 = new byte[this.field158][64][64];
        this.field153 = new byte[this.field158][64][64];
        this.field163 = new class26[this.field158][64][64][];
        int var2 = arg0.method4990();
        if (class31.field254.field250 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method4990();
        int var4 = arg0.method4990();
        if (this.field155 != var3 || this.field156 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method249(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field155 == var2.field155 && this.field156 == var2.field156;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field155 | this.field156 << 8;
    }
}
