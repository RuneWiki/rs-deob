package deob;

@ObfuscatedName("by")
public class class77 {

    @ObfuscatedName("by.c")
    public final class288 field993;

    @ObfuscatedName("by.m")
    public final int field997;

    @ObfuscatedName("by.k")
    public int field995 = 0;

    public class77(class288 arg0, String arg1) {
        this.field993 = arg0;
        this.field997 = arg0.method4721();
    }

    @ObfuscatedName("by.n(I)Z")
    public boolean method1914() {
        this.field995 = 0;
        for (int var1 = 0; var1 < this.field997; var1++) {
            if (!this.field993.method4682(var1) || this.field993.method4673(var1)) {
                this.field995++;
            }
        }
        return this.field995 >= this.field997;
    }
}
