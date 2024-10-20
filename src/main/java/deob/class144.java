package deob;

@ObfuscatedName("er")
public class class144 extends class347 {

    @ObfuscatedName("er.n")
    public static class221 field1614 = new class221(64);

    @ObfuscatedName("er.f")
    public char field1622;

    @ObfuscatedName("er.y")
    public char field1617;

    @ObfuscatedName("er.p")
    public String field1615 = class268.field3242;

    @ObfuscatedName("er.j")
    public int field1618;

    @ObfuscatedName("er.r")
    public int field1619 = 0;

    @ObfuscatedName("er.b")
    public int[] field1620;

    @ObfuscatedName("er.d")
    public int[] field1621;

    @ObfuscatedName("er.s")
    public String[] field1613;

    @ObfuscatedName("jz.v(Ljv;B)V")
    public static void method4653(class275 arg0) {
        Statics.field1616 = arg0;
    }

    @ObfuscatedName("er.f(Lnd;I)V")
    public void method2506(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2512(arg0, var2);
        }
    }

    @ObfuscatedName("er.y(Lnd;IB)V")
    public void method2512(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1622 = (char) arg0.method5965();
        } else if (arg1 == 2) {
            this.field1617 = (char) arg0.method5965();
        } else if (arg1 == 3) {
            this.field1615 = arg0.method5974();
        } else if (arg1 == 4) {
            this.field1618 = arg0.method5970();
        } else if (arg1 == 5) {
            this.field1619 = arg0.method5967();
            this.field1620 = new int[this.field1619];
            this.field1613 = new String[this.field1619];
            for (int var3 = 0; var3 < this.field1619; var3++) {
                this.field1620[var3] = arg0.method5970();
                this.field1613[var3] = arg0.method5974();
            }
        } else if (arg1 == 6) {
            this.field1619 = arg0.method5967();
            this.field1620 = new int[this.field1619];
            this.field1621 = new int[this.field1619];
            for (int var4 = 0; var4 < this.field1619; var4++) {
                this.field1620[var4] = arg0.method5970();
                this.field1621[var4] = arg0.method5970();
            }
        }
    }

    @ObfuscatedName("er.p(I)I")
    public int method2505() {
        return this.field1619;
    }
}
