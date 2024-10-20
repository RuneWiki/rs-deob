package deob;

@ObfuscatedName("hu")
public class class184 extends class485 {

    @ObfuscatedName("hu.ap")
    public static class302 field1913 = new class302(64);

    @ObfuscatedName("hu.af")
    public char field1914;

    @ObfuscatedName("hu.aj")
    public char field1919;

    @ObfuscatedName("hu.aq")
    public String field1916 = class367.field4120;

    @ObfuscatedName("hu.ar")
    public int field1924;

    @ObfuscatedName("hu.ag")
    public int field1918 = 0;

    @ObfuscatedName("hu.ao")
    public int[] field1912;

    @ObfuscatedName("hu.ae")
    public int[] field1920;

    @ObfuscatedName("hu.aa")
    public String[] field1917;

    @ObfuscatedName("au.am(II)Lhu;")
    public static class184 method95(int arg0) {
        class184 var1 = (class184) field1913.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1915.method6396(8, arg0);
        class184 var3 = new class184();
        if (var2 != null) {
            var3.method3377(new class531(var2));
        }
        field1913.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hu.ap(Luk;B)V")
    public void method3377(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3378(arg0, var2);
        }
    }

    @ObfuscatedName("hu.af(Luk;IB)V")
    public void method3378(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1914 = (char) arg0.method8561();
        } else if (arg1 == 2) {
            this.field1919 = (char) arg0.method8561();
        } else if (arg1 == 3) {
            this.field1916 = arg0.method8641();
        } else if (arg1 == 4) {
            this.field1924 = arg0.method8566();
        } else if (arg1 == 5) {
            this.field1918 = arg0.method8775();
            this.field1912 = new int[this.field1918];
            this.field1917 = new String[this.field1918];
            for (int var3 = 0; var3 < this.field1918; var3++) {
                this.field1912[var3] = arg0.method8566();
                this.field1917[var3] = arg0.method8641();
            }
        } else if (arg1 == 6) {
            this.field1918 = arg0.method8775();
            this.field1912 = new int[this.field1918];
            this.field1920 = new int[this.field1918];
            for (int var4 = 0; var4 < this.field1918; var4++) {
                this.field1912[var4] = arg0.method8566();
                this.field1920[var4] = arg0.method8566();
            }
        }
    }

    @ObfuscatedName("hu.aj(I)I")
    public int method3383() {
        return this.field1918;
    }

    @ObfuscatedName("cw.aq(B)V")
    public static void method2087() {
        field1913.method5403();
    }
}
