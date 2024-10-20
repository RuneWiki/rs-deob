package deob;

@ObfuscatedName("jn")
public class class243 extends class257 {

    @ObfuscatedName("jn.aq(Lvp;B)V")
    public void method4189(class547 arg0) {
        int var2 = arg0.method8804();
        if (class263.field2716.field2713 != var2) {
            throw new IllegalStateException("");
        }
        this.field2672 = arg0.method8804();
        this.field2680 = arg0.method8804();
        this.field2682 = arg0.method8899();
        this.field2674 = arg0.method8899();
        this.field2670 = arg0.method8899();
        this.field2671 = arg0.method8899();
        this.field2683 = arg0.method8773();
        this.field2675 = arg0.method8773();
    }

    @ObfuscatedName("jn.ad(Lvp;B)V")
    public void method4190(class547 arg0) {
        this.field2680 = Math.min(this.field2680, 4);
        this.field2673 = new short[1][64][64];
        this.field2677 = new short[this.field2680][64][64];
        this.field2678 = new byte[this.field2680][64][64];
        this.field2679 = new byte[this.field2680][64][64];
        this.field2668 = new class259[this.field2680][64][64][];
        int var2 = arg0.method8804();
        if (class262.field2710.field2707 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8804();
        int var4 = arg0.method8804();
        if (this.field2670 != var3 || this.field2671 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4541(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class243)) {
            class243 var2 = (class243) arg0;
            return this.field2670 == var2.field2670 && this.field2671 == var2.field2671;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2670 | this.field2671 << 8;
    }
}
