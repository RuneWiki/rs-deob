package deob;

@ObfuscatedName("hh")
public class class192 extends class457 {

    @ObfuscatedName("hh.an")
    public static class287 field1973 = new class287(64);

    @ObfuscatedName("hh.av")
    public char field1975;

    @ObfuscatedName("hh.as")
    public char field1972;

    @ObfuscatedName("hh.ax")
    public String field1970 = class350.field3887;

    @ObfuscatedName("hh.ap")
    public int field1974;

    @ObfuscatedName("hh.ab")
    public int field1978 = 0;

    @ObfuscatedName("hh.ak")
    public int[] field1976;

    @ObfuscatedName("hh.ae")
    public int[] field1977;

    @ObfuscatedName("hh.af")
    public String[] field1971;

    @ObfuscatedName("ft.at(Lnq;B)V")
    public static void method2933(class357 arg0) {
        Statics.field1969 = arg0;
    }

    @ObfuscatedName("ay.an(IB)Lhh;")
    public static class192 method321(int arg0) {
        class192 var1 = (class192) field1973.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1969.method6080(8, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3352(new class501(var2));
        }
        field1973.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.av(Ltz;I)V")
    public void method3352(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3363(arg0, var2);
        }
    }

    @ObfuscatedName("hh.as(Ltz;II)V")
    public void method3363(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1975 = (char) arg0.method8129();
        } else if (arg1 == 2) {
            this.field1972 = (char) arg0.method8129();
        } else if (arg1 == 3) {
            this.field1970 = arg0.method8253();
        } else if (arg1 == 4) {
            this.field1974 = arg0.method8134();
        } else if (arg1 == 5) {
            this.field1978 = arg0.method8195();
            this.field1976 = new int[this.field1978];
            this.field1971 = new String[this.field1978];
            for (int var3 = 0; var3 < this.field1978; var3++) {
                this.field1976[var3] = arg0.method8134();
                this.field1971[var3] = arg0.method8253();
            }
        } else if (arg1 == 6) {
            this.field1978 = arg0.method8195();
            this.field1976 = new int[this.field1978];
            this.field1977 = new int[this.field1978];
            for (int var4 = 0; var4 < this.field1978; var4++) {
                this.field1976[var4] = arg0.method8134();
                this.field1977[var4] = arg0.method8134();
            }
        }
    }

    @ObfuscatedName("hh.ax(I)I")
    public int method3354() {
        return this.field1978;
    }
}
