package deob;

@ObfuscatedName("cg")
public final class class83 extends class193 {

    @ObfuscatedName("cg.n")
    public static class194 field1326 = new class194();

    @ObfuscatedName("cg.p")
    public int field1324;

    @ObfuscatedName("cg.i")
    public int field1323;

    @ObfuscatedName("cg.j")
    public int field1327;

    @ObfuscatedName("cg.f")
    public int field1328;

    @ObfuscatedName("cg.m")
    public int field1335;

    @ObfuscatedName("cg.c")
    public int field1329;

    @ObfuscatedName("cg.z")
    public int field1330;

    @ObfuscatedName("cg.h")
    public class118 field1331;

    @ObfuscatedName("cg.g")
    public int field1332;

    @ObfuscatedName("cg.e")
    public int field1333;

    @ObfuscatedName("cg.o")
    public int[] field1334;

    @ObfuscatedName("cg.x")
    public int field1325;

    @ObfuscatedName("cg.a")
    public class118 field1336;

    @ObfuscatedName("cg.y")
    public class256 field1337;

    @ObfuscatedName("x.n(I)V")
    public static void method70() {
        for (class83 var0 = (class83) field1326.method3372(); var0 != null; var0 = (class83) field1326.method3358()) {
            if (var0.field1331 != null) {
                Statics.field614.method1732(var0.field1331);
                var0.field1331 = null;
            }
            if (var0.field1336 != null) {
                Statics.field614.method1732(var0.field1336);
                var0.field1336 = null;
            }
        }
        field1326.method3351();
    }

    @ObfuscatedName("cg.p(I)V")
    public void method1465() {
        int var1 = this.field1330;
        class256 var2 = this.field1337.method4238();
        if (var2 == null) {
            this.field1330 = -1;
            this.field1329 = 0;
            this.field1332 = 0;
            this.field1333 = 0;
            this.field1334 = null;
        } else {
            this.field1330 = var2.field3487;
            this.field1329 = var2.field3488 * 128;
            this.field1332 = var2.field3489;
            this.field1333 = var2.field3490;
            this.field1334 = var2.field3480;
        }
        if (this.field1330 != var1 && this.field1331 != null) {
            Statics.field614.method1732(this.field1331);
            this.field1331 = null;
        }
    }
}
