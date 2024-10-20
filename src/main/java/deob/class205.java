package deob;

@ObfuscatedName("hz")
public class class205 extends class500 {

    @ObfuscatedName("hz.al")
    public static class312 field2086 = new class312(64);

    @ObfuscatedName("hz.aj")
    public char field2085;

    @ObfuscatedName("hz.az")
    public char field2088;

    @ObfuscatedName("hz.af")
    public String field2084 = class378.field4097;

    @ObfuscatedName("hz.aa")
    public int field2089;

    @ObfuscatedName("hz.at")
    public int field2090 = 0;

    @ObfuscatedName("hz.ab")
    public int[] field2091;

    @ObfuscatedName("hz.ac")
    public int[] field2092;

    @ObfuscatedName("hz.ao")
    public String[] field2093;

    @ObfuscatedName("an.ak(II)Lhz;")
    public static class205 method294(int arg0) {
        class205 var1 = (class205) field2086.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2087.method6573(8, arg0);
        class205 var3 = new class205();
        if (var2 != null) {
            var3.method3643(new class546(var2));
        }
        field2086.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hz.al(Lua;S)V")
    public void method3643(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3635(arg0, var2);
        }
    }

    @ObfuscatedName("hz.aj(Lua;II)V")
    public void method3635(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2085 = (char) arg0.method8796();
        } else if (arg1 == 2) {
            this.field2088 = (char) arg0.method8796();
        } else if (arg1 == 3) {
            this.field2084 = arg0.method8806();
        } else if (arg1 == 4) {
            this.field2089 = arg0.method8801();
        } else if (arg1 == 5) {
            this.field2090 = arg0.method8798();
            this.field2091 = new int[this.field2090];
            this.field2093 = new String[this.field2090];
            for (int var3 = 0; var3 < this.field2090; var3++) {
                this.field2091[var3] = arg0.method8801();
                this.field2093[var3] = arg0.method8806();
            }
        } else if (arg1 == 6) {
            this.field2090 = arg0.method8798();
            this.field2091 = new int[this.field2090];
            this.field2092 = new int[this.field2090];
            for (int var4 = 0; var4 < this.field2090; var4++) {
                this.field2091[var4] = arg0.method8801();
                this.field2092[var4] = arg0.method8801();
            }
        }
    }

    @ObfuscatedName("hz.az(I)I")
    public int method3636() {
        return this.field2090;
    }
}
