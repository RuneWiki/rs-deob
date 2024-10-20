package deob;

@ObfuscatedName("ap")
public class class48 extends class205 {

    @ObfuscatedName("ap.h")
    public static class194 field1048 = new class194(64);

    @ObfuscatedName("ap.m")
    public int field1052;

    @ObfuscatedName("ap.z")
    public int field1050;

    @ObfuscatedName("ap.x")
    public int field1051;

    @ObfuscatedName("ax.j(II)Lap;")
    public static class48 method738(int arg0) {
        class48 var1 = (class48) field1048.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1057.method3011(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method968(new class120(var2));
        }
        field1048.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.h(Ldx;B)V")
    public void method968(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method964(arg0, var2);
        }
    }

    @ObfuscatedName("ap.m(Ldx;IB)V")
    public void method964(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1052 = arg0.method2363();
            this.field1050 = arg0.method2361();
            this.field1051 = arg0.method2361();
        }
    }
}
