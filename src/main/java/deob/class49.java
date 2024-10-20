package deob;

@ObfuscatedName("ag")
public class class49 extends class204 {

    @ObfuscatedName("ag.e")
    public static class193 field1067 = new class193(64);

    @ObfuscatedName("ag.u")
    public char field1068;

    @ObfuscatedName("ag.b")
    public char field1069;

    @ObfuscatedName("ag.p")
    public String field1070 = "null";

    @ObfuscatedName("ag.s")
    public int field1071;

    @ObfuscatedName("ag.y")
    public int field1072 = 0;

    @ObfuscatedName("ag.t")
    public int[] field1073;

    @ObfuscatedName("ag.w")
    public int[] field1066;

    @ObfuscatedName("ag.h")
    public String[] field1075;

    @ObfuscatedName("bz.o(IB)Lag;")
    public static class49 method1551(int arg0) {
        class49 var1 = (class49) field1067.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1080.method3057(8, arg0);
        class49 var3 = new class49();
        if (var2 != null) {
            var3.method961(new class119(var2));
        }
        field1067.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.e(Ldi;I)V")
    public void method961(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method962(arg0, var2);
        }
    }

    @ObfuscatedName("ag.u(Ldi;II)V")
    public void method962(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1068 = (char) arg0.method2427();
        } else if (arg1 == 2) {
            this.field1069 = (char) arg0.method2427();
        } else if (arg1 == 3) {
            this.field1070 = arg0.method2528();
        } else if (arg1 == 4) {
            this.field1071 = arg0.method2342();
        } else if (arg1 == 5) {
            this.field1072 = arg0.method2339();
            this.field1073 = new int[this.field1072];
            this.field1075 = new String[this.field1072];
            for (int var3 = 0; var3 < this.field1072; var3++) {
                this.field1073[var3] = arg0.method2342();
                this.field1075[var3] = arg0.method2528();
            }
        } else if (arg1 == 6) {
            this.field1072 = arg0.method2339();
            this.field1073 = new int[this.field1072];
            this.field1066 = new int[this.field1072];
            for (int var4 = 0; var4 < this.field1072; var4++) {
                this.field1073[var4] = arg0.method2342();
                this.field1066[var4] = arg0.method2342();
            }
        }
    }
}
