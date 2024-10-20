package deob;

@ObfuscatedName("br")
public final class class67 extends class430 {

    @ObfuscatedName("br.a")
    public static class349 field828 = new class349();

    @ObfuscatedName("br.f")
    public int field823;

    @ObfuscatedName("br.c")
    public int field824;

    @ObfuscatedName("br.x")
    public int field835;

    @ObfuscatedName("br.h")
    public int field833;

    @ObfuscatedName("br.j")
    public int field827;

    @ObfuscatedName("br.y")
    public int field825;

    @ObfuscatedName("br.d")
    public int field829;

    @ObfuscatedName("br.n")
    public class49 field830;

    @ObfuscatedName("br.r")
    public class194 field836;

    @ObfuscatedName("br.l")
    public int field831;

    @ObfuscatedName("br.s")
    public int field832;

    @ObfuscatedName("br.p")
    public int[] field826;

    @ObfuscatedName("br.b")
    public int field822;

    @ObfuscatedName("br.o")
    public class49 field834;

    @ObfuscatedName("bt.f(I)V")
    public static void method1682() {
        for (class67 var0 = (class67) field828.method6040(); var0 != null; var0 = (class67) field828.method6034()) {
            if (var0.field836 != null) {
                var0.method1766();
            }
        }
    }

    @ObfuscatedName("br.c(I)V")
    public void method1766() {
        int var1 = this.field829;
        class194 var2 = this.field836.method3418();
        if (var2 == null) {
            this.field829 = -1;
            this.field825 = 0;
            this.field831 = 0;
            this.field832 = 0;
            this.field826 = null;
        } else {
            this.field829 = var2.field2126;
            this.field825 = var2.field2127 * 128;
            this.field831 = var2.field2115;
            this.field832 = var2.field2131;
            this.field826 = var2.field2130;
        }
        if (this.field829 != var1 && this.field830 != null) {
            Statics.field4836.method732(this.field830);
            this.field830 = null;
        }
    }
}
