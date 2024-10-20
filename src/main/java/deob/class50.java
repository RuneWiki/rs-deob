package deob;

@ObfuscatedName("aa")
public class class50 extends class204 {

    @ObfuscatedName("aa.d")
    public static class193 field1072 = new class193(64);

    @ObfuscatedName("aa.s")
    public boolean field1078 = false;

    @ObfuscatedName("ad.n(II)Laa;")
    public static class50 method640(int arg0) {
        class50 var1 = (class50) field1072.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1075.method3010(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method953(new class119(var2));
        }
        field1072.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.d(Ldq;B)V")
    public void method953(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method957(arg0, var2);
        }
    }

    @ObfuscatedName("aa.s(Ldq;II)V")
    public void method957(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1078 = true;
        }
    }
}
