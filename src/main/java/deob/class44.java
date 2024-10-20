package deob;

@ObfuscatedName("aw")
public class class44 extends class185 {

    @ObfuscatedName("aw.v")
    public static class174 field1002 = new class174(64);

    @ObfuscatedName("aw.k")
    public char field1003;

    @ObfuscatedName("aw.g")
    public char field1004;

    @ObfuscatedName("aw.q")
    public String field1005 = "null";

    @ObfuscatedName("aw.l")
    public int field1001;

    @ObfuscatedName("aw.a")
    public int field1007 = 0;

    @ObfuscatedName("aw.b")
    public int[] field1011;

    @ObfuscatedName("aw.z")
    public int[] field1006;

    @ObfuscatedName("aw.w")
    public String[] field1010;

    @ObfuscatedName("aw.e(Ldd;I)V")
    public void method814(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method818(arg0, var2);
        }
    }

    @ObfuscatedName("aw.v(Ldd;II)V")
    public void method818(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1003 = (char) arg0.method2122();
        } else if (arg1 == 2) {
            this.field1004 = (char) arg0.method2122();
        } else if (arg1 == 3) {
            this.field1005 = arg0.method2130();
        } else if (arg1 == 4) {
            this.field1001 = arg0.method2127();
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2124();
            this.field1011 = new int[this.field1007];
            this.field1010 = new String[this.field1007];
            for (int var3 = 0; var3 < this.field1007; var3++) {
                this.field1011[var3] = arg0.method2127();
                this.field1010[var3] = arg0.method2130();
            }
        } else if (arg1 == 6) {
            this.field1007 = arg0.method2124();
            this.field1011 = new int[this.field1007];
            this.field1006 = new int[this.field1007];
            for (int var4 = 0; var4 < this.field1007; var4++) {
                this.field1011[var4] = arg0.method2127();
                this.field1006[var4] = arg0.method2127();
            }
        }
    }
}
