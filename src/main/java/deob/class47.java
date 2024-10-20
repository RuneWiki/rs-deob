package deob;

@ObfuscatedName("av")
public class class47 {

    @ObfuscatedName("av.o")
    public int field353;

    @ObfuscatedName("av.q")
    public int field355;

    @ObfuscatedName("av.l")
    public int[] field352;

    @ObfuscatedName("av.k")
    public int[] field354;

    public class47() {
        class50.method927(16);
        this.field353 = class50.method926() == 0 ? 1 : class50.method927(4) + 1;
        if (class50.method926() != 0) {
            class50.method927(8);
        }
        class50.method927(2);
        if (this.field353 > 1) {
            this.field355 = class50.method927(4);
        }
        this.field352 = new int[this.field353];
        this.field354 = new int[this.field353];
        for (int var1 = 0; var1 < this.field353; var1++) {
            class50.method927(8);
            this.field352[var1] = class50.method927(8);
            this.field354[var1] = class50.method927(8);
        }
    }
}
