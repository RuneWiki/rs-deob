package deob;

@ObfuscatedName("as")
public class class49 extends class204 {

    @ObfuscatedName("as.d")
    public static class193 field1056 = new class193(64);

    @ObfuscatedName("as.s")
    public char field1055;

    @ObfuscatedName("as.q")
    public char field1058;

    @ObfuscatedName("as.j")
    public String field1066 = "null";

    @ObfuscatedName("as.k")
    public int field1068;

    @ObfuscatedName("as.i")
    public int field1061 = 0;

    @ObfuscatedName("as.m")
    public int[] field1065;

    @ObfuscatedName("as.p")
    public int[] field1063;

    @ObfuscatedName("as.h")
    public String[] field1064;

    @ObfuscatedName("as.n(Ldq;I)V")
    public void method947(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method946(arg0, var2);
        }
    }

    @ObfuscatedName("as.d(Ldq;IB)V")
    public void method946(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1055 = (char) arg0.method2338();
        } else if (arg1 == 2) {
            this.field1058 = (char) arg0.method2338();
        } else if (arg1 == 3) {
            this.field1066 = arg0.method2492();
        } else if (arg1 == 4) {
            this.field1068 = arg0.method2343();
        } else if (arg1 == 5) {
            this.field1061 = arg0.method2377();
            this.field1065 = new int[this.field1061];
            this.field1064 = new String[this.field1061];
            for (int var3 = 0; var3 < this.field1061; var3++) {
                this.field1065[var3] = arg0.method2343();
                this.field1064[var3] = arg0.method2492();
            }
        } else if (arg1 == 6) {
            this.field1061 = arg0.method2377();
            this.field1065 = new int[this.field1061];
            this.field1063 = new int[this.field1061];
            for (int var4 = 0; var4 < this.field1061; var4++) {
                this.field1065[var4] = arg0.method2343();
                this.field1063[var4] = arg0.method2343();
            }
        }
    }
}
