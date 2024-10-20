package deob;

@ObfuscatedName("ag")
public class class41 extends class172 {

    @ObfuscatedName("ag.x")
    public static class168 field1019 = new class168(64);

    @ObfuscatedName("ag.z")
    public int field1017 = 0;

    @ObfuscatedName("o.j(II)Lag;")
    public static class41 method125(int arg0) {
        class41 var1 = (class41) field1019.method3191((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1016.method2903(16, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method876(new class126(var2));
        }
        field1019.method3181(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.y(Ldr;B)V")
    public void method876(class126 arg0) {
        while (true) {
            int var2 = arg0.method2399();
            if (var2 == 0) {
                return;
            }
            this.method878(arg0, var2);
        }
    }

    @ObfuscatedName("ag.x(Ldr;IS)V")
    public void method878(class126 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1017 = arg0.method2405();
        }
    }
}
