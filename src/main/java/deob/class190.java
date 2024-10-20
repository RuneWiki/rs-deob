package deob;

@ObfuscatedName("ga")
public class class190 {

    @ObfuscatedName("ga.cm")
    public long field2141;

    @ObfuscatedName("ga.cc")
    public class190 field2140;

    @ObfuscatedName("ga.co")
    public class190 field2139;

    @ObfuscatedName("ga.ea()V")
    public void method3486() {
        if (this.field2139 != null) {
            this.field2139.field2140 = this.field2140;
            this.field2140.field2139 = this.field2139;
            this.field2140 = null;
            this.field2139 = null;
        }
    }

    @ObfuscatedName("ga.eu()Z")
    public boolean method3487() {
        return this.field2139 != null;
    }
}
