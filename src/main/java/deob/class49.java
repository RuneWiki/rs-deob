package deob;

@ObfuscatedName("ad")
public class class49 extends class204 {

    @ObfuscatedName("ad.s")
    public static class193 field1090 = new class193(64);

    @ObfuscatedName("ad.q")
    public char field1076;

    @ObfuscatedName("ad.g")
    public char field1078;

    @ObfuscatedName("ad.m")
    public String field1079 = "null";

    @ObfuscatedName("ad.t")
    public int field1080;

    @ObfuscatedName("ad.j")
    public int field1081 = 0;

    @ObfuscatedName("ad.n")
    public int[] field1082;

    @ObfuscatedName("ad.l")
    public int[] field1087;

    @ObfuscatedName("ad.i")
    public String[] field1084;

    @ObfuscatedName("he.f(II)Lad;")
    public static class49 method3700(int arg0) {
        class49 var1 = (class49) field1090.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1089.method3038(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method980(new class119(var2));
        }
        field1090.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.s(Ldn;B)V")
    public void method980(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method978(arg0, var2);
        }
    }

    @ObfuscatedName("ad.q(Ldn;IB)V")
    public void method978(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1076 = (char) arg0.method2363();
        } else if (arg1 == 2) {
            this.field1078 = (char) arg0.method2363();
        } else if (arg1 == 3) {
            this.field1079 = arg0.method2365();
        } else if (arg1 == 4) {
            this.field1080 = arg0.method2368();
        } else if (arg1 == 5) {
            this.field1081 = arg0.method2353();
            this.field1082 = new int[this.field1081];
            this.field1084 = new String[this.field1081];
            for (int var3 = 0; var3 < this.field1081; var3++) {
                this.field1082[var3] = arg0.method2368();
                this.field1084[var3] = arg0.method2365();
            }
        } else if (arg1 == 6) {
            this.field1081 = arg0.method2353();
            this.field1082 = new int[this.field1081];
            this.field1087 = new int[this.field1081];
            for (int var4 = 0; var4 < this.field1081; var4++) {
                this.field1082[var4] = arg0.method2368();
                this.field1087[var4] = arg0.method2368();
            }
        }
    }
}
