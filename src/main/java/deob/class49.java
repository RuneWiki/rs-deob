package deob;

@ObfuscatedName("av")
public class class49 extends class204 {

    @ObfuscatedName("av.e")
    public static class193 field1060 = new class193(64);

    @ObfuscatedName("av.q")
    public char field1067;

    @ObfuscatedName("av.o")
    public char field1063;

    @ObfuscatedName("av.g")
    public String field1065 = "null";

    @ObfuscatedName("av.m")
    public int field1061;

    @ObfuscatedName("av.b")
    public int field1066 = 0;

    @ObfuscatedName("av.p")
    public int[] field1064;

    @ObfuscatedName("av.t")
    public int[] field1068;

    @ObfuscatedName("av.w")
    public String[] field1062;

    @ObfuscatedName("av.l(Ldl;I)V")
    public void method989(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method990(arg0, var2);
        }
    }

    @ObfuscatedName("av.e(Ldl;II)V")
    public void method990(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1067 = (char) arg0.method2388();
        } else if (arg1 == 2) {
            this.field1063 = (char) arg0.method2388();
        } else if (arg1 == 3) {
            this.field1065 = arg0.method2396();
        } else if (arg1 == 4) {
            this.field1061 = arg0.method2393();
        } else if (arg1 == 5) {
            this.field1066 = arg0.method2440();
            this.field1064 = new int[this.field1066];
            this.field1062 = new String[this.field1066];
            for (int var3 = 0; var3 < this.field1066; var3++) {
                this.field1064[var3] = arg0.method2393();
                this.field1062[var3] = arg0.method2396();
            }
        } else if (arg1 == 6) {
            this.field1066 = arg0.method2440();
            this.field1064 = new int[this.field1066];
            this.field1068 = new int[this.field1066];
            for (int var4 = 0; var4 < this.field1066; var4++) {
                this.field1064[var4] = arg0.method2393();
                this.field1068[var4] = arg0.method2393();
            }
        }
    }
}
