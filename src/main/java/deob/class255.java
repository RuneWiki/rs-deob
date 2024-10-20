package deob;

@ObfuscatedName("iw")
public class class255 extends class387 {

    @ObfuscatedName("iw.c")
    public class253 field2924;

    @ObfuscatedName("iw.b")
    public int field2923;

    @ObfuscatedName("iw.p")
    public int field2925;

    @ObfuscatedName("iw.m")
    public class418 field2930;

    @ObfuscatedName("iw.t")
    public static class255[] field2922 = new class255[300];

    @ObfuscatedName("iw.s")
    public static int field2927 = 0;

    @ObfuscatedName("hi.b(I)Liw;")
    public static class255 method4395() {
        class255 var0;
        if (field2927 == 0) {
            var0 = new class255();
        } else {
            var0 = field2922[--field2927];
        }
        var0.field2924 = null;
        var0.field2923 = 0;
        var0.field2930 = new class418(5000);
        return var0;
    }

    @ObfuscatedName("iw.p(I)V")
    public void method4536() {
        if (field2927 < field2922.length) {
            field2922[++field2927 - 1] = this;
        }
    }
}
