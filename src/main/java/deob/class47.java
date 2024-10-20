package deob;

@ObfuscatedName("aq")
public class class47 {

    @ObfuscatedName("aq.c")
    public int field349;

    @ObfuscatedName("aq.b")
    public int field351;

    @ObfuscatedName("aq.p")
    public int[] field350;

    @ObfuscatedName("aq.m")
    public int[] field352;

    public class47() {
        class50.method977(16);
        this.field349 = class50.method994() == 0 ? 1 : class50.method977(4) + 1;
        if (class50.method994() != 0) {
            class50.method977(8);
        }
        class50.method977(2);
        if (this.field349 > 1) {
            this.field351 = class50.method977(4);
        }
        this.field350 = new int[this.field349];
        this.field352 = new int[this.field349];
        for (int var1 = 0; var1 < this.field349; var1++) {
            class50.method977(8);
            this.field350[var1] = class50.method977(8);
            this.field352[var1] = class50.method977(8);
        }
    }
}
