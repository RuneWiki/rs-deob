package deob;

@ObfuscatedName("hm")
public class class193 extends class470 {

    @ObfuscatedName("hm.ay")
    public static class289 field1975 = new class289(64);

    @ObfuscatedName("hm.ar")
    public char field1978;

    @ObfuscatedName("hm.am")
    public char field1977;

    @ObfuscatedName("hm.as")
    public String field1979 = class353.field3906;

    @ObfuscatedName("hm.aj")
    public int field1974;

    @ObfuscatedName("hm.ag")
    public int field1983 = 0;

    @ObfuscatedName("hm.az")
    public int[] field1981;

    @ObfuscatedName("hm.av")
    public int[] field1982;

    @ObfuscatedName("hm.ap")
    public String[] field1976;

    @ObfuscatedName("oe.aw(II)Lhm;")
    public static class193 method6340(int arg0) {
        class193 var1 = (class193) field1975.method5152((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1980.method6117(8, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3362(new class514(var2));
        }
        field1975.method5149(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hm.ay(Lty;B)V")
    public void method3362(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3361(arg0, var2);
        }
    }

    @ObfuscatedName("hm.ar(Lty;IB)V")
    public void method3361(class514 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1978 = (char) arg0.method8244();
        } else if (arg1 == 2) {
            this.field1977 = (char) arg0.method8244();
        } else if (arg1 == 3) {
            this.field1979 = arg0.method8369();
        } else if (arg1 == 4) {
            this.field1974 = arg0.method8496();
        } else if (arg1 == 5) {
            this.field1983 = arg0.method8246();
            this.field1981 = new int[this.field1983];
            this.field1976 = new String[this.field1983];
            for (int var3 = 0; var3 < this.field1983; var3++) {
                this.field1981[var3] = arg0.method8496();
                this.field1976[var3] = arg0.method8369();
            }
        } else if (arg1 == 6) {
            this.field1983 = arg0.method8246();
            this.field1981 = new int[this.field1983];
            this.field1982 = new int[this.field1983];
            for (int var4 = 0; var4 < this.field1983; var4++) {
                this.field1981[var4] = arg0.method8496();
                this.field1982[var4] = arg0.method8496();
            }
        }
    }

    @ObfuscatedName("hm.am(I)I")
    public int method3364() {
        return this.field1983;
    }
}
