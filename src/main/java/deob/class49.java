package deob;

@ObfuscatedName("as")
public class class49 extends class205 {

    @ObfuscatedName("as.w")
    public static class194 field1080 = new class194(64);

    @ObfuscatedName("as.d")
    public char field1082;

    @ObfuscatedName("as.c")
    public char field1083;

    @ObfuscatedName("as.y")
    public String field1084 = "null";

    @ObfuscatedName("as.k")
    public int field1094;

    @ObfuscatedName("as.r")
    public int field1086 = 0;

    @ObfuscatedName("as.p")
    public int[] field1081;

    @ObfuscatedName("as.q")
    public int[] field1088;

    @ObfuscatedName("as.m")
    public String[] field1087;

    @ObfuscatedName("p.a(II)Las;")
    public static class49 method136(int arg0) {
        class49 var1 = (class49) field1080.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1089.method3188(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method1075(new class120(var2));
        }
        field1080.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.w(Ldx;B)V")
    public void method1075(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1073(arg0, var2);
        }
    }

    @ObfuscatedName("as.d(Ldx;II)V")
    public void method1073(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1082 = (char) arg0.method2462();
        } else if (arg1 == 2) {
            this.field1083 = (char) arg0.method2462();
        } else if (arg1 == 3) {
            this.field1084 = arg0.method2470();
        } else if (arg1 == 4) {
            this.field1094 = arg0.method2467();
        } else if (arg1 == 5) {
            this.field1086 = arg0.method2464();
            this.field1081 = new int[this.field1086];
            this.field1087 = new String[this.field1086];
            for (int var3 = 0; var3 < this.field1086; var3++) {
                this.field1081[var3] = arg0.method2467();
                this.field1087[var3] = arg0.method2470();
            }
        } else if (arg1 == 6) {
            this.field1086 = arg0.method2464();
            this.field1081 = new int[this.field1086];
            this.field1088 = new int[this.field1086];
            for (int var4 = 0; var4 < this.field1086; var4++) {
                this.field1081[var4] = arg0.method2467();
                this.field1088[var4] = arg0.method2467();
            }
        }
    }
}
