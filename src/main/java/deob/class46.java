package deob;

@ObfuscatedName("ap")
public class class46 extends class204 {

    @ObfuscatedName("ap.s")
    public static class193 field1045 = new class193(64);

    @ObfuscatedName("ap.q")
    public boolean field1046 = false;

    @ObfuscatedName("fw.f(II)Lap;")
    public static class46 method3261(int arg0) {
        class46 var1 = (class46) field1045.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1047.method3038(19, arg0);
        class46 var3 = new class46();
        if (var2 != null) {
            var3.method928(new class119(var2));
        }
        field1045.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.s(Ldn;B)V")
    public void method928(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method933(arg0, var2);
        }
    }

    @ObfuscatedName("ap.q(Ldn;II)V")
    public void method933(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1046 = true;
        }
    }
}
