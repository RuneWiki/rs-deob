package deob;

@ObfuscatedName("kt")
public abstract class class286 extends class501 {

    @ObfuscatedName("kt.ej")
    public int field3016 = 1000;

    @ObfuscatedName("kt.eh(IIIIIIIIIJ)V")
    public void method4971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, long arg9) {
        class294 var12 = this.method2050();
        if (var12 == null) {
            return;
        }
        this.field3016 = var12.field3016;
        int var13 = class278.field2878[arg1];
        int var14 = class278.field2879[arg1];
        int var15 = class278.field2878[arg2];
        int var16 = class278.field2879[arg2];
        var12.method5269(arg0, var13, var14, var15, var16, arg3 - arg6, arg4 - arg7, arg5 - arg8, arg9);
    }

    @ObfuscatedName("kt.js(ILqg;IIIJ)V")
    public void method5176(int arg0, class425 arg1, int arg2, int arg3, int arg4, long arg5) {
        class294 var8 = this.method2050();
        if (var8 != null) {
            this.field3016 = var8.field3016;
            var8.method5176(arg0, arg1, arg2, arg3, arg4, arg5);
        }
    }

    @ObfuscatedName("kt.ah(I)Llv;")
    public class294 method2050() {
        return null;
    }
}
