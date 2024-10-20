package deob;

@ObfuscatedName("hw")
public class class188 extends class501 {

    @ObfuscatedName("hw.ad")
    public static class313 field1958 = new class313(64);

    @ObfuscatedName("hw.ag")
    public char field1954;

    @ObfuscatedName("hw.ak")
    public char field1955;

    @ObfuscatedName("hw.ap")
    public String field1956 = class379.field4390;

    @ObfuscatedName("hw.an")
    public int field1957;

    @ObfuscatedName("hw.aj")
    public int field1959 = 0;

    @ObfuscatedName("hw.av")
    public int[] field1953;

    @ObfuscatedName("hw.ab")
    public int[] field1952;

    @ObfuscatedName("hw.ai")
    public String[] field1961;

    @ObfuscatedName("qa.aq(II)Lhw;")
    public static class188 method7051(int arg0) {
        class188 var1 = (class188) field1958.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1960.method6539(8, arg0);
        class188 var3 = new class188();
        if (var2 != null) {
            var3.method3372(new class547(var2));
        }
        field1958.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.ad(Lvp;I)V")
    public void method3372(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3373(arg0, var2);
        }
    }

    @ObfuscatedName("hw.ag(Lvp;II)V")
    public void method3373(class547 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1954 = (char) arg0.method8804();
        } else if (arg1 == 2) {
            this.field1955 = (char) arg0.method8804();
        } else if (arg1 == 3) {
            this.field1956 = arg0.method8739();
        } else if (arg1 == 4) {
            this.field1957 = arg0.method8734();
        } else if (arg1 == 5) {
            this.field1959 = arg0.method8899();
            this.field1953 = new int[this.field1959];
            this.field1961 = new String[this.field1959];
            for (int var3 = 0; var3 < this.field1959; var3++) {
                this.field1953[var3] = arg0.method8734();
                this.field1961[var3] = arg0.method8739();
            }
        } else if (arg1 == 6) {
            this.field1959 = arg0.method8899();
            this.field1953 = new int[this.field1959];
            this.field1952 = new int[this.field1959];
            for (int var4 = 0; var4 < this.field1959; var4++) {
                this.field1953[var4] = arg0.method8734();
                this.field1952[var4] = arg0.method8734();
            }
        }
    }

    @ObfuscatedName("hw.ak(I)I")
    public int method3374() {
        return this.field1959;
    }
}
