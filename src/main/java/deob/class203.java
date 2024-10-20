package deob;

@ObfuscatedName("he")
public class class203 extends class489 {

    @ObfuscatedName("he.ah")
    public static class304 field2076 = new class304(64);

    @ObfuscatedName("he.af")
    public char field2069;

    @ObfuscatedName("he.at")
    public char field2071;

    @ObfuscatedName("he.an")
    public String field2074 = class370.field4272;

    @ObfuscatedName("he.ao")
    public int field2073;

    @ObfuscatedName("he.ab")
    public int field2072 = 0;

    @ObfuscatedName("he.aw")
    public int[] field2075;

    @ObfuscatedName("he.ad")
    public int[] field2078;

    @ObfuscatedName("he.al")
    public String[] field2077;

    @ObfuscatedName("ex.az(Loc;B)V")
    public static void method2758(class379 arg0) {
        Statics.field79 = arg0;
    }

    @ObfuscatedName("gj.ah(II)Lhe;")
    public static class203 method3105(int arg0) {
        class203 var1 = (class203) field2076.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field79.method6328(8, arg0);
        class203 var3 = new class203();
        if (var2 != null) {
            var3.method3504(new class535(var2));
        }
        field2076.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("he.af(Lur;I)V")
    public void method3504(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3505(arg0, var2);
        }
    }

    @ObfuscatedName("he.at(Lur;IS)V")
    public void method3505(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2069 = (char) arg0.method8462();
        } else if (arg1 == 2) {
            this.field2071 = (char) arg0.method8462();
        } else if (arg1 == 3) {
            this.field2074 = arg0.method8473();
        } else if (arg1 == 4) {
            this.field2073 = arg0.method8682();
        } else if (arg1 == 5) {
            this.field2072 = arg0.method8670();
            this.field2075 = new int[this.field2072];
            this.field2077 = new String[this.field2072];
            for (int var3 = 0; var3 < this.field2072; var3++) {
                this.field2075[var3] = arg0.method8682();
                this.field2077[var3] = arg0.method8473();
            }
        } else if (arg1 == 6) {
            this.field2072 = arg0.method8670();
            this.field2075 = new int[this.field2072];
            this.field2078 = new int[this.field2072];
            for (int var4 = 0; var4 < this.field2072; var4++) {
                this.field2075[var4] = arg0.method8682();
                this.field2078[var4] = arg0.method8682();
            }
        }
    }

    @ObfuscatedName("he.an(I)I")
    public int method3506() {
        return this.field2072;
    }

    @ObfuscatedName("es.ao(I)V")
    public static void method2734() {
        field2076.method5339();
    }
}
