package deob;

@ObfuscatedName("kf")
public class class277 extends class289 {

    @ObfuscatedName("kf.ac")
    public final int field2996;

    @ObfuscatedName("kf.al")
    public final class284 field2995;

    @ObfuscatedName("kf.ak")
    public final int field2997;

    @ObfuscatedName("kf.ax")
    public final int field2998;

    public class277(class337 arg0, class337 arg1, int arg2, class284 arg3) {
        super(arg0, arg1);
        this.field2996 = arg2;
        this.field2995 = arg3;
        class195 var5 = class195.method2991(this.method4809());
        class544 var6 = var5.method3344(false);
        if (var6 == null) {
            this.field2997 = 0;
            this.field2998 = 0;
        } else {
            this.field2997 = var6.field5237;
            this.field2998 = var6.field5239;
        }
    }

    @ObfuscatedName("kf.al(I)I")
    public int method4809() {
        return this.field2996;
    }

    @ObfuscatedName("kf.ak(B)Lkd;")
    public class284 method4808() {
        return this.field2995;
    }

    @ObfuscatedName("kf.ax(B)I")
    public int method4811() {
        return this.field2997;
    }

    @ObfuscatedName("kf.ao(I)I")
    public int method4807() {
        return this.field2998;
    }
}
