package deob;

@ObfuscatedName("cm")
public abstract class class80 extends class195 {

    @ObfuscatedName("cm.cb")
    public int field1384 = 1000;

    @ObfuscatedName("cm.ax(IIIIIIIII)V")
    public void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class100 var10 = this.method16();
        if (var10 != null) {
            this.field1384 = var10.field1384;
            var10.method1582(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @ObfuscatedName("cm.e(I)Lcx;")
    public class100 method16() {
        return null;
    }
}
