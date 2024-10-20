package deob;

@ObfuscatedName("bp")
public abstract class class78 extends class180 {

    @ObfuscatedName("bp.cg")
    public int field1343 = 1000;

    @ObfuscatedName("bp.j(IIIIIIIII)V")
    public void method1603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class98 var10 = this.method12();
        if (var10 != null) {
            this.field1343 = var10.field1343;
            var10.method1603(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @ObfuscatedName("bp.p(B)Lcs;")
    public class98 method12() {
        return null;
    }
}
