package deob;

@ObfuscatedName("bf")
public class class77 {

    @ObfuscatedName("bf.b")
    public final class300 field986;

    @ObfuscatedName("bf.p")
    public final int field987;

    @ObfuscatedName("bf.m")
    public int field988 = 0;

    public class77(class300 arg0, String arg1) {
        this.field986 = arg0;
        this.field987 = arg0.method5062();
    }

    @ObfuscatedName("bf.c(I)Z")
    public boolean method2022() {
        this.field988 = 0;
        for (int var1 = 0; var1 < this.field987; var1++) {
            if (!this.field986.method5045(var1) || this.field986.method5031(var1)) {
                this.field988++;
            }
        }
        return this.field988 >= this.field987;
    }
}
