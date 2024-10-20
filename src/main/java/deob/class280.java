package deob;

@ObfuscatedName("ji")
public class class280 extends class219 {

    @ObfuscatedName("ji.z")
    public static class213 field3549 = new class213(64);

    @ObfuscatedName("ji.n")
    public class210 field3550;

    @ObfuscatedName("fh.d(Ljk;I)V")
    public static void method2996(class262 arg0) {
        Statics.field3551 = arg0;
    }

    @ObfuscatedName("fw.z(II)Lji;")
    public static class280 method3067(int arg0) {
        class280 var1 = (class280) field3549.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3551.method4273(34, arg0);
        class280 var3 = new class280();
        if (var2 != null) {
            var3.method4639(new class195(var2));
        }
        var3.method4638();
        field3549.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.n(I)V")
    public void method4638() {
    }

    @ObfuscatedName("ji.r(Lgy;I)V")
    public void method4639(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4640(arg0, var2);
        }
    }

    @ObfuscatedName("ji.e(Lgy;II)V")
    public void method4640(class195 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3550 = class277.method3037(arg0, this.field3550);
        }
    }

    @ObfuscatedName("ji.y(IIB)I")
    public int method4647(int arg0, int arg1) {
        return class277.method619(this.field3550, arg0, arg1);
    }

    @ObfuscatedName("ji.k(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4642(int arg0, String arg1) {
        return class277.method3190(this.field3550, arg0, arg1);
    }
}
