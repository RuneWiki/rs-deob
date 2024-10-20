package deob;

@ObfuscatedName("ap")
public class class40 extends class174 {

    @ObfuscatedName("ap.n")
    public static class167 field959 = new class167(64);

    @ObfuscatedName("ap.u")
    public char field961;

    @ObfuscatedName("ap.t")
    public char field969;

    @ObfuscatedName("ap.e")
    public String field960 = "null";

    @ObfuscatedName("ap.a")
    public int field962;

    @ObfuscatedName("ap.l")
    public int field963 = 0;

    @ObfuscatedName("ap.v")
    public int[] field964;

    @ObfuscatedName("ap.j")
    public int[] field965;

    @ObfuscatedName("ap.k")
    public String[] field958;

    @ObfuscatedName("y.n(IB)Lap;")
    public static class40 method540(int arg0) {
        class40 var1 = (class40) field959.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field966.method2768(8, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method825(new class104(var2));
        }
        field959.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.u(Lcj;I)V")
    public void method825(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method826(arg0, var2);
        }
    }

    @ObfuscatedName("ap.t(Lcj;II)V")
    public void method826(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = (char) arg0.method2257();
        } else if (arg1 == 2) {
            this.field969 = (char) arg0.method2257();
        } else if (arg1 == 3) {
            this.field960 = arg0.method2187();
        } else if (arg1 == 4) {
            this.field962 = arg0.method2130();
        } else if (arg1 == 5) {
            this.field963 = arg0.method2206();
            this.field964 = new int[this.field963];
            this.field958 = new String[this.field963];
            for (int var3 = 0; var3 < this.field963; var3++) {
                this.field964[var3] = arg0.method2130();
                this.field958[var3] = arg0.method2187();
            }
        } else if (arg1 == 6) {
            this.field963 = arg0.method2206();
            this.field964 = new int[this.field963];
            this.field965 = new int[this.field963];
            for (int var4 = 0; var4 < this.field963; var4++) {
                this.field964[var4] = arg0.method2130();
                this.field965[var4] = arg0.method2130();
            }
        }
    }
}
