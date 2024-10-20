package deob;

@ObfuscatedName("ft")
public class class165 extends class387 {

    @ObfuscatedName("ft.l")
    public static class249 field1787 = new class249(64);

    @ObfuscatedName("ft.s")
    public boolean field1788 = false;

    @ObfuscatedName("jq.c(Lkq;B)V")
    public static void method4793(class307 arg0) {
        Statics.field1789 = arg0;
    }

    @ObfuscatedName("fs.l(IB)Lft;")
    public static class165 method2934(int arg0) {
        class165 var1 = (class165) field1787.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1789.method5066(19, arg0);
        class165 var3 = new class165();
        if (var2 != null) {
            var3.method2892(new class421(var2));
        }
        field1787.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ft.s(Lpi;I)V")
    public void method2892(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2885(arg0, var2);
        }
    }

    @ObfuscatedName("ft.e(Lpi;IB)V")
    public void method2885(class421 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1788 = true;
        }
    }
}
