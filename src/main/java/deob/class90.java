package deob;

@ObfuscatedName("cb")
public abstract class class90 extends class130 {

    @ObfuscatedName("cb.cl")
    public int field1530 = 1000;

    @ObfuscatedName("cb.cl(IIIIIIIII)V")
    public void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class83 var10 = this.method226();
        if (var10 != null) {
            this.field1530 = var10.field1530;
            var10.method1551(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @ObfuscatedName("cb.i(B)Lcs;")
    public class83 method226() {
        return null;
    }
}
