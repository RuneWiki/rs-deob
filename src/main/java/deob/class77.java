package deob;

@ObfuscatedName("ba")
public class class77 {

    @ObfuscatedName("ba.w")
    public final class288 field981;

    @ObfuscatedName("ba.s")
    public final int field982;

    @ObfuscatedName("ba.a")
    public int field984 = 0;

    public class77(class288 arg0, String arg1) {
        this.field981 = arg0;
        this.field982 = arg0.method4754();
    }

    @ObfuscatedName("ba.i(I)Z")
    public boolean method1948() {
        this.field984 = 0;
        for (int var1 = 0; var1 < this.field982; var1++) {
            if (!this.field981.method4710(var1) || this.field981.method4709(var1)) {
                this.field984++;
            }
        }
        return this.field984 >= this.field982;
    }
}
