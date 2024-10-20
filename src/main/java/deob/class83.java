package deob;

@ObfuscatedName("cy")
public final class class83 extends class193 {

    @ObfuscatedName("cy.c")
    public static class194 field1312 = new class194();

    @ObfuscatedName("cy.o")
    public int field1305;

    @ObfuscatedName("cy.i")
    public int field1316;

    @ObfuscatedName("cy.u")
    public int field1307;

    @ObfuscatedName("cy.g")
    public int field1308;

    @ObfuscatedName("cy.m")
    public int field1318;

    @ObfuscatedName("cy.s")
    public int field1306;

    @ObfuscatedName("cy.x")
    public int field1310;

    @ObfuscatedName("cy.p")
    public int field1313;

    @ObfuscatedName("cy.k")
    public class118 field1309;

    @ObfuscatedName("cy.r")
    public class256 field1311;

    @ObfuscatedName("cy.w")
    public int field1314;

    @ObfuscatedName("cy.v")
    public int[] field1315;

    @ObfuscatedName("cy.h")
    public int field1304;

    @ObfuscatedName("cy.t")
    public class118 field1317;

    @ObfuscatedName("au.c(I)V")
    public static void method605() {
        for (class83 var0 = (class83) field1312.method3296(); var0 != null; var0 = (class83) field1312.method3298()) {
            if (var0.field1311 != null) {
                var0.method1443();
            }
        }
    }

    @ObfuscatedName("cy.o(I)V")
    public void method1443() {
        int var1 = this.field1313;
        class256 var2 = this.field1311.method4115();
        if (var2 == null) {
            this.field1313 = -1;
            this.field1310 = 0;
            this.field1306 = 0;
            this.field1314 = 0;
            this.field1315 = null;
        } else {
            this.field1313 = var2.field3455;
            this.field1310 = var2.field3456 * 128;
            this.field1306 = var2.field3457;
            this.field1314 = var2.field3419;
            this.field1315 = var2.field3459;
        }
        if (this.field1313 != var1 && this.field1309 != null) {
            Statics.field5.method1674(this.field1309);
            this.field1309 = null;
        }
    }

    @ObfuscatedName("al.i(IIILit;IB)V")
    public static void method239(int arg0, int arg1, int arg2, class256 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1305 = arg0;
        var5.field1316 = arg1 * 128;
        var5.field1307 = arg2 * 128;
        int var6 = arg3.field3426;
        int var7 = arg3.field3425;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3425;
            var7 = arg3.field3426;
        }
        var5.field1308 = (arg1 + var6) * 128;
        var5.field1318 = (arg2 + var7) * 128;
        var5.field1313 = arg3.field3455;
        var5.field1310 = arg3.field3456 * 128;
        var5.field1306 = arg3.field3457;
        var5.field1314 = arg3.field3419;
        var5.field1315 = arg3.field3459;
        if (arg3.field3452 != null) {
            var5.field1311 = arg3;
            var5.method1443();
        }
        field1312.method3290(var5);
        if (var5.field1315 != null) {
            var5.field1304 = var5.field1306 + (int) (Math.random() * (double) (var5.field1314 - var5.field1306));
        }
    }
}
