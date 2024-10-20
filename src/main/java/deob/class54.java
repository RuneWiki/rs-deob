package deob;

@ObfuscatedName("bu")
public class class54 extends class208 {

    @ObfuscatedName("bu.l")
    public static class197 field1161 = new class197(64);

    @ObfuscatedName("bu.c")
    public boolean field1159 = false;

    @ObfuscatedName("fg.e(Lfe;I)V")
    public static void method3331(class171 arg0) {
        Statics.field1160 = arg0;
    }

    @ObfuscatedName("a.l(II)Lbu;")
    public static class54 method53(int arg0) {
        class54 var1 = (class54) field1161.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1160.method3130(15, arg0);
        class54 var3 = new class54();
        if (var2 != null) {
            var3.method1103(new class123(var2));
        }
        field1161.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bu.c(Ldd;B)V")
    public void method1103(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1104(arg0, var2);
        }
    }

    @ObfuscatedName("bu.h(Ldd;IS)V")
    public void method1104(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1159 = true;
        }
    }
}
