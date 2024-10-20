package deob;

@ObfuscatedName("cw")
public final class class83 extends class193 {

    @ObfuscatedName("cw.i")
    public static class194 field1349 = new class194();

    @ObfuscatedName("cw.c")
    public int field1346;

    @ObfuscatedName("cw.e")
    public int field1350;

    @ObfuscatedName("cw.v")
    public int field1343;

    @ObfuscatedName("cw.b")
    public int field1345;

    @ObfuscatedName("cw.y")
    public int field1352;

    @ObfuscatedName("cw.h")
    public int field1347;

    @ObfuscatedName("cw.x")
    public int field1348;

    @ObfuscatedName("cw.f")
    public class118 field1342;

    @ObfuscatedName("cw.n")
    public int field1341;

    @ObfuscatedName("cw.a")
    public int field1351;

    @ObfuscatedName("cw.o")
    public int[] field1344;

    @ObfuscatedName("cw.z")
    public int field1353;

    @ObfuscatedName("cw.q")
    public class118 field1354;

    @ObfuscatedName("cw.j")
    public class256 field1355;

    @ObfuscatedName("cw.i(I)V")
    public void method1467() {
        int var1 = this.field1348;
        class256 var2 = this.field1355.method4204();
        if (var2 == null) {
            this.field1348 = -1;
            this.field1347 = 0;
            this.field1341 = 0;
            this.field1351 = 0;
            this.field1344 = null;
        } else {
            this.field1348 = var2.field3477;
            this.field1347 = var2.field3478 * 128;
            this.field1341 = var2.field3479;
            this.field1351 = var2.field3460;
            this.field1344 = var2.field3481;
        }
        if (this.field1348 != var1 && this.field1342 != null) {
            Statics.field2289.method1727(this.field1342);
            this.field1342 = null;
        }
    }
}
