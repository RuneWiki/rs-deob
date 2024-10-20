package deob;

@ObfuscatedName("ji")
public class class237 extends class251 {

    @ObfuscatedName("ji.aq(Luq;B)V")
    public void method4201(class534 arg0) {
        int var2 = arg0.method8591();
        if (class257.field2660.field2663 != var2) {
            throw new IllegalStateException("");
        }
        this.field2620 = arg0.method8591();
        this.field2621 = arg0.method8591();
        this.field2623 = arg0.method8593();
        this.field2617 = arg0.method8593();
        this.field2616 = arg0.method8593();
        this.field2632 = arg0.method8593();
        this.field2622 = arg0.method8811();
        this.field2618 = arg0.method8811();
    }

    @ObfuscatedName("ji.aw(Luq;I)V")
    public void method4188(class534 arg0) {
        this.field2621 = Math.min(this.field2621, 4);
        this.field2630 = new short[1][64][64];
        this.field2619 = new short[this.field2621][64][64];
        this.field2624 = new byte[this.field2621][64][64];
        this.field2627 = new byte[this.field2621][64][64];
        this.field2628 = new class253[this.field2621][64][64][];
        int var2 = arg0.method8591();
        if (class256.field2656.field2655 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8591();
        int var4 = arg0.method8591();
        if (this.field2616 != var3 || this.field2632 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4531(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class237)) {
            class237 var2 = (class237) arg0;
            return this.field2616 == var2.field2616 && this.field2632 == var2.field2632;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2616 | this.field2632 << 8;
    }
}
