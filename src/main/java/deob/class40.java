package deob;

@ObfuscatedName("av")
public class class40 extends class172 {

    @ObfuscatedName("av.h")
    public static class168 field1028 = new class168(64);

    @ObfuscatedName("av.c")
    public int field1034 = 0;

    @ObfuscatedName("av.z(Ldq;I)V")
    public void method881(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method874(arg0, var2);
        }
    }

    @ObfuscatedName("av.h(Ldq;II)V")
    public void method874(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1034 = arg0.method2627();
        }
    }
}
