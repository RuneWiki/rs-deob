package deob;

@ObfuscatedName("cs")
public abstract class class86 extends class205 {

    @ObfuscatedName("cs.cv")
    public int field1444 = 1000;

    @ObfuscatedName("cs.au(IIIIIIIII)V")
    public void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class106 var10 = this.method12();
        if (var10 != null) {
            this.field1444 = var10.field1444;
            var10.method1782(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @ObfuscatedName("cs.m(I)Ldf;")
    public class106 method12() {
        return null;
    }
}
