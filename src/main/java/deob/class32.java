package deob;

@ObfuscatedName("aa")
public final class class32 extends class128 {

    @ObfuscatedName("aa.u")
    public static class129 field704 = new class129();

    @ObfuscatedName("aa.x")
    public int field702;

    @ObfuscatedName("aa.i")
    public int field700;

    @ObfuscatedName("aa.a")
    public int field701;

    @ObfuscatedName("aa.f")
    public int field703;

    @ObfuscatedName("aa.c")
    public int field717;

    @ObfuscatedName("aa.d")
    public int field705;

    @ObfuscatedName("aa.l")
    public int field706;

    @ObfuscatedName("aa.g")
    public class67 field707;

    @ObfuscatedName("aa.z")
    public int field708;

    @ObfuscatedName("aa.t")
    public int field709;

    @ObfuscatedName("aa.m")
    public int[] field710;

    @ObfuscatedName("aa.q")
    public int field711;

    @ObfuscatedName("aa.e")
    public class67 field699;

    @ObfuscatedName("aa.v")
    public class198 field713;

    @ObfuscatedName("fr.u(I)V")
    public static void method3040() {
        for (class32 var0 = (class32) field704.method2242(); var0 != null; var0 = (class32) field704.method2244()) {
            if (var0.field707 != null) {
                Statics.field223.method888(var0.field707);
                var0.field707 = null;
            }
            if (var0.field699 != null) {
                Statics.field223.method888(var0.field699);
                var0.field699 = null;
            }
        }
        field704.method2236();
    }

    @ObfuscatedName("aa.x(I)V")
    public void method675() {
        int var1 = this.field706;
        class198 var2 = this.field713.method3420();
        if (var2 == null) {
            this.field706 = -1;
            this.field705 = 0;
            this.field708 = 0;
            this.field709 = 0;
            this.field710 = null;
        } else {
            this.field706 = var2.field2925;
            this.field705 = var2.field2926 * 128;
            this.field708 = var2.field2927;
            this.field709 = var2.field2901;
            this.field710 = var2.field2929;
        }
        if (this.field706 != var1 && this.field707 != null) {
            Statics.field223.method888(this.field707);
            this.field707 = null;
        }
    }
}
