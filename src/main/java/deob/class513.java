package deob;

@ObfuscatedName("td")
public class class513 extends class515 {

    @ObfuscatedName("td.ac")
    public int field5175 = 0;

    @ObfuscatedName("td.ae")
    public int field5174 = 0;

    @ObfuscatedName("td.ag")
    public int field5171 = 0;

    @ObfuscatedName("td.am")
    public int field5170 = 0;

    @ObfuscatedName("td.ax")
    public int field5173 = 0;

    @ObfuscatedName("td.aq")
    public int field5169 = 0;

    public class513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field5175 = arg0;
        this.field5174 = arg1;
        this.field5171 = arg2;
        this.field5170 = arg3;
        this.field5173 = arg4;
        this.field5169 = arg5;
    }

    @ObfuscatedName("td.ac(I)I")
    public int method8394() {
        double var1 = this.method8410();
        return (int) Math.round((double) (this.field5170 - this.field5175) * var1 + (double) this.field5175);
    }

    @ObfuscatedName("td.ae(B)I")
    public int method8396() {
        double var1 = this.method8410();
        return (int) Math.round((double) (this.field5173 - this.field5174) * var1 + (double) this.field5174);
    }

    @ObfuscatedName("td.ag(B)I")
    public int method8397() {
        double var1 = this.method8410();
        return (int) Math.round((double) (this.field5169 - this.field5171) * var1 + (double) this.field5171);
    }
}
