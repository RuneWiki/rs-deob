package deob;

@ObfuscatedName("ad")
public class class49 extends class205 {

    @ObfuscatedName("ad.g")
    public static class194 field1059 = new class194(64);

    @ObfuscatedName("ad.j")
    public char field1051;

    @ObfuscatedName("ad.d")
    public char field1052;

    @ObfuscatedName("ad.x")
    public String field1053 = "null";

    @ObfuscatedName("ad.y")
    public int field1060;

    @ObfuscatedName("ad.r")
    public int field1055 = 0;

    @ObfuscatedName("ad.c")
    public int[] field1056;

    @ObfuscatedName("ad.l")
    public int[] field1057;

    @ObfuscatedName("ad.u")
    public String[] field1058;

    @ObfuscatedName("ad.b(Lds;B)V")
    public void method966(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method965(arg0, var2);
        }
    }

    @ObfuscatedName("ad.g(Lds;II)V")
    public void method965(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1051 = (char) arg0.method2344();
        } else if (arg1 == 2) {
            this.field1052 = (char) arg0.method2344();
        } else if (arg1 == 3) {
            this.field1053 = arg0.method2352();
        } else if (arg1 == 4) {
            this.field1060 = arg0.method2349();
        } else if (arg1 == 5) {
            this.field1055 = arg0.method2346();
            this.field1056 = new int[this.field1055];
            this.field1058 = new String[this.field1055];
            for (int var3 = 0; var3 < this.field1055; var3++) {
                this.field1056[var3] = arg0.method2349();
                this.field1058[var3] = arg0.method2352();
            }
        } else if (arg1 == 6) {
            this.field1055 = arg0.method2346();
            this.field1056 = new int[this.field1055];
            this.field1057 = new int[this.field1055];
            for (int var4 = 0; var4 < this.field1055; var4++) {
                this.field1056[var4] = arg0.method2349();
                this.field1057[var4] = arg0.method2349();
            }
        }
    }
}
