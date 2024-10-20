package deob;

@ObfuscatedName("bk")
public class class53 {

    @ObfuscatedName("bk.z")
    public final class250 field470;

    @ObfuscatedName("bk.w")
    public final int field469;

    @ObfuscatedName("bk.s")
    public int field468 = 0;

    public class53(class250 arg0, String arg1) {
        this.field470 = arg0;
        this.field469 = arg0.method4259();
    }

    @ObfuscatedName("bk.z(I)Z")
    public boolean method921() {
        this.field468 = 0;
        for (int var1 = 0; var1 < this.field469; var1++) {
            if (!this.field470.method4349(var1) || this.field470.method4344(var1)) {
                this.field468++;
            }
        }
        return this.field468 >= this.field469;
    }
}
