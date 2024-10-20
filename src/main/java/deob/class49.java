package deob;

@ObfuscatedName("aw")
public class class49 extends class204 {

    @ObfuscatedName("aw.m")
    public static class193 field1093 = new class193(64);

    @ObfuscatedName("aw.i")
    public char field1087;

    @ObfuscatedName("aw.q")
    public char field1088;

    @ObfuscatedName("aw.p")
    public String field1089 = "null";

    @ObfuscatedName("aw.c")
    public int field1090;

    @ObfuscatedName("aw.f")
    public int field1091 = 0;

    @ObfuscatedName("aw.y")
    public int[] field1092;

    @ObfuscatedName("aw.w")
    public int[] field1085;

    @ObfuscatedName("aw.l")
    public String[] field1094;

    @ObfuscatedName("aw.h(Ldp;I)V")
    public void method951(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method946(arg0, var2);
        }
    }

    @ObfuscatedName("aw.m(Ldp;II)V")
    public void method946(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1087 = (char) arg0.method2320();
        } else if (arg1 == 2) {
            this.field1088 = (char) arg0.method2320();
        } else if (arg1 == 3) {
            this.field1089 = arg0.method2350();
        } else if (arg1 == 4) {
            this.field1090 = arg0.method2324();
        } else if (arg1 == 5) {
            this.field1091 = arg0.method2322();
            this.field1092 = new int[this.field1091];
            this.field1094 = new String[this.field1091];
            for (int var3 = 0; var3 < this.field1091; var3++) {
                this.field1092[var3] = arg0.method2324();
                this.field1094[var3] = arg0.method2350();
            }
        } else if (arg1 == 6) {
            this.field1091 = arg0.method2322();
            this.field1092 = new int[this.field1091];
            this.field1085 = new int[this.field1091];
            for (int var4 = 0; var4 < this.field1091; var4++) {
                this.field1092[var4] = arg0.method2324();
                this.field1085[var4] = arg0.method2324();
            }
        }
    }
}
