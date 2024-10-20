package deob;

@ObfuscatedName("ju")
public abstract class class256 extends class500 {

    @ObfuscatedName("ju.ev")
    public int field2801 = 1000;

    @ObfuscatedName("ju.ef(IIIIIIIIIJ)V")
    public void method4510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9) {
        class264 var12 = this.method2007();
        if (var12 == null) {
            return;
        }
        this.field2801 = var12.field2801;
        int var13 = class248.field2665[arg1];
        int var14 = class248.field2669[arg1];
        int var15 = class248.field2665[arg2];
        int var16 = class248.field2669[arg2];
        var12.method4826(arg0, var13, var14, var15, var16, arg3 - arg6, arg4 - arg7, arg5 - arg8, arg9);
    }

    @ObfuscatedName("ju.jq(ILql;IIIJ)V")
    public void method4737(int arg0, class424 arg1, int arg2, int arg3, int arg4, long arg5) {
        class264 var8 = this.method2007();
        if (var8 != null) {
            this.field2801 = var8.field2801;
            var8.method4737(arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    @ObfuscatedName("ju.ah(I)Lkb;")
    public class264 method2007() {
        return null;
    }
}
