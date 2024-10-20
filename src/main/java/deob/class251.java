package deob;

@ObfuscatedName("jw")
public class class251 extends class257 {

    @ObfuscatedName("jw.aq")
    public int field2620;

    @ObfuscatedName("jw.ad")
    public int field2617;

    @ObfuscatedName("jw.ag")
    public int field2619;

    @ObfuscatedName("jw.ak")
    public int field2618;

    @ObfuscatedName("jw.aq(Lvp;I)V")
    public void method4498(class547 arg0) {
        int var2 = arg0.method8804();
        if (class263.field2715.field2713 != var2) {
            throw new IllegalStateException("");
        }
        this.field2672 = arg0.method8804();
        this.field2680 = arg0.method8804();
        this.field2682 = arg0.method8899();
        this.field2674 = arg0.method8899();
        this.field2620 = arg0.method8804();
        this.field2617 = arg0.method8804();
        this.field2670 = arg0.method8899();
        this.field2671 = arg0.method8899();
        this.field2619 = arg0.method8804();
        this.field2618 = arg0.method8804();
        this.field2683 = arg0.method8773();
        this.field2675 = arg0.method8773();
    }

    @ObfuscatedName("jw.ad(Lvp;B)V")
    public void method4190(class547 arg0) {
        this.field2680 = Math.min(this.field2680, 4);
        this.field2673 = new short[1][64][64];
        this.field2677 = new short[this.field2680][64][64];
        this.field2678 = new byte[this.field2680][64][64];
        this.field2679 = new byte[this.field2680][64][64];
        this.field2668 = new class259[this.field2680][64][64][];
        int var2 = arg0.method8804();
        if (class262.field2706.field2707 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8804();
        int var4 = arg0.method8804();
        int var5 = arg0.method8804();
        int var6 = arg0.method8804();
        if (this.field2670 != var3 || this.field2671 != var4 || this.field2619 != var5 || this.field2618 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4541(this.field2619 * 8 + var7, this.field2618 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class251)) {
            return false;
        }
        class251 var2 = (class251) arg0;
        if (this.field2670 == var2.field2670 && this.field2671 == var2.field2671) {
            return this.field2619 == var2.field2619 && this.field2618 == var2.field2618;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2670 | this.field2671 << 8 | this.field2619 << 16 | this.field2618 << 24;
    }

    @ObfuscatedName("jw.ag(I)I")
    public int method4501() {
        return this.field2620;
    }

    @ObfuscatedName("jw.ak(I)I")
    public int method4517() {
        return this.field2617;
    }

    @ObfuscatedName("jw.ap(I)I")
    public int method4503() {
        return this.field2619;
    }

    @ObfuscatedName("jw.ai(I)I")
    public int method4504() {
        return this.field2618;
    }
}
