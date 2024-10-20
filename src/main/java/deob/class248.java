package deob;

@ObfuscatedName("jv")
public abstract class class248 extends class511 {

    @ObfuscatedName("jv.ez")
    public int field2745 = 1000;

    @ObfuscatedName("jv.el(IIIIIIIIIJIIZ)V")
    public void method4784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9, int arg10, int arg11, boolean arg12) {
        class256 var15 = this.method2245();
        if (var15 == null) {
            return;
        }
        this.field2745 = var15.field2745;
        int var16 = class240.field2591[arg1];
        int var17 = class240.field2592[arg1];
        int var18 = class240.field2591[arg2];
        int var19 = class240.field2592[arg2];
        var15.method5031(arg0, var16, var17, var18, var19, arg3 - arg6, arg4 - arg7, arg5 - arg8, arg9);
    }

    @ObfuscatedName("jv.jp(ILqs;IIIJ)V")
    public void method4934(int arg0, class429 arg1, int arg2, int arg3, int arg4, long arg5) {
        class256 var8 = this.method2245();
        if (var8 != null) {
            this.field2745 = var8.field2745;
            var8.method4934(arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    @ObfuscatedName("jv.au(I)Ljy;")
    public class256 method2245() {
        return null;
    }
}
