package deob;

@ObfuscatedName("bz")
public final class class63 extends class387 {

    @ObfuscatedName("bz.c")
    public static class321 field802 = new class321();

    @ObfuscatedName("bz.b")
    public int field789;

    @ObfuscatedName("bz.p")
    public int field793;

    @ObfuscatedName("bz.m")
    public int field791;

    @ObfuscatedName("bz.t")
    public int field803;

    @ObfuscatedName("bz.s")
    public int field797;

    @ObfuscatedName("bz.j")
    public int field795;

    @ObfuscatedName("bz.w")
    public int field794;

    @ObfuscatedName("bz.n")
    public int field800;

    @ObfuscatedName("bz.r")
    public class180 field792;

    @ObfuscatedName("bz.o")
    public class45 field788;

    @ObfuscatedName("bz.v")
    public int field798;

    @ObfuscatedName("bz.d")
    public int[] field799;

    @ObfuscatedName("bz.h")
    public int field790;

    @ObfuscatedName("bz.g")
    public class45 field801;

    @ObfuscatedName("kj.c(S)V")
    public static void method5212() {
        for (class63 var0 = (class63) field802.method5301(); var0 != null; var0 = (class63) field802.method5303()) {
            if (var0.field788 != null) {
                Statics.field3373.method659(var0.field788);
                var0.field788 = null;
            }
            if (var0.field801 != null) {
                Statics.field3373.method659(var0.field801);
                var0.field801 = null;
            }
        }
        field802.method5309();
    }

    @ObfuscatedName("fm.b(I)V")
    public static void method3231() {
        for (class63 var0 = (class63) field802.method5301(); var0 != null; var0 = (class63) field802.method5303()) {
            if (var0.field792 != null) {
                var0.method1708();
            }
        }
    }

    @ObfuscatedName("bz.p(B)V")
    public void method1708() {
        int var1 = this.field800;
        class180 var2 = this.field792.method3208();
        if (var2 == null) {
            this.field800 = -1;
            this.field794 = 0;
            this.field797 = 0;
            this.field798 = 0;
            this.field799 = null;
        } else {
            this.field800 = var2.field1996;
            this.field794 = var2.field1997 * 128;
            this.field797 = var2.field1989;
            this.field798 = var2.field1999;
            this.field799 = var2.field2000;
        }
        if (this.field800 != var1 && this.field788 != null) {
            Statics.field3373.method659(this.field788);
            this.field788 = null;
        }
    }
}
