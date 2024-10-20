package deob;

@ObfuscatedName("il")
public class class242 extends class369 {

    @ObfuscatedName("il.n")
    public class240 field2766;

    @ObfuscatedName("il.c")
    public int field2765;

    @ObfuscatedName("il.m")
    public class399 field2767;

    @ObfuscatedName("il.k")
    public int field2768;

    @ObfuscatedName("il.o")
    public static class242[] field2764 = new class242[300];

    @ObfuscatedName("il.g")
    public static int field2769 = 0;

    @ObfuscatedName("gb.c(I)Lil;")
    public static class242 method3560() {
        class242 var0;
        if (field2769 == 0) {
            var0 = new class242();
        } else {
            var0 = field2764[--field2769];
        }
        var0.field2766 = null;
        var0.field2765 = 0;
        var0.field2767 = new class399(5000);
        return var0;
    }

    @ObfuscatedName("il.m(I)V")
    public void method4185() {
        if (field2769 < field2764.length) {
            field2764[++field2769 - 1] = this;
        }
    }
}
