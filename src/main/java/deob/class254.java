package deob;

@ObfuscatedName("iu")
public class class254 extends class207 {

    @ObfuscatedName("iu.w")
    public static class201 field3229 = new class201(64);

    @ObfuscatedName("iu.s")
    public int field3228 = 0;

    @ObfuscatedName("fu.z(Lir;B)V")
    public static void method3071(class248 arg0) {
        Statics.field3227 = arg0;
    }

    @ObfuscatedName("ew.w(II)Liu;")
    public static class254 method2861(int arg0) {
        class254 var1 = (class254) field3229.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3227.method4247(5, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4408(new class183(var2));
        }
        field3229.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.s(Lgk;I)V")
    public void method4408(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4414(arg0, var2);
        }
    }

    @ObfuscatedName("iu.l(Lgk;II)V")
    public void method4414(class183 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3228 = arg0.method3253();
        }
    }
}
