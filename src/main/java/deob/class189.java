package deob;

@ObfuscatedName("hs")
public abstract class class189 extends class502 {

    @ObfuscatedName("hs.eo")
    public int field2086 = 1000;

    @ObfuscatedName("hs.ej(IIIIIIIIIJIIZ)V")
    public void method3665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9, int arg10, int arg11, boolean arg12) {
        class197 var15 = this.method2088();
        if (var15 == null) {
            return;
        }
        this.field2086 = var15.field2086;
        int var16 = class181.field1941[arg1];
        int var17 = class181.field1942[arg1];
        int var18 = class181.field1941[arg2];
        int var19 = class181.field1942[arg2];
        var15.method3979(arg0, var16, var17, var18, var19, arg3 - arg6, arg4 - arg7, arg5 - arg8, arg9);
    }

    @ObfuscatedName("hs.ja(ILqy;IIIJ)V")
    public void method3830(int arg0, class426 arg1, int arg2, int arg3, int arg4, long arg5) {
        class197 var8 = this.method2088();
        if (var8 != null) {
            this.field2086 = var8.field2086;
            var8.method3830(arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    @ObfuscatedName("hs.ae(I)Lhr;")
    public class197 method2088() {
        return null;
    }
}
