package deob;

@ObfuscatedName("ak")
public class class45 extends class195 {

    @ObfuscatedName("ak.w")
    public static class184 field1010 = new class184(64);

    @ObfuscatedName("ak.i")
    public char field1011;

    @ObfuscatedName("ak.e")
    public char field1023;

    @ObfuscatedName("ak.h")
    public String field1013 = "null";

    @ObfuscatedName("ak.q")
    public int field1021;

    @ObfuscatedName("ak.l")
    public int field1009 = 0;

    @ObfuscatedName("ak.c")
    public int[] field1016;

    @ObfuscatedName("ak.f")
    public int[] field1022;

    @ObfuscatedName("ak.s")
    public String[] field1018;

    @ObfuscatedName("ag.n(Lfd;I)V")
    public static void method650(class158 arg0) {
        Statics.field1017 = arg0;
    }

    @ObfuscatedName("ak.w(Ldo;I)V")
    public void method875(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method877(arg0, var2);
        }
    }

    @ObfuscatedName("ak.i(Ldo;II)V")
    public void method877(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = (char) arg0.method2155();
        } else if (arg1 == 2) {
            this.field1023 = (char) arg0.method2155();
        } else if (arg1 == 3) {
            this.field1013 = arg0.method2163();
        } else if (arg1 == 4) {
            this.field1021 = arg0.method2160();
        } else if (arg1 == 5) {
            this.field1009 = arg0.method2157();
            this.field1016 = new int[this.field1009];
            this.field1018 = new String[this.field1009];
            for (int var3 = 0; var3 < this.field1009; var3++) {
                this.field1016[var3] = arg0.method2160();
                this.field1018[var3] = arg0.method2163();
            }
        } else if (arg1 == 6) {
            this.field1009 = arg0.method2157();
            this.field1016 = new int[this.field1009];
            this.field1022 = new int[this.field1009];
            for (int var4 = 0; var4 < this.field1009; var4++) {
                this.field1016[var4] = arg0.method2160();
                this.field1022[var4] = arg0.method2160();
            }
        }
    }
}
