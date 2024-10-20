package deob;

@ObfuscatedName("cu")
public final class class80 extends class213 {

    @ObfuscatedName("cu.b")
    public static class214 field1211 = new class214();

    @ObfuscatedName("cu.q")
    public int field1206;

    @ObfuscatedName("cu.o")
    public int field1203;

    @ObfuscatedName("cu.p")
    public int field1204;

    @ObfuscatedName("cu.a")
    public int field1205;

    @ObfuscatedName("cu.h")
    public int field1209;

    @ObfuscatedName("cu.l")
    public int field1207;

    @ObfuscatedName("cu.y")
    public int field1208;

    @ObfuscatedName("cu.g")
    public class115 field1202;

    @ObfuscatedName("cu.c")
    public int field1210;

    @ObfuscatedName("cu.u")
    public int field1213;

    @ObfuscatedName("cu.r")
    public class276 field1215;

    @ObfuscatedName("cu.d")
    public int[] field1212;

    @ObfuscatedName("cu.v")
    public int field1217;

    @ObfuscatedName("cu.s")
    public class115 field1214;

    @ObfuscatedName("cu.q(B)V")
    public void method1629() {
        int var1 = this.field1208;
        class276 var2 = this.field1215.method4563();
        if (var2 == null) {
            this.field1208 = -1;
            this.field1207 = 0;
            this.field1210 = 0;
            this.field1213 = 0;
            this.field1212 = null;
        } else {
            this.field1208 = var2.field3562;
            this.field1207 = var2.field3540 * 128;
            this.field1210 = var2.field3564;
            this.field1213 = var2.field3565;
            this.field1212 = var2.field3566;
        }
        if (this.field1208 != var1 && this.field1202 != null) {
            Statics.field584.method1923(this.field1202);
            this.field1202 = null;
        }
    }
}
