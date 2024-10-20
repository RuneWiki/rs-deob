package deob;

@ObfuscatedName("as")
public class class49 extends class204 {

    @ObfuscatedName("as.v")
    public static class193 field1086 = new class193(64);

    @ObfuscatedName("as.f")
    public char field1095;

    @ObfuscatedName("as.h")
    public char field1088;

    @ObfuscatedName("as.a")
    public String field1089 = "null";

    @ObfuscatedName("as.s")
    public int field1090;

    @ObfuscatedName("as.p")
    public int field1091 = 0;

    @ObfuscatedName("as.r")
    public int[] field1092;

    @ObfuscatedName("as.k")
    public int[] field1085;

    @ObfuscatedName("as.d")
    public String[] field1097;

    @ObfuscatedName("ag.i(Lfn;I)V")
    public static void method832(class167 arg0) {
        Statics.field1087 = arg0;
    }

    @ObfuscatedName("eb.v(II)Las;")
    public static class49 method2641(int arg0) {
        class49 var1 = (class49) field1086.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1087.method3080(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method933(new class119(var2));
        }
        field1086.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.f(Ldj;B)V")
    public void method933(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method934(arg0, var2);
        }
    }

    @ObfuscatedName("as.h(Ldj;II)V")
    public void method934(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1095 = (char) arg0.method2310();
        } else if (arg1 == 2) {
            this.field1088 = (char) arg0.method2310();
        } else if (arg1 == 3) {
            this.field1089 = arg0.method2318();
        } else if (arg1 == 4) {
            this.field1090 = arg0.method2315();
        } else if (arg1 == 5) {
            this.field1091 = arg0.method2312();
            this.field1092 = new int[this.field1091];
            this.field1097 = new String[this.field1091];
            for (int var3 = 0; var3 < this.field1091; var3++) {
                this.field1092[var3] = arg0.method2315();
                this.field1097[var3] = arg0.method2318();
            }
        } else if (arg1 == 6) {
            this.field1091 = arg0.method2312();
            this.field1092 = new int[this.field1091];
            this.field1085 = new int[this.field1091];
            for (int var4 = 0; var4 < this.field1091; var4++) {
                this.field1092[var4] = arg0.method2315();
                this.field1085[var4] = arg0.method2315();
            }
        }
    }
}
