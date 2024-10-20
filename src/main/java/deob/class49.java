package deob;

@ObfuscatedName("ac")
public class class49 extends class205 {

    @ObfuscatedName("ac.j")
    public static class194 field1074 = new class194(64);

    @ObfuscatedName("ac.p")
    public char field1076;

    @ObfuscatedName("ac.x")
    public char field1077;

    @ObfuscatedName("ac.d")
    public String field1088 = "null";

    @ObfuscatedName("ac.u")
    public int field1079;

    @ObfuscatedName("ac.o")
    public int field1080 = 0;

    @ObfuscatedName("ac.b")
    public int[] field1081;

    @ObfuscatedName("ac.k")
    public int[] field1082;

    @ObfuscatedName("ac.c")
    public String[] field1078;

    @ObfuscatedName("cw.s(II)Lac;")
    public static class49 method1762(int arg0) {
        class49 var1 = (class49) field1074.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1085.method3014(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method943(new class120(var2));
        }
        field1074.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.j(Lds;I)V")
    public void method943(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method944(arg0, var2);
        }
    }

    @ObfuscatedName("ac.p(Lds;IS)V")
    public void method944(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1076 = (char) arg0.method2338();
        } else if (arg1 == 2) {
            this.field1077 = (char) arg0.method2338();
        } else if (arg1 == 3) {
            this.field1088 = arg0.method2346();
        } else if (arg1 == 4) {
            this.field1079 = arg0.method2343();
        } else if (arg1 == 5) {
            this.field1080 = arg0.method2430();
            this.field1081 = new int[this.field1080];
            this.field1078 = new String[this.field1080];
            for (int var3 = 0; var3 < this.field1080; var3++) {
                this.field1081[var3] = arg0.method2343();
                this.field1078[var3] = arg0.method2346();
            }
        } else if (arg1 == 6) {
            this.field1080 = arg0.method2430();
            this.field1081 = new int[this.field1080];
            this.field1082 = new int[this.field1080];
            for (int var4 = 0; var4 < this.field1080; var4++) {
                this.field1081[var4] = arg0.method2343();
                this.field1082[var4] = arg0.method2343();
            }
        }
    }
}
