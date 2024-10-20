package deob;

@ObfuscatedName("am")
public class class44 extends class185 {

    @ObfuscatedName("am.k")
    public static class174 field1013 = new class174(64);

    @ObfuscatedName("am.y")
    public char field1011;

    @ObfuscatedName("am.e")
    public char field1004;

    @ObfuscatedName("am.r")
    public String field1005 = "null";

    @ObfuscatedName("am.a")
    public int field1006;

    @ObfuscatedName("am.n")
    public int field1007 = 0;

    @ObfuscatedName("am.x")
    public int[] field1008;

    @ObfuscatedName("am.g")
    public int[] field1009;

    @ObfuscatedName("am.o")
    public String[] field1010;

    @ObfuscatedName("am.f(Ldu;I)V")
    public void method866(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method867(arg0, var2);
        }
    }

    @ObfuscatedName("am.k(Ldu;IB)V")
    public void method867(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = (char) arg0.method2158();
        } else if (arg1 == 2) {
            this.field1004 = (char) arg0.method2158();
        } else if (arg1 == 3) {
            this.field1005 = arg0.method2275();
        } else if (arg1 == 4) {
            this.field1006 = arg0.method2256();
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2160();
            this.field1008 = new int[this.field1007];
            this.field1010 = new String[this.field1007];
            for (int var3 = 0; var3 < this.field1007; var3++) {
                this.field1008[var3] = arg0.method2256();
                this.field1010[var3] = arg0.method2275();
            }
        } else if (arg1 == 6) {
            this.field1007 = arg0.method2160();
            this.field1008 = new int[this.field1007];
            this.field1009 = new int[this.field1007];
            for (int var4 = 0; var4 < this.field1007; var4++) {
                this.field1008[var4] = arg0.method2256();
                this.field1009[var4] = arg0.method2256();
            }
        }
    }
}
