package deob;

@ObfuscatedName("id")
public class class251 extends class176 {

    @ObfuscatedName("id.t")
    public static class146 field3298 = new class146(64);

    @ObfuscatedName("id.n")
    public class316 field3300;

    @ObfuscatedName("bm.a(II)Lid;")
    public static class251 method1217(int arg0) {
        class251 var1 = (class251) field3298.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3299.method3873(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4222(new class300(var2));
        }
        var3.method4221();
        field3298.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.t(I)V")
    public void method4221() {
    }

    @ObfuscatedName("id.n(Lkc;I)V")
    public void method4222(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4223(arg0, var2);
        }
    }

    @ObfuscatedName("id.q(Lkc;II)V")
    public void method4223(class300 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3300 = class248.method3205(arg0, this.field3300);
        }
    }

    @ObfuscatedName("id.v(III)I")
    public int method4243(int arg0, int arg1) {
        return class248.method4841(this.field3300, arg0, arg1);
    }

    @ObfuscatedName("id.l(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4240(int arg0, String arg1) {
        class316 var3 = this.field3300;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class177 var5 = (class177) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2084;
            }
        }
        return var4;
    }
}
