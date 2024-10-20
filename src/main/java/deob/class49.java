package deob;

@ObfuscatedName("af")
public class class49 extends class205 {

    @ObfuscatedName("af.h")
    public static class194 field1063 = new class194(64);

    @ObfuscatedName("af.m")
    public char field1060;

    @ObfuscatedName("af.z")
    public char field1061;

    @ObfuscatedName("af.x")
    public String field1065 = "null";

    @ObfuscatedName("af.e")
    public int field1058;

    @ObfuscatedName("af.i")
    public int field1064 = 0;

    @ObfuscatedName("af.c")
    public int[] field1059;

    @ObfuscatedName("af.n")
    public int[] field1066;

    @ObfuscatedName("af.l")
    public String[] field1067;

    @ObfuscatedName("t.j(Lfy;B)V")
    public static void method189(class168 arg0) {
        Statics.field1068 = arg0;
    }

    @ObfuscatedName("af.h(Ldx;B)V")
    public void method971(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method972(arg0, var2);
        }
    }

    @ObfuscatedName("af.m(Ldx;II)V")
    public void method972(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1060 = (char) arg0.method2361();
        } else if (arg1 == 2) {
            this.field1061 = (char) arg0.method2361();
        } else if (arg1 == 3) {
            this.field1065 = arg0.method2369();
        } else if (arg1 == 4) {
            this.field1058 = arg0.method2366();
        } else if (arg1 == 5) {
            this.field1064 = arg0.method2363();
            this.field1059 = new int[this.field1064];
            this.field1067 = new String[this.field1064];
            for (int var3 = 0; var3 < this.field1064; var3++) {
                this.field1059[var3] = arg0.method2366();
                this.field1067[var3] = arg0.method2369();
            }
        } else if (arg1 == 6) {
            this.field1064 = arg0.method2363();
            this.field1059 = new int[this.field1064];
            this.field1066 = new int[this.field1064];
            for (int var4 = 0; var4 < this.field1064; var4++) {
                this.field1059[var4] = arg0.method2366();
                this.field1066[var4] = arg0.method2366();
            }
        }
    }
}
