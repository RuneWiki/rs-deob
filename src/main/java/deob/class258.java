package deob;

@ObfuscatedName("ii")
public class class258 extends class207 {

    @ObfuscatedName("ii.w")
    public static class201 field3261 = new class201(64);

    @ObfuscatedName("ii.s")
    public boolean field3262 = false;

    @ObfuscatedName("fv.z(II)Lii;")
    public static class258 method3188(int arg0) {
        class258 var1 = (class258) field3261.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3265.method4247(15, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4461(new class183(var2));
        }
        field3261.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.w(Lgk;B)V")
    public void method4461(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4463(arg0, var2);
        }
    }

    @ObfuscatedName("ii.s(Lgk;IS)V")
    public void method4463(class183 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3262 = true;
        }
    }
}
