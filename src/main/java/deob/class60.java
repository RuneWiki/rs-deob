package deob;

@ObfuscatedName("be")
public class class60 {

    @ObfuscatedName("be.f")
    public int field478;

    @ObfuscatedName("be.e")
    public int field477;

    @ObfuscatedName("be.v")
    public int[] field476;

    @ObfuscatedName("be.y")
    public int[] field479;

    public class60() {
        class63.method898(16);
        this.field478 = class63.method897() == 0 ? 1 : class63.method898(4) + 1;
        if (class63.method897() != 0) {
            class63.method898(8);
        }
        class63.method898(2);
        if (this.field478 > 1) {
            this.field477 = class63.method898(4);
        }
        this.field476 = new int[this.field478];
        this.field479 = new int[this.field478];
        for (int var1 = 0; var1 < this.field478; var1++) {
            class63.method898(8);
            this.field476[var1] = class63.method898(8);
            this.field479[var1] = class63.method898(8);
        }
    }
}
