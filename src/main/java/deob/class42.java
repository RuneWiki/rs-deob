package deob;

@ObfuscatedName("ay")
public class class42 extends class181 {

    @ObfuscatedName("ay.z")
    public static class171 field976 = new class171(64);

    @ObfuscatedName("ay.y")
    public int field974;

    @ObfuscatedName("ay.h")
    public int field983;

    @ObfuscatedName("ay.r")
    public int field977;

    @ObfuscatedName("dm.j(IB)Lay;")
    public static class42 method2467(int arg0) {
        class42 var1 = (class42) field976.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field978.method2739(14, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method791(new class107(var2));
        }
        field976.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.z(Lde;I)V")
    public void method791(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method802(arg0, var2);
        }
    }

    @ObfuscatedName("ay.y(Lde;II)V")
    public void method802(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field974 = arg0.method2132();
            this.field983 = arg0.method2130();
            this.field977 = arg0.method2130();
        }
    }
}
