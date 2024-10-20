package deob;

@ObfuscatedName("jq")
public class class245 extends class251 {

    @ObfuscatedName("jq.aq")
    public int field2564;

    @ObfuscatedName("jq.aw")
    public int field2562;

    @ObfuscatedName("jq.al")
    public int field2561;

    @ObfuscatedName("jq.ai")
    public int field2563;

    @ObfuscatedName("jq.aq(Luq;B)V")
    public void method4489(class534 arg0) {
        int var2 = arg0.method8591();
        if (class257.field2659.field2663 != var2) {
            throw new IllegalStateException("");
        }
        this.field2620 = arg0.method8591();
        this.field2621 = arg0.method8591();
        this.field2623 = arg0.method8593();
        this.field2617 = arg0.method8593();
        this.field2564 = arg0.method8591();
        this.field2562 = arg0.method8591();
        this.field2616 = arg0.method8593();
        this.field2632 = arg0.method8593();
        this.field2561 = arg0.method8591();
        this.field2563 = arg0.method8591();
        this.field2622 = arg0.method8811();
        this.field2618 = arg0.method8811();
    }

    @ObfuscatedName("jq.aw(Luq;I)V")
    public void method4188(class534 arg0) {
        this.field2621 = Math.min(this.field2621, 4);
        this.field2630 = new short[1][64][64];
        this.field2619 = new short[this.field2621][64][64];
        this.field2624 = new byte[this.field2621][64][64];
        this.field2627 = new byte[this.field2621][64][64];
        this.field2628 = new class253[this.field2621][64][64][];
        int var2 = arg0.method8591();
        if (class256.field2654.field2655 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8591();
        int var4 = arg0.method8591();
        int var5 = arg0.method8591();
        int var6 = arg0.method8591();
        if (this.field2616 != var3 || this.field2632 != var4 || this.field2561 != var5 || this.field2563 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4531(this.field2561 * 8 + var7, this.field2563 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class245)) {
            return false;
        }
        class245 var2 = (class245) arg0;
        if (this.field2616 == var2.field2616 && this.field2632 == var2.field2632) {
            return this.field2561 == var2.field2561 && this.field2563 == var2.field2563;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2616 | this.field2632 << 8 | this.field2561 << 16 | this.field2563 << 24;
    }

    @ObfuscatedName("jq.al(I)I")
    public int method4492() {
        return this.field2564;
    }

    @ObfuscatedName("jq.ai(B)I")
    public int method4493() {
        return this.field2562;
    }

    @ObfuscatedName("jq.ar(I)I")
    public int method4494() {
        return this.field2561;
    }

    @ObfuscatedName("jq.au(B)I")
    public int method4498() {
        return this.field2563;
    }
}
