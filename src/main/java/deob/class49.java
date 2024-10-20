package deob;

@ObfuscatedName("ay")
public class class49 extends class204 {

    @ObfuscatedName("ay.r")
    public static class193 field1077 = new class193(64);

    @ObfuscatedName("ay.f")
    public char field1071;

    @ObfuscatedName("ay.s")
    public char field1072;

    @ObfuscatedName("ay.y")
    public String field1073 = "null";

    @ObfuscatedName("ay.e")
    public int field1074;

    @ObfuscatedName("ay.g")
    public int field1076 = 0;

    @ObfuscatedName("ay.m")
    public int[] field1088;

    @ObfuscatedName("ay.j")
    public int[] field1081;

    @ObfuscatedName("ay.n")
    public String[] field1078;

    @ObfuscatedName("v.a(Lfz;B)V")
    public static void method175(class167 arg0) {
        Statics.field1070 = arg0;
    }

    @ObfuscatedName("ay.r(Lds;B)V")
    public void method988(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method987(arg0, var2);
        }
    }

    @ObfuscatedName("ay.f(Lds;II)V")
    public void method987(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1071 = (char) arg0.method2412();
        } else if (arg1 == 2) {
            this.field1072 = (char) arg0.method2412();
        } else if (arg1 == 3) {
            this.field1073 = arg0.method2353();
        } else if (arg1 == 4) {
            this.field1074 = arg0.method2350();
        } else if (arg1 == 5) {
            this.field1076 = arg0.method2347();
            this.field1088 = new int[this.field1076];
            this.field1078 = new String[this.field1076];
            for (int var3 = 0; var3 < this.field1076; var3++) {
                this.field1088[var3] = arg0.method2350();
                this.field1078[var3] = arg0.method2353();
            }
        } else if (arg1 == 6) {
            this.field1076 = arg0.method2347();
            this.field1088 = new int[this.field1076];
            this.field1081 = new int[this.field1076];
            for (int var4 = 0; var4 < this.field1076; var4++) {
                this.field1088[var4] = arg0.method2350();
                this.field1081[var4] = arg0.method2350();
            }
        }
    }
}
