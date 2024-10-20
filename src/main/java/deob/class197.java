package deob;

@ObfuscatedName("hw")
public class class197 extends class500 {

    @ObfuscatedName("hw.aj")
    public static class312 field2005 = new class312(64);

    @ObfuscatedName("hw.az")
    public int field2006 = 0;

    @ObfuscatedName("hq.ak(Lor;B)V")
    public static void method3481(class387 arg0) {
        Statics.field2009 = arg0;
        Statics.field2004 = Statics.field2009.method6591(16);
    }

    @ObfuscatedName("je.al(II)Lhw;")
    public static class197 method4446(int arg0) {
        class197 var1 = (class197) field2005.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2009.method6573(16, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3503(new class546(var2));
        }
        field2005.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.aj(Lua;I)V")
    public void method3503(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3504(arg0, var2);
        }
    }

    @ObfuscatedName("hw.az(Lua;II)V")
    public void method3504(class546 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2006 = arg0.method8798();
        }
    }
}
