package deob;

@ObfuscatedName("r")
public class class16 extends class22 {

    @ObfuscatedName("r.n(Lgc;B)V")
    public void method169(class190 arg0) {
        int var2 = arg0.method3511();
        if (class32.field259.field256 != var2) {
            throw new IllegalStateException("");
        }
        this.field160 = arg0.method3511();
        this.field161 = arg0.method3511();
        this.field164 = arg0.method3513();
        this.field149 = arg0.method3513();
        this.field152 = arg0.method3513();
        this.field151 = arg0.method3513();
        this.field154 = arg0.method3516();
        this.field155 = arg0.method3516();
    }

    @ObfuscatedName("r.h(Lgc;I)V")
    public void method161(class190 arg0) {
        this.field161 = Math.min(this.field161, 4);
        this.field148 = new short[1][64][64];
        this.field157 = new short[this.field161][64][64];
        this.field158 = new byte[this.field161][64][64];
        this.field159 = new byte[this.field161][64][64];
        this.field153 = new class26[this.field161][64][64][];
        int var2 = arg0.method3511();
        if (class31.field247.field251 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method3511();
        int var4 = arg0.method3511();
        if (this.field152 != var3 || this.field151 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method235(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class16)) {
            class16 var2 = (class16) arg0;
            return this.field152 == var2.field152 && this.field151 == var2.field151;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field152 | this.field151 << 8;
    }
}
