package deob;

@ObfuscatedName("bu")
public class class57 extends class208 {

    @ObfuscatedName("bu.e")
    public static class197 field1224 = new class197(64);

    @ObfuscatedName("bu.g")
    public int field1219 = 0;

    @ObfuscatedName("az.i(II)Lbu;")
    public static class57 method948(int arg0) {
        class57 var1 = (class57) field1224.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3216.method3086(16, arg0);
        class57 var3 = new class57();
        if (var2 != null) {
            var3.method1136(new class123(var2));
        }
        field1224.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bu.h(Ldn;S)V")
    public void method1136(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method1135(arg0, var2);
        }
    }

    @ObfuscatedName("bu.e(Ldn;II)V")
    public void method1135(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1219 = arg0.method2406();
        }
    }
}
