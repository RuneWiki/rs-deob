package deob;

@ObfuscatedName("th")
public class class498 extends class500 {

    @ObfuscatedName("th.az")
    public int field5002 = 0;

    @ObfuscatedName("th.ah")
    public int field5000 = 0;

    @ObfuscatedName("th.af")
    public int field5001 = 0;

    @ObfuscatedName("th.at")
    public int field4999 = 0;

    @ObfuscatedName("th.an")
    public int field5003 = 0;

    @ObfuscatedName("th.ao")
    public int field5004 = 0;

    public class498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field5002 = arg0;
        this.field5000 = arg1;
        this.field5001 = arg2;
        this.field4999 = arg3;
        this.field5003 = arg4;
        this.field5004 = arg5;
    }

    @ObfuscatedName("th.az(B)I")
    public int method7897() {
        double var1 = this.method7912();
        return (int) Math.round((double) (this.field4999 - this.field5002) * var1 + (double) this.field5002);
    }

    @ObfuscatedName("th.ah(B)I")
    public int method7895() {
        double var1 = this.method7912();
        return (int) Math.round((double) (this.field5003 - this.field5000) * var1 + (double) this.field5000);
    }

    @ObfuscatedName("th.af(I)I")
    public int method7894() {
        double var1 = this.method7912();
        return (int) Math.round((double) (this.field5004 - this.field5001) * var1 + (double) this.field5001);
    }
}
