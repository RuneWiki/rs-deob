package deob;

@ObfuscatedName("kx")
public class class301 extends class297 {

    @ObfuscatedName("kx.c")
    public int field3838;

    @ObfuscatedName("kx.c(Lkx;B)I")
    public int method5005(class301 arg0) {
        return this.field3838 - arg0.field3838;
    }

    @ObfuscatedName("kx.aa(Lku;B)I")
    public int method4888(class297 arg0) {
        return this.method5005((class301) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5005((class301) arg0);
    }
}
