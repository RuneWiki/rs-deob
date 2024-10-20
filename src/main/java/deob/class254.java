package deob;

@ObfuscatedName("ir")
public class class254 extends class185 {

    @ObfuscatedName("ir.v")
    public static class155 field3266 = new class155(64);

    @ObfuscatedName("ir.x")
    public boolean field3269 = false;

    @ObfuscatedName("et.h(Lib;I)V")
    public static void method3100(class245 arg0) {
        Statics.field3267 = arg0;
    }

    @ObfuscatedName("dk.v(II)Lir;")
    public static class254 method2613(int arg0) {
        class254 var1 = (class254) field3266.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3267.method3834(19, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4047(new class311(var2));
        }
        field3266.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.x(Lkj;S)V")
    public void method4047(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4051(arg0, var2);
        }
    }

    @ObfuscatedName("ir.w(Lkj;IB)V")
    public void method4051(class311 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3269 = true;
        }
    }
}
