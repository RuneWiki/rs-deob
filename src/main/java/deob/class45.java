package deob;

@ObfuscatedName("ay")
public class class45 extends class195 {

    @ObfuscatedName("ay.d")
    public static class184 field1021 = new class184(64);

    @ObfuscatedName("ay.z")
    public char field1022;

    @ObfuscatedName("ay.y")
    public char field1023;

    @ObfuscatedName("ay.e")
    public String field1024 = "null";

    @ObfuscatedName("ay.g")
    public int field1025;

    @ObfuscatedName("ay.f")
    public int field1033 = 0;

    @ObfuscatedName("ay.m")
    public int[] field1027;

    @ObfuscatedName("ay.a")
    public int[] field1020;

    @ObfuscatedName("ay.h")
    public String[] field1029;

    @ObfuscatedName("ay.n(Ldl;B)V")
    public void method875(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method877(arg0, var2);
        }
    }

    @ObfuscatedName("ay.d(Ldl;II)V")
    public void method877(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1022 = (char) arg0.method2228();
        } else if (arg1 == 2) {
            this.field1023 = (char) arg0.method2228();
        } else if (arg1 == 3) {
            this.field1024 = arg0.method2290();
        } else if (arg1 == 4) {
            this.field1025 = arg0.method2233();
        } else if (arg1 == 5) {
            this.field1033 = arg0.method2231();
            this.field1027 = new int[this.field1033];
            this.field1029 = new String[this.field1033];
            for (int var3 = 0; var3 < this.field1033; var3++) {
                this.field1027[var3] = arg0.method2233();
                this.field1029[var3] = arg0.method2290();
            }
        } else if (arg1 == 6) {
            this.field1033 = arg0.method2231();
            this.field1027 = new int[this.field1033];
            this.field1020 = new int[this.field1033];
            for (int var4 = 0; var4 < this.field1033; var4++) {
                this.field1027[var4] = arg0.method2233();
                this.field1020[var4] = arg0.method2233();
            }
        }
    }
}
