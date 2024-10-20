package deob;

@ObfuscatedName("ji")
public class class243 extends class249 {

    @ObfuscatedName("ji.am")
    public int field2553;

    @ObfuscatedName("ji.ap")
    public int field2554;

    @ObfuscatedName("ji.af")
    public int field2555;

    @ObfuscatedName("ji.aj")
    public int field2559;

    @ObfuscatedName("ji.am(Luk;I)V")
    public void method4506(class531 arg0) {
        int var2 = arg0.method8561();
        if (class255.field2650.field2651 != var2) {
            throw new IllegalStateException("");
        }
        this.field2610 = arg0.method8561();
        this.field2611 = arg0.method8561();
        this.field2617 = arg0.method8775();
        this.field2614 = arg0.method8775();
        this.field2553 = arg0.method8561();
        this.field2554 = arg0.method8561();
        this.field2608 = arg0.method8775();
        this.field2609 = arg0.method8775();
        this.field2555 = arg0.method8561();
        this.field2559 = arg0.method8561();
        this.field2612 = arg0.method8721();
        this.field2613 = arg0.method8721();
    }

    @ObfuscatedName("ji.ap(Luk;I)V")
    public void method4209(class531 arg0) {
        this.field2611 = Math.min(this.field2611, 4);
        this.field2615 = new short[1][64][64];
        this.field2606 = new short[this.field2611][64][64];
        this.field2616 = new byte[this.field2611][64][64];
        this.field2618 = new byte[this.field2611][64][64];
        this.field2620 = new class251[this.field2611][64][64][];
        int var2 = arg0.method8561();
        if (class254.field2646.field2647 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8561();
        int var4 = arg0.method8561();
        int var5 = arg0.method8561();
        int var6 = arg0.method8561();
        if (this.field2608 != var3 || this.field2609 != var4 || this.field2555 != var5 || this.field2559 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method4545(this.field2555 * 8 + var7, this.field2559 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class243)) {
            return false;
        }
        class243 var2 = (class243) arg0;
        if (this.field2608 == var2.field2608 && this.field2609 == var2.field2609) {
            return this.field2555 == var2.field2555 && this.field2559 == var2.field2559;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2608 | this.field2609 << 8 | this.field2555 << 16 | this.field2559 << 24;
    }

    @ObfuscatedName("ji.af(B)I")
    public int method4509() {
        return this.field2553;
    }

    @ObfuscatedName("ji.aj(I)I")
    public int method4510() {
        return this.field2554;
    }

    @ObfuscatedName("ji.ae(I)I")
    public int method4508() {
        return this.field2555;
    }

    @ObfuscatedName("ji.aa(I)I")
    public int method4512() {
        return this.field2559;
    }
}
