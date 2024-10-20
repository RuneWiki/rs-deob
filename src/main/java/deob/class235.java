package deob;

@ObfuscatedName("jh")
public class class235 extends class249 {

    @ObfuscatedName("jh.am(Luk;S)V")
    public void method4203(class531 arg0) {
        int var2 = arg0.method8561();
        if (class255.field2654.field2651 != var2) {
            throw new IllegalStateException("");
        }
        this.field2610 = arg0.method8561();
        this.field2611 = arg0.method8561();
        this.field2617 = arg0.method8775();
        this.field2614 = arg0.method8775();
        this.field2608 = arg0.method8775();
        this.field2609 = arg0.method8775();
        this.field2612 = arg0.method8721();
        this.field2613 = arg0.method8721();
    }

    @ObfuscatedName("jh.ap(Luk;I)V")
    public void method4209(class531 arg0) {
        this.field2611 = Math.min(this.field2611, 4);
        this.field2615 = new short[1][64][64];
        this.field2606 = new short[this.field2611][64][64];
        this.field2616 = new byte[this.field2611][64][64];
        this.field2618 = new byte[this.field2611][64][64];
        this.field2620 = new class251[this.field2611][64][64][];
        int var2 = arg0.method8561();
        if (class254.field2649.field2647 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method8561();
        int var4 = arg0.method8561();
        if (this.field2608 != var3 || this.field2609 != var4) {
            throw new IllegalStateException("");
        }
        for (int var5 = 0; var5 < 64; var5++) {
            for (int var6 = 0; var6 < 64; var6++) {
                this.method4545(var5, var6, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof class235)) {
            class235 var2 = (class235) arg0;
            return this.field2608 == var2.field2608 && this.field2609 == var2.field2609;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2608 | this.field2609 << 8;
    }
}
