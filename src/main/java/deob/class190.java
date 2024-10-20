package deob;

@ObfuscatedName("hd")
public class class190 extends class504 {

    @ObfuscatedName("hd.ae")
    public static class317 field1966 = new class317(64);

    @ObfuscatedName("hd.ag")
    public char field1967;

    @ObfuscatedName("hd.am")
    public char field1968;

    @ObfuscatedName("hd.ax")
    public String field1969 = class382.field4298;

    @ObfuscatedName("hd.aq")
    public int field1970;

    @ObfuscatedName("hd.af")
    public int field1971 = 0;

    @ObfuscatedName("hd.at")
    public int[] field1973;

    @ObfuscatedName("hd.au")
    public int[] field1974;

    @ObfuscatedName("hd.ar")
    public String[] field1965;

    @ObfuscatedName("ce.ac(IS)Lhd;")
    public static class190 method2196(int arg0) {
        class190 var1 = (class190) field1966.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1972.method6782(8, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3566(new class551(var2));
        }
        field1966.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hd.ae(Lvf;B)V")
    public void method3566(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3567(arg0, var2);
        }
    }

    @ObfuscatedName("hd.ag(Lvf;II)V")
    public void method3567(class551 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1967 = (char) arg0.method8955();
        } else if (arg1 == 2) {
            this.field1968 = (char) arg0.method8955();
        } else if (arg1 == 3) {
            this.field1969 = arg0.method9166();
        } else if (arg1 == 4) {
            this.field1970 = arg0.method9110();
        } else if (arg1 == 5) {
            this.field1971 = arg0.method9119();
            this.field1973 = new int[this.field1971];
            this.field1965 = new String[this.field1971];
            for (int var3 = 0; var3 < this.field1971; var3++) {
                this.field1973[var3] = arg0.method9110();
                this.field1965[var3] = arg0.method9166();
            }
        } else if (arg1 == 6) {
            this.field1971 = arg0.method9119();
            this.field1973 = new int[this.field1971];
            this.field1974 = new int[this.field1971];
            for (int var4 = 0; var4 < this.field1971; var4++) {
                this.field1973[var4] = arg0.method9110();
                this.field1974[var4] = arg0.method9110();
            }
        }
    }

    @ObfuscatedName("hd.am(B)I")
    public int method3568() {
        return this.field1971;
    }

    @ObfuscatedName("fu.ax(I)V")
    public static void method3191() {
        field1966.method5736();
    }
}
