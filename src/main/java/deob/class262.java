package deob;

@ObfuscatedName("kq")
public class class262 extends class274 {

    @ObfuscatedName("kq.at")
    public final int field2950;

    @ObfuscatedName("kq.an")
    public final class269 field2948;

    @ObfuscatedName("kq.av")
    public final int field2949;

    @ObfuscatedName("kq.as")
    public final int field2947;

    public class262(class321 arg0, class321 arg1, int arg2, class269 arg3) {
        super(arg0, arg1);
        this.field2950 = arg2;
        this.field2948 = arg3;
        class187 var5 = class187.method2956(this.method4663());
        class515 var6 = var5.method3277(false);
        if (var6 == null) {
            this.field2949 = 0;
            this.field2947 = 0;
        } else {
            this.field2949 = var6.field5115;
            this.field2947 = var6.field5120;
        }
    }

    @ObfuscatedName("kq.an(I)I")
    public int method4663() {
        return this.field2950;
    }

    @ObfuscatedName("kq.av(I)Lks;")
    public class269 method4655() {
        return this.field2948;
    }

    @ObfuscatedName("kq.as(B)I")
    public int method4665() {
        return this.field2949;
    }

    @ObfuscatedName("kq.ax(B)I")
    public int method4657() {
        return this.field2947;
    }
}
