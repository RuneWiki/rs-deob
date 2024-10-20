package deob;

@ObfuscatedName("ab")
public class class49 extends class204 {

    @ObfuscatedName("ab.f")
    public static class193 field1074 = new class193(64);

    @ObfuscatedName("ab.i")
    public char field1068;

    @ObfuscatedName("ab.d")
    public char field1071;

    @ObfuscatedName("ab.o")
    public String field1072 = "null";

    @ObfuscatedName("ab.c")
    public int field1073;

    @ObfuscatedName("ab.p")
    public int field1069 = 0;

    @ObfuscatedName("ab.j")
    public int[] field1075;

    @ObfuscatedName("ab.a")
    public int[] field1076;

    @ObfuscatedName("ab.y")
    public String[] field1077;

    @ObfuscatedName("r.v(II)Lab;")
    public static class49 method563(int arg0) {
        class49 var1 = (class49) field1074.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1082.method3082(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method963(new class119(var2));
        }
        field1074.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.f(Ldx;B)V")
    public void method963(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method973(arg0, var2);
        }
    }

    @ObfuscatedName("ab.i(Ldx;II)V")
    public void method973(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1068 = (char) arg0.method2400();
        } else if (arg1 == 2) {
            this.field1071 = (char) arg0.method2400();
        } else if (arg1 == 3) {
            this.field1072 = arg0.method2357();
        } else if (arg1 == 4) {
            this.field1073 = arg0.method2354();
        } else if (arg1 == 5) {
            this.field1069 = arg0.method2334();
            this.field1075 = new int[this.field1069];
            this.field1077 = new String[this.field1069];
            for (int var3 = 0; var3 < this.field1069; var3++) {
                this.field1075[var3] = arg0.method2354();
                this.field1077[var3] = arg0.method2357();
            }
        } else if (arg1 == 6) {
            this.field1069 = arg0.method2334();
            this.field1075 = new int[this.field1069];
            this.field1076 = new int[this.field1069];
            for (int var4 = 0; var4 < this.field1069; var4++) {
                this.field1075[var4] = arg0.method2354();
                this.field1076[var4] = arg0.method2354();
            }
        }
    }
}
