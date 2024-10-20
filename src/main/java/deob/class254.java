package deob;

@ObfuscatedName("jq")
public class class254 extends class274 {

    @ObfuscatedName("jq.at")
    public final int field2871;

    @ObfuscatedName("jq.an")
    public final class257 field2874;

    @ObfuscatedName("jq.av")
    public int field2870;

    @ObfuscatedName("jq.as")
    public class269 field2873;

    @ObfuscatedName("jq.ax")
    public int field2872;

    @ObfuscatedName("jq.ap")
    public int field2875;

    public class254(class321 arg0, class321 arg1, int arg2, class257 arg3) {
        super(arg0, arg1);
        this.field2871 = arg2;
        this.field2874 = arg3;
        this.method4653();
    }

    @ObfuscatedName("jq.at(I)V")
    public void method4653() {
        this.field2870 = class205.method3219(this.field2871).method3578().field2171;
        this.field2873 = this.field2874.method4807(class187.method2956(this.field2870));
        class187 var1 = class187.method2956(this.method4663());
        class515 var2 = var1.method3277(false);
        if (var2 == null) {
            this.field2872 = 0;
            this.field2875 = 0;
        } else {
            this.field2872 = var2.field5115;
            this.field2875 = var2.field5120;
        }
    }

    @ObfuscatedName("jq.an(I)I")
    public int method4663() {
        return this.field2870;
    }

    @ObfuscatedName("jq.av(I)Lks;")
    public class269 method4655() {
        return this.field2873;
    }

    @ObfuscatedName("jq.as(B)I")
    public int method4665() {
        return this.field2872;
    }

    @ObfuscatedName("jq.ax(B)I")
    public int method4657() {
        return this.field2875;
    }
}
