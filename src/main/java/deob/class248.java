package deob;

@ObfuscatedName("ju")
public abstract class class248 extends class504 {

    @ObfuscatedName("ju.ev")
    public int field2736 = 1000;

    @ObfuscatedName("ju.eo(IIIIIIIIIJIIZ)V")
    public void method4690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9, int arg10, int arg11, boolean arg12) {
        class256 var15 = this.method2182();
        if (var15 == null) {
            return;
        }
        this.field2736 = var15.field2736;
        int var16 = class240.field2590[arg1];
        int var17 = class240.field2588[arg1];
        int var18 = class240.field2590[arg2];
        int var19 = class240.field2588[arg2];
        var15.method4916(arg0, var16, var17, var18, var19, arg3 - arg6, arg4 - arg7, arg5 - arg8, arg9);
    }

    @ObfuscatedName("ju.jh(ILqf;IIIJ)V")
    public void method4737(int arg0, class428 arg1, int arg2, int arg3, int arg4, long arg5) {
        class256 var8 = this.method2182();
        if (var8 != null) {
            this.field2736 = var8.field2736;
            var8.method4737(arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    @ObfuscatedName("ju.ad(B)Ljm;")
    public class256 method2182() {
        return null;
    }
}
