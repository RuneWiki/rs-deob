package deob;

@ObfuscatedName("bi")
public class class53 extends class204 {

    @ObfuscatedName("bi.v")
    public static class193 field1164 = new class193(64);

    @ObfuscatedName("bi.l")
    public int field1165 = 0;

    @ObfuscatedName("t.d(Lfn;I)V")
    public static void method186(class167 arg0) {
        Statics.field1168 = arg0;
        Statics.field1167 = Statics.field1168.method3101(16);
    }

    @ObfuscatedName("r.p(IS)Lbi;")
    public static class53 method553(int arg0) {
        class53 var1 = (class53) field1164.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1168.method3134(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1068(new class119(var2));
        }
        field1164.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bi.v(Ldf;I)V")
    public void method1068(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method1076(arg0, var2);
        }
    }

    @ObfuscatedName("bi.l(Ldf;II)V")
    public void method1076(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1165 = arg0.method2359();
        }
    }

    @ObfuscatedName("bi.y(I)V")
    public static void method1079() {
        field1164.method3556();
    }
}
