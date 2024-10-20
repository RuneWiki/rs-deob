package deob;

@ObfuscatedName("rw")
public class class467 extends class469 {

    @ObfuscatedName("rw.at")
    public int field4812 = 0;

    @ObfuscatedName("rw.an")
    public int field4811 = 0;

    public class467(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4812 = arg0;
        this.field4811 = arg1;
    }

    @ObfuscatedName("rw.at(B)I")
    public int method7607() {
        double var1 = this.method7612();
        return (int) Math.round((double) (this.field4811 - this.field4812) * var1 + (double) this.field4812);
    }
}
