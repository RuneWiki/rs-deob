package deob;

@ObfuscatedName("jm")
public class class266 extends class412 {

    @ObfuscatedName("jm.c")
    public class264 field3070;

    @ObfuscatedName("jm.p")
    public int field3065;

    @ObfuscatedName("jm.f")
    public int field3062;

    @ObfuscatedName("jm.n")
    public class444 field3064;

    @ObfuscatedName("jm.k")
    public static class266[] field3066 = new class266[300];

    @ObfuscatedName("jm.w")
    public static int field3067 = 0;

    @ObfuscatedName("ad.c(I)Ljm;")
    public static class266 method768() {
        return field3067 == 0 ? new class266() : field3066[--field3067];
    }

    @ObfuscatedName("jm.f(I)V")
    public void method4807() {
        if (field3067 < field3066.length) {
            field3066[++field3067 - 1] = this;
        }
    }
}
