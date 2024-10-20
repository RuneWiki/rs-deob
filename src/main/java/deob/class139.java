package deob;

@ObfuscatedName("em")
public class class139 extends class153 {

    @ObfuscatedName("em.f(Lnu;B)V")
    public void method2346(class382 arg0) {
        int var2 = arg0.method5856();
        if (class159.field1742.field1740 != var2) {
            throw new IllegalStateException("");
        }
        this.field1694 = arg0.method5856();
        this.field1695 = arg0.method5856();
        this.field1700 = arg0.method5858();
        this.field1705 = arg0.method5858();
        this.field1692 = arg0.method5858();
        this.field1693 = arg0.method5858();
        this.field1696 = arg0.method5873();
        this.field1697 = arg0.method5873();
    }

    @ObfuscatedName("em.o(Lnu;I)V")
    public void method2347(class382 arg0) {
        this.field1695 = Math.min(this.field1695, 4);
        this.field1698 = new short[1][64][64];
        this.field1699 = new short[this.field1695][64][64];
        this.field1691 = new byte[this.field1695][64][64];
        this.field1701 = new byte[this.field1695][64][64];
        this.field1702 = new class155[this.field1695][64][64][];
        int var2 = arg0.method5856();
        if (class158.field1733.field1736 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method5856();
        int var4 = arg0.method5856();
        if (this.field1692 != var3 || this.field1693 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method2693(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class139)) {
            class139 var2 = (class139) arg0;
            return this.field1692 == var2.field1692 && this.field1693 == var2.field1693;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field1692 | this.field1693 << 8;
    }
}
