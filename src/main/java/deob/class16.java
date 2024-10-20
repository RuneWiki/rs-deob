package deob;

@ObfuscatedName("j")
public class class16 extends class22 {

    @ObfuscatedName("j.a(Lkc;I)V")
    public void method188(class300 arg0) {
        int var2 = arg0.method5123();
        if (class32.field260.field259 != var2) {
            throw new IllegalStateException("");
        }
        this.field151 = arg0.method5123();
        this.field157 = arg0.method5123();
        this.field159 = arg0.method5166();
        this.field148 = arg0.method5166();
        this.field149 = arg0.method5166();
        this.field150 = arg0.method5166();
        this.field153 = arg0.method5152();
        this.field154 = arg0.method5152();
    }

    @ObfuscatedName("j.t(Lkc;I)V")
    public void method175(class300 arg0) {
        this.field157 = Math.min(this.field157, 4);
        this.field147 = new short[1][64][64];
        this.field161 = new short[this.field157][64][64];
        this.field162 = new byte[this.field157][64][64];
        this.field158 = new byte[this.field157][64][64];
        this.field164 = new class26[this.field157][64][64][];
        int var2 = arg0.method5123();
        if (class31.field252.field254 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5123();
        int var4 = arg0.method5123();
        if (this.field149 != var3 || this.field150 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method264(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field149 == var2.field149 && this.field150 == var2.field150;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field149 | this.field150 << 8;
    }
}
