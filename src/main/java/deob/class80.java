package deob;

@ObfuscatedName("cb")
public abstract class class80 extends class195 {

    @ObfuscatedName("cb.ct")
    public int field1388 = 1000;

    @ObfuscatedName("cb.o(IIIIIIIII)V")
    public void method1669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class100 var10 = this.method25();
        if (var10 != null) {
            this.field1388 = var10.field1388;
            var10.method1669(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @ObfuscatedName("cb.d(B)Lcg;")
    public class100 method25() {
        return null;
    }
}
