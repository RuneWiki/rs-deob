package deob;

@ObfuscatedName("hg")
public class class190 extends class439 {

    @ObfuscatedName("hg.al")
    public static class276 field1964 = new class276(64);

    @ObfuscatedName("hg.ac")
    public char field1965;

    @ObfuscatedName("hg.ab")
    public char field1972;

    @ObfuscatedName("hg.an")
    public String field1975 = class333.field3824;

    @ObfuscatedName("hg.ao")
    public int field1968;

    @ObfuscatedName("hg.av")
    public int field1969 = 0;

    @ObfuscatedName("hg.aq")
    public int[] field1974;

    @ObfuscatedName("hg.ap")
    public int[] field1971;

    @ObfuscatedName("hg.ar")
    public String[] field1970;

    @ObfuscatedName("gv.aj(Lne;I)V")
    public static void method3224(class340 arg0) {
        Statics.field1966 = arg0;
    }

    @ObfuscatedName("fs.al(IB)Lhg;")
    public static class190 method2892(int arg0) {
        class190 var1 = (class190) field1964.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1966.method5860(8, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3333(new class478(var2));
        }
        field1964.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hg.ac(Lsy;I)V")
    public void method3333(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3334(arg0, var2);
        }
    }

    @ObfuscatedName("hg.ab(Lsy;IB)V")
    public void method3334(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1965 = (char) arg0.method7909();
        } else if (arg1 == 2) {
            this.field1972 = (char) arg0.method7909();
        } else if (arg1 == 3) {
            this.field1975 = arg0.method7950();
        } else if (arg1 == 4) {
            this.field1968 = arg0.method7908();
        } else if (arg1 == 5) {
            this.field1969 = arg0.method7905();
            this.field1974 = new int[this.field1969];
            this.field1970 = new String[this.field1969];
            for (int var3 = 0; var3 < this.field1969; var3++) {
                this.field1974[var3] = arg0.method7908();
                this.field1970[var3] = arg0.method7950();
            }
        } else if (arg1 == 6) {
            this.field1969 = arg0.method7905();
            this.field1974 = new int[this.field1969];
            this.field1971 = new int[this.field1969];
            for (int var4 = 0; var4 < this.field1969; var4++) {
                this.field1974[var4] = arg0.method7908();
                this.field1971[var4] = arg0.method7908();
            }
        }
    }

    @ObfuscatedName("hg.an(I)I")
    public int method3342() {
        return this.field1969;
    }
}
