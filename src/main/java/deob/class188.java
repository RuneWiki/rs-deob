package deob;

@ObfuscatedName("hx")
public class class188 extends class444 {

    @ObfuscatedName("hx.an")
    public static class280 field1983 = new class280(64);

    @ObfuscatedName("hx.aw")
    public char field1982;

    @ObfuscatedName("hx.ac")
    public char field1981;

    @ObfuscatedName("hx.au")
    public String field1984 = class337.field3889;

    @ObfuscatedName("hx.ab")
    public int field1986;

    @ObfuscatedName("hx.aq")
    public int field1990 = 0;

    @ObfuscatedName("hx.al")
    public int[] field1987;

    @ObfuscatedName("hx.at")
    public int[] field1988;

    @ObfuscatedName("hx.aa")
    public String[] field1989;

    @ObfuscatedName("ln.af(Lnm;I)V")
    public static void method5320(class344 arg0) {
        Statics.field1985 = arg0;
    }

    @ObfuscatedName("fc.an(IB)Lhx;")
    public static class188 method3074(int arg0) {
        class188 var1 = (class188) field1983.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1985.method6090(8, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3443(new class489(var2));
        }
        field1983.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.aw(Lsg;B)V")
    public void method3443(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3430(arg0, var2);
        }
    }

    @ObfuscatedName("hx.ac(Lsg;II)V")
    public void method3430(class489 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1982 = (char) arg0.method8248();
        } else if (arg1 == 2) {
            this.field1981 = (char) arg0.method8248();
        } else if (arg1 == 3) {
            this.field1984 = arg0.method8259();
        } else if (arg1 == 4) {
            this.field1986 = arg0.method8254();
        } else if (arg1 == 5) {
            this.field1990 = arg0.method8250();
            this.field1987 = new int[this.field1990];
            this.field1989 = new String[this.field1990];
            for (int var3 = 0; var3 < this.field1990; var3++) {
                this.field1987[var3] = arg0.method8254();
                this.field1989[var3] = arg0.method8259();
            }
        } else if (arg1 == 6) {
            this.field1990 = arg0.method8250();
            this.field1987 = new int[this.field1990];
            this.field1988 = new int[this.field1990];
            for (int var4 = 0; var4 < this.field1990; var4++) {
                this.field1987[var4] = arg0.method8254();
                this.field1988[var4] = arg0.method8254();
            }
        }
    }

    @ObfuscatedName("hx.au(I)I")
    public int method3429() {
        return this.field1990;
    }
}
