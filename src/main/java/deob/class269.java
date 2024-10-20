package deob;

@ObfuscatedName("kb")
public class class269 extends class289 {

    @ObfuscatedName("kb.ac")
    public final int field2919;

    @ObfuscatedName("kb.al")
    public final class272 field2913;

    @ObfuscatedName("kb.ak")
    public int field2914;

    @ObfuscatedName("kb.ax")
    public class284 field2915;

    @ObfuscatedName("kb.ao")
    public int field2916;

    @ObfuscatedName("kb.ah")
    public int field2912;

    public class269(class337 arg0, class337 arg1, int arg2, class272 arg3) {
        super(arg0, arg1);
        this.field2919 = arg2;
        this.field2913 = arg3;
        this.method4819();
    }

    @ObfuscatedName("kb.ac(B)V")
    public void method4819() {
        this.field2914 = Statics.method2243(this.field2919).method3696().field2219;
        this.field2915 = this.field2913.method4952(class195.method2991(this.field2914));
        class195 var1 = class195.method2991(this.method4809());
        class544 var2 = var1.method3344(false);
        if (var2 == null) {
            this.field2916 = 0;
            this.field2912 = 0;
        } else {
            this.field2916 = var2.field5237;
            this.field2912 = var2.field5239;
        }
    }

    @ObfuscatedName("kb.al(I)I")
    public int method4809() {
        return this.field2914;
    }

    @ObfuscatedName("kb.ak(B)Lkd;")
    public class284 method4808() {
        return this.field2915;
    }

    @ObfuscatedName("kb.ax(B)I")
    public int method4811() {
        return this.field2916;
    }

    @ObfuscatedName("kb.ao(I)I")
    public int method4807() {
        return this.field2912;
    }
}
