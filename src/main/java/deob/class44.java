package deob;

@ObfuscatedName("ad")
public class class44 extends class187 {

    @ObfuscatedName("ad.v")
    public static class176 field989 = new class176(64);

    @ObfuscatedName("ad.i")
    public char field990;

    @ObfuscatedName("ad.b")
    public char field991;

    @ObfuscatedName("ad.l")
    public String field992 = "null";

    @ObfuscatedName("ad.m")
    public int field988;

    @ObfuscatedName("ad.w")
    public int field994 = 0;

    @ObfuscatedName("ad.e")
    public int[] field1001;

    @ObfuscatedName("ad.n")
    public int[] field996;

    @ObfuscatedName("ad.s")
    public String[] field993;

    @ObfuscatedName("hf.a(II)Lad;")
    public static class44 method3559(int arg0) {
        class44 var1 = (class44) field989.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field995.method2731(8, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method839(new class110(var2));
        }
        field989.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.v(Ldi;I)V")
    public void method839(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method848(arg0, var2);
        }
    }

    @ObfuscatedName("ad.i(Ldi;II)V")
    public void method848(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field990 = (char) arg0.method2199();
        } else if (arg1 == 2) {
            this.field991 = (char) arg0.method2199();
        } else if (arg1 == 3) {
            this.field992 = arg0.method2139();
        } else if (arg1 == 4) {
            this.field988 = arg0.method2136();
        } else if (arg1 == 5) {
            this.field994 = arg0.method2282();
            this.field1001 = new int[this.field994];
            this.field993 = new String[this.field994];
            for (int var3 = 0; var3 < this.field994; var3++) {
                this.field1001[var3] = arg0.method2136();
                this.field993[var3] = arg0.method2139();
            }
        } else if (arg1 == 6) {
            this.field994 = arg0.method2282();
            this.field1001 = new int[this.field994];
            this.field996 = new int[this.field994];
            for (int var4 = 0; var4 < this.field994; var4++) {
                this.field1001[var4] = arg0.method2136();
                this.field996[var4] = arg0.method2136();
            }
        }
    }
}
