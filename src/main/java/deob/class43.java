package deob;

@ObfuscatedName("aa")
public class class43 extends class174 {

    @ObfuscatedName("aa.u")
    public static class167 field1026 = new class167(64);

    @ObfuscatedName("aa.t")
    public int field1027 = 0;

    @ObfuscatedName("i.z(IB)Laa;")
    public static class43 method178(int arg0) {
        class43 var1 = (class43) field1026.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1739.method2768(16, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method900(new class104(var2));
        }
        field1026.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.n(Lcj;B)V")
    public void method900(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method901(arg0, var2);
        }
    }

    @ObfuscatedName("aa.u(Lcj;II)V")
    public void method901(class104 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1027 = arg0.method2206();
        }
    }

    @ObfuscatedName("ak.t(I)V")
    public static void method594() {
        field1026.method3193();
    }
}
