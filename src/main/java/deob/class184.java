package deob;

@ObfuscatedName("hp")
public class class184 extends class481 {

    @ObfuscatedName("hp.ah")
    public static class299 field1889 = new class299(64);

    @ObfuscatedName("hp.ar")
    public char field1890;

    @ObfuscatedName("hp.ao")
    public char field1887;

    @ObfuscatedName("hp.ab")
    public String field1891 = class364.field4153;

    @ObfuscatedName("hp.au")
    public int field1892;

    @ObfuscatedName("hp.aa")
    public int field1893 = 0;

    @ObfuscatedName("hp.ac")
    public int[] field1888;

    @ObfuscatedName("hp.al")
    public int[] field1895;

    @ObfuscatedName("hp.az")
    public String[] field1896;

    @ObfuscatedName("hs.at(II)Lhp;")
    public static class184 method3632(int arg0) {
        class184 var1 = (class184) field1889.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1898.method6284(8, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3359(new class527(var2));
        }
        field1889.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hp.ah(Luj;I)V")
    public void method3359(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3358(arg0, var2);
        }
    }

    @ObfuscatedName("hp.ar(Luj;II)V")
    public void method3358(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1890 = (char) arg0.method8410();
        } else if (arg1 == 2) {
            this.field1887 = (char) arg0.method8410();
        } else if (arg1 == 3) {
            this.field1891 = arg0.method8535();
        } else if (arg1 == 4) {
            this.field1892 = arg0.method8416();
        } else if (arg1 == 5) {
            this.field1893 = arg0.method8412();
            this.field1888 = new int[this.field1893];
            this.field1896 = new String[this.field1893];
            for (int var3 = 0; var3 < this.field1893; var3++) {
                this.field1888[var3] = arg0.method8416();
                this.field1896[var3] = arg0.method8535();
            }
        } else if (arg1 == 6) {
            this.field1893 = arg0.method8412();
            this.field1888 = new int[this.field1893];
            this.field1895 = new int[this.field1893];
            for (int var4 = 0; var4 < this.field1893; var4++) {
                this.field1888[var4] = arg0.method8416();
                this.field1895[var4] = arg0.method8416();
            }
        }
    }

    @ObfuscatedName("hp.ao(I)I")
    public int method3366() {
        return this.field1893;
    }
}
