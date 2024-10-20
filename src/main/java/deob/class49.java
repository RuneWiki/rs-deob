package deob;

@ObfuscatedName("ax")
public class class49 extends class205 {

    @ObfuscatedName("ax.x")
    public static class194 field1089 = new class194(64);

    @ObfuscatedName("ax.t")
    public char field1090;

    @ObfuscatedName("ax.p")
    public char field1095;

    @ObfuscatedName("ax.e")
    public String field1092 = "null";

    @ObfuscatedName("ax.y")
    public int field1093;

    @ObfuscatedName("ax.m")
    public int field1094 = 0;

    @ObfuscatedName("ax.c")
    public int[] field1096;

    @ObfuscatedName("ax.v")
    public int[] field1091;

    @ObfuscatedName("ax.l")
    public String[] field1097;

    @ObfuscatedName("er.w(II)Lax;")
    public static class49 method2834(int arg0) {
        class49 var1 = (class49) field1089.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1088.method3127(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method1015(new class120(var2));
        }
        field1089.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.x(Lde;B)V")
    public void method1015(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1008(arg0, var2);
        }
    }

    @ObfuscatedName("ax.t(Lde;IB)V")
    public void method1008(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1090 = (char) arg0.method2363();
        } else if (arg1 == 2) {
            this.field1095 = (char) arg0.method2363();
        } else if (arg1 == 3) {
            this.field1092 = arg0.method2540();
        } else if (arg1 == 4) {
            this.field1093 = arg0.method2368();
        } else if (arg1 == 5) {
            this.field1094 = arg0.method2365();
            this.field1096 = new int[this.field1094];
            this.field1097 = new String[this.field1094];
            for (int var3 = 0; var3 < this.field1094; var3++) {
                this.field1096[var3] = arg0.method2368();
                this.field1097[var3] = arg0.method2540();
            }
        } else if (arg1 == 6) {
            this.field1094 = arg0.method2365();
            this.field1096 = new int[this.field1094];
            this.field1091 = new int[this.field1094];
            for (int var4 = 0; var4 < this.field1094; var4++) {
                this.field1096[var4] = arg0.method2368();
                this.field1091[var4] = arg0.method2368();
            }
        }
    }
}
