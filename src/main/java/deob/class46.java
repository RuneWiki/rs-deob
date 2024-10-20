package deob;

@ObfuscatedName("av")
public class class46 extends class204 {

    @ObfuscatedName("av.d")
    public static class193 field1041 = new class193(64);

    @ObfuscatedName("av.g")
    public boolean field1042 = false;

    @ObfuscatedName("w.y(II)Lav;")
    public static class46 method41(int arg0) {
        class46 var1 = (class46) field1041.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1043.method3045(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method927(new class119(var2));
        }
        field1041.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.d(Ldd;I)V")
    public void method927(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method922(arg0, var2);
        }
    }

    @ObfuscatedName("av.g(Ldd;II)V")
    public void method922(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1042 = true;
        }
    }
}
