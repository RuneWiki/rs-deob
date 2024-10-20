package deob;

@ObfuscatedName("d")
public final class class25 extends class212 {

    @ObfuscatedName("d.e")
    public static class203 field629 = new class203();

    @ObfuscatedName("d.l")
    public int field628;

    @ObfuscatedName("d.c")
    public int field641;

    @ObfuscatedName("d.h")
    public int field630;

    @ObfuscatedName("d.r")
    public class43 field633;

    @ObfuscatedName("d.a")
    public int field631;

    @ObfuscatedName("d.b")
    public int field632;

    @ObfuscatedName("d.u")
    public int field627;

    @ObfuscatedName("d.o")
    public int field634;

    @ObfuscatedName("d.p")
    public class68 field635;

    @ObfuscatedName("d.i")
    public int field636;

    @ObfuscatedName("d.q")
    public int field637;

    @ObfuscatedName("d.g")
    public int[] field638;

    @ObfuscatedName("d.j")
    public int field639;

    @ObfuscatedName("d.w")
    public class68 field640;

    @ObfuscatedName("d.e(B)V")
    public void method573() {
        int var1 = this.field634;
        class43 var2 = this.field633.method815();
        if (var2 == null) {
            this.field634 = -1;
            this.field627 = 0;
            this.field636 = 0;
            this.field637 = 0;
            this.field638 = null;
        } else {
            this.field634 = var2.field1004;
            this.field627 = var2.field1005 * 128;
            this.field636 = var2.field1006;
            this.field637 = var2.field976;
            this.field638 = var2.field1008;
        }
        if (this.field634 != var1 && this.field635 != null) {
            Statics.field743.method1222(this.field635);
            this.field635 = null;
        }
    }

    @ObfuscatedName("ar.l(IIILax;II)V")
    public static void method927(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field628 = arg0;
        var5.field641 = arg1 * 128;
        var5.field630 = arg2 * 128;
        int var6 = arg3.field960;
        int var7 = arg3.field1001;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1001;
            var7 = arg3.field960;
        }
        var5.field631 = (arg1 + var6) * 128;
        var5.field632 = (arg2 + var7) * 128;
        var5.field634 = arg3.field1004;
        var5.field627 = arg3.field1005 * 128;
        var5.field636 = arg3.field1006;
        var5.field637 = arg3.field976;
        var5.field638 = arg3.field1008;
        if (arg3.field970 != null) {
            var5.field633 = arg3;
            var5.method573();
        }
        field629.method3650(var5);
        if (var5.field638 != null) {
            var5.field639 = var5.field636 + (int) (Math.random() * (double) (var5.field637 - var5.field636));
        }
    }
}
