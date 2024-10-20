package deob;

@ObfuscatedName("gz")
public class class171 extends class481 {

    @ObfuscatedName("gz.ah")
    public static class299 field1798 = new class299(64);

    @ObfuscatedName("gz.ar")
    public int field1800 = 0;

    @ObfuscatedName("lo.at(II)Lgz;")
    public static class171 method5334(int arg0) {
        class171 var1 = (class171) field1798.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1801.method6284(5, arg0);
        class171 var3 = new class171();
        if (var2 != null) {
            var3.method3211(new class527(var2));
        }
        field1798.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.ah(Luj;B)V")
    public void method3211(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3209(arg0, var2);
        }
    }

    @ObfuscatedName("gz.ar(Luj;II)V")
    public void method3209(class527 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1800 = arg0.method8412();
        }
    }
}
