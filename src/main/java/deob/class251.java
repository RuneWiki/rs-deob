package deob;

@ObfuscatedName("in")
public class class251 extends class176 {

    @ObfuscatedName("in.w")
    public static class146 field3312 = new class146(64);

    @ObfuscatedName("in.e")
    public class317 field3311;

    @ObfuscatedName("ch.q(Lhp;B)V")
    public static void method1863(class234 arg0) {
        Statics.field3310 = arg0;
    }

    @ObfuscatedName("ie.w(II)Lin;")
    public static class251 method4127(int arg0) {
        class251 var1 = (class251) field3312.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3310.method3775(34, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4133(new class301(var2));
        }
        var3.method4129();
        field3312.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.e(S)V")
    public void method4129() {
    }

    @ObfuscatedName("in.p(Lkf;I)V")
    public void method4133(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4130(arg0, var2);
        }
    }

    @ObfuscatedName("in.k(Lkf;II)V")
    public void method4130(class301 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3311 = class248.method347(arg0, this.field3311);
        }
    }

    @ObfuscatedName("in.l(III)I")
    public int method4131(int arg0, int arg1) {
        class317 var3 = this.field3311;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class180 var5 = (class180) var3.method5451((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2112;
            }
        }
        return var4;
    }

    @ObfuscatedName("in.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4132(int arg0, String arg1) {
        return class248.method40(this.field3311, arg0, arg1);
    }
}
