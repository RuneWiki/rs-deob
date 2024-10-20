package deob;

@ObfuscatedName("v")
public final class class7 extends class179 {

    @ObfuscatedName("v.q")
    public static class177 field96 = new class177();

    @ObfuscatedName("v.c")
    public int field89;

    @ObfuscatedName("v.p")
    public int field90;

    @ObfuscatedName("v.z")
    public int field92;

    @ObfuscatedName("v.m")
    public int field91;

    @ObfuscatedName("v.k")
    public int field93;

    @ObfuscatedName("v.v")
    public int field104;

    @ObfuscatedName("v.y")
    public int field95;

    @ObfuscatedName("v.d")
    public class45 field88;

    @ObfuscatedName("v.l")
    public int field102;

    @ObfuscatedName("v.h")
    public int field98;

    @ObfuscatedName("v.b")
    public int[] field99;

    @ObfuscatedName("v.r")
    public class32 field97;

    @ObfuscatedName("v.t")
    public int field100;

    @ObfuscatedName("v.u")
    public class45 field101;

    @ObfuscatedName("fn.q(B)V")
    public static void method3134() {
        for (class7 var0 = (class7) field96.method3286(); var0 != null; var0 = (class7) field96.method3302()) {
            if (var0.field97 != null) {
                var0.method41();
            }
        }
    }

    @ObfuscatedName("v.c(I)V")
    public void method41() {
        int var1 = this.field95;
        class32 var2 = this.field97.method648();
        if (var2 == null) {
            this.field95 = -1;
            this.field104 = 0;
            this.field102 = 0;
            this.field98 = 0;
            this.field99 = null;
        } else {
            this.field95 = var2.field858;
            this.field104 = var2.field859 * 128;
            this.field102 = var2.field860;
            this.field98 = var2.field861;
            this.field99 = var2.field862;
        }
        if (this.field95 != var1 && this.field88 != null) {
            Statics.field1260.method1115(this.field88);
            this.field88 = null;
        }
    }
}
