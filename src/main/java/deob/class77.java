package deob;

@ObfuscatedName("bk")
public class class77 {

    @ObfuscatedName("bk.h")
    public final class314 field996;

    @ObfuscatedName("bk.w")
    public final int field995;

    @ObfuscatedName("bk.v")
    public int field993 = 0;

    public class77(class314 arg0, String arg1) {
        this.field996 = arg0;
        this.field995 = arg0.method5243();
    }

    @ObfuscatedName("bk.s(I)Z")
    public boolean method1933() {
        this.field993 = 0;
        for (int var1 = 0; var1 < this.field995; var1++) {
            if (!this.field996.method5147(var1) || this.field996.method5144(var1)) {
                this.field993++;
            }
        }
        return this.field993 >= this.field995;
    }
}
