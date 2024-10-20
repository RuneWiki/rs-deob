package deob;

@ObfuscatedName("bz")
public class class68 {

    @ObfuscatedName("bz.m")
    public final class246 field567;

    @ObfuscatedName("bz.k")
    public final int field566;

    @ObfuscatedName("bz.d")
    public int field568 = 0;

    public class68(class246 arg0, String arg1) {
        this.field567 = arg0;
        this.field566 = arg0.method3880();
    }

    @ObfuscatedName("bz.x(I)Z")
    public boolean method1097() {
        this.field568 = 0;
        for (int var1 = 0; var1 < this.field566; var1++) {
            if (!this.field567.method3972(var1) || this.field567.method3971(var1)) {
                this.field568++;
            }
        }
        return this.field568 >= this.field566;
    }
}
