package deob;

@ObfuscatedName("em")
public class class141 extends class348 {

    @ObfuscatedName("em.e")
    public static class222 field1586 = new class222(64);

    @ObfuscatedName("em.v")
    public boolean field1584 = false;

    @ObfuscatedName("cm.f(II)Lem;")
    public static class141 method1752(int arg0) {
        class141 var1 = (class141) field1586.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1583.method4504(19, arg0);
        class141 var3 = new class141();
        if (var2 != null) {
            var3.method2442(new class384(var2));
        }
        field1586.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("em.e(Lnt;S)V")
    public void method2442(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2445(arg0, var2);
        }
    }

    @ObfuscatedName("em.v(Lnt;II)V")
    public void method2445(class384 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1584 = true;
        }
    }
}
