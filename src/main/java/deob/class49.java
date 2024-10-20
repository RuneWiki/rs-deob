package deob;

@ObfuscatedName("ad")
public class class49 extends class204 {

    @ObfuscatedName("ad.l")
    public static class193 field1041 = new class193(64);

    @ObfuscatedName("ad.y")
    public char field1054;

    @ObfuscatedName("ad.u")
    public char field1043;

    @ObfuscatedName("ad.k")
    public String field1042 = "null";

    @ObfuscatedName("ad.j")
    public int field1045;

    @ObfuscatedName("ad.i")
    public int field1046 = 0;

    @ObfuscatedName("ad.x")
    public int[] field1047;

    @ObfuscatedName("ad.g")
    public int[] field1040;

    @ObfuscatedName("ad.e")
    public String[] field1049;

    @ObfuscatedName("d.m(II)Lad;")
    public static class49 method583(int arg0) {
        class49 var1 = (class49) field1041.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1055.method3080(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method1007(new class119(var2));
        }
        field1041.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.l(Ldx;I)V")
    public void method1007(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method1006(arg0, var2);
        }
    }

    @ObfuscatedName("ad.y(Ldx;II)V")
    public void method1006(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1054 = (char) arg0.method2562();
        } else if (arg1 == 2) {
            this.field1043 = (char) arg0.method2562();
        } else if (arg1 == 3) {
            this.field1042 = arg0.method2389();
        } else if (arg1 == 4) {
            this.field1045 = arg0.method2386();
        } else if (arg1 == 5) {
            this.field1046 = arg0.method2541();
            this.field1047 = new int[this.field1046];
            this.field1049 = new String[this.field1046];
            for (int var3 = 0; var3 < this.field1046; var3++) {
                this.field1047[var3] = arg0.method2386();
                this.field1049[var3] = arg0.method2389();
            }
        } else if (arg1 == 6) {
            this.field1046 = arg0.method2541();
            this.field1047 = new int[this.field1046];
            this.field1040 = new int[this.field1046];
            for (int var4 = 0; var4 < this.field1046; var4++) {
                this.field1047[var4] = arg0.method2386();
                this.field1040[var4] = arg0.method2386();
            }
        }
    }
}
