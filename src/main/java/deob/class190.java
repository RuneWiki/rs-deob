package deob;

@ObfuscatedName("he")
public class class190 extends class511 {

    @ObfuscatedName("he.aw")
    public static class316 field1967 = new class316(64);

    @ObfuscatedName("he.ak")
    public char field1968;

    @ObfuscatedName("he.aj")
    public char field1976;

    @ObfuscatedName("he.ai")
    public String field1970 = class383.field4405;

    @ObfuscatedName("he.ay")
    public int field1977;

    @ObfuscatedName("he.as")
    public int field1969 = 0;

    @ObfuscatedName("he.ae")
    public int[] field1973;

    @ObfuscatedName("he.am")
    public int[] field1974;

    @ObfuscatedName("he.at")
    public String[] field1975;

    @ObfuscatedName("ir.ap(II)Lhe;")
    public static class190 method4002(int arg0) {
        class190 var1 = (class190) field1967.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1972.method7009(8, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3710(new class558(var2));
        }
        field1967.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("he.aw(Lvl;I)V")
    public void method3710(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3705(arg0, var2);
        }
    }

    @ObfuscatedName("he.ak(Lvl;II)V")
    public void method3705(class558 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1968 = (char) arg0.method9258();
        } else if (arg1 == 2) {
            this.field1976 = (char) arg0.method9258();
        } else if (arg1 == 3) {
            this.field1970 = arg0.method9269();
        } else if (arg1 == 4) {
            this.field1977 = arg0.method9264();
        } else if (arg1 == 5) {
            this.field1969 = arg0.method9260();
            this.field1973 = new int[this.field1969];
            this.field1975 = new String[this.field1969];
            for (int var3 = 0; var3 < this.field1969; var3++) {
                this.field1973[var3] = arg0.method9264();
                this.field1975[var3] = arg0.method9269();
            }
        } else if (arg1 == 6) {
            this.field1969 = arg0.method9260();
            this.field1973 = new int[this.field1969];
            this.field1974 = new int[this.field1969];
            for (int var4 = 0; var4 < this.field1969; var4++) {
                this.field1973[var4] = arg0.method9264();
                this.field1974[var4] = arg0.method9264();
            }
        }
    }

    @ObfuscatedName("he.aj(B)I")
    public int method3706() {
        return this.field1969;
    }
}
