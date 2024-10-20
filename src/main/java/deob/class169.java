package deob;

@ObfuscatedName("av")
public class class169 extends class7 {

    @ObfuscatedName("av.b")
    public static class75 field2567 = new class75(64);

    @ObfuscatedName("av.i")
    public int field2570 = 0;

    @ObfuscatedName("av.b(Ldv;II)V")
    public void method3040(class28 arg0, int arg1) {
        if (arg1 == 5) {
            this.field2570 = arg0.method349();
        }
    }

    @ObfuscatedName("av.c(Ldv;I)V")
    public void method3041(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3040(arg0, var2);
        }
    }

    @ObfuscatedName("au.v(II)Lav;")
    public static class169 method3058(int arg0) {
        class169 var1 = (class169) field2567.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2568.method1298(16, arg0);
        class169 var3 = new class169();
        if (var2 != null) {
            var3.method3041(new class28(var2));
        }
        field2567.method1184(var3, (long) arg0);
        return var3;
    }
}
