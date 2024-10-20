package deob;

@ObfuscatedName("hw")
public class class185 extends class488 {

    @ObfuscatedName("hw.aw")
    public static class304 field1940 = new class304(64);

    @ObfuscatedName("hw.al")
    public char field1933;

    @ObfuscatedName("hw.ai")
    public char field1935;

    @ObfuscatedName("hw.ar")
    public String field1942 = class370.field4015;

    @ObfuscatedName("hw.as")
    public int field1936;

    @ObfuscatedName("hw.aa")
    public int field1937 = 0;

    @ObfuscatedName("hw.az")
    public int[] field1938;

    @ObfuscatedName("hw.ao")
    public int[] field1934;

    @ObfuscatedName("hw.au")
    public String[] field1939;

    @ObfuscatedName("rs.aq(Lof;I)V")
    public static void method7735(class378 arg0) {
        Statics.field4451 = arg0;
    }

    @ObfuscatedName("du.aw(II)Lhw;")
    public static class185 method2240(int arg0) {
        class185 var1 = (class185) field1940.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4451.method6489(8, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3340(new class534(var2));
        }
        field1940.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hw.al(Luq;I)V")
    public void method3340(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3341(arg0, var2);
        }
    }

    @ObfuscatedName("hw.ai(Luq;II)V")
    public void method3341(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1933 = (char) arg0.method8591();
        } else if (arg1 == 2) {
            this.field1935 = (char) arg0.method8591();
        } else if (arg1 == 3) {
            this.field1942 = arg0.method8741();
        } else if (arg1 == 4) {
            this.field1936 = arg0.method8597();
        } else if (arg1 == 5) {
            this.field1937 = arg0.method8593();
            this.field1938 = new int[this.field1937];
            this.field1939 = new String[this.field1937];
            for (int var3 = 0; var3 < this.field1937; var3++) {
                this.field1938[var3] = arg0.method8597();
                this.field1939[var3] = arg0.method8741();
            }
        } else if (arg1 == 6) {
            this.field1937 = arg0.method8593();
            this.field1938 = new int[this.field1937];
            this.field1934 = new int[this.field1937];
            for (int var4 = 0; var4 < this.field1937; var4++) {
                this.field1938[var4] = arg0.method8597();
                this.field1934[var4] = arg0.method8597();
            }
        }
    }

    @ObfuscatedName("hw.ar(I)I")
    public int method3342() {
        return this.field1937;
    }

    @ObfuscatedName("jp.as(B)V")
    public static void method4570() {
        field1940.method5418();
    }
}
